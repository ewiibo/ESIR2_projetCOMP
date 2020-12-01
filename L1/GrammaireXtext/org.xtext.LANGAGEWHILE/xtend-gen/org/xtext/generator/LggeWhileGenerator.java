/**
 * generated by Xtext 2.23.0
 */
package org.xtext.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.lggeWhile.AffectCommand;
import org.xtext.lggeWhile.Command;
import org.xtext.lggeWhile.Commands;
import org.xtext.lggeWhile.Definition;
import org.xtext.lggeWhile.Expr;
import org.xtext.lggeWhile.ExprBase;
import org.xtext.lggeWhile.Exprs;
import org.xtext.lggeWhile.ForCommand;
import org.xtext.lggeWhile.ForeachCommand;
import org.xtext.lggeWhile.Function;
import org.xtext.lggeWhile.IfCommand;
import org.xtext.lggeWhile.LExpr;
import org.xtext.lggeWhile.NopCommand;
import org.xtext.lggeWhile.Program;
import org.xtext.lggeWhile.Vars;
import org.xtext.lggeWhile.WhileCommand;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class LggeWhileGenerator extends AbstractGenerator {
  private int all;
  
  private int iAffect;
  
  private int iIf;
  
  private int iFor;
  
  private int iWhile;
  
  private int iForeach;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
  }
  
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context, final String outputfile, final int all, final int iAffect, final int iIf, final int iFor, final int iWhile, final int iForeach) {
    this.all = all;
    this.iAffect = iAffect;
    this.iIf = iIf;
    this.iFor = iFor;
    this.iWhile = iWhile;
    this.iForeach = iForeach;
    Iterable<Program> _filter = Iterables.<Program>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Program.class);
    for (final Program p : _filter) {
      fsa.generateFile(outputfile, this.compile(p));
    }
  }
  
  public String compile(final Program prog) {
    StringConcatenation _builder = new StringConcatenation();
    String functi = _builder.toString();
    EList<Function> _functions = prog.getFunctions();
    for (final Function func : _functions) {
      String _functi = functi;
      String _compile = this.compile(func);
      functi = (_functi + _compile);
    }
    return functi;
  }
  
  public String compile(final Function func) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("function ");
    String _symbol = func.getSymbol();
    _builder.append(_symbol);
    _builder.append(": ");
    _builder.newLineIfNotEmpty();
    CharSequence _compile = this.compile(func.getDefinition());
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public CharSequence compile(final Definition d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("read ");
    {
      EList<String> _vars = d.getInput().getVars();
      boolean _hasElements = false;
      for(final String param : _vars) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        _builder.append(param);
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("%");
    _builder.newLine();
    String space = "";
    for (int i = 0; (i < this.all); i++) {
      String _space = space;
      space = (_space + " ");
    }
    {
      EList<Command> _commands = d.getCommands().getCommands();
      boolean _hasElements_1 = false;
      for(final Command com : _commands) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(" ;", "");
        }
        CharSequence _compile = this.compile(com, space);
        _builder.append(_compile);
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("%");
    _builder.newLine();
    _builder.append("write ");
    {
      EList<String> _vars_1 = d.getOutput().getVars();
      boolean _hasElements_2 = false;
      for(final String param_1 : _vars_1) {
        if (!_hasElements_2) {
          _hasElements_2 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        _builder.append(param_1);
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Command c, final String space) {
    if ((c instanceof WhileCommand)) {
      return this.compile(((WhileCommand)c), space);
    }
    if ((c instanceof IfCommand)) {
      return this.compile(((IfCommand)c), space);
    }
    if ((c instanceof ForCommand)) {
      return this.compile(((ForCommand)c), space);
    }
    if ((c instanceof AffectCommand)) {
      return this.compile(((AffectCommand)c), space);
    }
    if ((c instanceof ForeachCommand)) {
      return this.compile(((ForeachCommand)c), space);
    }
    if ((c instanceof NopCommand)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(space);
      _builder.append("nop");
      return _builder.toString();
    }
    return null;
  }
  
  public String compile(final WhileCommand w, final String space) {
    String spaceW = "";
    for (int i = 0; (i < this.iWhile); i++) {
      String _spaceW = spaceW;
      spaceW = (_spaceW + " ");
    }
    spaceW = (spaceW + space);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(space);
    _builder.append("while ");
    CharSequence _compile = this.compile(w.getExpr());
    _builder.append(_compile);
    _builder.append(" do");
    _builder.newLineIfNotEmpty();
    {
      EList<Command> _commands = w.getCommands().getCommands();
      boolean _hasElements = false;
      for(final Command com : _commands) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" ;", "");
        }
        Object _compile_1 = this.compile(com, spaceW);
        _builder.append(_compile_1);
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append(space);
    _builder.append("od");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String compile(final IfCommand i, final String space) {
    String spaceI = "";
    for (int j = 0; (j < this.iIf); j++) {
      String _spaceI = spaceI;
      spaceI = (_spaceI + " ");
    }
    spaceI = (spaceI + space);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(space);
    _builder.append("if ");
    CharSequence _compile = this.compile(i.getExpr());
    _builder.append(_compile);
    _builder.append(" then");
    _builder.newLineIfNotEmpty();
    {
      EList<Command> _commands = i.getCommands().getCommands();
      boolean _hasElements = false;
      for(final Command com : _commands) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" ;", "");
        }
        Object _compile_1 = this.compile(com, spaceI);
        _builder.append(_compile_1);
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Commands _elsecommands = i.getElsecommands();
      boolean _tripleNotEquals = (_elsecommands != null);
      if (_tripleNotEquals) {
        _builder.append(space);
        _builder.append("else");
        _builder.newLineIfNotEmpty();
        {
          EList<Command> _commands_1 = i.getElsecommands().getCommands();
          boolean _hasElements_1 = false;
          for(final Command comelse : _commands_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(" ;", "");
            }
            Object _compile_2 = this.compile(comelse, spaceI);
            _builder.append(_compile_2);
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append(space);
    _builder.append("fi");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String compile(final ForCommand f, final String space) {
    String spaceF = "";
    for (int j = 0; (j < this.iFor); j++) {
      String _spaceF = spaceF;
      spaceF = (_spaceF + " ");
    }
    spaceF = (spaceF + space);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(space);
    _builder.append("for ");
    CharSequence _compile = this.compile(f.getExpr());
    _builder.append(_compile);
    _builder.append(" do");
    _builder.newLineIfNotEmpty();
    {
      EList<Command> _commands = f.getCommand().getCommands();
      boolean _hasElements = false;
      for(final Command com : _commands) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" ;", "");
        }
        Object _compile_1 = this.compile(com, spaceF);
        _builder.append(_compile_1);
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append(space);
    _builder.append("od");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String compile(final ForeachCommand f, final String space) {
    String spaceF = "";
    for (int j = 0; (j < this.iForeach); j++) {
      String _spaceF = spaceF;
      spaceF = (_spaceF + " ");
    }
    spaceF = (spaceF + space);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(space);
    _builder.append("foreach ");
    CharSequence _compile = this.compile(f.getVars());
    _builder.append(_compile);
    _builder.append(" in ");
    CharSequence _compile_1 = this.compile(f.getExpr());
    _builder.append(_compile_1);
    _builder.append(" do");
    _builder.newLineIfNotEmpty();
    {
      EList<Command> _commands = f.getCommands().getCommands();
      boolean _hasElements = false;
      for(final Command com : _commands) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" ;", "");
        }
        Object _compile_2 = this.compile(com, spaceF);
        _builder.append(_compile_2);
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append(space);
    _builder.append("od");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public CharSequence compile(final AffectCommand a, final String space) {
    CharSequence _xblockexpression = null;
    {
      String spaceA = "";
      int _length = space.length();
      int size = (this.iAffect - _length);
      for (int j = 0; (j < size); j++) {
        String _spaceA = spaceA;
        spaceA = (_spaceA + " ");
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(space);
      _builder.append(spaceA);
      CharSequence _compile = this.compile(a.getVars());
      _builder.append(_compile);
      _builder.append(" := ");
      CharSequence _compile_1 = this.compile(a.getExprs());
      _builder.append(_compile_1);
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence compile(final Expr expr) {
    StringConcatenation _builder = new StringConcatenation();
    String _compile = this.compile(expr.getExprbase());
    _builder.append(_compile);
    {
      ExprBase _exprbase1 = expr.getExprbase1();
      boolean _tripleNotEquals = (_exprbase1 != null);
      if (_tripleNotEquals) {
        _builder.append(" =? ");
        String _compile_1 = this.compile(expr.getExprbase1());
        _builder.append(_compile_1);
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Vars v) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<String> _vari = v.getVari();
      boolean _hasElements = false;
      for(final String param : _vari) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        _builder.append(param);
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Exprs e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Expr> _expr = e.getExpr();
      boolean _hasElements = false;
      for(final Expr param : _expr) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        CharSequence _compile = this.compile(param);
        _builder.append(_compile);
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final LExpr le) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Expr> _expr = le.getExpr();
      boolean _hasElements = false;
      for(final Expr param : _expr) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" ", "");
        }
        Object _compile = this.compile(param);
        _builder.append(_compile);
      }
    }
    return _builder;
  }
  
  public String compile(final ExprBase e) {
    String _value = e.getValue();
    boolean _tripleNotEquals = (_value != null);
    if (_tripleNotEquals) {
      StringConcatenation _builder = new StringConcatenation();
      String _value_1 = e.getValue();
      _builder.append(_value_1);
      return _builder.toString();
    }
    String _identitor = e.getIdentitor();
    boolean _tripleNotEquals_1 = (_identitor != null);
    if (_tripleNotEquals_1) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("(");
      String _identitor_1 = e.getIdentitor();
      _builder_1.append(_identitor_1);
      _builder_1.append(" ");
      CharSequence _compile = this.compile(e.getLexpr());
      _builder_1.append(_compile);
      _builder_1.append(")");
      return _builder_1.toString();
    }
    String _identitor1 = e.getIdentitor1();
    boolean _tripleNotEquals_2 = (_identitor1 != null);
    if (_tripleNotEquals_2) {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("(");
      String _identitor1_1 = e.getIdentitor1();
      _builder_2.append(_identitor1_1);
      _builder_2.append(" ");
      Object _compile_1 = this.compile(e.getExpr());
      _builder_2.append(_compile_1);
      _builder_2.append(")");
      return _builder_2.toString();
    }
    String _symbol = e.getSymbol();
    boolean _tripleNotEquals_3 = (_symbol != null);
    if (_tripleNotEquals_3) {
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("(");
      String _symbol_1 = e.getSymbol();
      _builder_3.append(_symbol_1);
      _builder_3.append(" ");
      CharSequence _compile_2 = this.compile(e.getLexpr());
      _builder_3.append(_compile_2);
      _builder_3.append(")");
      return _builder_3.toString();
    }
    return null;
  }
}
