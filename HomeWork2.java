
# HomeWork
public class HomeWork2 {

    static void task1() {
        int[] a = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("BEFORE: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            if (a[i] == 0) a[i] = 1;
            else a[i] = 0;
        }
        System.out.print("\nAFTER:  ");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        task1();
    }

    static void task2() {
        int[] arr = new int[8];
        for (int i = 0, j = 0; i < arr.length; i++, j += 3) {
            arr[i] = j;
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        task2();
    }


        static void task3(){
        int[] a = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < a.length; i++) {
                if( a[i] < 6) {
                    a[i] *=2;
                }
                System.out.print(a[i] + " ");
            }
        }
    public static void main(String[] args) {
        task3();
    }


    static void task4() {
        int length = 5;
        int[][] arr = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if ((i == j) || (i == length - 1 - j)) {
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        task4();
    }

    static void task5() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1, -9};
        int min = arr[0];
        int max = arr[0];
        System.out.print(" ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            min = (min < arr[i]) ? min : arr[i];
            max = (max > arr[i]) ? max : arr[i];
        }
        System.out.println("\nМинимальный элемент: " + min + "\nМаксимальный элемент: " + max);
    }
    public static void main(String[] args) {
        task5();
    }




        static boolean task6(int[] arr) {
            int sum = 0;
            int leftSum = 0;
            for (int i : arr) {
                sum += i;
            }
            if (sum % 2 != 0) {
                return false;
            }
            int pos = 0;
            for (int i : arr) {
                leftSum += i;
                pos++;
                if (2 * leftSum == sum) {
                    for (int j = 0; j < pos; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                    for (int j = pos; j < arr.length; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                    return true;
                }
            }
            return false;
        }


        public static void main(String[] args) {
            task6(new int[] {2,5,8,5,5,5});
        }
}
