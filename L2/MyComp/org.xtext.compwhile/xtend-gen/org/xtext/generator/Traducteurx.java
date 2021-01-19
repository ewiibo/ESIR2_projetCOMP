package org.xtext.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.xtext.generator.ForOp;
import org.xtext.generator.ForeachOp;
import org.xtext.generator.Func;
import org.xtext.generator.IfOp;
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
        Func func = this.ts.getTableSymbFunc().get(key);
        for (final String v : func.varIn) {
          func.getVars().remove(v);
        }
        String _name = func.getName();
        boolean _equals = Objects.equal(_name, "main");
        if (_equals) {
          String _str = str;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("public static void main(String[] argv) {");
          _builder.newLine();
          _builder.append("\t\t\t\t\t");
          _builder.newLine();
          str = (_str + _builder);
        } else {
          String _str_1 = str;
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("static Stack<BinTree> ");
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
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t");
          _builder_1.append("Stack<BinTree> sortie = new Stack<BinTree>();");
          _builder_1.newLine();
          _builder_1.append("\t");
          _builder_1.newLine();
          str = (_str_1 + _builder_1);
        }
        String _str_2 = str;
        StringConcatenation _builder_2 = new StringConcatenation();
        {
          int _size = func.getVars().size();
          boolean _notEquals = (_size != 0);
          if (_notEquals) {
            _builder_2.append("BinTree ");
            {
              ArrayList<String> _vars = func.getVars();
              boolean _hasElements_1 = false;
              for(final String vi : _vars) {
                if (!_hasElements_1) {
                  _hasElements_1 = true;
                } else {
                  _builder_2.appendImmediate(",", "");
                }
                _builder_2.append(vi);
              }
            }
            _builder_2.append(";");
          }
        }
        _builder_2.newLineIfNotEmpty();
        _builder_2.newLine();
        _builder_2.append("Stack<BinTree> temp;  ");
        _builder_2.newLine();
        _builder_2.append("\t");
        {
          LinkedList<Quadruplet<OpImpl>> _get = this.code3.getCode3AddressH().get(key);
          for(final Quadruplet<OpImpl> code : _get) {
            {
              if ((Objects.equal(code.getOperateur().getOperator(), Op.Write) && Objects.equal(func.getName(), "main"))) {
              } else {
                CharSequence _translate3Add = this.translate3Add(code);
                _builder_2.append(_translate3Add, "\t");
              }
            }
            _builder_2.newLineIfNotEmpty();
          }
        }
        str = (_str_2 + _builder_2);
        String _name_2 = func.getName();
        boolean _equals_1 = Objects.equal(_name_2, "main");
        if (_equals_1) {
          String _str_3 = str;
          str = (_str_3 + "}\n\n");
        } else {
          String _str_4 = str;
          str = (_str_4 + "\treturn sortie;\n}\n\n ");
        }
      }
    }
    ArrayList<String> appel = new ArrayList<String>();
    for (int i = 0; (i < this.ts.getTableSymbFunc().get("main").getIn()); i++) {
      appel.add((("in[" + Integer.valueOf(i)) + "]"));
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.append("import libwh.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static Libwh libwh = new Libwh();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(str, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      Func _get = this.ts.getTableSymbFunc().get("main");
      boolean _tripleNotEquals = (_get != null);
      if (_tripleNotEquals) {
        _builder.append("\t");
        _builder.append("public static void main(String[] args){");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("System.out.println(\"dans le main il reste le parseur qui envoie les parametres à f0\");");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("List<BinTree> in = libwh.inWh(args);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("List<BinTree> out = f0(");
        {
          boolean _hasElements = false;
          for(final String arg : appel) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "\t\t");
            }
            _builder.append(arg, "\t\t");
          }
        }
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("String outprint = \"\";");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("for(BinTree bin : out){");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("outprint+= libwh.toInt(bin)+ \" \";");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("System.out.println(outprint);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
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
    Op _operator_10 = code.getOperateur().getOperator();
    boolean _equals_10 = Objects.equal(_operator_10, Op.If);
    if (_equals_10) {
      return this.translateIf(code);
    }
    Op _operator_11 = code.getOperateur().getOperator();
    boolean _equals_11 = Objects.equal(_operator_11, Op.For);
    if (_equals_11) {
      return this.translateFor(code);
    }
    Op _operator_12 = code.getOperateur().getOperator();
    boolean _equals_12 = Objects.equal(_operator_12, Op.Foreach);
    if (_equals_12) {
      return this.translateForeach(code);
    }
    Op _operator_13 = code.getOperateur().getOperator();
    boolean _equals_13 = Objects.equal(_operator_13, Op.Call);
    if (_equals_13) {
      return this.translateCall(code);
    }
    Op _operator_14 = code.getOperateur().getOperator();
    boolean _equals_14 = Objects.equal(_operator_14, Op.Not);
    if (_equals_14) {
      return this.translateNot(code);
    }
    Op _operator_15 = code.getOperateur().getOperator();
    boolean _equals_15 = Objects.equal(_operator_15, Op.Const);
    if (_equals_15) {
      return this.translateConst(code);
    }
    Op _operator_16 = code.getOperateur().getOperator();
    boolean _equals_16 = Objects.equal(_operator_16, Op.Eq);
    if (_equals_16) {
      return this.translateEq(code);
    }
    return null;
  }
  
  public String translateConst(final Quadruplet<OpImpl> code) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    String _resultat = code.getResultat();
    _builder.append(_resultat, "\t");
    _builder.append(" = libwh.conste(\"");
    String _resultat_1 = code.getResultat();
    _builder.append(_resultat_1, "\t");
    _builder.append("\");");
    return _builder.toString();
  }
  
  public String translateNot(final Quadruplet<OpImpl> code) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    String _resultat = code.getResultat();
    _builder.append(_resultat, "\t");
    _builder.append(" = libwh.not(");
    String _arg1 = code.getArg1();
    _builder.append(_arg1, "\t");
    _builder.append(");");
    return _builder.toString();
  }
  
  public String translateCall(final Quadruplet<OpImpl> code) {
    String ss = "";
    int _size = ((List<String>)Conversions.doWrapArray(code.getResultat().split(" "))).size();
    ExclusiveRange _greaterThanDoubleDot = new ExclusiveRange(_size, 0, false);
    for (final Integer i : _greaterThanDoubleDot) {
      String _ss = ss;
      String _get = code.getResultat().split(" ")[(i).intValue()];
      String _plus = (_get + " = temp.pop();\n");
      ss = (_ss + _plus);
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("temp = ");
    String _etiquette = code.getOperateur().getEtiquette();
    _builder.append(_etiquette, "\t");
    _builder.append("(");
    String _arg1 = code.getArg1();
    _builder.append(_arg1, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append(ss, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("temp = null;");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String translateNop(final Quadruplet<OpImpl> code) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("libwh.nop();");
    return _builder.toString();
  }
  
  public CharSequence translateWrite(final Quadruplet<OpImpl> code) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("sortie.add(");
    String _resultat = code.getResultat();
    _builder.append(_resultat, "\t");
    _builder.append(");");
    return _builder;
  }
  
  public String translateAffect(final Quadruplet<OpImpl> code) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    String _resultat = code.getResultat();
    _builder.append(_resultat, "\t");
    _builder.append(" = ");
    String _arg1 = code.getArg1();
    _builder.append(_arg1, "\t");
    _builder.append(";");
    return _builder.toString();
  }
  
  public String translateNil(final Quadruplet<OpImpl> code) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    String _resultat = code.getResultat();
    _builder.append(_resultat, "\t");
    _builder.append(" = libwh.nil();");
    return _builder.toString();
  }
  
  public String translateTl(final Quadruplet<OpImpl> code) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    String _resultat = code.getResultat();
    _builder.append(_resultat, "\t");
    _builder.append(" = libwh.tl(");
    String _arg1 = code.getArg1();
    _builder.append(_arg1, "\t");
    _builder.append(");");
    return _builder.toString();
  }
  
  public String translateHd(final Quadruplet<OpImpl> code) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    String _resultat = code.getResultat();
    _builder.append(_resultat, "\t");
    _builder.append(" = libwh.hd(");
    String _arg1 = code.getArg1();
    _builder.append(_arg1, "\t");
    _builder.append(");");
    return _builder.toString();
  }
  
  public String translateCons(final Quadruplet<OpImpl> code) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    String _resultat = code.getResultat();
    _builder.append(_resultat, "\t");
    _builder.append(" = libwh.cons(");
    String _arg1 = code.getArg1();
    _builder.append(_arg1, "\t");
    _builder.append(", ");
    String _arg2 = code.getArg2();
    _builder.append(_arg2, "\t");
    _builder.append(");");
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
    {
      LinkedList<Quadruplet<OpImpl>> _expr = code1.getOperateur().getExpr();
      boolean _hasElements = false;
      for(final Quadruplet<OpImpl> exp : _expr) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("\n", "");
        }
        Object _translate3Add = this.translate3Add(exp);
        _builder.append(_translate3Add);
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("while( libwh.isTrue(");
    String _arg1_1 = code1.getArg1();
    _builder.append(_arg1_1);
    _builder.append(")){");
    _builder.newLineIfNotEmpty();
    {
      LinkedList<Quadruplet<OpImpl>> _cmds = code1.getOperateur().getCmds();
      for(final Quadruplet<OpImpl> cmd : _cmds) {
        Object _translate3Add_1 = this.translate3Add(cmd);
        _builder.append(_translate3Add_1);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      LinkedList<Quadruplet<OpImpl>> _expr_1 = code1.getOperateur().getExpr();
      boolean _hasElements_1 = false;
      for(final Quadruplet<OpImpl> exp_1 : _expr_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate("\n", "");
        }
        Object _translate3Add_2 = this.translate3Add(exp_1);
        _builder.append(_translate3Add_2);
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String translateIf(final Quadruplet<OpImpl> code) {
    OpImpl _operateur = code.getOperateur();
    IfOp opif = new IfOp(_operateur);
    String _resultat = code.getResultat();
    String _arg1 = code.getArg1();
    String _arg2 = code.getArg2();
    Quadruplet<IfOp> code1 = new Quadruplet<IfOp>(opif, _resultat, _arg1, _arg2);
    StringConcatenation _builder = new StringConcatenation();
    {
      LinkedList<Quadruplet<OpImpl>> _expr = code1.getOperateur().getExpr();
      boolean _hasElements = false;
      for(final Quadruplet<OpImpl> exp : _expr) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("\n", "");
        }
        Object _translate3Add = this.translate3Add(exp);
        _builder.append(_translate3Add);
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("if( libwh.isTrue(");
    String _arg1_1 = code1.getArg1();
    _builder.append(_arg1_1, "\t");
    _builder.append(")){");
    {
      LinkedList<Quadruplet<OpImpl>> _cmds = code1.getOperateur().getCmds();
      for(final Quadruplet<OpImpl> cmd : _cmds) {
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        Object _translate3Add_1 = this.translate3Add(cmd);
        _builder.append(_translate3Add_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    {
      LinkedList<Quadruplet<OpImpl>> _elsecmds = code1.getOperateur().getElsecmds();
      boolean _tripleNotEquals = (_elsecmds != null);
      if (_tripleNotEquals) {
        _builder.append("else {");
        {
          LinkedList<Quadruplet<OpImpl>> _elsecmds_1 = code1.getOperateur().getElsecmds();
          for(final Quadruplet<OpImpl> cmd_1 : _elsecmds_1) {
            _builder.newLineIfNotEmpty();
            Object _translate3Add_2 = this.translate3Add(cmd_1);
            _builder.append(_translate3Add_2);
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
          }
        }
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String translateFor(final Quadruplet<OpImpl> code) {
    OpImpl _operateur = code.getOperateur();
    ForOp opf = new ForOp(_operateur);
    String _resultat = code.getResultat();
    String _arg1 = code.getArg1();
    String _arg2 = code.getArg2();
    Quadruplet<ForOp> code1 = new Quadruplet<ForOp>(opf, _resultat, _arg1, _arg2);
    StringConcatenation _builder = new StringConcatenation();
    {
      LinkedList<Quadruplet<OpImpl>> _expr = code1.getOperateur().getExpr();
      boolean _hasElements = false;
      for(final Quadruplet<OpImpl> exp : _expr) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("\n", "");
        }
        Object _translate3Add = this.translate3Add(exp);
        _builder.append(_translate3Add);
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("while(libwh.isTrue(");
    String _arg1_1 = code1.getArg1();
    _builder.append(_arg1_1);
    _builder.append(")){");
    {
      LinkedList<Quadruplet<OpImpl>> _cmds = code1.getOperateur().getCmds();
      for(final Quadruplet<OpImpl> cmd : _cmds) {
        _builder.newLineIfNotEmpty();
        Object _translate3Add_1 = this.translate3Add(cmd);
        _builder.append(_translate3Add_1);
      }
    }
    _builder.newLineIfNotEmpty();
    String _arg1_2 = code1.getArg1();
    _builder.append(_arg1_2);
    _builder.append(" = libwh.tl(");
    String _arg1_3 = code1.getArg1();
    _builder.append(_arg1_3);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String translateForeach(final Quadruplet<OpImpl> code) {
    OpImpl _operateur = code.getOperateur();
    ForeachOp opfe = new ForeachOp(_operateur);
    String _resultat = code.getResultat();
    String _arg1 = code.getArg1();
    String _arg2 = code.getArg2();
    Quadruplet<ForeachOp> code1 = new Quadruplet<ForeachOp>(opfe, _resultat, _arg1, _arg2);
    StringConcatenation _builder = new StringConcatenation();
    {
      LinkedList<Quadruplet<OpImpl>> _expr = code1.getOperateur().getExpr();
      boolean _hasElements = false;
      for(final Quadruplet<OpImpl> exp : _expr) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("\n", "");
        }
        Object _translate3Add = this.translate3Add(exp);
        _builder.append(_translate3Add);
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("while(");
    String _arg1_1 = code1.getArg1();
    _builder.append(_arg1_1);
    _builder.append("!=null){");
    String _arg2_1 = code1.getArg2();
    _builder.append(_arg2_1);
    _builder.append(" = libwh.hd(");
    String _arg1_2 = code1.getArg1();
    _builder.append(_arg1_2);
    _builder.append(");");
    {
      LinkedList<Quadruplet<OpImpl>> _cmds = code1.getOperateur().getCmds();
      for(final Quadruplet<OpImpl> cmd : _cmds) {
        _builder.newLineIfNotEmpty();
        Object _translate3Add_1 = this.translate3Add(cmd);
        _builder.append(_translate3Add_1);
      }
    }
    _builder.newLineIfNotEmpty();
    String _arg1_3 = code1.getArg1();
    _builder.append(_arg1_3);
    _builder.append(" = libwh.tl(");
    String _arg1_4 = code1.getArg1();
    _builder.append(_arg1_4);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String translateEq(final Quadruplet<OpImpl> code) {
    StringConcatenation _builder = new StringConcatenation();
    String _resultat = code.getResultat();
    _builder.append(_resultat);
    _builder.append("=libwh.equals(");
    String _arg1 = code.getArg1();
    _builder.append(_arg1);
    _builder.append(",");
    String _arg2 = code.getArg2();
    _builder.append(_arg2);
    _builder.append(");");
    return _builder.toString();
  }
}
