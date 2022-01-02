package com.example.loginService.data;

import com.example.loginService.dto.UserDTO;

import java.util.ArrayList;

public class UserData {

    private static UserData userData;

    private ArrayList <UserDTO> userList;

    private UserData(){
        userList = new ArrayList<>();
    }

    public static UserData getInstance() {

        userData = new UserData();
        return null;
    }

}
