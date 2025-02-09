class LightDrone extends Drone {
    public LightDrone(String id, int i) {
        super(id, 50);
    }

    @Override
    public double calculateFlightTime(double distance) {
        return distance / 100;
    }
}