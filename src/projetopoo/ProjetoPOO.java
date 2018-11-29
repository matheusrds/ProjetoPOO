/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

/**
 *
 * @author Matheus
 */
public class ProjetoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CorretoraSeguros corretora = new CorretoraSeguros();
		
        Carro meuCarro = new Carro(45000d, 2012);
        Imovel minhaCasa = new Imovel(920000, 320);

        corretora.fazerPropostaSeguro(meuCarro);
        corretora.fazerPropostaSeguro(minhaCasa);
    }
    
}
