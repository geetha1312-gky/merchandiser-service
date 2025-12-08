package com.toyshop.merchandiserservice.controller;

import com.toyshop.merchandiserservice.model.Merchandiser;
import com.toyshop.merchandiserservice.service.MerchandiserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/merchandisers")
@CrossOrigin(origins = "*")
public class MerchandiserController {
	private final MerchandiserService service;

	public MerchandiserController(MerchandiserService service) {
		this.service = service;
	}

	@GetMapping
	public List<Merchandiser> getAll() {
		return service.getAllMerchandisers();
	}

	@PostMapping
	public Merchandiser create(@RequestBody Merchandiser merchandiser) {
		return service.save(merchandiser);
	}
}
