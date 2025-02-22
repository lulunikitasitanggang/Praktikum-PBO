/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Lulu Nikita Sitanggang
 * Tanggal      : 22 Februari 2025
 */

public class Garis {

    /************* ATRIBUT *************/
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    /************* METHOD *************/
    // Konstruktor tanpa parameter yang menginisialisasi titik awal dengan (0,0) dan titik akhir dengan (1,1)
    Garis () {
        titikAwal = new Titik (0,0);
        titikAkhir = new Titik (1,1);
        counterGaris++;
    }

    // Konstruktor dengan parameter masukan titik awal dan titik akhir.
    Garis (Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Mengembalikan titik awal
    Titik getTitikAwal () {
        return titikAwal;
    }

    // Mengembalikan titik akhir
    Titik getTitikAkhir () {
        return titikAkhir;
    }

    // Mengeset titik awal dengan nilai baru T
    void setTitikAwal (Titik T) {
        titikAwal = T;
    }

    // Mengeset titik akhir dengan nilai baru T
    void setTitikAkhir (Titik T) {
        titikAkhir = T;
    }

    // Selektor untuk mendapatkan atribut static counterGaris
    static int getCounterGaris() {
        return counterGaris;
    }

    // Mendapatkan panjang sebuah garis
    double getPanjang() {
        return Math.sqrt(Math.pow((titikAwal.getAbsis()-titikAkhir.getAbsis()), 2) + Math.pow((titikAkhir.getOrdinat()-titikAkhir.getOrdinat()),2));
    }

    // Mendapatkan gradien dari sebuah garis
    double getGradien() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat())/(titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // Mendapatkan ƟƟk tengah dari sebuah garis
    Titik getTitikTengah() {
        return new Titik((titikAwal.getAbsis() + titikAkhir.getAbsis())/2, (titikAwal.getOrdinat() + titikAkhir.getOrdinat())/2);
    }

    // Mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya, mengembalikan true jika sejajar dan false jika sebaliknya
    boolean cekSejajar(Garis G) {
        return getGradien() == G.getGradien();
    }

    // Mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya, mengembalikan true jika sejajar dan false jika sebaliknya
    boolean cekTegakLurus(Garis G) {
        return getGradien() * G.getGradien() == -1;
    }

    // Menampilkan ke layar titik awal dan titik akhir garis
    void printGaris() {
        System.out.print("Titik awal : " );
        titikAwal.printTitik();
        System.out.print("Titik akhir : ");
        titikAkhir.printTitik();
    }

    // Menampilkan persamaan garis dalam bentuk string y = mx + c
    void printPersamaan() {
        double c = titikAwal.getOrdinat() - (titikAwal.getAbsis() * getGradien());
        System.out.print("y = " + getGradien() + ".x + ");
        System.out.println(c);
    }
}
// end class Garis