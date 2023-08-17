package cl.siatec.dev.sgisystem.dmasterbasicservice.service;

import cl.siatec.dev.sgisystem.dmasterbasicservice.entity.Status;
import cl.siatec.dev.sgisystem.dmasterbasicservice.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    private StatusRepository statusRepository;


    @Override
    public Status findById(Long id) {return statusRepository.findById(id).orElse(null); }

    @Override
    public List<Status> findAll() {return statusRepository.findAll();}

    @Override
    public List<Status> findByName(String name) {return statusRepository.findByNameContainsIgnoreCase(name);}

    @Override
    public List<Status> findByTypeStatusId(Long id) {return statusRepository.findByTypeStatus_Id(id);}

    @Override
    public Status createStatus(Status status) {return statusRepository.save(status);}

    @Override
    public Status updateStatus(Status status) {
        Status statusDB = findById(status.getId());
        if (statusDB == null) {
            return null;
        }
        statusDB.setName(status.getName());
        statusDB.setDescription(status.getDescription());
        return statusRepository.save(statusDB);
    }

    @Override
    public Status deleteStatus(Long id) {
        Status statusDB = findById(id);
        if (statusDB == null) {
            return null;
        }
        statusRepository.delete(statusDB);
        return statusDB;
    }
}
