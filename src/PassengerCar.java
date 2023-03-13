public class PassengerCar extends Car {
    private int numberOfSeats;
    protected void setNumberOfSeats(int numberOfSeats){
        this.numberOfSeats=numberOfSeats;
    }
    protected int getNumberOfSeats(){
        return numberOfSeats;
    }
}
