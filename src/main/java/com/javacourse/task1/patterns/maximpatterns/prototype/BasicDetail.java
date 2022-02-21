package com.javacourse.task1.patterns.maximpatterns.prototype;

public class BasicDetail implements Prototype {
    public int size;
    public String name;

    public BasicDetail(int size, String name){
        this.size=size;
        this.name=name;
    }

    @Override
    public BasicDetail cloneObj() {
        BasicDetail cloneDetail =new BasicDetail(this.size, this.name);
        cloneDetail.size = this.size;
        cloneDetail.name = this.name;
        return cloneDetail;
    }

}
