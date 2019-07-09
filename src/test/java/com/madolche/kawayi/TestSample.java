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
}
