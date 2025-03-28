package generic.ex4;

import generic.animal.Animal;

public class ComplexBox <T extends Animal>{

    private T animal;

    // 제네릭 클래스 소속 메서드이다.
    public void set(T animal){
        this.animal = animal;
    }

    public <Z> Z printAndReturn(Z z){
        System.out.println("animal.className = " + animal.getClass().getName());
        System.out.println("z.className = " + z.getClass().getName());
        return z;
    }

    // 제네릭 메서드 소속이다.
    // 제네릭 타입보다 제네릭 메서드가 높은 우선 순위를 가진다!!!
//    public <T> T printAndReturn(T t){
//        System.out.println("animal.className = " + animal.getClass().getName());
//        System.out.println("z.className = " + t.getClass().getName());
//        return t;
//    }

}
