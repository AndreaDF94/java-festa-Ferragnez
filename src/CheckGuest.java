public class CheckGuest { // Classe che contiene i metodi di verifica degli invitati.
    public static boolean containsUsingIf(String[] list, String name) { // Metodo con ciclo FOR per cercare il nome.
        for (String guest : list) { // Scorre ogni elemento della lista.
            if (guest.equalsIgnoreCase(name)) { // Controlla se il nome corrisponde ignorando maiuscole/minuscole.
                return true; // Se il nome è trovato, restituisce true.
            }
        }
        return false; // Se il nome non è nella lista, restituisce false.
    }

       public static boolean containsUsingWhile(String[] list, String name) { // Metodo con ciclo WHILE per cercare il nome.
        int i = 0; // Inizializza un contatore a 0 .
        while (i < list.length) { // Finché il contatore è minore della lunghezza della lista.
            if (list[i].equalsIgnoreCase(name)) { // Confronta l'elemento attuale con il nome.
                return true; // Se trovato, restituisce true.
            }
            i++; // Incrementa il contatore per passare al prossimo elemento.
        }
        return false; // Se il nome non è stato trovato, restituisce false.
    }
}