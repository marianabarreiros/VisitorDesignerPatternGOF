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
public class Professor implements Element{
    private double altura;

    public Professor(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
    
    @Override
    public void Accept(Visitor visitor) {
        visitor.visitProfessor(this);
    }

   
    
}
