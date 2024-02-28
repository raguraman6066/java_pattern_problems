/*
 * n=3     ***** (5=2n-1)
 *         ** **
 *         *   *   //3 space
 * 
 * n=4  ******* (2n-1=7)   
 *      *** ***
 *      **   **
 *      *     *   
 * trow =n
 * second row onwards from work for star, space and star
 *       star--   space++   star--
 * 
 *      spaces increate by 2 and stars decrease by 2
 * 
 * 
 *     
*/

public class FifthPattern {
    public static void main(String[] args) {
        int n = 4;
        // first row..
        for (int frow = 1; frow <= 2 * n - 1; frow++) {
            System.out.print("*");
        }
        System.out.println();
        // from second row
        int trow = n - 1;
        int stars = n - 1;
        int spaces = 1;
        for (int row = 1; row <= trow; row++) {// total row
            // current row
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }
            // current space
            for (int csp = 1; csp <= spaces; csp++) {
                System.out.print(" ");
            }
            // current row
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }

            // prep for next row
            System.out.println();
            stars--;
            spaces += 2;

        }

    }
}
