import java.util.Objects;

public class Login extends Daftar {

    public static void viewLoginPage() {
        // Menampilkan header halaman login
        System.out.println("-----------------------------");
        System.out.println("LOGIN PAGE");
        System.out.println("-----------------------------");

        // Meminta input username dari pengguna
        System.out.println("(Ketikkan 'x' untuk kembali)");
        System.out.print("Username : ");
        user = SiBangApp.input();
        cancel(user);

        // Memeriksa apakah username sudah terdaftar
        cekUser(user);

        // Meminta input password dari pengguna
        System.out.print("Password : ");
        pass = SiBangApp.input();
        cancel(pass);

        // Memeriksa kevalidan password
        cekPass(pass);

        // Melakukan proses login berdasarkan tipe pengguna
        login(user);
    }

    public static void cekUser(String user) {
        // Melakukan loop hingga username yang dimasukkan terdaftar
        while (!SiBangApp.validasiUser(user)) {
            System.out.println("Username belum terdaftar !");
            System.out.print("Username : ");
            user = SiBangApp.input();
            cancel(user);
        }
    }

    public static void login(String user) {
        // Menentukan tipe pengguna dan menampilkan halaman menu sesuai
        if (Objects.equals(user, "admin")) {
            Admin.viewMenuPage(user);
        } else {
            User.viewMenuPage(user);
        }
    }

    public static void cekPass(String pass) {
        // Melakukan loop hingga password yang dimasukkan valid
        while (!SiBangApp.validasiPass(pass)) {
            System.out.println("Password Salah !");
            System.out.print("Password : ");
            pass = SiBangApp.input();
            cancel(pass);
        }
    }
}
