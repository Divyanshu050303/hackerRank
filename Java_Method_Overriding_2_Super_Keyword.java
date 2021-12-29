package com.company;
class c1{
    public void ma(){
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
        System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
    }
}
class c2 extends c1{
    public void ma(){
        super.ma();
    }
}
public class Java_Method_Overriding_2_Super_Keyword {
    public static void main(String[] args) {
        c2 c=new c2();
        c.ma();
    }
}
