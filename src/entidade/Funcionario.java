/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author Acer
 */
public class Funcionario {
    public String nome;
    public double salario;
    public double imposto;
    public double porcentagem;
    
    public double salarioLiquido(){
        double sLiquido=(salario-imposto)+(salario*(porcentagem/100));
        return sLiquido;
    }
    public void salarioPorcentagem(double porcentagem){
        porcentagem=(salario-imposto)+(salario*(porcentagem/100));
        this.porcentagem=porcentagem;
        System.out.println(this.porcentagem);
    }
    
}
