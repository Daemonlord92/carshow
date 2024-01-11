package com.binarymjm.carshow.repository;

import com.binarymjm.carshow.domains.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
