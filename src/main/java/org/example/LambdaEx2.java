package org.example;

@FunctionalInterface
interface MyFunction2 {
    void myMethod();
}

public class LambdaEx2 {

    public static void main(String[] args) {
        MyFunction f = () -> {}; //MyFunction f = (MyFunction) (()->{});
        Object obj = (MyFunction) ( ()->{}); // Object 타입으로 형변환이 생략됨
        String str = ( (Object)(MyFunction) ( () -> {} )).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);
    }

}
