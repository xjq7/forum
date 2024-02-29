package com.stu.forum.web.user;

import com.stu.forum.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Resource
    private UserService userService;

}
