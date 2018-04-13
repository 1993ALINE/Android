package com.example.firebase.Repository;

import com.example.firebase.Model.User;
import org.springframework.data.repository.CrudRepository;


public interface Repository extends CrudRepository<User, Long> {
}
