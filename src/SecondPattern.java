/*
 *      *
 *     ***
 *    *****
 *   *******
 * 
 * draw grid round the pattern.
 * n=4...
 * not only star but also space.space after star(right side space not considered)
 * first space followed by stars.
 * first row->1 star, spaces->n-1.
 * second row -> 3 star(+2), spaces->n-2
 *
*/

public class SecondPattern {
    public static void main(String[] args) {
        int n = 4;
        int trow = n;
        int spaces = n - 1;
        int stars = 1;// initial number of stars and spaces
        for (int row = 1; row <= trow; row++) {
            // current row
            // spaces
            for (int csp = 1; csp <= spaces; csp++) {
                System.out.print(" ");
            }
            // stars
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }
            // prep for next row
            System.out.println();
            --spaces;
            stars = stars + 2;
        }
    }
}
