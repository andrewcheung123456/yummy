package com.yummy.controller;


import com.yummy.common.ApiResponse;
import com.yummy.common.CustomException;
import com.yummy.enums.ExceptionEnum;
import com.yummy.model.User;
import com.yummy.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author andrew
 * @since 2022-06-03
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/{id}")
    public ApiResponse<User> get(@PathVariable("id") Integer id){
        return ApiResponse.success(userService.getUser(id));
    }
}

