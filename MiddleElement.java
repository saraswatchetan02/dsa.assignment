
package Stack;

class MiddleNode {
    int data;
    MiddleNode next;

    MiddleNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class MiddleStack {
    MiddleNode top;

    void push(int data) {
        MiddleNode newNode = new MiddleNode(data);
        newNode.next = top;
        top = newNode;
    }

    boolean isEmpty() {
        return top == null;
    }

    void findMiddle() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        MiddleNode slow = top;
        MiddleNode fast = top;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle Element: " + slow.data);
    }

    void display() {
        MiddleNode temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class MiddleElement {
    public static void main(String[] args) {

        MiddleStack st = new MiddleStack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.print("Stack: ");
        st.display();

        st.findMiddle();
    }
}
