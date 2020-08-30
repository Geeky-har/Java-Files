package FibonacciRecursion;
import java.util.*;

public class fib_recursion {
        // private int n;
        // public void getNum(int n){ this.n = n; }
        public int putNum(int n){
            if(n == 1 || n == 2){ return 1; }
    
            else{ return( putNum(n - 1) + putNum(n - 2) );}
        }

    public static void main(String[] args) {
        int num, val, i;

        System.out.println("Enter the number to get series: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        fib_recursion rc = new fib_recursion();
        // rc.getNum(num);

        System.out.print("The series is as follows: ");

        for(i=1; i <= num; i++){
            val = rc.putNum(i);
            System.out.print(val + " ");
        }

    }
}