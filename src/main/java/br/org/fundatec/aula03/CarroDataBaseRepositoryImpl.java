package br.org.fundatec.aula03;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary
public class CarroDataBaseRepositoryImpl implements CarroRepository {
    @Override
    public List<Carro> listAllCarros() {
        return null;
    }

    @Override
    public void saveCarro(Carro carro) {

    }

    @Override
    public void deleteCarro(String placa) {

    }

    @Override
    public void editCarro(String codigoPlaca, Carro carro) {

    }
}
