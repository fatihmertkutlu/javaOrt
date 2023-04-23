import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);
        System.out.println("Matematik Notunuz Giriniz :");
        matematik = inp.nextInt();
        System.out.println("Fizik Notunuz Giriniz :");
        fizik = inp.nextInt();
        System.out.println("Kimya Notunuz Giriniz :");
        kimya = inp.nextInt();
        System.out.println("Türkçe Notunuz Giriniz :");
        turkce = inp.nextInt();
        System.out.println("Tarih Notunuz Giriniz :");
        tarih = inp.nextInt();
        System.out.println("Müzik Notunuz Giriniz :");
        muzik = inp.nextInt();
        int toplam = (matematik+fizik+kimya+turkce+tarih+muzik);
        double sonuc = (toplam/6) ;
        System.out.println("Not Ortalamanız :"+sonuc);
        String durum = sonuc >= 60 ? "Geçtin":"Kaldın";
        System.out.println(durum);



    }
}