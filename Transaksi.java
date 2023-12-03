import java.util.Objects;
public class Transaksi extends User {

    public static void viewTransaksi(String user) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("| Username\t| Jenis Transaksi\t| Nominal\t| Saldo Akhir\t|");
        System.out.println("-------------------------------------------------------------");

        if (user == null) {
            for (int i = 0; i < SiBangApp.trx1.length; i++) {
                printTransactionDetails(i);
            }
        } else {
            for (int i = 0; i < SiBangApp.trx1.length; i++) {
                if (Objects.equals(SiBangApp.trx1[i], user)) {
                    printTransactionDetails(i);
                }
            }
        }

        System.out.println("-------------------------------------------------------------");
        System.out.print("Tekan enter untuk kembali");
        SiBangApp.input();

        // Menyesuaikan pemanggilan metode viewMenuPage
        if ("admin".equals(user)) {
            Admin.viewMenuPage(user);
        } else {
            User.viewMenuPage(user);
        }
    }

    private static void printTransactionDetails(int index) {
        System.out.printf("| %-12s| %-20s| %-10d| %-15d|\n",
                SiBangApp.trx1[index], SiBangApp.trx2[index], SiBangApp.trx3[index], SiBangApp.getTrx4()[index]);
    }
}