import java.util.Scanner;

class Q2{

    public static void main(String arg[]){

        int num;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number=");
        num=sc.nextInt();

        if (num<0){
            num=num*(-1);
            System.out.println("\nabsolute value of number is="+num);
        }
        else
        System.out.println("\nAbsolute value of number is="+num);



    }
}