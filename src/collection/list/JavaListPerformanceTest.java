package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {

    //자바에서는 고속복사를 사용한다.

    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("==ArrayList 추가==");
        addFirst(new ArrayList<>(),size);
        addMid(new ArrayList<>(),size); //찾는데 O(1), 데이터 추가(밀기) O(n)

        ArrayList<Integer> arrayList = new ArrayList<>(); //조회용 데이터로 사용
        addLast(arrayList,size); //찾는데 O(1), 데이터 추가(밀기) O(1)

        int loop = 10000;
        System.out.println("==ArrayList 조회");
        getIndex(arrayList,loop,0);
        getIndex(arrayList,loop,size/2);
        getIndex(arrayList,loop,size-1);

        System.out.println("==ArrayList 검색");
        search(arrayList,loop,0);
        search(arrayList,loop,size/2);
        search(arrayList,loop,size-1);


        System.out.println("==LinkedList 추가==");
        addFirst(new LinkedList<>(),size);
        addMid(new LinkedList<>(),size); //찾는데 O(n), 데이터 추가 O(1)

        LinkedList<Integer> linkedList = new LinkedList<>(); //조회용 데이터로 사용
        addLast(linkedList,size); //찾는데 O(n), 데이터 추가 O(1)

        System.out.println("==LinkedList 조회");
        getIndex(linkedList,loop,0);
        getIndex(linkedList,loop,size/2);
        getIndex(linkedList,loop,size-1);

        System.out.println("==LinkedList 검색");
        search(linkedList,loop,0);
        search(linkedList,loop,size/2);
        search(linkedList,loop,size-1);
    }

    public static void addFirst(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: "+size +", 계산 시간 "+ (endTime-startTime) + "ms");

    }

    public static void addMid(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2,i); //평균 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: "+size +", 계산 시간 "+ (endTime-startTime) + "ms");

    }

    public static void addLast(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i); //리스트는 항상 마지막에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: "+size +", 계산 시간 "+ (endTime-startTime) + "ms");

    }

    public static void getIndex(List<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < loop; i++) {
            list.get(index);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간 : " + (endTime-startTime) + "ms");
    }

    public static void search(List<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("index: " + findValue + ", 반복: " + loop + ", 계산 시간 : " + (endTime-startTime) + "ms");
    }


}
