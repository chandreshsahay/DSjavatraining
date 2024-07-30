package BasicJava;

import java.util.Scanner;
public class eligibleforvoting {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter tour age");
        int age= sc.nextInt();
        if (18 <=age) {
            System.out.println("You are eligible");
        } else {
            System.out.println("You are not eligible");
        }
    }
}
