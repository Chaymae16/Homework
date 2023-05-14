package class21Polymorphism;

import java.util.concurrent.Callable;

public class ComputerTester {
    public static void main(String[] args) {
Computer [] computers={
        new Apple(),
        new Lenovo(),
        new HP(),
        new Dell()
};
        for (Computer com:computers){
            com.shutDown();
            com.update();
            com.restart();
            com.change();
}
        Computer store=new Apple();
        Apple a=(Apple) store;
        a.turnOff();

        Computer store2=new Lenovo();
        Lenovo l=(Lenovo) store2;
        l.changeInSetting();


    }
}
