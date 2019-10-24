package com.rbleek.localremotedb;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MountainRepositoryTest {

    @Autowired
    MountainRepository mountainRepository;

    @Test
    public void testRepo() {
        mountainRepository.save(MountainBuilder.aMountain().withName("Everest").withHeight(8848L).build());
        mountainRepository.save(MountainBuilder.aMountain().withName("K2").withHeight(8611L).build());
        mountainRepository.save(MountainBuilder.aMountain().withName("Kanchenjunga").withHeight(8586L).build());

        Iterable<Mountain> all = mountainRepository.findAll();
        all.forEach(m -> log.info(m.getName() + ", " + m.getHeight()));
    }

}
