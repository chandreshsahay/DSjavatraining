package OPPSinJava;
//import java.util.Scanner;
public class PolymorphismMethodOverloading {
    public static int add(int a ,int b){
        int sum =a + b;
        return sum;
    }
    public static double add(double a, double b){
        double sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
//        add(5,6)
//        Scanner sc= new Scanner(System.in);
        System.out.println(add(5,6));
        System.out.println(add(8.6,2.5));
    }
}

