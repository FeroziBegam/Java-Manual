class Car {
    // Attributes
    String car_color;
    String car_brand;
    String fuel_type;
    double mileage;

    // Constructor
    Car() {
        System.out.println("Welcome to Meg Car Showroom");
    }

    // Methods
    void start() {
        System.out.println(car_brand + " is starting.");
    }

    void service() {
        System.out.println(car_brand + " is being serviced.");
    }

    void stop() {
        System.out.println(car_brand + " has stopped.");
    }

    public static void main(String[] args) {
        // Creating objects
        Car car1 = new Car();
        car1.car_color = "Red";
        car1.car_brand = "Mercedez";
        car1.fuel_type = "Electric";
        car1.mileage = 18.5;

        Car car2 = new Car();
        car2.car_color = "Blue";
        car2.car_brand = "RR";
        car2.fuel_type = "Diesel";
        car2.mileage = 20.0;

        Car car3 = new Car();
        car3.car_color = "Black";
        car3.car_brand = "Ford";
        car3.fuel_type = "Electric";
        car3.mileage = 0;

        // Calling methods
        car1.start();
        car2.service();
        car3.stop();
    }
}
