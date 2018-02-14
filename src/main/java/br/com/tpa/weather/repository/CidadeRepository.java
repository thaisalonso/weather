package br.com.tpa.weather.repository;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.tpa.weather.dto.CidadeDto;

@Repository
public class CidadeRepository {
	
	@Value("classpath:city.list.json") 
	private File listaCidadesJson;
	
	private List<CidadeDto> listaCidades;
	
	@PostConstruct
	private void criarListaCidades() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		listaCidades = mapper.readValue(listaCidadesJson, new TypeReference<List<CidadeDto>>(){});
		listaCidades = listaCidades.stream()
				.filter(c -> "BR".equalsIgnoreCase(c.getPais()))
				.sorted(Comparator.comparing(CidadeDto::getNome).thenComparing(CidadeDto::getCodigo))
				.collect(Collectors.toList());
	}
	
	public List<CidadeDto> getListaCidades() {		
		return listaCidades;
	}

}
