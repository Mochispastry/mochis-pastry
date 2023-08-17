package cl.siatec.dev.sgisystem.dmasterbasicservice.service;

import cl.siatec.dev.sgisystem.dmasterbasicservice.entity.Status;

import java.util.List;

public interface StatusService {

    public Status findById(Long id);
    public List<Status> findAll();
    public List<Status> findByName(String name);
    public List<Status> findByTypeStatusId(Long id);

    public Status createStatus(Status status);
    public Status updateStatus(Status status);
    public Status deleteStatus(Long id);

}
