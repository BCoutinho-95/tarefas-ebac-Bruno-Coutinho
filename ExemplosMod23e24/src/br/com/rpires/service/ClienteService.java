package br.com.rpires.service;

import br.com.rpires.dao.ClienteDao;
import br.com.rpires.dao.ClienteDaoMock;
import br.com.rpires.dao.IClienteDao;

/**
 * @author rodrigo.pires
 */
public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }
    
    public String buscar() {
        clienteDao.buscar();
        return "Cliente encontrado";
    }

    public String excluir() {
        clienteDao.excluir();
        return "Cliente excluído";
    }

    public String atualizar() {
        clienteDao.atualizar();
        return "Cliente atualizado";
    }
}
