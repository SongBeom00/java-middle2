package collection.link;

public class Node {

    Object item;
    Node next; //다음 노드 참조

    public Node(Object item) {
        this.item = item;
    }


//    @Override //IDE 생성 toString()
//    public String toString() {
//        return "Node{" +
//                "item=" + item +
//                ", next=" + next +
//                '}';
//    }


    //[A->B->C]
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node x = this; //x01
        sb.append("[");
        while (x != null){
            sb.append(x.item);
            if (x.next != null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
    }


}
