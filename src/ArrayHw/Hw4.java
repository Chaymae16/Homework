package ArrayHw;
//Create an array of cars and store 6 elements into it.
// Using 2 different loops print all values from the array.
public class Hw4 {
    public static void main(String[] args) {
        String[] cars={"Honda","Tesla","Jeep","Range rover","Mercedes","Nissan"};
        for (int i = 0; i < cars.length ; i++) {
            System.out.println(cars[i]);
        }
            System.out.println();
            int i=0;
            while (i< cars.length){
                System.out.println(cars[i]);
                i++;
            }



    }
}
