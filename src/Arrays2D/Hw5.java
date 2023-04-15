package Arrays2D;
/*Create a 2D array or integer type where you will
 store odd and even numbers in 3 rows and 4 columns.
  Develop a program which will identify/print the even numbers only.
 */
public class Hw5 {
    public static void main(String[] args) {
        int[][]numbers={
                {4,20,10,60},
                {10,55,20,3},
                {1,15,7,18},
        };
        for (int[]row:numbers){
            for (int number:row){
                if (number%2==0){
                    System.out.print(number+" ");
                }
            }
        }
    }
}
