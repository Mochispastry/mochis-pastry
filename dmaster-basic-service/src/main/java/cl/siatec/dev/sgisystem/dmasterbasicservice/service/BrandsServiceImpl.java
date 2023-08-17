package cl.siatec.dev.sgisystem.dmasterbasicservice.service;

import cl.siatec.dev.sgisystem.dmasterbasicservice.entity.Brands;
import cl.siatec.dev.sgisystem.dmasterbasicservice.repository.BrandsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class BrandsServiceImpl implements BrandsService{

    @Autowired
    private BrandsRepository brandsRepository;

    @Override
    public Brands findById(Long id) {return brandsRepository.findById(id).orElse(null); }

    @Override
    public List<Brands> findAll() {return brandsRepository.findAll();}

    @Override
    public List<Brands> findByNameContains(String name) {return brandsRepository.findByNameContainsIgnoreCase(name);}

    @Override
    public Brands findByName(String name) {return brandsRepository.findByNameIgnoreCase(name); }

    @Override
    public List<Brands> findBySystemImages_CreateAtBetween(Timestamp createAtStart, Timestamp createAtEnd) {
        return brandsRepository.findBySystemImages_CreateAtBetween(createAtStart, createAtEnd);
    }

    @Override
    public List<Brands> findBySystemImages_UpdateAtBetween(Timestamp updateAtStart, Timestamp updateAtEnd) {
        return brandsRepository.findBySystemImages_UpdateAtBetween(updateAtStart, updateAtEnd);
    }

    @Override
    public Brands createBrand(Brands brand) {return brandsRepository.save(brand); }

    @Override
    public Brands updateBrand(Brands brand) {
        Brands brandDB = findById(brand.getId());
        if (brandDB == null) {
            return null;
        }
        brandDB.setName(brand.getName());
        brandDB.setSystemImages(brand.getSystemImages());
        return brandsRepository.save(brandDB);
    }

    @Override
    public Brands deleteBrand(Long id) {
        Brands brandDB = findById(id);
        if (brandDB == null) {
            return null;
        }
        brandsRepository.delete(brandDB);
        return brandDB;
    }
}
