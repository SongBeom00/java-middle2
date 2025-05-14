package collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {

    private int currentIndex = -1;
    private int[] targetArr;

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < targetArr.length - 1; // 마지막 인덱스 확인
    }

    @Override
    public Integer next() {
//        currentIndex++; // 0 -> 1 -> 2
        return targetArr[++currentIndex];
    }
}
