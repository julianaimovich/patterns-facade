public class BinOps {

    public String sum(String a, String b) {
        Integer firstNumber = Integer.parseInt(a, 2);
        Integer secondNumber = Integer.parseInt(b, 2);
        return Integer.toBinaryString(firstNumber + secondNumber);
    }

    public String mult(String a, String b) {
        Integer firstNumber = Integer.parseInt(a, 2);
        Integer secondNumber = Integer.parseInt(b, 2);
        return Integer.toBinaryString(firstNumber * secondNumber);
    }
}