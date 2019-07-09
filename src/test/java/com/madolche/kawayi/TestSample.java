package com.madolche.kawayi;

import com.madolche.kawayi.entity.User;
import com.madolche.kawayi.mapper.UserMapper;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSample {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        User user = new User();
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        System.out.println(userList);
    }
}
