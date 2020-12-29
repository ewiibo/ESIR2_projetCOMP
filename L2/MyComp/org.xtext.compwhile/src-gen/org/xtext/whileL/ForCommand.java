/**
 * generated by Xtext 2.23.0
 */
package org.xtext.whileL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.whileL.ForCommand#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.whileL.ForCommand#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see org.xtext.whileL.WhileLPackage#getForCommand()
 * @model
 * @generated
 */
public interface ForCommand extends Command
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expr)
   * @see org.xtext.whileL.WhileLPackage#getForCommand_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link org.xtext.whileL.ForCommand#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

  /**
   * Returns the value of the '<em><b>Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' containment reference.
   * @see #setCommand(Commands)
   * @see org.xtext.whileL.WhileLPackage#getForCommand_Command()
   * @model containment="true"
   * @generated
   */
  Commands getCommand();

  /**
   * Sets the value of the '{@link org.xtext.whileL.ForCommand#getCommand <em>Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command</em>' containment reference.
   * @see #getCommand()
   * @generated
   */
  void setCommand(Commands value);

} // ForCommand
