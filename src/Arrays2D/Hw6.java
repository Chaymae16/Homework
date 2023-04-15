package Arrays2D;
/*Create 2D array of countries: north america countries, south america countries, europe countries, asian countries,
 african countries.
 Then print all values from that array using 2 different loops and calculate how many total countries been stored.
 */
public class Hw6 {
    public static void main(String[] args) {
        String[][]countries={
                {"Canada", "Mexico","The United States Of America"},
                {"brazil","colombia","argentina"},
                {"russia","france","germany"},
                {"Kazakhstan", "Azerbaijan", "Armenia"},
                {"Ghana", "Guinea", "morocco"},
        };
        int sum=0;
        for (String[]row:countries){
            for (String coun:row){
                System.out.print(coun+" ");
            }
        }
        System.out.println();


    }
}
