package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    // 기본 배열의 크기는 5
    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    // 파라미터로 지정해서 크기를 변환할 수 있다.
    public MyArrayListV2(int initialCapacity){
        elementData = new Object[initialCapacity];
    }

    public int size() { // 데이터의 개수
        return size;
    }

    public void add(Object e){
        //코드 추가
        if (size == elementData.length){
            grow();
        }
        elementData[size] = e;
        size++;
    }

    //코드 추가
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        //배열을 새로 만들고 기존의 배열을 새로운 배열에 복사
//        Object[] newArr = new Object[newCapacity];
//        for (int i = 0; i < elementData.length; i++) {
//            newArr[i] = elementData[i];
//        }

        //기존의 배열을 2배로 늘린다. -> 참조값이 바뀐다.
        elementData = Arrays.copyOf(elementData, newCapacity);


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
