package org.pascal.defaults.methods;

/**
 * Created by pascal on 3/1/19.
 */
public interface MyInter {
    static void aa(){
        System.out.println("aa");
    }

    default void bb(){
        System.out.println("bb");
    }
}
