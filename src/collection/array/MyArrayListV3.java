package src.collection.array;

import java.util.Arrays;

public class MyArrayListV3 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    // 기본 배열의 크기는 5
    public MyArrayListV3() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    // 파라미터로 지정해서 크기를 변환할 수 있다.
    public MyArrayListV3(int initialCapacity){
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
    public void add(int index, Object e){
        if (size == elementData.length){
            grow();
        }
        //데이터 이동
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    //코드 추가, 요소의 마지막부터 index까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i-1];
        }
    }

    //코드 추가
    public Object remove(int index){
        Object oldValue = get(index);
        shiftLeftFrom(index);
        size--;
        elementData[size] = null;
        return oldValue;
    }

    //코드 추가 요소의 index부터 마지막까지 왼쪽으로 밀기
    private void shiftLeftFrom(int index) {
        for (int i = index; i < size -1; i++) {
            elementData[i] = elementData[i+1];
        }


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
