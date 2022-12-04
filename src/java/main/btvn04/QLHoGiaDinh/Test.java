package btvn04.QLHoGiaDinh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Nhap thong tin
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so ho gia dinh: ");
        int N = sc.nextInt();

        // Khoi tao khu pho
        KhuPho nguyenChanh = new KhuPho("Nguyen Chanh");

        // Xu ly nghiep vu
        for (int i = 1; i <= N; i++) {
            // Init People for each family
            List<Person> persons = new ArrayList<>();
            for (int j = 1; j <= 10; j++) {
                String personName = String.format("Per_%s_%s", j, i);
                int age = j;
                String jobTitle = String.format("Job_%s_%s", j, i);
                long identity = System.currentTimeMillis();
                persons.add(new Person(personName, age, jobTitle, identity));
            }

            // Create a family
            String address = "Add_00" + i;
            int homeNumber = i;
            Family family = new Family(address, homeNumber, persons);

            // Add to khu pho
            nguyenChanh.addFamily(family);
        }


        System.out.println("Danh sach cac ho: ");
        nguyenChanh.getDanhSachKhuPho().forEach(f -> System.out.println(f.toString()));
    }
}
