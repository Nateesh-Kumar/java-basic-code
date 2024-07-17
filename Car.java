public class Car {
    private String make;
    private String model;
    private int year;
    private boolean isStarted;
    
        public Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.isStarted = false;
        }
    
        public void start() {
            if (!isStarted) {
                isStarted = true;
                System.out.println("The car is started.");
            } else {
                System.out.println("The car is already started.");
            }
        }
    
        public void stop() {
            if (isStarted) {
                isStarted = false;
                System.out.println("The car is stopped.");
            } else {
                System.out.println("The car is already stopped.");
            }
        }
    
        public void displayInfo() {
            System.out.println("Make: " + make);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
            System.out.println("Started: " + isStarted);
        }
    
    

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020);
        car.displayInfo();
        car.start();
        car.displayInfo();
        car.stop();
        car.displayInfo();
    }
}
}


    
    

