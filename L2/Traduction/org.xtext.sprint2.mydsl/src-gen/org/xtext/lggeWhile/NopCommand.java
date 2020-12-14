/**
 * generated by Xtext 2.12.0
 */
package org.xtext.lggeWhile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nop Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lggeWhile.NopCommand#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see org.xtext.lggeWhile.LggeWhilePackage#getNopCommand()
 * @model
 * @generated
 */
public interface NopCommand extends Command
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' attribute.
   * @see #setExpr(String)
   * @see org.xtext.lggeWhile.LggeWhilePackage#getNopCommand_Expr()
   * @model
   * @generated
   */
  String getExpr();

  /**
   * Sets the value of the '{@link org.xtext.lggeWhile.NopCommand#getExpr <em>Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' attribute.
   * @see #getExpr()
   * @generated
   */
  void setExpr(String value);

} // NopCommand
