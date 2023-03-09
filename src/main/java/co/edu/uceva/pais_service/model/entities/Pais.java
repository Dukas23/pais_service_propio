package co.edu.uceva.pais_service.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor//constructor con datos dentro
@NoArgsConstructor//Constructor vacio
public class Pais {
    private long id;
    private String nombre;

}
