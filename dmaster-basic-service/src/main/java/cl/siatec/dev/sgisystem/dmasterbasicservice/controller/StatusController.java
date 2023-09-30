package cl.siatec.dev.sgisystem.dmasterbasicservice.controller;

import cl.siatec.dev.sgisystem.dmasterbasicservice.entity.Status;
import cl.siatec.dev.sgisystem.dmasterbasicservice.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusController {

    @Autowired
    private StatusService statusService;

    @RequestMapping(value = "/{id}")
    public ResponseEntity<Status> getStatus(@PathVariable("id") Long id) {
        Status statusDB = statusService.findById(id);
        if (statusDB == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(statusDB);
    }

    @RequestMapping(value = "/all")
    public ResponseEntity<List<Status>> getAllStatus() {
        List<Status> statusDB = statusService.findAll();
        if (statusDB.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(statusDB);
    }

    @RequestMapping(value = "/name/{name}")
    public ResponseEntity<List<Status>> getStatusByName(@PathVariable("name") String name) {
        List<Status> statusDB = statusService.findByName(name);
        if (statusDB.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(statusDB);
    }

    @RequestMapping(value = "/typestatusid/{id}")
    public ResponseEntity<List<Status>> getStatusByTypeStatusId(@PathVariable("id") Long id) {
        List<Status> statusDB = statusService.findByTypeStatusId(id);
        if (statusDB.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(statusDB);
    }

    @PostMapping
    public ResponseEntity<Status> createStatus(@RequestBody Status status) {
        Status statusDB = statusService.createStatus(status);
        return ResponseEntity.status(HttpStatus.CREATED).body(statusDB);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Status> updateStatus(@PathVariable("id") Long id, @RequestBody Status status) {
        status.setId(id);
        Status statusDB = statusService.updateStatus(status);
        if (statusDB == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(statusDB);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Status> deleteStatus(@PathVariable("id") Long id) {
        Status statusDB = statusService.deleteStatus(id);
        if (statusDB == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(statusDB);
    }


}
