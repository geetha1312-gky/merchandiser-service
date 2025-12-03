package com.toyshop.merchandiserservice.service;
import org.springframework.stereotype.Service;
import com.toyshop.merchandiserservice.model.Merchandiser;
import com.toyshop.merchandiserservice.repository.MerchandiserRepository;
import java.util.List;

@Service
public class MerchandiserServiceImpl implements MerchandiserService {
    private final MerchandiserRepository repository;
    public MerchandiserServiceImpl(MerchandiserRepository repository){ this.repository = repository; }
    @Override public List<Merchandiser> getAllMerchandisers(){ return repository.findAll(); }
    @Override public Merchandiser save(Merchandiser merchandiser){ return repository.save(merchandiser); }
}
