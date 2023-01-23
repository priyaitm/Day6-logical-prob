package day6assignment_logical_Prob;

public class FibonacciSeries {
    public static void main(String[] args){
        int N1=1;
        int N2=1;

        System.out.println(1);
        System.out.println(1);
        for(int i=1; i<=13; i++)
        {
            int sum=N1+N2;
            System.out.println(sum);
            N1=N2;
            N2=sum;
        }
    }
}
