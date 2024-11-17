public class StarvationPhilosopher {
    public static void main(String[] args) {
        Fork[] forks = new Fork[4];
        for (int i = 0; i < 4; i++) {
            forks[i]=new Fork("Fork #"+i);
        }
        Table table=new Table(forks);
        Philosopher[] philosophers = new Philosopher[3];
        for (int i = 0; i < 3; i++) {
            philosophers[i]=new Philosopher(table,i);
        }
        for (int i = 0; i < 3; i++) {
            philosophers[i].start();
        }

    }
}
