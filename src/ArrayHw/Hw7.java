package ArrayHw;
//From an array of integer elements find the largest number.
public class Hw7 {
    public static void main(String[] args) {
        int[]numbers={78,10,200};
        int largest=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>largest) {
                largest = numbers[i];

            }
        }
        System.out.println(largest);
    }
}
