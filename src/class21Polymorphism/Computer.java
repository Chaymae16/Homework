package class21Polymorphism;
/*
Create a Class Computer that will have 4 subclasses
 as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in
parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array.
 Loop through each object and execute available methods.
 */
public class Computer {
    String model;
    String color;
    double price;

    void shutDown(){
        System.out.println(" I shut down the computer");
    }
    void restart(){
        System.out.println("I restart the computer");
    }
    void update(){
        System.out.println("I update the computer");
    }
    void change(){
        System.out.println("change the computer  ");
    }
}

class Apple extends Computer{
    @Override
void shutDown(){
    System.out.println("I update first the I shutDown");
}
void turnOff(){
    System.out.println("turn off the Wifi ");
}
}


class Lenovo extends Computer{
    @Override
    void update(){
        System.out.println("I update my computer every week");
    }
    void changeInSetting(){
        System.out.println("change the sounds");
    }

}


class HP extends Computer{
    @Override
    void restart(){
        System.out.println("I restart my computer every day");
    }

}


class Dell extends Computer{
    @Override
    void change(){
        System.out.println("change the password");
    }

}
