package com.tramitologia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.tramitologia.model.ApplicationInfo;
import com.tramitologia.service.ApplicationInfoService;
import com.tramitologia.service.ApplicationService;

@Controller
public class ApplicationController {

	@Autowired
	private ApplicationService applicationService;
	private ApplicationInfoService applicationInfoService;

	@GetMapping("/Aplicaciones")
	public String aplicaciones(Model model) {
		model.addAttribute("zzzlistApplication", applicationService.getAllApplications());
		return "Aplicaciones";
	}

	@GetMapping("/AplicacionesDetalles")
	public String viewHomePage(Model model) {
		model.addAttribute("listApplicationInfo", applicationInfoService.getAllApplicationInfos());
		return "";
	}

	@GetMapping("/Contactanos")
	public String añadirAplicacionInformacionFormulario(Model model) {
		ApplicationInfo applicationInfo = new ApplicationInfo();
		model.addAttribute("applicationInfo", applicationInfo);
		return "Contactanos";
	}
	
	@PostMapping("/saveApplication")
	public String saveApplication(@ModelAttribute("ApplicationInfo") ApplicationInfo applicationInfo) {
		applicationInfoService.saveApplication(applicationInfo);
		return "redirect:/";
	}
}
