package service;

import common.ApiResponseEntity;
import dto.CreateUserRequest;
import dto.CreateUsersWithArrayRequest;
import dto.UpdateUserInfoRequest;
import dto.UserLoginRequest;

public interface UserService {

    ApiResponseEntity createUser(CreateUserRequest request);

    ApiResponseEntity createUserWithArray(CreateUsersWithArrayRequest request);

    ApiResponseEntity createUserWithList(CreateUsersWithArrayRequest request);

    ApiResponseEntity userLogin(UserLoginRequest request);

    ApiResponseEntity userLogout();

    ApiResponseEntity findUserByUsername(String username);

    ApiResponseEntity updateUserInfoByUsername(String username, UpdateUserInfoRequest request);

    ApiResponseEntity deleteUserByUsername(String username);
}
