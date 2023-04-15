package Arrays2D;
//Using 2D array create a grocery list.
//Inside you should have an array of veggies, fruits, dairy and sweets.
// Retrieve all values from that array using 2 different loops
public class Hw3 {
    public static void main(String[] args) {
        String[][] grocery={
                {"tomato","carrot","potatoes"},
                {"banana","apple","strawberries"},
                {"milk","cream cheese","cheese"},
                {"cake","ice cream","candy"},
        };
        for (int i = 0; i < grocery.length; i++) {
            for (int j = 0; j < grocery[i].length; j++) {
                System.out.print(grocery[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(String[]arr:grocery){
            for (String list:arr){
                System.out.print(list+" ");
            }
            System.out.println();

            }
        }
    }

