package edu.spring.dominio.repository;

import edu.spring.dominio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long > {

    boolean existByAccountNumber(String accountNumber);
}
