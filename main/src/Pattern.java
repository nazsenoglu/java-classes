public class Pattern {
    public static void main(String[] args) {
        printPattern();
    }

    public static void printPattern() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
