//Student Name: Narek Bayramyan              
//LSU ID: 893511902
//Lab Teaching Assistant name:

//#Peace For Armenia
//#Peace For Artsakh
//#STOPTurkeySTOPAzerbaijanSTOPTerrorism
//#ArmeniaAgainstTerrorism
package Project6;

public class Utilities 
{
    
    public static long recursiveFib(int n)
    {
        long retValue;
        if(n <= 2)
        { return 1;
        }
        
        else  retValue = recursiveFib(n-1) + recursiveFib(n-2); 
        return retValue;
    }
    public static long iterativeFib(int n)
    {
        long retValue;
      
        if (n <= 2)
        {
            retValue = 1; 
        }
         
        else   
        {
            
            long oldValue = 1;
            long olderValue = 1;
            long newValue = 1;
            
            for(int i = 3; i <= n; i++)
            {
            newValue = oldValue + olderValue;
            olderValue = oldValue;
            oldValue = newValue;
            }
            retValue = newValue;      
        }
        return retValue;     
    }  
}

