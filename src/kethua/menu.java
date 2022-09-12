package kethua;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "=== Menu ===\n" +
                "1. Hiển thị mảng\n" +
                "2. Thêm số vào mảng\n" +
                "3. Sửa phần tử\n" +
                "4. Xóa số khỏi mảng\n" +
                "5. Thoát";
        int[] arr = new int[] {0,1,2,3,4};
        while (true) {
            System.out.println(str);
            int chon;
            System.out.println("Nhap chon = ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    for (int i=0; i< arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    int[] newArr = new int[arr.length + 1];
                    //gán các phần tử của mảng cũ sang mảng mới
                    for (int i=0; i<arr.length; i++) {
                        newArr[i] = arr[i];
                    }
                    System.out.println("Nhập số cần thêm = ");
                    int soCanThem = sc.nextInt();
                    newArr[newArr.length - 1] = soCanThem;
                    arr = newArr;
                    break;
                case 3:
                    System.out.println("Nhập vị trí cần sửa index = ");
                    int index = sc.nextInt();
                    System.out.println("Nhập giá trị muốn sửa thành value = ");
                    int value = sc.nextInt();
                    arr[index] = value;
                    break;
                case 4:
                    System.out.println("Nhập vị trí cần xóa index = ");
                    int indexCase4 = sc.nextInt();
                    int vitri = 0;
                    int[] newArrCase4 = new int[arr.length - 1];
                    for (int i=0; i<arr.length; i++) {
                        if (i==indexCase4) {
                            continue;
                        }
                        else {
                            newArrCase4[vitri] = arr[i];
                            vitri ++;
                        }
                    }
                    arr = newArrCase4;
                    break;
            }
        }
    }
}
