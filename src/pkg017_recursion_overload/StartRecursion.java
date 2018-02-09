package pkg017_recursion_overload;
/**
 *
 * @author compsci
 */
public class StartRecursion {
    
    public static void main(String[] args) {
        int n = 10;
        recurse(n);
        
        System.out.println();
        n = 0;
        recurseUp(n);
        
        System.out.println();
        int startValue = 0;
        int stopValue = 50;
        recurseEvens(startValue, stopValue);
        
        System.out.println();
        
        recurseEvens(startValue, stopValue);
         
    }

    private static void recurse(int n) {
       System.out.println("We have done recurse " + n + " on this recursion pass");
        n--;
        if (n >= 0){
           recurse(n);
       }
    
 
    }
    
    private static void recurseUp(int n) {
       System.out.println("recurseUp value is " + n + " on this recursion pass") ;
        n++;
        if (n <= 10){
           recurseUp(n);
       }
    
    }
    
    /**
     * Display even numbers from startValue inclusive
     * to stopValue exclusive
     * shouldn't go to 50 so less than 50 because exclusive
     * @param startValue
     * @param stopValue 
     */
    
    //MODULE METHOD (%)
    private static void recurseEvens(int startValue, int stopValue){
        int countValue = startValue;
        if (countValue%2==0){
        System.out.println("recurseEvens value is " + countValue + " on this recursion pass") ; 
        }
        countValue++;
        if (countValue < stopValue){
           recurseEvens(countValue,stopValue);
    }
   
    }
    
    
    
   }//end of class

//overload definition: methods have the same name but differ in pass parms
//and that is how Java tells them apart

/**
 * Graded assignment #1 on Feb 5:
 * 1. JavaDoc all of this (explain how we overload this and need a non module method example)
 * 2. Figure out how to Git and Github this (google it)
 * 3. Show the JavaDoc and Github for a gradeS
 */