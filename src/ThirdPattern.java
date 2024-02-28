/*
 *    *
 *    **
 *    ***
 *    ****
 *    ***
 *    **
 *    *
 * n=7
 * 
 * 7 rows
 * no spaces before.
 * first half..+1 star
 * second half..-1 star
 * 
*/

public class ThirdPattern {
    public static void main(String[] args) {
        int n = 7;
        int trow = n;
        int stars = 1;
        for (int row = 1; row <= trow; row++) {
            // current *
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
                // System.out.print(cst);
            }
            // prep for next
            System.out.println();
            if (row <= trow / 2) {// check row number is less than the avg of total rows
                stars++;
            } else {
                stars--;
            }
        }

    }
}
