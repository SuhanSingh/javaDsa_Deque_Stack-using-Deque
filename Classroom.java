import java.util.*;
import java.util.LinkedList;
public class Classroom {
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();
        
        public void push(int data) { //O(1)
            deque.addLast(data);
        }

        public int pop() { //O(1)
            return deque.removeLast();
        }

        public int peek() { //O(1)
            return deque.getLast();
        }
    }
    
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek = " + s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
// peek = 3
// 3
// 2
// 1