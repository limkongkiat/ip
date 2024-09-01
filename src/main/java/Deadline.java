public class Deadline extends Task{
    private String deadline;

    public Deadline(String description, String deadline){
        super(description);
        this.deadline = deadline;
    }

    @Override
    public String getNameWithStatus(){
        return "[D][" + this.getStatusIcon() + "] " + this.getDescription() + " (by: " + deadline + ")";
    }
}
