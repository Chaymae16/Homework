package ArrayHw;
//Create an array of names and store all names of your group. Then print your name from that array.
// (use 2 different ways of creating an array).
public class Hw2 {
    public static void main(String[] args) {

        String names[] = {"Chaymae", "Ali", "valad", "halima", "hanane"};
        System.out.println(names[0]);

        System.out.println();
        String []names2=new String[5];
        names2[0]="Chaymae";
        names2[1]="Ali";
        names2[2]="valad";
        names2[3]="halima";
        names2[4]="hanane";
        System.out.println(names2[0]);

    }
}
