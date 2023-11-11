public class Day_12_Number_following_a_pattern {
    static class Solution {
        public static String printMinNumberForPattern(String S) {
            // code here
            String result = "";
            stack s1 = new stack();
            int n = S.length();
            for (int i = 0; i <= n; i++) {
                s1.push(i + 1);
                if (S.charAt(i % n) == 'I' || i == n) {
                    while (!s1.isEmpty()) {
                        result += s1.peek() + "";
                        s1.pop();
                    }
                }

            }
            return result;
        }

        static class stack {
            node top;
            int size;

            public stack() {
                size = 0;
                top = null;
            }

            public void push(int data) {
                top = new node(data, top);
                size++;
            }

            public void pop() {
                top = top.next;
                size--;
            }

            public int peek() {
                return top.data;

            }

            public boolean isEmpty() {
                return size == 0;
            }

            class node {
                int data;
                node next;

                public node(int data, node next) {
                    this.data = data;
                    this.next = next;
                }
            }
        }
    }
}
