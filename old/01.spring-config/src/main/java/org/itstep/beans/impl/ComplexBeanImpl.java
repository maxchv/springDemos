package org.itstep.beans.impl;

import org.itstep.beans.ComplexBean;
import org.itstep.beans.SimpleBean;

/**
 * Created by shaptala on 16.03.2017.
 */
public class ComplexBeanImpl implements ComplexBean {
    SimpleBean bean;
    boolean complex;

    public ComplexBeanImpl(SimpleBean bean, Boolean complex) {
        this.bean = bean;
        this.complex = complex;
    }

    public void invoke() {
        System.out.println(bean.getMsg());
    }
}
