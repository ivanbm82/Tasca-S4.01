package cat.itacademy.barcelonactiva.BuenoMartin.Ivan.s04.t01.n02.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(value = "nom", defaultValue = "UNKNOWN") String nom) {
        return "Hola, " + nom + ". Estàs executant un projecte Gradle.";
    }

    @GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{nom}"})
    public String saluda2(@PathVariable(value = "nom", required = false) String nom) {
        return "Hola, " + (nom != null ? nom : "UNKNOWN") + ". Estàs executant un projecte Gradle.";
    }
}