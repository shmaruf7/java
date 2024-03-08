package helloJava;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the operation number \n 1 for Addition \n 2 for Subtraction \n 3 for Multiplication \n 4 for Devidation");
        int operation = input.nextInt();
        System.out.print("Enter the first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = input.nextInt();
        int result = 0;
        switch(operation){
            case 1:
            result = n1 + n2;
            System.out.println("The result is:" +result);
            break;
            case 2:
            result = n1 - n2;
            System.out.println("The result is:" +result);
            break;
            case 3:
            result = n1 * n2;
            System.out.println("The result is:" +result);
            break;
            case 4:
            result = n1 / n2;
            System.out.println("The result is:" +result);
            break;
            default:
            System.out.println("The operation is not available!! \nPlease enter the right opoeration number as given above. Thank you!");
           
        }
    }
}
