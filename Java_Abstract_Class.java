package com.company;
import java.util.Scanner;
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class Mybook extends Book {
    void setTitle(String s){
        title=s;
    }
    String getTitle(){
        return title;
    }
}
public class Java_Abstract_Class {
    public static void main(String[] args) {
        Mybook m=new Mybook();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        m.setTitle(s);
        System.out.println("The title is: "+m.getTitle());
    }
}
