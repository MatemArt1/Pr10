public class Like10 {
    public class HowManyPagesInABook {

        public static int amountOfPages(int summary) {
            int n = 0;
            while (summary > 0)
                summary -= String.valueOf(++n).length();
            return n;
        }

    }
}
