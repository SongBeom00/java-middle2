package collection.list;

public class ArrayBatchProcessor {

    //list에 대하여 구체적인 것에 의존을 하고 있다.
//    private final MyLinkedList<Integer> list = new MyLinkedList<>();

    private final MyArrayList<Integer> list = new MyArrayList<>(); //더 추상적인 MyList에 의존하고 있다.


    public void logic(int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) { //O(n)
            list.add(0,i); //앞에 추가 //O(1) O(n) LinkedList -> O(n+1) / ArrayList -> O(n*n)
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + " , 계산 시간: "+ (endTime-startTime) + "ms");
    }




}
