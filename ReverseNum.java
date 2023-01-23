package day6assignment_logical_Prob;

import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args){
        int rem,rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = sc.nextInt();
        while(N !=0){
            rem=N%10;
            rev=rev*10+rem;
            N=N/10;
        }
        System.out.println("Reverse Number "+rev);


    }

}
