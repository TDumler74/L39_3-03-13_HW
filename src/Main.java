public class Main {
    public static void main(String[] args) {
        Track track=new Track();
        track.setProductionDate(2020);
        track.setColour("blue");
        track.setLoadCapacity(5000);
        System.out.println("Track with productionsdate "+track.getProductionDate()+" and colour "+track.getColour()+", have loadcapacity of "+track.getLoadCapacity());
        //Track with productionsdate 2020 and colour blue, have loadcapacity of 5000
        track.drive();
        //I can drive!
        System.out.println();

        PassengerCar passengerCar=new PassengerCar();
        passengerCar.setModel("Audi A3 ");
        passengerCar.setColour(" white ");
        passengerCar.setNumberOfSeats(5);
        System.out.println(passengerCar.getModel()+" with a colour"+passengerCar.getColour()+" has "+passengerCar.getNumberOfSeats()+" seats");
        //Audi A3  with a colour white  has 5 seats
        passengerCar.drive();
        //I can drive!
        passengerCar.stop();
        //I stop now!
    }
}