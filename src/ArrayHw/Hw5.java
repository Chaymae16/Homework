package ArrayHw;
//Create an array of animals and store 5 elements into it.
// Using 2 different loops print all elements from the array.
public class Hw5 {
    public static void main(String[] args) {
        String[]animals={"Elephant", "Dog" ,"Buffalo", "Lion", "Cat" };
        for (int i = 0; i <animals.length ; i++) {
            System.out.println(animals[i]);

        }
        System.out.println();
        int i=0;
        while (i< animals.length){
            System.out.println(animals[i]);
            i++;
        }
    }
}
