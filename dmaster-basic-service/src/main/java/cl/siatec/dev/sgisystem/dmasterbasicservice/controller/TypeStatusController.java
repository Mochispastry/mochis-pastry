package cl.siatec.dev.sgisystem.dmasterbasicservice.controller;

import cl.siatec.dev.sgisystem.dmasterbasicservice.entity.TypeStatus;
import cl.siatec.dev.sgisystem.dmasterbasicservice.service.TypeStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/typeStatus")
public class TypeStatusController {

    @Autowired
    private TypeStatusService typeStatusService;

    @RequestMapping(value = "/{id}")
    public ResponseEntity<TypeStatus> findById(@PathVariable Long id) {
        TypeStatus typeStatusDB = typeStatusService.findById(id);
        if (typeStatusDB == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(typeStatusDB);
    }

    @RequestMapping(value = "/all")
    public ResponseEntity<List<TypeStatus>> findAll() {
        List<TypeStatus> typeStatusesDB = typeStatusService.findAll();
        if (typeStatusesDB.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(typeStatusesDB);
    }

    @RequestMapping(value = "/name/{name}")
    public ResponseEntity<List<TypeStatus>> findByName(@PathVariable String name) {
        List<TypeStatus> typeStatusesDB = typeStatusService.findByName(name);
        if (typeStatusesDB.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(typeStatusesDB);
    }

    @PostMapping
    public ResponseEntity<TypeStatus> create(@RequestBody TypeStatus typeStatus) {
        TypeStatus typeStatusDB = typeStatusService.createTypeStatus(typeStatus);
        return ResponseEntity.status(HttpStatus.CREATED).body(typeStatusDB);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<TypeStatus> update(@PathVariable Long id, @RequestBody TypeStatus typeStatus) {
        typeStatus.setId(id);
        TypeStatus typeStatusDB = typeStatusService.updateTypeStatus(typeStatus);
        if (typeStatusDB == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(typeStatusDB);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<TypeStatus> delete(@PathVariable Long id) {
        TypeStatus typeStatusDB = typeStatusService.deleteTypeStatus(id);
        if (typeStatusDB == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(typeStatusDB);
    }

}
