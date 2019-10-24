package com.rbleek.localremotedb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Runner implements CommandLineRunner {

    MountainRepository mountainRepository;

    public Runner(MountainRepository mountainRepository) {
        this.mountainRepository = mountainRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        mountainRepository.save(MountainBuilder.aMountain().withName("Everest").withHeight(8848L).build());
        mountainRepository.save(MountainBuilder.aMountain().withName("K2").withHeight(8611L).build());
        mountainRepository.save(MountainBuilder.aMountain().withName("Kanchenjunga").withHeight(8586L).build());

        Iterable<Mountain> all = mountainRepository.findAll();
        all.forEach(m -> log.info(m.getName() + ", " + m.getHeight()));
    }
}
