package org.abodah.demo.services;

import java.util.List;

import org.abodah.demo.model.Region;
import org.abodah.demo.repositories.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionService {

	@Autowired
	RegionRepository regionRepo;

	public List<Region> list() {
        return regionRepo.findAll();
    }
	
	public Region find(Long id) {
		return regionRepo.findById(id).get();
	}

	public Region findByName(String regionName) {
		return regionRepo.findByName(regionName).get();
	}
	
	
}
