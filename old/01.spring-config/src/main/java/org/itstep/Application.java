package org.itstep;


import org.itstep.beans.CollectionHolder;
import org.itstep.beans.ComplexBean;
import org.itstep.beans.UserBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("spring/application-config.xml");
        ComplexBean bean = null;
        if (context.containsBean("complexBean")) {
            bean = (ComplexBean) context.getBean("complexBean");
        }
        if (bean != null) {
            bean.invoke();
        }

        bean = null;
        if (context.containsBean("complexBean2")) {
            bean = (ComplexBean) context.getBean("complexBean2");
        }
        if (bean != null) {
            bean.invoke();
        }

        bean = null;
        if (context.containsBean("complexBeanProp")) {
            bean = (ComplexBean) context.getBean("complexBeanProp");
        }
        if (bean != null) {
            bean.invoke();
        }

        UserBean user = (UserBean) context.getBean("userBean");
        System.out.println(user);

        CollectionHolder holder = (CollectionHolder) context.getBean("collectionHolder");
        System.out.println(holder);
    }
}
