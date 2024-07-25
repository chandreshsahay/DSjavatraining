package BasicJava;
import java.util.Scanner;
public class  voting {
    public static void main(String[]args) {
        System.out.println("enter your age ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (18 <=age) {
            System.out.println("you are eligible");
        } else {
            System.out.println("you are not eligible");
        }
    }

}

