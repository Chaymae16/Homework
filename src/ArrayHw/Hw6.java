package ArrayHw;
//Create an array on integers and calculate the sum of all elements in an array
//
public class Hw6 {
    public static void main(String[] args) {
    int[]num={10,20,30,40,50,};
    int sum=0;
        for (int i = 0; i < num.length ; i++) {
            sum=sum+num[i];

        }
        System.out.println(sum);
    }
}
