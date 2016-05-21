package test;

public class Start {

    public static void main(String[] args) {
        Car car = new Car();

        car.setName("Toyota");
        car.setName("BMW");
       // car = null;



        System.out.println("I have " + car.getName());

    }
}
