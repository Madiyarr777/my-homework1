class CelestialBody {
    protected String name;
    protected double x, y;

    public CelestialBody(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public double distanceTo(CelestialBody other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    public String getName() {
        return name; }
    public double getX() {
        return x; }
    public double getY() {
        return y; }
}