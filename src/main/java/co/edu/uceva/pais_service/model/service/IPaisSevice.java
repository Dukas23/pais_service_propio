package co.edu.uceva.pais_service.model.service;

import co.edu.uceva.pais_service.model.entities.Pais;

import java.util.List;

public interface IPaisSevice {
    public Pais save(Pais pais);
    public void delete(Pais pais);
    public Pais update(Pais pais);
    public List<Pais> findAll();
    public Pais findById(Long id);
}
