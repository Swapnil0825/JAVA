package Queue;

public class ArrayImplementation {

    public static class Stack {
        int arr[] = new int[5];
        int r , f = -1;
        int Size = 0;


        void add(int data) {
            if(f==-1) {
                r=0;
                f=0;
                arr[0] = data;
                Size++;
            } else {
                arr[++r] = data; 
                Size++;
            }
        }

        int remove() {
            int x = arr[f];
            arr[f]=0;
            f=f+1;
            return x;

        }

        int peek() {
             int x = arr[f];
             return x;
        }

        boolean isEmpty() {
            if(r==-1 && f==-1){
                return true;
            }
            return false;
        }

        boolean isFull() {
            if(Size== 5) {
                return true;
            }
            return false;
        }



        void display() {
            for(int i=f;i<=r;i++)  {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st.peek());
        st.display();
        st.remove();
        st.display();
        st.add(4);
        st.display(); 
        System.out.println(st.isFull());
        st.add(5);
         System.out.println(st.isFull());
    }
    
}
