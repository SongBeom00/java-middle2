package src.collection.set;

import src.collection.set.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {
        //Object의 기본 hashCode는 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());
        System.out.println("obj1 = " + obj1);
        System.out.println(Integer.toHexString(obj1.hashCode())); // 16진수
        System.out.println("obj2 = " + obj2);



        //각 클래스마다 hashCode를 이미 오버라이딩 해두었다.
        Integer i = 10;
        String strA = "A";
        String strB = "AB";

        System.out.println("i.hashCode() = " + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strB.hashCode() = " + strB.hashCode()); //여러가지 문자들을 충돌이 안들어가기 위해 여러가지 연산이 더해진다.

        //hashCode는 마이너스 값이 들어올 수 있다.
        System.out.println("Integer.valueOf(-1).hashCode() = " + Integer.valueOf(-1).hashCode());
        
        //둘은 같을까? 다를까?, 인스턴스는 다르지만, equals는 같다.
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");
        //2명의 member는 물리적으로 다른 메모리에 있는 객체이지만, 논리적으로는 같다고 표현할 수 있다. -> 동일성은 다르지만, 동등성은 같다.

        //equals, hashCode를 오버라이딩 하지 않은 경우와, 한 경우를 비교
        System.out.println("member1 == member2 = " + (member1 == member2)); //인스턴스가 다르기 때문에 다르다.
        System.out.println("member1.equals(member2) = " + member1.equals(member2));


        //hashCode를 오버라이딩 해서 같은 hashCode를 반환하고 있다.
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
        System.out.println("member1.hashCode() == member2.hashCode() = " + (member1.hashCode() == member2.hashCode())); //true

    }

}
