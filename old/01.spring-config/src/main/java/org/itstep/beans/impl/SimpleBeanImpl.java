package org.itstep.beans.impl;

import org.itstep.beans.SimpleBean;

/**
 * Created by shaptala on 16.03.2017.
 */
public class SimpleBeanImpl implements SimpleBean {
    String msg;

    public SimpleBeanImpl(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "SimpleBeanImpl{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
