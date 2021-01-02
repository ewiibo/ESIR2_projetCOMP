package org.xtext.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.generator.Func;
import org.xtext.generator.Op;
import org.xtext.generator.OpImpl;
import org.xtext.generator.Quadruplet;
import org.xtext.generator.TableSymbole;
import org.xtext.generator.TroisAdd;
import org.xtext.generator.WhileOp;

@SuppressWarnings("all")
public class Traducteurx {
  private TroisAdd code3;
  
  private TableSymbole ts;
  
  public TableSymbole Traducteurx(final TroisAdd code3, final TableSymbole ts) {
    TableSymbole _xblockexpression = null;
    {
      this.code3 = code3;
      _xblockexpression = this.ts = ts;
    }
    return _xblockexpression;
  }
  
  public String translate(final String className) {
    String str = "";
    Set<String> _keySet = this.code3.getCode3AddressH().keySet();
    for (final String key : _keySet) {
      {
        Func func = this.ts.tableSymbFunc.get(key);
        for (final String v : func.varIn) {
          func.getVars().remove(v);
        }
        String _name = func.getName();
        boolean _equals = Objects.equal(_name, "main");
        if (_equals) {
          String _str = str;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("public static void main(String[] argv) {");
          str = (_str + _builder);
        } else {
          String _str_1 = str;
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("BinTree ");
          String _name_1 = func.getName();
          _builder_1.append(_name_1);
          _builder_1.append(" (");
          {
            boolean _hasElements = false;
            for(final String read : func.varIn) {
              if (!_hasElements) {
                _hasElements = true;
              } else {
                _builder_1.appendImmediate(", ", "");
              }
              _builder_1.append("BinTree ");
              _builder_1.append(read);
            }
          }
          _builder_1.append("){");
          str = (_str_1 + _builder_1);
        }
        String _str_2 = str;
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.newLine();
        _builder_2.append("\t");
        {
          String _name_2 = func.getName();
          boolean _notEquals = (!Objects.equal(_name_2, "main"));
          if (_notEquals) {
            _builder_2.append("ArrayList<String> varIn = new ArrayList<>(); ");
            {
              for(final String vi : func.varIn) {
                _builder_2.append("varIn.add(\"");
                _builder_2.append(vi, "\t");
                _builder_2.append("\");");
              }
            }
          }
        }
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("\t");
        _builder_2.append("String vars[] = {");
        {
          ArrayList<String> _vars = func.getVars();
          boolean _hasElements_1 = false;
          for(final String vi_1 : _vars) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder_2.appendImmediate(",", "\t");
            }
            _builder_2.append("\"");
            _builder_2.append(vi_1, "\t");
            _builder_2.append("\"");
          }
        }
        _builder_2.append("};   ");
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("\t");
        _builder_2.append("HashMap<String, BinTree> variables = new HashMap<>();");
        _builder_2.newLine();
        _builder_2.append("\t");
        _builder_2.append("for(String var : vars) variables.put(var,null);");
        _builder_2.newLine();
        _builder_2.append("\t");
        {
          String _name_3 = func.getName();
          boolean _notEquals_1 = (!Objects.equal(_name_3, "main"));
          if (_notEquals_1) {
            {
              for(final String vi_2 : func.varIn) {
                _builder_2.append("variables.put(\"");
                _builder_2.append(vi_2, "\t");
                _builder_2.append("\", ");
                _builder_2.append(vi_2, "\t");
                _builder_2.append(");");
              }
            }
          }
        }
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("\t");
        _builder_2.newLine();
        _builder_2.append("\t");
        {
          LinkedList<Quadruplet<OpImpl>> _get = this.code3.getCode3AddressH().get(key);
          for(final Quadruplet<OpImpl> code : _get) {
            CharSequence _translate3Add = this.translate3Add(code);
            _builder_2.append(_translate3Add, "\t");
            _builder_2.newLineIfNotEmpty();
          }
        }
        String _plus = (_builder_2.toString() + "}\n\n");
        str = (_str_2 + _plus);
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.HashMap;");
    _builder.newLine();
    _builder.append("import org.xtext.generator.BinTree;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(str, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public CharSequence translate3Add(final Quadruplet<OpImpl> code) {
    Op _operator = code.getOperateur().getOperator();
    boolean _equals = Objects.equal(_operator, Op.Func);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      return _builder.toString();
    }
    Op _operator_1 = code.getOperateur().getOperator();
    boolean _equals_1 = Objects.equal(_operator_1, Op.Read);
    if (_equals_1) {
      StringConcatenation _builder_1 = new StringConcatenation();
      return _builder_1.toString();
    }
    Op _operator_2 = code.getOperateur().getOperator();
    boolean _equals_2 = Objects.equal(_operator_2, Op.Nop);
    if (_equals_2) {
      return this.translateNop(code);
    }
    Op _operator_3 = code.getOperateur().getOperator();
    boolean _equals_3 = Objects.equal(_operator_3, Op.Write);
    if (_equals_3) {
      return this.translateWrite(code);
    }
    Op _operator_4 = code.getOperateur().getOperator();
    boolean _equals_4 = Objects.equal(_operator_4, Op.Affec);
    if (_equals_4) {
      return this.translateAffect(code);
    }
    Op _operator_5 = code.getOperateur().getOperator();
    boolean _equals_5 = Objects.equal(_operator_5, Op.Nil);
    if (_equals_5) {
      return this.translateNil(code);
    }
    Op _operator_6 = code.getOperateur().getOperator();
    boolean _equals_6 = Objects.equal(_operator_6, Op.Tl);
    if (_equals_6) {
      return this.translateTl(code);
    }
    Op _operator_7 = code.getOperateur().getOperator();
    boolean _equals_7 = Objects.equal(_operator_7, Op.Hd);
    if (_equals_7) {
      return this.translateHd(code);
    }
    Op _operator_8 = code.getOperateur().getOperator();
    boolean _equals_8 = Objects.equal(_operator_8, Op.Cons);
    if (_equals_8) {
      return this.translateCons(code);
    }
    Op _operator_9 = code.getOperateur().getOperator();
    boolean _equals_9 = Objects.equal(_operator_9, Op.While);
    if (_equals_9) {
      return this.translateWhile(code);
    }
    return null;
  }
  
