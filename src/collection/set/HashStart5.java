package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    
    static final int CAPACITY = 11;

    public static void main(String[] args) {
        
        
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY]; //배열 생성
        //초기 상태 배열 요소는 전부 null 이다.
        System.out.println("buckets = " + Arrays.toString(buckets));

        //배열 안에 각각 LinkedList 를 생성합니다.
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>(); //링크드 리스트 생성
        }

        System.out.println("buckets = " + Arrays.toString(buckets));
        add(buckets,1);
        add(buckets,2);
        add(buckets,5);
        add(buckets,8);
        add(buckets,14);
        add(buckets,99);
        add(buckets,9); // 중복 -> 해시 충돌
        System.out.println("buckets = " + Arrays.toString(buckets));

        //검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("bucket.contains(" + searchValue + ") = " + contains);


    }

    private static void add(LinkedList<Integer>[] buckets, int value){
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        if (!bucket.contains(value)){ // O(n) 중복 체크
            bucket.add(value);
        }

    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue){
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        return bucket.contains(searchValue); // O(n)
    }
    

    static int hashIndex(int value){
        return value % CAPACITY;
    }
    
    
}
