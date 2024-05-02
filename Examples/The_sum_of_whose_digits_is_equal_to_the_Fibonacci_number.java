package Examples;

public class The_sum_of_whose_digits_is_equal_to_the_Fibonacci_number {

    public static void main(String[] args) {
        // basamakları toplamı fibonacci sayısı olan 0-99 arasındaki tamsayıları listeleyen program
        System.out.println("Basamakları toplamı Fibonacci sayısı olan 0-99 arası tamsayılar:");
        for (int i = 0; i <= 99; i++) {
            if (isSumOfDigitsFibonacci(i)) {
                System.out.println(i);
            }
        }
    }

    // Bir sayının basamakları toplamının Fibonacci sayısı olup olmadığını kontrol eden fonksiyon
    public static boolean isSumOfDigitsFibonacci(int number) {
        int sumOfDigits = sumOfDigits(number);
        return isFibonacci(sumOfDigits);
    }

    // Bir sayının basamaklarının toplamını hesaplayan fonksiyon
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    // Bir sayının Fibonacci sayısı olup olmadığını kontrol eden fonksiyon
    public static boolean isFibonacci(int number) {
        int prev = 0;
        int curr = 1;

        while (curr < number) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr == number;
    }
    
}
