package helloJava;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        System.out.println("Enter your obtained marks: ");
        var input = new Scanner(System.in);
        int n = input.nextInt();
        
        if(n<=100 && n>=90){
        System.out.println("The grade is \"A+\"");
        }
        else if(n<=89 && n>=80){
        System.out.println("The grade is \"A\"");
        }
        else if(n<=79 && n>=70){
        System.out.println("The grade is \"D\"");
        }
        else if(n<=69 && n>=60){
        System.out.println("The grade is \"C\"");
        }
        else if(n<=59 && n>=50){
        System.out.println("The grade is \"D\"");
        }
        else if(n<50){
        System.out.println("The grade is\"F\"");
        }
    }
}
