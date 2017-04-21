/*
#HashCode
-play a significant role in the real time application
-method provides the has code of an object
-public native int hashCode(); method in HashCode Class
-if you are going to override the one of the methods( ie equals() and hashCode() ) , you have to override the both otherwise it is a violation of contract made for equals() and hashCode()
-System.identityHashCode(object); to identify the original code of the object
-hash code is system dependent
*/

import java.util.*;
import java.lang.*;

class HashCodeObject{
    public static void main(String[] args){
    ChildClass obj=new ChildClass();
    System.out.println("HashCode for an Object:"+obj.hashCode());
    }
}

class ChildClass{
    int a;
}
