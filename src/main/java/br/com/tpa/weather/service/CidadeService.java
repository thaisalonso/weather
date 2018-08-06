package br.com.tpa.weather.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tpa.weather.dto.CidadeDto;
import br.com.tpa.weather.repository.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	public List<CidadeDto> getListaCidades() {
		return cidadeRepository.getListaCidades();
	}

}
