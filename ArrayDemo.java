import java.util.Arrays;

public class ArrayDemo {

    public static void simulation(int[] g) {
        for (int i=0;i<g.length ;i++ )
            g[i] = (int) (Math.random()*71+120);
        // Zufall zwischen 120 und 190
    }

    public static void output(int[] g){
        for (int member: g ) {
            System.out.println(member);
        }
    }

    public static int minimum(int[] g) {
        int m=g[0];
        for (int member : g)
            if (member < m) m=member;
        return m;
    }

    public static int maximum(int[] g) {
        int m=g[0];
        for (int member : g )
            if (member > m) m=member;
        return m;
    }

    public static int countBelow(int[] g, int bound) {
        int count=0;
        for (int member : g )
            if (member < bound) count++;
        return count;
    }

    public static boolean contains(int[] g, int mem) {
        boolean found = false;
        //  mit break  !!
        for (int member : g ){
            if (member == mem) {
                found=true;
                break;
            }
        }

    /*
    // ohne break !!
    for (int i=0; (!found) && (i<g.length); i++ ) {
        found = mem==g[i];
    } // end of for
     */
        return found;
    }

    public static int[] sortedCopy(int[] g) {
        int[] copied = new int[g.length];
        System.arraycopy(g,0,copied,0,g.length);
        Arrays.sort(copied);  //  Stelle wo import util Arrays  nötig ist
        return copied;
    }

    public static double avg(int[] g) {
        double sum=0; // double, weil sonst ganzzahlige Division
        for (int member : g )
            sum +=member;
        return sum/g.length;
    }

    public static void sortedOutput(int[] g) {
        int[] copied = new int[g.length];
        System.arraycopy(g,0,copied,0,g.length);
        Arrays.sort(copied);  //  Stelle wo import util Arrays  nötig ist
        System.out.println();
        System.out.println("Sorted");
        output(copied);
        System.out.println();
    }

    public static int median(int[] g) {
        int[] copied = new int[g.length];
        System.arraycopy(g,0,copied,0,g.length);
        Arrays.sort(copied);  // Stelle wo import util Arrays  nötig ist
        return copied[g.length/2];
    }

    public static void main (String[]argv) {
        int[] sim = new int[9];
        simulation(sim);
        output(sim);

        System.out.println("\nDas Maximum ist " + maximum(sim));
        System.out.println("\nDas Minimum ist " + minimum(sim));
        int value = 160;
        System.out.printf("%nDie Anzahl der Elemente unter %d ist %d%n", value, countBelow(sim,value));
        if (contains(sim, value))
            System.out.println("\nDer Wert " + value + " ist vorhanden\n");
        else
            System.out.printf("%nDer Wert %d ist nicht vorhanden%n", value);
        System.out.printf("%nDer Mittelwert ist %.1f%n", avg(sim));
        System.out.println("\nDer Median ist " + median(sim));

        System.out.println("\nSortierte Ausgabe");
        output(sortedCopy(sim));

    /*
    // Alternative für die sortierte Ausgabe:
    // mit expliziter neuer Variablen:

    int[] sortCpy;
    sortCpy=sortedCopy(sim);
    output(sortCpy);

    // oder mit  Druck innerhalb der Methode
    sortedOutput(sim);
    */
    }

}
