import java.util.Scanner;
import java.io.*;
public class Main {
    static Scanner input = new Scanner(System.in);//membuat inputan

    static double[] hitungPersegi() {
        System.out.print("Masukkan panjang persegi : ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar persegi : ");
        double lebar = input.nextDouble();

        Persegi persegi = new Persegi(panjang, lebar);

        System.out.print("Luas persegi : " + persegi.luas + "\n");
        return new double[]{panjang, lebar, persegi.luas};

    }

    static double[] hitungSegitiga() {
        System.out.print("Masukkan panjang segitiga : ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan tinggi segitiga : ");
        double lebar = input.nextDouble();

        Segitiga segitiga = new Segitiga(panjang, lebar);

        System.out.print("Luas segitiga : " + segitiga.luas + "\n");
        return new double[]{panjang, lebar, segitiga.luas};
    }

    static double[] hitungLingkaran() {
        System.out.print("Masukkan jari-jari lingkaran : ");
        double jariJari = input.nextDouble();

        Lingkaran lingkaran = new Lingkaran(jariJari);

        System.out.print("Luas lingkaran : " + lingkaran.luas + "\n");
        return new double[]{jariJari, lingkaran.luas};


    }

    public static void main(String[] args) throws IOException {
        String namaFile = "output.txt";
        File file = new File(namaFile);
        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        int menu;
        do {
            System.out.println("           Pilih bangun Ruang           ");
            System.out.println("----------------------------------------");
            System.out.print("1.Persegi\n2.Segitiga\n3.Lingkaran\n4.Keluar dari program\n =>");
            menu = input.nextInt();

            switch (menu){
                case 1:
                    double[] hasilPersegi = hitungPersegi();
                    printWriter.println("Luas persegi dengan panjang " + hasilPersegi[0] + " dan lebar " + hasilPersegi[1] + " adalah " + hasilPersegi[2]);
                    break;
                case 2:
                    double[] hasilSegitiga = hitungSegitiga();
                    printWriter.println("Luas segitiga dengan panjang " + hasilSegitiga[0] + " dan tinggi " + hasilSegitiga[1] + " adalah " + hasilSegitiga[2]);
                    break;
                case 3:
                    double[] hasilLingkaran = hitungLingkaran();
                    printWriter.println("Luas Lingkaran dengan jari-jari " + hasilLingkaran[0] + " adalah " + hasilLingkaran[1]);
                    break;
                case 4:
                    printWriter.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }

        }
        while (menu != 4);
    }

}