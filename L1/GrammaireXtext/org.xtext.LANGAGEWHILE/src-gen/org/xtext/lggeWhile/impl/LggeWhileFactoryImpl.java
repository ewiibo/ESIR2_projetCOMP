/**
 * generated by Xtext 2.23.0
 */
package org.xtext.lggeWhile.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.lggeWhile.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LggeWhileFactoryImpl extends EFactoryImpl implements LggeWhileFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LggeWhileFactory init()
  {
    try
    {
      LggeWhileFactory theLggeWhileFactory = (LggeWhileFactory)EPackage.Registry.INSTANCE.getEFactory(LggeWhilePackage.eNS_URI);
      if (theLggeWhileFactory != null)
      {
        return theLggeWhileFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LggeWhileFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LggeWhileFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LggeWhilePackage.PROGRAM: return createProgram();
      case LggeWhilePackage.FUNCTION: return createFunction();
      case LggeWhilePackage.DEFINITION: return createDefinition();
      case LggeWhilePackage.INPUT: return createInput();
      case LggeWhilePackage.OUTPUT: return createOutput();
      case LggeWhilePackage.COMMANDS: return createCommands();
      case LggeWhilePackage.COMMAND: return createCommand();
      case LggeWhilePackage.NOP_COMMAND: return createNopCommand();
      case LggeWhilePackage.WHILE_COMMAND: return createWhileCommand();
      case LggeWhilePackage.IF_COMMAND: return createIfCommand();
      case LggeWhilePackage.FOR_COMMAND: return createForCommand();
      case LggeWhilePackage.AFFECT_COMMAND: return createAffectCommand();
      case LggeWhilePackage.FOREACH_COMMAND: return createForeachCommand();
      case LggeWhilePackage.EXPRS: return createExprs();
      case LggeWhilePackage.VARS: return createVars();
      case LggeWhilePackage.EXPR: return createExpr();
      case LggeWhilePackage.LEXPR: return createLExpr();
      case LggeWhilePackage.EXPR_BASE: return createExprBase();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Definition createDefinition()
  {
    DefinitionImpl definition = new DefinitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Output createOutput()
  {
    OutputImpl output = new OutputImpl();
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Commands createCommands()
  {
    CommandsImpl commands = new CommandsImpl();
    return commands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NopCommand createNopCommand()
  {
    NopCommandImpl nopCommand = new NopCommandImpl();
    return nopCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WhileCommand createWhileCommand()
  {
    WhileCommandImpl whileCommand = new WhileCommandImpl();
    return whileCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IfCommand createIfCommand()
  {
    IfCommandImpl ifCommand = new IfCommandImpl();
    return ifCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ForCommand createForCommand()
  {
    ForCommandImpl forCommand = new ForCommandImpl();
    return forCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AffectCommand createAffectCommand()
  {
    AffectCommandImpl affectCommand = new AffectCommandImpl();
    return affectCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ForeachCommand createForeachCommand()
  {
    ForeachCommandImpl foreachCommand = new ForeachCommandImpl();
    return foreachCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Exprs createExprs()
  {
    ExprsImpl exprs = new ExprsImpl();
    return exprs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Vars createVars()
  {
    VarsImpl vars = new VarsImpl();
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LExpr createLExpr()
  {
    LExprImpl lExpr = new LExprImpl();
    return lExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExprBase createExprBase()
  {
    ExprBaseImpl exprBase = new ExprBaseImpl();
    return exprBase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LggeWhilePackage getLggeWhilePackage()
  {
    return (LggeWhilePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LggeWhilePackage getPackage()
  {
    return LggeWhilePackage.eINSTANCE;
  }

} //LggeWhileFactoryImpl
