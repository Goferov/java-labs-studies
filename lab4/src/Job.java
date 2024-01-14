package lab4.src;

import java.util.PriorityQueue;

public class Job implements Comparable<Job> {
    private final String description;
    private final int priority;

    public Job(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    @Override
    public int compareTo(Job other) {
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {
        return "Job{" +
                "description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }

    public static void main(String[] args) {
        PriorityQueue<Job> jobQueue = new PriorityQueue<>();

        jobQueue.add(new Job("Job 1", 5));
        jobQueue.add(new Job("Job 2", 3));
        jobQueue.add(new Job("Job 3", 6));
        jobQueue.add(new Job("Job 4", 1));
        jobQueue.add(new Job("Job 5", 2));
        jobQueue.add(new Job("Job 6", 77));
        jobQueue.add(new Job("Job 7", 7));
        jobQueue.add(new Job("Job 8", 10));
        jobQueue.add(new Job("Job 9", 4));
        jobQueue.add(new Job("Job 10", 9));

        while (!jobQueue.isEmpty()) {
            System.out.println(jobQueue.poll());
        }
    }
}