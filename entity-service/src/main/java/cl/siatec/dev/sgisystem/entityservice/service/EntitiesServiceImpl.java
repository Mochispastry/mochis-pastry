package cl.siatec.dev.sgisystem.entityservice.service;

import cl.siatec.dev.sgisystem.entityservice.entity.Entities;
import cl.siatec.dev.sgisystem.entityservice.repository.EntitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntitiesServiceImpl implements EntitiesService{

    @Autowired
    private EntitiesRepository entitiesRepository;

    @Override
    public Entities findById(Long id) {return entitiesRepository.findById(id).orElse(null); }

    @Override
    public Entities findByRut(String rut) {return entitiesRepository.findByRutIgnoreCase(rut);}

    @Override
    public List<Entities> findByTypeEntity(String typeEntity) {return entitiesRepository.findByTypeEntityIgnoreCase(typeEntity);}

    @Override
    public List<Entities> findByMail(String mail) {return entitiesRepository.findByMail(mail);}

    @Override
    public List<Entities> findByPhone(String phone) {return entitiesRepository.findByPhone(phone); }

    @Override
    public List<Entities> findAll() {return entitiesRepository.findAll();}

    @Override
    public Entities save(Entities entities) {return entitiesRepository.save(entities); }

    @Override
    public Entities update(Entities entities) {
        Entities entitiesDB = findById(entities.getId());
        if (null == entitiesDB){
            return null;
        }
        entitiesDB.setTypeEntity(entities.getTypeEntity());
        entitiesDB.setRut(entities.getRut());
        entitiesDB.setMail(entities.getMail());
        entitiesDB.setPhone(entities.getPhone());
        return entitiesRepository.save(entitiesDB);
    }

    @Override
    public Entities delete(Entities entities) {
        Entities entitiesDB = findById(entities.getId());
        if (null == entitiesDB){
            return null;
        }
        entitiesRepository.delete(entitiesDB);
        return entitiesDB;
    }
}
