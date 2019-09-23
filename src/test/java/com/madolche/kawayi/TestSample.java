package com.madolche.kawayi;

import com.madolche.kawayi.entity.Animal;
import com.madolche.kawayi.entity.User;
import com.madolche.kawayi.mapper.AnimalMapper;
import com.madolche.kawayi.mapper.UserMapper;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSample {
    @Resource
    private UserMapper userMapper;

    @Resource
    @Autowired
    private AnimalMapper animalMapper;

    @Test
    public void testSelect() {
        User user = new User();
        List<User> userList = userMapper.selectList(null);
        System.out.println(("----- selectAll method test ------"));
    }

    @Test
    public void testInsert() {
        Animal animal = new Animal();
        animal.setName("saya");
        animal.setColor("red");
        animal.setAge(17);
        animal.setLastName("kawayi");

        animalMapper.insert(animal);
    }

    @Test
    public void testSocket() throws Exception {
        for (int i = 0; i < 30000; i++) {
            Socket socket = new Socket("114.55.24.128", 60020);
            OutputStream outputStream = socket.getOutputStream();
            String str = "##0187QN=20190923154847375;ST=39;CN=2011;PW=123456;MN=190720099;Flag=5;CP=&&DataTime=20190923154847;a34004-Rtd=12000,a34004-Flag=D;a34002-Rtd=16000,a34002-Flag=D;LA-Rtd-Rtd=71.0,LA-Rtd-Flag=N&&48C0";
            outputStream.write(str.getBytes());
            socket.close();
            System.out.println(System.currentTimeMillis());
            Thread.sleep(100);
        }

    }
}
