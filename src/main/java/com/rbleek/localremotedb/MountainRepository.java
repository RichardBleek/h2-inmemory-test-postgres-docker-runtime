package com.rbleek.localremotedb;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MountainRepository extends CrudRepository<Mountain, Long> {
}
