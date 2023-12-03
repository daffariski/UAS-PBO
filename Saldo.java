import java.util.Objects;

public class Saldo {

    public static int Saldo;

    public static void viewSaldo(String user) {
        int saldo = calculateSaldo(user);

        displaySaldoHeader(user);
        displaySaldoDetails(saldo);
    }

    private static int calculateSaldo(String user) {
        int saldo = 0;

        for (int i = SiBangApp.trx1.length - 1; i >= 0; i--) {
            if (Objects.equals(SiBangApp.trx1[i], user)) {
                saldo = SiBangApp.getTrx4()[i];
                break;
            }
        }

        return saldo;
    }

    private static void displaySaldoHeader(String user) {
        System.out.println("-----------------------------");
        System.out.println("SALDO " + user.toUpperCase() + " DETAILS");
        System.out.println("-----------------------------");
    }

    private static void displaySaldoDetails(int saldo) {
        System.out.println("Saldo Anda : " + saldo);
        System.out.println("Catatan: Ini adalah saldo akhir berdasarkan transaksi terakhir.");
        displayAdditionalDetails();
    }

    private static void displayAdditionalDetails() {
        // Menampilkan detail tambahan
        System.out.println("Detail Tambahan: Informasi lebih lanjut bisa ditambahkan di sini.");
    }
}
