import java.util.Scanner;

class Q5{

    public static void main(String arg[]){

        float num1,num2;
        char c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        num1=sc.nextFloat();
        System.out.print("\nEnter a number:");
        num2=sc.nextFloat();

        System.out.print("\nchoose operation (+,-,*/)=");
        c=sc.next().charAt(0);

        switch(c){

            case '+':
            System.out.print("\n(Addition)\n"+num1+"+"+num2+"="+(num1+num2));
            break;
            case '-':
            System.out.print("\n(Subtraction)\n"+num1+"-"+num2+"="+(num1-num2));
            break;
            case '*':
            System.out.print("\n(multiplication)\n"+num1+"*"+num2+"="+(num1*num2));
            case '/':
            System.out.print("\n(Division)\n"+num1+"/"+num2+"="+(num1/num2));
            break;
            default:
            System.out.print("\nChoose valid Operation");
            break;

        }






    }
}