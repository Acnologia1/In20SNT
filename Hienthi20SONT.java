package com.company;
import java.util.Scanner;

public class Hienthi20SONT {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int numbers = scanner.nextInt();
        int count = 0;
        //count để đếm xem số lượng số nguyên tố cần in ra đã bằng numbers hay chưa
        int N =2;
        while(count <numbers)
        {
            /*
            Kiểm tra xem N có phải là số nguyên tố không.
            Nếu N là số nguyên tố thì in ra giá trị của N và tăng giá trị của count lên 1
            Giá trị của N tăng lên 1 để kiểm tra số tiếp theo
            */

            if(isPrime(N) == true){
                System.out.println(N);

                count++;
            }
            N++;
        }
    }

    //HAM KIEM TRA SO NGUYEN TO
    private static boolean isPrime(int x) {
        boolean check = true;

        if (x < 2) {
            check = false;

        } else {
            int i  =2;

            while (i <x/2)
            {
                if(x %i == 0){
                    check = false;
                    break;
                }
                i++;
            }

        }
        return check;
    }
}
