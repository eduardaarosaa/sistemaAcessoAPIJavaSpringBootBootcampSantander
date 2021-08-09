package com.demo.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotaion.Autowired;
import com.demo.respository.JornadaRepository;

@Service
public class JornadaService {
    @Autowired;
    JornadaRepository jornadaRepository;
    public JornadaService (JornadaRepository jornadaRepository){

        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(JornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll(){
        return jornadaRepository.findAll();
    }

    public Opitional JornadaTrabalho getById(Long idJornada){
        return jornadaRepository.getById(idJornada);
    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public void JornadaTrabalho deleteJornada(Long idJornada){
         jornadaRepository.deleteById(idJornada);
    }
}