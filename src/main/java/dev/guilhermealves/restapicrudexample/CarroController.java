/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.guilhermealves.restapicrudexample;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Guilherme
 */
@RestController
@AllArgsConstructor
public class CarroController {
    
    CarroRepository repository;
    
    @GetMapping("/carro")
    public List<Carro> getAllCarros(){
        return repository.findAll();
    }
    
    @GetMapping("/carro/{id}")
    public Carro getCarroById(@PathVariable Long id){
        return repository.findById(id).get();
    }
    
    @PostMapping("/carro")
    public Carro saveCarro(@RequestBody Carro carro){
        return repository.saveAndFlush(carro);
    }
    
    @DeleteMapping("/carro/{id}")
    public void deleteCarro(@PathVariable Long id){
        repository.deleteById(id);
    }
    
    
}
