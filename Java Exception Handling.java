import java.io.*;
import java.util.*;
class cal{
    public static int power(int n, int p) throws Exception{
        if(n<0||p<0){
            throw new Exception("n or p should not be negative.");
        }
        else if(n==0 && p==0){
            throw  new Exception("n and p should not be zero.");
        }
        else {
            return ((int)Math.pow(n,p));
        }
    }
}
public class Solution {

    public static void main(String[] args) {
         int n, m;
        Scanner sc=new Scanner(System.in);
        while (sc .hasNextInt()) {
        n=sc.nextInt();
        m=sc.nextInt();
        cal c=new cal();
        try{
            System.out.println(c.power(n,m));
        }catch (Exception e){
            System.out.println(e);
        }
    }
    }
}
