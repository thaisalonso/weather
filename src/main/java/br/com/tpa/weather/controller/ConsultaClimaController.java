package br.com.tpa.weather.controller;

import static br.com.tpa.weather.repository.ConsultaClimaRepository.URL_API_OPEN_WEATHER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.tpa.weather.config.AppProperties;
import br.com.tpa.weather.repository.CidadeRepository;
import br.com.tpa.weather.repository.ConsultaClimaRepository;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

@RestController
@RequestMapping("/consultarClima")
public class ConsultaClimaController {
	
	private final ConsultaClimaRepository consultaClimaRepository = Feign.builder()
			.decoder(new JacksonDecoder())
			.encoder(new JacksonEncoder())
			.target(ConsultaClimaRepository.class, URL_API_OPEN_WEATHER);
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private AppProperties properties;
		
	@GetMapping
	public ModelAndView listarCidades(@RequestParam(value= "codigo", required = false) Long codigo) {
		ModelAndView modelAndView = new ModelAndView("consulta-clima");
		modelAndView.addObject("cidades", cidadeRepository.getListaCidades());
		if (codigo != null) {
			modelAndView.addObject("climaCidade", consultaClimaRepository.getClimaCidade(codigo, properties.getChaveOpenWeather()));
		}
		return modelAndView;
	}
}
