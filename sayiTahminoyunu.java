package hafta3;

import java.util.Scanner;
import java.util.Random;

public class sayiTahminoyunu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Max = 100, Min = 0, tahmin = 0;
        boolean durum = false;

        int rastgele = (int)(Math.random() * ( Max - Min ));
        //System.out.println("rastgele sayi :" + rastgele);

        for(int i = 1; i <= 7; i++){

            System.out.println("Lütfen 1 ile 100 arasinda sayi giriniz : ");
            tahmin = sc.nextInt();

            if(tahmin == rastgele){
                durum = true;
                System.out.println("Tebrikler, Kazandınız! ");
                break;
            }
            else if(tahmin > rastgele){

                System.out.println("Lütfen daha minnak bir sayi giriniz : ");

            }
            else if(tahmin < rastgele){

                System.out.println("Lütfen daha büyüük bir sayi giriniz : ");

            }
            else{

                System.out.println("Bir hata oluştu ");
                break;
            }


        }
        if(durum == false) {
            System.out.println("Hakkınız bitmiştir. ");
        }

    }
}
