package com.yummy;

import com.yummy.model.User;
import com.yummy.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class YummyApplicationTests {

    @Resource
    UserService userService;

    @Test
    void contextLoads() {
        User user = userService.getById(1);
    }

}
