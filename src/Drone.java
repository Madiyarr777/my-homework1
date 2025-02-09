abstract class Drone {
    private  String id;
    private String status;
    private  double cargoCapacity;
    private double currentCargoWeight;

    public Drone(String id, double cargoCapacity) {
        this.id = id;
        this.status = "IDLE";
        this.cargoCapacity = cargoCapacity;
        this.currentCargoWeight = 0;
    }

    public boolean canCarry(double weight) {
        return (currentCargoWeight + weight) <= cargoCapacity;
    }

    public void loadCargo(double weight) {
        if (canCarry(weight)) {
            currentCargoWeight += weight;
        }
    }

    public void startFlight() {
        status = "IN_FLIGHT";
    }

    public void completeFlight() {
        status = "IDLE";
        currentCargoWeight = 0;
    }

    public abstract double calculateFlightTime(double distance);

    public String getId() { return id; }
    public String getStatus() { return status; }
    public double getCargoCapacity() { return cargoCapacity; }
    public double getCurrentCargoWeight() { return currentCargoWeight; }
}
