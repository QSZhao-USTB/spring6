package cn.zqs.spring6.service;

import cn.zqs.spring6.dao.UserDao;

public class UserService {

    private UserDao userDao;

    public UserService() {
    }

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser() {
        userDao.insertUser();
    }
}
