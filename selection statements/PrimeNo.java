

import java.util.*;
public class PrimeNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int Num = sc.nextInt();
        boolean isPrime = true;
        
        for(int i=2 ; i< Num ; i++){
            if(Num%i ==0){
                isPrime = false;
                break;
            }
        }
        if(Num==1)
           System.out.println("The number nor prime not composite");
        else if(isPrime)
           System.out.println("the number is prime");
        else
          System.out.println("the number is composite");
        

    }
}
