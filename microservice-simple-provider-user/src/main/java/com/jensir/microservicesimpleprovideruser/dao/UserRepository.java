package com.jensir.microservicesimpleprovideruser.dao;


import com.jensir.microservicesimpleprovideruser.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
