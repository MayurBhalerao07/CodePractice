package org.example;

public class SingletonEagerInitialization {

    private static final SingletonEagerInitialization instance = new SingletonEagerInitialization();

    private SingletonEagerInitialization() {
        System.out.println("Eager");
    }

    public static SingletonEagerInitialization getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        SingletonEagerInitialization s1 = SingletonEagerInitialization.getInstance();
        SingletonEagerInitialization s2 = SingletonEagerInitialization.getInstance();
        SingletonEagerInitialization s3 = SingletonEagerInitialization.getInstance();
        System.out.println("first :- " + s1.hashCode());
        System.out.println("second :- " + s2.hashCode());
        System.out.println("third :- " + s3.hashCode());





    }
}
