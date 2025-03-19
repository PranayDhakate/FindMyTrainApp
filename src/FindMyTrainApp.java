import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMyTrainApp {

    public static void main(String[] args) {

        TrainSystem trainSystem = new TrainSystem();

        Station station1 = new Station("NGP", "Nagpur");
        Station station2 = new Station("HYD", "Hyderabad");
        Station station3 = new Station("BLT", "Bangalore");
        Station station4 = new Station("JPR", "Jaipur");
        Station station5 = new Station("GOA", "Goa");
        Station station6 = new Station("BOM", "Mumbai");

        Train train1 = new Train("01HWAB", "GARIBRATH", "Passenger");
        Train train2 = new Train("01HWBC", "RAJDHANI", "Express");
        Train train3 = new Train("01HWCD", "DURANTO", "Passenger");
        Train train4 = new Train("01HWDE", "MAAL-GADI", "Transport Loader");

        Platform platform1 = new Platform(1);
        Platform platform2 = new Platform(2);
        Platform platform3 = new Platform(3);
        Platform platform4 = new Platform(4);

        platform1.setTrain(train1);
        platform2.setTrain(train2);
        platform3.setTrain(train3);
        platform4.setTrain(train4);

        List<Platform> platformList = new ArrayList<>();
        platformList.add(platform1);
        platformList.add(platform2);
        platformList.add(platform3);
        platformList.add(platform4);

        station1.setPlatformList(platformList);

        //Schedule s1 = new Schedule();
        Schedule s1=new Schedule(train1,station1,platform1,"9:05AM","09:15AM");
        Schedule s2=new Schedule(train2,station2,platform2,"11:15AM","11:20AM");
        Schedule s3=new Schedule(train3,station3,platform3,"05:00AM","05:30AM");
        Schedule s4=new Schedule(train4,station4,platform4,"07:02AM","07:10AM");

        trainSystem.addStation(station1);
        trainSystem.addStation(station2);
        trainSystem.addStation(station3);
        trainSystem.addStation(station4);
        trainSystem.addStation(station5);
        trainSystem.addStation(station6);

        trainSystem.addTrain(train1);
        trainSystem.addTrain(train2);
        trainSystem.addTrain(train3);
        trainSystem.addTrain(train4);

        trainSystem.addSchedule(s1);
        trainSystem.addSchedule(s2);
        trainSystem.addSchedule(s3);
        trainSystem.addSchedule(s4);

        //Let's find the train now

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Source : ");
        String source = sc.nextLine();

        System.out.println("Enter the Destination : ");
        String destination = sc.nextLine();

        List<Schedule> myTrains = trainSystem.findMyTrains(source, destination);

        System.out.println("Your train from "+source+" and " + destination +" are ");

        System.out.println(myTrains.get(0));

    }
}
