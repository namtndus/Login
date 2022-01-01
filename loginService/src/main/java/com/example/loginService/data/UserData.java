package com.example.loginService.data;

import com.example.loginService.dto.UserDTO;

import java.util.ArrayList;

public class UserData {

    private static ArrayList <UserDTO> userList;

    private UserData(){}

    public static UserData getInstance() {

        userList = new ArrayList<UserDTO>();
        return null;
    }

}
