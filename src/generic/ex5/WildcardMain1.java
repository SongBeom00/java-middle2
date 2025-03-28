package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이",100));
        WildcardEx.<Dog>printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.<Dog>printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);
//        WildcardEx.printWildcardV2(objBox); //Animal 하위 타입만 들어갈 수 있다.

        Dog dog = WildcardEx.<Dog>printAndReturnGeneric(dogBox);

        catBox.set(new Cat("냐옹이",200));
        Cat cat = WildcardEx.printAndReturnGeneric(catBox);

        //와일드카드는 전달한 타입을 명확하게 반환할 수 없다.
        Animal animal = WildcardEx.printWildcardV3(dogBox);
//        Dog dog2 = (Dog) WildcardEx.printWildcardV3(dogBox);


    }
}
