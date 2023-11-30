package br.org.fundatec.aula03;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary
public class CarroDataBaseRepositoryImpl implements CarroRepository {

    private final CarroRepositorySpring carroRepository;

    public CarroDataBaseRepositoryImpl(CarroRepositorySpring carroRepository) {
        this.carroRepository = carroRepository;
    }

    @Override
    public List<Carro> listAllCarros() {
        return carroRepository.findAll();
    }

    @Override
    public void saveCarro(Carro carro) {
        carroRepository.save(carro);
    }

    @Override
    public void deleteCarro(String placa) {
        carroRepository.deleteById(placa);
    }

    @Override
    public void editCarro(String codigoPlaca, Carro carro) {

        carroRepository.findById(codigoPlaca)
                .orElseThrow(() -> new RuntimeException("Carro com de placa " + codigoPlaca + " não existe"));

        carro.setPlaca(codigoPlaca);
        carroRepository.save(carro);
    }
}
