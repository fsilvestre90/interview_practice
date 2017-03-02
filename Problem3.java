import java.util.Arrays;
public class Problem3 {
    public static int getHighestProduct(int[] arrayOfInts) {
        int product = 1;
        for (int i = 0; i < arrayOfInts.length; i++) {
            int potential = product * arrayOfInts[i];
            product = Math.max(product, potential);
        }

        return product;
    }

    private int[] lowestTwo() {
        int[] lowestTwo = new int[2];
        
        return lowestTwo;
    }

    private int[] highestTwo() {
        int[] highestTwo = new int[2];

        return highestTwo;
    }
    
    public static void main(String[] args) {
        int[] integersArr = new int[]{4, 2, 6, 5};
        System.out.println(getHighestProduct(integersArr));
    }
}