package org.itstep.beans.impl;

import org.itstep.beans.ComplexBean;
import org.itstep.beans.SimpleBean;

/**
 * Created by shaptala on 16.03.2017.
 */
public class ComplexBean2Impl implements ComplexBean {
    SimpleBean bean0;
    SimpleBean bean1;

    public ComplexBean2Impl(SimpleBean bean0, SimpleBean bean1) {
        this.bean0 = bean0;
        this.bean1 = bean1;
    }

    public void invoke() {
        System.out.println(bean0.getMsg() + " " + bean1.getMsg());
    }
}
