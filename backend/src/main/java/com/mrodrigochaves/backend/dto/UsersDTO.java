package com.mrodrigochaves.backend.dto;

import com.mrodrigochaves.backend.model.Users;
import jakarta.transaction.Transactional;
import lombok.Data;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Data
public class UsersDTO {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;

    @Transactional(rollbackOn = Exception.class) 
    public Long saveDto(UsersDTO usersDTO) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        
        usersDTO.setPassword(bCryptPasswordEncoder.encode(usersDTO.getPassword())); 
        
        Users newUser = new Users();
        newUser.setUsername(usersDTO.getUsername());
        newUser.setPassword(usersDTO.getPassword());
        newUser.setFirstName(usersDTO.getFirstName());
        newUser.setLastName(usersDTO.getLastName());
        newUser.setEmail(usersDTO.getEmail());

        
        Users savedUser = save(newUser);

        return savedUser.getUserId();
    }

   
    private Users save(Users users) {
       
        return null;
    }
}
