public class CheckGuest { // Classe che contiene i metodi di verifica degli invitati
    public static boolean containsUsingIf(String[] list, String name) { // Metodo con ciclo FOR per cercare il nome
        for (String guest : list) { // Scorre ogni elemento della lista
            if (guest.equalsIgnoreCase(name)) { // Controlla se il nome corrisponde ignorando maiuscole/minuscole
                return true; // Se il nome è trovato, restituisce true
            }
        }
        return false; // Se il nome non è nella lista, restituisce false
    }