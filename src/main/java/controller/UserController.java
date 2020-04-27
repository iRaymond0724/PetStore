package controller;

import common.ApiResponseEntity;
import common.ApiResultEnum;
import dto.CreateUserRequest;
import dto.CreateUsersWithArrayRequest;
import dto.UpdateUserInfoRequest;
import dto.UserLoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "" , method = RequestMethod.POST)
    public ApiResponseEntity createUser(CreateUserRequest request) {
        try {
            ApiResponseEntity response = userService.createUser(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ApiResponseEntity(ApiResultEnum.ERROR.getCode(),ApiResultEnum.ERROR.getResult());
    }

    @RequestMapping(value = "/createWithArray" , method = RequestMethod.POST)
    public ApiResponseEntity createUserWithArray(CreateUsersWithArrayRequest request) {
        try {
            ApiResponseEntity response = userService.createUserWithArray(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ApiResponseEntity(ApiResultEnum.ERROR.getCode(),ApiResultEnum.ERROR.getResult());
    }

    @RequestMapping(value = "/createWithList" , method = RequestMethod.POST)
    public ApiResponseEntity createUserWithList(CreateUsersWithArrayRequest request) {
        try {
            ApiResponseEntity response = userService.createUserWithList(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ApiResponseEntity(ApiResultEnum.ERROR.getCode(),ApiResultEnum.ERROR.getResult());
    }

    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    public ApiResponseEntity userLogin(UserLoginRequest request) {
        try {
            ApiResponseEntity response = userService.userLogin(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ApiResponseEntity(ApiResultEnum.ERROR.getCode(),ApiResultEnum.ERROR.getResult());
    }

    @RequestMapping(value = "/logout" , method = RequestMethod.GET)
    public ApiResponseEntity userLogout() {
        try {
            ApiResponseEntity response = userService.userLogout();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ApiResponseEntity(ApiResultEnum.ERROR.getCode(),ApiResultEnum.ERROR.getResult());
    }

    @RequestMapping(value = "/{username}" , method = RequestMethod.POST)
    public ApiResponseEntity findUserByUsername(@PathVariable("username") String username) {
        try {
            ApiResponseEntity response = userService.findUserByUsername(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ApiResponseEntity(ApiResultEnum.ERROR.getCode(),ApiResultEnum.ERROR.getResult());
    }

    @RequestMapping(value = "/{username}" , method = RequestMethod.PUT)
    public ApiResponseEntity updateUserInfoByUsername(@PathVariable("username") String username, UpdateUserInfoRequest request) {
        try {
            ApiResponseEntity response = userService.updateUserInfoByUsername(username,request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ApiResponseEntity(ApiResultEnum.ERROR.getCode(),ApiResultEnum.ERROR.getResult());
    }

    @RequestMapping(value = "/{username}" , method = RequestMethod.DELETE)
    public ApiResponseEntity deleteUserByUsername(@PathVariable("username") String username) {
        try {
            ApiResponseEntity response = userService.deleteUserByUsername(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ApiResponseEntity(ApiResultEnum.ERROR.getCode(),ApiResultEnum.ERROR.getResult());
    }
}
