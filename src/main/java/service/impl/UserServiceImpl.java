package service.impl;

import common.ApiResponseEntity;
import dto.CreateUserRequest;
import dto.CreateUsersWithArrayRequest;
import dto.UpdateUserInfoRequest;
import dto.UserLoginRequest;
import service.UserService;

public class UserServiceImpl implements UserService {
    public ApiResponseEntity createUser(CreateUserRequest request) {
        return null;
    }

    public ApiResponseEntity createUserWithArray(CreateUsersWithArrayRequest request) {
        return null;
    }

    public ApiResponseEntity createUserWithList(CreateUsersWithArrayRequest request) {
        return null;
    }

    public ApiResponseEntity userLogin(UserLoginRequest request) {
        return null;
    }

    public ApiResponseEntity userLogout() {
        return null;
    }

    public ApiResponseEntity findUserByUsername(String username) {
        return null;
    }

    public ApiResponseEntity updateUserInfoByUsername(String username, UpdateUserInfoRequest request) {
        return null;
    }

    public ApiResponseEntity deleteUserByUsername(String username) {
        return null;
    }
}
