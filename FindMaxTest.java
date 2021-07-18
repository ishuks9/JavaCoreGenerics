/*
 * Generic Class To Find Max Values
 */
public class FindMaxTest<E extends Comparable<E>> {
   
    
    
   
	 E i,j,k;

    

    public FindMaxTest(E i, E j, E k) {
		// TODO Auto-generated constructor stub
    	 this.i = i;
    	 this.j=j;
    	 this.k=k;
	}


    //Method to Find Max Value
    public <E extends Comparable<E>> E findMaxValue(E i, E j,E k) {
    	E max=i;
        if (j.compareTo(max)>0)  {
            max=j;
           
        } if (k.compareTo(max)>0)
        		{
        	     max=k;
        	    
        		}
          return max;
        }
    
     public static void main(String[] args) {
    	 
			FindMaxTest findmax = new FindMaxTest("capgemini","tcs","cognizant");
			
			 findmax.findMaxValue("capgemini","tcs","cognizant");
			 System.out.println(findmax);
		}
}


