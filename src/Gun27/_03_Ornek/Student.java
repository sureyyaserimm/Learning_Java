package Gun27._03_Ornek;


import java.util.ArrayList;

public class Student {
        String studentName;
        int studentMaxHours;
        ArrayList<Lesson> studentLessons=new ArrayList<>();

        public void addLesson(Lesson lesson){
            int totalHours=0;
            for (Lesson l:studentLessons) {
                totalHours+=l.lessonHours;

                if (totalHours+ lesson.lessonHours<=studentMaxHours)
                    studentLessons.add(lesson);
                else
                    System.out.println("Kredinizi aştınız. Yeni ders eklenememekedir."+
                            "Eklenemeyen ders="+lesson.lessonName);

            }

        }
        public void writeLessons(){
            System.out.println("\n***Transkript***");
            System.out.println("Dear"+studentName);
            System.out.println("Aldığınız dersler aşağıdadır:");

            for (Lesson lesson:studentLessons)
                System.out.println(lesson.lessonName+" "+lesson.lessonHours);
        }

        public static void theRulesOfUniversity(){

            System.out.println("Kural1 : Kahvaltı yapmadan derse gelme");
            System.out.println("Kural2 : Uykunu mutlaka al, erken yat");
            System.out.println("Kural3 : Herzaman dinç dinamik ol");
            System.out.println("Kural4 : Başta verdiğini kararı UNUTMA!");
            System.out.println("Kural5 : Biz imkansızlıkları, inş aşacağız");

        }






    }