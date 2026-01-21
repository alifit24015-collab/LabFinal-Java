public class Main {
    public static void main(String[] args) {
        double[] numbers = {5.8, 2.6, 9.0, 3.4, 7.1};

        reverse(numbers);

        for (double num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void reverse(double[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            double temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
