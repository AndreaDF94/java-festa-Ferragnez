import java.util.Scanner;

public class FestaFerragnez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

           // Lista degli invitati
        String[] guestList = {
            "Chiara Ferragni", "Fedez", "Luis Sal", "Ax", "Francesco Totti",
            "Ilary Blasi", "Bebe Vio", "Lus", "Pardis Zarei", "Martina Maccherone", "Rachel Zelic"
        };

         // Chiedi all'utente il nome
        System.out.print("Benvenuto alla festa Ferragnez! Come ti chiami? ");
        String userName = scanner.nextLine();
