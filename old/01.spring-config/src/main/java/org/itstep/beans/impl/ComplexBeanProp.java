package org.itstep.beans.impl;

import org.itstep.beans.ComplexBean;
import org.itstep.beans.SimpleBean;

/**
 * Created by shaptala on 16.03.2017.
 */
public class ComplexBeanProp implements ComplexBean {

    SimpleBean bean;

    public void setBean(SimpleBean bean) {
        this.bean = bean;
    }

    public void invoke() {
        System.out.println(bean.getMsg());
    }
}
