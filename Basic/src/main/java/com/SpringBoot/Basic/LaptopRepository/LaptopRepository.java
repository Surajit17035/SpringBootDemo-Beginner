package com.SpringBoot.Basic.LaptopRepository;

import com.SpringBoot.Basic.model.Laptop;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop lap) {
        System.out.println("Saved in database..");
    }
}
