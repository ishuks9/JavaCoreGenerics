import java.util.Arrays;

/*
 * Generic Class To Find Max Values
 */
public class FindMaxTest<E extends Comparable<E>> {
    E[] values;

    @SafeVarargs
    public FindMaxTest(E... values) {
        this.values = values;
    }

    public E findMaxValue() throws FindMaxException {
        if (values.length == 0) {
            throw new FindMaxException("No Elements to Compare");
        } else {
            Arrays.sort(values);
            printMax(values[values.length - 1]);
            return values[values.length - 1];
        }
    }

    /*
     *Method to print Max Value
     * @param is Generic Value
     */
    public void printMax(E value) {
        System.out.println("Max Value = " + value);
    }

     public static void main(String[] args) {
    	 
			FindMaxTest findmax = new FindMaxTest("capgemini","tcs","cognizant");
			
			 try {
				findmax.findMaxValue();
			} catch (FindMaxException e) {
			
				e.printStackTrace();
			}
			
		}
}


