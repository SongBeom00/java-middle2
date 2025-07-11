package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {

    public static void main(String[] args) {

        // 불변 리스트 생성
        List<Integer> list = List.of(1, 2, 3, 4);


        // 가변 리스트
        List<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(5);
        System.out.println("mutableList = " + mutableList);
        System.out.println("mutableList.getClass() = " + mutableList.getClass());

        // 불변 리스트 
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);

        // java.lang.UnsupportedOperationException 예외 발생!
        unmodifiableList.add(5);


    }

}
