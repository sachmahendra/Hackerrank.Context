import java.io.*;
import java.util.*;

public class ChooseElevator {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n=3;
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
        for(int j=0;j<n;j++){
        if(a[0]==1){
            System.out.println("1");
            break;
        }
         if(a[1]>a[2]){
            System.out.println(a[1]-a[2]);
            break;
         }
         else{
            System.out.println(a[2]-a[1]);
            break;
         }
        
    }
    }
}