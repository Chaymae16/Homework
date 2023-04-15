package Arrays2D;
//Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
// Print the sum of all numbers.
public class Hw4 {
    public static void main(String[] args) {
int [][]numbers={
        {1,2,3},
        {4,5,6},
        {7,8,9},
};
int sum=0;
for (int[]row:numbers){
    for (int num:row){
        sum+=num;
    }
}
        System.out.println(sum);
    }
}
