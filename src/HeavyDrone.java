class HeavyDrone extends Drone {
    public HeavyDrone(String id, int i) {
        super(id, 200);
    }

    @Override
    public double calculateFlightTime(double distance) {
        return distance / 50;
    }
}

