/* Nama File    : MTitik.java
 * Deskripsi    : Main class Titik
 * Pembuat      : Lulu Nikita Sitanggang (24060123120032)
 * Tanggal      : 22 Februari 2025
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik(); // T2 berubah karena memiliki reference yang sama dengan T1

        Titik T3 = new Titik();
        Titik T4 = new Titik(2,7);

        T3.printTitik();
        T4.printTitik();

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());

        System.out.print("Kuadran T1 = ");
        System.out.println(T1.getKuadran());

        System.out.print("Jarak Pusat T1 = ");
        System.out.println(T1.getJarakPusat());

        System.out.print("Jarak T1 dengan T4 = ");
        System.out.println(T1.getJarak(T4));

        System.out.print("Refleksi T2 terhadap sumbu X = ");
        T2.refleksiX();
        T2.printTitik();

        System.out.print("Refleksi T2 terhadap sumbu Y = ");
        T2.refleksiY();
        T2.printTitik();

        System.out.print("Hasil refleksi T1 terhadap sumbu X = ");
        Titik T5 = T1.getRefleksiX();
        T5.printTitik();

        System.out.print("Hasil refleksi T1 terhadap sumbu Y = ");
        Titik T6 = T1.getRefleksiY();
        T6.printTitik();
    }
}