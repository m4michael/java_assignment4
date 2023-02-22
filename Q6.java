import java.util.Scanner;

class Q6{

    public static void main(String arg[]){

        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your marks=");
        num=sc.nextInt();

        if(num>=90 && num<=100){
            System.out.print("\nYour grade is A+");


        }

        else if(num>=80 && num<90){
            System.out.print("\nYour grade is A");

        }

        else if(num>=70 && num<80){
            System.out.print("\nYour grade is B+");

        }

        else if(num>=60 && num<70){
            System.out.print("\nYour grade is B+");

        }

        else if(num>=50 && num<60){
            System.out.print("\nYour grade is C");


        }
       else if(num>=40 && num<50){
            System.out.print("\nYour grade is D");
        }

       else if(num>=30 && num<40){
            System.out.print("\nYour grade is E");

        }

        else if(num<30 && num>0){
            System.out.print("\nyour grade id F");
        }

        else{

            System.out.println("\nEnter marks between 0 to 100");
        }



    }



}
