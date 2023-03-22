package co.edu.uceva.pais_service.controller;

import co.edu.uceva.pais_service.model.entities.Pais;
import co.edu.uceva.pais_service.model.service.IPaisSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return paisSevice.findAll();
    }

    @GetMapping("/paises/{id}")
    public Pais buscarPais(@PathVariable("id") Long id){
        return paisSevice.findById(id);
    }

    @PostMapping("/paises")
    public Pais crearPais(@RequestBody Pais pais){
        return paisSevice.save(pais);
    }

    @DeleteMapping("/paises/{id}")
    public void borrarPais(@PathVariable("id") Long id){
        Pais pais;
        pais=paisSevice.findById(id);
        paisSevice.delete(pais);
    }

    @PutMapping("/paises")
    public Pais actualizarPais(@RequestBody Pais pais){
        return paisSevice.update(pais);
    }


}
