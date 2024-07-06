package inverte.ya.calculator.calculator.controller;

import inverte.ya.calculator.calculator.dto.CalculatorDTO;
import inverte.ya.calculator.calculator.service.ICalculatorService;
import inverte.ya.calculator.calculator.util.Constant;
import inverte.ya.calculator.calculator.util.WrapperResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculators")
@RequiredArgsConstructor
public class CalculatorController
{
    private final ICalculatorService service;

    @PostMapping("/mortgage")
    public ResponseEntity<WrapperResponse<Double>> calculateMortgage(@RequestBody @Valid CalculatorDTO dto)
    {
        return new WrapperResponse<>(true, Constant.SUCCESS, service.calculateMortgage(dto)).createResponse();
    }
}
