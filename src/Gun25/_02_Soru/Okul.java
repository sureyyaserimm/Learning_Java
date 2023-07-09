package Gun25._02_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        Scanner inputInt=new Scanner(System.in);
        Scanner inputString=new Scanner(System.in);
        ArrayList<Students> cls=new ArrayList<>();

        for (int i = 0;i <3 ; i++) {
            Students newStudents=new Students();
            System.out.print("Student's name=");  newStudents.name=inputString.nextLine();
            System.out.print("Student's surname="); newStudents.surname=inputString.nextLine();
            System.out.print("Student's className="); newStudents.className= inputInt.nextInt();
            System.out.print("Student's address="); newStudents.address=inputString.nextLine();

            cls.add(newStudents);
        }
        for (Students newStudents:cls) {
            System.out.println("newStudents.name = " + newStudents.name);
            System.out.println("newStudents.surname = " + newStudents.surname);
            System.out.println("newStudents.className = " + newStudents.className);
            System.out.println("newStudents.address = " + newStudents.address);

        }


    }
}

class Students{
    //properties, field, özellik
    String name;
    String surname;
    int className;
    String address;
}