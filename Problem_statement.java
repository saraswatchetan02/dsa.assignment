
package Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top;
    int count = 0;

    // Check whether stack is empty
    boolean isEmpty() {
        return top == null;
    }

    // Insert element at top
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        count++;

        System.out.println(data + " inserted");
    }

    // Remove top element
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = top.data;
        top = top.next;
        count--;

        System.out.println(value + " removed");
        return value;
    }

    // Return top element
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return top.data;
    }

    // Return total elements
    int size() {
        return count;
    }

    // Display stack elements
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }
}

public class Problem_statement {
    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.print("Stack: ");
        st.display();

        System.out.println("Peek: " + st.peek());

        st.pop();

        System.out.print("Stack: ");
        st.display();

        System.out.println("Size: " + st.size());

        System.out.println("Is Empty: " + st.isEmpty());

        st.pop();
        st.pop();

        System.out.println("Is Empty: " + st.isEmpty());

        st.pop();
    }
}
