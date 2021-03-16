/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Ti
 */
public class JurosSimples {

    private double capital;
    private double taxa;
    private int periodo;

    public JurosSimples() {
    }

    public JurosSimples(double capital, double taxa, int periodo) {
        this.capital = capital;
        this.taxa = taxa;
        this.periodo = periodo;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public double calcularMontante() {
        taxa = taxa / 100 ;
        return capital * Math.pow(1 + taxa, periodo);
    }

    public double calcularJuros() {
        return (calcularMontante() - capital);
    }

}
