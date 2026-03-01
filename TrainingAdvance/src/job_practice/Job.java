package job_practice;
//implements Comparable<Job>
public class Job  {
    private String title;
    private Integer priority;
    public Job(String title,Integer priority){
        this.title=title;
        this.priority=priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

//    @Override
//    public int compareTo(Job o) {
//        return this.title.compareTo(o.title);
//    }

    @Override
    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                ", priority=" + priority +
                '}';
    }
}
