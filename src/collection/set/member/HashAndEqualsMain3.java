package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {



    public static void main(String[] args) {
        //중복 등록 안됨
        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("A");
        Member m2 = new Member("A");

        //hashCode 는 구현 O , equals 는 구현 O
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); // false

        System.out.println("System.ref(m1) = " + System.identityHashCode(m1));
        System.out.println("System.ref(m2) = " + System.identityHashCode(m2));

        set.add(m1);
        set.add(m2); //m2 저장 실패 (중복 데이터)
        System.out.println("set = " + set);

        //검색 성공
        Member searchValue = new Member("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);


        System.out.println("\"Aa\".hashCode() = " + "Aa".hashCode());
        System.out.println("\"BB\".hashCode() = " + "BB".hashCode());

    }




}
