public class SelectionSort {
    public static void main(String[] args) {
        int[] scores = { 87, 98, 23, 15, 45, 67, 43, 24, 54, 76, 88, 99, 50, 55, 35 };

        for (int i = 0; i < scores.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }

        System.out.print("Sorted numbers: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);
            if (i < scores.length - 1) {
                System.out.print(",");
            }
        }
    }
}
