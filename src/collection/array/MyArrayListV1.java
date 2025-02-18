package src.collection.array;

import java.util.Arrays;

public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    // 기본 배열의 크기는 5
    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    // 파라미터로 지정해서 크기를 변환할 수 있다.
    public MyArrayListV1(int initialCapacity){
        elementData = new Object[initialCapacity];
    }

    public int size() { // 데이터의 개수
        return size;
    }

    public void add(Object e){
        elementData[size] = e;
        size++;
    }

    public Object get(int index){
        return elementData[index];
    }

    public Object set(int index, Object element){
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o){
        for (int i = 0; i < size; i++) {
            if(o.equals(elementData[i])){
                return i;
            }

        }
        return -1;
    }

    public String toString(){
        return Arrays.toString(Arrays.copyOf(elementData,size)) +
                " size="+size+", capacity="+ elementData.length;
    }
}
