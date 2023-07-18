import java.io.*;
import java.util.*;

class A{
    int x1,y1;

public A(){
    x1 = 4;
    y1 = 2;
    System.out.println("x1="+x1 + "y1="+y1);
}
}
class B extends A{
    int x2,y2;
    public B(){
        x2 = 4,y2 = 6;
        System.out.println("x2="+x2 + "y2="+y2);
    }
    public double dist(){
        return (Math.sqrt((pow(xx2-x1),2)+ pow((y2-y1),2)));
    }
}    
class Test{
    public static void main(string [] args){
        B b1 = new B();
        System.out.println("dist ="+b1.dist());
    }
}