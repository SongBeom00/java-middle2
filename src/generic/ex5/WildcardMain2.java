package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // Animal 포함 상위 타입 전달 가능
        writerBox(objBox);
        writerBox(animalBox);
//        writerBox(dogBox); //하한이 Animal
//        writerBox(catBox); //하한이 Animal

        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);

    }

    private static void writerBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이",100));
    }
}
