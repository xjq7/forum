package org.stu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/list")
    public List<UserVO> echo() {
        List<UserVO> result = new ArrayList<>();

        for (UserPO userPO : userMapper.selectList(null)) {
            System.out.println(userPO.toString());
        }

        result.add(new UserVO().setAge((short) 1).setName("xjq"));
        result.add(new UserVO().setAge((short) 2).setName("xjq2"));
        return result;
    }

}