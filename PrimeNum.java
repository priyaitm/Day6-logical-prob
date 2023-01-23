package day6assignment_logical_Prob;

public class PrimeNum {
    public static void main(String[] args){
        int number = 1;
        int count=100;
        while(count>=0){
            int flag=1;
            for(int i=2;i<number; i++) // 2 2<100  3<100
            {
                if(number%i==0)     //
                {
                    flag=0;      //
                    break;
                }
            }
            if(flag==1){
                System.out.println(number);
                count--;}
            number++;
        }
        // System.out.println("Number of iteration : +number");
    }
}




