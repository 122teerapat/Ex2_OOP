import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Ex2 {
    public static final int MAX = 5;
    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");

        List<Integer> nums = getInput();
        sortList(nums);
        printList(nums);
    }
    
    public static List<Integer> getInput(){
        Scanner inp = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
            
            System.out.println("Enter 5 valid integers in the range [0, 10]");
            
            while(nums.size() < MAX) {
                
                String s = inp.nextLine();
                
                if (checkIntType(s) && checkRange(Integer.parseInt(s))) {
                    nums.add(Integer.parseInt(s));
                }
            
            }
            inp.close();
            return nums;
    }
    
    public static boolean checkIntType(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return false;
        }   
    }

    public static boolean checkRange(int num){
        if(num<0 || num > 10) {
            System.out.println("Invalid range! Try again!");
            return false;
        } 
        return true;   
    }

    public static void sortList(List<Integer> numList){
        Collections.sort(numList);
    }

    public static void printList(List<Integer> numList){
         for(int num : numList)
                System.out.print(num+" ");
    }
}