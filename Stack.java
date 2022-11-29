public class Stack {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;

        }
    }

    static class Stack_Example {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;

            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        while (!obj.isEmpty()) {
            System.out.println(obj.peek());
            obj.pop();

        }

    }

}
