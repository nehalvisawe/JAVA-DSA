//Find the no of digits in given number
//find the sum of all digits
import java.util.*;

class FindNumLen{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
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

    }
}