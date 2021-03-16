/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.text.DecimalFormat;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author Ti
 */
@WebService(serviceName = "ServicoJuroSimplesComposto")
public class ServicoJuros {

    /**
     * This is a sample web service operation
     *
     */
    private JurosSimples jurosSimples;

    public ServicoJuros() {
        this.jurosSimples = new JurosSimples();
    }

    @WebMethod(operationName = "calcularJuroSimples")
    public double calcularJuroSimples(double capital, double taxa, int periodo) {
        jurosSimples.setCapital(capital);
        jurosSimples.setPeriodo(periodo);
        jurosSimples.setTaxa(taxa);

        return this.jurosSimples.calcularJuros();
    }

    @WebMethod(operationName = "calcularMontanteJuroSimples")
    public double calcularMontanteJuroSimples(float capital, float taxa, int periodo) {

        return capital + this.calcularJuroSimples(capital, taxa, periodo);

    }
}
