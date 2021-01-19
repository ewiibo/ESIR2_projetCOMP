/**
 * generated by Xtext 2.23.0
 */
package org.xtext.whileL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.whileL.Expr;
import org.xtext.whileL.ExprBase;
import org.xtext.whileL.LExpr;
import org.xtext.whileL.WhileLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.whileL.impl.ExprBaseImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.whileL.impl.ExprBaseImpl#getIdentitor <em>Identitor</em>}</li>
 *   <li>{@link org.xtext.whileL.impl.ExprBaseImpl#getLexpr <em>Lexpr</em>}</li>
 *   <li>{@link org.xtext.whileL.impl.ExprBaseImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.whileL.impl.ExprBaseImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.xtext.whileL.impl.ExprBaseImpl#getExpr1 <em>Expr1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprBaseImpl extends MinimalEObjectImpl.Container implements ExprBase
{
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getIdentitor() <em>Identitor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentitor()
   * @generated
   * @ordered
   */
  protected static final String IDENTITOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentitor() <em>Identitor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentitor()
   * @generated
   * @ordered
   */
  protected String identitor = IDENTITOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getLexpr() <em>Lexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLexpr()
   * @generated
   * @ordered
   */
  protected LExpr lexpr;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expr expr;

  /**
   * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbol()
   * @generated
   * @ordered
   */
  protected static final String SYMBOL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbol()
   * @generated
   * @ordered
   */
  protected String symbol = SYMBOL_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpr1() <em>Expr1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr1()
   * @generated
   * @ordered
   */
  protected Expr expr1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprBaseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WhileLPackage.Literals.EXPR_BASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileLPackage.EXPR_BASE__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getIdentitor()
  {
    return identitor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIdentitor(String newIdentitor)
  {
    String oldIdentitor = identitor;
    identitor = newIdentitor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileLPackage.EXPR_BASE__IDENTITOR, oldIdentitor, identitor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LExpr getLexpr()
  {
    return lexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLexpr(LExpr newLexpr, NotificationChain msgs)
  {
    LExpr oldLexpr = lexpr;
    lexpr = newLexpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileLPackage.EXPR_BASE__LEXPR, oldLexpr, newLexpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLexpr(LExpr newLexpr)
  {
    if (newLexpr != lexpr)
    {
      NotificationChain msgs = null;
      if (lexpr != null)
        msgs = ((InternalEObject)lexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileLPackage.EXPR_BASE__LEXPR, null, msgs);
      if (newLexpr != null)
        msgs = ((InternalEObject)newLexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileLPackage.EXPR_BASE__LEXPR, null, msgs);
      msgs = basicSetLexpr(newLexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileLPackage.EXPR_BASE__LEXPR, newLexpr, newLexpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expr getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expr newExpr, NotificationChain msgs)
  {
    Expr oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileLPackage.EXPR_BASE__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpr(Expr newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileLPackage.EXPR_BASE__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileLPackage.EXPR_BASE__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileLPackage.EXPR_BASE__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSymbol()
  {
    return symbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSymbol(String newSymbol)
  {
    String oldSymbol = symbol;
    symbol = newSymbol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileLPackage.EXPR_BASE__SYMBOL, oldSymbol, symbol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expr getExpr1()
  {
    return expr1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr1(Expr newExpr1, NotificationChain msgs)
  {
    Expr oldExpr1 = expr1;
    expr1 = newExpr1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileLPackage.EXPR_BASE__EXPR1, oldExpr1, newExpr1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpr1(Expr newExpr1)
  {
    if (newExpr1 != expr1)
    {
      NotificationChain msgs = null;
      if (expr1 != null)
        msgs = ((InternalEObject)expr1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileLPackage.EXPR_BASE__EXPR1, null, msgs);
      if (newExpr1 != null)
        msgs = ((InternalEObject)newExpr1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileLPackage.EXPR_BASE__EXPR1, null, msgs);
      msgs = basicSetExpr1(newExpr1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileLPackage.EXPR_BASE__EXPR1, newExpr1, newExpr1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case WhileLPackage.EXPR_BASE__LEXPR:
        return basicSetLexpr(null, msgs);
      case WhileLPackage.EXPR_BASE__EXPR:
        return basicSetExpr(null, msgs);
      case WhileLPackage.EXPR_BASE__EXPR1:
        return basicSetExpr1(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case WhileLPackage.EXPR_BASE__VALUE:
        return getValue();
      case WhileLPackage.EXPR_BASE__IDENTITOR:
        return getIdentitor();
      case WhileLPackage.EXPR_BASE__LEXPR:
        return getLexpr();
      case WhileLPackage.EXPR_BASE__EXPR:
        return getExpr();
      case WhileLPackage.EXPR_BASE__SYMBOL:
        return getSymbol();
      case WhileLPackage.EXPR_BASE__EXPR1:
        return getExpr1();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WhileLPackage.EXPR_BASE__VALUE:
        setValue((String)newValue);
        return;
      case WhileLPackage.EXPR_BASE__IDENTITOR:
        setIdentitor((String)newValue);
        return;
      case WhileLPackage.EXPR_BASE__LEXPR:
        setLexpr((LExpr)newValue);
        return;
      case WhileLPackage.EXPR_BASE__EXPR:
        setExpr((Expr)newValue);
        return;
      case WhileLPackage.EXPR_BASE__SYMBOL:
        setSymbol((String)newValue);
        return;
      case WhileLPackage.EXPR_BASE__EXPR1:
        setExpr1((Expr)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case WhileLPackage.EXPR_BASE__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case WhileLPackage.EXPR_BASE__IDENTITOR:
        setIdentitor(IDENTITOR_EDEFAULT);
        return;
      case WhileLPackage.EXPR_BASE__LEXPR:
        setLexpr((LExpr)null);
        return;
      case WhileLPackage.EXPR_BASE__EXPR:
        setExpr((Expr)null);
        return;
      case WhileLPackage.EXPR_BASE__SYMBOL:
        setSymbol(SYMBOL_EDEFAULT);
        return;
      case WhileLPackage.EXPR_BASE__EXPR1:
        setExpr1((Expr)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case WhileLPackage.EXPR_BASE__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case WhileLPackage.EXPR_BASE__IDENTITOR:
        return IDENTITOR_EDEFAULT == null ? identitor != null : !IDENTITOR_EDEFAULT.equals(identitor);
      case WhileLPackage.EXPR_BASE__LEXPR:
        return lexpr != null;
      case WhileLPackage.EXPR_BASE__EXPR:
        return expr != null;
      case WhileLPackage.EXPR_BASE__SYMBOL:
        return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
      case WhileLPackage.EXPR_BASE__EXPR1:
        return expr1 != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (value: ");
    result.append(value);
    result.append(", identitor: ");
    result.append(identitor);
    result.append(", symbol: ");
    result.append(symbol);
    result.append(')');
    return result.toString();
  }

} //ExprBaseImpl
