package cn.zqs.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDao {

    private static final Logger logger = LoggerFactory.getLogger("UserDao");
    public void insertUser() {
        logger.info("正在插入新的用户......");
    }
}
