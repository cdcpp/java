package org.example;


@FunctionalInterface
interface MyFunction {
    void run(); //public abstract void run();
}

 class LambdaEx1 {

    static void execute(MyFunction f) { //매개변수 타입이 Myfunction인 메서드
        f.run();
    }

    static MyFunction getMyFunction(){ //반환타입이 MyFunction인 메서드
        MyFunction f = () -> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args){
        //람다식으로 MyFunction의 run을 구현
        MyFunction f1 = () -> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() { //익명클래스 run()을 구현함
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute( ()-> System.out.println("run()"));
    }


}
