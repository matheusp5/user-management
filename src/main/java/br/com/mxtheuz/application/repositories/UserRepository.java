package br.com.mxtheuz.application.repositories;

import br.com.mxtheuz.domain.entities.User;
import br.com.mxtheuz.domain.repositories.IUserRepository;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class UserRepository implements IUserRepository {
    private final EntityManager entityManager = Persistence.createEntityManagerFactory("mysql").createEntityManager();

    @Override
    public List<User> GetAll() {
        return entityManager.createQuery("from User").getResultList();
    }

    @Override
    public User GetById(Integer id) {
        return this.entityManager.find(User.class, id);
    }

    @Override
    public User Save(User entity) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(entity);
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
        return entity;
    }

    @Override
    public User GetUserByEmail(String email) {
        User user = entityManager.createQuery("SELECT b FROM User b WHERE b.email = :email", User.class)
                .setParameter("email", email)
                .getSingleResult();
        return user;
    }
}
