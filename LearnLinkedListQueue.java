import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue{
    public static void main(String args[]){
        Queue<Integer> Queue = new LinkedList<>();
        Queue.offer(10);
        Queue.offer(60);
        Queue.offer(30);
        Queue.offer(100); // Insert the element into the queue
        System.out.println(Queue);
    }
}