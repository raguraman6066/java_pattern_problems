/*
 * draw grid over pattern
 * ex: * (row1)
 *     ** (row2)
 *     ***
 * n=3..number of rows are 3.
 * first row 1 star, second number 2 stars...so,
 * .number of stars in row is equal to row number
 * 
*/

public class FirstPattern {
    public static void main(String[] args) throws Exception {
        int n = 4;
        int trow = n;
        for (int row = 1; row <= trow; row++) {
            // work for current row
            for (int cst = 1; cst <= row; cst++) {
                System.out.print("*");
            }
            // prepare for next row
            System.out.println();
        }

    }
}
