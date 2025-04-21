import java.util.PriorityQueue;

public class Priorityqueue<E> extends PriorityQueue<E> {

    public Priorityqueue() {
        super();
    }

    public Priorityqueue(PriorityQueue<E> other) {
        super(other);
    }

    @Override
    public Priorityqueue<E> clone() {
        return new Priorityqueue<>(this);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
		System.out.println("\n Name: Parth Katariya \n Enrollment No: 230410107073\n\n");
        Priorityqueue<Integer> originalQueue = new Priorityqueue<>();
        originalQueue.add(10);
        originalQueue.add(5);
        originalQueue.add(20);

        System.out.println("Original Queue: " + originalQueue);

        Priorityqueue<Integer> clonedQueue = originalQueue.clone();
        System.out.println("Cloned Queue: " + clonedQueue);

        originalQueue.poll();
        System.out.println("After removing from original:");
        System.out.println("Original Queue: " + originalQueue);
        System.out.println("Cloned Queue: " + clonedQueue);
    }
}
