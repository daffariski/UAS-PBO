import java.util.Objects;
import java.util.Scanner;

public class SiBangApp {
    private static Scanner scanner = new Scanner(System.in);
    public static String input() {
        return scanner.nextLine();
    }

    public static String inputNumber() {
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Error! Mohon masukkan angka yang sesuai.");
                scanner.next();
            } else {
                return scanner.nextLine();
            }
        }
    }

    public static String[] username = {"admin", "user1", "user2"};
    public static String[] password = {"admin", "pass1", "pass2"};
    public static String[] trx1 = {"user1", "user2", "user1", "user2", "user1", "user2"};
    public static String[] trx2 = {"Setor   ", "Setor   ", "Tarik   ", "Tarik   ", "Transfer", "Transfer"};
    public static Integer[] trx3 = {200, 100, -20, -10, -45, 45};

    public static Integer[] getTrx4() {
        Integer[] trx4 = new Integer[trx1.length];
        for (int i = 0; i < trx1.length; i++) {
            String tempUser = trx1[i];
            Integer temp = 0;
            if (trx4[i] == null) {
                for (int j = 0; j < trx1.length; j++) {
                    if (Objects.equals(trx1[j], tempUser)) {
                        temp += trx3[j];
                        trx4[j] = temp;
                    }
                }
            }
        }
        return trx4;
    }

    public static void addAccount(String user, String pass) {
        String[] tempUser = username;
        String[] tempPass = password;
        username = new String[(username.length + 1)];
        password = new String[(password.length + 1)];

        for (int i = 0; i < username.length; i++) {
            if (i == (username.length - 1)) {
                username[i] = user;
                password[i] = pass;
            } else {
                username[i] = tempUser[i];
                password[i] = tempPass[i];
            }
        }
    }

    public static void salah() {
        System.out.println("Pilihan tidak tersedia !");
    }

    public static boolean validasiUser(String user) {
        for (int i = 0; i < username.length; i++) {
            if (Objects.equals(user, username[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean validasiPass(String pass) {
        for (int i = 0; i < password.length; i++) {
            if (Objects.equals(pass, password[i])) {
                return true;
            }
        }
        return false;
    }

    public static void addTrx(String user, String trx, int nominal) {
        String[] tempTrx1 = trx1;
        String[] tempTrx2 = trx2;
        Integer[] tempTrx3 = trx3;
        trx1 = new String[(trx1.length + 1)];
        trx2 = new String[(trx2.length + 1)];
        trx3 = new Integer[(trx3.length + 1)];

        for (int i = 0; i < trx1.length; i++) {
            if (i == (trx1.length - 1)) {
                trx1[i] = user;
                trx2[i] = trx;
                trx3[i] = nominal;
            } else {
                trx1[i] = tempTrx1[i];
                trx2[i] = tempTrx2[i];
                trx3[i] = tempTrx3[i];
            }
        }
    }

    public static int cekSaldo(String user) {
        for (int i = (trx1.length - 1); i > 0; i--) {
            if (Objects.equals(trx1[i], user)) {
                return getTrx4()[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        LandingPage.viewLandingPage();
    }
}
