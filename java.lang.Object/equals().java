/*
equal() method is one of the methods in java.lang.Object class;
-The similar case is for the method equals(). So funcational point is that if want to compare two objects based upon the equals() method you have to override both hashCode() and equals() methods.
-return true and false
*/

import java.lang.*;
import java.util.*;

class EqualMethodClass{
    public static void main(String[] args){
        ChildClassOne obj1=new ChildClassOne();
        ChildClassTwo obj2=new ChildClassTwo();
        ChildClassTwo obj3=new ChildClassTwo();
        ChildClassTwo obj4=obj3;
        
        System.out.println("Refering to the same Class:"+obj2.equals(obj3));
        System.out.println("Refering to the same Class:"+obj4.equals(obj3));
    }
}

class ChildClassOne{
    
}

class ChildClassTwo{
    
}