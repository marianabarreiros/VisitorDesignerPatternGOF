/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concretvisitor;

import concretElements.Aluno;
import concretElements.Professor;
import element.Element;
import interfaces.Visitor;

/**
 *
 * @author aluno
 */
public class VisitorMediaAluno implements Visitor{
    private double total = 0;
    private int contador = 0;
    
    @Override
    public void visitAluno(Aluno aluno) {
        total+=aluno.getNota();
        contador++;
    }

    @Override
    public void visitProfessor(Professor professor) {
        
    }
    
    public double getMediaNota(){
        return total/contador;
    }


}
