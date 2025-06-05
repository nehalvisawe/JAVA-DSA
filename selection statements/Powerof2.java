//check the given no for power of two

import java.util.*;
public class Powerof2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int N = sc.nextInt();
        int num =N;
        int cnt =0;

        while(num%2==0){
            num/= 2;
            cnt++;
        }
        if(num==1)
         System.out.println(N+" is " + cnt+"th power of 2");
        else
        System.out.println(N+" is not power of 2");

    }
}
