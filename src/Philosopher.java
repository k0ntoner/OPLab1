public class Philosopher extends Thread {
    Fork[] forks =new Fork[2];
    Table table;
    int index;
    public Philosopher(Table table, int index) {
        this.table = table;
        this.index = index;
    }
    private void startEating(){
        try {

            forks[0] = table.getFork(index);
            System.out.println(this.getName()+": Get Left fork: "+ forks[0].getName());

            forks[1] = table.getFork(index+1);
            System.out.println(this.getName()+": Get Right fork: "+ forks[1].getName());
            sleep(3000);
            while(true) {
                synchronized (forks[0]) {
                    System.out.println(this.getName() + ": Block Left fork: " + forks[0].getName());

                    sleep(2000);

                    synchronized (forks[1]) {
                        System.out.println(this.getName() + ": Block Right fork: " + forks[1].getName());
                        sleep(2000);
                    }
                }
                System.out.println(this.getName() +": UnBlock every fork: " + forks[0].getName() + " and " + forks[1].getName());
                sleep(10000*index);
            }

        }
        catch (Exception e){

        }
    }
    @Override
    public void run() {

        startEating();
        System.out.println("Close thread");
    }
}
