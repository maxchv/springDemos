package org.itstep.beans;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * Created by shaptala on 16.03.2017.
 */
public class UserBean {
    String name;
    LocalDate birthDate;

    public UserBean(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
