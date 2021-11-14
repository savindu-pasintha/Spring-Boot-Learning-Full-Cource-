package com.SAMPLE_DEPENDANCY_INJECTION.INTERFACE_INJECTION;

public interface ABInterface {
    //methods should be public,abstract->emptybody
    //static,default method have a body
    //we cannot create interface object because its abstract
    //interface cannnot have a constructor
    //we cannot create instace feils
    //we can not extend . should use implement keyword
    //we can multipple implementation using interface


     default void nm(){
        System.out.println("default model come from 1.8 over java jdk");
    }
    static void nsm(){
        System.out.println("static model come from 1.8 over java jdk");
    }
}
