import java.util.Scanner;
public class Arrays {
    static Scanner input = new Scanner(System.in);
    public static void reader(){
        int myArray[] = new int[10];
        for (int x=0; x< myArray.length;x++){
            System.out.println("Enter Array element " + (x+1));
            myArray[x]= input.nextInt();
        }
        for (int k=0; k<10;k++){
            System.out.print(myArray[k]+ " ,");
        }
        System.out.println("\n After sorting: ");
        Sort(myArray,myArray.length);
    }
    public static void Sort(int[]numbers, int s){
        int temp;
        for(int i=0; i<s; i++){
            for(int j=0; j<(s-1); j++){
                if (numbers[j]<numbers[j+1]){
                    temp = numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        for (int x : numbers){
            System.out.print(x + " ,");
        }
    }

    public static void main(String[] args){
        reader();
    }
}
