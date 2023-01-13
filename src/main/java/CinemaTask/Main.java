package CinemaTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<CinemaHall> cinemaHalls = new ArrayList<>();
        cinemaHalls.add(new CinemaHall("HALL_1", CinemaHallType.HALL_2D));
        cinemaHalls.add(new CinemaHall("HALL_2", CinemaHallType.HALL_3D));
        cinemaHalls.add(new CinemaHall("HALL_3", CinemaHallType.HALL_3D));
        cinemaHalls.add(new CinemaHall("HALL_4", CinemaHallType.HALL_2D));
        cinemaHalls.add(new CinemaHall("HALL_5", CinemaHallType.HALL_4D));
        cinemaHalls.add(new CinemaHall("HALL_6", CinemaHallType.HALL_4D));
        cinemaHalls.add(new CinemaHall("HALL_7", CinemaHallType.HALL_4D));

        cinemaHalls
                .stream()
                .collect(Collectors.groupingBy(CinemaHall::getHallType))
                .forEach((hallType, halls) -> System.out.println(hallType + ": " + halls.size()));
    }
}
