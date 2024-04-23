package com.walker.learningaboutspringboot1.ExamplesAPIS;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    //Methods controller:
    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception{
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new Exception();
        }
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }
    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception{
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new Exception();
        }
        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }
    @RequestMapping(value = "/mul/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mul(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception{
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new Exception();
        }
        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }
    @RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double div(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception{
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new Exception();
        }
        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }
    //Helper methods:
    private boolean isNumeric(String strNumber) {
        if (strNumber == null) {
            return false;
        } else {
            String number = strNumber.replaceAll(",",".");
            return number.matches("[-+]?[0-9]*\\.?[0-9]+");
        }
    }
    private Double convertToDouble(String strNumber) {
        if (strNumber == null) {
            return 0D;
        }
        else {
            String number = strNumber.replaceAll(",",".");
            if (isNumeric(number)) {
                return Double.parseDouble(number);
            }
        }
        return 0D;
    }

}
