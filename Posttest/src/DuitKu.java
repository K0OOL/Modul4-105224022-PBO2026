public class DuitKu {
    String namaLengkap;
    String nomorPonsel;
    double saldo;

    DuitKu(String namaLengkap, String nomorPonsel, double saldo) {
        this.namaLengkap = namaLengkap;
        this.nomorPonsel = nomorPonsel;
        this.saldo = 0;
    }

    void isiSaldo(double nominal) {
        if (nominal < 10000) {
            System.out.println("Pengisian saldo gagal, minimum setoran adalah Rp 10,000.");
        } else {
            this.saldo += nominal;
            System.out.println("Saldo berhasil diisi.");
            System.out.println("Saldo Anda saat ini : Rp " + this.saldo);
        }
    }

    boolean bayarTagihan(String namaTagihan, double nominal) {
        if (this.saldo < nominal) {
            System.out.println("Saldo tidak cukup.");
            return false;
        } else
            this.saldo -= nominal;
        System.out.println("Tagihan " + namaTagihan + " berhasil dibayar.");
        System.out.println("Saldo Anda saat ini : Rp " + this.saldo);
        return true;
    }

    void cekSaldo() {
        System.out.println("Saldo Anda saat ini : Rp " + this.saldo);
    }
}
