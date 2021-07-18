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

    private void printMax(Integer max) {
        System.out.println("Largest = " + max);
    }
    
    public static void main(String[] args) {
		FindMaxTest findmax= new FindMaxTest();
		findmax.findMaxValue(10, 20, 30);
	}
}
