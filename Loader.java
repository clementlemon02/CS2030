class Loader {
    private final int id;

    Loader(int id) {
        this.id = id;
    }

    int getId() {
        return this.id;
    }


    public String toString() {
        return "Loader #" + this.id;
    }
}
