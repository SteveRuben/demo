package org.abodah.demo.controllers;

import java.util.List;

import org.abodah.demo.model.Region;
import org.abodah.demo.services.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/country")
@RestController
public class RegionController extends BaseController {

	@Autowired
	RegionService countryService;

	@GetMapping
	public List<Region> listRegion(){
		return countryService.list();
	}
	
	@GetMapping("{regionName}")
	public Region dofindRegionByName(String regionName) {
		return countryService.findByName(regionName);
	}
	

}
