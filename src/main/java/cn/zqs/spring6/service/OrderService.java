package cn.zqs.spring6.service;

import cn.zqs.spring6.dao.OrderDao;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void saveOrder() {
        List<Integer> path = new ArrayList<>();
        orderDao.saveOrder();
    }

}
