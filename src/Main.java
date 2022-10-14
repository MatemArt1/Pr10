public class Main {
    /*
    Every book has n pages with page numbers 1 to n. The summary is made by adding up the number of digits of all page numbers.

Task: Given the summary, find the number of pages n the book has.

Example
If the input is summary=25, then the output must be n=17: The numbers 1 to 17 have 25 digits in total: 1234567891011121314151617.

Be aware that you'll get enormous books having up to 100.000 pages.

All inputs will be valid.

Here's the opposite kata, which is more complex (Paginating a huge book)


     */
    public class HowManyPagesInABook {

        public static int amountOfPages(int summary) {
            int sum = 0, i = 1;
            int[] a ={9, 90, 900, 9000, 90000, 900000, 9000000};
            int[] b ={9, 180, 2700, 36000, 450000, 5400000, 63000000};

            while(summary > b[i - 1]) {
                summary -= b[i - 1];
                sum += a[i - 1];
                i++;
            }

            return summary / i + sum;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}