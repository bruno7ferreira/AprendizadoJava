package aprendizadoJava.calculos;

import java.math.*;

public class CalculoComBigDecimal {

    public static void main(String[] args) {

        BigDecimal num1 = new BigDecimal("2.0");
        BigDecimal num2 = new BigDecimal("3.0");
        BigDecimal xResult = num2.subtract(num1);
        System.out.println(xResult);

        xResult = num1.add(BigDecimal.valueOf(5.2));
        System.out.println(xResult);
        xResult = num1.pow(2);
        System.out.println(xResult);
        BigDecimal num3 = new BigDecimal(10.0);



    }
}
