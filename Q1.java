import java.util.Scanner;

class Q1{

    public static void main(String arg[]){

            int length,breadth;


        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length=");
         length=sc.nextInt();

        System.out.print("\nEnter breadth=");
         breadth=sc.nextInt();

        if(length==breadth){
            System.out.println("\nIt is a square");

        }
        else{
            System.out.println("\nIt is a rectangle");

        }





    }
}