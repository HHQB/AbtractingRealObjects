public class App {
    public static void main(String[] args) throws Exception {
        Plane plane1 = new Plane("Boeing 747", new Passengers(500));
        Plane plane2 = new Plane("Airbus A380", new Passengers(300), 600);
        System.out.println("Plane 1: " + plane1);
        System.out.println("Plane 2: " + plane2);
        plane1.setAltitude(10000);
        plane1.unloadPassengers();
        plane2.loadPassengers(250);
        System.out.println(plane2.getPassengers());
        }
    }
