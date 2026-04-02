/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;

/**
 *3)	[3,0] Desenvolver um programa que tenha uma classe Empregado, com atributos nome, CPF e salário. Escrever uma classe principal que:
o	Possa instanciar um Array de 5 empregados
o	Peça os dados, e instancie os objetos para armazenar em um Array
o	Possa remover um usuário pelo CPF, efetuar a operação e mostrar o Array resultante

 */
public class Empregado {
    private String nome;
    private String cpf;
    private double salario;
    
    public void Empregado(){
        this.nome = "";
        this.cpf = "";
        this.salario = 0;
    }
    public void setNome(String entraNome){
        this.nome = entraNome;
    }
    
    public void setCpf(String entraCpf){
        this.cpf = entraCpf;
    }
    public void setSalario(double entraSalario){
        this.salario = entraSalario;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public double getSalario(){
        return this.salario;
    }
    
    public int deletarPessoa(String delCpf){
        if(this.cpf == delCpf){
            return 1;
        }
        else{
            return 0;
        }
    }
    
}
