package Gun25._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Scanner inputInt=new Scanner(System.in);
        Scanner inputStr=new Scanner(System.in);

        ArrayList<Students> cls=new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Students stu=new Students();

            System.out.print("School Number="); stu.SchoolNumber=inputInt.nextInt();
            System.out.print("Student's Name="); stu.name= inputStr.nextLine();
            System.out.print("Note="); stu.note=inputInt.nextInt();

            cls.add(stu);
        }
        writeTheInformations(cls);
        writeAverage(cls);
    }

    public static void writeTheInformations(ArrayList<Students> cls) {
        for (Students stu:cls) {
            System.out.println("stu.note = " + stu.note);
            System.out.println("stu.name = " + stu.name);
            System.out.println("stu.SchoolNumber = " + stu.SchoolNumber);

        }
    }
    public static void writeAverage(ArrayList<Students> cls) {

        int total=0;
        for (Students stu:cls) {
            total=total+ stu.note;
        }
        System.out.println("total/cls.size() = " + total / cls.size());
    }

}
