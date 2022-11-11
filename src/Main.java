public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 9.1.1");

        int[] numbers = new int[]{1, 2, 3};
        for (int i = 0; i <= 2; i++)
            System.out.print(numbers[i] + ", ");

        System.out.println();
        System.out.println("Задание 9.1.2.");

        double[] fraction = {1.57, 7.654, 9.986};
        for (int i = 0; i <= 2; i++)
            System.out.print(fraction[i] + ", ");

        System.out.println();

        System.out.println("Задание 9.1.3.");
        double[] fruits = new double[]{3.0, 2.5, 5.2, 3.3};
        for (double fruit : fruits) System.out.print(fruit + ", ");

        System.out.println();

        System.out.println("Задание 9.3.1");
        int[] numbers3 = new int[]{1, 2, 3};
        for (int i = 2; i >= 0; i--)
            System.out.print(numbers3[i] + ", ");

        System.out.println();
        System.out.println("Задание 9.3.2.");

        double[] fraction3 = {1.57, 7.654, 9.986};
        for (int i = 2; i >= 0; i--)
            System.out.print(fraction3[i] + ", ");

        System.out.println();

        System.out.println("Задание 9.3.3.");
        double[] fruits3 = new double[]{3.0, 2.5, 5.2, 3.3};
        for (int i = 3; i >= 0; i--)
            System.out.print(fruits3[i] + ", ");

        System.out.println();

        System.out.println("Задание 9.4 ");

        int[] numbersPositive = {1, 2, 3, 4, 5};
        for (int j : numbersPositive) {
            if (j % 2 == 0) {
                int total = j + 1;
                {
                    System.out.print(total + ", ");
                }
            }
        }
        System.out.println();
    }
}