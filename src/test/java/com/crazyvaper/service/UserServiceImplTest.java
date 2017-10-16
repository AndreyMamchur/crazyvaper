package com.crazyvaper.service;

import com.crazyvaper.config.JpaConfigTest;
import com.crazyvaper.config.SpringConfig;
import com.crazyvaper.entity.RoleEnum;
import com.crazyvaper.entity.User;
import com.crazyvaper.service.interfaces.UserService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Collection;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class, JpaConfigTest.class})
public class UserServiceImplTest extends TestCase {

    @Autowired
    private UserService userService;

    private User getTestUser(String name) {
        User user = new User();
        user.setName(name);
        user.setEmail("testmail@gmail.com");
        user.setPassword("test");
        return user;
    }

    @Test
    public void save() throws Exception {
        User user = getTestUser("Name");
        userService.save(user);
        User userByName = userService.getByName("Name");
        assertNotNull(userByName);
        assertEquals(user.getEmail(), userByName.getEmail());
        assertEquals(user.getName(), userByName.getName());
        assertEquals(user.getPassword(), userByName.getPassword());
        User userById = userService.getById(userByName.getId());
        assertNotNull(userById);
        assertEquals(user.getEmail(), userById.getEmail());
        assertEquals(user.getName(), userById.getName());
        assertEquals(user.getPassword(), userById.getPassword());
        userById.setPhoneNumber("0675235789");
        userService.update(userById);
        Collection<User> userList = userService.getAll();
        assertNotNull(userList);
        assertEquals(userList.size(), 1);
        userService.delete(userById.getId());
        userList = userService.getAll();
        assertEquals(userList.size(), 0);
    }

    @Test
    public void getById() throws Exception {
    }

    @Test
    public void getByName() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void getAll() throws Exception {
    }

    @Test
    public void delete() throws Exception {
    }

}