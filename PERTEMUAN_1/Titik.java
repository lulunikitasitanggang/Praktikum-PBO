/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Lulu Nikita Sitanggang (24060123120032)
 * Tanggal      : 22 Februari 2025
 */

public class Titik {    /**************** ATRIBUT *****************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /**************** METHOD *****************/
    // Konstruktor tanpa parameter untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // Konstruktor dengan parameter masukan x dan y
    Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    // Mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // Menghitung kuadran titik
    int getKuadran() {
        if (getAbsis() > 0 && getOrdinat() > 0) {
            return 1;
        }
        else if (getAbsis() < 0 && getOrdinat() > 0) {
            return 2;
        }
        else if (getAbsis() < 0 && getOrdinat() < 0) {
            return 3;
        }
        else if (getAbsis() > 0 && getOrdinat() < 0) {
            return 4;
        }else {
            return -1;
        }
    }

    // Menghitung jarak titik dari pusat
    double getJarakPusat() {
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    // Menghitung jarak 2 titik
    double getJarak(Titik T) {
        return Math.sqrt(Math.pow((absis-T.absis), 2) + Math.pow((ordinat-T.ordinat),2));
    }

    // Refleksi dari sumbu X
    void refleksiX(){
        ordinat = ordinat * -1;
    }

    // Refleksi dari sumbu Y
    void refleksiY(){
        absis = absis * -1;
    }

    // getRefleksi dari sumbu X
    Titik getRefleksiX(){
        return new Titik(absis, ordinat * -1);
    }

    // getRefleksi dari sumbu Y
    Titik getRefleksiY(){
        return new Titik(absis * -1, ordinat);
    }
}
//end class Titik