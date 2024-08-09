import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số dòng: ");
        int n = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int m = sc.nextInt();

        boolean flag = false;

        int[][] arr = new int[n][m];
        do {
            System.out.println("\n==========Menu==========");
            System.out.println("1. Nhập vào các phần tử của mảng");
            System.out.println("2. Hiển thị các giá trị của phần tử trong mảng");
            System.out.println("3. Tính tổng các phần tử trong mảng");
            System.out.println("4. In ra các phần tử có giá trị chẵn trong mảng");
            System.out.println("5. Hiển thị các phần tử mảng dưới dạng ma trận");
            System.out.println("6. Tính tổng đường chéo chính");
            System.out.println("7. Tính tổng đường chéo phụ");
            System.out.println("8. In ra đường biên");
            System.out.println("9. Thoát chương trình");
            System.out.print("\nNhập lựa chọn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập giá trị phần tử: ");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.print("a[" + i + "][" + j + "]: ");
                            arr[i][j] = sc.nextInt();
                        }
                    }
                    break;
                case 2:
                    System.out.print("Mảng của bạn: ");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                    }
                    break;
                case 3:
                    int total = 0;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            total += arr[i][j];
                        }
                    }
                    System.out.print("Tổng giá trị mảng: " + total + "\n");
                    break;
                case 4:
                    System.out.print("Các phần tử chẵn: ");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (arr[i][j] % 2 == 0) {
                                System.out.print(arr[i][j] + " ");
                            }
                        }
                    }

                    boolean check = false;
                    do {
                        System.out.println("\n4.1. Nhập các phần tử");
                        System.out.println("4.2. Hiển thị danh sách");
                        System.out.println("4.3. Tổng các giá trị của mảng");
                        System.out.println("4.4. Hiển thị các giá trị chẵn");
                        System.out.println("4.5. Hiển thị phần tử theo dạng ma trận");
                        System.out.println("4.6. Thoát");

                        System.out.print("\nNhập lựa chọn: ");
                        int choice2 = sc.nextInt();
                        switch (choice2) {
                            case 1:
                                System.out.println("Nhập giá trị phần tử: ");
                                for (int i = 0; i < n; i++) {
                                    for (int j = 0; j < m; j++) {
                                        System.out.print("a[" + i + "][" + j + "]: ");
                                        arr[i][j] = sc.nextInt();
                                    }
                                }
                                break;
                            case 2:
                                System.out.print("Mảng của bạn: ");
                                for (int i = 0; i < n; i++) {
                                    for (int j = 0; j < m; j++) {
                                        System.out.print(arr[i][j] + " ");
                                    }
                                }
                                break;
                            case 3:
                                int total2 = 0;
                                for (int i = 0; i < n; i++) {
                                    for (int j = 0; j < m; j++) {
                                        total2 += arr[i][j];
                                    }
                                }
                                System.out.print("Tổng giá trị mảng: " + total2 + "\n");
                                break;
                            case 4:
                                System.out.print("Các phần tử chẵn: ");
                                for (int i = 0; i < n; i++) {
                                    for (int j = 0; j < m; j++) {
                                        if (arr[i][j] % 2 == 0) {
                                            System.out.print(arr[i][j] + " ");
                                        }
                                    }
                                }
                                break;
                            case 5:
                                System.out.println("Mảng của bạn dưới dạng ma trận: ");
                                for (int i = 0; i < n; i++) {
                                    for (int j = 0; j < m; j++) {
                                        System.out.print(arr[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 6:
                                check = true;
                                System.out.println("Thoát");
                                break;
                            default:
                                System.out.println("Nhập không hợp lệ. Vui lòng nhập lại!");
                        }
                    } while (!check);
                    break;
                case 5:
                    System.out.println("Mảng của bạn dưới dạng ma trận: ");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += arr[i][i];
                    }
                    System.out.print("Tổng giá trị đường chéo chính: " + sum + "\n");

                    break;
                case 7:
                    if (n == m) {
                        int sum2 = 0;
                        for (int i = 0; i < n; i++) {
                            sum2 += arr[i][n - 1 - i];
                        }
                        System.out.print("Tổng giá trị đường chéo phụ: " + sum2 + "\n");
                    } else {
                        System.out.println("Ma trận không hợp lệ? Phải là ma trận vuông");
                    }
                    break;
                case 8:
                    System.out.println("Đây là đường biên ma trận của bạn: ");
//                        Dòng đầu tiên
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
                                System.out.print(arr[i][j] + " ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 9:
                    flag = true;
                    System.out.println("Đã thoát chương trình");
                    break;
                default:
                    System.out.println("Nhập không hợp lệ. Vui lòng nhập lại!");
            }
        } while (!flag);


    }
}
