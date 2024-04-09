package pro.sky.skyprospringhw2.st;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String hello() {
        return calculatorService.hello();
    }


    @GetMapping(path = "/calculator/plus?num1=5&num2=5")
    public String plus(@RequestParam("num1") Integer numOne,
                       @RequestParam("num2") Integer numTwo) {
        if (numOne == null)
            return "Ошибка параметра1";
        if (numTwo == null)
            return "Ошибка параметра2";
        return calculatorService.plusNumber(numOne, numTwo);
    }

    /*@GetMapping(path = "/hello")
    public String answerHello(@RequestParam("name") String userName) { //http://localhost:8080/hello?name=Плюха
        return calculatorService.answerHello(userName);
    }*/
}
