/**
 * generated by Xtext 2.23.0
 */
package org.xtext.whileL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exprs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.whileL.Exprs#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see org.xtext.whileL.WhileLPackage#getExprs()
 * @model
 * @generated
 */
public interface Exprs extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.whileL.Expr}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference list.
   * @see org.xtext.whileL.WhileLPackage#getExprs_Expr()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getExpr();

} // Exprs
