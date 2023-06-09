package org.example;


class Parent{

    void test(){
        System.out.println("parent");
    }

}
class OverridingExp extends Parent{

    void test(){
        System.out.println("child");
    }

    public static void main(String[] args) {

        //OverridingExp oe = new Parent();

        OverridingExp o1 = new OverridingExp();
        o1.test();

        Parent  p = new OverridingExp();
        p.test();

        Parent p1 = new Parent();
        p1.test();


    }

}
