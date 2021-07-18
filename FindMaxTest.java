

public class FindMaxTest {

	public Integer findMaxValue(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer max = firstNumber;
        if (secondNumber.compareTo(max) > 0) {
            max = secondNumber;
        }
        if (thirdNumber.compareTo(max) > 0) {
            max = thirdNumber;
        }
        printMax(max);
        return max;
    }
    public Float findMaxValue1(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float max = firstNumber;
        if (secondNumber.compareTo(max) > 0) {
            max = secondNumber;
        }
        if (thirdNumber.compareTo(max) > 0) {
            max = thirdNumber;
        }
        printMax(max);
        return max;
    }

    public String findMaxValue2(String firstNumber, String secondNumber, String thirdNumber) {
        String max = firstNumber;
        if (secondNumber.compareTo(max) > 0) {
            max = secondNumber;
        }
        if (thirdNumber.compareTo(max) > 0) {
            max = thirdNumber;
        }
        printMax(max);
        return max;
    }

    private void printMax(Integer max) {
        System.out.println("Largest = " + max);
    }

    private void printMax(Float max) {
        System.out.println("Largest = " + max);
    }

    private void printMax(String max) {
        System.out.println("Largest = " + max);
    }


    
    public static void main(String[] args) {
    	
		FindMaxTest findmax= new FindMaxTest();
		findmax.findMaxValue(10, 20, 30);
		
		FindMaxTest findmax1= new FindMaxTest();
		findmax1.findMaxValue1(10.5f, 20.5f, 30.5f);
        
		FindMaxTest findmax2= new FindMaxTest();
		findmax2.findMaxValue2("Capgemini","Accenture","Cognizant");

	}
}


