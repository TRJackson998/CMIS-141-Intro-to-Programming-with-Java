public class Restaurant {
    private String name;
    private int numWorkers;
    private String[] workers;

    public Restaurant() {
        this.name = "default";
        this.workers = new String[5];
    }

    public Restaurant(String name) {
        this.name = name;
        this.numWorkers = 0;
        this.workers = new String[20];
    }

    public String getName(Restaurant rest) {
        return this.name;
    }

    public int getNumWorkers(Restaurant rest) {
        return this.numWorkers;
    }

    public String[] getWorkerList(Restaurant rest) {
        return this.workers;
    }

    public void addWorker(String name) {
        this.workers[numWorkers] = name;
        this.numWorkers++;
    }
}