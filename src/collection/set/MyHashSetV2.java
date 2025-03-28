package collection.set;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class MyHashSetV2 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;


    private LinkedList<Object>[] buckets; //모든 타입을 저장하도록 Object 로 변환

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;


    public MyHashSetV2() {
        initBuckets();
    }

    public MyHashSetV2(int capacity) { // capacity 조절
        this.capacity = capacity;
        initBuckets();
    }



    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(Object value){
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        if(bucket.contains(value)){
            return false;
        }
        bucket.add(value);
        size++;
        return true;

    }

    public boolean contains(Object searchValue){
        int hashIndex = hashIndex(searchValue); // O(1)
        LinkedList<Object> bucket = buckets[hashIndex]; // O(1)
//        for (Object object : bucket) {
//            if(object.equals(searchValue)){ // 동등성 비교!!
//                return true;
//            }
//        }
//        return false;

        return bucket.contains(searchValue); // 최악의 경우는 : O(n) 평균적으로는 : O(1) 이다.
    }

    public boolean remove(Object value){
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        boolean result = bucket.remove(value);// List 는 객체를 지우는 법 2가지 인덱스 위치와 객체
        if (result){
            size--;
            return true;
        }else {
            return false;
        }
    }

    private int hashIndex(Object value){ //배열의 인덱스는 마이너스 값을 사용할 수 없다.
        return Math.abs(value.hashCode()) % capacity; //해시 코드 절댓값
    }

    public int getSize(){
        return size;
    }


    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
