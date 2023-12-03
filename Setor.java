import java.util.Objects;

public class Setor extends User{
    public static Integer setor;
    public static void viewSetor(String user) {
        System.out.println("-----------------------------");
        System.out.println("(Ketikkan 'x' untuk kembali)");
        System.out.print("NOMINAL : ");
        var input = SiBangApp.inputNumber();
        if(Objects.equals(input, "x")){
            User.viewMenuPage(user);
        }
        System.out.println("-----------------------------");
        Integer setor = Integer.parseInt(input);
        if(setor >= 0 ){
            SiBangApp.addTrx(user, "Setor   ",setor);
            User.viewMenuPage(user);
        } else {
            System.out.println("Masukkan nominal > 0");
            viewSetor(user);
        }
    }
}
