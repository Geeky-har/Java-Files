// In this program we will se bigIntegers (like factorial of 100)

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntFactorial{

    public static BigInteger factorial(int n){
        BigInteger ans = new BigInteger("1");

        while(n > 0){
            ans = ans.multiply(BigInteger.valueOf(n));
            n -= 1;
        }

        return ans;
    }

    public static void main(String args[]){
        int n;
        System.out.println("Enter the number(big number): ");

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();

        System.out.println("The factorial of " + n + " is: ");
        System.out.println(factorial(n));
    }
}