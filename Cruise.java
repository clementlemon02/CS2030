class Cruise {
    private final String identifier;
    private final int arrivalTime;
    private final int serviceTime;
    private final int numLoaders;
    private static final int FOUR = 4;
    private static final int SIXTY = 60;

    Cruise(String identifier, int arrivalTime, int numLoaders,
            int serviceTime) {
        this.identifier = identifier;
        this.arrivalTime = arrivalTime;
        this.serviceTime = serviceTime;
        this.numLoaders = numLoaders;
    }

    int getServiceTime() {
        return this.serviceTime;
    }

    String getIdentifier() {
        return this.identifier;
    }

    int getArrivalTime() {
        String arrived = String.format("%04d",this.arrivalTime);
        int minutes = Integer.parseInt(arrived.substring(0, 2)) 
            * SIXTY + Integer.parseInt(arrived.substring(2, FOUR)); 
        return minutes;
    }

    int getNumOfLoadersRequired() {
        return this.numLoaders;
    }

    Cruise addServiceTime(int i) {
        return new Cruise(identifier, arrivalTime, numLoaders, serviceTime + i);
    }

    @Override
    public String toString() {
        return this.identifier + "@" + String.format("%04d",this.arrivalTime);
    }
}

