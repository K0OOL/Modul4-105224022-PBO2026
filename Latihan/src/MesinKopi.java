public class MesinKopi {

    double bijiKopi;
    double air;
    double susu;

    public void isiUlangBahan(double bijiKopi, double air, double susu) {
        this.bijiKopi += bijiKopi;
        this.air += air;
        this.susu += susu;

        System.out.println("Bahan Baku Berhasil diisi Ulang.");
    }

    boolean cekKetersediaanCappuccino() {
        if (bijiKopi >= 15 && air >= 50 && susu >= 100) {
            return true;
        } else {
            return false;
        }
    }

    MesinKopi() {
        this.bijiKopi = 0;
        this.air = 0;
        this.susu = 0;
    }
}
