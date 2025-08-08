import java.util.*;

class Calculator {
    private double operandOne, operandTwo;
    private char operator;
    private String result;

    Calculator(double operandOne, double operandTwo, char operator) {
        this.operandOne = operandOne;
        this.operandTwo = operandTwo;
        this.operator = operator;
    }

    private void setResult(String result) {
        this.result = result;
    }

    private void performOperation(char operator) {
        switch(operator) {
            case '+':
                this.setResult(String.valueOf(this.operandOne + this.operandTwo));
                break;
            case '-':
                this.setResult(String.valueOf(this.operandOne - this.operandTwo));
                break;
            case '*':
                this.setResult(String.valueOf(this.operandOne * this.operandTwo));
                break;
            case '/':
                this.setResult(String.valueOf(this.operandOne / this.operandTwo));
                break;
            default:
                this.setResult("Invalid.");
        }
    }

    public String getResult() {
        this.performOperation(this.operator);
        return this.result;
    }

}

class Program1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        double operandOne = scanner.nextDouble();
        double operandTwo = scanner.nextDouble();
        char operator = scanner.next().charAt(0);

        Calculator calculator = new Calculator(operandOne, operandTwo, operator);

        System.out.println(calculator.getResult());
    }
}