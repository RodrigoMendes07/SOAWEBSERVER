/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import java.text.DecimalFormat;
import negocio.JurosSimples;

/**
 *
 * @author Ti
 */
public class Principal {

    public static void main(String[] args) {
        
       JurosSimples conta = new JurosSimples(100,0.2f, 12);

        System.out.println("Juros Simples: "+new DecimalFormat("0.00").format(conta.calcularJuros()));
        System.out.println("Juros Montante: "+new DecimalFormat("0.00").format(conta.calcularMontante()));

    }

}
