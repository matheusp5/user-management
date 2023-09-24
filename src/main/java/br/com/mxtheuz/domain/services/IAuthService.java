package br.com.mxtheuz.domain.services;

import br.com.mxtheuz.domain.entities.User;

public interface IAuthService {
    boolean Login(String email, String password);
    User Register(String name, String email, String password);
}
