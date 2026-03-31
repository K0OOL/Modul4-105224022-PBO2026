public class Main {
    public static void main(String[] args) {
        MesinKopi mesinlobby = new MesinKopi();

        mesinlobby.isiUlangBahan(200, 1000, 500);

        System.out.println("Apakah Cappuccino tersedia? " + mesinlobby.cekKetersediaanCappuccino());

    }
}