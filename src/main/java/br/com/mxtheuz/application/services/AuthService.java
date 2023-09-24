package br.com.mxtheuz.application.services;

import br.com.mxtheuz.application.repositories.UserRepository;
import br.com.mxtheuz.domain.entities.User;
import br.com.mxtheuz.domain.services.IAuthService;

public class AuthService implements IAuthService {
    private final UserRepository userRepository = new UserRepository();
    @Override
    public boolean Login(String email, String password) {
        User user = userRepository.GetUserByEmail(email);
        return user.getPassword().equals(password);
    }

    @Override
    public User Register(String name, String email, String password) {
        User user = new User(null, name, email, password);
        this.userRepository.Save(user);
        return user;
    }
}
