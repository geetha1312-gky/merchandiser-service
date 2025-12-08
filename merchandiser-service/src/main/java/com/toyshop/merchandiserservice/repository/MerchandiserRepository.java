package com.toyshop.merchandiserservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.toyshop.merchandiserservice.model.Merchandiser;

public interface MerchandiserRepository extends JpaRepository<Merchandiser, Long> {
}
