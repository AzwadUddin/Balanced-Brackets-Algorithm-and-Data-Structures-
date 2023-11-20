public class Stack {
    private SinglyLinkedList list;
    private int top;

    public Stack(){
        list = new SinglyLinkedList();
        top = -1;
    }

    public void push(Object input){
        top++;
        list.addLast(input);
    }

    public Object pop(){
        top--;
        return(list.removeLast());
    }

    public Object top(){
        if(top == -1){
            return("Stack is empty");
        }

        else{
            return(list.getLast());
        }
    }

    public boolean isEmpty(){
        if(top == -1){
            return(true);
        }

        else{
            return(false);
        }
    }
}