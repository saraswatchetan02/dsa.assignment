
package Stack;

class CharNode {
    char data;
    CharNode next;

    CharNode(char data) {
        this.data = data;
        this.next = null;
    }
}
class CharStack {
    CharNode top;

    void push(char ch) {
        CharNode newNode = new CharNode(ch);
        newNode.next = top;
        top = newNode;
    }
    char pop() {
        if (top == null) {
            return '\0';
        }
        char ch = top.data;
        top = top.next;
        return ch;
    }

    boolean isEmpty() {
        return top == null;
    }
}

public class Reverse_String {
    public static void main(String[] args) {
        String str = "HELLO";
        CharStack st = new CharStack();
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }
        String result = "";
        while (!st.isEmpty()) {
            result += st.pop();
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + result);
    }
}
