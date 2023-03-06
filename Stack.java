class Stack{
    int size;
    int top;
    int[] arr;

    Stack(int capacity){
        size = capacity;
        top = -1;
        arr = new int[size];
    }

    boolean isFull(){
        return (top == size-1);
    }

    boolean isEmpty(){
        return (top == -1);
    }

    void push(int element){
        if(isFull){
            System.out.println("Stack overflow");
        }else{
            arr[top + 1] = element;
            top++;
        }
    }

    int pop(){
        if(isEmpty){
            System.out.println("Stack underflow");
            return 0;
        }else{
            previousTop = top;
            top--;
            return arr[previousTop];
        }
    }
}