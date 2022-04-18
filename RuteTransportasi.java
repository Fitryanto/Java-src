import java.util.Scanner;

public class RuteTransportasi extends Transportasi {

    public static void main(String[] args) {
        Boolean loop = true;
        RuteTransportasi destinasi = new RuteTransportasi();
        Scanner scan = new Scanner(System.in);
        System.out.println("Aplikasi Google Maps Sederhana");
        System.out.println("Tentukan Titik Awal dan Tujuan");
        System.out.println("Titik Awal :");
        String awal = scan.nextLine();
        destinasi.setAwal(awal);
        System.out.println("Tujuan :");
        String tujuan = scan.nextLine();
        destinasi.setTujuan(tujuan);

        while (loop) {

            System.out.println("Moda Transportasi");
            System.out.println("1. Mobil\n2. Motor\n3. Kereta Api\n4. Jalan Kaki");
            System.out.println("Pilihan Anda: ");
            String pilih = scan.nextLine();

            if (pilih.equals("1")) {
                System.out.println(destinasi);
                Transportasi mobil = new Mobil();
                mobil.display();
                mobil.performRute();
                System.out.println();
            } else if (pilih.equals("2")) {
                System.out.println(destinasi);
                Transportasi motor = new Motor();
                motor.display();
                motor.performRute();
                System.out.println();
            } else if (pilih.equals("3")) {
                System.out.println(destinasi);
                Transportasi kereta = new Kereta();
                kereta.display();
                kereta.performRute();
                System.out.println();
            } else if (pilih.equals("4")) {
                System.out.println(destinasi);
                Transportasi jalankaki = new JalanKaki();
                jalankaki.display();
                jalankaki.performRute();
                System.out.println();
            } else {
                System.out.println("Pilihan salah.");
                loop = false;
            }
        }

        // Transportasi motor = new Motor();
        // motor.display();
        // motor.performRute();
        //
        // Transportasi mobil = new Mobil();
        // mobil.display();
        // mobil.performRute();
        // mobil.setRuteBehaviour(new JlnTol());
        // mobil.performRute();
        //
        // Transportasi truk = new Truk();
        // truk.display();
        // truk.performRute();
        // truk.setRuteBehaviour(new JlnTol());
        // truk.performRute();
    }

}
