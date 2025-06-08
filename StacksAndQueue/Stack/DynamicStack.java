package StacksAndQueue.Stack;

public class DynamicStack extends CustomStack{
    
    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int value){
        if(this.isFull()){
            int[] newStack = new int[stack.length * 2];
            for(int i = 0; i < stack.length; i++){
                newStack[i] = stack[i];
            }
            stack = newStack;
            System.out.println("Stack is full. Resizing to " + stack.length);
        }
        return super.push(value);
    }
}

