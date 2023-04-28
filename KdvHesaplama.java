import java.util.Scanner;
public class NotOrt {

    public static void main(String[] args) {
        double tutar;
        double kdvTutar;
        Scanner inp = new Scanner(System.in);
        System.out.println("Tutar Giriniz:");
        tutar = inp.nextInt();
        if(0<tutar && tutar<=1000){
            kdvTutar = tutar + (tutar * 0.18);
            System.out.println("KDV Tutarı: " + kdvTutar);

        }
        if(tutar > 1000){
            kdvTutar = tutar + (tutar * 0.08);
            System.out.println("KDV Tutarı: " + kdvTutar);

        }

    }
}