
package Stack;

class PalindromeNode {
    char data;
    PalindromeNode next;

    PalindromeNode(char data) {
        this.data = data;
        this.next = null;
    }
}

class PalindromeStack {
    PalindromeNode top;

    void push(char ch) {
        PalindromeNode newNode = new PalindromeNode(ch);
        newNode.next = top;
        top = newNode;
    }

    char pop() {
        char ch = top.data;
        top = top.next;
        return ch;
    }

    boolean isEmpty() {
        return top == null;
    }
}

public class Palindrome {
    public static void main(String[] args) {

        String str = "MADAM";

        PalindromeStack st = new PalindromeStack();

        // Push all characters
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }

        boolean flag = true;

        // Compare original and reversed characters
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != st.pop()) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
