package com.dio.projeto.Repository;

import com.dio.projeto.Modelo.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
    static List<JornadaTrabalho> findByid(Long idJornada) {
        return null;
    }

    void deleteById(JornadaTrabalho jornadaTrabalho);
}