/*
 *    *
 *   ***
 *  *****
 *   ***
 *    *
 * n=5;
 * first row.. one star..row_number<=total/2
 * second row...+2 star..after half of that..-2 star  ..then.. 
 * 
 * initial star and space is must
*/

public class ForthPattern {
    public static void main(String[] args) {
        int n = 5;
        int trow = n;
        int space = trow / 2;// initial space
        int star = 1;// initial star
        for (int row = 1; row <= trow; row++) {
            // current row space
            for (int csp = 1; csp <= space; csp++) {
                System.out.print(" ");
            }
            // current row star
            for (int cst = 1; cst <= star; cst++) {
                System.out.print("*");
            }
            // prepare for next row
            System.out.println();
            if (row <= trow / 2) {// trow/2 always constant..compare row number with that
                space -= 1;
                star += 2;
            } else {
                space += 1;
                star -= 2;
            }

        }

    }
}
