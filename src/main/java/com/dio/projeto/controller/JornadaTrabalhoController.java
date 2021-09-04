package com.dio.projeto.controller;

import com.dio.projeto.Modelo.JornadaTrabalho;
import com.dio.projeto.Service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;
    private Object List;

    @PostMapping("trabalho")
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.save(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornaadaList(){
        return jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaByID(@PathVariable ("idJornada") Long idJornada){
        return ResponseEntity.ok(jornadaService.getByid(idJornada).orElseThrow(() -> new NoSuchElementException("No Exist")));
    }

    @PostMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.updateJornada(jornadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity deleteByID(@PathVariable ("idJornada") Long idJornada){
        try {
            jornadaService.deleteJornada(idJornada);
        } catch (Exception e){
            System.out.println(e.getMessage());
            HttpStatus.valueOf(500);
        }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }
}
