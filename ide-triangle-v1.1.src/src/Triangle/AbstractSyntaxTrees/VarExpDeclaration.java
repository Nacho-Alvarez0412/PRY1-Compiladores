/**
 * @newclass
 * @description Clase para representar la alternativa co expression de var en single-declaration
 * @author Joseph
 * @codigo J.43
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class VarExpDeclaration extends Declaration {

  public VarExpDeclaration (Identifier iAST, Expression eAST,
                         SourcePosition thePosition) {
    super (thePosition);
    I = iAST;
    E = eAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitVarExpDeclaration(this, o);
  }



  public Identifier I;
  public Expression E;
}