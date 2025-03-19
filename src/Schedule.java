import java.time.LocalDateTime;

public class Schedule {

    private Train train;

    private Station station;

    private Platform platform;

    private String arrivalTime;
    private String departureTime;

    public Schedule(Train train, Station station, Platform platform, String arrivalTime, String departureTime) {
        this.train = train;
        this.station = station;
        this.platform = platform;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public Train getTrain() {
        return train;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "train=" + train +
                ", station=" + station +
                ", platform=" + platform +
                ", arrivalTime=" + arrivalTime +
                ", departureTime=" + departureTime +
                '}';
    }

}
