public class MiddleNumberFinder {
    public static void main(String[] args) {
        int[] numbers = { 87, 98, 23, 15, 45, 67, 43, 24, 54, 76, 88, 99, 50, 55, 35 };

        for (int i = 0; i < numbers.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < numbers.length; j++)
                if (numbers[j] < numbers[index])
                    index = j;

            int smallerNumber = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = smallerNumber;
        }

        System.out.print("Sorted numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        System.out.println("The number in the middle is : " + numbers[numbers.length / 2]);
    }
}
