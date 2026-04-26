class Vehicle {//Creating classs
    private String brand;//Declare two private variable
    private String color;

    public Vehicle(String b, String c) { //Creating private constructor
        brand = b;
        color = c;
    }

    public void start() { //Creating public method
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Vehicle Color: " + color);
        System.out.println("Vehicle is starting...\n");
    }
}