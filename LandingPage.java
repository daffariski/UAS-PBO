public class LandingPage {

    public static void viewLandingPage() {
        displayWelcomeMessage();
        displayMenuOptions();
        handleUserInput();
    }

    private static void displayWelcomeMessage() {
        System.out.println("-----------------------------");
        System.out.println("SELAMAT DATANG DI SI BANG APP");
        System.out.println("-----------------------------");
    }

    private static void displayMenuOptions() {
        System.out.println("1. Login");
        System.out.println("2. Daftar");
        System.out.print("Masukkan Pilihanmu : ");
    }

    private static void handleUserInput() {
        String pilih = SiBangApp.input();
        processUserChoice(pilih);
    }

    private static void processUserChoice(String choice) {
        switch (choice) {
            case "1":
                Login.viewLoginPage();
                break;
            case "2":
                Daftar.viewDaftarPage();
                break;
            default:
                handleInvalidInput();
        }
    }

    private static void handleInvalidInput() {
        System.out.println("Pilihan tidak valid! Silakan pilih 1 atau 2.");
        viewLandingPage(); // Memanggil kembali tampilan landing page setelah menangani input tidak valid.
    }
}
