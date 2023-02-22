package ss3_array_method.bai_3;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int result = addArray2D(arr);
        System.out.println("Trung bình cộng các phần tử chẵn trong mảng 2 chiều là: " + result);
    }

    public static int addArray2D(int[][] array) {
        int sum = 0;
        int average;
        int count = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt % 2 == 0) {
                    sum = sum + anInt;
                    count = count + 1;
                }
            }
        }
        average = sum / count;
        return average;
    }

}
