package com.company;


public class Container<T> {
    private T inner;

    public Container(T value) {
        // System.out.println(value.getClass());
        this.inner = value;
    }

    public T getInner() {
        return this.inner;
    }

    @Override
    public String toString() {
        return "Container of: " + inner;
    }

    public <R> Container<R> map(Funct<T, R> mapper) {
        return new Container(mapper.apply(this.inner));
    }
}
