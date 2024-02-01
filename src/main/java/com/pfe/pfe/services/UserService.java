package com.pfe.pfe.services;

import com.pfe.pfe.models.User;
import com.pfe.pfe.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public User adduser(User user){
        return userRepository.save(user);
    }

}
