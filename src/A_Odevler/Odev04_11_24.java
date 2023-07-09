package A_Odevler;

import java.util.Scanner;

public class Odev04_11_24 {
    public static void main(String[] args) {

//Aşağıdaki tüm sorularda sayı okutuldukdan sonra sayı formatı ile çözmeye çalışalım, yani Stringe çevirerek değil.

//elbette daha sonra String çevirimi ile de çözebilirsiniz.

//1- Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz
        Scanner read1=new Scanner(System.in);
        int i1=0;
        int total1=0;

        while (i1<20)
        {
            System.out.println("Write a number.");
            int number1= read1.nextInt();
            if (number1 %2 == 1)
                total1=total1+number1;
                    i1++;
        }
        System.out.println("total = " + total1);




//2- Kullanıcnın gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunuz
        Scanner read2 = new Scanner(System.in);
        int i2 = 0;
        int totaltek2 = 0;

        while (i2 < 20) {
            System.out.println("Write a number.");
            int number2 = read2.nextInt();

            if (number2 % 2 == 1)
            {totaltek2++;
                i2++;}
            else i2++;

        }
        System.out.println("totaltek = " + totaltek2);


//3- Kullanıcının gireceği bir sayıya kadar olan sayıların toplamını bulunuz.

        Scanner read3=new Scanner(System.in);
        System.out.println("Write a number");
        int number3= read3.nextInt();
        int i3=0;
        int total3=0;

        while (i3<=number3)
        { total3=total3+i3;
            i3++;}

        System.out.println("total = " + total3);



//4- Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.

        Scanner read4=new Scanner(System.in);
        int i4=0;
        int total4=0;

        while (i4<20)
        { System.out.println("Write a number");
            int number4=read4.nextInt();
            if (number4>=10 && number4<=30)
            {total4=total4+number4;
                i4++;}
            else i4++; }

        System.out.println("total4 = " + total4);


//5- 100 kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.


        Scanner read5=new Scanner(System.in);
        int i=0;
        int total5=0;

        while (i<=100)
        { if  (i%10==5)
        {total5++;
            i++;}

        else i++;
        }
        System.out.println("total5 = " + total5);


//6- Bir sayı bulmaca oyunu yapılmak isteniyor
//bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,
//   Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,
//   bilemediniz yazıp tutulan sayıyı bildirsin.
//   Eğer bilirse tebrikler yazsın.

        Scanner read=new Scanner(System.in);

        Scanner input6 = new Scanner(System.in);
        int number6 = (int)(Math.random() * (20 -10)) + 10;
        int i6 = 1;
        int guess;
        do {
            System.out.print(i6 + "Enter your guess.");
            guess = input6.nextInt();
            if(guess == number6){
                System.out.println("CONGRATS!");
                break;
            }else if(guess != number6 && i6 != 3){
                System.out.println("You did not know!Try again!");
            }else{
                System.out.println("You failed! The number was -> " + number6);
            }
            i6++;
        }while (i6 <= 3);



    }

}


