package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/jornada");
public class jornadaTrabalhoController {
    @Autowired
    JornadaService jornadaService;
    @PostMapping
    public jornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){

        return jornadaService.saveJornada(jornadaTrabalho);

    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaService.findAll();
    }

    @GetMapping(/{idJornada})
    public ResponseEntity<JorndaTrabalho> getJornadaById(@PathVariable("idJornada") Long id) throws Exception {

        return ResponseEntity.ok(jornadaService.getById().orElseThrow(() => new Exception("Jornada não encontrada!")));

    }


}