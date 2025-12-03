package com.toyshop.merchandiserservice.service;
import com.toyshop.merchandiserservice.model.Merchandiser;
import java.util.List;
public interface MerchandiserService {
    List<Merchandiser> getAllMerchandisers();
    Merchandiser save(Merchandiser merchandiser);
}
