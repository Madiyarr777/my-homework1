class DeliveryTask {
    private CelestialBody origin;
    private CelestialBody destination;
    private Cargo cargo;
    private Drone assignedDrone;

    public DeliveryTask(CelestialBody origin, CelestialBody destination, Cargo cargo) {
        this.origin = origin;
        this.destination = destination;
        this.cargo = cargo;
    }

    public boolean assignDrone(Drone drone) {
        System.out.println("Trying to assign " + drone.getId() + " to carry " + cargo.getWeight() + "kg...");
        if (drone.canCarry(cargo.getWeight())) {
            assignedDrone = drone;
            drone.loadCargo(cargo.getWeight());
            return true;
        }
        System.out.println("Drone " + drone.getId() + " cannot carry the cargo!");
        return false;
    }

    public void executeTask() {
        if (assignedDrone != null) {
            assignedDrone.startFlight();
            double distance = origin.distanceTo(destination);
            double time = assignedDrone.calculateFlightTime(distance);
            System.out.printf("Drone %s delivering in %.2f hours.%n", assignedDrone.getId(), time);
            assignedDrone.completeFlight();
        }
    }

    public CelestialBody getOrigin() { return origin; }
    public CelestialBody getDestination() { return destination; }
    public Cargo getCargo() { return cargo; }
    public Drone getAssignedDrone() { return assignedDrone; }
}