public class Car {
    int tyres;
    String color;
    String brand;
    int PS;
    public Car(int theTyres, String theColor, String theBrand, int thePS) {
        tyres = theTyres;
        color = theColor;
        brand = theBrand;
        PS    = thePS;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Car mercedes = new Car(5, "silver", "Mercedes Benz", 160);
        Car honda    = new Car(5, "gold", "Honda H-RV", 105);
        System.out.println("Color: " + mercedes.color);
        System.out.println("Brand: " + honda.brand);
        System.out.println("Brand: " + mercedes.brand);



    }

}
