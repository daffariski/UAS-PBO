import java.util.Objects;

public class Transfer extends User {
    public static Integer transfer;

    public static void viewTransfer(String user) {
        System.out.println("-----------------------------");
        System.out.println("(Ketikkan 'x' untuk kembali)");
        System.out.print("NOMINAL : ");
        var input = SiBangApp.inputNumber();

        // Memeriksa apakah pengguna memilih untuk kembali
        if (Objects.equals(input, "x")) {
            User.viewMenuPage(user);
        }

        System.out.print("TUJUAN : ");
        var tujuan = SiBangApp.input();
        
        // Memeriksa apakah tujuan transfer terdaftar
        Login.cekUser(tujuan);

        System.out.println("-----------------------------");
        Integer transfer = Integer.parseInt(input);

        // Memeriksa apakah saldo mencukupi untuk transfer
        if (transfer <= Saldo.Saldo) {
            SiBangApp.addTrx(user, "Transfer", -transfer);
            SiBangApp.addTrx(tujuan, "Transfer", transfer);
            User.viewMenuPage(user);
        } else {
            System.out.println("Saldo Anda Tidak Cukup !");
            viewTransfer(user);
        }
    }
}
