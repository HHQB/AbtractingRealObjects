public class App {
    public static void main(String[] args) throws Exception {
        Plane plane1 = new Plane("Boeing 747", new Passengers(500));
        System.out.println("Plane Model: " + plane1.getModel());
        System.out.println("Plane Passengers: " + plane1.getPassengers());
        plane1.setPassengers(600);
        System.out.println("Updated Plane Passengers: " + plane1.getPassengers());
        }
    }
