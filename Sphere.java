class Sphere implements Shape3D {
    private final double radius;
    private static final double FOUR = 4;
    private static final double THREE = 3;
    private static final int P = 3;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return FOUR / THREE * Math.PI * Math.pow(this.radius, P);
    }

    double getRadius() {
        return this.radius;
    }

    @Override
    public String toString() {
        return "sphere [" + String.format("%.2f",this.radius) + "]";
    }
}
