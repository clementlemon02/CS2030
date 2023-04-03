class SolidSphere extends Sphere implements Solid {
    private final double density;

    SolidSphere(double radius, double density) {
        super(radius);
        this.density = density;
    }

    public double mass() {
        SolidSphere solidSphere1 = new SolidSphere(this.getRadius(),this.density); 
        SolidImpl solidSphere2 = new SolidImpl(solidSphere1,this.density);
        return solidSphere2.mass();
    }

    @Override
    public String toString() {
        return "solid-sphere [" + String.format("%.2f",this.getRadius()) +
            "] with a mass of " + String.format("%.2f",this.mass());
    }
}
