package org.itstep.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Created by shaptala on 16.03.2017.
 */
public class CollectionHolder {
    Logger logger = LoggerFactory.getLogger(CollectionHolder.class);

    List<SimpleBean> simpleBeanList;
    Set<SimpleBean> simpleBeanSet;
    Map<String, SimpleBean> simpleBeanMap;

    public CollectionHolder() {
        logger.info("Start");
    }

    public void setSimpleBeanList(List<SimpleBean> simpleBeanList) {
        this.simpleBeanList = simpleBeanList;
    }

    public void setSimpleBeanSet(Set<SimpleBean> simpleBeanSet) {
        this.simpleBeanSet = simpleBeanSet;
    }

    public void setSimpleBeanMap(Map<String, SimpleBean> simpleBeanMap) {
        this.simpleBeanMap = simpleBeanMap;
    }

    @Override
    public String toString() {
        return "CollectionHolder{" +
                "simpleBeanList=" + simpleBeanList +
                ", simpleBeanSet=" + simpleBeanSet +
                ", simpleBeanMap=" + simpleBeanMap +
                '}';
    }
}
