/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import concretElements.Aluno;
import concretElements.Professor;
import concretvisitor.VisitorAlturaTodos;
import concretvisitor.VisitorMediaAluno;
import element.Element;
import interfaces.Visitor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class RunApp {
    public static void main(String[] args) {
        Element professor = new Professor(1.90);
        Element professor1 = new Professor(2.00);
        Element aluno = new Aluno(8.6, 1.60);
        Element aluno1 = new Aluno(5.6, 1.70);
        
        List<Element> elementos = new ArrayList();
        elementos.add(aluno);
        elementos.add(aluno1);
        elementos.add(professor);
        elementos.add(professor1);
        
        VisitorAlturaTodos visitorAlturaTodos = new VisitorAlturaTodos();
        VisitorMediaAluno visitorMediaAluno = new VisitorMediaAluno();
        
        List<Visitor> visitors = new ArrayList();
        visitors.add(visitorAlturaTodos);
        visitors.add(visitorMediaAluno);
        
        
        for(Element e : elementos){
            for(Visitor v : visitors){
                e.Accept(v);
            }
        }
        
        System.out.println(visitorMediaAluno.getMediaNota());
        System.out.println(visitorAlturaTodos.getMediaAltura());
    }
}
