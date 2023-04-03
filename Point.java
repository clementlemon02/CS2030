class Point {
    private final double x;
    private final double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Point midPoint(Point otherpoint) {
        double midX = (this.x + otherpoint.x) / 2;
        double midY = (this.y + otherpoint.y) / 2;
        return new Point(midX,midY);
    }

    double angleTo(Point otherpoint) {
        double disX = otherpoint.x - this.x;
        double disY = otherpoint.y - this.y;
        return Math.atan2(disY, disX);
    }

    Point moveTo(double angle, double distance) {
        double newX = this.x + distance * Math.cos(angle);
        double newY = this.y + distance * Math.sin(angle);
        return new Point(newX, newY);
    }

    double getX() {
        return this.x;
    }

    double getY() {
        return this.y;
    }


    public String toString() {
        return "point (" + String.format("%.3f", x) + ", " + 
        String.format("%.3f", y) + ")";
    }

}
