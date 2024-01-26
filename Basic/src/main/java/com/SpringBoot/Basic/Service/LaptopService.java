package com.SpringBoot.Basic.Service;

import com.SpringBoot.Basic.LaptopRepository.LaptopRepository;
import com.SpringBoot.Basic.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;
    public void addLaptop(Laptop lap) {
        repo.save(lap);
    }

    public boolean isGood() {
        return true;
    }
}
