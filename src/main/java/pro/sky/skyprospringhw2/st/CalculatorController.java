package pro.sky.skyprospringhw2.st;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String hello() {
        return calculatorService.hello();
    }


    @GetMapping(path = "/plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer numOne,
                       @RequestParam(value = "num2", required = false) Integer numTwo) {
        if (numOne == null)
            return "Ошибка: отсутствует параметр №1";
        if (numTwo == null)
            return "Ошибка: отсутствует параметр №2";
        return calculatorService.plus(numOne, numTwo);
    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer numOne,
                        @RequestParam(value = "num2", required = false) Integer numTwo) {
        if (numOne == null)
            return "Ошибка: отсутствует параметр №1";
        if (numTwo == null)
            return "Ошибка: отсутствует параметр №2";
        return calculatorService.minus(numOne, numTwo);
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer numOne,
                           @RequestParam(value = "num2", required = false) Integer numTwo) {
        if (numOne == null)
            return "Ошибка: отсутствует параметр №1";
        if (numTwo == null)
            return "Ошибка: отсутствует параметр №2";
        return calculatorService.multiply(numOne, numTwo);
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) Float numOne,
                           @RequestParam(value = "num2", required = false) Float numTwo) {
        if (numOne == null)
            return "Ошибка: отсутствует параметр №1";
        if (numTwo == null)
            return "Ошибка: отсутствует параметр №2";
        if (numTwo == 0)
            return "Ошибка: на 0 делить нельзя!!!";
        return calculatorService.divide(numOne, numTwo);
    }

}
