class CustomStack {

    Stack<Integer> stack = new Stack();

    int maxSize = 0;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
    }

    public void push(int x) {
        if (stack.size() < maxSize) {
            stack.add(x);
        }
    }

    public int pop() {
        if (stack.isEmpty()) {
            return -1;
        } else
            return stack.pop();
    }

    public void increment(int k, int val) {
        if (stack.size() <= k) {
            Stack<Integer> q = new Stack();

            while (!stack.isEmpty()) {
                q.add(stack.pop() + val);
            }

            while (!q.isEmpty()) {
                stack.add(q.pop());
            }

        } else {

            Stack<Integer> q = new Stack();
            int left = 0 ;
            int size = stack.size() - k;
            while (!stack.isEmpty() && left < size) {
                q.add(stack.pop());
                left++;
            }

            while (!stack.isEmpty()) {
                if(k > 0){
                    q.add(stack.pop() + val);
                    k--;
                }else{
                    q.add(stack.pop());
                }
            }

            while (!q.isEmpty()) {
                stack.add(q.pop());
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */