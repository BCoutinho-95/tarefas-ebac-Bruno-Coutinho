package br.com.rpires.dao.mocks;

import br.com.rpires.dao.IContratoDao;

/**
 * @author rodrigo.pires
 */
public class ContratoDaoMock implements IContratoDao {

    @Override
    public void salvar() {
        System.out.println("Contrato salvo com sucesso no Mock.");
    }

    @Override
    public void buscar() {
        System.out.println("Contrato encontrado no Mock.");
    }

    @Override
    public void excluir() {
        System.out.println("Contrato excluído no Mock.");
    }

    @Override
    public void atualizar() {
        System.out.println("Contrato atualizado no Mock.");
    }
}
