package cl.siatec.dev.sgisystem.dmasterbasicservice.service;

import cl.siatec.dev.sgisystem.dmasterbasicservice.entity.SystemImages;
import cl.siatec.dev.sgisystem.dmasterbasicservice.repository.SystemImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class SystemImagesServiceImpl implements SystemImagesService{

    @Autowired
    private SystemImagesRepository systemImagesRepository;

    @Override
    public SystemImages findById(Long id) {return systemImagesRepository.findById(id).orElse(null);}

    @Override
    public SystemImages findByName(String name) { return systemImagesRepository.findByNameIgnoreCase(name);}

    @Override
    public List<SystemImages> findByNameContains(String name) { return systemImagesRepository.findByNameContainsIgnoreCase(name);}

    @Override
    public List<SystemImages> findByFileNameContains(String fileName) {return systemImagesRepository.findByFileNameContainsIgnoreCase(fileName);}

    @Override
    public List<SystemImages> findByCreateAtBetween(Timestamp createAtStart, Timestamp createAtEnd) {
        return systemImagesRepository.findByCreateAtBetween(createAtStart, createAtEnd);
    }

    @Override
    public List<SystemImages> findByUpdateAtBetween(Timestamp updateAtStart, Timestamp updateAtEnd) {
        return systemImagesRepository.findByUpdateAtBetween(updateAtStart, updateAtEnd);
    }

    @Override
    public List<SystemImages> findAll() {
        return systemImagesRepository.findAll();
    }

    @Override
    public SystemImages save(SystemImages systemImages) {
        return systemImagesRepository.save(systemImages);
    }

    @Override
    public SystemImages update(SystemImages systemImages) {

        SystemImages systemImagesDB = findById(systemImages.getId());
        if (systemImagesDB == null) {
            return null;
        }
        systemImagesDB.setName(systemImages.getName());
        systemImagesDB.setImage(systemImages.getImage());
        systemImagesDB.setFileName(systemImages.getFileName());
        return systemImagesRepository.save(systemImagesDB);
    }

    @Override
    public SystemImages delete(Long id) {
        SystemImages systemImagesDB = findById(id);
        if (systemImagesDB == null) {
            return null;
        }
        systemImagesRepository.delete(systemImagesDB);
        return systemImagesDB;
    }
}
