import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {

        //Değişkenlerin tanımlanması.

        int ay,gun;
        String burc="";
        boolean isError=false;

        //Gün ve Ay'ın girilmesi.

        Scanner input=new Scanner(System.in);

        System.out.print("Dogum gununuzu giriniz : " );
        gun=input.nextInt();

        System.out.print("Dogum ayını (1-12) giriniz : " );
        ay=input.nextInt();

        if (1 <= ay && ay <=12){
            if (ay == 1 ){
                if (0 < gun && gun <=31){
                    if(gun<=21)
                        burc="Oglak";
                    else
                        burc="Kova";
                }else
                    isError=true;
            }
            else if (ay == 2 ){
                if (0 < gun && gun <=28) {
                    if (gun <= 19)
                        burc = "Kova";
                    else
                        burc = "Balik";
                }else
                    isError=true;
            }
            else if (ay == 3 ){
                if (0 < gun && gun <=31) {
                    if (gun <= 20)
                        burc = "Balik";
                    else
                        burc = "Koc";
                }else
                    isError=true;
            }
            else if (ay == 4 ){
                if (0 < gun && gun <=30) {
                    if (gun <= 20)
                        burc = "Koc";
                    else
                        burc = "Boğa";
                }else
                    isError=true;
            }
            else if (ay == 5 ){
                if (0 < gun && gun <=31) {
                    if (gun <= 21)
                        burc = "Boğa";
                    else
                        burc = "İkizler";
                }
            }
            else if (ay == 6 ){
                if (0 < gun && gun <=30) {
                    if (gun <= 22)
                        burc = "İkizler";
                    else
                        burc = "Yengeç";
                }else
                    isError=true;
            }
            else if (ay == 7 ){
                if (0 < gun && gun <=31) {
                    if (gun <= 22)
                        burc = "Yengeç";
                    else
                        burc = "Aslan";
                }else
                    isError=true;
            }
            else if (ay == 8 ){
                if (0 < gun && gun <=31) {
                    if (gun <= 22)
                        burc = "Aslan";
                    else
                        burc = "Basak";
                }else
                    isError=true;
            }
            else if (ay == 9){
                if (0 < gun && gun <=30) {
                    if (gun <= 22)
                        burc = "Basak";
                    else
                        burc = "Terazi";
                }else
                    isError=true;
            }
            else if (ay == 10 ){
                if (0 < gun && gun <=31) {
                    if (gun <= 22)
                        burc = "Terazi";
                    else
                        burc = "Akrep";
                }else
                    isError=true;
            }
            else if (ay == 11 ){
                if (0 < gun && gun <=30) {
                    if (gun <= 21)
                        burc = "Akrep";
                    else
                        burc = "Yay";
                }else
                    isError=true;
            }
            else if (ay == 12 ) {
                if (0 < gun && gun <= 31) {
                    if (gun <= 21)
                        burc = "Yay";
                    else
                        burc = "Oglak";
                }else
                    isError=true;
            }

        } else
            isError=true;

        if (isError)
            System.out.print("Hatalı gün veya ay girdiniz! Lütfen tekrar deneyiniz.");
        else
            System.out.print("Burcunuz : " + burc);
    }
}