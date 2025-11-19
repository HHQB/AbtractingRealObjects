public class Passengers {
    private int numberOfPassengers;

    public Passengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public String toString() {
        return "Number of Passengers: " + numberOfPassengers;
    }
}
