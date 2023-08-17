package cl.siatec.dev.sgisystem.dmasterbasicservice.service;

import cl.siatec.dev.sgisystem.dmasterbasicservice.entity.SystemImages;

import java.sql.Timestamp;
import java.util.List;

public interface SystemImagesService {

    public SystemImages findById(Long id);
    SystemImages findByName(String name);
    List<SystemImages> findByNameContains(String name);

    List<SystemImages> findByFileNameContains(String fileName);

    List<SystemImages> findByCreateAtBetween(Timestamp createAtStart, Timestamp createAtEnd);

    List<SystemImages> findByUpdateAtBetween(Timestamp updateAtStart, Timestamp updateAtEnd);

    public List<SystemImages> findAll();

    public SystemImages save(SystemImages systemImages);
    public SystemImages update(SystemImages systemImages);

    public SystemImages delete(Long id);

}
