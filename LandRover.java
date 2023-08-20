public class LandRover implements Car1, SportsUtility {

    public String carName;
    public int carSeats;

    public LandRover(String carName, int carSeats){
        this.carName = carName;
        this.carSeats = carSeats;
    }

    public String getMakeModel(){
        return carName;
    }

    public int getSeats(){
        return carSeats;
    }
}