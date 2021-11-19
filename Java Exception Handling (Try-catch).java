import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

        try {
            Integer n=sc.nextInt();
            Integer m= sc.nextInt();
            int k=n/m;
            System.out.println(k);
        }catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        catch (ArithmeticException a){
            System.out.println("java.lang.ArithmeticException: / by zero\n");
        }
    }
}
