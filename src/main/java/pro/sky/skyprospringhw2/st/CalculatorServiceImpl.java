package pro.sky.skyprospringhw2.st;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    public int plus(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public int minus (int numOne, int numTwo) {
        return numOne - numTwo;
    }

    public int multiply (int numOne, int numTwo) {
        return numOne * numTwo;
    }

    public float divide (int numOne, int numTwo) {
        if (numTwo==0) {
            throw new DivisionByZeroException();
        }
        return (float) numOne / numTwo;
    }
}
