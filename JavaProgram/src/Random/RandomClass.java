package Random;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
    Random random = new Random();
    int intNo = random.nextInt();
    float floatNo = random.nextFloat();
    double doubleNo = random.nextDouble();
    long longNo = random.nextLong();
    boolean booleanNo = random.nextBoolean();
        System.out.println("Int no is:"+ intNo);
        System.out.println("Float no is"+ floatNo);
        System.out.println("Double no is"+ doubleNo);
        System.out.println("Long no is"+longNo);
        System.out.println("boolean no is"+booleanNo);
    }
}

