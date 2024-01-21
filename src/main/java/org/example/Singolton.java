package org.example;

public class Singolton {
    private static  Singolton instance;
    private Singolton(){


    }
    public static Singolton getInstance(){


        if(instance == null){
            return instance  = new Singolton();
        }
        else {
            return  instance;
        }
    }
}
