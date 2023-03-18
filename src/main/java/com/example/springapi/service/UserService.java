package com.example.springapi.service;

import com.example.springapi.api.model.User;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

@Service
public class UserService {
    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Nasrullo1", 19, "nasrullojabborov11@gmail.com");
        User user2 = new User(2, "Nasrullo2", 29, "nasrullojabborov12@gmail.com");
        User user3 = new User(3, "Nasrullo3", 39, "nasrullojabborov13@gmail.com");
        User user4 = new User(4, "Nasrullo4", 49, "nasrullojabborov14@gmail.com");

        userList.addAll(Arrays.asList(user1, user2, user3, user4));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user: userList){
            if (id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
