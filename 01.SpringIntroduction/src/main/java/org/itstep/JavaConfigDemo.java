package org.itstep;

import org.itstep.bean.Product;
import org.itstep.bean.Shop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.itstep.bean")
public class JavaConfigDemo {

    @Bean
    public Product myProduct() {
        return new Product("product3", "description", 1.1f);
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfigDemo.class);

        Product product3 = applicationContext.getBean(Product.class);
        System.out.println(product3);

        Shop shop = applicationContext.getBean(Shop.class);
        System.out.println(shop.product);
    }
}
