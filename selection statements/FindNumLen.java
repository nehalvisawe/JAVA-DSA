//Find the no of digits in given number
//find the sum of all digits
// print N natural no so as their digit sum is K
import java.util.*;

class FindNumLen{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("#First code: find no of digit in number and print sum of digits");
        System.out.println("Enter a number");
        int Num = sc.nextInt();
        int count=0, sum =0;
        for(int i = Num ; i>0 ; i=i/10){
            sum = sum + (i%10);
            count++;
        }
        System.out.println("the count of digit are "  +count);
        System.out.println("the sum of digit are "  +sum);

        //count =1;
        // while(Num/10 != 0){
        //     Num = Num/10;
        //     count++;
        // }
        //System.out.println("the count of digit are "  +count);

        System.out.println("#Range Problem");
        System.out.println("Enter a range [L, R]");
        int L = sc.nextInt();
        int R = sc.nextInt();
        
        count =0;
        for(int i = L ; i < R ; ++i){
            sum =0;
            for(int j = i ; j>0; j/=10){
                int oneDigit = j%10;
                sum += oneDigit;   
            }
            System.out.println(sum);
            count++;
        }
        System.out.println("count ="+count);

        System.out.println("#print number whose digit sum is k"); 
        System.out.println("Enter the N");
        int N = sc.nextInt();
        System.out.println("Enter the value of k");
        int K = sc.nextInt();
        int i =K;
        while(i<=N){
            sum =0;
            for(int j = i; j>0 ; j=j/10)
                sum += (j%10);
            
            if(sum==K)
                System.out.println(i);
            
            i++;
        }

    }
}