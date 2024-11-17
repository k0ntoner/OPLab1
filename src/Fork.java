public  class Fork {


    private String name;
    public Fork(String name) {
        this.name = name;
    }
    public synchronized String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
