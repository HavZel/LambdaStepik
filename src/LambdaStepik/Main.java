package LambdaStepik;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<Double, Double, Double> SumFunction = GetSumLambda();
        double result = SumFunction.apply(5.3, 2.44);
        System.out.println(result);
    }

    private static BiFunction<Double, Double, Double> GetSumLambda( ) {
        return (Double first, Double second) -> (first + second);
    }
}
