import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử mảng: ");
        int n = sc.nextInt();
        boolean flag = false;

        int[] arr = new int[n];


        do {
            System.out.println("\n1. Nhập vào các phần tử của mảng");
            System.out.println("2. Hiển thị các giá trị của phần tử trong mảng");
            System.out.println("3. Tính tổng các phần tử trong mảng");
            System.out.println("4. In ra các phần tử có giá trị chẵn trong mảng");
            System.out.println("5. Thoát chương trình");
            System.out.print("\nNhập số: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập phần tử của mảng");
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.print("Mảng của mình: ");
                    for (int j : arr) {
                        System.out.print(j + " ");
                    }
                    break;
                case 3:
                    int total = 0;
                    for (int i : arr) {
                        total += i;
                    }
                    System.out.print("Tổng giá trị của mảng: " + total);
                    break;
                case 4:
                    System.out.print("Các giá trị chẵn của mảng: ");
                    for (int j : arr) {
                        if (j % 2 == 0)
                            System.out.print(j + " ");
                    }
                    boolean check = false;
                    do {
                        System.out.println("\n4.1. Nhập các phần tử mảng");
                        System.out.println("4.2 Hiển thị danh sách");
                        System.out.println("4.3 Tổng giá trị của mảng");
                        System.out.println("4.4 Hiện danh sách số chẵn");
                        System.out.println("4.5 Thoát");
                        System.out.print("\nNhập số: ");
                        int choice2 = sc.nextInt();
                        switch (choice2) {
                            case 1:
                                System.out.println("Nhập phần tử của mảng");
                                for (int i = 0; i < n; i++) {
                                    arr[i] = sc.nextInt();
                                }
                                break;
                            case 2:
                                System.out.print("Mảng của mình: ");
                                for (int j : arr) {
                                    System.out.print(j + " ");
                                }
                                break;
                            case 3:
                                int total2 = 0;
                                for (int i : arr) {
                                    total2 += i;
                                }
                                System.out.print("Tổng giá trị mảng: " + total2);
                                break;
                            case 4:
                                System.out.print("Các giá trị chẵn của mảng: ");
                                for (int j : arr) {
                                    if (j % 2 == 0)
                                        System.out.print(j + " ");
                                }
                                break;
                            case 5:
                                System.out.println("Thoát");
                                check = true;
                                break;
                            default:
                                System.out.println("Nhập không hợp lệ. Vui lòng nhập lại!");

                        }
                    } while (!check);
                    break;
                case 5:
                    System.out.println("Đã thoát chương trình");
                    flag = true;
                    break;
                default:
                    System.out.println("Nhập không hơp lệ. Vui lòng nhập lại!");
            }
        } while (!flag);
    }
}
