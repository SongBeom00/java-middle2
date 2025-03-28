package collection.list;

import java.util.ArrayList;

public class BatchProcessor {

    //list에 대하여 구체적인 것에 의존을 하고 있다.
//    private final MyLinkedList<Integer> list = new MyLinkedList<>();

    private final MyList<Integer> list; //더 추상적인 MyList에 의존하고 있다.

    //MyList = new My ArrayList;
    //MyList = new MyLinkedList
    //생성자를 통해 의존 관계가 외부에서 주입된다. -> 생성자 의존관계 주입
    //의존관계 주입 Dependency Injection(DI) 의존성 주입이라고 한다.
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) { //O(n)
            list.add(0,i); //앞에 추가 //O(1) O(n) LinkedList -> O(n+1) / ArrayList -> O(n*n)
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + " , 계산 시간: "+ (endTime-startTime) + "ms");
    }




}
