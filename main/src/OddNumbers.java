public class OddNumbers {
    public static void main(String[] args) {
        int[] randomNumbers = { 212, 355, 55, 33, 79, 91, 40, 83, 344, 20 };
        int count = countOdd(randomNumbers);
        System.out.println("Number of odd numbers: " + count);
    }

    public static int countOdd(int[] anArray) {
        int count = 0;
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
