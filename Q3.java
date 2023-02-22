import java.util.Scanner;

class Q3{

    public static void main(String arg[]){


        Scanner sc=new Scanner(System.in);

        float cp,sp,loss,profit;

        System.out.print("Enter cost Price=");
        cp=sc.nextInt();
        System.out.print("\nEnter selling Price=");
        sp=sc.nextInt();

        profit=sp-cp;
        loss=cp-sp;

        if(sp>cp){
            System.out.print("\nProfit="+"Rs."+profit);
        }

        else if(sp==cp){

            System.out.print("\nNo profit and No loss");
            
        }

        else{

            System.out.print("\nloss="+"Rs."+loss);
        }




    }
}