public class PR4 {
    public static void main(String[] args) {
        Queue q = new Queue();
        for (int i = 0; i < 8; i++) {
            q.enqueue(i);
        }
        q.print();
        System.out.println("Size of the queue is :  " + q.getSize());
        q.dequeue();
        System.out.println(q.empty());

        Stack s = new Stack();
        for (int i = 0; i < 8; i++) {
            s.enqueue(i);
        }
        s.print();
        System.out.println("Size of the stack is :  " + s.getSize());
        s.dequeue();
        System.out.println(s.empty());
    }
}