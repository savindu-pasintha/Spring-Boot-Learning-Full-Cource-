package com.SAMPLE_DEPENDANCY_INJECTION.CONSTRUCTOR_INJECTION;

public class B {
    public String name;
    public void bMethod(){
        System.out.println("this is class B");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
