class SmallCruise extends Cruise {
    private static final int NO_OF_LOADER = 1;
    private static final int TIME_TO_LOAD = 30;

    SmallCruise(String identifier, int arrivalTime) {
        super(identifier, arrivalTime,NO_OF_LOADER,TIME_TO_LOAD);
    }

    @Override
    int getServiceTime() {
        return TIME_TO_LOAD;
    }
}
