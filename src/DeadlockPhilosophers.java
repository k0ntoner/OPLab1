public class DeadlockPhilosophers {

    public static void main(String[] args) {
        Fork[] forks = new Fork[5];
        for (int i = 0; i < 5; i++) {
            forks[i] = new Fork("Fork #" + i);
        }
        Table table = new Table(forks);
        Philosopher[] philosophers = new Philosopher[5];
        for (int i = 0; i < 5; i++) {
            philosophers[i] = new Philosopher(table, i);
        }
        for (int i = 0; i < 5; i++) {
            philosophers[i].start();
        }

    }

}
