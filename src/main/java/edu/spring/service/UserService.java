package edu.spring.service;

import edu.spring.dominio.model.User;

public interface UserService {
    User findById(Long id);

    User create(User user);
}
