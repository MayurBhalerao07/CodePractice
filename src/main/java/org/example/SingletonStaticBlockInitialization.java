package org.example;

public class SingletonStaticBlockInitialization {

    private static SingletonStaticBlockInitialization instance = null;

    private SingletonStaticBlockInitialization(){
        System.out.println("Static");
    }
    static {
        instance = new SingletonStaticBlockInitialization();
    }
    private static SingletonStaticBlockInitialization getInstance(){
        return instance;
    }

    public static void main(String[] args) {

        SingletonStaticBlockInitialization s1 = SingletonStaticBlockInitialization.getInstance();
        SingletonStaticBlockInitialization s2 = SingletonStaticBlockInitialization.getInstance();
        SingletonStaticBlockInitialization s3 = SingletonStaticBlockInitialization.getInstance();
        System.out.println("first :- "+ s1.hashCode());
        System.out.println("second :- "+s2.hashCode());
        System.out.println("third :- "+s3.hashCode());

    }
}
