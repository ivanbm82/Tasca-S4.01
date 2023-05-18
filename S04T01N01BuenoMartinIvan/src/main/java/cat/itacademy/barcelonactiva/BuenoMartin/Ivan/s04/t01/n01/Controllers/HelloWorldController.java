package cat.itacademy.barcelonactiva.BuenoMartin.Ivan.s04.t01.n01.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(defaultValue = "UNKNOWN") String name) {
        return "Hola, " + name + ". Estàs executant un projecte Maven.";
    }
    @GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{name}"})
    public String saluda2(@PathVariable(required = false) String name) {
        if (name == null) {
            name = "UNKNOWN";
        }
        return "Hola, " + name + ". Estàs executant un projecte Maven.";
    }
}
