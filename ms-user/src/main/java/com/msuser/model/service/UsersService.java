package com.msuser.model.service;

import com.msuser.model.entity.Users;
import com.msuser.model.exceptions.ResourceNotFoundException;
import com.msuser.model.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class UsersService {

    @Autowired private UsersRepository repository;

    public Users usersById(String id){
        verifyId(id);
        Optional<Users> user = repository.findById(Long.parseLong(id));

        if (!user.isPresent())
            throw new ResourceNotFoundException("User not found");

        return user.get();
    }

    public Users usersByEmail(String email){
        if (Objects.isNull(email)) throw new ResourceNotFoundException("Email null");

        return repository.findByEmail(email);
    }

    private void verifyId(String id){
        if (Objects.isNull(id))
            throw new ResourceNotFoundException("id null");
    }
}
