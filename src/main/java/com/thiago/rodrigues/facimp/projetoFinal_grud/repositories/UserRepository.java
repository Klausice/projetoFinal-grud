package com.thiago.rodrigues.facimp.projetoFinal_grud.repositories;

import com.thiago.rodrigues.facimp.projetoFinal_grud.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, String> {
    UserDetails findByLogin(String login);
}
