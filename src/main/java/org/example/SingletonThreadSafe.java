package org.example;

import java.lang.reflect.Constructor;

public class SingletonThreadSafe {

    private static SingletonThreadSafe instance = null;

    private SingletonThreadSafe(){
        if( instance != null ) {
            throw new InstantiationError( "Creating of this object is not allowed." );
        }
    }

    public static synchronized SingletonThreadSafe getInstance(){
        if(instance == null){
            instance = new SingletonThreadSafe();
        }
        return instance;
    }

    // double locking thread safe

    public static SingletonThreadSafe getInstanceByDoubleLocking(){
        if(instance == null){
         synchronized(SingletonThreadSafe.class){
                instance = new SingletonThreadSafe();
            }
        }
        return instance;
    }


    public static void reflectionMethod(){
        SingletonThreadSafe s1 = SingletonThreadSafe.getInstanceByDoubleLocking();
        SingletonThreadSafe s2 = null;
        try{
            Constructor [] constructors = SingletonThreadSafe.class.getDeclaredConstructors();
            for(Constructor constructor :constructors){
                constructor.setAccessible(true);
                s2= (SingletonThreadSafe) constructor.newInstance();
                break;
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
       System.out.println("F :- "+s1.hashCode());
        System.out.println("S :-"+s2.hashCode());
    }

    public static void main(String[] args) {
        SingletonThreadSafe s1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe s2 = SingletonThreadSafe.getInstanceByDoubleLocking();
        System.out.println("First :- "+s1.hashCode());
        System.out.println("Second :- "+ s2.hashCode());


        SingletonThreadSafe.reflectionMethod();
    }
}
