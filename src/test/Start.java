package test;

public class Start {

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = c1;

        c1.setName("Toyota");
        System.out.println("c2.getName() = " + c2.getName());

        c2.setName("BMW");
        System.out.println("c1 = " + c1.getName());





    }
}
