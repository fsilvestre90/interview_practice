import java.util.Arrays;

public class Problem2 {
    public static int[] getProductsOfAllIntsExceptAtIndex(int[] intArr) {
        // create new arr of same length
        int[] productsOfAllIntsExceptAtIndex = new int[intArr.length]; 

        int productTracker = 1; // non-zero start :)
        // track the product BEFORE index
        for (int i = 0; i < intArr.length; i++) {
            productsOfAllIntsExceptAtIndex[i] = productTracker;
            productTracker *= intArr[i];
        }

        productTracker = 1; // non-zero start :)
        // crawl from end of array
        for (int i = intArr.length - 1; i >= 0; i--) {
            productsOfAllIntsExceptAtIndex[i] *= productTracker;
            productTracker *= intArr[i];
        }
        return productsOfAllIntsExceptAtIndex;
    }
    
    public static void main(String[] args) {
        int[] integersArr = new int[]{1, 2, 6, 5, 9};
        System.out.println(Arrays.toString(getProductsOfAllIntsExceptAtIndex(integersArr)));
    }
}