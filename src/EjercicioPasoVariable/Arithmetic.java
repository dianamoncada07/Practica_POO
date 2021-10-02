package src.EjercicioPasoVariable;

public class Arithmetic {
    public void sum (Result operationSum, int a, int b){
        int result = a + b;
        operationSum.setResultSum(result);
    }
    public void subtraction (Result operationSub, int a, int b){
        int result = a - b;
        operationSub.setResultSubtraction(result);

    }
    public void multiplication (Result operationMul, int a, int b){
        int result = a * b;
        operationMul.setMultiplication(result);
    }
    public void division(Result operationDiv, float a, float b){
        float result = a/b;
        operationDiv.setDivision(result);
    }
}
