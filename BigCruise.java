class BigCruise extends Cruise {
    private final double length;
    private final double numOfPassengers;
    private static final double FORTY = 40; 
    private static final double FIFTY = 50;

    BigCruise(String identifier, int arrivalTime, double length, double numOfPassengers) {
        super(identifier, arrivalTime, (int) Math.ceil(length / FORTY), 
                (int) Math.ceil(numOfPassengers / FIFTY));
        this.length = length;
        this.numOfPassengers = numOfPassengers;
    }
    
    double getLength() {
        return this.length;
    }

    double getnumOfPassengers() {
        return this.numOfPassengers;
    }

    int getServiceTime() {
        return (int) Math.ceil(numOfPassengers / FIFTY);

    }

}
