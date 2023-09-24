package cl.siatec.dev.sgisystem.entityservice.service;

import cl.siatec.dev.sgisystem.entityservice.entity.Entities;

import java.util.List;

public interface EntitiesService {

    public Entities findById(Long id);
    public Entities findByRut(String rut);

    public List<Entities> findByTypeEntity(String typeEntity);

    public List<Entities> findByMail(String mail);

    public List<Entities> findByPhone(String phone);

    public List<Entities> findAll();

    public Entities save(Entities entities);
    public Entities update(Entities entities);
    public Entities delete(Entities entities);

}
