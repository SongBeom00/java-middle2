package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);
//        Integer result = (Integer) GenericMethod.objMethod(i); // 다운 캐스팅 필요

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);
//        String stringValue = GenericMethod.<String>numberMethod(20.0); // 컴파일 오류 Number의 자식만 입력 가능

        String str = GenericMethod.<String>genericMethod("Hello");


        // 제네릭 메서드 타입 추론 -> 타입 추론, 타입 인자 생략 가능
        Integer result1 = GenericMethod.genericMethod(i);
        Integer integerValue1 = GenericMethod.numberMethod(10);
        Double doubleValue1 = GenericMethod.numberMethod(20.0);


    }

}
