package pro.sky.skyprospringhw2.st;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
    private final DemicalFormat demicalFormat;

    /*public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }*/

    /*private final DemicalFormat demicalFormat;*/

    public CalculatorController(CalculatorService calculatorService, DemicalFormat demicalFormat) {
        this.calculatorService = calculatorService;
        this.demicalFormat = demicalFormat;
    }

    @GetMapping()
    public String hello() {
        return calculatorService.hello();
    }


    @GetMapping(path = "/plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer numOne,
                       @RequestParam(value = "num2", required = false) Integer numTwo) {
        if (numOne == null) {
            return "Ошибка: отсутствует параметр №1";
        }
        if (numTwo == null) {
            return "Ошибка: отсутствует параметр №2";
        }
        return numOne + " + " + numTwo + " = " + calculatorService.plus(numOne, numTwo);
    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer numOne,
                        @RequestParam(value = "num2", required = false) Integer numTwo) {
        if (numOne == null) {
            return "Ошибка: отсутствует параметр №1";
        }
        if (numTwo == null) {
            return "Ошибка: отсутствует параметр №2";
        }
        return numOne + " - " + numTwo + " = " + calculatorService.minus(numOne, numTwo);
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer numOne,
                           @RequestParam(value = "num2", required = false) Integer numTwo) {
        if (numOne == null) {
            return "Ошибка: отсутствует параметр №1";
        }
        if (numTwo == null) {
            return "Ошибка: отсутствует параметр №2";
        }
        return numOne + " * " + numTwo + " = " + calculatorService.multiply(numOne, numTwo);
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer numOne,
                           @RequestParam(value = "num2", required = false) Integer numTwo) {
        if (numOne == null) {
            return "Ошибка: отсутствует параметр №1";
        }
        if (numTwo == null) {
            return "Ошибка: отсутствует параметр №2";
        }
        if (numTwo == 0) {
            return "Ошибка: на 0 делить нельзя!!!";
        }
        return String.format(numOne + " / " + numTwo + " = " + demicalFormat.getDf().format(calculatorService.divide(numOne, numTwo)))



                /*DemicalFormat.getDf().format(calculatorService.divide(numOne, numTwo)))*/;
    }

}
