package cl.siatec.dev.sgisystem.dmasterbasicservice.service;

import cl.siatec.dev.sgisystem.dmasterbasicservice.entity.TypeStatus;

import java.util.List;

public interface TypeStatusService {

    public TypeStatus findById(Long id);
    public List<TypeStatus> findAll();
    public List<TypeStatus> findByName(String name);

    public TypeStatus createTypeStatus(TypeStatus typeStatus);
    public TypeStatus updateTypeStatus(TypeStatus typeStatus);
    public TypeStatus deleteTypeStatus(Long id);

}
