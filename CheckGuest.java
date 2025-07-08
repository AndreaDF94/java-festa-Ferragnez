public class CheckGuest {

       // Metodo per verificare con if
    public static boolean containsUsingIf(String[] list, String name) {
        for (String guest : list) {
            if (guest.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

        // Metodo per verificare con while
    public static boolean containsUsingWhile(String[] list, String name) {
        int i = 0;
        while (i < list.length) {
            if (list[i].equalsIgnoreCase(name)) {
                return true;
            }
            i++;
        }
        return false;
    }
}


