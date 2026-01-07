package com.eduar.firsteps.infrastructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

/*Autowired, Realiza la inyeccion de dependicias automatica (sroing busca la instancia necesaria y la asigna) */
/*Service, marcan clases como logica de negocio o acceso o datos, repctivamente, para que los spring las gestione */
@RestController  /* Con esto decimos que esta clase va a tener un 
comportamiento especial, define una clase como un contrlador web que retorna datados, directamente, no vistas en html */
@RequestMapping ("api/v1")  /*La ruta que le vamos a definir, represntar un post, get, define la ruta URL base para los endpoints del controlador*/
public class HelloWorldController {

    @GetMapping("/greetings")  /* MApea solicitures HTTP GET a un metodo especifivo */
    public String holaMundo(@RequestParam(name = "name", defaultValue = "Ponscia") String nombre){
        return "Hola " + nombre + " Camper";
    }

    @GetMapping("/json")
    public Map<String, String> getMethodName(@RequestParam String name){
        Map<String, String> reponse = new HashMap<>();
        reponse.put("greeting" , "Hellou everinain");
        reponse.put("user", name);
        return reponse;
    }
}
/*inyecta valos de configuracion  defnidios externamiente, desde aplicacion properties
 */