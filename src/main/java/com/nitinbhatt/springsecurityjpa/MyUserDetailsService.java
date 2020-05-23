package com.nitinbhatt.springsecurityjpa;

import com.nitinbhatt.springsecurityjpa.models.MyUserDetails;
import com.nitinbhatt.springsecurityjpa.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    // username which is passed ,create a instance  object  of userDetails
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException{
            // Get the user instance from repository/database
            Optional<User> user= userRepository.findByUserName(userName);       // give a user from repository

            // if use does not exists in db, handle error for any user not found in DB
            user.orElseThrow(()-> new UsernameNotFoundException("User Not found"+ userName));

        // convert the user obtained from DB into an UserDetails instance, populate user details
            return user.map(MyUserDetails::new).get();
    }
}
