package com.company;
import java.util.Scanner;
public class Java_Instanceof_keyword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=0,c=0;
        for(int i=0;i<=n;i++){
            String s=sc.nextLine();
            if(s.equals("Student class")){
                a++;
            }
            if(s.equals("Rockstar class")){
                b++;
            }
            if(s.equals("Hacker class")){
                c++;
            }
        }
        System.out.println(a+" "+b+" "+c);
    }
}
