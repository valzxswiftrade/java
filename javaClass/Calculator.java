import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
     Scanner scan= new Scanner(System.in);
     while(true){
        System.out.println("simple calculator");
        System.out.println("1.addition");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.divisions");
        System.out.println("5.exit");
        int choice= scan.nextInt();

        if (choice==5){
            System.out.println("goodbye");
            break;
        }
System.out.println("enter the first number: ");
        double num1=scan.nextDouble();
    System.out.println("enter the second number: ");
        double num2=scan.nextDouble();
        switch (choice) {
            case 1:
            System.out.println("result: "+(num1+num2));
                break;
            case 2:
                System.out.println("result: "+(num1-num2));
                break;
                case 3:
                System.out.println("result: "+(num1*num2));
                    break;
            case 4:
            System.out.println("result: "+(num1/num2));
                    break;
                    
                        default:
                            break;
                    }
            }
        

        }
        }

     
    
    

