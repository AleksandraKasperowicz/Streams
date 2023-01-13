package CinemaTask;

public class CinemaHall {
    private final String name;
    private final CinemaHallType hallType;

    public CinemaHall(String name, CinemaHallType hallType) {
        this.name = name;
        this.hallType = hallType;
    }

    public String getName() {
        return name;
    }

    public CinemaHallType getHallType() {
        return hallType;
    }
}
