package zhiming.github.niuke.test1207;

import java.util.Stack;

//判断链表中是否有环
public class lc0109 {
    public boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }
        //定义快慢指针
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            //快指针是慢指针的两倍速度
            slow = slow.next;
            fast = fast.next.next;
            //记录快慢指针第一次相遇的结点
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

//用两个栈实现队列
class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        //push直接压入stack1
        stack1.push(node);
    }

    public int pop() {
        //pop当stack2不为空时，直接pop stack2的栈顶元素
        if(!stack2.empty()) {
            return stack2.pop();
        } else {        //当stack2为空时，将stack1中所有元素压入stack2中，再弹出stack2的栈顶元素
            if(!stack1.empty()) {
                while(!stack1.empty()) {
                    stack2.push(stack1.pop());
                }
                return stack2.pop();
            } else {        //当stack1和stack2都为空时，报错
                return -1;
            }
        }
    }
}

//二分查找有重复数字的升序数组
class solution {
    int search (int[] nums, int target) {
        if(nums.length == 0) {
            return -1;
        }
        int low = 0, high = nums.length - 1;
        int mid = (low + high) / 2;
        //注意等号，防止元素漏掉
        while(low <= high) {
            if(nums[mid] < target) {
                //+1和-1的操作，排除更多元素，防止进入死循环
                low = mid + 1;
            } else if(nums[mid] > target) {
                high = mid - 1;
            } else {
                //找到第一个出现target的index
                while(mid >= 0 && nums[mid] == target) {
                    mid--;
                }
                return mid + 1;
            }
            mid = (low + high) / 2;
        }
        return -1;
    }
}
