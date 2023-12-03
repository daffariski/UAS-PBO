import java.util.Objects;

public class Tarik extends User {

    public static Integer tarik;

    public static void viewTarik(String user) {
        System.out.println("-----------------------------");
        System.out.println("(Ketikkan 'x' untuk kembali)");

        // Meminta pengguna untuk memasukkan nominal tarik
        System.out.print("NOMINAL : ");
        var input = SiBangApp.inputNumber();

        // Memeriksa apakah pengguna memilih untuk kembali
        if (Objects.equals(input, "x")) {
            User.viewMenuPage(user);
            return; // Menghentikan eksekusi setelah memanggil viewMenuPage
        }

        System.out.println("-----------------------------");
        Integer tarik = Integer.parseInt(input);

        // Memeriksa apakah saldo mencukupi untuk penarikan
        if (tarik <= Saldo.Saldo) {
            SiBangApp.addTrx(user, "Tarik   ", -tarik);
            User.viewMenuPage(user);
        } else {
            System.out.println("Saldo Anda Tidak Cukup !");
            viewTarik(user);
        }
    }
}
