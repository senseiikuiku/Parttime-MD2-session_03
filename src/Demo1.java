import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
//        Khai báo mảng 1 chiều
//        Cần khai báo mảng 1 chiều chứa 5 phần tử có kiểu dữ liệu là int
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int n = sc.nextInt();
        int[] array =new int[n];
//        Khai báo mảng 1 chiều có 5 phần tử kiểu int gán giá trị cho 5 phần tử

        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
