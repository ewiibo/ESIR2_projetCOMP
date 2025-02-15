/**
 * generated by Xtext 2.23.0
 */
package org.xtext.lggeWhile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affect Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lggeWhile.AffectCommand#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.lggeWhile.AffectCommand#getExprs <em>Exprs</em>}</li>
 * </ul>
 *
 * @see org.xtext.lggeWhile.LggeWhilePackage#getAffectCommand()
 * @model
 * @generated
 */
public interface AffectCommand extends Command
{
  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference.
   * @see #setVars(Vars)
   * @see org.xtext.lggeWhile.LggeWhilePackage#getAffectCommand_Vars()
   * @model containment="true"
   * @generated
   */
  Vars getVars();

  /**
   * Sets the value of the '{@link org.xtext.lggeWhile.AffectCommand#getVars <em>Vars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vars</em>' containment reference.
   * @see #getVars()
   * @generated
   */
  void setVars(Vars value);

  /**
   * Returns the value of the '<em><b>Exprs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprs</em>' containment reference.
   * @see #setExprs(Exprs)
   * @see org.xtext.lggeWhile.LggeWhilePackage#getAffectCommand_Exprs()
   * @model containment="true"
   * @generated
   */
  Exprs getExprs();

  /**
   * Sets the value of the '{@link org.xtext.lggeWhile.AffectCommand#getExprs <em>Exprs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exprs</em>' containment reference.
   * @see #getExprs()
   * @generated
   */
  void setExprs(Exprs value);

} // AffectCommand
