package cn.zqs.spring6.test;

import cn.zqs.spring6.dataSource.MyDataSource;
import cn.zqs.spring6.service.OrderService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    private static final Logger logger = LoggerFactory.getLogger("SpringTest");
    @Test
    public void testBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        OrderService orderServiceBeanByInner = applicationContext.getBean("orderServiceBeanByInner", OrderService.class);
        System.out.println(orderServiceBeanByInner);
    }


    @Test
    public void testMyDataSource() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        MyDataSource myDataSourceBean = applicationContext.getBean("myDataSourceBean", MyDataSource.class);
        System.out.println(myDataSourceBean);
    }


    @Test
    public void testTransform() {
        char c = 'a';
        StringBuilder sb = new StringBuilder();

        char newC = (char) (c ^ 32);
        System.out.println(newC);
    }

}
