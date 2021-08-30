package com.rest.webservice.service;

import com.rest.webservice.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserService {

    private static int usersCount = 3;

    private  static List<User> users = new ArrayList<>();
    static  {
        users.add(new User(1, "Ahmed", new Date()));
        users.add(new User(2, "Samy", new Date()));
        users.add(new User(3, "Hany", new Date()));
    }
    public List<User> getAllUsers(){
        return users;
    }

    public User save(User user) {
        if(user.getId() == null) {
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id){
        for (User user: users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }
}
