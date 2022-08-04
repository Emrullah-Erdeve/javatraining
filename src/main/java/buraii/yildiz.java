package buraii;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public  class yildiz {

    public static
    String yildizlar(String input) {
        String a = "";
        try {


            int inputin = parseInt(input);

            if (inputin < 0) {
                a = "pozitifff olsun";
                System.out.println(a);
                return a;
            }
            for (int i = 0; i < inputin; i++) {
                for (int j = 0; j < inputin - i; j++) {
                    a += ' ';
                }
                for (int p = 0; p < 2 * (i) + 1; p++) {

                    a += '*';
                }
                a += "\n";
            }
            System.out.println(a);
            return a;
        }catch (NumberFormatException e)
        {
            System.out.println("sayi girermisinn");
            return a;
        }
    }
    public static String qisecik(String mesaj){
        String a=null;
        if (mesaj.equals("q")) {
            a="bb";
            return a;
        }
        return a;
    }

    public static void main (String[]args) throws InterruptedException {
        System.out.println("hosssssssssssassssmişsiz aiisss");
        for (int n = 0; n < 1;) {
            System.out.println("Piramiti olusturmak icin  bir sayi giriniz: ");
            System.out.println("çıkmak için 'q' ya basınız");
            Scanner input = new Scanner(System.in);
            String mesaj = input.next();

         if(qisecik(mesaj)=="bb"){
             System.out.println("bb");
             break;
         }
            yildizlar(mesaj);

        }
    }
}