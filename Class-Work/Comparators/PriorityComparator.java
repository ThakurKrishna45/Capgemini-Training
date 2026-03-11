package job_practice;

import java.util.Comparator;

public class PriorityComparator implements Comparator<Job> {
    @Override
    public int compare(Job j1, Job j2) {
        return j1.getTitle().compareTo(j2.getTitle());
    }
}
