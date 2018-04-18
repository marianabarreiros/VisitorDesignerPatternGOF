/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concretElements;

import element.Element;
import interfaces.Visitor;

/**
 *
 * @author aluno
 */
public class Aluno implements Element{
    private double nota;
    private double altura;

    public Aluno(double nota, double altura) {
        this.nota = nota;
        this.altura = altura;
    }

    public double getNota() {
        return nota;
    }

    public double getAltura() {
        return altura;
    }
    
    @Override
    public void Accept(Visitor visitor) {
       visitor.visitAluno(this);
       
    }

    
}
