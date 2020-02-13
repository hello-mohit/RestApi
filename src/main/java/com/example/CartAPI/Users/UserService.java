package com.example.CartAPI.Users;

import com.example.CartAPI.Users.User;
import com.example.CartAPI.Users.UserApiService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserService implements UserApiService {
    List<User> userInfo=new ArrayList<>();
    @Override
    public void addUser(Object obj) {
        User userIdPass=(User)obj;
        userInfo.add(userIdPass);
    }

    @Override
    public String[] getUsersIds() {
        String[] array=new String[userInfo.size()];
        for(int i=0;i<userInfo.size();i++) {
            array[i]= userInfo.get(i).getEmailId();
            System.out.println(userInfo.get(i).getEmailId()+"&&"+userInfo.get(i).getPassword());
        }
        return array;
    }

    @Override
    public void deleteUser(String userId) {
        for(int i=0;i<userInfo.size();i++){
            if(userInfo.get(i).getEmailId().equals(userId)){
                userInfo.remove(i);
                break;
            }
        }

    }

    @Override
    public void updateUser(String userId,Object obj) {
        User updateUser=(User)obj;
        for(int i=0;i<userInfo.size();i++){
            if(userInfo.get(i).getEmailId().equals(userId)){
                userInfo.get(i).setPassword(updateUser.getPassword());
                break;
            }
        }

    }
}
