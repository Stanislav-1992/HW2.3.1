package pro.sky.skyprospringhw2.st;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String hello() {
        return "Добро пожаловать в калькулятор54455 + 5 5 5";
    }

    @Override
    public String plusNumber(Integer numOne, Integer numTwo) {
        return numOne + " + " + numTwo + " = " + (numOne + numTwo);
    }

    /*public String answerHello(String userName) {
        return "Hello " + userName;
    }*/

}
