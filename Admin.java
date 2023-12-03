import java.util.Locale;
import java.util.Objects;

public class Admin extends Daftar {

    public static void viewMenuPage(String user) {
        System.out.println("-----------------------------");
        System.out.println("SELAMAT DATANG " + user.toUpperCase(Locale.ROOT));
        
        // Menggunakan equals() untuk membandingkan string
        if (!user.equals("admin")) {
            System.out.println("Saldo Anda : " + SiBangApp.cekSaldo(user));
        }
        
        System.out.println("-----------------------------");
        
        if ("admin".equals(user)) {
            Admin.listMenu();
        } else {
            User.listMenu();
        }
        
        System.out.print("Masukkan Pilihanmu : ");
        String pilih = SiBangApp.input();
        
        if ("admin".equals(user)) {
            Admin.proses(pilih);
        } else {
            User.proses(pilih);
        }
    }

    public static void listMenu() {
        System.out.println("1. Lihat Seluruh Transaksi");
        System.out.println("2. Lihat Transaksi Per User");
        System.out.println("3. Keluar");
    }

    public static void proses(String pilih) {
        if (Objects.equals(pilih, "1")) {
            Transaksi.viewTransaksi(null);
        } else if (Objects.equals(pilih, "2")) {
            for (int i = 1; i < SiBangApp.username.length; i++) {
                System.out.println(i + " . " + SiBangApp.username[i]);
            }
            System.out.print("Masukkan Pilihanmu : ");
            int name = Integer.parseInt(SiBangApp.input());
            Transaksi.viewTransaksi(SiBangApp.username[name]);
        } else if (Objects.equals(pilih, "3")) {
            Login.viewLoginPage();
        } else {
            SiBangApp.salah();
            viewMenuPage(user);
        }
    }
}
