package com.softserve.edu11box;

public class Service<T extends IEntity> {

    public int work(T t) {
        int i = t.getId();
        return i;
    }
}
