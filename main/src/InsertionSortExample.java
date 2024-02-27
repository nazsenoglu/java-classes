public class InsertionSortExample {
    public static void main(String[] args) {
        int[] someNumbers = { 9, 6, 7, 4, 5, 1, 3, 2, 8 };

        for (int i = 1; i < someNumbers.length; i++) {
            int key = someNumbers[i];
            int j = i - 1;

            while (j >= 0 && someNumbers[j] > key) {
                someNumbers[j + 1] = someNumbers[j];
                j = j - 1;
            }
            someNumbers[j + 1] = key;
        }

        System.out.print("After sorting: {");
        for (int i = 0; i < someNumbers.length; i++) {
            System.out.print(someNumbers[i]);
            if (i < someNumbers.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
}
