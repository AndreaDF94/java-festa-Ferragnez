import java.util.Scanner; // Importa la classe Scanner per leggere l'input da tastiera

public class FestaFerragnez { // Classe che contiene la logica del programma
    public static void main(String[] args) { // Metodo main che esegue il programma
        Scanner scanner = new Scanner(System.in); // Crea un oggetto Scanner per leggere l'input utente
          String[] guestList = { // Definisce la lista degli invitati come array di stringhe
            "Chiara Ferragni", "Fedez", "Luis Sal", "Ax", "Francesco Totti",
            "Ilary Blasi", "Bebe Vio", "Lus", "Pardis Zarei", "Martina Maccherone", "Rachel Zelic"
        };

        System.out.print("Benvenuto alla festa Ferragnez! Come ti chiami? "); // Chiede il nome all'utente
        String userName = scanner.nextLine(); // Legge il nome inserito da tastiera

        boolean isInvitedIf = CheckGuest.containsUsingIf(guestList, userName); // Verifica la presenza del nome usando il metodo con ciclo FOR
        System.out.println("[IF] Risultato: " + (isInvitedIf ? "Sei invitato! Puoi entrare." : "Mi dispiace, non sei sulla lista.")); // Stampa il risultato della verifica FOR

        boolean isInvitedWhile = CheckGuest.containsUsingWhile(guestList, userName); // Verifica la presenza del nome usando il metodo con ciclo WHILE
        System.out.println("[WHILE] Risultato: " + (isInvitedWhile ? "Sei invitato! Puoi entrare." : "Mi dispiace, non sei sulla lista.")); // Stampa il risultato della verifica WHILE

        scanner.close(); // Chiude lo scanner per liberare risorse
    }
}

