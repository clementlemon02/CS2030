class SolidImpl implements Shape3D {
    private final Shape3D shape;
    private final double density;

    SolidImpl(Shape3D shape, double density) {
        this.shape = shape;
        this.density = density;
    }

    public double volume() {
        return this.shape.volume();
    }

    double mass() {
        return  this.shape.volume() * this.density;
    }

    public String toString() {
        return "SolidImpl";
    }
}

