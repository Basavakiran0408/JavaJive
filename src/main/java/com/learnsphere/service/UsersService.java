package com.learnsphere.service;

import java.util.List;

import com.learnsphere.entity.Users;

public interface UsersService {
  String addUser(Users u);

boolean checkEmail(String email);

boolean validate(String email, String password);

String checkRole(String email);

//String getUser(String email);





}
