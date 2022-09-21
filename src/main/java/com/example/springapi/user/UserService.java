package com.example.springapi.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class UserService {

    public UserService() {
        for (int i = 0; i<10; i++) {
            this.users.add(new User(
                    Integer.toString(i+1),
                    Integer.toString(i+ i +2)
            ));
        }

    }

    private final ArrayList<User> users = new ArrayList<User>();

    public ArrayList<User> getUsers(){
        return this.users;
    }

    public User getUser(int id){
        return this.users.get(id);
    }
}
