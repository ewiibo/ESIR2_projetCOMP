/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  Program createProgram();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns a new object of class '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Definition</em>'.
   * @generated
   */
  Definition createDefinition();

  /**
   * Returns a new object of class '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input</em>'.
   * @generated
   */
  Input createInput();

  /**
   * Returns a new object of class '<em>Output</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output</em>'.
   * @generated
   */
  Output createOutput();

  /**
   * Returns a new object of class '<em>Commands</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Commands</em>'.
   * @generated
   */
  Commands createCommands();

  /**
   * Returns a new object of class '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command</em>'.
   * @generated
   */
  Command createCommand();

  /**
   * Returns a new object of class '<em>While Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While Command</em>'.
   * @generated
   */
  WhileCommand createWhileCommand();

  /**
   * Returns a new object of class '<em>If Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Command</em>'.
   * @generated
   */
  IfCommand createIfCommand();

  /**
   * Returns a new object of class '<em>For Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Command</em>'.
   * @generated
   */
  ForCommand createForCommand();

  /**
   * Returns a new object of class '<em>Affect Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Affect Command</em>'.
   * @generated
   */
  AffectCommand createAffectCommand();

  /**
   * Returns a new object of class '<em>Foreach Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Foreach Command</em>'.
   * @generated
   */
  ForeachCommand createForeachCommand();

  /**
   * Returns a new object of class '<em>Exprs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exprs</em>'.
   * @generated
   */
  Exprs createExprs();

  /**
   * Returns a new object of class '<em>Vars</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vars</em>'.
   * @generated
   */
  Vars createVars();

  /**
   * Returns a new object of class '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr</em>'.
   * @generated
   */
  Expr createExpr();

  /**
   * Returns a new object of class '<em>LExpr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LExpr</em>'.
   * @generated
   */
  LExpr createLExpr();

  /**
   * Returns a new object of class '<em>Expr Base</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Base</em>'.
   * @generated
   */
  ExprBase createExprBase();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslPackage getMyDslPackage();

} //MyDslFactory
