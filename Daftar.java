import java.util.Objects;
public class Daftar {

    public static String user;
    public static String pass;

    public static void viewDaftarPage() {
        System.out.println("-----------------------------");
        System.out.println("SIGN UP");
        System.out.println("-----------------------------");

        // Meminta input username dari pengguna
        System.out.println("(Ketikkan 'x' untuk kembali)");
        System.out.print("Username : ");
        user = SiBangApp.input();
        cancel(user); // Memeriksa apakah pengguna memilih untuk kembali
        daftar(user); // Memeriksa apakah username sudah terdaftar

        // Meminta input password dari pengguna
        System.out.print("Password : ");
        pass = SiBangApp.input();
        SiBangApp.addAccount(user, pass);
        System.out.println("Akun Sudah Ditambahkan !");

        // Menampilkan halaman login setelah mendaftar
        Login.viewLoginPage();
    }

    public static void daftar(String user) {
        // Melakukan loop hingga username yang dimasukkan belum terdaftar
        while (SiBangApp.validasiUser(user)) {
            System.out.println("Username sudah terdaftar !");
            System.out.print("Username : ");
            user = SiBangApp.input();
            cancel(user); // Memeriksa apakah pengguna memilih untuk kembali
        }
    }

    public static void cancel(String user) {
        // Menggunakan equalsIgnoreCase() untuk memeriksa apakah input 'x' atau 'X'
        if (Objects.equals(user.toUpperCase(), "X")) {
            // Kembali ke landing page jika pengguna memilih untuk kembali
            LandingPage.viewLandingPage();
        }
    }
}
