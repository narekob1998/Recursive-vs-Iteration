//Student Name: Narek Bayramyan
//LSU ID: 893511902
//Lab Teaching Assistant name:

//#Peace For Armenia
//#Peace For Artsakh
//#STOPTurkeySTOPAzerbaijanSTOPTerrorism
//#ArmeniaAgainstTerrorism
package Project6;
public class Project6 {

    public static void main(String[] args) 
    {
        System.out.println("#ArmeniaAgaistTerrorism#ArmeniaAgainstTurkey#ArmeniaAgainstAzerbaijan");
        System.out.println("============================================================\n");
        
        System.out.printf("%-15s %-15s %-15s %-15s\n","x","fib(x)"
                ,"Recursive (ns)", "Iterative (ns)");
        System.out.println("============================================================");
        
        for(int x = 10; x<=50; x+=10)
        {
            long fib = Utilities.recursiveFib(x);
            long iter = Utilities.iterativeFib(x);
            
            long start1= System.nanoTime(); 
            Utilities.recursiveFib(x);
            long elapsed1 = System.nanoTime() - start1;
          
            long start2= System.nanoTime(); 
            Utilities.iterativeFib(x);
            long elapsed2 = System.nanoTime() - start2;
          
            System.out.printf("%-15d %-15d %-15d %-15d\n",x,iter,elapsed1
                    ,elapsed2);
        }
        System.out.println("============================================================");
        System.out.println("#ArmeniaAgaistTerrorism#ArmeniaAgainstTurkey#ArmeniaAgainstAzerbaijan");
        
        
    }
}
