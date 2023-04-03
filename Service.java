class Service {
    private final Loader loader;
    private final Cruise cruise;

    Service(Loader loader, Cruise cruise) {
        this.loader = loader;
        this.cruise = cruise;
    }

    Loader getLoader() {
        return this.loader;
    }

    Cruise getCruise() {
        return this.cruise;
    }

    int getServiceStartTime() {
        return this.cruise.getArrivalTime();
    }

    int getServiceEndTime() {
        return this.cruise.getArrivalTime() + this.cruise.getServiceTime();
    }

    public String toString() {
        return this.loader.toString() + " serving " + this.cruise.toString();

    }
}
