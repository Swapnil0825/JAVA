package Practice;

  public class CWH_33_varargs  {
    // static int sum(int a, int b) {
    //     return a+b;
    // }

    // static int sum(int a, int b, int c) {
    //     return a+b+c;
    // }

    // static int sum(int a, int b, int c, int d) {
    //     return a+b+c+d;
    // }

    static int sum(int ...arr) {
        int result = 0;
        for(int i=0;i<arr.length;i++) {
            result = result + arr[i];
        }
        
        return result;
        
    }

    public static void main(String[] args) {
        System.out.println("Nothing "+sum());
        System.out.println(sum(4,5));
        System.out.println(sum(4,5,3));
         System.out.println(sum(4,5,3,2));
        
    }
}
    
