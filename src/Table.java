public class Table {
    private Fork[] forks;

    public Table(Fork[] forks) {
        this.forks = forks;
    }
    public Fork getFork(int index) {
        index=index%forks.length;
        return forks[index];
    }
}
