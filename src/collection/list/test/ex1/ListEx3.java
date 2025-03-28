package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        Scanner sc = new Scanner(System.in);
        int total = 0;
        List<Integer> numList = new ArrayList<>();
        while (true){
            int i = sc.nextInt();
            if (i ==0){
                break;
            }
            numList.add(i);
        }
        for (int i = 0; i < numList.size(); i++) {
            total+= numList.get(i);
            System.out.print(numList.get(i));
            if (i < numList.size()-1){
                System.out.print(", ");
            }

        }
        System.out.println();
        System.out.println("입력한 정수의 합계 : "+ total);
        System.out.println("입력한 정수의 평균 : "+ (double) total/numList.size());
    }




}
