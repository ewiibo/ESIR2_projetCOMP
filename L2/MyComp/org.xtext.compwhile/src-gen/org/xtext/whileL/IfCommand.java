/**
 * generated by Xtext 2.23.0
 */
package org.xtext.whileL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.whileL.IfCommand#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.whileL.IfCommand#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.xtext.whileL.IfCommand#getElsecommands <em>Elsecommands</em>}</li>
 * </ul>
 *
 * @see org.xtext.whileL.WhileLPackage#getIfCommand()
 * @model
 * @generated
 */
public interface IfCommand extends Command
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expr)
   * @see org.xtext.whileL.WhileLPackage#getIfCommand_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link org.xtext.whileL.IfCommand#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference.
   * @see #setCommands(Commands)
   * @see org.xtext.whileL.WhileLPackage#getIfCommand_Commands()
   * @model containment="true"
   * @generated
   */
  Commands getCommands();

  /**
   * Sets the value of the '{@link org.xtext.whileL.IfCommand#getCommands <em>Commands</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Commands</em>' containment reference.
   * @see #getCommands()
   * @generated
   */
  void setCommands(Commands value);

  /**
   * Returns the value of the '<em><b>Elsecommands</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elsecommands</em>' containment reference.
   * @see #setElsecommands(Commands)
   * @see org.xtext.whileL.WhileLPackage#getIfCommand_Elsecommands()
   * @model containment="true"
   * @generated
   */
  Commands getElsecommands();

  /**
   * Sets the value of the '{@link org.xtext.whileL.IfCommand#getElsecommands <em>Elsecommands</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elsecommands</em>' containment reference.
   * @see #getElsecommands()
   * @generated
   */
  void setElsecommands(Commands value);

} // IfCommand
