package com.interview.programs;

public class Singleton {
   private static Singleton instance;

   private Singleton(){
       if(instance != null){
           throw new RuntimeException("Use getInstance() method to create");
       }
   }

   public static synchronized Singleton getInstance(){
       if(instance == null ){
           instance = new Singleton();
       }
       return instance;
   }
}
