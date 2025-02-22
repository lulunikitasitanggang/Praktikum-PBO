/* Nama File    : MGaris.java
 * Deskripsi    : Main class Garis
 * Pembuat      : Lulu Nikita Sitanggang (24060123120032)
 * Tanggal      : 22 Februari 2025
 */

public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();
        G1.printGaris();
        G1.getTitikAwal();
        G1.getTitikAkhir();

        Titik T1 = new Titik(1, 4);
        Titik T2 = new Titik(3, 6);

        G1.setTitikAwal(T1);
        G1.setTitikAkhir(T2);
        G1.printGaris();

        System.out.println("Jumlah Objek Garis = " + Garis.getCounterGaris());
        System.out.println("Panjang Garis G1 adalah " + G1.getPanjang());
        System.out.println("Gradien Garis G1 adalah " + G1.getGradien());

        System.out.print("Titik Tengah Garis G1 adalah ");
        G1.getTitikTengah().printTitik();

        Garis G2 = new Garis(T1, T2);
        System.out.println("Apakah G1 dan G2 sejajar? " + G1.cekSejajar(G2));
        System.out.println("Apakah G1 dan G2 tegak lurus? " + G1.cekTegakLurus(G2));

        System.out.print("Persamaan Garis G1 : ");
        G1.printPersamaan();
    }
}