/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

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
    private JurosComposto juroscomposto;

    public ServicoJuros() {
        this.jurosSimples = new JurosSimples();
        this.juroscomposto = new JurosComposto();
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

    @WebMethod(operationName = "calcularJuroComposto")
    public double calcularJuroComposto(float capital, float taxa, int periodo) {

        return this.calcularMontanteJuroComposto(capital, taxa, periodo) - capital;

    }

    @WebMethod(operationName = "calcularMontanteJuroComposto")
    public double calcularMontanteJuroComposto(float capital, float taxa, int periodo) {
        juroscomposto.setCapital(capital);
        juroscomposto.setPeriodo(periodo);
        juroscomposto.setTaxa(taxa);
        return capital * Math.pow((1 + taxa / 100), periodo);

    }
    
}
