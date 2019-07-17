package service;

import dao.UserDao;
import dao.UserDaoImpl;

public class UserServiceImpl implements UserService{

    private UserDao userDao = new UserDaoImpl();
    @Override
    public void delete() {
        userDao.delete();
    }
}
