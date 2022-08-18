package dao.impl;

import dao.ConfiguracaoJDBC;
import dao.IDao;
import model.Filial;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FilialDaoImpl implements IDao<Filial> {
    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(FilialDaoImpl.class);

    public FilialDaoImpl(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Filial salvar(Filial funcionario) {
        log.debug("Salvando funcionário: " + funcionario.toString());

        Connection connection = configuracaoJDBC.conectarBD();
        Statement statement = null;
        String query = String.format("INSERT INTO funcionarios(nome,nome,rua,numero,cidade,estado, premiun) " +
                        "VALUES('%s','%s','%s','%s','%s','%s','%s')",
                funcionario.getNome(), funcionario.getRua(), funcionario.getNumero(),
                funcionario.getCidade(), funcionario.getEstado(), funcionario.getPremiun());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next())
                funcionario.setId(resultSet.getInt(1));

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        return funcionario;
    }
}
