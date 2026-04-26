public class it24002 { //Another class 

   
    public static void main(String[] args) {

        if (args.length % 2 != 0) {
            System.out.println("Please provide arguments in pairs (brand color).");
            return;
        }
         //command line argument to create object
        for (int i = 0; i < args.length; i += 2) {
            String brand = args[i];
            String color = args[i + 1];

            Vehicle v = new Vehicle(brand, color);
            v.start();
        }
    }
}

