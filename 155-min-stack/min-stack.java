class MinStack {
    Stack<Integer> obj=new Stack<>();
    Stack<Integer> minStack=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        if(obj.isEmpty())
        {
            obj.push(value);
        }
        else{
            obj.push(Math.min(value,obj.peek()));
        }
        minStack.push(value);     
    }
    
    public void pop() {
        obj.pop();
        minStack.pop();
    }
    
    public int top() {
        return minStack.peek();
    }
    
    public int getMin() {
        int ans=obj.peek();
        return ans;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */