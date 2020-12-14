/**
 * generated by Xtext 2.12.0
 */
package org.xtext.lggeWhile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreach Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lggeWhile.ForeachCommand#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.lggeWhile.ForeachCommand#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.lggeWhile.ForeachCommand#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see org.xtext.lggeWhile.LggeWhilePackage#getForeachCommand()
 * @model
 * @generated
 */
public interface ForeachCommand extends Command
{
  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference.
   * @see #setVars(Vars)
   * @see org.xtext.lggeWhile.LggeWhilePackage#getForeachCommand_Vars()
   * @model containment="true"
   * @generated
   */
  Vars getVars();

  /**
   * Sets the value of the '{@link org.xtext.lggeWhile.ForeachCommand#getVars <em>Vars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vars</em>' containment reference.
   * @see #getVars()
   * @generated
   */
  void setVars(Vars value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expr)
   * @see org.xtext.lggeWhile.LggeWhilePackage#getForeachCommand_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link org.xtext.lggeWhile.ForeachCommand#getExpr <em>Expr</em>}' containment reference.
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
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference.
   * @see #setCommands(Commands)
   * @see org.xtext.lggeWhile.LggeWhilePackage#getForeachCommand_Commands()
   * @model containment="true"
   * @generated
   */
  Commands getCommands();

  /**
   * Sets the value of the '{@link org.xtext.lggeWhile.ForeachCommand#getCommands <em>Commands</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Commands</em>' containment reference.
   * @see #getCommands()
   * @generated
   */
  void setCommands(Commands value);

} // ForeachCommand
