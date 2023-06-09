package org.example;

public class SingletonLazyInitialization {

    private static SingletonLazyInitialization singleObject = null;
    private String str;
    private SingletonLazyInitialization(){
     str = "Something";
    }
    private static SingletonLazyInitialization getInstance(){
      if(singleObject == null)
          singleObject = new SingletonLazyInitialization();

        return singleObject;
    }

    public static void main(String[] args) {
        SingletonLazyInitialization first = SingletonLazyInitialization.getInstance();
        SingletonLazyInitialization second = SingletonLazyInitialization.getInstance();
        SingletonLazyInitialization third = SingletonLazyInitialization.getInstance();
        System.out.println("first :- " + first.hashCode());
        System.out.println("second :- " + second.hashCode());
        System.out.println("third :- "+third.hashCode());
    }
}

