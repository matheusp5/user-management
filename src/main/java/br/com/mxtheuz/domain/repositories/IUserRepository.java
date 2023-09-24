package br.com.mxtheuz.domain.repositories;

import br.com.mxtheuz.domain.entities.User;

public interface IUserRepository extends IBaseRepository<User, Integer> {
    User GetUserByEmail(String email);
}
