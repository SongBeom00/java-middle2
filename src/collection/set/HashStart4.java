package collection.set;

import java.util.Arrays;

/**
 * 해시 충돌 발생!
 * 지금까지의 해시 인덱스는 저장할 위치가 충돌할 수 있다는 한계가 있다.
 * 예를 들어 1과 11의 값을 저장하려면 둘다 나머지 연산으로 10으로 나누면 같은 값 1 된다. 둘다 같은 해시 인덱스가 나온다
 */

public class HashStart4 {

    static final int CAPACITY = 10 ;

    public static void main(String[] args) {
        //{1, 2, 5, 8, 14, 99}

        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(2) = " + hashIndex(2));
        System.out.println("hashIndex(5) = " + hashIndex(5));
        System.out.println("hashIndex(8) = " + hashIndex(8));
        System.out.println("hashIndex(14) = " + hashIndex(14));
        System.out.println("hashIndex(99) = " + hashIndex(99));

        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);
        System.out.println("inputArray = " + Arrays.toString(inputArray));


        //검색 -> 해시 인덱스를 사용해서 O(1)의 성능으로 데이터를 저장하고, O(1)의 성능으로 데이터를 조회할 수 있게 되었다.
        int searchValue = 14;
        int hashIndex = hashIndex(searchValue);
        System.out.println("searchValue hashIndex = " + hashIndex);
        Integer result = inputArray[hashIndex]; //O(1)
        System.out.println("result = " + result);


    }

    private static void add(Integer[] inputArray, int value) {
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }

    static int hashIndex(int value){
        return value % CAPACITY;
    }





}
