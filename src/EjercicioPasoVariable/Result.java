package src.EjercicioPasoVariable;

public class Result {
    private int resultSum;
    private int resultSubtraction;
    private int multiplication;
    private float division;

    public int getResultSum(){
        return resultSum;
    }
    public int getResultSubtraction(){
        return  resultSubtraction;
    }
    public int getMultiplication(){
        return multiplication;
    }
    public float getDivision(){
        return division;
    }

    public void setResultSum(int result){
        this.resultSum = resultSum;
    }

    public void setResultSubtraction(int result){
        this.resultSubtraction = resultSubtraction;
    }
    public void setMultiplication(int result){
        this.multiplication = multiplication;
    }

    public void setDivision(float result){
        this.division = division;
    }

}
