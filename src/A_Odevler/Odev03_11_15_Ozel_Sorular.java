package A_Odevler;

import java.util.Scanner;

public class Odev03_11_15_Ozel_Sorular {
    public static void main(String[] args) {
        //ÖZEL SORULAR

        //1- Ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştiriniz.

        Scanner read=new Scanner(System.in);
        System.out.println("Write your name");
        String name=read.nextLine();
        System.out.println("Write your surname");
        String surname=read.nextLine();

        System.out.println("Your Name Surname= " + name.concat(" ") +surname);

        //2- Girilen bir kelimenin boş(Blank) olup olmadığını yazdırınız

        Scanner read2=new Scanner(System.in);
        System.out.println("Write a word.");
        String word=read2.nextLine();
        System.out.println("Word is empty= " + word.isEmpty());

        //3- girilen bir cümledeki A harfi sayısını bulunuz.(Büyük küçük harf ayırımı olmadan)

        Scanner input=new Scanner(System.in);
        System.out.println("Write a sentence.");
        String sentence=input.nextLine();
        int lengthSentence=sentence.length();
        String deleteA=sentence.toLowerCase().replace("a","");
        int lengthDeleteA=deleteA.length();
        System.out.println("Number of a letter="+ (lengthSentence-lengthDeleteA));

        //4- girilen bir kelimenin ilk ve son harfini bulunuz.

        Scanner read4=new Scanner(System.in);
        System.out.print("Write a word. ");
        String word2=read4.nextLine();
        System.out.println("firstLetter = " + word2.charAt(0));
        System.out.println("lastLetter = "+word2.charAt(word2.length()-1) );


        //5- girilen bir cümledeki ilk kelimeyi yazdırınız.

        Scanner read5=new Scanner(System.in);
        System.out.println("Write a sentence.");
        String sentence5=read5.nextLine();
        int blankIndex=sentence5.indexOf(" ");
        String firstWord=sentence5.substring(0,blankIndex); // String firstWord=sentence5.substring(0,sentence5.indexOf(" "));  int blankIndex'i tanımlamaya gerek kalmadan bu yapılabilir.
        System.out.println("firstWord = " + firstWord);


        //6- girilen en az 3 kelimelik bir cümledeki ilk iki kelimeyi yazdırınız.

        Scanner read6 = new Scanner(System.in);

        System.out.print("Write a sentence ");
        String sentence6 = read6.nextLine();
        int firstBlank2 = sentence6.indexOf(" ");
        String firstWord2 = sentence6.substring(0,firstBlank2);
        sentence6=sentence6.substring(firstBlank2+1);
        firstBlank2=sentence6.indexOf(" ");
        String firstWord3 = sentence6.substring(0,firstBlank2);

        System.out.println("First Two Words= " + firstWord2+ " " + firstWord3);


        //7- Girilen bir cümlede kaç kelime olduğunuz bulunuz.

        Scanner read7=new Scanner(System.in);
        System.out.println("Write a sentence.");
        String sentence7=read7.nextLine();
        String sentence8=sentence7.replaceAll("[^ ]","");
        int length=sentence8.length();
        System.out.println("totalWord=" +(sentence8.length()+1));


        //8- Girilen bir cumledeki kelimelerin ilk harflerini yazdırınız.

       /* bir sonraki soruyla aynı aslında ama cümlenin uzunluğunu bilmediğimiz için bir çözüm bulamadım,
        o yüzden boş bırakıyorum.  */

        Scanner oku = new Scanner(System.in);
        System.out.print("cumleyi giriniz: ");
        String cumleGirdisi = oku.nextLine();
        System.out.println("ilk harfler: " + cumleGirdisi.replaceAll("\\B\\S", ""));

        //9- 3 kelimelik ismi olan kişinin ad , 2.ad ve soyadını A.E.Y. şeklinde yazınız.


        Scanner read9=new Scanner(System.in);
        System.out.print("Write your name ");
        String nameSurname= read9.nextLine();

        int blankIndex2=nameSurname.indexOf(" ");
        String name1=nameSurname.substring(0,blankIndex2);

        int blank2Index=nameSurname.lastIndexOf(" ");
        String name2=nameSurname.substring(blankIndex2+1,blank2Index);
        String surname1=nameSurname.substring(blank2Index+1);

        System.out.println("Ad = " + name1.charAt(0)+"."+name2.charAt(0)+"."+surname1.charAt(0)+".");

    }
}
