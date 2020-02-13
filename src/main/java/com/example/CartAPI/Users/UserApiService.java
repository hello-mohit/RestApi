package com.example.CartAPI.Users;

public interface UserApiService {
    void addUser(Object obj);
    String[] getUsersIds();
    void deleteUser(String UserId);
    void updateUser(String UserId,Object obj);
}
