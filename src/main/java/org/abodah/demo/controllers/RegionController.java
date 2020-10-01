package org.abodah.demo.controllers;

import org.abodah.demo.services.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/country")
@RestController
public class RegionController extends BaseController {

	@Autowired
	RegionService countryService;

//	

}
