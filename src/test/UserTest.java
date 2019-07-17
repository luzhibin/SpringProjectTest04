package test;

import org.junit.Test;
import service.UserService;
import service.UserServiceImpl;

public class UserTest {
    @Test
    public void test(){
        UserService userService = new UserServiceImpl();
        userService.delete();
    }
}
