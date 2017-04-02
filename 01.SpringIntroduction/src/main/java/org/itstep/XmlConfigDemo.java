package org.itstep;

import org.itstep.bean.Employee;
import org.itstep.bean.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;

/**
 * Created by max on 01.04.2017.
 */
public class XmlConfigDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext.xml"});

        Product product1 = applicationContext.getBean("product1", Product.class);
        System.out.println(product1);

        Product product2 = applicationContext.getBean("product2", Product.class);
        System.out.println(product2);

        LocalTime localTime = applicationContext.getBean("localTime", LocalTime.class);
        System.out.println(localTime);

        Employee employee = applicationContext.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
