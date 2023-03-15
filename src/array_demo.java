import java.util.Arrays;

public class array_demo {

    public static void main(String[] args) {

        /* ------------------------------- 1 dim arrays --------------------------------------------------------------*/


        // array of 5 places
        int[] a1 = new int[5];
        int a1_size = a1.length; // which is 5 here

        // fill it with numbers from 1 to 5
        for (int i = 0; i < a1_size; i++) {
            // a1[i] indicates the place where we want to add the number
            a1[i] = i + 1;
        }

        // displaying all the values in the array
        for (int element : a1) {

            System.out.print(element + " ");
        }

        System.out.print("\nor the other easier way to print an array : \n" + Arrays.toString(a1));
        System.out.println("\n-----------------------------------------------------------\n");


        /* ------------------------------- ex 1 ----------------------------------------------------------------------*/
        try {
            // what is wrong with the following code :
            for (int i = 0; i <= a1_size; i++) {

                a1[i] = 0;

            }
        } catch (Exception e) {
            System.out.println("Something went wrong in ex1.");
        }

        /* ------------------------------- ex 2 ----------------------------------------------------------------------*/
        try {
            // what is wrong with the following code :
            for (int i = 1; i < a1_size; i--) {

                a1[i] = 1;

            }
        } catch (Exception e) {
            System.out.println("Something went wrong in ex2.");
        }

        System.out.println("\n-----------------------------------------------------------\n");
        /* ------------------------------- 2 dim arrays ------------------------------------------------------------------*/

        int[][] a2 = new int[5][6];
        int a2_size_x = a2.length;
        int a2_size_y = a2[0].length;

        // only gets the first dimension
        System.out.println("dim array : " + a2_size_x + "," + a2_size_y);

        // fill the 2dim array
        for (int i = 0; i < a2_size_x; i++) {
            for (int j = 0; j < a2_size_y; j++) {
                // a1[i] indicates the place where we want to add the number
                a2[i][j] = i + j;
            }
        }

        // print the 2dim array
        System.out.print("[ \n"); // ln
        for (int i = 0; i < 5; i++) {

            System.out.print("[");

            for (int j = 0; j < 6; j++) {
                // a1[i] indicates the place where we want to add the number
                System.out.print(a2[i][j] + " ");
            }
            System.out.print("]\n"); // ln
        }
        System.out.print("]");

    }
}
