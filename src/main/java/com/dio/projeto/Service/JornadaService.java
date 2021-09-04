package com.dio.projeto.Service;

import com.dio.projeto.Modelo.JornadaTrabalho;
import com.dio.projeto.Repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho save (JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaRepository.findAll();
    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public void deleteJornada(Long idJornada){
        jornadaRepository.deleteById(idJornada);
    }

    public Optional<JornadaTrabalho> getByid(Long idJornada) {
        return jornadaRepository.findById(idJornada);
    }
}
