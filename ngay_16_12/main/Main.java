package Minitest.ngay_16_12.main;

import Minitest.ngay_16_12.manager.Manager;
import Minitest.ngay_16_12.manager.ManagerPerson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerPerson managerPerson = new ManagerPerson();
            int choice;
        do {
                System.out.println("Menu:");
                System.out.println("1. Thêm người mới");
                System.out.println("2. Hiển thị tất cả mọi người");
                System.out.println("3. Tìm người theo ID");
                System.out.println("4. Xóa người theo ID");
                System.out.println("5. Chỉnh sửa thông tin qua ID");
                System.out.println("6. Sắp xếp danh sách qua điểm trung bình");
                System.out.println("7. Tổng điểm");
                System.out.println("0. Exit");
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        managerPerson.add();
                        break;
                    case 2:
                        managerPerson.display();
                        break;
                    case 3:
                        System.out.println("Nhập ID: ");
                        int idFind = sc.nextInt();
                        managerPerson.findPerson(idFind);
                        break;
                    case 4:
                        System.out.println("Nhập ID: ");
                        int idDelete = sc.nextInt();
                        managerPerson.deletePerson(idDelete);
                        break;
                    case 5:
                        System.out.println("Nhập ID: ");
                        int idEdit = sc.nextInt();
                        managerPerson.editPersonByID(idEdit);
                        break;
                    case 6:
                        System.out.println("Sắp xếp danh sách theo điểm: ");
                        managerPerson.arrangeListByAveragePoint();
                        break;
                    case 7:
                        System.out.println("Tổng điểm = " + managerPerson.sumOfPoint());
                        break;
                    default:
                        System.out.println("Không có !!!");
                        break;

                }
            } while(choice !=0);
        }
    }
