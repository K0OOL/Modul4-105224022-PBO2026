import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang di DuitKu");
        System.out.print("Masukkan Nama Anda : ");
        String nama = input.nextLine();
        System.out.print("\nMasukkan Nomor Ponsel Anda : ");
        String nomorPonsel = input.nextLine();
        DuitKu dompet = new DuitKu(nama, nomorPonsel, 0);

        int pilihan;
        do {
            System.out.println("\nMenu : ");
            System.out.println("1. Isi Saldo");
            System.out.println("2. Bayar Tagihan");
            System.out.println("3. Cek Saldo");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nominal : ");
                    double nominal = input.nextDouble();
                    dompet.isiSaldo(nominal);
                    break;
                case 2:
                    System.out.print("Masukkan Nama Tagihan : ");
                    input.nextLine();
                    String namaTagihan = input.nextLine();
                    System.out.print("Masukkan Nominal : ");
                    double nominalTagihan = input.nextDouble();
                    dompet.bayarTagihan(namaTagihan, nominalTagihan);
                    break;
                case 3:
                    dompet.cekSaldo();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan DuitKu");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 4);

        input.close();

    }
}
