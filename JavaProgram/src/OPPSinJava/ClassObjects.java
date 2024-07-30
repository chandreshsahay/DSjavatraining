package OPPSinJava;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ClassObjects {
    public static void main(String[] args) {
        //print the trainer name, technology
        //print the student name, technology
//        Trainer trainer = new Trainer();
//        trainer.trainerName = "Chandresh Sahay";
//        trainer.trainerTechnology= "JAVA";
//
//        System.out.println("My name is : "+ trainer.trainerName+ "my technlogy is: "+ trainer.trainerTechnology);
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a name");
        Student.studentName =sc.nextLine();
        System.out.println("Enter your technology");
        Student.studentEnrolledTechnology =sc.nextLine();
        System.out.println(Student.studentName+"this is my enrolled "+ Student.studentEnrolledTechnology);
    }
}

class Trainer {
    public String name;
    public Object email;
    String trainerName;
    String trainerTechnology;
}


class Student{
    static String studentName;
    static String studentEnrolledTechnology;

}


