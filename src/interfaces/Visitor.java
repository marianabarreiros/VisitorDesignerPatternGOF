/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import concretElements.Aluno;
import concretElements.Professor;
import element.Element;

/**
 *
 * @author aluno
 */
public interface Visitor {
    void visitAluno(Aluno aluno);
    void visitProfessor(Professor professor);
}
