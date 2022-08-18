package test;

import dao.ConfiguracaoJDBC;
import dao.impl.FilialDaoImpl;
import model.Filial;
import org.junit.jupiter.api.Test;
import service.FilialService;

import static org.junit.jupiter.api.Assertions.*;

class FilialServiceTest {

    private FilialService funcionarioService = new FilialService(new FilialDaoImpl(new ConfiguracaoJDBC()));

    @Test
    public void salvarFucionario() {
        Filial filial = new Filial("Grupo Integração", "Das Flores", "56", "São Paulo", "São Paulo", true);
        funcionarioService.salvar(filial);
        assertTrue(filial.getId() != null);
    } @Test
    public void salvarFucionario2() {
        Filial filial = new Filial("Resort cana brava", "Flores", "56", "São Paulo", "São Paulo", true);
        funcionarioService.salvar(filial);
        assertTrue(filial.getId() != null);
    } @Test
    public void salvarFucionario3() {
        Filial filial = new Filial("Grupo Integração", "Das Flores", "56", "São Paulo", "São Paulo", true);
        funcionarioService.salvar(filial);
        assertTrue(filial.getId() != null);
    } @Test
    public void salvarFucionario4() {
        Filial filial = new Filial("Grupo folia", "Das Flores", "56", "São Paulo", "São Paulo", true);
        funcionarioService.salvar(filial);
        assertTrue(filial.getId() != null);
    } @Test
    public void salvarFucionario5() {
        Filial filial = new Filial("Hotel Plaza", "Das Flores", "56", "Salvador", "Bahia", true);
        funcionarioService.salvar(filial);
        assertTrue(filial.getId() != null);
    }



}