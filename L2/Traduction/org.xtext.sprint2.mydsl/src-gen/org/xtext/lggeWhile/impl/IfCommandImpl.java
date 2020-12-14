/**
 * generated by Xtext 2.12.0
 */
package org.xtext.lggeWhile.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.lggeWhile.Commands;
import org.xtext.lggeWhile.Expr;
import org.xtext.lggeWhile.IfCommand;
import org.xtext.lggeWhile.LggeWhilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lggeWhile.impl.IfCommandImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.lggeWhile.impl.IfCommandImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.xtext.lggeWhile.impl.IfCommandImpl#getElsecommands <em>Elsecommands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfCommandImpl extends CommandImpl implements IfCommand
{
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
   * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommands()
   * @generated
   * @ordered
   */
  protected Commands commands;

  /**
   * The cached value of the '{@link #getElsecommands() <em>Elsecommands</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElsecommands()
   * @generated
   * @ordered
   */
  protected Commands elsecommands;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfCommandImpl()
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
    return LggeWhilePackage.Literals.IF_COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LggeWhilePackage.IF_COMMAND__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expr newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LggeWhilePackage.IF_COMMAND__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LggeWhilePackage.IF_COMMAND__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LggeWhilePackage.IF_COMMAND__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getCommands()
  {
    return commands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCommands(Commands newCommands, NotificationChain msgs)
  {
    Commands oldCommands = commands;
    commands = newCommands;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LggeWhilePackage.IF_COMMAND__COMMANDS, oldCommands, newCommands);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommands(Commands newCommands)
  {
    if (newCommands != commands)
    {
      NotificationChain msgs = null;
      if (commands != null)
        msgs = ((InternalEObject)commands).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LggeWhilePackage.IF_COMMAND__COMMANDS, null, msgs);
      if (newCommands != null)
        msgs = ((InternalEObject)newCommands).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LggeWhilePackage.IF_COMMAND__COMMANDS, null, msgs);
      msgs = basicSetCommands(newCommands, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LggeWhilePackage.IF_COMMAND__COMMANDS, newCommands, newCommands));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getElsecommands()
  {
    return elsecommands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElsecommands(Commands newElsecommands, NotificationChain msgs)
  {
    Commands oldElsecommands = elsecommands;
    elsecommands = newElsecommands;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LggeWhilePackage.IF_COMMAND__ELSECOMMANDS, oldElsecommands, newElsecommands);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElsecommands(Commands newElsecommands)
  {
    if (newElsecommands != elsecommands)
    {
      NotificationChain msgs = null;
      if (elsecommands != null)
        msgs = ((InternalEObject)elsecommands).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LggeWhilePackage.IF_COMMAND__ELSECOMMANDS, null, msgs);
      if (newElsecommands != null)
        msgs = ((InternalEObject)newElsecommands).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LggeWhilePackage.IF_COMMAND__ELSECOMMANDS, null, msgs);
      msgs = basicSetElsecommands(newElsecommands, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LggeWhilePackage.IF_COMMAND__ELSECOMMANDS, newElsecommands, newElsecommands));
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
      case LggeWhilePackage.IF_COMMAND__EXPR:
        return basicSetExpr(null, msgs);
      case LggeWhilePackage.IF_COMMAND__COMMANDS:
        return basicSetCommands(null, msgs);
      case LggeWhilePackage.IF_COMMAND__ELSECOMMANDS:
        return basicSetElsecommands(null, msgs);
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
      case LggeWhilePackage.IF_COMMAND__EXPR:
        return getExpr();
      case LggeWhilePackage.IF_COMMAND__COMMANDS:
        return getCommands();
      case LggeWhilePackage.IF_COMMAND__ELSECOMMANDS:
        return getElsecommands();
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
      case LggeWhilePackage.IF_COMMAND__EXPR:
        setExpr((Expr)newValue);
        return;
      case LggeWhilePackage.IF_COMMAND__COMMANDS:
        setCommands((Commands)newValue);
        return;
      case LggeWhilePackage.IF_COMMAND__ELSECOMMANDS:
        setElsecommands((Commands)newValue);
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
      case LggeWhilePackage.IF_COMMAND__EXPR:
        setExpr((Expr)null);
        return;
      case LggeWhilePackage.IF_COMMAND__COMMANDS:
        setCommands((Commands)null);
        return;
      case LggeWhilePackage.IF_COMMAND__ELSECOMMANDS:
        setElsecommands((Commands)null);
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
      case LggeWhilePackage.IF_COMMAND__EXPR:
        return expr != null;
      case LggeWhilePackage.IF_COMMAND__COMMANDS:
        return commands != null;
      case LggeWhilePackage.IF_COMMAND__ELSECOMMANDS:
        return elsecommands != null;
    }
    return super.eIsSet(featureID);
  }

} //IfCommandImpl
