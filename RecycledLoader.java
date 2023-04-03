class RecycledLoader extends Loader {
    private static final int MAINTAINENCE_TIME = 60;

    RecycledLoader(int id) {
        super(id);
    }

    int getMaintainanceTime() {
        return MAINTAINENCE_TIME;
    }

    @Override
    public String toString() {
        return "Recycled " + super.toString();
    }
}

    
