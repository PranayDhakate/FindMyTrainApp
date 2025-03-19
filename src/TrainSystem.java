import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainSystem {

    private Map<String,Station> stations = new HashMap<>();
    private Map<String,Train> trains = new HashMap<>();

    private List<Schedule> schedules = new ArrayList<>();

    public void addStation(Station station){
        stations.put(station.getStationID(), station);
    }

    public void addTrain(Train train){
        trains.put(train.getTrainID(), train);
    }

    public void addSchedule(Schedule schedule){
        schedules.add(schedule);
    }

    public List<Schedule> findMyTrains(String startStationID, String endStationID) {
        List<Schedule> scheduleList = new ArrayList<>();
        for (Schedule schedule : schedules) {
            if (schedule.getStation().getStationID().equals(startStationID) || schedule.getStation().getStationID().equals(endStationID)) {
                scheduleList.add(schedule);
            }
        }

        return scheduleList;

    }

}
