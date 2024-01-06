public class Coach {
    private String coachType;
    private int SeatCapacity;
    private double fare;

    public Coach(String coachType, int SeatCapacity, double fare) {
        this.coachType = coachType;
        this.SeatCapacity = SeatCapacity;
        this.fare = fare;
    }

    public String getCoachType() {
        return coachType;
    }

    public int getSeatCapacity() {
        return SeatCapacity;
    }

    public double getFare() {
        return fare;
    }
}
