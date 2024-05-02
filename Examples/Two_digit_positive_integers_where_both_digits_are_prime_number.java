package Examples;

public class Two_digit_positive_integers_where_both_digits_are_prime_number {

    public static void main(String[] args) {
        // her iki basamağı da asal olan iki basamaklı pozitif tamsayıları listele
        System.out.println("İki basamaklı her iki basamağı da asal olan sayılar:");
        for (int i = 10; i <= 99; i++) {
            if (isPrime(i / 10) && isPrime(i % 10)) {
                System.out.print(i + " ");
            }
        }
    }

    // Bir sayının asal olup olmadığını kontrol eden fonksiyon
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
