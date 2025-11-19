public class Plane {
    private String model;
    private Passengers passengers;
    private int MAX_CAPACITY = 850;
    private boolean isFlying;
    private int altitude;

    public Plane(String model, Passengers passengers) {
        this.model = model;
        this.passengers = passengers;
    }

    public Plane(String model, Passengers passengers, int maxCapacity) {
        this.model = model;
        this.passengers = passengers;
        this.MAX_CAPACITY = maxCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPassengers(int changeInPassengers) {
        this.passengers.setPassengers(changeInPassengers);
        
    }

    public int getCapacity() {
        return MAX_CAPACITY;
    }

    public Passengers getPassengers() {
        return passengers;
    }

    public void unloadPassengers() {
        if (isFlying == false) {
            this.passengers.setPassengers(0);
        } else {
            System.out.println("Cannot unload passengers while flying.");
        }
    }

    public void loadPassengers(int numberOfNewPassengers) {
        if (this.passengers.getNumberOfPassengers() + numberOfNewPassengers <= MAX_CAPACITY) {
            this.passengers.setPassengers(this.passengers.getNumberOfPassengers() + numberOfNewPassengers);
        } else {
            System.out.println("Cannot load passengers: Exceeds maximum capacity.");
        }
    }
}
