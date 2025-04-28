import java.util.Objects;

public class Worker {
    private String fName;
    private String lName;
    private String team;

    public Worker(String fName, String lName, String team) {
        this.fName = fName;
        this.lName = lName;
        this.team = team;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(fName, worker.fName) && Objects.equals(lName, worker.lName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fName, lName);
    }

    @Override
    public String toString() {
        return "Worker  " + fName + "  " + lName +
                "  team " + team;
    }
}
