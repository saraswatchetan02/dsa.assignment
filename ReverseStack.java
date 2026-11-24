
package Stack;

class ReverseNode {
    int data;
    ReverseNode next;

    ReverseNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class ReverseStackClass {
    ReverseNode top;

    void push(int data) {
        ReverseNode newNode = new ReverseNode(data);
        newNode.next = top;
        top = newNode;
    }

    int pop() {
        if (top == null) {
            return -1;
        }

        int value = top.data;
        top = top.next;
        return value;
    }

    boolean isEmpty() {
        return top == null;
    }

    void display() {
        ReverseNode temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class ReverseStack {
    public static void main(String[] args) {

        ReverseStackClass st1 = new ReverseStackClass();
        ReverseStackClass st2 = new ReverseStackClass();

        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);

        System.out.print("Original Stack: ");
        st1.display();

        // Transfer elements to another stack
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }

        System.out.print("Reversed Stack: ");
        st2.display();
    }
}
