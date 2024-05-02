package Examples2;

public class ovarloading_örneği {

    public static void main(String[] args) {//
        int[] a = randomarray(10, 100);
        int[][] b = randomarray2(10, 100);
        arrayprint(a);
        arrayprint(b);

    }

    static int[] randomarray(int N, int ub) {
        int a[] = new int[N];
        for (int i = 0; i < N; i++) {                   //a dizisini oluşturma tek boyutlu !!!
            a[i] = (int) (Math.random() * 100);
        }
        return a;
    }

    static int[][] randomarray2(int N, int ub) {
        int b[][] = new int[N][N];
        for (int i = 0; i < N; i++) {                               //b dizisini oluşturma çift boyutlu!!!
            for (int j = 0; j < N; j++) {
                b[i][j] = (int) (Math.random() * 100);
            }

        }
        return b;
    }

    static void arrayprint(int[] array) {
        System.out.println("tek boyutlu dizi");
        for (int i = 0; i < array.length; i++) {                    //a dizisini yazdırma 
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }

    static void arrayprint(int[][] array) {
        System.out.println("iki boyutlu dizi");
        for (int i = 0; i < array.length; i++) {                            //b dizisini yazdırma 
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + ",");
            }

        }

    }

}
