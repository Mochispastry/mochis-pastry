package cl.siatec.dev.sgisystem.dmasterbasicservice.service;

import cl.siatec.dev.sgisystem.dmasterbasicservice.entity.Brands;

import java.sql.Timestamp;
import java.util.List;

public interface BrandsService {

    public Brands findById(Long id);

    public List<Brands> findAll();
    public List<Brands> findByNameContains(String name);

    public Brands findByName(String name);
    public List<Brands> findBySystemImages_CreateAtBetween(Timestamp createAtStart, Timestamp createAtEnd);

    public List<Brands> findBySystemImages_UpdateAtBetween(Timestamp updateAtStart, Timestamp updateAtEnd);

    public Brands createBrand(Brands brand);
    public Brands updateBrand(Brands brand);
    public Brands deleteBrand(Long id);

}
