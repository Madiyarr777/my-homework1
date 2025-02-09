public class Main {
    public static void main(String[] args) {
        LightDrone d1 = new LightDrone("LD-01", 50);
        HeavyDrone d2 = new HeavyDrone("HD-01", 200);


        Planet earth = new Planet("Earth", 0, 0, "Oxygen-rich");
        SpaceStation station = new SpaceStation("Alpha Station", 100, 100, 5);


        Cargo cargo1 = new Cargo(40, "Medical Supplies");
        Cargo cargo2 = new Cargo(150, "Metal Parts");


        DeliveryTask t1 = new DeliveryTask(earth, station, cargo1);
        DeliveryTask t2 = new DeliveryTask(station, earth, cargo2);


        if (t1.assignDrone(d1)) {
            System.out.println("LD-01 assigned successfully!");
        }

        if (t2.assignDrone(d2)) {
            System.out.println("HD-01 assigned successfully!");
        }

        t1.executeTask();
        t2.executeTask();
    }
}