class SpaceStation extends CelestialBody {
    private int stationLevel;

    public SpaceStation(String name, double x, double y, int stationLevel) {
        super(name, x, y);
        this.stationLevel = stationLevel;
    }
}