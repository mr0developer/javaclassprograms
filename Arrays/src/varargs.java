public class varargs {
    public  void sum(int...digits){
        int total = 0;
        for (int x:digits){
            total+=x;
        }
        System.out.println("Sum: " + total);
    }
    public static void main(String[] args){
        varargs s1 = new varargs();
        s1.sum(2,3,4,5,6);
    }
}
