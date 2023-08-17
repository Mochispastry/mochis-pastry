package cl.siatec.dev.sgisystem.dmasterbasicservice.service;

import cl.siatec.dev.sgisystem.dmasterbasicservice.entity.TypeStatus;
import cl.siatec.dev.sgisystem.dmasterbasicservice.repository.TypeStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeStatusServiceImpl implements TypeStatusService {

    @Autowired
    private TypeStatusRepository typeStatusRepository;

    @Override
    public TypeStatus findById(Long id) {return typeStatusRepository.findById(id).orElse(null); }

    @Override
    public List<TypeStatus> findAll() {return typeStatusRepository.findAll();}

    @Override
    public List<TypeStatus> findByName(String name) {return typeStatusRepository.findByNameContainsIgnoreCase(name);}

    @Override
    public TypeStatus createTypeStatus(TypeStatus typeStatus) {return typeStatusRepository.save(typeStatus);}

    @Override
    public TypeStatus updateTypeStatus(TypeStatus typeStatus) {
        TypeStatus typeStatusDB = findById(typeStatus.getId());
        if (typeStatusDB == null) {
            return null;
        }
        typeStatusDB.setName(typeStatus.getName());
        typeStatusDB.setDescription(typeStatus.getDescription());
        return typeStatusRepository.save(typeStatusDB);
    }

    @Override
    public TypeStatus deleteTypeStatus(Long id) {
        TypeStatus typeStatusDB = findById(id);
        if (typeStatusDB == null) {
            return null;
        }
        typeStatusRepository.delete(typeStatusDB);
        return typeStatusDB;
    }
}
