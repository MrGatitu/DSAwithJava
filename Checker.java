// Returns the index of the position of a certain number in the array

public class Checker{

    public static void main(String[] args) {
        int numbers [] = {23, 8, 9, 3, 10, 15};
        int target = 3;
        Checker checker = new Checker();
    
        int index = Checker.checkNumber(numbers, target);

        if (index != -1) {
            System.out.println("Index of "+ target +" is at: "+ index);
        }
    
      
    
    }

    public static int checkNumber(int[]array, int target){
        for(int i = 0; i < array.length;i++){

            if (array[i]==target) {
                return i;   
            }
    
        }
        return -1;
        
    }



}