package ss11_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckSNT {
    public static void useStack(int number) {
        Stack<Integer> stack = new Stack<>();
       stack.add(2);
        for (int i = 3; i <= number; i++) {
            boolean flag = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            if (flag) {
              stack.add(i);
            }
        }
        System.out.println(stack);
    }

    public static void useQueue(int number) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        for (int i = 3; i <= number; i++) {
            boolean flag1 = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag1 = false;
                    break;
                } else {
                    flag1 = true;
                }
            }
            if (flag1) {
                queue.add(i);
            }
        }
        System.out.println(queue);


    }
}
