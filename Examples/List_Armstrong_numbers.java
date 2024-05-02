package Examples;

public class List_Armstrong_numbers {

    public static void main(String[] args) {
        // 100-999 arasındaki Armstong sayılarını listeleyen program
        System.out.println("Armstrong sayıları (100-999):");
        for (int number = 100; number <= 999; number++) {
            if (isArmstrong(number)) {
                System.out.println(number);
            }
        }
    }

    // Bir sayının Armstrong sayısı olup olmadığını kontrol eden fonksiyon
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }

        return sum == originalNumber;
    }

}
