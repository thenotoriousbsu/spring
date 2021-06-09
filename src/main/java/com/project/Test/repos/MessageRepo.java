package com.project.Test.repos;

import com.project.Test.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<User, Integer> {

}
