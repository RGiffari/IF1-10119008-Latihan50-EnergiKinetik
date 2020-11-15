package latihan.EnergiKinetik;

/*
 * @author Raihan Giffari
 *
 * Nama  : Raihan Giffari
 * Nim   : 10119008
 * Kelas : IF1
 */

public class Main {

    public static void main(String[] args) {
        EnergiKinetik energiKinetik = new EnergiKinetik(145, 25);
        System.out.println("Massa : " + energiKinetik.getMassa() + " g");
        System.out.println("Kecepatan : "+energiKinetik.getVolume() + " m/s");
        System.out.printf("Energi Kinetik : %.2f joule%n", energiKinetik.hitung());
        System.out.printf("Karena energi kinetik awalnya 0 maka usaha nya  %.2f joule%n", energiKinetik.hitung());
    }
}
