/**
 * generated by Xtext 2.23.0
 */
package org.xtext.whileL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.whileL.Expr#getExprbase <em>Exprbase</em>}</li>
 * </ul>
 *
 * @see org.xtext.whileL.WhileLPackage#getExpr()
 * @model
 * @generated
 */
public interface Expr extends EObject
{
  /**
   * Returns the value of the '<em><b>Exprbase</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprbase</em>' containment reference.
   * @see #setExprbase(ExprBase)
   * @see org.xtext.whileL.WhileLPackage#getExpr_Exprbase()
   * @model containment="true"
   * @generated
   */
  ExprBase getExprbase();

  /**
   * Sets the value of the '{@link org.xtext.whileL.Expr#getExprbase <em>Exprbase</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exprbase</em>' containment reference.
   * @see #getExprbase()
   * @generated
   */
  void setExprbase(ExprBase value);

} // Expr
