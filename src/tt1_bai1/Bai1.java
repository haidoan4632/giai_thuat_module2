package tt1_bai1;

public class Bai1 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 8, 11};
        int result = arr(arr);
        if (result == 1) {
            System.out.println("Mảng tăng dần đều");
        } else {
            System.out.println("Mảng k tăng dần đều");
        }
    }

    public static int arr(int[] array) {
        int ketqua = 0;
        int hieu = array[1] - array[0];
        for (int i = 0; i < 4; i++) {
            if (array[i + 1] - array[i] == hieu) {
                ketqua = 1;
            } else {
                ketqua = -1;
            }
        }
        return ketqua;
    }
}
