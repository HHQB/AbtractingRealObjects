public class Plane {
    private String model;
    private Passengers passengers;
    private int MAX_CAPACITY = 850;
    private boolean isFlying = false;
    private int altitude = 0;

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

    public void setAltitude(int altitude) {
        this.altitude = altitude;
        if (altitude > 0) {
            isFlying = true;
        } else {
            isFlying = false;
        }
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
        if (isFlying == false) {
            if (this.passengers.getNumberOfPassengers() + numberOfNewPassengers <= MAX_CAPACITY) {
                this.passengers.setPassengers(this.passengers.getNumberOfPassengers() + numberOfNewPassengers);
            } else {
                System.out.println("Cannot load passengers: Exceeds maximum capacity.");
            }
        } else {
            System.out.println("Cannot load passengers while flying.");
        }
    }

    public String toString() {
        return "Plane Model: " + model + ", " + passengers.toString() + ", Max Capacity: " + MAX_CAPACITY + ", Is Flying: " + isFlying + ", Altitude: " + altitude;
    }
}
