package pro.sky.skyprospringhw2.st;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    public String plus(int numOne, int numTwo) {
        return numOne + " + " + numTwo + " = " + (numOne + numTwo);
    }

    public String minus (int numOne, int numTwo) {
        return numOne + " - " + numTwo + " = " + (numOne - numTwo);
    }

    public String multiply (int numOne, int numTwo) {
        return numOne + " * " + numTwo + " = " + (numOne * numTwo);
    }

    public String divide (Float numOne, Float numTwo) {
        return numOne + " / " + numTwo + " = " + DemicalFormat.df.format(numOne / numTwo);
    }


}
