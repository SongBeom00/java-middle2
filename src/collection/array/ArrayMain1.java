package src.collection.array;

import java.util.Arrays;


/** 배열(array)의 특징 -> 참조형
 * 1. 배열과 인덱스
 * 배열에서 자료를 찾을 때 인덱스(index)를 사용하면 매우 빠르게 자료를 찾을 수 있다.
 * 인덱스를 통한 입력, 변경, 조회의 경우 한번의 계산으로 자료의 위치를 찾을 수 있다.
 * 배열은 메모리상에 순서대로 붙어서 존재한다.
 * 배열의 경우 인덱스를 사용하면 한번의 계산으로 매우 효율적으로 자료의 위치를 찾을 수 있다.
 */

public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5]; //5 개의 정수형 배열 생성
        //index 입력 : O(1)
        System.out.println("==index 입력 : O(1) ==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println("arr = " + arr); //배열은 참조 값 출력
        System.out.println("arr = " + Arrays.toString(arr));

        System.out.println("==index 변경 : O(1) ==");
        arr[2] = 10;
        System.out.println("arr = " + Arrays.toString(arr));

        System.out.println("==index 조회 : O(1) ==");
        System.out.println("arr[2] = " + arr[2]);

        System.out.println("==배열 검색 : O(n) ==");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+ i +"] : " + arr[i]);
            if(arr[i] == value){
                System.out.println(value+" 찾음");
                break;
            }
        }


    }



}
