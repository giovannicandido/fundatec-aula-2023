package br.org.fundatec.aula03.controller;

import br.org.fundatec.aula03.model.Carro;
import br.org.fundatec.aula03.service.CarroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CarroController {


    private final CarroService carroService;

    public CarroController(CarroService carroService) {
        this.carroService = carroService;
    }


    @GetMapping(path = "/carros")
    public List<Carro> listAllCarros() {
        return carroService.listAllCarros();
    }

    @PostMapping(path = "/carros")
    public void saveCarro(@RequestBody Carro carro) {
        carroService.saveCarro(carro);
    }

    @DeleteMapping(path = "/carros/{codigo-placa}")
    public void deleteCarro(@PathVariable(name = "codigo-placa") String placa) {
        carroService.deleteCarro(placa);

    }

    @GetMapping(path = "/carros/{placa}")
    public Carro getCarroByPlaca(@PathVariable("placa") String placa) {
        return carroService.getCarroByPlaca(placa);
    }

    @PutMapping(path = "/carros/{codigo-placa}")
    public void editCarro(@PathVariable(name = "codigo-placa") String codigoPlaca,
                          @RequestBody Carro carro) {
        carroService.editCarro(codigoPlaca, carro);

    }
}
