class Circle {
    private final Point centre;
    private final double radius;

    Circle(Point centre, double radius) {
        this.centre = centre;
        this.radius = radius;
    }


    boolean contains(Point p) {
        double dx = this.centre.getX() - p.getX();
        double dy = this.centre.getY() - p.getY();
        double dist = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        return dist <= this.radius;
    }

    Point getCentre() {
        return this.centre;
    }

    double getRadius() {
        return this.radius;
    }

    public String toString() {
        return "circle of radius " + this.radius + 
            " centred at " + this.centre;
    }
}
