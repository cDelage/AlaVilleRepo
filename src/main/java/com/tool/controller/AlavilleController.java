package com.tool.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlavilleController {
	
	private static final Logger LOG = LogManager.getLogger(AlavilleController.class);
	
	@RequestMapping("/")
	public String home(ModelMap modelMap) {
		LOG.info("Alaville controller home request");
		return "pages/index";
	}
}
