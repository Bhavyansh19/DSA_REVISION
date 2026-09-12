class MinStack {
    Stack<Integer> stack = new Stack();
    Stack<Integer> minvals = new Stack();
    public MinStack() {
        
    }
    
    public void push(int x) {
        if(minvals.isEmpty() || x <= minvals.peek()){
            minvals.push(x);
        }
        stack.push(x);
    }
    
    public void pop() {
        if(stack.peek().equals(minvals.peek())){
            minvals.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minvals.peek();
    }
}
