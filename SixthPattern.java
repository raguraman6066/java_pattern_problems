/*
 * butterfly shape pattern
 * n=7 
 *   *     *
 *   **   **
 *   *** ***
 *   *******
 *   *** ***
 *   **   **
 *   *     *
*/
public class SixthPattern {
    public static void main(String[] args) {
        int n = 7;
        int trow = n;
        int stars = 1;
        int spaces = n - 2;
        for (int row = 1; row <= trow; row++) {
            // current row
            // 1.star
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }
            // 2.space
            for (int csp = 1; csp <= spaces; csp++) {
                System.out.print(" ");
            }
            // 3.star
            int sstar = stars;
            if (row == trow / 2 + 1) {
                sstar = stars - 1;
            }
            for (int cst = 1; cst <= sstar; cst++) {
                System.out.print("*");
            }

            // prep for next row
            System.out.println();
            if (row <= trow / 2) {
                spaces -= 2;
                stars++;
            } else {
                spaces += 2;
                stars--;
            }
        }

    }
}
