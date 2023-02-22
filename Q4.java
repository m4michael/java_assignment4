import java.util.Scanner;

class Q4{

    public static void main(String arg[]){

        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number=");
        num=sc.nextInt();

        if (num<0){
            System.out.print("\nnumber is negative and skipped");
        }

        else{
            System.out.print("\nyour number is="+num);
        }



    }
}