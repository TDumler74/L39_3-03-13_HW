public class Main {
    public static void main(String[] args) {
        Track track=new Track();
        track.setColour("blue");
        track.setLoadCapacity(5000);
        System.out.println("Track with colour "+track.getColour()+", have loadcapacity of "+track.getLoadCapacity());
        //Track with colour blue, have loadcapacity of 5000
        track.drive();
        //I can drive!
        System.out.println();

        PassengerCar passengerCar=new PassengerCar();
        passengerCar.setModel(" Audi A3 ");
        passengerCar.setColour(" white ");
        passengerCar.setNumberOfSeats(5);
        System.out.println(passengerCar.getModel()+" with a colour"+passengerCar.getColour()+" have "+passengerCar.getNumberOfSeats()+" seats");
        //Audi A3  with a colour white  have 5 seats
        passengerCar.stop();
        //I stop now!
    }
}