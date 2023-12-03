package Stack;


public class ArrayImplementation {

    public static class Stack {
        int arr[] = new int[5];
        int indx = 0;

        
        void push(int data) {
            arr[indx] = data;
            indx++;
        }

        int peek() {
            if(indx==0) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = arr[indx - 1];
            return top;
        }

        int pop() {
            int top = arr[indx - 1];
            arr[indx - 1] = 0;
            indx--;
            return top;
        }
        void disaplay() {
            for(int i=0;i<indx;i++) {
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }

        int Size () {
            return indx;
        }

        boolean isFull() {
            if(indx == 5 ) {
                return true;
            }
            return false;
        }

        boolean isEmpty() {
            if(indx==0) {
                return true;
            }
            return false;
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack(); 
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        // st.disaplay();
        // System.out.println(st.peek());
    
        while (!st.isEmpty()) {
          System.out.println(st.peek());
          st.pop();  
        }
      

    }

   
    
}
