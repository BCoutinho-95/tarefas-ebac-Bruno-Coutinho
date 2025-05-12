package br.com.rpires.service;

/**
 * @author rodrigo.pires
 */
public interface IContratoService {
    String salvar();
    String buscar();     // Método para buscar um contrato
    String excluir();    // Método para excluir um contrato
    String atualizar();  // Método para atualizar um contrato

}
