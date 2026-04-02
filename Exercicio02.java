/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio02;
    import java.io.FileWriter;
    import java.io.PrintWriter;
    import java.io.IOException;
    import java.util.ArrayList;

/**
 *
 * @author aluno9
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        /*Empregado listaEmpregados[] = new Empregado[5];*/
        ArrayList<Empregado> listaEmpregados = new ArrayList<>();
        Empregado e1 = new Empregado();
        Empregado e2 = new Empregado();
        Empregado e3 = new Empregado();
        Empregado e4 = new Empregado();
        Empregado e5 = new Empregado();

        e1.setCpf("668674684");
        e1.setNome("geraldo");
        e1.setSalario(2000);
        
        e2.setCpf("76478346284");
        e2.setNome("Lucas");
        e2.setSalario(2100);
        
        e2.setCpf("75642364");
        e2.setNome("Walmir");
        e2.setSalario(10000);
        
        e3.setCpf("87823642364");
        e3.setNome("Regina");
        e3.setSalario(9000);
        
        e4.setCpf("98823642364");
        e4.setNome("Warner");
        e4.setSalario(6000);
        
        e5.setCpf("999823642364");
        e5.setNome("Bene");
        e5.setSalario(4000);
        
        listaEmpregados.add(e1);
        listaEmpregados.add(e2);
        listaEmpregados.add(e3);
        listaEmpregados.add(e4);
        listaEmpregados.add(e5);
        
        FileWriter arq = new FileWriter("C:\\Arquivo\\dadosProva.txt");
        PrintWriter gravaArq = new PrintWriter(arq);   
        
        for(Empregado emp : listaEmpregados){
            gravaArq.printf(emp.getNome() + "\n"+  emp.getCpf() + "\n" +  emp.getSalario() + ";" + "\n");
        }
        
        String cpfExcluir = "98823642364";
        for(int i = 0; i<5 ; i++){
           if(listaEmpregados.get(i).deletarPessoa(cpfExcluir)== 1){
            listaEmpregados.remove(i);
            gravaArq.printf("\nApos exclsao" + "\n");
            for(Empregado emp : listaEmpregados){
            gravaArq.printf(emp.getNome() + "\n"+  emp.getCpf() + "\n" +  emp.getSalario() + ";" + "\n");
                }
                    arq.close();

            break;
           }
             if(i==4){
               System.out.println("Cpf nao encontrado");
           }
        }
    }
        
        
 }
   
