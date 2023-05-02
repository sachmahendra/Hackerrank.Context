/* 

import java.util.*;
public class ThePrimeQuest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("testcase");
        int t= scn.nextInt();
        System.out.println("enter number");
        for(int i=0; i<t;i++){
            int n= scn.nextInt();

            if(n<=1){
                System.out.println("NO");
            }
          

        for(int j=2;j<=Math.sqrt(n);j++){
            if(n%j==0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            
        }
    }
    //scn.close();
}
}

*/

import java.util.*;
public class ThePrimeQuest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // number to be checked
            boolean isPrime = true;
            
            if (n <= 1) { // 1 is not prime
                isPrime = false;
            }
            
            for (int j = 2; j <= Math.sqrt(n); j++) { // check divisibility up to square root of n
                if (n % j == 0) { // if divisible, then not prime
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
