package Gun26._02_Ornek;

public class Person {
    String name;
    String surname;
    int age;
    int birthYear;

    public void writeInformation(){

        System.out.println("worker's name= " + name);
        System.out.println("worker's surname= " + surname);
        System.out.println("worker's age= " + age);

    }

    @Override
    public String toString() {
        return name+" "+surname+" "+age;
    }

    public void getBirthYear(){
        System.out.println("birthYear = " + (2022-age));
    }

    public String getBirthYear2(){
        return "birth year="+(2022-age);
    }

    public void getInitials(){

        System.out.println("name's initials = " + name.toUpperCase().charAt(0)+"."
                +surname.toUpperCase().charAt(0)+".");

    }

}
