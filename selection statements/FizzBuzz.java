//Problem Statement: Iterate 1 to N 
//if number is divisible by 3 print Fizz
// if number is divisible by 5 pritn Buzz
// if both then print FizzBuzz
// if SUM of the values printed exceeds 2N Stop (break;)
// if number is divisible by four skip  it(continue;)

import java.util.*;

class FizzBuzz{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter a Number");
        int N = sc.nextInt();
        for(int Num = 1;sum<N*2 && Num <= N ; Num++){
            if(Num%4==0)
                continue;
            else if(Num%3==0 && Num%5==0)
               System.out.println("FizzBuzz");
            else if(Num%3==0)
               System.out.println("Fizz");
            else if(Num%5==0)
               System.out.println("Buzz");
            else{
            System.out.println(Num);
            sum+=Num;

            
            }
            
        }


    }
}