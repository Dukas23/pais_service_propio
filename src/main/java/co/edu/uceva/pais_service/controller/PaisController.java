package co.edu.uceva.pais_service.controller;

import co.edu.uceva.pais_service.model.entities.Pais;
import co.edu.uceva.pais_service.model.service.IPaisSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pais-service")
public class PaisController {
    @Autowired
    IPaisSevice paisSevice;

    /**
     * Endpoint para recibir un saludo
     * @param nombre es el nombre que envian desde la url
     * @return Un saludo
     */
    @GetMapping("/hola/{nombre}")
    public String imprimir(@PathVariable("nombre") String nombre){
        return "hola esto es una prueba " +nombre;
    }
    @GetMapping("/paises")
    public List<Pais>listar(){
        List <Pais> paises= new ArrayList<>();
        Pais pais1 = new Pais(1l,"Colombia");
        Pais pais2 = new Pais(2l, "Ecuador");
        paises.add(pais1);
        paises.add(pais2);

        return paises;
    }
}
