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

    public float divide (Integer numOne, Integer numTwo) {
        if (numOne == null) {
            return Float.parseFloat("Ошибка: отсутствует параметр №1");
        }
        if (numTwo == null) {
            return Float.parseFloat("Ошибка: отсутствует параметр №2");
        }
        if (numTwo == 0) {
            throw new DivisionByZeroException("Деление на ноль запрещено!");
        }
        return (float) numOne / numTwo;
    }
}
