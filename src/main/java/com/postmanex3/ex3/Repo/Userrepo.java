package com.postmanex3.ex3.Repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.postmanex3.ex3.Model.User;

@Repository
public interface Userrepo extends CrudRepository<User, Long> { }


