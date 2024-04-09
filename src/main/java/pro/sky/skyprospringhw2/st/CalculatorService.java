package pro.sky.skyprospringhw2.st;

public interface CalculatorService {
    String hello();

    String plusNumber(@RequestParam("num1") Integer numOne,
                       @RequestParam("num2") Integer numTwo);

    /*String answerHello(String userName);*/
}
