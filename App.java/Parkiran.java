import java.util.Scanner;
public class Parkiran{
      public static void main(String[]args){
        Scanner masukan_data = new Scanner(System.in);
        int biaya_parkir = 2000;
        int jam_parkir;
        int total_biaya_parkir;
        System.out.println("SELAMAT DATANG DI PARKIRAN JAYA ABADI");
        System.out.println("=====================================");
        System.out.println("Masukan Jam Masuk");
        int jam_masuk = masukan_data.nextInt();
        System.out.println("Masukan Jam Keluar");
        int jam_keluar = masukan_data.nextInt();
        jam_parkir = jam_keluar - jam_masuk;
        total_biaya_parkir =  jam_parkir * biaya_parkir;
        System.out.println("Total Yang Harus Di Bayar RP." +total_biaya_parkir);
        System.out.println("Terima Kasih");
        //By. Muhamad Saepulloh
    } 
}