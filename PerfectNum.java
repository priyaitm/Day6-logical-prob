package day6assignment_logical_Prob;
import java.util.Scanner;
public class PerfectNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = sc.nextInt();
        int sum=0;
        for(int i=1; i<N;i++){
            if(N%i==0){
                sum=sum+i;
            }
        }
        //System.out.println(N);
       // System.out.println(sum);
        if(sum==N){
            System.out.println(" Perfect");
        }
        else {
            System.out.println("Non Perfect ");

        }





    }
}
