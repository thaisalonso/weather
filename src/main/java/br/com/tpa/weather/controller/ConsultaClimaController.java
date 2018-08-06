package br.com.tpa.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.tpa.weather.config.AppProperties;
import br.com.tpa.weather.service.CidadeService;
import br.com.tpa.weather.service.ConsultaClimaService;

@RestController
@RequestMapping("/clima")
public class ConsultaClimaController {
	
	@Autowired
	private ConsultaClimaService consultaClimaService;
	
	@Autowired
	private CidadeService cidadeService;
	
	@Autowired
	private AppProperties properties;
		
	@GetMapping
	public ModelAndView listarCidades(@RequestParam(value= "codigo", required = false) Long codigo) {
		ModelAndView modelAndView = new ModelAndView("consulta-clima");
		modelAndView.addObject("cidades", cidadeService.getListaCidades());
		if (codigo != null) {
			modelAndView.addObject("climaCidade", consultaClimaService.getClimaCidade(codigo, properties.getChaveOpenWeather(), properties.getUnitOpenWeather()));
		}
		return modelAndView;
	}
}
