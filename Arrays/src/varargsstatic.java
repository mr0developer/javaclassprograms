public class varargsstatic {
    public static void sum(int...digits){
        int total = 0;
        for (int x:digits){
            total+=x;
        }
        System.out.println("Sum: " + total);
    }
    public static void main(String[] args){
        varargsstatic.sum(2,3,4,5,6);
    }
}