  public String translateNop(final Quadruplet<OpImpl> code) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("libwh.nop();");
    return _builder.toString();
  }
  
  public CharSequence translateWrite(final Quadruplet<OpImpl> code) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public String translateAffect(final Quadruplet<OpImpl> code) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("variables.put(\"");
    String _resultat = code.getResultat();
    _builder.append(_resultat, "\t");
    _builder.append("\",variables.get(\"");
    String _arg1 = code.getArg1();
    _builder.append(_arg1, "\t");
    _builder.append("\"));");
    return _builder.toString();
  }
  
  public String translateNil(final Quadruplet<OpImpl> code) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("variables.put(\"");
    String _resultat = code.getResultat();
    _builder.append(_resultat, "\t");
    _builder.append("\", null);");
    return _builder.toString();
  }
  
  public String translateTl(final Quadruplet<OpImpl> code) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("variables.put(\"");
    String _resultat = code.getResultat();
    _builder.append(_resultat, "\t");
    _builder.append("\", libwh.tl(variables.get(\"");
    String _arg1 = code.getArg1();
    _builder.append(_arg1, "\t");
    _builder.append("\")));");
    return _builder.toString();
  }
  
  public String translateHd(final Quadruplet<OpImpl> code) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("variables.put(\"");
    String _resultat = code.getResultat();
    _builder.append(_resultat, "\t");
    _builder.append("\", libwh.hd(variables.get(\"");
    String _arg1 = code.getArg1();
    _builder.append(_arg1, "\t");
    _builder.append("\")));");
    return _builder.toString();
  }
  
  public String translateCons(final Quadruplet<OpImpl> code) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("variables.put(\"");
    String _resultat = code.getResultat();
    _builder.append(_resultat, "\t");
    _builder.append("\", libwh.cons(variables.get(\"");
    String _arg1 = code.getArg1();
    _builder.append(_arg1, "\t");
    _builder.append("\"),variables.get(\"");
    String _arg2 = code.getArg2();
    _builder.append(_arg2, "\t");
    _builder.append("\")));");
    return _builder.toString();
  }
  
  public String translateWhile(final Quadruplet<OpImpl> code) {
    OpImpl _operateur = code.getOperateur();
    WhileOp opw = new WhileOp(_operateur);
    String _resultat = code.getResultat();
    String _arg1 = code.getArg1();
    String _arg2 = code.getArg2();
    Quadruplet<WhileOp> code1 = new Quadruplet<WhileOp>(opw, _resultat, _arg1, _arg2);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("******debutWhile******");
    _builder.newLine();
    {
      LinkedList<Quadruplet<OpImpl>> _expr = code1.getOperateur().getExpr();
      for(final Quadruplet<OpImpl> exp : _expr) {
        _builder.append("\t");
        Object _translate3Add = this.translate3Add(exp);
        _builder.append(_translate3Add, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("While( libwh.isTrue(");
    String _arg1_1 = code1.getArg1();
    _builder.append(_arg1_1);
    _builder.append(")){");
    _builder.newLineIfNotEmpty();
    {
      LinkedList<Quadruplet<OpImpl>> _cmds = code1.getOperateur().getCmds();
      for(final Quadruplet<OpImpl> cmd : _cmds) {
        _builder.append("\t");
        Object _translate3Add_1 = this.translate3Add(cmd);
        _builder.append(_translate3Add_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
