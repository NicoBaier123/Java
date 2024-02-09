public class Rekursiv {
    public static void main(String[] args) {
        char [] feld = {'a','b','c'};
        char b = 'a';
        boolean result = member (feld,b);
        System.out.println(result);

    }

    public static boolean member(char[] feld, char b) {
        if (feld==null||feld.length==0)
            throw new IllegalArgumentException("Array ist null oder leer");

        return pruefung(feld, feld.length-1, b);
    }

    private static boolean pruefung (char[] feld, int  lastpos, char b) {
        if (lastpos<0) return false;
        return (b==feld[lastpos]||pruefung(feld, lastpos-1,b));
    }


}