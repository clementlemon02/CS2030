class SolidCuboid extends Cuboid implements Solid {
    private final double density;

    SolidCuboid(double height, double width, double length, double density) {
        super(height, width, length);
        this.density = density;
    }

    public double mass() {
        SolidCuboid solidCuboid1 = new SolidCuboid(this.getHeight(), 
                this.getWidth(), this.getLength(), this.density); 
        SolidImpl solidCuboid2 = new SolidImpl(solidCuboid1,this.density);
        return solidCuboid2.mass();
    }

    @Override
    public String toString() {
        return "solid-cuboid [" + String.format("%.2f",this.getHeight()) + " x " +
            String.format("%.2f",this.getWidth()) + " x " +
            String.format("%.2f",this.getLength()) +
            "] with a mass of " + String.format("%.2f",this.mass()); 

    }
}
