package src.collection.set.member;

import src.collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {



    public static void main(String[] args) {
        //중복 등록
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");

        //hashCode 는 구현 O , equals 는 구현 X
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); // false

        System.out.println("System.ref(m1) = " + System.identityHashCode(m1));
        System.out.println("System.ref(m2) = " + System.identityHashCode(m2));

        //add() 로직에서 중복 데이터가 없다고 생각하고 m1, m2를 모두 저장한다. -> 결과적으로 같은 회원 id 를 가진 중복 데이터가 저장된다.
        set.add(m1);
        set.add(m2);
        System.out.println("set = " + set);

        //검색 실패
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);


    }




}
