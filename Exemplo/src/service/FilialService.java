package service;

import dao.IDao;
import model.Filial;

public class FilialService {

    private IDao<Filial> funcionarioIDao;

    public FilialService(IDao<Filial> funcionarioIDao) {
        this.funcionarioIDao = funcionarioIDao;
    }

    public Filial salvar(Filial funcionario) {
        return funcionarioIDao.salvar(funcionario);
    }

}