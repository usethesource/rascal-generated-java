package rascal.lang.rascal.grammar;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.regex.Matcher;
import io.usethesource.vallang.*;
import io.usethesource.vallang.type.*;
import org.rascalmpl.runtime.*;
import org.rascalmpl.runtime.RascalExecutionContext;
import org.rascalmpl.runtime.function.*;
import org.rascalmpl.runtime.traverse.*;
import org.rascalmpl.runtime.utils.*;
import org.rascalmpl.exceptions.RuntimeExceptionFactory;
import org.rascalmpl.exceptions.Throw; 
import org.rascalmpl.runtime.RascalExecutionContext;
import org.rascalmpl.interpreter.control_exceptions.Filtered;
import org.rascalmpl.types.NonTerminalType;
import org.rascalmpl.types.RascalTypeFactory;
import org.rascalmpl.util.ExpiringFunctionResultCache;
import org.rascalmpl.values.RascalValueFactory;
import org.rascalmpl.values.ValueFactoryFactory;
import org.rascalmpl.values.parsetrees.ITree;
import org.rascalmpl.values.parsetrees.TreeAdapter;



@SuppressWarnings({"unused","unchecked","deprecation"})
public class $ParserGenerator 
    extends
        org.rascalmpl.runtime.$RascalModule
    implements 
    	rascal.lang.rascal.grammar.$ParserGenerator_$I {

    private final $ParserGenerator_$I $me;
    private final IList $constants;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_getParserMethodName$30580ef1fd2d4051;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_getParserMethodName$2861a6c6bdb6144b;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_getParserMethodName$467843b3f6963329;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_getParserMethodName$47f3bfe2c162a6cd;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_getParserMethodName$0fb89dbc6e34d6cd;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_getParserMethodName$789f22186d8d56bd;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_getParserMethodName$a2bf7fb8d7669112;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_getParserMethodName$fb279daa4fd4e85e;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_getParserMethodName$a623994b20b6948f;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_getParserMethodName$cb53654510730bc0;

    
    public final rascal.$Set M_Set;
    public final rascal.$IO M_IO;
    public final rascal.lang.rascal.grammar.definition.$Productions M_lang_rascal_grammar_definition_Productions;
    public final rascal.lang.rascal.grammar.definition.$Symbols M_lang_rascal_grammar_definition_Symbols;
    public final rascal.lang.rascal.grammar.definition.$Regular M_lang_rascal_grammar_definition_Regular;
    public final rascal.util.$Monitor M_util_Monitor;
    public final rascal.$ParseTree M_ParseTree;
    public final rascal.lang.rascal.grammar.definition.$Literals M_lang_rascal_grammar_definition_Literals;
    public final rascal.lang.rascal.grammar.definition.$Modules M_lang_rascal_grammar_definition_Modules;
    public final rascal.lang.rascal.grammar.$Lookahead M_lang_rascal_grammar_Lookahead;
    public final rascal.$Type M_Type;
    public final rascal.analysis.diff.edits.$FileSystemChanges M_analysis_diff_edits_FileSystemChanges;
    public final rascal.$List M_List;
    public final rascal.$Node M_Node;
    public final rascal.$Grammar M_Grammar;
    public final rascal.$Message M_Message;
    public final rascal.$Exception M_Exception;
    public final rascal.$String M_String;
    public final rascal.lang.rascal.grammar.$ConcreteSyntax M_lang_rascal_grammar_ConcreteSyntax;
    public final rascal.lang.rascal.syntax.$Rascal M_lang_rascal_syntax_Rascal;
    public final rascal.lang.rascal.grammar.definition.$Priorities M_lang_rascal_grammar_definition_Priorities;
    public final rascal.lang.rascal.grammar.definition.$Keywords M_lang_rascal_grammar_definition_Keywords;
    public final rascal.lang.rascal.grammar.definition.$Parameters M_lang_rascal_grammar_definition_Parameters;

    
    
    public IMap javaStringEscapes;
    public IMap javaIdEscapes;
    public final io.usethesource.vallang.type.Type $T7;	/*aint()*/
    public final io.usethesource.vallang.type.Type $T29;	/*aint(alabel="w")*/
    public final io.usethesource.vallang.type.Type $T14;	/*astr(alabel="new")*/
    public final io.usethesource.vallang.type.Type $T1;	/*avalue()*/
    public final io.usethesource.vallang.type.Type $T25;	/*aparameter("A",avalue(),closed=true)*/
    public final io.usethesource.vallang.type.Type $T28;	/*astr(alabel="m")*/
    public final io.usethesource.vallang.type.Type $T12;	/*aloc()*/
    public final io.usethesource.vallang.type.Type $T15;	/*aint(alabel="itemId")*/
    public final io.usethesource.vallang.type.Type $T24;	/*avoid()*/
    public final io.usethesource.vallang.type.Type $T21;	/*aparameter("T",avalue(),closed=false,alabel="b")*/
    public final io.usethesource.vallang.type.Type $T3;	/*aparameter("T",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type $T20;	/*aparameter("T",avalue(),closed=false,alabel="a")*/
    public final io.usethesource.vallang.type.Type $T4;	/*astr()*/
    public final io.usethesource.vallang.type.Type ADT_Replacement;	/*aadt("Replacement",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Replacement;	/*aadt("Replacement",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T10;	/*alit(",")*/
    public final io.usethesource.vallang.type.Type ADT_ProtocolChars;	/*aadt("ProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ProtocolChars;	/*aadt("ProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FunctionType;	/*aadt("FunctionType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionType;	/*aadt("FunctionType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Visibility;	/*aadt("Visibility",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Visibility;	/*aadt("Visibility",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PostProtocolChars;	/*aadt("PostProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PostProtocolChars;	/*aadt("PostProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Expression;	/*aadt("Expression",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Expression;	/*aadt("Expression",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Mapping_Expression;	/*aadt("Mapping",[aadt("Expression",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Mapping_Expression;	/*aadt("Mapping",[aadt("Expression",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_LocalVariableDeclaration;	/*aadt("LocalVariableDeclaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_LocalVariableDeclaration;	/*aadt("LocalVariableDeclaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Strategy;	/*aadt("Strategy",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Strategy;	/*aadt("Strategy",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Tree;	/*aadt("Tree",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T22;	/*aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)*/
    public final io.usethesource.vallang.type.Type ADT_KeywordArguments_1;	/*aadt("KeywordArguments",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordArguments_1;	/*aadt("KeywordArguments",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_MidStringChars;	/*aadt("MidStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_MidStringChars;	/*aadt("MidStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Attr;	/*aadt("Attr",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_IOCapability;	/*aadt("IOCapability",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Tag;	/*aadt("Tag",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Tag;	/*aadt("Tag",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Name;	/*aadt("Name",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Name;	/*aadt("Name",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TagString;	/*aadt("TagString",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TagString;	/*aadt("TagString",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Variable;	/*aadt("Variable",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Variable;	/*aadt("Variable",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Symbol;	/*aadt("Symbol",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T16;	/*atuple(atypeList([astr(alabel="new"),aint(alabel="itemId")]),alabel="new")*/
    public final io.usethesource.vallang.type.Type $T17;	/*amap(aadt("Item",[],dataSyntax(),alabel="item"),atuple(atypeList([astr(alabel="new"),aint(alabel="itemId")]),alabel="new"))*/
    public final io.usethesource.vallang.type.Type $T13;	/*amap(aadt("Symbol",[],dataSyntax()),amap(aadt("Item",[],dataSyntax(),alabel="item"),atuple(atypeList([astr(alabel="new"),aint(alabel="itemId")]),alabel="new")))*/
    public final io.usethesource.vallang.type.Type ADT_Production;	/*aadt("Production",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Maybe_Production;	/*aadt("Maybe",[aadt("Production",[],dataSyntax())],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Concrete;	/*aadt("Concrete",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Concrete;	/*aadt("Concrete",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Pattern;	/*aadt("Pattern",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Pattern;	/*aadt("Pattern",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Mapping_Pattern;	/*aadt("Mapping",[aadt("Pattern",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Mapping_Pattern;	/*aadt("Mapping",[aadt("Pattern",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Range;	/*aadt("Range",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Range;	/*aadt("Range",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_LAYOUT;	/*aadt("LAYOUT",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_LAYOUT;	/*aadt("LAYOUT",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Item;	/*aadt("Item",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RationalLiteral;	/*aadt("RationalLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RationalLiteral;	/*aadt("RationalLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type Maybe_Production_just_Production;	/*acons(aadt("Maybe",[aadt("Production",[],dataSyntax())],dataSyntax()),[aadt("Production",[],dataSyntax(),alabel="val")],[],alabel="just")*/
    public final io.usethesource.vallang.type.Type ADT_GrammarModule;	/*aadt("GrammarModule",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RegExpLiteral;	/*aadt("RegExpLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RegExpLiteral;	/*aadt("RegExpLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Declarator;	/*aadt("Declarator",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Declarator;	/*aadt("Declarator",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ModuleParameters;	/*aadt("ModuleParameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ModuleParameters;	/*aadt("ModuleParameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T23;	/*aparameter("T",aadt("Tree",[],dataSyntax()),closed=false)*/
    public final io.usethesource.vallang.type.Type ADT_SyntaxDefinition;	/*aadt("SyntaxDefinition",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_SyntaxDefinition;	/*aadt("SyntaxDefinition",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Output;	/*aadt("Output",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Output;	/*aadt("Output",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_DatePart;	/*aadt("DatePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DatePart;	/*aadt("DatePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_OptionalTerminator;	/*aadt("OptionalTerminator",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_OptionalTerminator;	/*aadt("OptionalTerminator",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ImportedModule;	/*aadt("ImportedModule",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ImportedModule;	/*aadt("ImportedModule",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RegExpModifier;	/*aadt("RegExpModifier",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RegExpModifier;	/*aadt("RegExpModifier",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Case;	/*aadt("Case",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Case;	/*aadt("Case",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_BooleanLiteral;	/*aadt("BooleanLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_BooleanLiteral;	/*aadt("BooleanLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_IntegerLiteral;	/*aadt("IntegerLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_IntegerLiteral;	/*aadt("IntegerLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TreeSearchResult_Tree;	/*aadt("TreeSearchResult",[aadt("Tree",[],dataSyntax())],dataSyntax())*/
    public final io.usethesource.vallang.type.Type TreeSearchResult_Tree_treeFound_Tree;	/*acons(aadt("TreeSearchResult",[aadt("Tree",[],dataSyntax())],dataSyntax()),[aadt("Tree",[],dataSyntax(),alabel="tree")],[],alabel="treeFound")*/
    public final io.usethesource.vallang.type.Type ADT_Target;	/*aadt("Target",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Target;	/*aadt("Target",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TimePartNoTZ;	/*aadt("TimePartNoTZ",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TimePartNoTZ;	/*aadt("TimePartNoTZ",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_KeywordArguments_Expression;	/*aadt("KeywordArguments",[aadt("Expression",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordArguments_Expression;	/*aadt("KeywordArguments",[aadt("Expression",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_OptionalExpression;	/*aadt("OptionalExpression",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_OptionalExpression;	/*aadt("OptionalExpression",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_GrammarDefinition;	/*aadt("GrammarDefinition",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_CharRange;	/*aadt("CharRange",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T11;	/*alist(aadt("CharRange",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type ADT_KeywordArgument_1;	/*aadt("KeywordArgument",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordArgument_1;	/*aadt("KeywordArgument",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_DataTarget;	/*aadt("DataTarget",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DataTarget;	/*aadt("DataTarget",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Signature;	/*aadt("Signature",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Signature;	/*aadt("Signature",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PathPart;	/*aadt("PathPart",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PathPart;	/*aadt("PathPart",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Associativity;	/*aadt("Associativity",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Renamings;	/*aadt("Renamings",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Renamings;	/*aadt("Renamings",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_KeywordFormal;	/*aadt("KeywordFormal",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordFormal;	/*aadt("KeywordFormal",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T30;	/*afunc(avoid(),[astr(alabel="m"),aint(alabel="w")],[],alabel="worked")*/
    public final io.usethesource.vallang.type.Type ADT_PostStringChars;	/*aadt("PostStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PostStringChars;	/*aadt("PostStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Catch;	/*aadt("Catch",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Catch;	/*aadt("Catch",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_HexIntegerLiteral;	/*aadt("HexIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_HexIntegerLiteral;	/*aadt("HexIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ShellCommand;	/*aadt("ShellCommand",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ShellCommand;	/*aadt("ShellCommand",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TimeZonePart;	/*aadt("TimeZonePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TimeZonePart;	/*aadt("TimeZonePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Declaration;	/*aadt("Declaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Declaration;	/*aadt("Declaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T19;	/*abool()*/
    public final io.usethesource.vallang.type.Type $T18;	/*afunc(abool(),[aparameter("T",avalue(),closed=false,alabel="a"),aparameter("T",avalue(),closed=false,alabel="b")],[])*/
    public final io.usethesource.vallang.type.Type ADT_KeywordFormals;	/*aadt("KeywordFormals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordFormals;	/*aadt("KeywordFormals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FunctionBody;	/*aadt("FunctionBody",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionBody;	/*aadt("FunctionBody",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Maybe_1;	/*aadt("Maybe",[aparameter("A",avalue(),closed=true)],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Renaming;	/*aadt("Renaming",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Renaming;	/*aadt("Renaming",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_LocationLiteral;	/*aadt("LocationLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_LocationLiteral;	/*aadt("LocationLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RegExp;	/*aadt("RegExp",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RegExp;	/*aadt("RegExp",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Nonterminal;	/*aadt("Nonterminal",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Nonterminal;	/*aadt("Nonterminal",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_StringLiteral;	/*aadt("StringLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringLiteral;	/*aadt("StringLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PreStringChars;	/*aadt("PreStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PreStringChars;	/*aadt("PreStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type $T2;	/*alist(aparameter("T",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type ADT_NonterminalLabel;	/*aadt("NonterminalLabel",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_NonterminalLabel;	/*aadt("NonterminalLabel",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Mapping_1;	/*aadt("Mapping",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Mapping_1;	/*aadt("Mapping",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TypeArg;	/*aadt("TypeArg",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TypeArg;	/*aadt("TypeArg",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TreeSearchResult_1;	/*aadt("TreeSearchResult",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Type;	/*aadt("Type",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Type;	/*aadt("Type",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Bound;	/*aadt("Bound",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Bound;	/*aadt("Bound",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Maybe_Symbol;	/*aadt("Maybe",[aadt("Symbol",[],dataSyntax())],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_URLChars;	/*aadt("URLChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_URLChars;	/*aadt("URLChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Condition;	/*aadt("Condition",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T33;	/*alist(aadt("Symbol",[],dataSyntax(),alabel="sep"))*/
    public final io.usethesource.vallang.type.Type ADT_Maybe_Attr;	/*aadt("Maybe",[aadt("Attr",[],dataSyntax())],dataSyntax())*/
    public final io.usethesource.vallang.type.Type Maybe_Attr_just_Attr;	/*acons(aadt("Maybe",[aadt("Attr",[],dataSyntax())],dataSyntax()),[aadt("Attr",[],dataSyntax(),alabel="val")],[],alabel="just")*/
    public final io.usethesource.vallang.type.Type ADT_Class;	/*aadt("Class",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Class;	/*aadt("Class",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_KeywordArguments_Pattern;	/*aadt("KeywordArguments",[aadt("Pattern",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordArguments_Pattern;	/*aadt("KeywordArguments",[aadt("Pattern",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TreeSearchResult_void;	/*aadt("TreeSearchResult",[avoid()],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Field;	/*aadt("Field",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Field;	/*aadt("Field",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ModuleActuals;	/*aadt("ModuleActuals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ModuleActuals;	/*aadt("ModuleActuals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Tags;	/*aadt("Tags",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Tags;	/*aadt("Tags",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_DataTypeSelector;	/*aadt("DataTypeSelector",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DataTypeSelector;	/*aadt("DataTypeSelector",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Start;	/*aadt("Start",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Start;	/*aadt("Start",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_OptionalComma;	/*aadt("OptionalComma",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_OptionalComma;	/*aadt("OptionalComma",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_StringConstant;	/*aadt("StringConstant",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringConstant;	/*aadt("StringConstant",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type $T32;	/*alist(avoid())*/
    public final io.usethesource.vallang.type.Type ADT_Char;	/*aadt("Char",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Char;	/*aadt("Char",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_CaseInsensitiveStringConstant;	/*aadt("CaseInsensitiveStringConstant",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_CaseInsensitiveStringConstant;	/*aadt("CaseInsensitiveStringConstant",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Backslash;	/*aadt("Backslash",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Backslash;	/*aadt("Backslash",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type $T27;	/*afunc(astr(),[afunc(avoid(),[astr(alabel="m"),aint(alabel="w")],[],alabel="worked")],[],returnsViaAllPath=true)*/
    public final io.usethesource.vallang.type.Type ADT_PrePathChars;	/*aadt("PrePathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PrePathChars;	/*aadt("PrePathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_StringTail;	/*aadt("StringTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringTail;	/*aadt("StringTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Exception;	/*aadt("Exception",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type Symbol_topRegular_Symbol;	/*acons(aadt("Symbol",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="symbol")],[],alabel="topRegular")*/
    public final io.usethesource.vallang.type.Type ADT_Header;	/*aadt("Header",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Header;	/*aadt("Header",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PatternWithAction;	/*aadt("PatternWithAction",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PatternWithAction;	/*aadt("PatternWithAction",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Module;	/*aadt("Module",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Module;	/*aadt("Module",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Assignment;	/*aadt("Assignment",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Assignment;	/*aadt("Assignment",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Body;	/*aadt("Body",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Body;	/*aadt("Body",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_LAYOUTLIST;	/*aadt("LAYOUTLIST",[],layoutSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_JustDate;	/*aadt("JustDate",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_JustDate;	/*aadt("JustDate",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type $T0;	/*aset(aadt("Symbol",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type ADT_FunctionDeclaration;	/*aadt("FunctionDeclaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionDeclaration;	/*aadt("FunctionDeclaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TypeVar;	/*aadt("TypeVar",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TypeVar;	/*aadt("TypeVar",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T34;	/*alist(aadt("Symbol",[],dataSyntax(),alabel="_"))*/
    public final io.usethesource.vallang.type.Type ADT_Import;	/*aadt("Import",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Import;	/*aadt("Import",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FunctionModifiers;	/*aadt("FunctionModifiers",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionModifiers;	/*aadt("FunctionModifiers",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T31;	/*aset(aadt("Attr",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type ADT_Grammar;	/*aadt("Grammar",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ConcreteHole;	/*aadt("ConcreteHole",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ConcreteHole;	/*aadt("ConcreteHole",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Variant;	/*aadt("Variant",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Variant;	/*aadt("Variant",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Comprehension;	/*aadt("Comprehension",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Comprehension;	/*aadt("Comprehension",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Message;	/*aadt("Message",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_StringMiddle;	/*aadt("StringMiddle",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringMiddle;	/*aadt("StringMiddle",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RealLiteral;	/*aadt("RealLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RealLiteral;	/*aadt("RealLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type $T6;	/*alist(aadt("Symbol",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type ADT_OptionalEqualSign;	/*aadt("OptionalEqualSign",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_OptionalEqualSign;	/*aadt("OptionalEqualSign",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_DateAndTime;	/*aadt("DateAndTime",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DateAndTime;	/*aadt("DateAndTime",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_QualifiedName;	/*aadt("QualifiedName",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_QualifiedName;	/*aadt("QualifiedName",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_MidPathChars;	/*aadt("MidPathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_MidPathChars;	/*aadt("MidPathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_UserType;	/*aadt("UserType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_UserType;	/*aadt("UserType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Sym;	/*aadt("Sym",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Sym;	/*aadt("Sym",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T9;	/*\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())])*/
    public final io.usethesource.vallang.type.Type ADT_Formals;	/*aadt("Formals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Formals;	/*aadt("Formals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Maybe_Associativity;	/*aadt("Maybe",[aadt("Associativity",[],dataSyntax())],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Parameters;	/*aadt("Parameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Parameters;	/*aadt("Parameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Maybe_void;	/*aadt("Maybe",[avoid()],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RascalKeywords;	/*aadt("RascalKeywords",[],keywordSyntax())*/
    public final io.usethesource.vallang.type.Type $T5;	/*aset(aparameter("T",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type Maybe_Associativity_just_Associativity;	/*acons(aadt("Maybe",[aadt("Associativity",[],dataSyntax())],dataSyntax()),[aadt("Associativity",[],dataSyntax(),alabel="val")],[],alabel="just")*/
    public final io.usethesource.vallang.type.Type ADT_MidProtocolChars;	/*aadt("MidProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_MidProtocolChars;	/*aadt("MidProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ProtocolPart;	/*aadt("ProtocolPart",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ProtocolPart;	/*aadt("ProtocolPart",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_OctalIntegerLiteral;	/*aadt("OctalIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_OctalIntegerLiteral;	/*aadt("OctalIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_HorizontalSpace;	/*aadt("HorizontalSpace",[],layoutSyntax())*/
    public final io.usethesource.vallang.type.Type Maybe_Symbol_just_Symbol;	/*acons(aadt("Maybe",[aadt("Symbol",[],dataSyntax())],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="val")],[],alabel="just")*/
    public final io.usethesource.vallang.type.Type ADT_StringTemplate;	/*aadt("StringTemplate",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringTemplate;	/*aadt("StringTemplate",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Label;	/*aadt("Label",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Label;	/*aadt("Label",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T35;	/*anode([])*/
    public final io.usethesource.vallang.type.Type ADT_DecimalIntegerLiteral;	/*aadt("DecimalIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DecimalIntegerLiteral;	/*aadt("DecimalIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Prod;	/*aadt("Prod",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Prod;	/*aadt("Prod",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FileSystemChange;	/*aadt("FileSystemChange",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Kind;	/*aadt("Kind",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Kind;	/*aadt("Kind",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PreProtocolChars;	/*aadt("PreProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PreProtocolChars;	/*aadt("PreProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_NamedRegExp;	/*aadt("NamedRegExp",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_NamedRegExp;	/*aadt("NamedRegExp",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_NamedBackslash;	/*aadt("NamedBackslash",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_NamedBackslash;	/*aadt("NamedBackslash",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Assoc;	/*aadt("Assoc",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Assoc;	/*aadt("Assoc",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_DateTimeLiteral;	/*aadt("DateTimeLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DateTimeLiteral;	/*aadt("DateTimeLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PathTail;	/*aadt("PathTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PathTail;	/*aadt("PathTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RuntimeException;	/*aadt("RuntimeException",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PostPathChars;	/*aadt("PostPathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PostPathChars;	/*aadt("PostPathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_EvalCommand;	/*aadt("EvalCommand",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_EvalCommand;	/*aadt("EvalCommand",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PathChars;	/*aadt("PathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PathChars;	/*aadt("PathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_JustTime;	/*aadt("JustTime",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_JustTime;	/*aadt("JustTime",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ProdModifier;	/*aadt("ProdModifier",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ProdModifier;	/*aadt("ProdModifier",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T8;	/*aset(aadt("Condition",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type ADT_Literal;	/*aadt("Literal",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Literal;	/*aadt("Literal",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_StringCharacter;	/*aadt("StringCharacter",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringCharacter;	/*aadt("StringCharacter",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Toplevel;	/*aadt("Toplevel",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Toplevel;	/*aadt("Toplevel",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FunctionModifier;	/*aadt("FunctionModifier",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionModifier;	/*aadt("FunctionModifier",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Statement;	/*aadt("Statement",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Statement;	/*aadt("Statement",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Commands;	/*aadt("Commands",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Commands;	/*aadt("Commands",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Comment;	/*aadt("Comment",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Comment;	/*aadt("Comment",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ProtocolTail;	/*aadt("ProtocolTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ProtocolTail;	/*aadt("ProtocolTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_StructuredType;	/*aadt("StructuredType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StructuredType;	/*aadt("StructuredType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Command;	/*aadt("Command",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Command;	/*aadt("Command",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T36;	/*overloadedAType({<|rascal+constructor:///lang/rascal/syntax/Rascal/empty$7653a97a3fe0faf6|,constructorId(),aadt("Bound",[],contextFreeSyntax())>,<|rascal+constructor:///lang/rascal/syntax/Rascal/empty$c9a37a2fc65dedd3|,constructorId(),aadt("Target",[],contextFreeSyntax())>,<|rascal+constructor:///lang/rascal/syntax/Rascal/empty$9c5df0ce74a8145b|,constructorId(),aadt("Sym",[],contextFreeSyntax())>,<|rascal+constructor:///lang/rascal/syntax/Rascal/empty$9a5897525e1448d0|,constructorId(),aadt("DataTarget",[],contextFreeSyntax())>,<|rascal+constructor:///ParseTree/empty$0d9c27eed1a44d3a|,constructorId(),aadt("Symbol",[],dataSyntax())>,<|rascal+constructor:///lang/rascal/syntax/Rascal/empty$23d266ed78a2f5d7|,constructorId(),aadt("Label",[],contextFreeSyntax())>})*/
    public final io.usethesource.vallang.type.Type $T26;	/*afunc(abool(),[aadt("Item",[],dataSyntax(),alabel="l"),aadt("Item",[],dataSyntax(),alabel="r")],[],returnsViaAllPath=true)*/
    public final io.usethesource.vallang.type.Type ADT_Assignable;	/*aadt("Assignable",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Assignable;	/*aadt("Assignable",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ConcretePart;	/*aadt("ConcretePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ConcretePart;	/*aadt("ConcretePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_BasicType;	/*aadt("BasicType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_BasicType;	/*aadt("BasicType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Visit;	/*aadt("Visit",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Visit;	/*aadt("Visit",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_UnicodeEscape;	/*aadt("UnicodeEscape",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_UnicodeEscape;	/*aadt("UnicodeEscape",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_CommonKeywordParameters;	/*aadt("CommonKeywordParameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_CommonKeywordParameters;	/*aadt("CommonKeywordParameters",[],contextFreeSyntax())*/

    public $ParserGenerator(RascalExecutionContext rex){
        this(rex, null);
    }
    
    public $ParserGenerator(RascalExecutionContext rex, Object extended){
       super(rex);
       this.$me = extended == null ? this : ($ParserGenerator_$I)extended;
       ModuleStore mstore = rex.getModuleStore();
       mstore.put(rascal.lang.rascal.grammar.$ParserGenerator.class, this);
       
       mstore.importModule(rascal.$Set.class, rex, rascal.$Set::new);
       mstore.importModule(rascal.$IO.class, rex, rascal.$IO::new);
       mstore.importModule(rascal.lang.rascal.grammar.definition.$Productions.class, rex, rascal.lang.rascal.grammar.definition.$Productions::new);
       mstore.importModule(rascal.lang.rascal.grammar.definition.$Symbols.class, rex, rascal.lang.rascal.grammar.definition.$Symbols::new);
       mstore.importModule(rascal.lang.rascal.grammar.definition.$Regular.class, rex, rascal.lang.rascal.grammar.definition.$Regular::new);
       mstore.importModule(rascal.util.$Monitor.class, rex, rascal.util.$Monitor::new);
       mstore.importModule(rascal.$ParseTree.class, rex, rascal.$ParseTree::new);
       mstore.importModule(rascal.lang.rascal.grammar.definition.$Literals.class, rex, rascal.lang.rascal.grammar.definition.$Literals::new);
       mstore.importModule(rascal.lang.rascal.grammar.definition.$Modules.class, rex, rascal.lang.rascal.grammar.definition.$Modules::new);
       mstore.importModule(rascal.lang.rascal.grammar.$Lookahead.class, rex, rascal.lang.rascal.grammar.$Lookahead::new);
       mstore.importModule(rascal.$Type.class, rex, rascal.$Type::new);
       mstore.importModule(rascal.analysis.diff.edits.$FileSystemChanges.class, rex, rascal.analysis.diff.edits.$FileSystemChanges::new);
       mstore.importModule(rascal.$List.class, rex, rascal.$List::new);
       mstore.importModule(rascal.$Node.class, rex, rascal.$Node::new);
       mstore.importModule(rascal.$Grammar.class, rex, rascal.$Grammar::new);
       mstore.importModule(rascal.$Message.class, rex, rascal.$Message::new);
       mstore.importModule(rascal.$Exception.class, rex, rascal.$Exception::new);
       mstore.importModule(rascal.$String.class, rex, rascal.$String::new);
       mstore.importModule(rascal.lang.rascal.grammar.$ConcreteSyntax.class, rex, rascal.lang.rascal.grammar.$ConcreteSyntax::new);
       mstore.importModule(rascal.lang.rascal.syntax.$Rascal.class, rex, rascal.lang.rascal.syntax.$Rascal::new);
       mstore.importModule(rascal.lang.rascal.grammar.definition.$Priorities.class, rex, rascal.lang.rascal.grammar.definition.$Priorities::new);
       mstore.importModule(rascal.lang.rascal.grammar.definition.$Keywords.class, rex, rascal.lang.rascal.grammar.definition.$Keywords::new);
       mstore.importModule(rascal.lang.rascal.grammar.definition.$Parameters.class, rex, rascal.lang.rascal.grammar.definition.$Parameters::new); 
       
       M_Set = mstore.getModule(rascal.$Set.class);
       M_IO = mstore.getModule(rascal.$IO.class);
       M_lang_rascal_grammar_definition_Productions = mstore.getModule(rascal.lang.rascal.grammar.definition.$Productions.class);
       M_lang_rascal_grammar_definition_Symbols = mstore.getModule(rascal.lang.rascal.grammar.definition.$Symbols.class);
       M_lang_rascal_grammar_definition_Regular = mstore.getModule(rascal.lang.rascal.grammar.definition.$Regular.class);
       M_util_Monitor = mstore.getModule(rascal.util.$Monitor.class);
       M_ParseTree = mstore.getModule(rascal.$ParseTree.class);
       M_lang_rascal_grammar_definition_Literals = mstore.getModule(rascal.lang.rascal.grammar.definition.$Literals.class);
       M_lang_rascal_grammar_definition_Modules = mstore.getModule(rascal.lang.rascal.grammar.definition.$Modules.class);
       M_lang_rascal_grammar_Lookahead = mstore.getModule(rascal.lang.rascal.grammar.$Lookahead.class);
       M_Type = mstore.getModule(rascal.$Type.class);
       M_analysis_diff_edits_FileSystemChanges = mstore.getModule(rascal.analysis.diff.edits.$FileSystemChanges.class);
       M_List = mstore.getModule(rascal.$List.class);
       M_Node = mstore.getModule(rascal.$Node.class);
       M_Grammar = mstore.getModule(rascal.$Grammar.class);
       M_Message = mstore.getModule(rascal.$Message.class);
       M_Exception = mstore.getModule(rascal.$Exception.class);
       M_String = mstore.getModule(rascal.$String.class);
       M_lang_rascal_grammar_ConcreteSyntax = mstore.getModule(rascal.lang.rascal.grammar.$ConcreteSyntax.class);
       M_lang_rascal_syntax_Rascal = mstore.getModule(rascal.lang.rascal.syntax.$Rascal.class);
       M_lang_rascal_grammar_definition_Priorities = mstore.getModule(rascal.lang.rascal.grammar.definition.$Priorities.class);
       M_lang_rascal_grammar_definition_Keywords = mstore.getModule(rascal.lang.rascal.grammar.definition.$Keywords.class);
       M_lang_rascal_grammar_definition_Parameters = mstore.getModule(rascal.lang.rascal.grammar.definition.$Parameters.class); 
       
                          
       
       $TS.importStore(M_Set.$TS);
       $TS.importStore(M_IO.$TS);
       $TS.importStore(M_lang_rascal_grammar_definition_Productions.$TS);
       $TS.importStore(M_lang_rascal_grammar_definition_Symbols.$TS);
       $TS.importStore(M_lang_rascal_grammar_definition_Regular.$TS);
       $TS.importStore(M_util_Monitor.$TS);
       $TS.importStore(M_ParseTree.$TS);
       $TS.importStore(M_lang_rascal_grammar_definition_Literals.$TS);
       $TS.importStore(M_lang_rascal_grammar_definition_Modules.$TS);
       $TS.importStore(M_lang_rascal_grammar_Lookahead.$TS);
       $TS.importStore(M_Type.$TS);
       $TS.importStore(M_analysis_diff_edits_FileSystemChanges.$TS);
       $TS.importStore(M_List.$TS);
       $TS.importStore(M_Node.$TS);
       $TS.importStore(M_Grammar.$TS);
       $TS.importStore(M_Message.$TS);
       $TS.importStore(M_Exception.$TS);
       $TS.importStore(M_String.$TS);
       $TS.importStore(M_lang_rascal_grammar_ConcreteSyntax.$TS);
       $TS.importStore(M_lang_rascal_syntax_Rascal.$TS);
       $TS.importStore(M_lang_rascal_grammar_definition_Priorities.$TS);
       $TS.importStore(M_lang_rascal_grammar_definition_Keywords.$TS);
       $TS.importStore(M_lang_rascal_grammar_definition_Parameters.$TS);
       
       $constants = readBinaryConstantsFile(this.getClass(), "rascal/lang/rascal/grammar/$ParserGenerator.constants", 48, "04a219edd0e1cd77b8868c90e21bf681");
       NT_Replacement = $sort("Replacement");
       ADT_Replacement = $adt("Replacement");
       NT_ProtocolChars = $lex("ProtocolChars");
       ADT_ProtocolChars = $adt("ProtocolChars");
       NT_FunctionType = $sort("FunctionType");
       ADT_FunctionType = $adt("FunctionType");
       NT_Visibility = $sort("Visibility");
       ADT_Visibility = $adt("Visibility");
       NT_PostProtocolChars = $lex("PostProtocolChars");
       ADT_PostProtocolChars = $adt("PostProtocolChars");
       NT_Expression = $sort("Expression");
       ADT_Expression = $adt("Expression");
       NT_LocalVariableDeclaration = $sort("LocalVariableDeclaration");
       ADT_LocalVariableDeclaration = $adt("LocalVariableDeclaration");
       NT_Strategy = $sort("Strategy");
       ADT_Strategy = $adt("Strategy");
       ADT_Tree = $adt("Tree");
       NT_MidStringChars = $lex("MidStringChars");
       ADT_MidStringChars = $adt("MidStringChars");
       ADT_Attr = $adt("Attr");
       ADT_IOCapability = $adt("IOCapability");
       NT_Tag = $sort("Tag");
       ADT_Tag = $adt("Tag");
       NT_Name = $lex("Name");
       ADT_Name = $adt("Name");
       NT_TagString = $lex("TagString");
       ADT_TagString = $adt("TagString");
       NT_Variable = $sort("Variable");
       ADT_Variable = $adt("Variable");
       ADT_Symbol = $adt("Symbol");
       ADT_Production = $adt("Production");
       NT_Concrete = $lex("Concrete");
       ADT_Concrete = $adt("Concrete");
       NT_Pattern = $sort("Pattern");
       ADT_Pattern = $adt("Pattern");
       NT_Range = $sort("Range");
       ADT_Range = $adt("Range");
       NT_LAYOUT = $lex("LAYOUT");
       ADT_LAYOUT = $adt("LAYOUT");
       ADT_Item = $adt("Item");
       NT_RationalLiteral = $lex("RationalLiteral");
       ADT_RationalLiteral = $adt("RationalLiteral");
       ADT_GrammarModule = $adt("GrammarModule");
       NT_RegExpLiteral = $lex("RegExpLiteral");
       ADT_RegExpLiteral = $adt("RegExpLiteral");
       NT_Declarator = $sort("Declarator");
       ADT_Declarator = $adt("Declarator");
       NT_ModuleParameters = $sort("ModuleParameters");
       ADT_ModuleParameters = $adt("ModuleParameters");
       NT_SyntaxDefinition = $sort("SyntaxDefinition");
       ADT_SyntaxDefinition = $adt("SyntaxDefinition");
       NT_Output = $lex("Output");
       ADT_Output = $adt("Output");
       NT_DatePart = $lex("DatePart");
       ADT_DatePart = $adt("DatePart");
       NT_OptionalTerminator = $lex("OptionalTerminator");
       ADT_OptionalTerminator = $adt("OptionalTerminator");
       NT_ImportedModule = $sort("ImportedModule");
       ADT_ImportedModule = $adt("ImportedModule");
       NT_RegExpModifier = $lex("RegExpModifier");
       ADT_RegExpModifier = $adt("RegExpModifier");
       NT_Case = $sort("Case");
       ADT_Case = $adt("Case");
       NT_BooleanLiteral = $lex("BooleanLiteral");
       ADT_BooleanLiteral = $adt("BooleanLiteral");
       NT_IntegerLiteral = $sort("IntegerLiteral");
       ADT_IntegerLiteral = $adt("IntegerLiteral");
       NT_Target = $sort("Target");
       ADT_Target = $adt("Target");
       NT_TimePartNoTZ = $lex("TimePartNoTZ");
       ADT_TimePartNoTZ = $adt("TimePartNoTZ");
       NT_OptionalExpression = $sort("OptionalExpression");
       ADT_OptionalExpression = $adt("OptionalExpression");
       ADT_GrammarDefinition = $adt("GrammarDefinition");
       ADT_CharRange = $adt("CharRange");
       NT_DataTarget = $sort("DataTarget");
       ADT_DataTarget = $adt("DataTarget");
       NT_Signature = $sort("Signature");
       ADT_Signature = $adt("Signature");
       NT_PathPart = $sort("PathPart");
       ADT_PathPart = $adt("PathPart");
       ADT_Associativity = $adt("Associativity");
       NT_Renamings = $sort("Renamings");
       ADT_Renamings = $adt("Renamings");
       NT_KeywordFormal = $sort("KeywordFormal");
       ADT_KeywordFormal = $adt("KeywordFormal");
       NT_PostStringChars = $lex("PostStringChars");
       ADT_PostStringChars = $adt("PostStringChars");
       NT_Catch = $sort("Catch");
       ADT_Catch = $adt("Catch");
       NT_HexIntegerLiteral = $lex("HexIntegerLiteral");
       ADT_HexIntegerLiteral = $adt("HexIntegerLiteral");
       NT_ShellCommand = $sort("ShellCommand");
       ADT_ShellCommand = $adt("ShellCommand");
       NT_TimeZonePart = $lex("TimeZonePart");
       ADT_TimeZonePart = $adt("TimeZonePart");
       NT_Declaration = $sort("Declaration");
       ADT_Declaration = $adt("Declaration");
       NT_KeywordFormals = $sort("KeywordFormals");
       ADT_KeywordFormals = $adt("KeywordFormals");
       NT_FunctionBody = $sort("FunctionBody");
       ADT_FunctionBody = $adt("FunctionBody");
       NT_Renaming = $sort("Renaming");
       ADT_Renaming = $adt("Renaming");
       NT_LocationLiteral = $sort("LocationLiteral");
       ADT_LocationLiteral = $adt("LocationLiteral");
       NT_RegExp = $lex("RegExp");
       ADT_RegExp = $adt("RegExp");
       NT_Nonterminal = $lex("Nonterminal");
       ADT_Nonterminal = $adt("Nonterminal");
       NT_StringLiteral = $sort("StringLiteral");
       ADT_StringLiteral = $adt("StringLiteral");
       NT_PreStringChars = $lex("PreStringChars");
       ADT_PreStringChars = $adt("PreStringChars");
       NT_NonterminalLabel = $lex("NonterminalLabel");
       ADT_NonterminalLabel = $adt("NonterminalLabel");
       NT_TypeArg = $sort("TypeArg");
       ADT_TypeArg = $adt("TypeArg");
       NT_Type = $sort("Type");
       ADT_Type = $adt("Type");
       NT_Bound = $sort("Bound");
       ADT_Bound = $adt("Bound");
       NT_URLChars = $lex("URLChars");
       ADT_URLChars = $adt("URLChars");
       ADT_Condition = $adt("Condition");
       NT_Class = $sort("Class");
       ADT_Class = $adt("Class");
       NT_Field = $sort("Field");
       ADT_Field = $adt("Field");
       NT_ModuleActuals = $sort("ModuleActuals");
       ADT_ModuleActuals = $adt("ModuleActuals");
       NT_Tags = $sort("Tags");
       ADT_Tags = $adt("Tags");
       NT_DataTypeSelector = $sort("DataTypeSelector");
       ADT_DataTypeSelector = $adt("DataTypeSelector");
       NT_Start = $sort("Start");
       ADT_Start = $adt("Start");
       NT_OptionalComma = $lex("OptionalComma");
       ADT_OptionalComma = $adt("OptionalComma");
       NT_StringConstant = $lex("StringConstant");
       ADT_StringConstant = $adt("StringConstant");
       NT_Char = $lex("Char");
       ADT_Char = $adt("Char");
       NT_CaseInsensitiveStringConstant = $lex("CaseInsensitiveStringConstant");
       ADT_CaseInsensitiveStringConstant = $adt("CaseInsensitiveStringConstant");
       NT_Backslash = $lex("Backslash");
       ADT_Backslash = $adt("Backslash");
       NT_PrePathChars = $lex("PrePathChars");
       ADT_PrePathChars = $adt("PrePathChars");
       NT_StringTail = $sort("StringTail");
       ADT_StringTail = $adt("StringTail");
       ADT_Exception = $adt("Exception");
       NT_Header = $sort("Header");
       ADT_Header = $adt("Header");
       NT_PatternWithAction = $sort("PatternWithAction");
       ADT_PatternWithAction = $adt("PatternWithAction");
       NT_Module = $sort("Module");
       ADT_Module = $adt("Module");
       NT_Assignment = $sort("Assignment");
       ADT_Assignment = $adt("Assignment");
       NT_Body = $sort("Body");
       ADT_Body = $adt("Body");
       ADT_LAYOUTLIST = $layouts("LAYOUTLIST");
       NT_JustDate = $lex("JustDate");
       ADT_JustDate = $adt("JustDate");
       NT_FunctionDeclaration = $sort("FunctionDeclaration");
       ADT_FunctionDeclaration = $adt("FunctionDeclaration");
       NT_TypeVar = $sort("TypeVar");
       ADT_TypeVar = $adt("TypeVar");
       NT_Import = $sort("Import");
       ADT_Import = $adt("Import");
       NT_FunctionModifiers = $sort("FunctionModifiers");
       ADT_FunctionModifiers = $adt("FunctionModifiers");
       ADT_Grammar = $adt("Grammar");
       NT_ConcreteHole = $sort("ConcreteHole");
       ADT_ConcreteHole = $adt("ConcreteHole");
       NT_Variant = $sort("Variant");
       ADT_Variant = $adt("Variant");
       NT_Comprehension = $sort("Comprehension");
       ADT_Comprehension = $adt("Comprehension");
       ADT_Message = $adt("Message");
       NT_StringMiddle = $sort("StringMiddle");
       ADT_StringMiddle = $adt("StringMiddle");
       NT_RealLiteral = $lex("RealLiteral");
       ADT_RealLiteral = $adt("RealLiteral");
       NT_OptionalEqualSign = $lex("OptionalEqualSign");
       ADT_OptionalEqualSign = $adt("OptionalEqualSign");
       NT_DateAndTime = $lex("DateAndTime");
       ADT_DateAndTime = $adt("DateAndTime");
       NT_QualifiedName = $sort("QualifiedName");
       ADT_QualifiedName = $adt("QualifiedName");
       NT_MidPathChars = $lex("MidPathChars");
       ADT_MidPathChars = $adt("MidPathChars");
       NT_UserType = $sort("UserType");
       ADT_UserType = $adt("UserType");
       NT_Sym = $sort("Sym");
       ADT_Sym = $adt("Sym");
       NT_Formals = $sort("Formals");
       ADT_Formals = $adt("Formals");
       NT_Parameters = $sort("Parameters");
       ADT_Parameters = $adt("Parameters");
       ADT_RascalKeywords = $keywords("RascalKeywords");
       NT_MidProtocolChars = $lex("MidProtocolChars");
       ADT_MidProtocolChars = $adt("MidProtocolChars");
       NT_ProtocolPart = $sort("ProtocolPart");
       ADT_ProtocolPart = $adt("ProtocolPart");
       NT_OctalIntegerLiteral = $lex("OctalIntegerLiteral");
       ADT_OctalIntegerLiteral = $adt("OctalIntegerLiteral");
       ADT_HorizontalSpace = $layouts("HorizontalSpace");
       NT_StringTemplate = $sort("StringTemplate");
       ADT_StringTemplate = $adt("StringTemplate");
       NT_Label = $sort("Label");
       ADT_Label = $adt("Label");
       NT_DecimalIntegerLiteral = $lex("DecimalIntegerLiteral");
       ADT_DecimalIntegerLiteral = $adt("DecimalIntegerLiteral");
       NT_Prod = $sort("Prod");
       ADT_Prod = $adt("Prod");
       ADT_FileSystemChange = $adt("FileSystemChange");
       NT_Kind = $sort("Kind");
       ADT_Kind = $adt("Kind");
       NT_PreProtocolChars = $lex("PreProtocolChars");
       ADT_PreProtocolChars = $adt("PreProtocolChars");
       NT_NamedRegExp = $lex("NamedRegExp");
       ADT_NamedRegExp = $adt("NamedRegExp");
       NT_NamedBackslash = $lex("NamedBackslash");
       ADT_NamedBackslash = $adt("NamedBackslash");
       NT_Assoc = $sort("Assoc");
       ADT_Assoc = $adt("Assoc");
       NT_DateTimeLiteral = $sort("DateTimeLiteral");
       ADT_DateTimeLiteral = $adt("DateTimeLiteral");
       NT_PathTail = $sort("PathTail");
       ADT_PathTail = $adt("PathTail");
       ADT_RuntimeException = $adt("RuntimeException");
       NT_PostPathChars = $lex("PostPathChars");
       ADT_PostPathChars = $adt("PostPathChars");
       NT_EvalCommand = $sort("EvalCommand");
       ADT_EvalCommand = $adt("EvalCommand");
       NT_PathChars = $lex("PathChars");
       ADT_PathChars = $adt("PathChars");
       NT_JustTime = $lex("JustTime");
       ADT_JustTime = $adt("JustTime");
       NT_ProdModifier = $sort("ProdModifier");
       ADT_ProdModifier = $adt("ProdModifier");
       NT_Literal = $sort("Literal");
       ADT_Literal = $adt("Literal");
       NT_StringCharacter = $lex("StringCharacter");
       ADT_StringCharacter = $adt("StringCharacter");
       NT_Toplevel = $sort("Toplevel");
       ADT_Toplevel = $adt("Toplevel");
       NT_FunctionModifier = $sort("FunctionModifier");
       ADT_FunctionModifier = $adt("FunctionModifier");
       NT_Statement = $sort("Statement");
       ADT_Statement = $adt("Statement");
       NT_Commands = $sort("Commands");
       ADT_Commands = $adt("Commands");
       NT_Comment = $lex("Comment");
       ADT_Comment = $adt("Comment");
       NT_ProtocolTail = $sort("ProtocolTail");
       ADT_ProtocolTail = $adt("ProtocolTail");
       NT_StructuredType = $sort("StructuredType");
       ADT_StructuredType = $adt("StructuredType");
       NT_Command = $sort("Command");
       ADT_Command = $adt("Command");
       NT_Assignable = $sort("Assignable");
       ADT_Assignable = $adt("Assignable");
       NT_ConcretePart = $lex("ConcretePart");
       ADT_ConcretePart = $adt("ConcretePart");
       NT_BasicType = $sort("BasicType");
       ADT_BasicType = $adt("BasicType");
       NT_Visit = $sort("Visit");
       ADT_Visit = $adt("Visit");
       NT_UnicodeEscape = $lex("UnicodeEscape");
       ADT_UnicodeEscape = $adt("UnicodeEscape");
       NT_CommonKeywordParameters = $sort("CommonKeywordParameters");
       ADT_CommonKeywordParameters = $adt("CommonKeywordParameters");
       $T7 = $TF.integerType();
       $T29 = $TF.integerType();
       $T14 = $TF.stringType();
       $T1 = $TF.valueType();
       $T25 = $TF.parameterType("A", $T1);
       $T28 = $TF.stringType();
       $T12 = $TF.sourceLocationType();
       $T15 = $TF.integerType();
       $T24 = $TF.voidType();
       $T21 = $TF.parameterType("T", $T1);
       $T3 = $TF.parameterType("T", $T1);
       $T20 = $TF.parameterType("T", $T1);
       $T4 = $TF.stringType();
       $T10 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")));
       NT_Mapping_Expression = $parameterizedSort("Mapping", new Type[] { ADT_Expression }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Expression"))));
       $T22 = $TF.parameterType("T", ADT_Tree);
       NT_KeywordArguments_1 = $parameterizedSort("KeywordArguments", new Type[] { $T22 }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Parameter, $RVF.string("T"), $RVF.constructor(RascalValueFactory.Symbol_Adt, $RVF.string("Tree"), $RVF.list()))));
       $T16 = $TF.tupleType($T14, $T15);
       $T17 = $TF.mapType(ADT_Item, "item", $T16, "new");
       $T13 = $TF.mapType(ADT_Symbol,$T17);
       ADT_Maybe_Production = $parameterizedAdt("Maybe", new Type[] { ADT_Production });
       NT_Mapping_Pattern = $parameterizedSort("Mapping", new Type[] { ADT_Pattern }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Pattern"))));
       $T23 = $TF.parameterType("T", ADT_Tree);
       ADT_TreeSearchResult_Tree = $parameterizedAdt("TreeSearchResult", new Type[] { ADT_Tree });
       NT_KeywordArguments_Expression = $parameterizedSort("KeywordArguments", new Type[] { ADT_Expression }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Expression"))));
       $T11 = $TF.listType(ADT_CharRange);
       NT_KeywordArgument_1 = $parameterizedSort("KeywordArgument", new Type[] { $T22 }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Parameter, $RVF.string("T"), $RVF.constructor(RascalValueFactory.Symbol_Adt, $RVF.string("Tree"), $RVF.list()))));
       $T30 = $TF.functionType($T24, $TF.tupleType($T28, "m", $T29, "w"), $TF.tupleEmpty());
       $T19 = $TF.boolType();
       $T18 = $TF.functionType($T19, $TF.tupleType($T20, "a", $T21, "b"), $TF.tupleEmpty());
       ADT_Maybe_1 = $parameterizedAdt("Maybe", new Type[] { $T25 });
       $T2 = $TF.listType($T3);
       NT_Mapping_1 = $parameterizedSort("Mapping", new Type[] { $T22 }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Parameter, $RVF.string("T"), $RVF.constructor(RascalValueFactory.Symbol_Adt, $RVF.string("Tree"), $RVF.list()))));
       ADT_TreeSearchResult_1 = $parameterizedAdt("TreeSearchResult", new Type[] { $T22 });
       ADT_Maybe_Symbol = $parameterizedAdt("Maybe", new Type[] { ADT_Symbol });
       $T33 = $TF.listType(ADT_Symbol);
       ADT_Maybe_Attr = $parameterizedAdt("Maybe", new Type[] { ADT_Attr });
       NT_KeywordArguments_Pattern = $parameterizedSort("KeywordArguments", new Type[] { ADT_Pattern }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Pattern"))));
       ADT_TreeSearchResult_void = $parameterizedAdt("TreeSearchResult", new Type[] { $T24 });
       $T32 = $TF.listType($T24);
       $T27 = $TF.functionType($T4, $TF.tupleType($T30, "worked"), $TF.tupleEmpty());
       $T0 = $TF.setType(ADT_Symbol);
       $T34 = $TF.listType(ADT_Symbol);
       $T31 = $TF.setType(ADT_Attr);
       $T6 = $TF.listType(ADT_Symbol);
       $T9 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Expression")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       ADT_Maybe_Associativity = $parameterizedAdt("Maybe", new Type[] { ADT_Associativity });
       ADT_Maybe_void = $parameterizedAdt("Maybe", new Type[] { $T24 });
       $T5 = $TF.setType($T3);
       $T35 = $TF.nodeType();
       $T8 = $TF.setType(ADT_Condition);
       $T36 = $TF.nodeType();
       $T26 = $TF.functionType($T19, $TF.tupleType(ADT_Item, "l", ADT_Item, "r"), $TF.tupleEmpty());
       ADT_Mapping_Expression = $TF.abstractDataType($TS, "Mapping", new Type[] { ADT_Expression });
       ADT_KeywordArguments_1 = $TF.abstractDataType($TS, "KeywordArguments", new Type[] { $T22 });
       ADT_Mapping_Pattern = $TF.abstractDataType($TS, "Mapping", new Type[] { ADT_Pattern });
       ADT_KeywordArguments_Expression = $TF.abstractDataType($TS, "KeywordArguments", new Type[] { ADT_Expression });
       ADT_KeywordArgument_1 = $TF.abstractDataType($TS, "KeywordArgument", new Type[] { $T22 });
       ADT_Mapping_1 = $TF.abstractDataType($TS, "Mapping", new Type[] { $T22 });
       ADT_KeywordArguments_Pattern = $TF.abstractDataType($TS, "KeywordArguments", new Type[] { ADT_Pattern });
       Maybe_Production_just_Production = $TF.constructor($TS, ADT_Maybe_Production, "just", M_ParseTree.ADT_Production, "val");
       TreeSearchResult_Tree_treeFound_Tree = $TF.constructor($TS, ADT_TreeSearchResult_Tree, "treeFound", M_ParseTree.ADT_Tree, "tree");
       Maybe_Attr_just_Attr = $TF.constructor($TS, ADT_Maybe_Attr, "just", M_ParseTree.ADT_Attr, "val");
       Symbol_topRegular_Symbol = $TF.constructor($TS, ADT_Symbol, "topRegular", M_ParseTree.ADT_Symbol, "symbol");
       Maybe_Associativity_just_Associativity = $TF.constructor($TS, ADT_Maybe_Associativity, "just", M_lang_rascal_grammar_definition_Priorities.ADT_Associativity, "val");
       Maybe_Symbol_just_Symbol = $TF.constructor($TS, ADT_Maybe_Symbol, "just", M_ParseTree.ADT_Symbol, "val");
    
       javaStringEscapes = ((IMap)$constants.get(46)/*("\"":"\\\"","\t":"\\t","\n":"\\n","\r":"\\r","\\u":"\\\\u","\\":"\\\\")*/);
       javaIdEscapes = ((IMap)$constants.get(47)/*("\"":"\\\"","\t":"\\t","\n":"\\n","\\u":"\\\\u","\\":"\\\\","_":"__","\r":"\\r","-":"_")*/);
    
       $kwpDefaults_getParserMethodName$30580ef1fd2d4051 = Util.kwpMap("withLayout", ((IBool)$constants.get(0)/*false*/));
       $kwpDefaults_getParserMethodName$2861a6c6bdb6144b = Util.kwpMap("withLayout", ((IBool)$constants.get(0)/*false*/));
       $kwpDefaults_getParserMethodName$467843b3f6963329 = Util.kwpMap("withLayout", ((IBool)$constants.get(0)/*false*/));
       $kwpDefaults_getParserMethodName$47f3bfe2c162a6cd = Util.kwpMap("withLayout", ((IBool)$constants.get(0)/*false*/));
       $kwpDefaults_getParserMethodName$0fb89dbc6e34d6cd = Util.kwpMap("withLayout", ((IBool)$constants.get(0)/*false*/));
       $kwpDefaults_getParserMethodName$789f22186d8d56bd = Util.kwpMap("withLayout", ((IBool)$constants.get(0)/*false*/));
       $kwpDefaults_getParserMethodName$a2bf7fb8d7669112 = Util.kwpMap("withLayout", ((IBool)$constants.get(0)/*false*/));
       $kwpDefaults_getParserMethodName$fb279daa4fd4e85e = Util.kwpMap("withLayout", ((IBool)$constants.get(0)/*false*/));
       $kwpDefaults_getParserMethodName$a623994b20b6948f = Util.kwpMap("withLayout", ((IBool)$constants.get(0)/*false*/));
       $kwpDefaults_getParserMethodName$cb53654510730bc0 = Util.kwpMap("withLayout", ((IBool)$constants.get(0)/*false*/));
    
    }
    public IString generateClassConditional(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IString)generateClassConditional$1e75b8a58a3508ef((ISet) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IBool sameType(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IBool) M_ParseTree.sameType($P0, $P1);
    }
    public IString uu(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T1)){
         $result = (IString)uu$e34dca19232e21a6((IValue) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue head(IValue $P0){ // Generated by Resolver
       return (IValue) M_List.head($P0);
    }
    public IList head(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.head($P0, $P1);
    }
    public IConstructor choice(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IConstructor) M_Type.choice($P0, $P1);
    }
    public ISet extract(IValue $P0){ // Generated by Resolver
       return (ISet) M_lang_rascal_grammar_definition_Priorities.extract($P0);
    }
    public ISet extract(IValue $P0, IValue $P1){ // Generated by Resolver
       return (ISet) M_lang_rascal_grammar_definition_Priorities.extract($P0, $P1);
    }
    public IString getParserMethodName(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       switch(Fingerprint.getFingerprint($P0)){
       	
       case 1643638592:
       		if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol)){
       		  $result = (IString)getParserMethodName$a2bf7fb8d7669112((IConstructor) $P0, $kwpActuals);
       		  if($result != null) return $result;
       		}
       		break;	
       case -109773488:
       		if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol)){
       		  $result = (IString)getParserMethodName$789f22186d8d56bd((IConstructor) $P0, $kwpActuals);
       		  if($result != null) return $result;
       		}
       		break;	
       case 878060304:
       		if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol)){
       		  $result = (IString)getParserMethodName$2861a6c6bdb6144b((IConstructor) $P0, $kwpActuals);
       		  if($result != null) return $result;
       		}
       		break;	
       case 856312:
       		if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol)){
       		  $result = (IString)getParserMethodName$0fb89dbc6e34d6cd((IConstructor) $P0, $kwpActuals);
       		  if($result != null) return $result;
       		}
       		break;	
       case 28290288:
       		if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol)){
       		  $result = (IString)getParserMethodName$47f3bfe2c162a6cd((IConstructor) $P0, $kwpActuals);
       		  if($result != null) return $result;
       		}
       		break;	
       case -333228984:
       		if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol)){
       		  $result = (IString)getParserMethodName$467843b3f6963329((IConstructor) $P0, $kwpActuals);
       		  if($result != null) return $result;
       		}
       		break;	
       case -2144737184:
       		if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol)){
       		  $result = (IString)getParserMethodName$fb279daa4fd4e85e((IConstructor) $P0, $kwpActuals);
       		  if($result != null) return $result;
       		}
       		break;
       }
       if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol)){
         $result = (IString)getParserMethodName$a623994b20b6948f((IConstructor) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       if($isNonTerminal($P0Type, M_lang_rascal_syntax_Rascal.NT_Sym)){
         $result = (IString)getParserMethodName$30580ef1fd2d4051((ITree) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol)){
         $result = (IString)getParserMethodName$cb53654510730bc0((IConstructor) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IInteger size(IValue $P0){ // Generated by Resolver
       IInteger $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T2)){
         $result = (IInteger)M_List.size$811ff6e419f455d9((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T4)){
         $result = (IInteger)M_String.size$1d28105b03d03294((IString) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T5)){
         $result = (IInteger)M_Set.size$38d40110541faa91((ISet) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue max(IValue $P0){ // Generated by Resolver
       return (IValue) M_List.max($P0);
    }
    public IConstructor priority(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IConstructor) M_ParseTree.priority($P0, $P1);
    }
    public IString generateSequenceExpects(IValue $P0, IValue $P1){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type, M_Grammar.ADT_Grammar) && $isSubtypeOf($P1Type,$T6)){
         $result = (IString)generateSequenceExpects$5cf90c98a6d50ab4((IConstructor) $P0, (IList) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IConstructor expandKeywords(IValue $P0){ // Generated by Resolver
       return (IConstructor) M_lang_rascal_grammar_definition_Keywords.expandKeywords($P0);
    }
    public ISet expandKeywords(IValue $P0, IValue $P1){ // Generated by Resolver
       return (ISet) M_lang_rascal_grammar_definition_Keywords.expandKeywords($P0, $P1);
    }
    public IInteger getItemId(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       IInteger $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol) && $isSubtypeOf($P1Type,$T7) && $isSubtypeOf($P2Type, M_ParseTree.ADT_Production)){
         $result = (IInteger)getItemId$8da6826786be742d((IConstructor) $P0, (IInteger) $P1, (IConstructor) $P2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IString generateAltExpects(IValue $P0, IValue $P1){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type, M_Grammar.ADT_Grammar) && $isSubtypeOf($P1Type,$T6)){
         $result = (IString)generateAltExpects$e6227e38151afc89((IConstructor) $P0, (IList) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public INode conditional(IValue $P0, IValue $P1){ // Generated by Resolver
       INode $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol) && $isSubtypeOf($P1Type,$T8)){
         $result = (INode)M_lang_rascal_grammar_definition_Symbols.conditional$f76d16966a8bef69((IConstructor) $P0, (ISet) $P1);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol) && $isSubtypeOf($P1Type,$T8)){
         $result = (INode)M_lang_rascal_grammar_definition_Symbols.conditional$a6b35eeaa096c9bf((IConstructor) $P0, (ISet) $P1);
         if($result != null) return $result;
         return $RVF.constructor(M_ParseTree.Symbol_conditional_Symbol_set_Condition, new IValue[]{(IConstructor) $P0, (ISet) $P1});
       }
       if($isNonTerminal($P0Type, M_lang_rascal_syntax_Rascal.NT_Expression) && $isSubtypeOf($P1Type,$T9)){
         return $RVF.constructor(M_lang_rascal_syntax_Rascal.Replacement_conditional_Expression_iter_seps_Expression, new IValue[]{(ITree) $P0, (ITree) $P1});
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IString generateCharClassArrays(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T11)){
         $result = (IString)generateCharClassArrays$d069c937b5f855f9((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue unsetRec(IValue $P0){ // Generated by Resolver
       return (IValue) M_Node.unsetRec($P0);
    }
    public INode unsetRec(IValue $P0, IValue $P1){ // Generated by Resolver
       return (INode) M_Node.unsetRec($P0, $P1);
    }
    public ITuple sym2newitem(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       ITuple $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type, M_Grammar.ADT_Grammar) && $isSubtypeOf($P1Type, M_ParseTree.ADT_Symbol) && $isSubtypeOf($P2Type,$T7)){
         $result = (ITuple)sym2newitem$321bea90aeae7a8d((IConstructor) $P0, (IConstructor) $P1, (IInteger) $P2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IBool isList(IValue $P0){ // Generated by Resolver
       return (IBool) M_lang_rascal_grammar_definition_Regular.isList($P0);
    }
    public IConstructor generateNewItems_cl(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_ParseTree.ADT_Production)){
         $result = (IConstructor)cl$96bd60344ec07bdd((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IConstructor alt(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IConstructor)M_lang_rascal_grammar_definition_Symbols.alt$aa65059e487d6ff2((ISet) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T0)){
         return $RVF.constructor(M_ParseTree.Symbol_alt_set_Symbol, new IValue[]{(ISet) $P0});
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString generateSeparatorExpects(IValue $P0, IValue $P1){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type, M_Grammar.ADT_Grammar) && $isSubtypeOf($P1Type,$T6)){
         $result = (IString)generateSeparatorExpects$348a8e745e2a6f1d((IConstructor) $P0, (IList) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IBool equivalent(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IBool) M_Type.equivalent($P0, $P1);
    }
    public IString toBase64(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T4)){
         $result = (IString)M_String.toBase64$6fec5c5ff2fc5293((IString) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T12)){
         $result = (IString)M_IO.toBase64$6ed1894002370d80((ISourceLocation) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IConstructor makeUnique_rewrite(IValue $P0, ValueRef<IInteger> uniqueItem_1){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_ParseTree.ADT_Production)){
         $result = (IConstructor)rewrite$00efbe0fdd947222((IConstructor) $P0, uniqueItem_1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IConstructor newGenerate__rewrite(IValue $P0, ValueRef<IInteger> uniqueItem_1){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_ParseTree.ADT_Production)){
         $result = (IConstructor)rewrite$27013ecdbac8852f((IConstructor) $P0, uniqueItem_1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString ciliterals2ints(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T6)){
         $result = (IString)ciliterals2ints$cd6f75d2160c05dd((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString v2i(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T1)){
         $result = (IString)v2i$f9cb5e177efa6f97((IValue) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IConstructor toCompanionList(IValue $P0){ // Generated by Resolver
       return (IConstructor) M_lang_rascal_grammar_definition_Regular.toCompanionList($P0);
    }
    public IString escId(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T4)){
         $result = (IString)escId$0579c21bf1a62ae0((IString) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IConstructor getType(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       switch(Fingerprint.getFingerprint($P0)){
       	
       case 1643638592:
       		if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol)){
       		  $result = (IConstructor)getType$b23fa460f79f689c((IConstructor) $P0);
       		  if($result != null) return $result;
       		}
       		break;	
       case -2144737184:
       		if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol)){
       		  $result = (IConstructor)getType$3a91be5bec1e7554((IConstructor) $P0);
       		  if($result != null) return $result;
       		}
       		break;
       }
       if($isSubtypeOf($P0Type, M_ParseTree.ADT_Production)){
         $result = (IConstructor)getType$7098a7e37e3432cc((IConstructor) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol)){
         $result = (IConstructor)getType$d2c0972de07d8835((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList tail(IValue $P0){ // Generated by Resolver
       return (IList) M_List.tail($P0);
    }
    public IList tail(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.tail($P0, $P1);
    }
    public ITuple headTail(IValue $P0){ // Generated by Resolver
       return (ITuple) M_List.headTail($P0);
    }
    public IString substring(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       return (IString) M_String.substring($P0, $P1, $P2);
    }
    public IString substring(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IString) M_String.substring($P0, $P1);
    }
    public IConstructor treeAt(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       return (IConstructor) M_ParseTree.treeAt($P0, $P1, $P2);
    }
    public IValue index(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T5)){
         $result = (IValue)M_Set.index$8a5f4e126881ec51((ISet) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T2)){
         $result = (IValue)M_List.index$f006059c1d37534f((IList) $P0);
         if($result != null) return $result;
       }
       if($isNonTerminal($P0Type, M_lang_rascal_syntax_Rascal.NT_IntegerLiteral)){
         return $RVF.constructor(M_lang_rascal_syntax_Rascal.Field_index_IntegerLiteral, new IValue[]{(ITree) $P0});
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString literals2ints(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T6)){
         $result = (IString)literals2ints$28647a5174382a6f((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IBool isRegular(IValue $P0){ // Generated by Resolver
       return (IBool) M_lang_rascal_grammar_definition_Regular.isRegular($P0);
    }
    public IInteger makeUnique_newItem(ValueRef<IInteger> uniqueItem_1){ // Generated by Resolver
       IInteger $result = null;
       $result = (IInteger)newItem$883db0ce535f2e2a(uniqueItem_1);
       if($result != null) return $result;
       throw RuntimeExceptionFactory.callFailed($RVF.list());
    }
    public IInteger newGenerate__newItem(ValueRef<IInteger> uniqueItem_1){ // Generated by Resolver
       IInteger $result = null;
       $result = (IInteger)newItem$24df242ff4526f29(uniqueItem_1);
       if($result != null) return $result;
       throw RuntimeExceptionFactory.callFailed($RVF.list());
    }
    public ISet computeDontNests(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T13) && $isSubtypeOf($P1Type, M_Grammar.ADT_Grammar) && $isSubtypeOf($P2Type, M_Grammar.ADT_Grammar)){
         $result = (ISet)computeDontNests$aa5378becc7a1991((IMap) $P0, (IConstructor) $P1, (IConstructor) $P2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IBool intersects(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IBool) M_Type.intersects($P0, $P1);
    }
    public IMap generateNewItems(IValue $P0){ // Generated by Resolver
       IMap $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_Grammar.ADT_Grammar)){
         $result = (IMap)generateNewItems$807ae7532df54f11((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString esc(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol)){
         $result = (IString)esc$ff62cb0f1d0b4eca((IConstructor) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T4)){
         $result = (IString)esc$c38f01ee7e9a3d64((IString) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString newGenerate(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T4) && $isSubtypeOf($P1Type,$T4) && $isSubtypeOf($P2Type, M_Grammar.ADT_Grammar)){
         $result = (IString)newGenerate$d180df80b178b419((IString) $P0, (IString) $P1, (IConstructor) $P2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IString sym2name(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol)){
         $result = (IString)sym2name$998ae8a0fd447728((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue makeRegularStubs(IValue $P0){ // Generated by Resolver
       return (IValue) M_lang_rascal_grammar_definition_Regular.makeRegularStubs($P0);
    }
    public IConstructor striprec(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol)){
         $result = (IConstructor)M_lang_rascal_grammar_definition_Priorities.striprec$65016c35e152c386((IConstructor) $P0);
         if($result != null) return $result;
         $result = (IConstructor)M_lang_rascal_grammar_definition_Symbols.striprec$940249987df9573b((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IConstructor strip(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       switch(Fingerprint.getFingerprint($P0)){
       	
       case 1643638592:
       		if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol)){
       		  $result = (IConstructor)M_lang_rascal_grammar_definition_Priorities.strip$7ed4e2ded4dfeea9((IConstructor) $P0);
       		  if($result != null) return $result;
       		  $result = (IConstructor)M_lang_rascal_grammar_definition_Symbols.strip$c3c2ce8c421ad271((IConstructor) $P0);
       		  if($result != null) return $result;
       		}
       		break;	
       case -2144737184:
       		if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol)){
       		  $result = (IConstructor)M_lang_rascal_grammar_definition_Priorities.strip$da2dbb10ad3e1058((IConstructor) $P0);
       		  if($result != null) return $result;
       		  $result = (IConstructor)M_lang_rascal_grammar_definition_Symbols.strip$7e488443a1dcf4b5((IConstructor) $P0);
       		  if($result != null) return $result;
       		}
       		break;
       }
       if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol)){
         $result = (IConstructor)M_lang_rascal_grammar_definition_Priorities.strip$123f0b34c6070c0a((IConstructor) $P0);
         if($result != null) return $result;
         $result = (IConstructor)M_lang_rascal_grammar_definition_Symbols.strip$f35045192114982b((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IBool isNonTerminalType(IValue $P0){ // Generated by Resolver
       return (IBool) M_ParseTree.isNonTerminalType($P0);
    }
    public IValue lub(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IValue) M_Type.lub($P0, $P1);
    }
    public ISet except(IValue $P0, IValue $P1){ // Generated by Resolver
       return (ISet) M_lang_rascal_grammar_definition_Priorities.except($P0, $P1);
    }
    public IBool comparable(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IBool) M_Type.comparable($P0, $P1);
    }
    public IBool subtype(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IBool) M_Type.subtype($P0, $P1);
    }
    public IConstructor associativity(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       return (IConstructor) M_ParseTree.associativity($P0, $P1, $P2);
    }
    public IValue split(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T4)){
         $result = (IValue)split$ece1419fbe2db44f((IString) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T2)){
         $result = (IValue)M_List.split$9e25259188753c78((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList split(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_String.split($P0, $P1);
    }
    public IString value2id(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T1)){
         $result = (IString)value2id$8728571069fac63e((IValue) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue glb(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IValue) M_Type.glb($P0, $P1);
    }
    public IValue job(IValue $P0, IValue $P1, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       return (IValue) M_util_Monitor.job($P0, $P1, $kwpActuals);
    }
    public IString generateRangeConditional(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_ParseTree.ADT_CharRange)){
         $result = (IString)generateRangeConditional$a8c4f8bb4018d1e7((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue sort(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T5)){
         $result = (IValue)M_Set.sort$e119981445d9028f((ISet) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T2)){
         $result = (IValue)M_List.sort$fa0b19c35a18e804((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T4)){
         return $RVF.constructor(M_ParseTree.Symbol_sort_str, new IValue[]{(IString) $P0});
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList sort(IValue $P0, IValue $P1){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T5) && $isSubtypeOf($P1Type,$T18)){
         $result = (IList)M_Set.sort$67af6e8bdc41a4d8((ISet) $P0, (TypedFunctionInstance2<IValue, IValue, IValue>) $P1);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T2) && $isSubtypeOf($P1Type,$T18)){
         $result = (IList)M_List.sort$3510e1cc7fe6c8ba((IList) $P0, (TypedFunctionInstance2<IValue, IValue, IValue>) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IConstructor seq(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T6)){
         $result = (IConstructor)M_lang_rascal_grammar_definition_Symbols.seq$0a415a2b58bb9727((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T6)){
         return $RVF.constructor(M_ParseTree.Symbol_seq_list_Symbol, new IValue[]{(IList) $P0});
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IConstructor makeUnique(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_Grammar.ADT_Grammar)){
         $result = (IConstructor)makeUnique$edb0a92bc293a61d((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IBool isNonterminal(IValue $P0){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol)){
         $result = (IBool)isNonterminal$1aa1d0660f35932e((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString generateParseMethod(IValue $P0, IValue $P1, IValue $P2, IValue $P3){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       Type $P3Type = $P3.getType();
       if($isSubtypeOf($P0Type, M_Grammar.ADT_Grammar) && $isSubtypeOf($P1Type,$T13) && $isSubtypeOf($P2Type, M_ParseTree.ADT_Production) && $isSubtypeOf($P3Type,$T7)){
         $result = (IString)generateParseMethod$8d37d926b7bd824c((IConstructor) $P0, (IMap) $P1, (IConstructor) $P2, (IInteger) $P3);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2, $P3));
    }

    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(1444,142,<39,0>,<40,66>) 
    public IString getParserMethodName$30580ef1fd2d4051(ITree sym_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_getParserMethodName$30580ef1fd2d4051;
    
        return ((IString)(getParserMethodName(((IConstructor)(M_lang_rascal_grammar_definition_Symbols.sym2symbol(((ITree)sym_0), Util.kwpMap("withLayout", ((IBool) ($kwpActuals.containsKey("withLayout") ? $kwpActuals.get("withLayout") : $kwpDefaults.get("withLayout"))))))), Util.kwpMap())));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(1590,103,<42,0>,<43,22>) 
    public IString getParserMethodName$2861a6c6bdb6144b(IConstructor $0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_getParserMethodName$2861a6c6bdb6144b;
    
        if($has_type_and_arity($0, M_ParseTree.Symbol_start_Symbol, 1)){
           IValue $arg0_1 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_1.getType(), M_ParseTree.ADT_Symbol)){
              if($has_type_and_arity($arg0_1, M_ParseTree.Symbol_sort_str, 1)){
                 IValue $arg0_2 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_1)),0));
                 if($isComparable($arg0_2.getType(), $T4)){
                    IString name_0 = null;
                    final Template $template0 = (Template)new Template($RVF, "$start_");
                    $template0.beginIndent("       ");
                    $template0.addStr(((IString)($arg0_2)).getValue());
                    $template0.endIndent("       ");
                    return ((IString)($template0.close()));
                 
                 } else {
                    return null;
                 }
              } else {
                 return null;
              }
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(1697,94,<45,0>,<46,18>) 
    public IString getParserMethodName$467843b3f6963329(IConstructor $0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_getParserMethodName$467843b3f6963329;
    
        if($has_type_and_arity($0, M_ParseTree.Symbol_layouts_str, 1)){
           IValue $arg0_4 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_4.getType(), $T4)){
              IString name_0 = null;
              final Template $template3 = (Template)new Template($RVF, "$l_");
              $template3.beginIndent("   ");
              $template3.addStr(((IString)($arg0_4)).getValue());
              $template3.endIndent("   ");
              return ((IString)($template3.close()));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(1795,88,<48,0>,<49,15>) 
    public IString getParserMethodName$47f3bfe2c162a6cd(IConstructor $0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_getParserMethodName$47f3bfe2c162a6cd;
    
        if($has_type_and_arity($0, M_ParseTree.Symbol_sort_str, 1)){
           IValue $arg0_6 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_6.getType(), $T4)){
              IString name_0 = null;
              final Template $template5 = (Template)new Template($RVF, "");
              $template5.addStr(((IString)($arg0_6)).getValue());
              return ((IString)($template5.close()));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(1887,87,<51,0>,<52,15>) 
    public IString getParserMethodName$0fb89dbc6e34d6cd(IConstructor $0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_getParserMethodName$0fb89dbc6e34d6cd;
    
        if($has_type_and_arity($0, M_ParseTree.Symbol_lex_str, 1)){
           IValue $arg0_8 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_8.getType(), $T4)){
              IString name_0 = null;
              final Template $template7 = (Template)new Template($RVF, "");
              $template7.addStr(((IString)($arg0_8)).getValue());
              return ((IString)($template7.close()));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(2043,95,<54,0>,<55,18>) 
    public IString getParserMethodName$789f22186d8d56bd(IConstructor $0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_getParserMethodName$789f22186d8d56bd;
    
        if($has_type_and_arity($0, M_ParseTree.Symbol_keywords_str, 1)){
           IValue $arg0_10 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_10.getType(), $T4)){
              IString name_0 = null;
              final Template $template9 = (Template)new Template($RVF, "$k_");
              $template9.beginIndent("   ");
              $template9.addStr(((IString)($arg0_10)).getValue());
              $template9.endIndent("   ");
              return ((IString)($template9.close()));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(2142,128,<57,0>,<58,52>) 
    public IString getParserMethodName$a2bf7fb8d7669112(IConstructor $0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_getParserMethodName$a2bf7fb8d7669112;
    
        if($has_type_and_arity($0, M_Type.Symbol_label_str_Symbol, 2)){
           IValue $arg0_12 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_12.getType(), $T1)){
              IValue $arg1_11 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
              if($isComparable($arg1_11.getType(), M_ParseTree.ADT_Symbol)){
                 IConstructor s_0 = null;
                 return ((IString)(getParserMethodName(((IConstructor)($arg1_11)), Util.kwpMap("withLayout", ((IBool) ($kwpActuals.containsKey("withLayout") ? $kwpActuals.get("withLayout") : $kwpDefaults.get("withLayout")))))));
              
              } else {
                 return null;
              }
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(2274,128,<60,0>,<61,52>) 
    public IString getParserMethodName$fb279daa4fd4e85e(IConstructor $0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_getParserMethodName$fb279daa4fd4e85e;
    
        if($has_type_and_arity($0, M_ParseTree.Symbol_conditional_Symbol_set_Condition, 2)){
           IValue $arg0_14 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_14.getType(), M_ParseTree.ADT_Symbol)){
              IConstructor s_0 = null;
              IValue $arg1_13 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
              if($isComparable($arg1_13.getType(), $T1)){
                 return ((IString)(getParserMethodName(((IConstructor)($arg0_14)), Util.kwpMap("withLayout", ((IBool) ($kwpActuals.containsKey("withLayout") ? $kwpActuals.get("withLayout") : $kwpDefaults.get("withLayout")))))));
              
              } else {
                 return null;
              }
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(2495,225,<64,0>,<65,157>) 
    public IString getParserMethodName$a623994b20b6948f(IConstructor s_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_getParserMethodName$a623994b20b6948f;
    
        if($is(((IConstructor)s_0),((IString)$constants.get(1)/*"iter"*/))){
           final Template $template15 = (Template)new Template($RVF, "regular_");
           $template15.beginIndent("        ");
           $template15.addStr(((IString)($me.value2id(((IValue)s_0)))).getValue());
           $template15.endIndent("        ");
           return ((IString)($template15.close()));
        
        } else {
           if($is(((IConstructor)s_0),((IString)$constants.get(2)/*"iter-seps"*/))){
              final Template $template15 = (Template)new Template($RVF, "regular_");
              $template15.beginIndent("        ");
              $template15.addStr(((IString)($me.value2id(((IValue)s_0)))).getValue());
              $template15.endIndent("        ");
              return ((IString)($template15.close()));
           
           } else {
              if($is(((IConstructor)s_0),((IString)$constants.get(3)/*"iter-star"*/))){
                 final Template $template15 = (Template)new Template($RVF, "regular_");
                 $template15.beginIndent("        ");
                 $template15.addStr(((IString)($me.value2id(((IValue)s_0)))).getValue());
                 $template15.endIndent("        ");
                 return ((IString)($template15.close()));
              
              } else {
                 if($is(((IConstructor)s_0),((IString)$constants.get(4)/*"iter-star-seps"*/))){
                    final Template $template15 = (Template)new Template($RVF, "regular_");
                    $template15.beginIndent("        ");
                    $template15.addStr(((IString)($me.value2id(((IValue)s_0)))).getValue());
                    $template15.endIndent("        ");
                    return ((IString)($template15.close()));
                 
                 } else {
                    if($is(((IConstructor)s_0),((IString)$constants.get(5)/*"alt"*/))){
                       final Template $template15 = (Template)new Template($RVF, "regular_");
                       $template15.beginIndent("        ");
                       $template15.addStr(((IString)($me.value2id(((IValue)s_0)))).getValue());
                       $template15.endIndent("        ");
                       return ((IString)($template15.close()));
                    
                    } else {
                       if($is(((IConstructor)s_0),((IString)$constants.get(6)/*"opt"*/))){
                          final Template $template15 = (Template)new Template($RVF, "regular_");
                          $template15.beginIndent("        ");
                          $template15.addStr(((IString)($me.value2id(((IValue)s_0)))).getValue());
                          $template15.endIndent("        ");
                          return ((IString)($template15.close()));
                       
                       } else {
                          if($is(((IConstructor)s_0),((IString)$constants.get(7)/*"seq"*/))){
                             final Template $template15 = (Template)new Template($RVF, "regular_");
                             $template15.beginIndent("        ");
                             $template15.addStr(((IString)($me.value2id(((IValue)s_0)))).getValue());
                             $template15.endIndent("        ");
                             return ((IString)($template15.close()));
                          
                          } else {
                             if($is(((IConstructor)s_0),((IString)$constants.get(8)/*"empty"*/))){
                                final Template $template15 = (Template)new Template($RVF, "regular_");
                                $template15.beginIndent("        ");
                                $template15.addStr(((IString)($me.value2id(((IValue)s_0)))).getValue());
                                $template15.endIndent("        ");
                                return ((IString)($template15.close()));
                             
                             } else {
                                return null;
                             }
                          }
                       }
                    }
                 }
              }
           }
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(2724,98,<67,0>,<68,22>) 
    public IString getParserMethodName$cb53654510730bc0(IConstructor s_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_getParserMethodName$cb53654510730bc0;
    
        final Template $template22 = (Template)new Template($RVF, "");
        $template22.addStr(((IString)($me.value2id(((IValue)s_0)))).getValue());
        return ((IString)($template22.close()));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(3119,53,<73,4>,<73,57>) 
    public IInteger newItem$24df242ff4526f29(ValueRef<IInteger> uniqueItem_1){ 
        
        
        uniqueItem_1.setValue(((IInteger)($aint_add_aint(uniqueItem_1.getValue(),((IInteger)$constants.get(9)/*1*/)))));
        return uniqueItem_1.getValue();
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(3787,108,<91,4>,<94,8>) 
    public IConstructor rewrite$27013ecdbac8852f(IConstructor p_0, ValueRef<IInteger> uniqueItem_1){ 
        
        
        try {
            IValue $visitResult = $TRAVERSE.traverse(DIRECTION.BottomUp, PROGRESS.Continuing, FIXEDPOINT.No, REBUILD.Yes, 
                 new DescendantDescriptorAlwaysTrue($RVF.bool(false)),
                 p_0,
                 (IVisitFunction) (IValue $VISIT1_subject, TraversalState $traversalState) -> {
                     VISIT1:switch(Fingerprint.getFingerprint($VISIT1_subject)){
                     
                         case 0:
                             
                     
                         default: 
                             if($isSubtypeOf($VISIT1_subject.getType(),M_ParseTree.ADT_Symbol)){
                                /*muExists*/CASE_0_0: 
                                    do {
                                        IConstructor s_4 = ((IConstructor)($VISIT1_subject));
                                        IConstructor $replacement34 = (IConstructor)(((IConstructor)($aadt_field_update("id", newGenerate__newItem(uniqueItem_1), ((IConstructor)s_4)))));
                                        if($isSubtypeOf($replacement34.getType(),$VISIT1_subject.getType())){
                                           $traversalState.setMatchedAndChanged(true, true);
                                           return $replacement34;
                                        
                                        } else {
                                           break VISIT1;// switch
                                        
                                        }
                                    } while(false);
                             
                             }
            
                     }
                     return $VISIT1_subject;
                 });
            return (IConstructor)$visitResult;
        
        } catch (ReturnFromTraversalException e) {
            return (IConstructor) e.getValue();
        }
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(11750,50,<253,46>,<253,96>) 
    public IBool $CLOSURE_1(IConstructor l_0, IConstructor r_1){ 
        
        
        return ((IBool)($aint_less_aint(((IInteger)(((IInteger)($aadt_get_field(((IConstructor)l_0), "index"))))),((IInteger)(((IInteger)($aadt_get_field(((IConstructor)r_1), "index"))))))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(2998,10223,<71,110>,<281,5>) 
    public IString $CLOSURE_0(TypedFunctionInstance2<IValue, IValue, IValue> worked_0, ValueRef<IConstructor> gr_2, ValueRef<IString> name_1, ValueRef<IString> $package_0){ 
        
        
        final ValueRef<IInteger> uniqueItem_1 = new ValueRef<IInteger>("uniqueItem", ((IInteger)$constants.get(9)/*1*/));
        ((TypedFunctionInstance2<IValue, IValue, IValue>)worked_0).typedCall(((IString)$constants.get(10)/*"expanding parameterized symbols"*/), ((IInteger)$constants.get(9)/*1*/));
        gr_2.setValue(((IConstructor)(M_lang_rascal_grammar_definition_Parameters.expandParameterizedSymbols(gr_2.getValue()))));
        ((TypedFunctionInstance2<IValue, IValue, IValue>)worked_0).typedCall(((IString)$constants.get(11)/*"generating stubs for regular"*/), ((IInteger)$constants.get(9)/*1*/));
        gr_2.setValue(((IConstructor)(M_lang_rascal_grammar_definition_Regular.makeRegularStubs(gr_2.getValue()))));
        ((TypedFunctionInstance2<IValue, IValue, IValue>)worked_0).typedCall(((IString)$constants.get(12)/*"generating syntax for holes"*/), ((IInteger)$constants.get(9)/*1*/));
        gr_2.setValue(((IConstructor)(M_lang_rascal_grammar_ConcreteSyntax.addHoles(gr_2.getValue()))));
        ((TypedFunctionInstance2<IValue, IValue, IValue>)worked_0).typedCall(((IString)$constants.get(13)/*"generating literals"*/), ((IInteger)$constants.get(9)/*1*/));
        gr_2.setValue(((IConstructor)(M_lang_rascal_grammar_definition_Literals.literals(gr_2.getValue()))));
        ((TypedFunctionInstance2<IValue, IValue, IValue>)worked_0).typedCall(((IString)$constants.get(14)/*"establishing production set"*/), ((IInteger)$constants.get(9)/*1*/));
        final ISetWriter $setwriter25 = (ISetWriter)$RVF.setWriter();
        ;
        /*muExists*/$SCOMP26: 
            do {
                $SCOMP26_DESC3669:
                for(IValue $elem33 : new DescendantMatchIterator(gr_2.getValue(), 
                    new DescendantDescriptorAlwaysTrue($RVF.bool(false)))){
                    if($isComparable($elem33.getType(), M_ParseTree.ADT_Production)){
                       if($isSubtypeOf($elem33.getType(),M_ParseTree.ADT_Production)){
                          IConstructor p_3 = null;
                          IBool $aux2 = (IBool)(((IBool)$constants.get(0)/*false*/));
                          $aux2 = ((IBool)$constants.get(0)/*false*/);
                          /*muExists*/$EXP27: 
                              do {
                                  if($has_type_and_arity($elem33, M_ParseTree.Production_prod_Symbol_list_Symbol_set_Attr, 3)){
                                     IValue $arg0_30 = (IValue)($aadt_subscript_int(((IConstructor)($elem33)),0));
                                     if($isComparable($arg0_30.getType(), $T1)){
                                        IValue $arg1_29 = (IValue)($aadt_subscript_int(((IConstructor)($elem33)),1));
                                        if($isComparable($arg1_29.getType(), $T1)){
                                           IValue $arg2_28 = (IValue)($aadt_subscript_int(((IConstructor)($elem33)),2));
                                           if($isComparable($arg2_28.getType(), $T1)){
                                              $aux2 = ((IBool)$constants.get(15)/*true*/);
                                              break $EXP27; // muSucceed
                                           } else {
                                              $aux2 = ((IBool)$constants.get(0)/*false*/);
                                              continue $EXP27;
                                           }
                                        } else {
                                           $aux2 = ((IBool)$constants.get(0)/*false*/);
                                           continue $EXP27;
                                        }
                                     } else {
                                        $aux2 = ((IBool)$constants.get(0)/*false*/);
                                        continue $EXP27;
                                     }
                                  } else {
                                     $aux2 = ((IBool)$constants.get(0)/*false*/);
                                     continue $EXP27;
                                  }
                              } while(false);
                          if((((IBool)($aux2))).getValue()){
                            $setwriter25.insert($elem33);
                          
                          } else {
                            IBool $aux1 = (IBool)(((IBool)$constants.get(0)/*false*/));
                            $aux1 = ((IBool)$constants.get(0)/*false*/);
                            /*muExists*/$EXP31: 
                                do {
                                    if($has_type_and_arity($elem33, M_ParseTree.Production_regular_Symbol, 1)){
                                       IValue $arg0_32 = (IValue)($aadt_subscript_int(((IConstructor)($elem33)),0));
                                       if($isComparable($arg0_32.getType(), $T1)){
                                          $aux1 = ((IBool)$constants.get(15)/*true*/);
                                          break $EXP31; // muSucceed
                                       } else {
                                          $aux1 = ((IBool)$constants.get(0)/*false*/);
                                          continue $EXP31;
                                       }
                                    } else {
                                       $aux1 = ((IBool)$constants.get(0)/*false*/);
                                       continue $EXP31;
                                    }
                                } while(false);
                            if((((IBool)($aux1))).getValue()){
                              $setwriter25.insert($elem33);
                            
                            } else {
                              continue $SCOMP26_DESC3669;
                            }
                          
                          }
                       
                       } else {
                          continue $SCOMP26_DESC3669;
                       }
                    } else {
                       continue $SCOMP26_DESC3669;
                    }
                }
                
                             
            } while(false);
        ISet uniqueProductions_2 = ((ISet)($setwriter25.done()));
        ((TypedFunctionInstance2<IValue, IValue, IValue>)worked_0).typedCall(((IString)$constants.get(16)/*"assigning unique ids to symbols"*/), ((IInteger)$constants.get(9)/*1*/));
        IConstructor beforeUniqueGr_5 = gr_2.getValue();
        final IMapWriter $mapwriter35 = (IMapWriter)$RVF.mapWriter();
        $MCOMP36_GEN3969:
        for(IValue $elem37_for : ((IMap)(((IMap)($aadt_get_field(gr_2.getValue(), "rules")))))){
            IConstructor $elem37 = (IConstructor) $elem37_for;
            IConstructor s_6 = ((IConstructor)($elem37));
            $mapwriter35.insert($RVF.tuple(s_6, newGenerate__rewrite(((IConstructor)($amap_subscript(((IMap)(((IMap)($aadt_get_field(gr_2.getValue(), "rules"))))),((IConstructor)s_6)))), uniqueItem_1)));
        
        }
        
                    gr_2.setValue(((IConstructor)(((IConstructor)($aadt_field_update("rules", $mapwriter35.done(), gr_2.getValue()))))));
        ((TypedFunctionInstance2<IValue, IValue, IValue>)worked_0).typedCall(((IString)$constants.get(17)/*"generating item allocations"*/), ((IInteger)$constants.get(9)/*1*/));
        IMap newItems_7 = ((IMap)($me.generateNewItems(gr_2.getValue())));
        ((TypedFunctionInstance2<IValue, IValue, IValue>)worked_0).typedCall(((IString)$constants.get(18)/*"computing priority and associativity filter"*/), ((IInteger)$constants.get(9)/*1*/));
        ISet dontNest_8 = ((ISet)($me.computeDontNests(((IMap)newItems_7), ((IConstructor)beforeUniqueGr_5), gr_2.getValue())));
        final ISetWriter $setwriter38 = (ISetWriter)$RVF.setWriter();
        ;
        /*muExists*/$SCOMP39: 
            do {
                final ISetWriter $setwriter41 = (ISetWriter)$RVF.setWriter();
                ;
                $SCOMP42_GEN4459:
                for(IValue $elem43_for : ((ISet)($arel_field_project((ISet)((ISet)dontNest_8), ((IInteger)$constants.get(19)/*0*/))))){
                    IInteger $elem43 = (IInteger) $elem43_for;
                    IInteger p_11 = null;
                    $setwriter41.insert($RVF.tuple(((ISet)($arel_subscript1_noset(((ISet)dontNest_8),((IInteger)($elem43))))), ((IInteger)($elem43))));
                
                }
                
                            final ISet $subject_val44 = ((ISet)($setwriter41.done()));
                ISet g_10 = null;
                $SCOMP39_GEN4482:
                for(IValue $elem40_for : ((ISet)($arel_field_project((ISet)((ISet)($subject_val44)), ((IInteger)$constants.get(19)/*0*/))))){
                    ISet $elem40 = (ISet) $elem40_for;
                    ISet c_12 = null;
                    $setwriter38.insert($RVF.tuple(((ISet)($elem40)), ((ISet)($arel2_subscript1_aset(((ISet)($subject_val44)),((ISet)($elem40)))))));
                
                }
                continue $SCOMP39;
                            
            } while(false);
        ISet dontNestGroups_9 = ((ISet)($setwriter38.done()));
        ((TypedFunctionInstance2<IValue, IValue, IValue>)worked_0).typedCall(((IString)$constants.get(20)/*"source code template"*/), ((IInteger)$constants.get(9)/*1*/));
        final Template $template45 = (Template)new Template($RVF, "package ");
        $template45.beginIndent("        ");
        $template45.addStr($package_0.getValue().getValue());
        $template45.endIndent("        ");
        $template45.addStr(";\r\n\r\nimport java.io.IOException;\r\nimport java.io.StringReader;\r\nimport java.io.PrintWriter;\r\nimport java.util.function.Supplier;\r\n\r\nimport io.usethesource.vallang.type.TypeFactory;\r\nimport io.usethesource.vallang.IConstructor;\r\nimport io.usethesource.vallang.ISourceLocation;\r\nimport io.usethesource.vallang.IValue;\r\nimport io.usethesource.vallang.IValueFactory;\r\nimport io.usethesource.vallang.exceptions.FactTypeUseException;\r\nimport io.usethesource.vallang.io.StandardTextReader;\r\nimport io.usethesource.vallang.io.StandardTextWriter;\r\nimport org.rascalmpl.parser.gtd.stack.*;\r\nimport org.rascalmpl.parser.gtd.stack.filter.*;\r\nimport org.rascalmpl.parser.gtd.stack.filter.follow.*;\r\nimport org.rascalmpl.parser.gtd.stack.filter.match.*;\r\nimport org.rascalmpl.parser.gtd.stack.filter.precede.*;\r\nimport org.rascalmpl.parser.gtd.preprocessing.ExpectBuilder;\r\nimport org.rascalmpl.parser.gtd.util.IntegerKeyedHashMap;\r\nimport org.rascalmpl.parser.gtd.util.IntegerList;\r\nimport org.rascalmpl.parser.gtd.util.IntegerMap;\r\nimport org.rascalmpl.values.ValueFactoryFactory;\r\nimport org.rascalmpl.parser.gtd.result.out.DefaultNodeFlattener;\r\nimport org.rascalmpl.parser.uptr.UPTRNodeFactory;\r\nimport org.rascalmpl.values.RascalValueFactory;\r\nimport org.rascalmpl.values.parsetrees.ITree;\r\nimport org.rascalmpl.values.parsetrees.TreeAdapter;\r\n\r\n@SuppressWarnings(\"all\")\r\npublic class ");
        $template45.beginIndent("             ");
        $template45.addStr(name_1.getValue().getValue());
        $template45.endIndent("             ");
        $template45.addStr(" extends org.rascalmpl.parser.gtd.SGTDBF<IConstructor, ITree, ISourceLocation> {\r\n  protected final static IValueFactory VF = ValueFactoryFactory.getValueFactory();\r\n\r\n  protected static IValue _read(java.lang.String s, io.usethesource.vallang.type.Type type) {\r\n    try {\r\n      return new StandardTextReader().read(VF, org.rascalmpl.values.RascalValueFactory.uptr, type, new StringReader(s));\r\n    }\r\n    catch (FactTypeUseException e) {\r\n      throw new RuntimeException(\"unexpected exception in generated parser\", e);  \r\n    } catch (IOException e) {\r\n      throw new RuntimeException(\"unexpected exception in generated parser\", e);  \r\n    }\r\n  }\r\n\t\r\n  protected static java.lang.String _concat(java.lang.String ...args) {\r\n    int length = 0;\r\n    for (java.lang.String s :args) {\r\n      length += s.length();\r\n    }\r\n    java.lang.StringBuilder b = new java.lang.StringBuilder(length);\r\n    for (java.lang.String s : args) {\r\n      b.append(s);\r\n    }\r\n    return b.toString();\r\n  }\r\n  protected static final TypeFactory _tf = TypeFactory.getInstance();\r\n \r\n  private static final IntegerMap _resultStoreIdMappings;\r\n  private static final IntegerKeyedHashMap<IntegerList> _dontNest;\r\n\t\r\n  protected static void _putDontNest(IntegerKeyedHashMap<IntegerList> result, int parentId, int childId) {\r\n    IntegerList donts = result.get(childId);\r\n    if (donts == null) {\r\n      donts = new IntegerList();\r\n      result.put(childId, donts);\r\n    }\r\n    donts.add(parentId);\r\n  }\r\n    \r\n  protected int getResultStoreId(int parentId) {\r\n    return _resultStoreIdMappings.get(parentId);\r\n  }\r\n    \r\n  protected static IntegerKeyedHashMap<IntegerList> _initDontNest() {\r\n    IntegerKeyedHashMap<IntegerList> result = new IntegerKeyedHashMap<IntegerList>(); \r\n    \r\n    ");
        IInteger i_13 = ((IInteger)$constants.get(19)/*0*/);
        $template45.addStr("\r\n    ");
        /*muExists*/LAB3: 
            do {
                LAB3_GEN8733:
                for(IValue $elem46_for : ((ISet)dontNest_8)){
                    IValue $elem46 = (IValue) $elem46_for;
                    final IValue $tuple_subject47 = ((IValue)($elem46));
                    if($tuple_subject47 instanceof ITuple && ((ITuple)$tuple_subject47).arity() == 2){
                       /*muExists*/LAB3_GEN8733_TUPLE: 
                           do {
                               IInteger f_14 = null;
                               IInteger c_15 = null;
                               i_13 = ((IInteger)($aint_add_aint(((IInteger)i_13),((IInteger)$constants.get(9)/*1*/))));
                               $template45.addStr("\r\n    ");
                               if((((IBool)($equal(((IInteger)(((IInteger)i_13).remainder(((IInteger)$constants.get(21)/*2000*/)))), ((IInteger)$constants.get(19)/*0*/))))).getValue()){
                                  $template45.addStr("\r\n    _initDontNest");
                                  $template45.beginIndent("                 ");
                                  $template45.addVal(i_13);
                                  $template45.endIndent("                 ");
                                  $template45.addStr("(result);\r\n    ");
                                  if((((IBool)($equal(((IInteger)i_13), ((IInteger)$constants.get(21)/*2000*/))))).getValue()){
                                     $template45.addStr("return result;");
                                  
                                  }
                                  $template45.addStr("\r\n  }\r\n  protected static void _initDontNest");
                                  $template45.beginIndent("                                     ");
                                  $template45.addVal(i_13);
                                  $template45.endIndent("                                     ");
                                  $template45.addStr("(IntegerKeyedHashMap<IntegerList> result) {");
                               
                               }
                               $template45.addStr("\r\n    _putDontNest(result, ");
                               $template45.beginIndent("                         ");
                               $template45.addVal($subscript_int(((IValue)($tuple_subject47)),0));
                               $template45.endIndent("                         ");
                               $template45.addStr(", ");
                               $template45.beginIndent("  ");
                               $template45.addVal($subscript_int(((IValue)($tuple_subject47)),1));
                               $template45.endIndent("  ");
                               $template45.addStr(");");
                       
                           } while(false);
                    
                    } else {
                       continue LAB3_GEN8733;
                    }
                }
                continue LAB3;
                            
            } while(false);
        $template45.addStr("\r\n   ");
        if((((IBool)($aint_less_aint(((IInteger)i_13),((IInteger)$constants.get(21)/*2000*/))))).getValue()){
           $template45.addStr("return result;");
        
        }
        $template45.addStr("\r\n  }\r\n    \r\n  protected static IntegerMap _initDontNestGroups() {\r\n    IntegerMap result = new IntegerMap();\r\n    int resultStoreId = result.size();\r\n    \r\n    ");
        /*muExists*/LAB7: 
            do {
                LAB7_GEN9376:
                for(IValue $elem49_for : ((ISet)dontNestGroups_9)){
                    IValue $elem49 = (IValue) $elem49_for;
                    final IValue $tuple_subject50 = ((IValue)($elem49));
                    if($tuple_subject50 instanceof ITuple && ((ITuple)$tuple_subject50).arity() == 2){
                       /*muExists*/LAB7_GEN9376_TUPLE: 
                           do {
                               ISet parentIds_16 = null;
                               $template45.addStr("\r\n    ++resultStoreId;\r\n    ");
                               /*muExists*/LAB8: 
                                   do {
                                       LAB8_GEN9472:
                                       for(IValue $elem48_for : ((ISet)($subscript_int(((IValue)($tuple_subject50)),1)))){
                                           IInteger $elem48 = (IInteger) $elem48_for;
                                           IInteger pid_17 = null;
                                           $template45.addStr("\r\n    result.putUnsafe(");
                                           $template45.beginIndent("                     ");
                                           $template45.addVal($elem48);
                                           $template45.endIndent("                     ");
                                           $template45.addStr(", resultStoreId);");
                                       
                                       }
                                       continue LAB8;
                                                   
                                   } while(false);
                       
                           } while(false);
                    
                    } else {
                       continue LAB7_GEN9376;
                    }
                }
                continue LAB7;
                            
            } while(false);
        $template45.addStr("\r\n      \r\n    return result;\r\n  }\r\n  \r\n  protected boolean hasNestingRestrictions(java.lang.String name){\r\n\t\treturn (_dontNest.size() != 0); // TODO Make more specific.\r\n  }\r\n    \r\n  protected IntegerList getFilteredParents(int childId) {\r\n\t\treturn _dontNest.get(childId);\r\n  }\r\n    \r\n  // initialize priorities     \r\n  static {\r\n    _dontNest = _initDontNest();\r\n    _resultStoreIdMappings = _initDontNestGroups();\r\n  }\r\n    \r\n  // Production declarations\r\n\t");
        /*muExists*/LAB9: 
            do {
                LAB9_GEN10262:
                for(IValue $elem52_for : ((ISet)uniqueProductions_2)){
                    IConstructor $elem52 = (IConstructor) $elem52_for;
                    IConstructor p_18 = ((IConstructor)($elem52));
                    $template45.addStr("\r\n  private static final IConstructor ");
                    $template45.beginIndent("                                    ");
                    $template45.addStr(((IString)($me.value2id(((IValue)p_18)))).getValue());
                    $template45.endIndent("                                    ");
                    $template45.addStr(" = (IConstructor) _read(\"");
                    $template45.beginIndent("                          ");
                    final Template $template51 = (Template)new Template($RVF, "");
                    $template51.addVal(p_18);
                    $template45.addStr(((IString)($me.esc(((IString)($template51.close()))))).getValue());
                    $template45.endIndent("                          ");
                    $template45.addStr("\", RascalValueFactory.Production);");
                
                }
                continue LAB9;
                            
            } while(false);
        $template45.addStr("\r\n    \r\n  // Item declarations\r\n\t");
        /*muExists*/LAB10: 
            do {
                LAB10_GEN10504:
                for(IValue $elem59_for : ((ISet)($amap_field_project((IMap)((IMap)newItems_7), ((IInteger)$constants.get(19)/*0*/))))){
                    IConstructor $elem59 = (IConstructor) $elem59_for;
                    if(true){
                       IConstructor s_19 = ((IConstructor)($elem59));
                       if((((IBool)($me.isNonterminal(((IConstructor)s_19))))).getValue()){
                         IMap items_20 = ((IMap)($amap_subscript(((IMap)newItems_7),((IConstructor)(M_Node.unsetRec(((IValue)s_19)))))));
                         IMap alts_21 = ((IMap)$constants.get(22)/*()*/);
                         /*muExists*/FOR11: 
                             do {
                                 FOR11_GEN10676:
                                 for(IValue $elem53_for : ((IMap)items_20)){
                                     IConstructor $elem53 = (IConstructor) $elem53_for;
                                     IConstructor item_22 = null;
                                     IConstructor prod_23 = ((IConstructor)(((IConstructor)($aadt_get_field(((IConstructor)($elem53)), "production")))));
                                     if((((IBool)($RVF.bool(((IMap)alts_21).containsKey(((IConstructor)prod_23)))))).getValue()){
                                        alts_21 = ((IMap)($amap_update(prod_23,$alist_add_elm(((IList)($amap_subscript(((IMap)alts_21),((IConstructor)prod_23)))),((IConstructor)($elem53))), ((IMap)(((IMap)alts_21))))));
                                     
                                     } else {
                                        alts_21 = ((IMap)($amap_update(prod_23,$RVF.list(((IConstructor)($elem53))), ((IMap)(((IMap)alts_21))))));
                                     
                                     }
                                 }
                                 continue FOR11;
                                             
                             } while(false);
                         /* void:  muCon([]) */$template45.addStr("\r\n\t\r\n  protected static class ");
                         $template45.beginIndent("                         ");
                         $template45.addStr(((IString)(getParserMethodName(((IConstructor)s_19), Util.kwpMap()))).getValue());
                         $template45.endIndent("                         ");
                         $template45.addStr(" {\r\n    public final static AbstractStackNode<IConstructor>[] EXPECTS;\r\n\r\n    static{\r\n      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_dontNest, _resultStoreIdMappings);\r\n      init(builder);\r\n       EXPECTS = builder.buildExpectArray();\r\n    }\r\n\r\n    ");
                         /*muExists*/LAB13: 
                             do {
                                 LAB13_GEN11373:
                                 for(IValue $elem56_for : ((ISet)($amap_field_project((IMap)((IMap)alts_21), ((IInteger)$constants.get(19)/*0*/))))){
                                     IConstructor $elem56 = (IConstructor) $elem56_for;
                                     if(true){
                                        IConstructor alt_24 = ((IConstructor)($elem56));
                                        if($is(((IConstructor)alt_24),((IString)$constants.get(23)/*"prod"*/))){
                                          IList lhses_25 = ((IList)($amap_subscript(((IMap)alts_21),((IConstructor)alt_24))));
                                          IString id_26 = ((IString)($me.value2id(((IValue)alt_24))));
                                          $template45.addStr("\r\n    protected static final void _init_");
                                          $template45.beginIndent("                                      ");
                                          $template45.addStr(((IString)id_26).getValue());
                                          $template45.endIndent("                                      ");
                                          $template45.addStr("(ExpectBuilder<IConstructor> builder) {\r\n      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[");
                                          $template45.beginIndent("                                                                                                            ");
                                          $template45.addVal(M_List.size(((IList)lhses_25)));
                                          $template45.endIndent("                                                                                                            ");
                                          $template45.addStr("];\r\n      ");
                                          /*muExists*/LAB14: 
                                              do {
                                                  LAB14_GEN11728:
                                                  for(IValue $elem55_for : ((IList)(M_List.sort(((IList)lhses_25), new TypedFunctionInstance2<IValue,IValue,IValue>(($_0, $_1) -> { return $CLOSURE_1((IConstructor)$_0, (IConstructor)$_1); }, $T26))))){
                                                      IConstructor $elem55 = (IConstructor) $elem55_for;
                                                      IConstructor i_27 = ((IConstructor)($elem55));
                                                      IInteger ii_28 = null;
                                                      if((((IBool)($equal(((IInteger)(((IInteger)($aadt_get_field(((IConstructor)i_27), "index"))))),((IInteger)$constants.get(24)/*-1*/)).not()))).getValue()){
                                                         ii_28 = ((IInteger)(((IInteger)($aadt_get_field(((IConstructor)i_27), "index")))));
                                                      
                                                      } else {
                                                         ii_28 = ((IInteger)$constants.get(19)/*0*/);
                                                      
                                                      }$template45.addStr("\r\n      tmp[");
                                                      $template45.beginIndent("          ");
                                                      $template45.addVal(ii_28);
                                                      $template45.endIndent("          ");
                                                      $template45.addStr("] = ");
                                                      $template45.beginIndent("    ");
                                                      $template45.addStr(((IString)($atuple_field_project((ITuple)((ITuple)($amap_subscript(((IMap)items_20),((IConstructor)(M_Node.unsetRec(((IValue)i_27))))))), ((IInteger)$constants.get(19)/*0*/)))).getValue());
                                                      $template45.endIndent("    ");
                                                      $template45.addStr(";");
                                                  
                                                  }
                                                  continue LAB14;
                                                              
                                              } while(false);
                                          $template45.addStr("\r\n      builder.addAlternative(");
                                          $template45.beginIndent("                             ");
                                          $template45.addStr(name_1.getValue().getValue());
                                          $template45.endIndent("                             ");
                                          $template45.addStr(".");
                                          $template45.beginIndent(" ");
                                          $template45.addStr(((IString)id_26).getValue());
                                          $template45.endIndent(" ");
                                          $template45.addStr(", tmp);\r\n\t  }");
                                        
                                        } else {
                                          continue LAB13_GEN11373;
                                        }
                                     
                                     } else {
                                        continue LAB13_GEN11373;
                                     }
                                 }
                                 continue LAB13;
                                             
                             } while(false);
                         $template45.addStr("\r\n    ");
                         /*muExists*/LAB15: 
                             do {
                                 LAB15_GEN12006:
                                 for(IValue $elem57_for : ((ISet)($amap_field_project((IMap)((IMap)alts_21), ((IInteger)$constants.get(19)/*0*/))))){
                                     IConstructor $elem57 = (IConstructor) $elem57_for;
                                     if(true){
                                        IConstructor alt_29 = ((IConstructor)($elem57));
                                        if($is(((IConstructor)alt_29),((IString)$constants.get(25)/*"regular"*/))){
                                          IList lhses_30 = ((IList)($amap_subscript(((IMap)alts_21),((IConstructor)alt_29))));
                                          IString id_31 = ((IString)($me.value2id(((IValue)alt_29))));
                                          $template45.addStr("\r\n    // this is only for top-level regular symbols\r\n    protected static final void _init_");
                                          $template45.beginIndent("                                      ");
                                          $template45.addStr(((IString)id_31).getValue());
                                          $template45.endIndent("                                      ");
                                          $template45.addStr("(ExpectBuilder<IConstructor> builder) {\r\n      builder.addAlternative(");
                                          $template45.beginIndent("                             ");
                                          $template45.addStr(name_1.getValue().getValue());
                                          $template45.endIndent("                             ");
                                          $template45.addStr(".");
                                          $template45.beginIndent(" ");
                                          $template45.addStr(((IString)id_31).getValue());
                                          $template45.endIndent(" ");
                                          $template45.addStr(", new AbstractStackNode[] { ");
                                          $template45.beginIndent("                            ");
                                          $template45.addStr(((IString)($atuple_field_project((ITuple)((ITuple)($amap_subscript(((IMap)($amap_subscript(((IMap)newItems_7),((IConstructor)($RVF.constructor(Symbol_topRegular_Symbol, new IValue[]{((IConstructor)(((IConstructor)($aadt_get_field(((IConstructor)alt_29), "def")))))}, Util.kwpMap())))))),((IConstructor)($RVF.constructor(M_Grammar.Item_item_Production_int, new IValue[]{((IConstructor)alt_29), ((IInteger)$constants.get(19)/*0*/)})))))), ((IInteger)$constants.get(19)/*0*/)))).getValue());
                                          $template45.endIndent("                            ");
                                          $template45.addStr(" });\r\n\t  }");
                                        
                                        } else {
                                          continue LAB15_GEN12006;
                                        }
                                     
                                     } else {
                                        continue LAB15_GEN12006;
                                     }
                                 }
                                 continue LAB15;
                                             
                             } while(false);
                         $template45.addStr("\r\n\r\n    public static void init(ExpectBuilder<IConstructor> builder){\r\n      ");
                         /*muExists*/LAB16: 
                             do {
                                 LAB16_GEN12540:
                                 for(IValue $elem58_for : ((ISet)($amap_field_project((IMap)((IMap)alts_21), ((IInteger)$constants.get(19)/*0*/))))){
                                     IConstructor $elem58 = (IConstructor) $elem58_for;
                                     IConstructor alt_32 = ((IConstructor)($elem58));
                                     IList lhses_33 = ((IList)($amap_subscript(((IMap)alts_21),((IConstructor)alt_32))));
                                     IString id_34 = ((IString)($me.value2id(((IValue)alt_32))));
                                     $template45.addStr("\r\n        _init_");
                                     $template45.beginIndent("              ");
                                     $template45.addStr(((IString)id_34).getValue());
                                     $template45.endIndent("              ");
                                     $template45.addStr("(builder);\r\n      ");
                                 
                                 }
                                 continue LAB16;
                                             
                             } while(false);
                         $template45.addStr("\r\n    }\r\n\r\n  }");
                       
                       } else {
                         continue LAB10_GEN10504;
                       }
                    
                    } else {
                       continue LAB10_GEN10504;
                    }
                }
                continue LAB10;
                            
            } while(false);
        $template45.addStr("\r\n\r\n  private int nextFreeStackNodeId = ");
        $template45.beginIndent("                                    ");
        $template45.addVal(newGenerate__newItem(uniqueItem_1));
        $template45.endIndent("                                    ");
        $template45.addStr(";\r\n  protected int getFreeStackNodeId() {\r\n    return nextFreeStackNodeId++;\r\n  }\r\n\r\n  // Parse methods    \r\n  ");
        /*muExists*/LAB17: 
            do {
                LAB17_GEN13006:
                for(IValue $elem60_for : ((ISet)($amap_field_project((IMap)((IMap)(((IMap)($aadt_get_field(gr_2.getValue(), "rules"))))), ((IInteger)$constants.get(19)/*0*/))))){
                    IConstructor $elem60 = (IConstructor) $elem60_for;
                    if(true){
                       IConstructor nont_35 = ((IConstructor)($elem60));
                       if((((IBool)($me.isNonterminal(((IConstructor)nont_35))))).getValue()){
                         uniqueItem_1.setValue(((IInteger)($aint_add_aint(uniqueItem_1.getValue(),((IInteger)$constants.get(9)/*1*/)))));
                         $template45.addStr("\r\n  ");
                         $template45.beginIndent("  ");
                         $template45.addStr(((IString)($me.generateParseMethod(gr_2.getValue(), ((IMap)newItems_7), ((IConstructor)($amap_subscript(((IMap)(((IMap)($aadt_get_field(gr_2.getValue(), "rules"))))),((IConstructor)(M_Node.unsetRec(((IValue)nont_35))))))), uniqueItem_1.getValue()))).getValue());
                         $template45.endIndent("  ");
                       
                       } else {
                         continue LAB17_GEN13006;
                       }
                    
                    } else {
                       continue LAB17_GEN13006;
                    }
                }
                continue LAB17;
                            
            } while(false);
        $template45.addStr("\r\n\r\n}");
        return ((IString)($template45.close()));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(2826,10419,<70,0>,<282,1>) 
    public IString newGenerate$d180df80b178b419(IString $aux_$package_0, IString $aux_name_1, IConstructor $aux_gr_2){ 
        ValueRef<IString> $package_0 = new ValueRef<IString>("$package_0", $aux_$package_0);
        ValueRef<IString> name_1 = new ValueRef<IString>("name_1", $aux_name_1);
        ValueRef<IConstructor> gr_2 = new ValueRef<IConstructor>("gr_2", $aux_gr_2);
    
        
        final Template $template23 = (Template)new Template($RVF, "Generating parser; ");
        /*muExists*/LAB0: 
            do {
                LAB0_GEN2929:
                for(IValue $elem24_for : ((IMap)(((IMap)($aadt_get_field(gr_2.getValue(), "rules")))))){
                    IConstructor $elem24 = (IConstructor) $elem24_for;
                    IConstructor st_3 = null;
                    if($is(((IConstructor)($elem24)),((IString)$constants.get(26)/*"sort"*/))){
                      ;$template23.addVal($reifiedAType((IConstructor) $elem24, ((IMap)$constants.get(22)/*()*/)));
                      $template23.addStr(" ");
                    
                    } else {
                      if($is(((IConstructor)($elem24)),((IString)$constants.get(27)/*"lex"*/))){
                        ;$template23.addVal($reifiedAType((IConstructor) $elem24, ((IMap)$constants.get(22)/*()*/)));
                        $template23.addStr(" ");
                      
                      } else {
                        continue LAB0_GEN2929;
                      }
                    
                    }
                
                }
                continue LAB0;
                            
            } while(false);
        return ((IString)(M_util_Monitor.job(((IString)($astr_slice(((IString)($template23.close())), null, null, -1))), new TypedFunctionInstance1<IValue,IValue>(($_0) -> { return $CLOSURE_0((TypedFunctionInstance2<IValue, IValue, IValue>)$_0, gr_2, name_1, $package_0); }, $T27), Util.kwpMap("totalWork", ((IInteger)$constants.get(28)/*9*/)))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(13251,1024,<284,0>,<297,1>) 
    public ISet computeDontNests$aa5378becc7a1991(IMap items_0, IConstructor grammar_1, IConstructor uniqueGrammar_2){ 
        
        
        final IMapWriter $mapwriter61 = (IMapWriter)$RVF.mapWriter();
        /*muExists*/$MCOMP62: 
            do {
                $MCOMP62_DESC13503:
                for(IValue $elem63 : new DescendantMatchIterator(grammar_1, 
                    new DescendantDescriptorAlwaysTrue($RVF.bool(false)))){
                    if($isComparable($elem63.getType(), M_ParseTree.ADT_Production)){
                       if($isSubtypeOf($elem63.getType(),M_ParseTree.ADT_Production)){
                          if($has_type_and_arity($elem63, M_ParseTree.Production_prod_Symbol_list_Symbol_set_Attr, 3)){
                             IValue $arg0_66 = (IValue)($subscript_int(((IValue)($elem63)),0));
                             if($isComparable($arg0_66.getType(), M_ParseTree.ADT_Symbol)){
                                if(true){
                                   IConstructor rhs_5 = ((IConstructor)($arg0_66));
                                   IValue $arg1_65 = (IValue)($subscript_int(((IValue)($elem63)),1));
                                   if($isComparable($arg1_65.getType(), $T6)){
                                      if(true){
                                         IList lhs_6 = ((IList)($arg1_65));
                                         IValue $arg2_64 = (IValue)($subscript_int(((IValue)($elem63)),2));
                                         if($isComparable($arg2_64.getType(), $T1)){
                                            IConstructor p_4 = ((IConstructor)($elem63));
                                            $mapwriter61.insert($RVF.tuple(p_4, $atuple_field_project((ITuple)((ITuple)($amap_subscript(((IMap)($amap_subscript(((IMap)items_0),((IConstructor)(getType(((IConstructor)($arg0_66)))))))),((IConstructor)($RVF.constructor(M_Grammar.Item_item_Production_int, new IValue[]{((IConstructor)p_4), ((IInteger)(((IInteger) ((IInteger)(M_List.size(((IList)($arg1_65))))).subtract(((IInteger)$constants.get(9)/*1*/)))))})))))), ((IInteger)$constants.get(9)/*1*/))));
                                         
                                         } else {
                                            continue $MCOMP62_DESC13503;
                                         }
                                      } else {
                                         continue $MCOMP62_DESC13503;
                                      }
                                   } else {
                                      continue $MCOMP62_DESC13503;
                                   }
                                } else {
                                   continue $MCOMP62_DESC13503;
                                }
                             } else {
                                continue $MCOMP62_DESC13503;
                             }
                          } else {
                             continue $MCOMP62_DESC13503;
                          }
                       } else {
                          continue $MCOMP62_DESC13503;
                       }
                    } else {
                       continue $MCOMP62_DESC13503;
                    }
                }
                
                             
            } while(false);
        IMap prodItems_3 = ((IMap)($mapwriter61.done()));
        ISet dnn_7 = ((ISet)(M_lang_rascal_grammar_definition_Priorities.doNotNest(((IConstructor)grammar_1))));
        final ISetWriter $setwriter67 = (ISetWriter)$RVF.setWriter();
        ;
        $SCOMP68_GEN14094:
        for(IValue $elem69_for : ((ISet)dnn_7)){
            IValue $elem69 = (IValue) $elem69_for;
            final IValue $tuple_subject70 = ((IValue)($elem69));
            if($tuple_subject70 instanceof ITuple && ((ITuple)$tuple_subject70).arity() == 3){
               /*muExists*/$SCOMP68_GEN14094_TUPLE: 
                   do {
                       IConstructor father_8 = null;
                       IInteger pos_9 = null;
                       IConstructor child_10 = null;
                       if($is(((IConstructor)($subscript_int(((IValue)($tuple_subject70)),0))),((IString)$constants.get(23)/*"prod"*/))){
                         $setwriter67.insert($RVF.tuple(((IInteger)($atuple_field_project((ITuple)((ITuple)($amap_subscript(((IMap)($amap_subscript(((IMap)items_0),((IConstructor)(getType(((IConstructor)(((IConstructor)($aadt_get_field(((IConstructor)($subscript_int(((IValue)($tuple_subject70)),0))), "def"))))))))))),((IConstructor)($RVF.constructor(M_Grammar.Item_item_Production_int, new IValue[]{((IConstructor)($subscript_int(((IValue)($tuple_subject70)),0))), ((IInteger)($subscript_int(((IValue)($tuple_subject70)),1)))})))))), ((IInteger)$constants.get(9)/*1*/)))), ((IInteger)($amap_subscript(((IMap)prodItems_3),((IConstructor)($subscript_int(((IValue)($tuple_subject70)),2))))))));
                       
                       } else {
                         continue $SCOMP68_GEN14094_TUPLE;
                       }
               
                   } while(false);
            
            } else {
               continue $SCOMP68_GEN14094;
            }
        }
        
                    final ISetWriter $setwriter71 = (ISetWriter)$RVF.setWriter();
        ;
        $SCOMP72_GEN14195:
        for(IValue $elem74_for : ((ISet)dnn_7)){
            IValue $elem74 = (IValue) $elem74_for;
            final IValue $tuple_subject75 = ((IValue)($elem74));
            if($tuple_subject75 instanceof ITuple && ((ITuple)$tuple_subject75).arity() == 3){
               /*muExists*/$SCOMP72_GEN14195_TUPLE: 
                   do {
                       final IConstructor $subject76 = ((IConstructor)($subscript_int(((IValue)($tuple_subject75)),0)));
                       if($has_type_and_arity($subject76, M_ParseTree.Production_regular_Symbol, 1)){
                          IValue $arg0_77 = (IValue)($aadt_subscript_int(((IConstructor)($subject76)),0));
                          if($isComparable($arg0_77.getType(), M_ParseTree.ADT_Symbol)){
                             IConstructor s_11 = ((IConstructor)($arg0_77));
                             IInteger pos_12 = ((IInteger)($subscript_int(((IValue)($tuple_subject75)),1)));
                             IConstructor child_13 = ((IConstructor)($subscript_int(((IValue)($tuple_subject75)),2)));
                             $SCOMP72_GEN14195_TUPLE_DESC14226:
                             for(IValue $elem73 : new DescendantMatchIterator(uniqueGrammar_2, 
                                 new DescendantDescriptorAlwaysTrue($RVF.bool(false)))){
                                 if($isComparable($elem73.getType(), M_ParseTree.ADT_Symbol)){
                                    if($isSubtypeOf($elem73.getType(),M_ParseTree.ADT_Symbol)){
                                       IConstructor t_14 = ((IConstructor)($elem73));
                                       if((((IBool)($equal(((IConstructor)(M_Node.unsetRec(((IValue)t_14)))), ((IConstructor)($arg0_77)))))).getValue()){
                                         $setwriter71.insert($RVF.tuple(((IInteger)($me.getItemId(((IConstructor)t_14), ((IInteger)pos_12), ((IConstructor)child_13)))), ((IInteger)($amap_subscript(((IMap)prodItems_3),((IConstructor)child_13))))));
                                       
                                       } else {
                                         continue $SCOMP72_GEN14195_TUPLE_DESC14226;
                                       }
                                    
                                    } else {
                                       continue $SCOMP72_GEN14195_TUPLE_DESC14226;
                                    }
                                 } else {
                                    continue $SCOMP72_GEN14195_TUPLE_DESC14226;
                                 }
                             }
                             continue $SCOMP72_GEN14195_TUPLE;
                                          
                          } else {
                             continue $SCOMP72_GEN14195;
                          }
                       } else {
                          continue $SCOMP72_GEN14195;
                       }
                   } while(false);
            
            } else {
               continue $SCOMP72_GEN14195;
            }
        }
        
                    return ((ISet)($aset_add_aset(((ISet)($setwriter67.done())),((ISet)($setwriter71.done())))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(14279,883,<299,0>,<313,1>) 
    public IInteger getItemId$8da6826786be742d(IConstructor s_0, IInteger pos_1, IConstructor $2){ 
        
        
        if($has_type_and_arity($2, M_ParseTree.Production_prod_Symbol_list_Symbol_set_Attr, 3)){
           IValue $arg0_107 = (IValue)($aadt_subscript_int(((IConstructor)$2),0));
           if($isComparable($arg0_107.getType(), M_ParseTree.ADT_Symbol)){
              if($has_type_and_arity($arg0_107, M_Type.Symbol_label_str_Symbol, 2)){
                 IValue $arg0_109 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_107)),0));
                 if($isComparable($arg0_109.getType(), $T4)){
                    if(true){
                       IString l_2 = null;
                       IValue $arg1_108 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_107)),1));
                       if($isComparable($arg1_108.getType(), M_ParseTree.ADT_Symbol)){
                          IValue $arg1_106 = (IValue)($aadt_subscript_int(((IConstructor)$2),1));
                          if($isComparable($arg1_106.getType(), $T6)){
                             IValue $arg2_105 = (IValue)($aadt_subscript_int(((IConstructor)$2),2));
                             if($isComparable($arg2_105.getType(), $T31)){
                                final IConstructor $switchVal78 = ((IConstructor)s_0);
                                boolean noCaseMatched_$switchVal78 = true;
                                SWITCH18: switch(Fingerprint.getFingerprint($switchVal78)){
                                
                                    case -964239440:
                                        if(noCaseMatched_$switchVal78){
                                            noCaseMatched_$switchVal78 = false;
                                            if($isSubtypeOf($switchVal78.getType(),M_ParseTree.ADT_Symbol)){
                                               /*muExists*/CASE_964239440_5: 
                                                   do {
                                                       if($has_type_and_arity($switchVal78, M_ParseTree.Symbol_iter_star_seps_Symbol_list_Symbol, 2)){
                                                          IValue $arg0_87 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal78)),0));
                                                          if($isComparable($arg0_87.getType(), M_ParseTree.ADT_Symbol)){
                                                             IConstructor t_8 = null;
                                                             IValue $arg1_86 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal78)),1));
                                                             if($isComparable($arg1_86.getType(), $T1)){
                                                                if((((IBool)($equal(((IInteger)pos_1), ((IInteger)$constants.get(19)/*0*/))))).getValue()){
                                                                   return ((IInteger)($getkw_Symbol_id(((IConstructor)($arg0_87)))));
                                                                
                                                                } else {
                                                                   continue CASE_964239440_5;
                                                                }
                                                             }
                                                          
                                                          }
                                                       
                                                       }
                                               
                                                   } while(false);
                                            
                                            }
                                            if($isSubtypeOf($switchVal78.getType(),M_ParseTree.ADT_Symbol)){
                                               /*muExists*/CASE_964239440_6: 
                                                   do {
                                                       if($has_type_and_arity($switchVal78, M_ParseTree.Symbol_iter_star_seps_Symbol_list_Symbol, 2)){
                                                          IValue $arg0_89 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal78)),0));
                                                          if($isComparable($arg0_89.getType(), $T1)){
                                                             IValue $arg1_88 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal78)),1));
                                                             if($isComparable($arg1_88.getType(), $T6)){
                                                                IList ss_9 = null;
                                                                if((((IBool)($aint_lessequal_aint(((IInteger)pos_1),((IInteger)$constants.get(19)/*0*/)).not()))).getValue()){
                                                                   return ((IInteger)($getkw_Symbol_id(((IConstructor)($alist_subscript_int(((IList)($arg1_88)),((IInteger)(((IInteger) ((IInteger)pos_1).subtract(((IInteger)$constants.get(9)/*1*/))))).intValue()))))));
                                                                
                                                                } else {
                                                                   continue CASE_964239440_6;
                                                                }
                                                             }
                                                          
                                                          }
                                                       
                                                       }
                                               
                                                   } while(false);
                                            
                                            }
                                
                                        }
                                        
                                
                                    case 25942208:
                                        if(noCaseMatched_$switchVal78){
                                            noCaseMatched_$switchVal78 = false;
                                            if($isSubtypeOf($switchVal78.getType(),M_ParseTree.ADT_Symbol)){
                                               /*muExists*/CASE_25942208_1: 
                                                   do {
                                                       if($has_type_and_arity($switchVal78, M_ParseTree.Symbol_iter_Symbol, 1)){
                                                          IValue $arg0_80 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal78)),0));
                                                          if($isComparable($arg0_80.getType(), M_ParseTree.ADT_Symbol)){
                                                             IConstructor t_4 = null;
                                                             return ((IInteger)($getkw_Symbol_id(((IConstructor)($arg0_80)))));
                                                          
                                                          }
                                                       
                                                       }
                                               
                                                   } while(false);
                                            
                                            }
                                
                                        }
                                        
                                
                                    case 882072:
                                        if(noCaseMatched_$switchVal78){
                                            noCaseMatched_$switchVal78 = false;
                                            if($isSubtypeOf($switchVal78.getType(),M_ParseTree.ADT_Symbol)){
                                               /*muExists*/CASE_882072_0: 
                                                   do {
                                                       if($has_type_and_arity($switchVal78, M_ParseTree.Symbol_opt_Symbol, 1)){
                                                          IValue $arg0_79 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal78)),0));
                                                          if($isComparable($arg0_79.getType(), M_ParseTree.ADT_Symbol)){
                                                             IConstructor t_3 = null;
                                                             return ((IInteger)($getkw_Symbol_id(((IConstructor)($arg0_79)))));
                                                          
                                                          }
                                                       
                                                       }
                                               
                                                   } while(false);
                                            
                                            }
                                
                                        }
                                        
                                
                                    case 910072:
                                        if(noCaseMatched_$switchVal78){
                                            noCaseMatched_$switchVal78 = false;
                                            if($isSubtypeOf($switchVal78.getType(),M_ParseTree.ADT_Symbol)){
                                               /*muExists*/CASE_910072_7: 
                                                   do {
                                                       if($has_type_and_arity($switchVal78, M_ParseTree.Symbol_seq_list_Symbol, 1)){
                                                          IValue $arg0_90 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal78)),0));
                                                          if($isComparable($arg0_90.getType(), $T6)){
                                                             IList ss_10 = null;
                                                             return ((IInteger)($getkw_Symbol_id(((IConstructor)($alist_subscript_int(((IList)($arg0_90)),((IInteger)pos_1).intValue()))))));
                                                          
                                                          }
                                                       
                                                       }
                                               
                                                   } while(false);
                                            
                                            }
                                
                                        }
                                        
                                
                                    case 826203960:
                                        if(noCaseMatched_$switchVal78){
                                            noCaseMatched_$switchVal78 = false;
                                            if($isSubtypeOf($switchVal78.getType(),M_ParseTree.ADT_Symbol)){
                                               /*muExists*/CASE_826203960_2: 
                                                   do {
                                                       if($has_type_and_arity($switchVal78, M_ParseTree.Symbol_iter_star_Symbol, 1)){
                                                          IValue $arg0_81 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal78)),0));
                                                          if($isComparable($arg0_81.getType(), M_ParseTree.ADT_Symbol)){
                                                             IConstructor t_5 = null;
                                                             return ((IInteger)($getkw_Symbol_id(((IConstructor)($arg0_81)))));
                                                          
                                                          }
                                                       
                                                       }
                                               
                                                   } while(false);
                                            
                                            }
                                
                                        }
                                        
                                
                                    case 773448:
                                        if(noCaseMatched_$switchVal78){
                                            noCaseMatched_$switchVal78 = false;
                                            if($isSubtypeOf($switchVal78.getType(),M_ParseTree.ADT_Symbol)){
                                               /*muExists*/CASE_773448_8: 
                                                   do {
                                                       if($has_type_and_arity($switchVal78, M_ParseTree.Symbol_alt_set_Symbol, 1)){
                                                          IValue $arg0_104 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal78)),0));
                                                          if($isComparable($arg0_104.getType(), $T0)){
                                                             ISet aa_11 = null;
                                                             /*muExists*/IF23: 
                                                                 do {
                                                                     /*muExists*/IF23_GEN15030_CONS_conditional: 
                                                                         do {
                                                                             IF23_GEN15030:
                                                                             for(IValue $elem92_for : ((ISet)($arg0_104))){
                                                                                 IConstructor $elem92 = (IConstructor) $elem92_for;
                                                                                 if($has_type_and_arity($elem92, M_ParseTree.Symbol_conditional_Symbol_set_Condition, 2)){
                                                                                    IValue $arg0_103 = (IValue)($aadt_subscript_int(((IConstructor)($elem92)),0));
                                                                                    if($isComparable($arg0_103.getType(), $T1)){
                                                                                       IValue $arg1_93 = (IValue)($aadt_subscript_int(((IConstructor)($elem92)),1));
                                                                                       if($isComparable($arg1_93.getType(), $T8)){
                                                                                          ISet $subject94 = (ISet)($arg1_93);
                                                                                          IF23_GEN15030_CONS_conditional_SET_MVAR$_91:
                                                                                          for(IValue $elem101_for : new SubSetGenerator(((ISet)($subject94)))){
                                                                                              ISet $elem101 = (ISet) $elem101_for;
                                                                                              final ISet $subject96 = ((ISet)(((ISet)($subject94)).subtract(((ISet)($elem101)))));
                                                                                              IF23_GEN15030_CONS_conditional_SET_MVAR$_91_CONS_except$_DFLT_SET_ELM99:
                                                                                              for(IValue $elem98_for : ((ISet)($subject96))){
                                                                                                  IConstructor $elem98 = (IConstructor) $elem98_for;
                                                                                                  if($has_type_and_arity($elem98, M_ParseTree.Condition_except_str, 1)){
                                                                                                     IValue $arg0_100 = (IValue)($aadt_subscript_int(((IConstructor)($elem98)),0));
                                                                                                     if($isComparable($arg0_100.getType(), $T4)){
                                                                                                        if(($arg0_109 != null)){
                                                                                                           if($arg0_109.match($arg0_100)){
                                                                                                              final ISet $subject97 = ((ISet)(((ISet)($subject96)).delete(((IConstructor)($elem98)))));
                                                                                                              if(((ISet)($subject97)).size() == 0){
                                                                                                                 IConstructor a_12 = ((IConstructor)($elem92));
                                                                                                                 return ((IInteger)($getkw_Symbol_id(((IConstructor)a_12))));
                                                                                                              
                                                                                                              } else {
                                                                                                                 continue IF23_GEN15030_CONS_conditional_SET_MVAR$_91_CONS_except$_DFLT_SET_ELM99;/*redirected IF23_GEN15030_CONS_conditional_SET_MVAR$_91_CONS_except to IF23_GEN15030_CONS_conditional_SET_MVAR$_91_CONS_except$_DFLT_SET_ELM99; set pat3*/
                                                                                                              }
                                                                                                           } else {
                                                                                                              continue IF23_GEN15030_CONS_conditional_SET_MVAR$_91_CONS_except$_DFLT_SET_ELM99;/*default set elem*/
                                                                                                           }
                                                                                                        } else {
                                                                                                           $arg0_109 = ((IValue)($arg0_100));
                                                                                                           final ISet $subject97 = ((ISet)(((ISet)($subject96)).delete(((IConstructor)($elem98)))));
                                                                                                           if(((ISet)($subject97)).size() == 0){
                                                                                                              IConstructor a_12 = ((IConstructor)($elem92));
                                                                                                              return ((IInteger)($getkw_Symbol_id(((IConstructor)a_12))));
                                                                                                           
                                                                                                           } else {
                                                                                                              continue IF23_GEN15030_CONS_conditional_SET_MVAR$_91_CONS_except$_DFLT_SET_ELM99;/*redirected IF23_GEN15030_CONS_conditional_SET_MVAR$_91_CONS_except to IF23_GEN15030_CONS_conditional_SET_MVAR$_91_CONS_except$_DFLT_SET_ELM99; set pat3*/
                                                                                                           }
                                                                                                        }
                                                                                                     } else {
                                                                                                        continue IF23_GEN15030_CONS_conditional_SET_MVAR$_91_CONS_except$_DFLT_SET_ELM99;/*default set elem*/
                                                                                                     }
                                                                                                  } else {
                                                                                                     continue IF23_GEN15030_CONS_conditional_SET_MVAR$_91_CONS_except$_DFLT_SET_ELM99;/*default set elem*/
                                                                                                  }
                                                                                              }
                                                                                              continue IF23_GEN15030_CONS_conditional_SET_MVAR$_91;/*set pat4*/
                                                                                                          
                                                                                          }
                                                                                          continue IF23_GEN15030;
                                                                                                      
                                                                                       } else {
                                                                                          continue IF23_GEN15030;
                                                                                       }
                                                                                    } else {
                                                                                       continue IF23_GEN15030;
                                                                                    }
                                                                                 } else {
                                                                                    continue IF23_GEN15030;
                                                                                 }
                                                                             }
                                                                             
                                                                                         
                                                                         } while(false);
                                                             
                                                                 } while(false);
                                                             break SWITCH18;// succeedSwitch
                                                          }
                                                       
                                                       }
                                               
                                                   } while(false);
                                            
                                            }
                                
                                        }
                                        
                                
                                    case 1652184736:
                                        if(noCaseMatched_$switchVal78){
                                            noCaseMatched_$switchVal78 = false;
                                            if($isSubtypeOf($switchVal78.getType(),M_ParseTree.ADT_Symbol)){
                                               /*muExists*/CASE_1652184736_3: 
                                                   do {
                                                       if($has_type_and_arity($switchVal78, M_ParseTree.Symbol_iter_seps_Symbol_list_Symbol, 2)){
                                                          IValue $arg0_83 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal78)),0));
                                                          if($isComparable($arg0_83.getType(), M_ParseTree.ADT_Symbol)){
                                                             IConstructor t_6 = null;
                                                             IValue $arg1_82 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal78)),1));
                                                             if($isComparable($arg1_82.getType(), $T1)){
                                                                if((((IBool)($equal(((IInteger)pos_1), ((IInteger)$constants.get(19)/*0*/))))).getValue()){
                                                                   return ((IInteger)($getkw_Symbol_id(((IConstructor)($arg0_83)))));
                                                                
                                                                } else {
                                                                   continue CASE_1652184736_3;
                                                                }
                                                             }
                                                          
                                                          }
                                                       
                                                       }
                                               
                                                   } while(false);
                                            
                                            }
                                            if($isSubtypeOf($switchVal78.getType(),M_ParseTree.ADT_Symbol)){
                                               /*muExists*/CASE_1652184736_4: 
                                                   do {
                                                       if($has_type_and_arity($switchVal78, M_ParseTree.Symbol_iter_seps_Symbol_list_Symbol, 2)){
                                                          IValue $arg0_85 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal78)),0));
                                                          if($isComparable($arg0_85.getType(), $T1)){
                                                             IValue $arg1_84 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal78)),1));
                                                             if($isComparable($arg1_84.getType(), $T6)){
                                                                IList ss_7 = null;
                                                                if((((IBool)($aint_lessequal_aint(((IInteger)pos_1),((IInteger)$constants.get(19)/*0*/)).not()))).getValue()){
                                                                   return ((IInteger)($getkw_Symbol_id(((IConstructor)($alist_subscript_int(((IList)($arg1_84)),((IInteger)(((IInteger) ((IInteger)pos_1).subtract(((IInteger)$constants.get(9)/*1*/))))).intValue()))))));
                                                                
                                                                } else {
                                                                   continue CASE_1652184736_4;
                                                                }
                                                             }
                                                          
                                                          }
                                                       
                                                       }
                                               
                                                   } while(false);
                                            
                                            }
                                
                                        }
                                        
                                
                                    default: 
                                }
                                
                                           return ((IInteger)($getkw_Symbol_id(((IConstructor)s_0))));
                             
                             } else {
                                return null;
                             }
                          } else {
                             return null;
                          }
                       } else {
                          return null;
                       }
                    } else {
                       return null;
                    }
                 } else {
                    return null;
                 }
              } else {
                 return null;
              }
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(15170,46,<317,0>,<317,46>) 
    public IConstructor getType$7098a7e37e3432cc(IConstructor p_0){ 
        
        
        return ((IConstructor)(getType(((IConstructor)(((IConstructor)($aadt_get_field(((IConstructor)p_0), "def"))))))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(15218,52,<318,0>,<318,52>) 
    public IConstructor getType$b23fa460f79f689c(IConstructor $0){ 
        
        
        if($has_type_and_arity($0, M_Type.Symbol_label_str_Symbol, 2)){
           IValue $arg0_111 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_111.getType(), $T4)){
              IValue $arg1_110 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
              if($isComparable($arg1_110.getType(), M_ParseTree.ADT_Symbol)){
                 IConstructor s_0 = null;
                 return ((IConstructor)(getType(((IConstructor)($arg1_110)))));
              
              } else {
                 return null;
              }
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(15272,70,<319,0>,<319,70>) 
    public IConstructor getType$3a91be5bec1e7554(IConstructor $0){ 
        
        
        if($has_type_and_arity($0, M_ParseTree.Symbol_conditional_Symbol_set_Condition, 2)){
           IValue $arg0_113 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_113.getType(), M_ParseTree.ADT_Symbol)){
              IConstructor s_0 = null;
              IValue $arg1_112 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
              if($isComparable($arg1_112.getType(), $T8)){
                 ISet cs_1 = null;
                 return ((IConstructor)(getType(((IConstructor)($arg0_113)))));
              
              } else {
                 return null;
              }
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(15344,47,<320,0>,<320,47>) 
    public IConstructor getType$d2c0972de07d8835(IConstructor s_0){ 
        
        
        return ((IConstructor)(M_Node.unsetRec(((IValue)s_0))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(15913,42,<330,2>,<330,44>) 
    public IConstructor cl$96bd60344ec07bdd(IConstructor p_0){ 
        
        
        return ((IConstructor)(M_Node.unsetRec(((IValue)p_0))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(15439,2630,<324,0>,<385,1>) 
    public IMap generateNewItems$807ae7532df54f11(IConstructor $aux_g_0){ 
        ValueRef<IConstructor> g_0 = new ValueRef<IConstructor>("g_0", $aux_g_0);
    
        
        try {
            final ValueRef<IMap> items_1 = new ValueRef<IMap>("items", ((IMap)$constants.get(22)/*()*/));
            final ValueRef<IMap> fresh_2 = new ValueRef<IMap>("fresh", ((IMap)$constants.get(22)/*()*/));
            $TRAVERSE.traverse(DIRECTION.BottomUp, PROGRESS.Continuing, FIXEDPOINT.No, REBUILD.No, 
                 new DescendantDescriptorAlwaysTrue($RVF.bool(false)),
                 g_0.getValue(),
                 (IVisitFunction) (IValue $VISIT24_subject, TraversalState $traversalState) -> {
                     VISIT24:switch(Fingerprint.getFingerprint($VISIT24_subject)){
                     
                         case 101776608:
                             if($isSubtypeOf($VISIT24_subject.getType(),M_ParseTree.ADT_Production)){
                                /*muExists*/CASE_101776608_2: 
                                    do {
                                        if($has_type_and_arity($VISIT24_subject, M_ParseTree.Production_regular_Symbol, 1)){
                                           IValue $arg0_138 = (IValue)($aadt_subscript_int(((IConstructor)($VISIT24_subject)),0));
                                           if($isComparable($arg0_138.getType(), M_ParseTree.ADT_Symbol)){
                                              IConstructor s_10 = ((IConstructor)($arg0_138));
                                              IConstructor p_9 = ((IConstructor)($VISIT24_subject));
                                              /*muExists*/WHILE28_BT: 
                                                  do {
                                                      WHILE28:
                                                          while((((IBool)(($is(((IConstructor)($arg0_138)),((IString)$constants.get(29)/*"conditional"*/)) ? ((IBool)$constants.get(15)/*true*/) : $RVF.bool($is(((IConstructor)($arg0_138)),((IString)$constants.get(30)/*"label"*/))))))).getValue()){
                                                              $arg0_138 = ((IValue)(((IConstructor)($aadt_get_field(((IConstructor)($arg0_138)), "symbol")))));
                                                      
                                                          }
                                              
                                                  } while(false);
                                              /* void:  muCon([]) */IConstructor us_11 = ((IConstructor)(M_Node.unsetRec(((IValue)($arg0_138)))));
                                              p_9 = ((IConstructor)(M_Node.unsetRec(((IValue)p_9))));
                                              GuardedIValue guarded29 = $guarded_map_subscript(items_1.getValue(),((IConstructor)($RVF.constructor(Symbol_topRegular_Symbol, new IValue[]{((IConstructor)us_11)}, Util.kwpMap()))));
                                              items_1.setValue(((IMap)($amap_update($RVF.constructor(Symbol_topRegular_Symbol, new IValue[]{((IConstructor)us_11)}, Util.kwpMap()),$amap_add_amap(((IMap)(($is_defined_value(guarded29) ? ((IMap)$get_defined_value(guarded29)) : fresh_2.getValue()))),((IMap)($buildMap(((IConstructor)($RVF.constructor(M_Grammar.Item_item_Production_int, new IValue[]{((IConstructor)p_9), ((IInteger)$constants.get(19)/*0*/)}))), ((ITuple)($me.sym2newitem(g_0.getValue(), ((IConstructor)($arg0_138)), ((IInteger)$constants.get(19)/*0*/)))))))), ((IMap)(items_1.getValue()))))));
                                              final IConstructor $switchVal123 = ((IConstructor)($arg0_138));
                                              boolean noCaseMatched_$switchVal123 = true;
                                              SWITCH30: switch(Fingerprint.getFingerprint($switchVal123)){
                                              
                                                  case -964239440:
                                                      if(noCaseMatched_$switchVal123){
                                                          noCaseMatched_$switchVal123 = false;
                                                          if($isSubtypeOf($switchVal123.getType(),M_ParseTree.ADT_Symbol)){
                                                             /*muExists*/CASE_964239440_3: 
                                                                 do {
                                                                     if($has_type_and_arity($switchVal123, M_ParseTree.Symbol_iter_star_seps_Symbol_list_Symbol, 2)){
                                                                        IValue $arg0_132 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal123)),0));
                                                                        if($isComparable($arg0_132.getType(), M_ParseTree.ADT_Symbol)){
                                                                           IConstructor elem_17 = ((IConstructor)($arg0_132));
                                                                           IValue $arg1_131 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal123)),1));
                                                                           if($isComparable($arg1_131.getType(), $T6)){
                                                                              IList seps_18 = ((IList)($arg1_131));
                                                                              GuardedIValue guarded37 = $guarded_map_subscript(items_1.getValue(),((IConstructor)us_11));
                                                                              items_1.setValue(((IMap)($amap_update(us_11,$amap_add_amap(((IMap)(($is_defined_value(guarded37) ? ((IMap)$get_defined_value(guarded37)) : fresh_2.getValue()))),((IMap)($buildMap(((IConstructor)($RVF.constructor(M_Grammar.Item_item_Production_int, new IValue[]{((IConstructor)p_9), ((IInteger)$constants.get(19)/*0*/)}))), ((ITuple)($me.sym2newitem(g_0.getValue(), ((IConstructor)($arg0_132)), ((IInteger)$constants.get(19)/*0*/)))))))), ((IMap)(items_1.getValue()))))));
                                                                              /*muExists*/FOR38: 
                                                                                  do {
                                                                                      FOR38_GEN17288:
                                                                                      for(IValue $elem130_for : ((IList)(M_List.index(((IList)($arg1_131)))))){
                                                                                          IInteger $elem130 = (IInteger) $elem130_for;
                                                                                          IInteger i_19 = ((IInteger)($elem130));
                                                                                          GuardedIValue guarded39 = $guarded_map_subscript(items_1.getValue(),((IConstructor)us_11));
                                                                                          items_1.setValue(((IMap)($amap_update(us_11,$amap_add_amap(((IMap)(($is_defined_value(guarded39) ? ((IMap)$get_defined_value(guarded39)) : fresh_2.getValue()))),((IMap)($buildMap(((IConstructor)($RVF.constructor(M_Grammar.Item_item_Production_int, new IValue[]{((IConstructor)p_9), ((IInteger)($aint_add_aint(((IInteger)i_19),((IInteger)$constants.get(9)/*1*/))))}))), ((ITuple)($me.sym2newitem(g_0.getValue(), ((IConstructor)($alist_subscript_int(((IList)($arg1_131)),((IInteger)i_19).intValue()))), ((IInteger)($aint_add_aint(((IInteger)i_19),((IInteger)$constants.get(9)/*1*/))))))))))), ((IMap)(items_1.getValue()))))));
                                                                                      
                                                                                      }
                                                                                      continue FOR38;
                                                                                                  
                                                                                  } while(false);
                                                                              /* void:  muCon([]) */break SWITCH30;// succeedSwitch
                                                                           }
                                                                        
                                                                        }
                                                                     
                                                                     }
                                                             
                                                                 } while(false);
                                                          
                                                          }
                                              
                                                      }
                                                      
                                              
                                                  case 25942208:
                                                      if(noCaseMatched_$switchVal123){
                                                          noCaseMatched_$switchVal123 = false;
                                                          if($isSubtypeOf($switchVal123.getType(),M_ParseTree.ADT_Symbol)){
                                                             /*muExists*/CASE_25942208_0: 
                                                                 do {
                                                                     if($has_type_and_arity($switchVal123, M_ParseTree.Symbol_iter_Symbol, 1)){
                                                                        IValue $arg0_125 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal123)),0));
                                                                        if($isComparable($arg0_125.getType(), M_ParseTree.ADT_Symbol)){
                                                                           IConstructor elem_12 = ((IConstructor)($arg0_125));
                                                                           GuardedIValue guarded32 = $guarded_map_subscript(items_1.getValue(),((IConstructor)us_11));
                                                                           items_1.setValue(((IMap)($amap_update(us_11,$amap_add_amap(((IMap)(($is_defined_value(guarded32) ? ((IMap)$get_defined_value(guarded32)) : fresh_2.getValue()))),((IMap)($buildMap(((IConstructor)($RVF.constructor(M_Grammar.Item_item_Production_int, new IValue[]{((IConstructor)p_9), ((IInteger)$constants.get(19)/*0*/)}))), ((ITuple)($me.sym2newitem(g_0.getValue(), ((IConstructor)($arg0_125)), ((IInteger)$constants.get(19)/*0*/)))))))), ((IMap)(items_1.getValue()))))));
                                                                           break SWITCH30;// succeedSwitch
                                                                        }
                                                                     
                                                                     }
                                                             
                                                                 } while(false);
                                                          
                                                          }
                                              
                                                      }
                                                      
                                              
                                                  case 882072:
                                                      if(noCaseMatched_$switchVal123){
                                                          noCaseMatched_$switchVal123 = false;
                                                          if($isSubtypeOf($switchVal123.getType(),M_ParseTree.ADT_Symbol)){
                                                             /*muExists*/CASE_882072_5: 
                                                                 do {
                                                                     if($has_type_and_arity($switchVal123, M_ParseTree.Symbol_opt_Symbol, 1)){
                                                                        IValue $arg0_135 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal123)),0));
                                                                        if($isComparable($arg0_135.getType(), M_ParseTree.ADT_Symbol)){
                                                                           IConstructor elem_22 = ((IConstructor)($arg0_135));
                                                                           GuardedIValue guarded42 = $guarded_map_subscript(items_1.getValue(),((IConstructor)us_11));
                                                                           items_1.setValue(((IMap)($amap_update(us_11,$amap_add_amap(((IMap)(($is_defined_value(guarded42) ? ((IMap)$get_defined_value(guarded42)) : fresh_2.getValue()))),((IMap)($buildMap(((IConstructor)($RVF.constructor(M_Grammar.Item_item_Production_int, new IValue[]{((IConstructor)p_9), ((IInteger)$constants.get(19)/*0*/)}))), ((ITuple)($me.sym2newitem(g_0.getValue(), ((IConstructor)($arg0_135)), ((IInteger)$constants.get(19)/*0*/)))))))), ((IMap)(items_1.getValue()))))));
                                                                           break SWITCH30;// succeedSwitch
                                                                        }
                                                                     
                                                                     }
                                                             
                                                                 } while(false);
                                                          
                                                          }
                                              
                                                      }
                                                      
                                              
                                                  case 910072:
                                                      if(noCaseMatched_$switchVal123){
                                                          noCaseMatched_$switchVal123 = false;
                                                          if($isSubtypeOf($switchVal123.getType(),M_ParseTree.ADT_Symbol)){
                                                             /*muExists*/CASE_910072_4: 
                                                                 do {
                                                                     if($has_type_and_arity($switchVal123, M_ParseTree.Symbol_seq_list_Symbol, 1)){
                                                                        IValue $arg0_134 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal123)),0));
                                                                        if($isComparable($arg0_134.getType(), $T6)){
                                                                           IList elems_20 = ((IList)($arg0_134));
                                                                           /*muExists*/FOR40: 
                                                                               do {
                                                                                   FOR40_GEN17499:
                                                                                   for(IValue $elem133_for : ((IList)(M_List.index(((IList)($arg0_134)))))){
                                                                                       IInteger $elem133 = (IInteger) $elem133_for;
                                                                                       IInteger i_21 = ((IInteger)($elem133));
                                                                                       GuardedIValue guarded41 = $guarded_map_subscript(items_1.getValue(),((IConstructor)us_11));
                                                                                       items_1.setValue(((IMap)($amap_update(us_11,$amap_add_amap(((IMap)(($is_defined_value(guarded41) ? ((IMap)$get_defined_value(guarded41)) : fresh_2.getValue()))),((IMap)($buildMap(((IConstructor)($RVF.constructor(M_Grammar.Item_item_Production_int, new IValue[]{((IConstructor)p_9), ((IInteger)($aint_add_aint(((IInteger)i_21),((IInteger)$constants.get(9)/*1*/))))}))), ((ITuple)($me.sym2newitem(g_0.getValue(), ((IConstructor)($alist_subscript_int(((IList)($arg0_134)),((IInteger)i_21).intValue()))), ((IInteger)($aint_add_aint(((IInteger)i_21),((IInteger)$constants.get(9)/*1*/))))))))))), ((IMap)(items_1.getValue()))))));
                                                                                   
                                                                                   }
                                                                                   continue FOR40;
                                                                                               
                                                                               } while(false);
                                                                           /* void:  muCon([]) */break SWITCH30;// succeedSwitch
                                                                        }
                                                                     
                                                                     }
                                                             
                                                                 } while(false);
                                                          
                                                          }
                                              
                                                      }
                                                      
                                              
                                                  case 826203960:
                                                      if(noCaseMatched_$switchVal123){
                                                          noCaseMatched_$switchVal123 = false;
                                                          if($isSubtypeOf($switchVal123.getType(),M_ParseTree.ADT_Symbol)){
                                                             /*muExists*/CASE_826203960_1: 
                                                                 do {
                                                                     if($has_type_and_arity($switchVal123, M_ParseTree.Symbol_iter_star_Symbol, 1)){
                                                                        IValue $arg0_126 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal123)),0));
                                                                        if($isComparable($arg0_126.getType(), M_ParseTree.ADT_Symbol)){
                                                                           IConstructor elem_13 = ((IConstructor)($arg0_126));
                                                                           GuardedIValue guarded33 = $guarded_map_subscript(items_1.getValue(),((IConstructor)us_11));
                                                                           items_1.setValue(((IMap)($amap_update(us_11,$amap_add_amap(((IMap)(($is_defined_value(guarded33) ? ((IMap)$get_defined_value(guarded33)) : fresh_2.getValue()))),((IMap)($buildMap(((IConstructor)($RVF.constructor(M_Grammar.Item_item_Production_int, new IValue[]{((IConstructor)p_9), ((IInteger)$constants.get(19)/*0*/)}))), ((ITuple)($me.sym2newitem(g_0.getValue(), ((IConstructor)($arg0_126)), ((IInteger)$constants.get(19)/*0*/)))))))), ((IMap)(items_1.getValue()))))));
                                                                           break SWITCH30;// succeedSwitch
                                                                        }
                                                                     
                                                                     }
                                                             
                                                                 } while(false);
                                                          
                                                          }
                                              
                                                      }
                                                      
                                              
                                                  case 773448:
                                                      if(noCaseMatched_$switchVal123){
                                                          noCaseMatched_$switchVal123 = false;
                                                          if($isSubtypeOf($switchVal123.getType(),M_ParseTree.ADT_Symbol)){
                                                             /*muExists*/CASE_773448_6: 
                                                                 do {
                                                                     if($has_type_and_arity($switchVal123, M_ParseTree.Symbol_alt_set_Symbol, 1)){
                                                                        IValue $arg0_137 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal123)),0));
                                                                        if($isComparable($arg0_137.getType(), $T0)){
                                                                           ISet alts_23 = ((ISet)($arg0_137));
                                                                           /*muExists*/FOR43: 
                                                                               do {
                                                                                   FOR43_GEN17781:
                                                                                   for(IValue $elem136_for : ((ISet)($arg0_137))){
                                                                                       IConstructor $elem136 = (IConstructor) $elem136_for;
                                                                                       IConstructor elem_24 = ((IConstructor)($elem136));
                                                                                       GuardedIValue guarded44 = $guarded_map_subscript(items_1.getValue(),((IConstructor)us_11));
                                                                                       items_1.setValue(((IMap)($amap_update(us_11,$amap_add_amap(((IMap)(($is_defined_value(guarded44) ? ((IMap)$get_defined_value(guarded44)) : fresh_2.getValue()))),((IMap)($buildMap(((IConstructor)($RVF.constructor(M_Grammar.Item_item_Production_int, new IValue[]{((IConstructor)p_9), ((IInteger)$constants.get(19)/*0*/)}))), ((ITuple)($me.sym2newitem(g_0.getValue(), ((IConstructor)elem_24), ((IInteger)$constants.get(19)/*0*/)))))))), ((IMap)(items_1.getValue()))))));
                                                                                   
                                                                                   }
                                                                                   continue FOR43;
                                                                                               
                                                                               } while(false);
                                                                           /* void:  muCon([]) */break SWITCH30;// succeedSwitch
                                                                        }
                                                                     
                                                                     }
                                                             
                                                                 } while(false);
                                                          
                                                          }
                                              
                                                      }
                                                      
                                              
                                                  case 1652184736:
                                                      if(noCaseMatched_$switchVal123){
                                                          noCaseMatched_$switchVal123 = false;
                                                          if($isSubtypeOf($switchVal123.getType(),M_ParseTree.ADT_Symbol)){
                                                             /*muExists*/CASE_1652184736_2: 
                                                                 do {
                                                                     if($has_type_and_arity($switchVal123, M_ParseTree.Symbol_iter_seps_Symbol_list_Symbol, 2)){
                                                                        IValue $arg0_129 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal123)),0));
                                                                        if($isComparable($arg0_129.getType(), M_ParseTree.ADT_Symbol)){
                                                                           IConstructor elem_14 = ((IConstructor)($arg0_129));
                                                                           IValue $arg1_128 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal123)),1));
                                                                           if($isComparable($arg1_128.getType(), $T6)){
                                                                              IList seps_15 = ((IList)($arg1_128));
                                                                              GuardedIValue guarded34 = $guarded_map_subscript(items_1.getValue(),((IConstructor)us_11));
                                                                              items_1.setValue(((IMap)($amap_update(us_11,$amap_add_amap(((IMap)(($is_defined_value(guarded34) ? ((IMap)$get_defined_value(guarded34)) : fresh_2.getValue()))),((IMap)($buildMap(((IConstructor)($RVF.constructor(M_Grammar.Item_item_Production_int, new IValue[]{((IConstructor)p_9), ((IInteger)$constants.get(19)/*0*/)}))), ((ITuple)($me.sym2newitem(g_0.getValue(), ((IConstructor)($arg0_129)), ((IInteger)$constants.get(19)/*0*/)))))))), ((IMap)(items_1.getValue()))))));
                                                                              /*muExists*/FOR35: 
                                                                                  do {
                                                                                      FOR35_GEN17029:
                                                                                      for(IValue $elem127_for : ((IList)(M_List.index(((IList)($arg1_128)))))){
                                                                                          IInteger $elem127 = (IInteger) $elem127_for;
                                                                                          IInteger i_16 = ((IInteger)($elem127));
                                                                                          GuardedIValue guarded36 = $guarded_map_subscript(items_1.getValue(),((IConstructor)us_11));
                                                                                          items_1.setValue(((IMap)($amap_update(us_11,$amap_add_amap(((IMap)(($is_defined_value(guarded36) ? ((IMap)$get_defined_value(guarded36)) : fresh_2.getValue()))),((IMap)($buildMap(((IConstructor)($RVF.constructor(M_Grammar.Item_item_Production_int, new IValue[]{((IConstructor)p_9), ((IInteger)($aint_add_aint(((IInteger)i_16),((IInteger)$constants.get(9)/*1*/))))}))), ((ITuple)($me.sym2newitem(g_0.getValue(), ((IConstructor)($alist_subscript_int(((IList)($arg1_128)),((IInteger)i_16).intValue()))), ((IInteger)($aint_add_aint(((IInteger)i_16),((IInteger)$constants.get(9)/*1*/))))))))))), ((IMap)(items_1.getValue()))))));
                                                                                      
                                                                                      }
                                                                                      continue FOR35;
                                                                                                  
                                                                                  } while(false);
                                                                              /* void:  muCon([]) */break SWITCH30;// succeedSwitch
                                                                           }
                                                                        
                                                                        }
                                                                     
                                                                     }
                                                             
                                                                 } while(false);
                                                          
                                                          }
                                              
                                                      }
                                                      
                                              
                                                  case 0:
                                                      if(noCaseMatched_$switchVal123){
                                                          noCaseMatched_$switchVal123 = false;
                                                          
                                                      }
                                                      
                                              
                                                  default: if($isSubtypeOf($switchVal123.getType(),M_ParseTree.ADT_Symbol)){
                                                              /*muExists*/CASE_0_7: 
                                                                  do {
                                                                      if($has_type_and_arity($switchVal123, M_ParseTree.Symbol_empty_, 0)){
                                                                         GuardedIValue guarded31 = $guarded_map_subscript(items_1.getValue(),((IConstructor)us_11));
                                                                         final Template $template124 = (Template)new Template($RVF, "new EpsilonStackNode<IConstructor>(");
                                                                         $template124.beginIndent("                                     ");
                                                                         $template124.addVal($getkw_Symbol_id(((IConstructor)($arg0_138))));
                                                                         $template124.endIndent("                                     ");
                                                                         $template124.addStr(", 0)");
                                                                         items_1.setValue(((IMap)($amap_update(us_11,$amap_add_amap(((IMap)(($is_defined_value(guarded31) ? ((IMap)$get_defined_value(guarded31)) : fresh_2.getValue()))),((IMap)($buildMap(((IConstructor)($RVF.constructor(M_Grammar.Item_item_Production_int, new IValue[]{((IConstructor)p_9), ((IInteger)$constants.get(24)/*-1*/)}))), ((ITuple)($RVF.tuple(((IString)($template124.close())), ((IInteger)($getkw_Symbol_id(((IConstructor)($arg0_138)))))))))))), ((IMap)(items_1.getValue()))))));
                                                                         break SWITCH30;// succeedSwitch
                                                                      }
                                                              
                                                                  } while(false);
                                                           
                                                           }
                                              
                                              }
                                              
                                                         $traversalState.setMatched(true); 
                                              break VISIT24;
                                           }
                                        
                                        }
                                
                                    } while(false);
                             
                             }
            
                     
                         case 110389984:
                             if($isSubtypeOf($VISIT24_subject.getType(),M_ParseTree.ADT_Production)){
                                /*muExists*/CASE_110389984_0: 
                                    do {
                                        if($has_type_and_arity($VISIT24_subject, M_ParseTree.Production_prod_Symbol_list_Symbol_set_Attr, 3)){
                                           IValue $arg0_117 = (IValue)($aadt_subscript_int(((IConstructor)($VISIT24_subject)),0));
                                           if($isComparable($arg0_117.getType(), M_ParseTree.ADT_Symbol)){
                                              IConstructor s_4 = ((IConstructor)($arg0_117));
                                              IValue $arg1_116 = (IValue)($aadt_subscript_int(((IConstructor)($VISIT24_subject)),1));
                                              if($isComparable($arg1_116.getType(), $T32)){
                                                 if($arg1_116.equals(((IList)$constants.get(31)/*[]*/))){
                                                   IValue $arg2_115 = (IValue)($aadt_subscript_int(((IConstructor)($VISIT24_subject)),2));
                                                   if($isComparable($arg2_115.getType(), $T1)){
                                                      IConstructor p_3 = ((IConstructor)($VISIT24_subject));
                                                      GuardedIValue guarded25 = $guarded_map_subscript(items_1.getValue(),((IConstructor)(getType(((IConstructor)($arg0_117))))));
                                                      final Template $template114 = (Template)new Template($RVF, "new EpsilonStackNode<IConstructor>(");
                                                      $template114.beginIndent("                                     ");
                                                      $template114.addVal($getkw_Symbol_id(((IConstructor)($arg0_117))));
                                                      $template114.endIndent("                                     ");
                                                      $template114.addStr(", 0)");
                                                      items_1.setValue(((IMap)($amap_update(getType(((IConstructor)($arg0_117))),$amap_add_amap(((IMap)(($is_defined_value(guarded25) ? ((IMap)$get_defined_value(guarded25)) : fresh_2.getValue()))),((IMap)($buildMap(((IConstructor)($RVF.constructor(M_Grammar.Item_item_Production_int, new IValue[]{((IConstructor)(generateNewItems_cl(((IConstructor)p_3)))), ((IInteger)$constants.get(24)/*-1*/)}))), ((ITuple)($RVF.tuple(((IString)($template114.close())), ((IInteger)($getkw_Symbol_id(((IConstructor)($arg0_117)))))))))))), ((IMap)(items_1.getValue()))))));
                                                      $traversalState.setMatched(true); 
                                                      break VISIT24;
                                                   }
                                                 
                                                 }
                                              
                                              }
                                           
                                           }
                                        
                                        }
                                
                                    } while(false);
                             
                             }
                             if($isSubtypeOf($VISIT24_subject.getType(),M_ParseTree.ADT_Production)){
                                /*muExists*/CASE_110389984_1: 
                                    do {
                                        if($has_type_and_arity($VISIT24_subject, M_ParseTree.Production_prod_Symbol_list_Symbol_set_Attr, 3)){
                                           IValue $arg0_121 = (IValue)($aadt_subscript_int(((IConstructor)($VISIT24_subject)),0));
                                           if($isComparable($arg0_121.getType(), M_ParseTree.ADT_Symbol)){
                                              IConstructor s_6 = ((IConstructor)($arg0_121));
                                              IValue $arg1_120 = (IValue)($aadt_subscript_int(((IConstructor)($VISIT24_subject)),1));
                                              if($isComparable($arg1_120.getType(), $T6)){
                                                 IList lhs_7 = ((IList)($arg1_120));
                                                 IValue $arg2_119 = (IValue)($aadt_subscript_int(((IConstructor)($VISIT24_subject)),2));
                                                 if($isComparable($arg2_119.getType(), $T1)){
                                                    IConstructor p_5 = ((IConstructor)($VISIT24_subject));
                                                    /*muExists*/FOR26: 
                                                        do {
                                                            FOR26_GEN16207:
                                                            for(IValue $elem118_for : ((IList)(M_List.index(((IList)($arg1_120)))))){
                                                                IInteger $elem118 = (IInteger) $elem118_for;
                                                                IInteger i_8 = ((IInteger)($elem118));
                                                                GuardedIValue guarded27 = $guarded_map_subscript(items_1.getValue(),((IConstructor)(getType(((IConstructor)($arg0_121))))));
                                                                items_1.setValue(((IMap)($amap_update(getType(((IConstructor)($arg0_121))),$amap_add_amap(((IMap)(($is_defined_value(guarded27) ? ((IMap)$get_defined_value(guarded27)) : fresh_2.getValue()))),((IMap)($buildMap(((IConstructor)($RVF.constructor(M_Grammar.Item_item_Production_int, new IValue[]{((IConstructor)(generateNewItems_cl(((IConstructor)p_5)))), ((IInteger)i_8)}))), ((ITuple)($me.sym2newitem(g_0.getValue(), ((IConstructor)($alist_subscript_int(((IList)($arg1_120)),((IInteger)i_8).intValue()))), ((IInteger)i_8)))))))), ((IMap)(items_1.getValue()))))));
                                                            
                                                            }
                                                            continue FOR26;
                                                                        
                                                        } while(false);
                                                    /* void:  muCon([]) */$traversalState.setMatched(true); 
                                                    break VISIT24;
                                                 }
                                              
                                              }
                                           
                                           }
                                        
                                        }
                                
                                    } while(false);
                             
                             }
            
                     
                     
                     }
                     return $VISIT24_subject;
                 });return items_1.getValue();
        
        } catch (ReturnFromTraversalException e) {
            return (IMap) e.getValue();
        }
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(18073,173,<387,0>,<394,1>) 
    public IString split$ece1419fbe2db44f(IString x_0){ 
        
        
        if((((IBool)($aint_lessequal_aint(((IInteger)(M_String.size(((IString)x_0)))),((IInteger)$constants.get(32)/*20000*/))))).getValue()){
           final Template $template140 = (Template)new Template($RVF, "\"");
           $template140.beginIndent("  ");
           $template140.addStr(((IString)($me.esc(((IString)x_0)))).getValue());
           $template140.endIndent("  ");
           $template140.addStr("\"");
           return ((IString)($template140.close()));
        
        } else {
           final Template $template139 = (Template)new Template($RVF, "");
           $template139.addStr(((IString)($me.split(((IString)(M_String.substring(((IString)x_0), ((IInteger)$constants.get(19)/*0*/), ((IInteger)$constants.get(33)/*10000*/))))))).getValue());
           $template139.addStr(", ");
           $template139.beginIndent("  ");
           $template139.addStr(((IString)($me.split(((IString)(M_String.substring(((IString)x_0), ((IInteger)$constants.get(33)/*10000*/))))))).getValue());
           $template139.endIndent("  ");
           return ((IString)($template139.close()));
        
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(18250,954,<396,0>,<420,1>) 
    public IBool isNonterminal$1aa1d0660f35932e(IConstructor s_0){ 
        
        
        final IConstructor $switchVal141 = ((IConstructor)s_0);
        boolean noCaseMatched_$switchVal141 = true;
        SWITCH46: switch(Fingerprint.getFingerprint($switchVal141)){
        
            case 1643638592:
                if(noCaseMatched_$switchVal141){
                    noCaseMatched_$switchVal141 = false;
                    if($isSubtypeOf($switchVal141.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_1643638592_0: 
                           do {
                               if($has_type_and_arity($switchVal141, M_Type.Symbol_label_str_Symbol, 2)){
                                  IValue $arg0_143 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal141)),0));
                                  if($isComparable($arg0_143.getType(), $T1)){
                                     IValue $arg1_142 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal141)),1));
                                     if($isComparable($arg1_142.getType(), M_ParseTree.ADT_Symbol)){
                                        IConstructor x_1 = ((IConstructor)($arg1_142));
                                        return ((IBool)($me.isNonterminal(((IConstructor)($arg1_142)))));
                                     
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case -964239440:
                if(noCaseMatched_$switchVal141){
                    noCaseMatched_$switchVal141 = false;
                    if($isSubtypeOf($switchVal141.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_964239440_11: 
                           do {
                               if($has_type_and_arity($switchVal141, M_ParseTree.Symbol_iter_star_seps_Symbol_list_Symbol, 2)){
                                  IValue $arg0_158 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal141)),0));
                                  if($isComparable($arg0_158.getType(), $T1)){
                                     IValue $arg1_157 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal141)),1));
                                     if($isComparable($arg1_157.getType(), $T1)){
                                        return ((IBool)$constants.get(15)/*true*/);
                                     
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 1444258592:
                if(noCaseMatched_$switchVal141){
                    noCaseMatched_$switchVal141 = false;
                    if($isSubtypeOf($switchVal141.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_1444258592_4: 
                           do {
                               if($has_type_and_arity($switchVal141, M_ParseTree.Symbol_parameterized_sort_str_list_Symbol, 2)){
                                  IValue $arg0_148 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal141)),0));
                                  if($isComparable($arg0_148.getType(), $T1)){
                                     IValue $arg1_147 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal141)),1));
                                     if($isComparable($arg1_147.getType(), $T1)){
                                        return ((IBool)$constants.get(15)/*true*/);
                                     
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case -109773488:
                if(noCaseMatched_$switchVal141){
                    noCaseMatched_$switchVal141 = false;
                    if($isSubtypeOf($switchVal141.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_109773488_3: 
                           do {
                               if($has_type_and_arity($switchVal141, M_ParseTree.Symbol_keywords_str, 1)){
                                  IValue $arg0_146 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal141)),0));
                                  if($isComparable($arg0_146.getType(), $T1)){
                                     return ((IBool)$constants.get(15)/*true*/);
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 856312:
                if(noCaseMatched_$switchVal141){
                    noCaseMatched_$switchVal141 = false;
                    if($isSubtypeOf($switchVal141.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_856312_2: 
                           do {
                               if($has_type_and_arity($switchVal141, M_ParseTree.Symbol_lex_str, 1)){
                                  IValue $arg0_145 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal141)),0));
                                  if($isComparable($arg0_145.getType(), $T1)){
                                     return ((IBool)$constants.get(15)/*true*/);
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 1154855088:
                if(noCaseMatched_$switchVal141){
                    noCaseMatched_$switchVal141 = false;
                    if($isSubtypeOf($switchVal141.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_1154855088_5: 
                           do {
                               if($has_type_and_arity($switchVal141, M_ParseTree.Symbol_parameterized_lex_str_list_Symbol, 2)){
                                  IValue $arg0_150 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal141)),0));
                                  if($isComparable($arg0_150.getType(), $T1)){
                                     IValue $arg1_149 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal141)),1));
                                     if($isComparable($arg1_149.getType(), $T1)){
                                        return ((IBool)$constants.get(15)/*true*/);
                                     
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 910072:
                if(noCaseMatched_$switchVal141){
                    noCaseMatched_$switchVal141 = false;
                    if($isSubtypeOf($switchVal141.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_910072_12: 
                           do {
                               if($has_type_and_arity($switchVal141, M_ParseTree.Symbol_seq_list_Symbol, 1)){
                                  IValue $arg0_159 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal141)),0));
                                  if($isComparable($arg0_159.getType(), $T1)){
                                     return ((IBool)$constants.get(15)/*true*/);
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 826203960:
                if(noCaseMatched_$switchVal141){
                    noCaseMatched_$switchVal141 = false;
                    if($isSubtypeOf($switchVal141.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_826203960_9: 
                           do {
                               if($has_type_and_arity($switchVal141, M_ParseTree.Symbol_iter_star_Symbol, 1)){
                                  IValue $arg0_154 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal141)),0));
                                  if($isComparable($arg0_154.getType(), $T1)){
                                     return ((IBool)$constants.get(15)/*true*/);
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 773448:
                if(noCaseMatched_$switchVal141){
                    noCaseMatched_$switchVal141 = false;
                    if($isSubtypeOf($switchVal141.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_773448_14: 
                           do {
                               if($has_type_and_arity($switchVal141, M_ParseTree.Symbol_alt_set_Symbol, 1)){
                                  IValue $arg0_161 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal141)),0));
                                  if($isComparable($arg0_161.getType(), $T1)){
                                     return ((IBool)$constants.get(15)/*true*/);
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 1652184736:
                if(noCaseMatched_$switchVal141){
                    noCaseMatched_$switchVal141 = false;
                    if($isSubtypeOf($switchVal141.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_1652184736_10: 
                           do {
                               if($has_type_and_arity($switchVal141, M_ParseTree.Symbol_iter_seps_Symbol_list_Symbol, 2)){
                                  IValue $arg0_156 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal141)),0));
                                  if($isComparable($arg0_156.getType(), $T1)){
                                     IValue $arg1_155 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal141)),1));
                                     if($isComparable($arg1_155.getType(), $T1)){
                                        return ((IBool)$constants.get(15)/*true*/);
                                     
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case -333228984:
                if(noCaseMatched_$switchVal141){
                    noCaseMatched_$switchVal141 = false;
                    if($isSubtypeOf($switchVal141.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_333228984_7: 
                           do {
                               if($has_type_and_arity($switchVal141, M_ParseTree.Symbol_layouts_str, 1)){
                                  IValue $arg0_152 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal141)),0));
                                  if($isComparable($arg0_152.getType(), $T1)){
                                     return ((IBool)$constants.get(15)/*true*/);
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 0:
                if(noCaseMatched_$switchVal141){
                    noCaseMatched_$switchVal141 = false;
                    
                }
                
        
            case 25942208:
                if(noCaseMatched_$switchVal141){
                    noCaseMatched_$switchVal141 = false;
                    if($isSubtypeOf($switchVal141.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_25942208_8: 
                           do {
                               if($has_type_and_arity($switchVal141, M_ParseTree.Symbol_iter_Symbol, 1)){
                                  IValue $arg0_153 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal141)),0));
                                  if($isComparable($arg0_153.getType(), $T1)){
                                     return ((IBool)$constants.get(15)/*true*/);
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 878060304:
                if(noCaseMatched_$switchVal141){
                    noCaseMatched_$switchVal141 = false;
                    if($isSubtypeOf($switchVal141.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_878060304_6: 
                           do {
                               if($has_type_and_arity($switchVal141, M_ParseTree.Symbol_start_Symbol, 1)){
                                  IValue $arg0_151 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal141)),0));
                                  if($isComparable($arg0_151.getType(), $T1)){
                                     return ((IBool)$constants.get(15)/*true*/);
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 882072:
                if(noCaseMatched_$switchVal141){
                    noCaseMatched_$switchVal141 = false;
                    if($isSubtypeOf($switchVal141.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_882072_13: 
                           do {
                               if($has_type_and_arity($switchVal141, M_ParseTree.Symbol_opt_Symbol, 1)){
                                  IValue $arg0_160 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal141)),0));
                                  if($isComparable($arg0_160.getType(), $T1)){
                                     return ((IBool)$constants.get(15)/*true*/);
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 28290288:
                if(noCaseMatched_$switchVal141){
                    noCaseMatched_$switchVal141 = false;
                    if($isSubtypeOf($switchVal141.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_28290288_1: 
                           do {
                               if($has_type_and_arity($switchVal141, M_ParseTree.Symbol_sort_str, 1)){
                                  IValue $arg0_144 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal141)),0));
                                  if($isComparable($arg0_144.getType(), $T1)){
                                     return ((IBool)$constants.get(15)/*true*/);
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            default: if($isSubtypeOf($switchVal141.getType(),M_ParseTree.ADT_Symbol)){
                        /*muExists*/CASE_0_15: 
                            do {
                                if($has_type_and_arity($switchVal141, M_ParseTree.Symbol_empty_, 0)){
                                   return ((IBool)$constants.get(15)/*true*/);
                                
                                }
                        
                            } while(false);
                     
                     }
                     return ((IBool)$constants.get(0)/*false*/);
        
        }
        
                   
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(19208,242,<422,0>,<425,13>) 
    public IString generateParseMethod$8d37d926b7bd824c(IConstructor g_0, IMap $__1, IConstructor p_1, IInteger $__3){ 
        
        
        final Template $template162 = (Template)new Template($RVF, "public AbstractStackNode<IConstructor>[] ");
        $template162.beginIndent("                                           ");
        $template162.addStr(((IString)(getParserMethodName(((IConstructor)(((IConstructor)($aadt_get_field(((IConstructor)p_1), "def"))))), Util.kwpMap()))).getValue());
        $template162.endIndent("                                           ");
        $template162.addStr("() {\r\n    return ");
        $template162.beginIndent("           ");
        $template162.addStr(((IString)(getParserMethodName(((IConstructor)(((IConstructor)($aadt_get_field(((IConstructor)p_1), "def"))))), Util.kwpMap()))).getValue());
        $template162.endIndent("           ");
        $template162.addStr(".EXPECTS;\r\n}");
        return ((IString)($template162.close()));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(19908,488,<438,0>,<450,1>) 
    public IString generateClassConditional$1e75b8a58a3508ef(ISet classes_0){ 
        
        
        if((((IBool)($RVF.bool(((ISet)classes_0).contains(((IConstructor)($RVF.constructor(M_lang_rascal_grammar_Lookahead.Symbol_eoi_, new IValue[]{}, Util.kwpMap())))))))).getValue()){
           IString $reducer174 = (IString)(((IString)$constants.get(34)/*"lookAheadChar == 0"*/));
           /*muExists*/$REDUCER173_GEN20091_CONS_char_class: 
               do {
                   $REDUCER173_GEN20091:
                   for(IValue $elem177_for : ((ISet)classes_0)){
                       IConstructor $elem177 = (IConstructor) $elem177_for;
                       if($has_type_and_arity($elem177, M_ParseTree.Symbol_char_class_list_CharRange, 1)){
                          IValue $arg0_178 = (IValue)($aadt_subscript_int(((IConstructor)($elem177)),0));
                          if($isComparable($arg0_178.getType(), $T11)){
                             if(true){
                                IList ranges_2 = ((IList)($arg0_178));
                                $REDUCER173_GEN20091_CONS_char_class_GEN20139:
                                for(IValue $elem176_for : ((IList)($arg0_178))){
                                    IConstructor $elem176 = (IConstructor) $elem176_for;
                                    IConstructor r_3 = ((IConstructor)($elem176));
                                    final Template $template175 = (Template)new Template($RVF, " || ");
                                    $template175.beginIndent("    ");
                                    $template175.addStr(((IString)($me.generateRangeConditional(((IConstructor)r_3)))).getValue());
                                    $template175.endIndent("    ");
                                    $reducer174 = ((IString)($astr_add_astr(((IString)($reducer174)),((IString)($template175.close())))));
                                
                                }
                                continue $REDUCER173_GEN20091;
                                            
                             } else {
                                continue $REDUCER173_GEN20091;
                             }
                          } else {
                             continue $REDUCER173_GEN20091;
                          }
                       } else {
                          continue $REDUCER173_GEN20091;
                       }
                   }
                   
                               
               } while(false);
           return ((IString)($reducer174));
        
        } else {
           final IListWriter $listwriter163 = (IListWriter)$RVF.listWriter();
           /*muExists*/$LCOMP164_GEN20187_CONS_char_class: 
               do {
                   $LCOMP164_GEN20187:
                   for(IValue $elem166_for : ((ISet)classes_0)){
                       IConstructor $elem166 = (IConstructor) $elem166_for;
                       if($has_type_and_arity($elem166, M_ParseTree.Symbol_char_class_list_CharRange, 1)){
                          IValue $arg0_167 = (IValue)($aadt_subscript_int(((IConstructor)($elem166)),0));
                          if($isComparable($arg0_167.getType(), $T11)){
                             if(true){
                                IList ranges_5 = null;
                                $LCOMP164_GEN20187_CONS_char_class_GEN20235:
                                for(IValue $elem165_for : ((IList)($arg0_167))){
                                    IConstructor $elem165 = (IConstructor) $elem165_for;
                                    IConstructor r_6 = null;
                                    $listwriter163.append($elem165);
                                
                                }
                                continue $LCOMP164_GEN20187;
                                            
                             } else {
                                continue $LCOMP164_GEN20187;
                             }
                          } else {
                             continue $LCOMP164_GEN20187;
                          }
                       } else {
                          continue $LCOMP164_GEN20187;
                       }
                   }
                   
                               
               } while(false);
           IList ranges_4 = ((IList)($listwriter163.done()));
           final Template $template170 = (Template)new Template($RVF, "");
           $template170.addStr(((IString)($me.generateRangeConditional(((IConstructor)(M_List.head(((IList)ranges_4))))))).getValue());
           IString $reducer169 = (IString)($template170.close());
           $REDUCER168_GEN20368:
           for(IValue $elem172_for : ((IList)(M_List.tail(((IList)ranges_4))))){
               IConstructor $elem172 = (IConstructor) $elem172_for;
               IConstructor r_8 = ((IConstructor)($elem172));
               final Template $template171 = (Template)new Template($RVF, " || ");
               $template171.beginIndent("    ");
               $template171.addStr(((IString)($me.generateRangeConditional(((IConstructor)r_8)))).getValue());
               $template171.endIndent("    ");
               $template171.addStr(" ");
               $reducer169 = ((IString)($astr_add_astr(((IString)($reducer169)),((IString)($template171.close())))));
           
           }
           
                       return ((IString)($reducer169));
        
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(20400,322,<452,0>,<459,1>) 
    public IString generateRangeConditional$a8c4f8bb4018d1e7(IConstructor r_0){ 
        
        
        final IConstructor $switchVal179 = ((IConstructor)r_0);
        boolean noCaseMatched_$switchVal179 = true;
        SWITCH48: switch(Fingerprint.getFingerprint($switchVal179)){
        
            case 1732482000:
                if(noCaseMatched_$switchVal179){
                    noCaseMatched_$switchVal179 = false;
                    if($isSubtypeOf($switchVal179.getType(),M_ParseTree.ADT_CharRange)){
                       /*muExists*/CASE_1732482000_0: 
                           do {
                               if($has_type_and_arity($switchVal179, M_ParseTree.CharRange_range_int_int, 2)){
                                  IValue $arg0_182 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal179)),0));
                                  if($isComparable($arg0_182.getType(), $T7)){
                                     if(((IInteger)$constants.get(19)/*0*/).equals($arg0_182)){
                                        IValue $arg1_181 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal179)),1));
                                        if($isComparable($arg1_181.getType(), $T7)){
                                           if(((IInteger)$constants.get(35)/*1048575*/).equals($arg1_181)){
                                              return ((IString)$constants.get(36)/*"(true /*every char*\/)"*/);
                                           
                                           }
                                        
                                        }
                                     
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
                    if($isSubtypeOf($switchVal179.getType(),M_ParseTree.ADT_CharRange)){
                       /*muExists*/CASE_1732482000_1: 
                           do {
                               if($has_type_and_arity($switchVal179, M_ParseTree.CharRange_range_int_int, 2)){
                                  IValue $arg0_185 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal179)),0));
                                  if($isComparable($arg0_185.getType(), $T7)){
                                     IInteger i_1 = null;
                                     IValue $arg1_184 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal179)),1));
                                     if($isComparable($arg1_184.getType(), $T7)){
                                        if(($arg0_185 != null)){
                                           if($arg0_185.match($arg1_184)){
                                              final Template $template183 = (Template)new Template($RVF, "(lookAheadChar == ");
                                              $template183.beginIndent("                  ");
                                              $template183.addVal($arg1_184);
                                              $template183.endIndent("                  ");
                                              $template183.addStr(")");
                                              return ((IString)($template183.close()));
                                           
                                           }
                                        
                                        } else {
                                           $arg0_185 = ((IValue)($arg1_184));
                                           final Template $template183 = (Template)new Template($RVF, "(lookAheadChar == ");
                                           $template183.beginIndent("                  ");
                                           $template183.addVal($arg1_184);
                                           $template183.endIndent("                  ");
                                           $template183.addStr(")");
                                           return ((IString)($template183.close()));
                                        
                                        }
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
                    if($isSubtypeOf($switchVal179.getType(),M_ParseTree.ADT_CharRange)){
                       /*muExists*/CASE_1732482000_2: 
                           do {
                               if($has_type_and_arity($switchVal179, M_ParseTree.CharRange_range_int_int, 2)){
                                  IValue $arg0_188 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal179)),0));
                                  if($isComparable($arg0_188.getType(), $T7)){
                                     IInteger i_2 = null;
                                     IValue $arg1_187 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal179)),1));
                                     if($isComparable($arg1_187.getType(), $T7)){
                                        IInteger j_3 = null;
                                        final Template $template186 = (Template)new Template($RVF, "((lookAheadChar >= ");
                                        $template186.beginIndent("                    ");
                                        $template186.addVal($arg0_188);
                                        $template186.endIndent("                    ");
                                        $template186.addStr(") && (lookAheadChar <= ");
                                        $template186.beginIndent("                        ");
                                        $template186.addVal($arg1_187);
                                        $template186.endIndent("                        ");
                                        $template186.addStr("))");
                                        return ((IString)($template186.close()));
                                     
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            default: final Template $template180 = (Template)new Template($RVF, "unexpected range type: ");
                     $template180.beginIndent("                       ");
                     $template180.addVal(r_0);
                     $template180.endIndent("                       ");
                      
                     throw new Throw($template180.close());
        }
        
                   
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(20726,263,<461,0>,<467,1>) 
    public IString generateSeparatorExpects$348a8e745e2a6f1d(IConstructor grammar_0, IList seps_1){ 
        
        
        if((((IBool)($equal(((IList)seps_1), ((IList)$constants.get(31)/*[]*/))))).getValue()){
           return ((IString)$constants.get(37)/*""*/);
        
        }
        IString $reducer190 = (IString)($atuple_field_project((ITuple)((ITuple)($me.sym2newitem(((IConstructor)grammar_0), ((IConstructor)(M_List.head(((IList)seps_1)))), ((IInteger)$constants.get(9)/*1*/)))), ((IInteger)$constants.get(19)/*0*/)));
        $REDUCER189_GEN20958:
        for(IValue $elem192_for : ((IList)(M_List.index(((IList)(M_List.tail(((IList)seps_1)))))))){
            IInteger $elem192 = (IInteger) $elem192_for;
            IInteger i_3 = ((IInteger)($elem192));
            final Template $template191 = (Template)new Template($RVF, ", ");
            $template191.beginIndent("  ");
            $template191.addStr(((IString)($atuple_field_project((ITuple)((ITuple)($me.sym2newitem(((IConstructor)grammar_0), ((IConstructor)($alist_subscript_int(((IList)seps_1),((IInteger)($aint_add_aint(((IInteger)i_3),((IInteger)$constants.get(9)/*1*/)))).intValue()))), ((IInteger)($aint_add_aint(((IInteger)i_3),((IInteger)$constants.get(38)/*2*/))))))), ((IInteger)$constants.get(19)/*0*/)))).getValue());
            $template191.endIndent("  ");
            $reducer190 = ((IString)($astr_add_astr(((IString)($reducer190)),((IString)($template191.close())))));
        
        }
        
                    return ((IString)($reducer190));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(20993,262,<469,0>,<475,1>) 
    public IString generateSequenceExpects$5cf90c98a6d50ab4(IConstructor grammar_0, IList seps_1){ 
        
        
        if((((IBool)($equal(((IList)seps_1), ((IList)$constants.get(31)/*[]*/))))).getValue()){
           return ((IString)$constants.get(37)/*""*/);
        
        }
        IString $reducer194 = (IString)($atuple_field_project((ITuple)((ITuple)($me.sym2newitem(((IConstructor)grammar_0), ((IConstructor)(M_List.head(((IList)seps_1)))), ((IInteger)$constants.get(19)/*0*/)))), ((IInteger)$constants.get(19)/*0*/)));
        $REDUCER193_GEN21224:
        for(IValue $elem196_for : ((IList)(M_List.index(((IList)(M_List.tail(((IList)seps_1)))))))){
            IInteger $elem196 = (IInteger) $elem196_for;
            IInteger i_3 = ((IInteger)($elem196));
            final Template $template195 = (Template)new Template($RVF, ", ");
            $template195.beginIndent("  ");
            $template195.addStr(((IString)($atuple_field_project((ITuple)((ITuple)($me.sym2newitem(((IConstructor)grammar_0), ((IConstructor)($alist_subscript_int(((IList)seps_1),((IInteger)($aint_add_aint(((IInteger)i_3),((IInteger)$constants.get(9)/*1*/)))).intValue()))), ((IInteger)($aint_add_aint(((IInteger)i_3),((IInteger)$constants.get(9)/*1*/))))))), ((IInteger)$constants.get(19)/*0*/)))).getValue());
            $template195.endIndent("  ");
            $reducer194 = ((IString)($astr_add_astr(((IString)($reducer194)),((IString)($template195.close())))));
        
        }
        
                    return ((IString)($reducer194));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(21259,255,<477,0>,<483,1>) 
    public IString generateAltExpects$e6227e38151afc89(IConstructor grammar_0, IList seps_1){ 
        
        
        if((((IBool)($equal(((IList)seps_1), ((IList)$constants.get(31)/*[]*/))))).getValue()){
           return ((IString)$constants.get(37)/*""*/);
        
        }
        IString $reducer198 = (IString)($atuple_field_project((ITuple)((ITuple)($me.sym2newitem(((IConstructor)grammar_0), ((IConstructor)(M_List.head(((IList)seps_1)))), ((IInteger)$constants.get(19)/*0*/)))), ((IInteger)$constants.get(19)/*0*/)));
        $REDUCER197_GEN21483:
        for(IValue $elem200_for : ((IList)(M_List.index(((IList)(M_List.tail(((IList)seps_1)))))))){
            IInteger $elem200 = (IInteger) $elem200_for;
            IInteger i_3 = ((IInteger)($elem200));
            final Template $template199 = (Template)new Template($RVF, ", ");
            $template199.beginIndent("  ");
            $template199.addStr(((IString)($atuple_field_project((ITuple)((ITuple)($me.sym2newitem(((IConstructor)grammar_0), ((IConstructor)($alist_subscript_int(((IList)seps_1),((IInteger)($aint_add_aint(((IInteger)i_3),((IInteger)$constants.get(9)/*1*/)))).intValue()))), ((IInteger)$constants.get(19)/*0*/)))), ((IInteger)$constants.get(19)/*0*/)))).getValue());
            $template199.endIndent("  ");
            $reducer198 = ((IString)($astr_add_astr(((IString)($reducer198)),((IString)($template199.close())))));
        
        }
        
                    return ((IString)($reducer198));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(21518,275,<485,0>,<497,1>) 
    public IString literals2ints$28647a5174382a6f(IList chars_0){ 
        
        
        if((((IBool)($equal(((IList)chars_0), ((IList)$constants.get(31)/*[]*/))))).getValue()){
           return ((IString)$constants.get(37)/*""*/);
        
        }
        final Template $template201 = (Template)new Template($RVF, "");
        $template201.addVal(((IInteger)($aadt_get_field(((IConstructor)(M_List.head(((IList)(((IList)($aadt_get_field(((IConstructor)(M_List.head(((IList)chars_0)))), "ranges")))))))), "begin"))));
        IString result_1 = ((IString)($template201.close()));
        /*muExists*/FOR53: 
            do {
                FOR53_GEN21690:
                for(IValue $elem203_for : ((IList)(M_List.tail(((IList)chars_0))))){
                    IConstructor $elem203 = (IConstructor) $elem203_for;
                    IConstructor ch_2 = null;
                    final Template $template202 = (Template)new Template($RVF, ",");
                    $template202.beginIndent(" ");
                    $template202.addVal(((IInteger)($aadt_get_field(((IConstructor)(M_List.head(((IList)(((IList)($aadt_get_field(((IConstructor)($elem203)), "ranges")))))))), "begin"))));
                    $template202.endIndent(" ");
                    result_1 = ((IString)($astr_add_astr(((IString)result_1),((IString)($template202.close())))));
                
                }
                continue FOR53;
                            
            } while(false);
        /* void:  muCon([]) */return ((IString)result_1);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(21797,457,<499,0>,<516,1>) 
    public IString ciliterals2ints$cd6f75d2160c05dd(IList chars_0){ 
        
        
        if((((IBool)($equal(((IList)chars_0), ((IList)$constants.get(31)/*[]*/))))).getValue()){
           return ((IString)$constants.get(37)/*""*/);
        
        }
        IString result_1 = ((IString)$constants.get(37)/*""*/);
        /*muExists*/FOR55: 
            do {
                /*muExists*/FOR55_GEN21927_CONS_char_class: 
                    do {
                        FOR55_GEN21927:
                        for(IValue $elem218_for : ((IList)chars_0)){
                            IConstructor $elem218 = (IConstructor) $elem218_for;
                            if($has_type_and_arity($elem218, M_ParseTree.Symbol_char_class_list_CharRange, 1)){
                               IValue $arg0_219 = (IValue)($aadt_subscript_int(((IConstructor)($elem218)),0));
                               if($isComparable($arg0_219.getType(), $T11)){
                                  IList ranges_2 = null;
                                  final IList $switchVal204 = ((IList)($arg0_219));
                                  boolean noCaseMatched_$switchVal204 = true;
                                  SWITCH56: switch(Fingerprint.getFingerprint($switchVal204)){
                                  
                                      case 3322014:
                                          if(noCaseMatched_$switchVal204){
                                              noCaseMatched_$switchVal204 = false;
                                              if($isSubtypeOf($switchVal204.getType(),$T11)){
                                                 /*muExists*/CASE_3322014_0: 
                                                     do {
                                                         final IList $subject206 = ((IList)($switchVal204));
                                                         int $subject206_cursor = 0;
                                                         if($isSubtypeOf($subject206.getType(),$T11)){
                                                            final int $subject206_len = (int)((IList)($subject206)).length();
                                                            if($subject206_len == 1){
                                                               final IConstructor $subject207 = ((IConstructor)($alist_subscript_int(((IList)($subject206)),$subject206_cursor)));
                                                               if($has_type_and_arity($subject207, M_ParseTree.CharRange_range_int_int, 2)){
                                                                  IValue $arg0_209 = (IValue)($aadt_subscript_int(((IConstructor)($subject207)),0));
                                                                  if($isComparable($arg0_209.getType(), $T7)){
                                                                     IInteger i_3 = null;
                                                                     IValue $arg1_208 = (IValue)($aadt_subscript_int(((IConstructor)($subject207)),1));
                                                                     if($isComparable($arg1_208.getType(), $T7)){
                                                                        IInteger j_4 = null;
                                                                        $subject206_cursor += 1;
                                                                        if($subject206_cursor == $subject206_len){
                                                                           final Template $template205 = (Template)new Template($RVF, "{");
                                                                           $template205.beginIndent(" ");
                                                                           $template205.addVal($arg0_209);
                                                                           $template205.endIndent(" ");
                                                                           $template205.addStr(", ");
                                                                           $template205.beginIndent("  ");
                                                                           $template205.addVal($arg1_208);
                                                                           $template205.endIndent("  ");
                                                                           $template205.addStr("},");
                                                                           result_1 = ((IString)($astr_add_astr(((IString)result_1),((IString)($template205.close())))));
                                                                           break SWITCH56;// succeedSwitch
                                                                        } else {
                                                                           continue CASE_3322014_0;/*list match1*/
                                                                        }
                                                                     }
                                                                  
                                                                  }
                                                               
                                                               }
                                                            
                                                            }
                                                         
                                                         }
                                                 
                                                     } while(false);
                                              
                                              }
                                              if($isSubtypeOf($switchVal204.getType(),$T11)){
                                                 /*muExists*/CASE_3322014_1: 
                                                     do {
                                                         final IList $subject211 = ((IList)($switchVal204));
                                                         int $subject211_cursor = 0;
                                                         if($isSubtypeOf($subject211.getType(),$T11)){
                                                            final int $subject211_len = (int)((IList)($subject211)).length();
                                                            if($subject211_len == 2){
                                                               final IConstructor $subject215 = ((IConstructor)($alist_subscript_int(((IList)($subject211)),$subject211_cursor)));
                                                               if($has_type_and_arity($subject215, M_ParseTree.CharRange_range_int_int, 2)){
                                                                  IValue $arg0_217 = (IValue)($aadt_subscript_int(((IConstructor)($subject215)),0));
                                                                  if($isComparable($arg0_217.getType(), $T7)){
                                                                     IInteger i_5 = null;
                                                                     IValue $arg1_216 = (IValue)($aadt_subscript_int(((IConstructor)($subject215)),1));
                                                                     if($isComparable($arg1_216.getType(), $T7)){
                                                                        if(($arg0_217 != null)){
                                                                           if($arg0_217.match($arg1_216)){
                                                                              $subject211_cursor += 1;
                                                                              final IConstructor $subject212 = ((IConstructor)($alist_subscript_int(((IList)($subject211)),$subject211_cursor)));
                                                                              if($has_type_and_arity($subject212, M_ParseTree.CharRange_range_int_int, 2)){
                                                                                 IValue $arg0_214 = (IValue)($aadt_subscript_int(((IConstructor)($subject212)),0));
                                                                                 if($isComparable($arg0_214.getType(), $T7)){
                                                                                    IInteger j_6 = null;
                                                                                    IValue $arg1_213 = (IValue)($aadt_subscript_int(((IConstructor)($subject212)),1));
                                                                                    if($isComparable($arg1_213.getType(), $T7)){
                                                                                       if(($arg0_214 != null)){
                                                                                          if($arg0_214.match($arg1_213)){
                                                                                             $subject211_cursor += 1;
                                                                                             if($subject211_cursor == $subject211_len){
                                                                                                final Template $template210 = (Template)new Template($RVF, "{");
                                                                                                $template210.beginIndent(" ");
                                                                                                $template210.addVal($arg1_216);
                                                                                                $template210.endIndent(" ");
                                                                                                $template210.addStr(", ");
                                                                                                $template210.beginIndent("  ");
                                                                                                $template210.addVal($arg1_213);
                                                                                                $template210.endIndent("  ");
                                                                                                $template210.addStr("},");
                                                                                                result_1 = ((IString)($astr_add_astr(((IString)result_1),((IString)($template210.close())))));
                                                                                                break SWITCH56;// succeedSwitch
                                                                                             } else {
                                                                                                continue CASE_3322014_1;/*list match1*/
                                                                                             }
                                                                                          }
                                                                                       
                                                                                       } else {
                                                                                          $arg0_214 = ((IValue)($arg1_213));
                                                                                          $subject211_cursor += 1;
                                                                                          if($subject211_cursor == $subject211_len){
                                                                                             final Template $template210 = (Template)new Template($RVF, "{");
                                                                                             $template210.beginIndent(" ");
                                                                                             $template210.addVal($arg1_216);
                                                                                             $template210.endIndent(" ");
                                                                                             $template210.addStr(", ");
                                                                                             $template210.beginIndent("  ");
                                                                                             $template210.addVal($arg1_213);
                                                                                             $template210.endIndent("  ");
                                                                                             $template210.addStr("},");
                                                                                             result_1 = ((IString)($astr_add_astr(((IString)result_1),((IString)($template210.close())))));
                                                                                             break SWITCH56;// succeedSwitch
                                                                                          } else {
                                                                                             continue CASE_3322014_1;/*list match1*/
                                                                                          }
                                                                                       }
                                                                                    }
                                                                                 
                                                                                 }
                                                                              
                                                                              }
                                                                           
                                                                           }
                                                                        
                                                                        } else {
                                                                           $arg0_217 = ((IValue)($arg1_216));
                                                                           $subject211_cursor += 1;
                                                                           final IConstructor $subject212 = ((IConstructor)($alist_subscript_int(((IList)($subject211)),$subject211_cursor)));
                                                                           if($has_type_and_arity($subject212, M_ParseTree.CharRange_range_int_int, 2)){
                                                                              IValue $arg0_214 = (IValue)($aadt_subscript_int(((IConstructor)($subject212)),0));
                                                                              if($isComparable($arg0_214.getType(), $T7)){
                                                                                 IInteger j_6 = null;
                                                                                 IValue $arg1_213 = (IValue)($aadt_subscript_int(((IConstructor)($subject212)),1));
                                                                                 if($isComparable($arg1_213.getType(), $T7)){
                                                                                    if(($arg0_214 != null)){
                                                                                       if($arg0_214.match($arg1_213)){
                                                                                          $subject211_cursor += 1;
                                                                                          if($subject211_cursor == $subject211_len){
                                                                                             final Template $template210 = (Template)new Template($RVF, "{");
                                                                                             $template210.beginIndent(" ");
                                                                                             $template210.addVal($arg1_216);
                                                                                             $template210.endIndent(" ");
                                                                                             $template210.addStr(", ");
                                                                                             $template210.beginIndent("  ");
                                                                                             $template210.addVal($arg1_213);
                                                                                             $template210.endIndent("  ");
                                                                                             $template210.addStr("},");
                                                                                             result_1 = ((IString)($astr_add_astr(((IString)result_1),((IString)($template210.close())))));
                                                                                             break SWITCH56;// succeedSwitch
                                                                                          } else {
                                                                                             continue CASE_3322014_1;/*list match1*/
                                                                                          }
                                                                                       }
                                                                                    
                                                                                    } else {
                                                                                       $arg0_214 = ((IValue)($arg1_213));
                                                                                       $subject211_cursor += 1;
                                                                                       if($subject211_cursor == $subject211_len){
                                                                                          final Template $template210 = (Template)new Template($RVF, "{");
                                                                                          $template210.beginIndent(" ");
                                                                                          $template210.addVal($arg1_216);
                                                                                          $template210.endIndent(" ");
                                                                                          $template210.addStr(", ");
                                                                                          $template210.beginIndent("  ");
                                                                                          $template210.addVal($arg1_213);
                                                                                          $template210.endIndent("  ");
                                                                                          $template210.addStr("},");
                                                                                          result_1 = ((IString)($astr_add_astr(((IString)result_1),((IString)($template210.close())))));
                                                                                          break SWITCH56;// succeedSwitch
                                                                                       } else {
                                                                                          continue CASE_3322014_1;/*list match1*/
                                                                                       }
                                                                                    }
                                                                                 }
                                                                              
                                                                              }
                                                                           
                                                                           }
                                                                        
                                                                        }
                                                                     }
                                                                  
                                                                  }
                                                               
                                                               }
                                                            
                                                            }
                                                         
                                                         }
                                                 
                                                     } while(false);
                                              
                                              }
                                  
                                          }
                                          
                                  
                                      default: 
                                  }
                                  
                                             
                               } else {
                                  continue FOR55_GEN21927;
                               }
                            } else {
                               continue FOR55_GEN21927;
                            }
                        }
                        continue FOR55;
                                    
                    } while(false);
        
            } while(false);
        /* void:  muCon([]) */return ((IString)($astr_slice(((IString)(result_1)), null, null, -1)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(22258,7621,<518,0>,<623,1>) 
    public ITuple sym2newitem$321bea90aeae7a8d(IConstructor grammar_0, IConstructor sym_1, IInteger dot_2){ 
        
        
        if($has_type_and_arity(sym_1, M_Type.Symbol_label_str_Symbol, 2)){
           IValue $arg0_221 = (IValue)($aadt_subscript_int(((IConstructor)sym_1),0));
           if($isComparable($arg0_221.getType(), $T1)){
              IValue $arg1_220 = (IValue)($aadt_subscript_int(((IConstructor)sym_1),1));
              if($isComparable($arg1_220.getType(), M_ParseTree.ADT_Symbol)){
                 IConstructor sym1_3 = null;
                 sym_1 = ((IConstructor)($arg1_220));
              
              }
           
           }
        
        }
        IInteger itemId_4 = ((IInteger)($getkw_Symbol_id(((IConstructor)sym_1))));
        IList enters_5 = ((IList)$constants.get(31)/*[]*/);
        IList exits_6 = ((IList)$constants.get(31)/*[]*/);
        IString filters_7 = ((IString)$constants.get(37)/*""*/);
        if($has_type_and_arity(sym_1, M_ParseTree.Symbol_conditional_Symbol_set_Condition, 2)){
           IValue $arg0_326 = (IValue)($aadt_subscript_int(((IConstructor)sym_1),0));
           if($isComparable($arg0_326.getType(), $T1)){
              IValue $arg1_325 = (IValue)($aadt_subscript_int(((IConstructor)sym_1),1));
              if($isComparable($arg1_325.getType(), $T8)){
                 ISet conds_8 = ((ISet)($arg1_325));
                 $arg1_325 = ((IValue)(M_lang_rascal_grammar_definition_Keywords.expandKeywords(((IConstructor)grammar_0), ((ISet)($arg1_325)))));
                 final IListWriter $listwriter222 = (IListWriter)$RVF.listWriter();
                 /*muExists*/$LCOMP223_GEN22755_CONS_follow: 
                     do {
                         $LCOMP223_GEN22755:
                         for(IValue $elem225_for : ((ISet)($arg1_325))){
                             IConstructor $elem225 = (IConstructor) $elem225_for;
                             if($has_type_and_arity($elem225, M_ParseTree.Condition_follow_Symbol, 1)){
                                IValue $arg0_226 = (IValue)($aadt_subscript_int(((IConstructor)($elem225)),0));
                                if($isComparable($arg0_226.getType(), M_ParseTree.ADT_Symbol)){
                                   if($has_type_and_arity($arg0_226, M_ParseTree.Symbol_char_class_list_CharRange, 1)){
                                      IValue $arg0_227 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_226)),0));
                                      if($isComparable($arg0_227.getType(), $T11)){
                                         IList ranges_9 = ((IList)($arg0_227));
                                         final Template $template224 = (Template)new Template($RVF, "new CharFollowRequirement(new int[][]{");
                                         $template224.beginIndent("                                      ");
                                         $template224.addStr(((IString)($me.generateCharClassArrays(((IList)($arg0_227))))).getValue());
                                         $template224.endIndent("                                      ");
                                         $template224.addStr("})");
                                         $listwriter222.append($template224.close());
                                      
                                      } else {
                                         continue $LCOMP223_GEN22755;
                                      }
                                   } else {
                                      continue $LCOMP223_GEN22755;
                                   }
                                } else {
                                   continue $LCOMP223_GEN22755;
                                }
                             } else {
                                continue $LCOMP223_GEN22755;
                             }
                         }
                         
                                     
                     } while(false);
                 exits_6 = ((IList)($alist_add_alist(((IList)exits_6),((IList)($listwriter222.done())))));
                 final IListWriter $listwriter228 = (IListWriter)$RVF.listWriter();
                 /*muExists*/$LCOMP229_GEN22885_CONS_follow: 
                     do {
                         $LCOMP229_GEN22885:
                         for(IValue $elem231_for : ((ISet)($arg1_325))){
                             IConstructor $elem231 = (IConstructor) $elem231_for;
                             if($has_type_and_arity($elem231, M_ParseTree.Condition_follow_Symbol, 1)){
                                IValue $arg0_232 = (IValue)($aadt_subscript_int(((IConstructor)($elem231)),0));
                                if($isComparable($arg0_232.getType(), M_ParseTree.ADT_Symbol)){
                                   if($has_type_and_arity($arg0_232, M_ParseTree.Symbol_lit_str, 1)){
                                      IValue $arg0_233 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_232)),0));
                                      if($isComparable($arg0_233.getType(), $T4)){
                                         IString s_10 = ((IString)($arg0_233));
                                         final Template $template230 = (Template)new Template($RVF, "new StringFollowRequirement(new int[] {");
                                         $template230.beginIndent("                                       ");
                                         $template230.addStr(((IString)($me.literals2ints(((IList)(M_lang_rascal_grammar_definition_Literals.str2syms(((IString)($arg0_233)))))))).getValue());
                                         $template230.endIndent("                                       ");
                                         $template230.addStr("})");
                                         $listwriter228.append($template230.close());
                                      
                                      } else {
                                         continue $LCOMP229_GEN22885;
                                      }
                                   } else {
                                      continue $LCOMP229_GEN22885;
                                   }
                                } else {
                                   continue $LCOMP229_GEN22885;
                                }
                             } else {
                                continue $LCOMP229_GEN22885;
                             }
                         }
                         
                                     
                     } while(false);
                 exits_6 = ((IList)($alist_add_alist(((IList)exits_6),((IList)($listwriter228.done())))));
                 final IListWriter $listwriter234 = (IListWriter)$RVF.listWriter();
                 /*muExists*/$LCOMP235_GEN23023_CONS_follow: 
                     do {
                         $LCOMP235_GEN23023:
                         for(IValue $elem237_for : ((ISet)($arg1_325))){
                             IConstructor $elem237 = (IConstructor) $elem237_for;
                             if($has_type_and_arity($elem237, M_ParseTree.Condition_follow_Symbol, 1)){
                                IValue $arg0_238 = (IValue)($aadt_subscript_int(((IConstructor)($elem237)),0));
                                if($isComparable($arg0_238.getType(), M_ParseTree.ADT_Symbol)){
                                   if($has_type_and_arity($arg0_238, M_ParseTree.Symbol_cilit_str, 1)){
                                      IValue $arg0_239 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_238)),0));
                                      if($isComparable($arg0_239.getType(), $T4)){
                                         IString s_11 = ((IString)($arg0_239));
                                         final Template $template236 = (Template)new Template($RVF, "new CaseInsensitiveStringFollowRequirement(new int[][]{");
                                         $template236.beginIndent("                                                       ");
                                         $template236.addStr(((IString)($me.ciliterals2ints(((IList)(M_lang_rascal_grammar_definition_Literals.cistr2syms(((IString)($arg0_239)))))))).getValue());
                                         $template236.endIndent("                                                       ");
                                         $template236.addStr("})");
                                         $listwriter234.append($template236.close());
                                      
                                      } else {
                                         continue $LCOMP235_GEN23023;
                                      }
                                   } else {
                                      continue $LCOMP235_GEN23023;
                                   }
                                } else {
                                   continue $LCOMP235_GEN23023;
                                }
                             } else {
                                continue $LCOMP235_GEN23023;
                             }
                         }
                         
                                     
                     } while(false);
                 exits_6 = ((IList)($alist_add_alist(((IList)exits_6),((IList)($listwriter234.done())))));
                 final IListWriter $listwriter240 = (IListWriter)$RVF.listWriter();
                 /*muExists*/$LCOMP241_GEN23147_CONS_not_follow: 
                     do {
                         $LCOMP241_GEN23147:
                         for(IValue $elem243_for : ((ISet)($arg1_325))){
                             IConstructor $elem243 = (IConstructor) $elem243_for;
                             if($has_type_and_arity($elem243, M_ParseTree.Condition_not_follow_Symbol, 1)){
                                IValue $arg0_244 = (IValue)($aadt_subscript_int(((IConstructor)($elem243)),0));
                                if($isComparable($arg0_244.getType(), M_ParseTree.ADT_Symbol)){
                                   if($has_type_and_arity($arg0_244, M_ParseTree.Symbol_char_class_list_CharRange, 1)){
                                      IValue $arg0_245 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_244)),0));
                                      if($isComparable($arg0_245.getType(), $T11)){
                                         IList ranges_12 = ((IList)($arg0_245));
                                         final Template $template242 = (Template)new Template($RVF, "new CharFollowRestriction(new int[][]{");
                                         $template242.beginIndent("                                      ");
                                         $template242.addStr(((IString)($me.generateCharClassArrays(((IList)($arg0_245))))).getValue());
                                         $template242.endIndent("                                      ");
                                         $template242.addStr("})");
                                         $listwriter240.append($template242.close());
                                      
                                      } else {
                                         continue $LCOMP241_GEN23147;
                                      }
                                   } else {
                                      continue $LCOMP241_GEN23147;
                                   }
                                } else {
                                   continue $LCOMP241_GEN23147;
                                }
                             } else {
                                continue $LCOMP241_GEN23147;
                             }
                         }
                         
                                     
                     } while(false);
                 exits_6 = ((IList)($alist_add_alist(((IList)exits_6),((IList)($listwriter240.done())))));
                 final IListWriter $listwriter246 = (IListWriter)$RVF.listWriter();
                 /*muExists*/$LCOMP247_GEN23282_CONS_not_follow: 
                     do {
                         $LCOMP247_GEN23282:
                         for(IValue $elem249_for : ((ISet)($arg1_325))){
                             IConstructor $elem249 = (IConstructor) $elem249_for;
                             if($has_type_and_arity($elem249, M_ParseTree.Condition_not_follow_Symbol, 1)){
                                IValue $arg0_250 = (IValue)($aadt_subscript_int(((IConstructor)($elem249)),0));
                                if($isComparable($arg0_250.getType(), M_ParseTree.ADT_Symbol)){
                                   if($has_type_and_arity($arg0_250, M_ParseTree.Symbol_lit_str, 1)){
                                      IValue $arg0_251 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_250)),0));
                                      if($isComparable($arg0_251.getType(), $T4)){
                                         IString s_13 = ((IString)($arg0_251));
                                         final Template $template248 = (Template)new Template($RVF, "new StringFollowRestriction(new int[] {");
                                         $template248.beginIndent("                                       ");
                                         $template248.addStr(((IString)($me.literals2ints(((IList)(M_lang_rascal_grammar_definition_Literals.str2syms(((IString)($arg0_251)))))))).getValue());
                                         $template248.endIndent("                                       ");
                                         $template248.addStr("})");
                                         $listwriter246.append($template248.close());
                                      
                                      } else {
                                         continue $LCOMP247_GEN23282;
                                      }
                                   } else {
                                      continue $LCOMP247_GEN23282;
                                   }
                                } else {
                                   continue $LCOMP247_GEN23282;
                                }
                             } else {
                                continue $LCOMP247_GEN23282;
                             }
                         }
                         
                                     
                     } while(false);
                 exits_6 = ((IList)($alist_add_alist(((IList)exits_6),((IList)($listwriter246.done())))));
                 final IListWriter $listwriter252 = (IListWriter)$RVF.listWriter();
                 /*muExists*/$LCOMP253_GEN23424_CONS_not_follow: 
                     do {
                         $LCOMP253_GEN23424:
                         for(IValue $elem255_for : ((ISet)($arg1_325))){
                             IConstructor $elem255 = (IConstructor) $elem255_for;
                             if($has_type_and_arity($elem255, M_ParseTree.Condition_not_follow_Symbol, 1)){
                                IValue $arg0_256 = (IValue)($aadt_subscript_int(((IConstructor)($elem255)),0));
                                if($isComparable($arg0_256.getType(), M_ParseTree.ADT_Symbol)){
                                   if($has_type_and_arity($arg0_256, M_ParseTree.Symbol_cilit_str, 1)){
                                      IValue $arg0_257 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_256)),0));
                                      if($isComparable($arg0_257.getType(), $T4)){
                                         IString s_14 = ((IString)($arg0_257));
                                         final Template $template254 = (Template)new Template($RVF, "new CaseInsensitiveStringFollowRestriction(new int[][]{");
                                         $template254.beginIndent("                                                       ");
                                         $template254.addStr(((IString)($me.ciliterals2ints(((IList)(M_lang_rascal_grammar_definition_Literals.cistr2syms(((IString)($arg0_257)))))))).getValue());
                                         $template254.endIndent("                                                       ");
                                         $template254.addStr("})");
                                         $listwriter252.append($template254.close());
                                      
                                      } else {
                                         continue $LCOMP253_GEN23424;
                                      }
                                   } else {
                                      continue $LCOMP253_GEN23424;
                                   }
                                } else {
                                   continue $LCOMP253_GEN23424;
                                }
                             } else {
                                continue $LCOMP253_GEN23424;
                             }
                         }
                         
                                     
                     } while(false);
                 exits_6 = ((IList)($alist_add_alist(((IList)exits_6),((IList)($listwriter252.done())))));
                 final IListWriter $listwriter258 = (IListWriter)$RVF.listWriter();
                 /*muExists*/$LCOMP259_GEN23552_CONS_delete: 
                     do {
                         $LCOMP259_GEN23552:
                         for(IValue $elem261_for : ((ISet)($arg1_325))){
                             IConstructor $elem261 = (IConstructor) $elem261_for;
                             if($has_type_and_arity($elem261, M_ParseTree.Condition_delete_Symbol, 1)){
                                IValue $arg0_262 = (IValue)($aadt_subscript_int(((IConstructor)($elem261)),0));
                                if($isComparable($arg0_262.getType(), M_ParseTree.ADT_Symbol)){
                                   if($has_type_and_arity($arg0_262, M_ParseTree.Symbol_char_class_list_CharRange, 1)){
                                      IValue $arg0_263 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_262)),0));
                                      if($isComparable($arg0_263.getType(), $T11)){
                                         IList ranges_15 = ((IList)($arg0_263));
                                         final Template $template260 = (Template)new Template($RVF, "new CharMatchRestriction(new int[][]{");
                                         $template260.beginIndent("                                     ");
                                         $template260.addStr(((IString)($me.generateCharClassArrays(((IList)($arg0_263))))).getValue());
                                         $template260.endIndent("                                     ");
                                         $template260.addStr("})");
                                         $listwriter258.append($template260.close());
                                      
                                      } else {
                                         continue $LCOMP259_GEN23552;
                                      }
                                   } else {
                                      continue $LCOMP259_GEN23552;
                                   }
                                } else {
                                   continue $LCOMP259_GEN23552;
                                }
                             } else {
                                continue $LCOMP259_GEN23552;
                             }
                         }
                         
                                     
                     } while(false);
                 exits_6 = ((IList)($alist_add_alist(((IList)exits_6),((IList)($listwriter258.done())))));
                 final IListWriter $listwriter264 = (IListWriter)$RVF.listWriter();
                 /*muExists*/$LCOMP265_GEN23682_CONS_delete: 
                     do {
                         $LCOMP265_GEN23682:
                         for(IValue $elem267_for : ((ISet)($arg1_325))){
                             IConstructor $elem267 = (IConstructor) $elem267_for;
                             if($has_type_and_arity($elem267, M_ParseTree.Condition_delete_Symbol, 1)){
                                IValue $arg0_268 = (IValue)($aadt_subscript_int(((IConstructor)($elem267)),0));
                                if($isComparable($arg0_268.getType(), M_ParseTree.ADT_Symbol)){
                                   if($has_type_and_arity($arg0_268, M_ParseTree.Symbol_lit_str, 1)){
                                      IValue $arg0_269 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_268)),0));
                                      if($isComparable($arg0_269.getType(), $T4)){
                                         IString s_16 = ((IString)($arg0_269));
                                         final Template $template266 = (Template)new Template($RVF, "new StringMatchRestriction(new int[] {");
                                         $template266.beginIndent("                                      ");
                                         $template266.addStr(((IString)($me.literals2ints(((IList)(M_lang_rascal_grammar_definition_Literals.str2syms(((IString)($arg0_269)))))))).getValue());
                                         $template266.endIndent("                                      ");
                                         $template266.addStr("})");
                                         $listwriter264.append($template266.close());
                                      
                                      } else {
                                         continue $LCOMP265_GEN23682;
                                      }
                                   } else {
                                      continue $LCOMP265_GEN23682;
                                   }
                                } else {
                                   continue $LCOMP265_GEN23682;
                                }
                             } else {
                                continue $LCOMP265_GEN23682;
                             }
                         }
                         
                                     
                     } while(false);
                 exits_6 = ((IList)($alist_add_alist(((IList)exits_6),((IList)($listwriter264.done())))));
                 final IListWriter $listwriter270 = (IListWriter)$RVF.listWriter();
                 /*muExists*/$LCOMP271_GEN23819_CONS_delete: 
                     do {
                         $LCOMP271_GEN23819:
                         for(IValue $elem273_for : ((ISet)($arg1_325))){
                             IConstructor $elem273 = (IConstructor) $elem273_for;
                             if($has_type_and_arity($elem273, M_ParseTree.Condition_delete_Symbol, 1)){
                                IValue $arg0_274 = (IValue)($aadt_subscript_int(((IConstructor)($elem273)),0));
                                if($isComparable($arg0_274.getType(), M_ParseTree.ADT_Symbol)){
                                   if($has_type_and_arity($arg0_274, M_ParseTree.Symbol_cilit_str, 1)){
                                      IValue $arg0_275 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_274)),0));
                                      if($isComparable($arg0_275.getType(), $T4)){
                                         IString s_17 = ((IString)($arg0_275));
                                         final Template $template272 = (Template)new Template($RVF, "new CaseInsensitiveStringMatchRestriction(new int[][]{");
                                         $template272.beginIndent("                                                      ");
                                         $template272.addStr(((IString)($me.ciliterals2ints(((IList)(M_lang_rascal_grammar_definition_Literals.cistr2syms(((IString)($arg0_275)))))))).getValue());
                                         $template272.endIndent("                                                      ");
                                         $template272.addStr("})");
                                         $listwriter270.append($template272.close());
                                      
                                      } else {
                                         continue $LCOMP271_GEN23819;
                                      }
                                   } else {
                                      continue $LCOMP271_GEN23819;
                                   }
                                } else {
                                   continue $LCOMP271_GEN23819;
                                }
                             } else {
                                continue $LCOMP271_GEN23819;
                             }
                         }
                         
                                     
                     } while(false);
                 exits_6 = ((IList)($alist_add_alist(((IList)exits_6),((IList)($listwriter270.done())))));
                 final IListWriter $listwriter276 = (IListWriter)$RVF.listWriter();
                 /*muExists*/$LCOMP277_GEN23898_CONS_end_of_line: 
                     do {
                         $LCOMP277_GEN23898:
                         for(IValue $elem278_for : ((ISet)($arg1_325))){
                             IConstructor $elem278 = (IConstructor) $elem278_for;
                             if($has_type_and_arity($elem278, M_ParseTree.Condition_end_of_line_, 0)){
                                $listwriter276.append(((IString)$constants.get(39)/*"new AtEndOfLineRequirement()"*/));
                             
                             } else {
                                continue $LCOMP277_GEN23898;
                             }
                         }
                         
                                     
                     } while(false);
                 exits_6 = ((IList)($alist_add_alist(((IList)exits_6),((IList)($listwriter276.done())))));
                 final IListWriter $listwriter279 = (IListWriter)$RVF.listWriter();
                 /*muExists*/$LCOMP280_GEN24022_CONS_precede: 
                     do {
                         $LCOMP280_GEN24022:
                         for(IValue $elem282_for : ((ISet)($arg1_325))){
                             IConstructor $elem282 = (IConstructor) $elem282_for;
                             if($has_type_and_arity($elem282, M_ParseTree.Condition_precede_Symbol, 1)){
                                IValue $arg0_283 = (IValue)($aadt_subscript_int(((IConstructor)($elem282)),0));
                                if($isComparable($arg0_283.getType(), M_ParseTree.ADT_Symbol)){
                                   if($has_type_and_arity($arg0_283, M_ParseTree.Symbol_char_class_list_CharRange, 1)){
                                      IValue $arg0_284 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_283)),0));
                                      if($isComparable($arg0_284.getType(), $T11)){
                                         IList ranges_18 = ((IList)($arg0_284));
                                         final Template $template281 = (Template)new Template($RVF, "new CharPrecedeRequirement(new int[][]{");
                                         $template281.beginIndent("                                       ");
                                         $template281.addStr(((IString)($me.generateCharClassArrays(((IList)($arg0_284))))).getValue());
                                         $template281.endIndent("                                       ");
                                         $template281.addStr("})");
                                         $listwriter279.append($template281.close());
                                      
                                      } else {
                                         continue $LCOMP280_GEN24022;
                                      }
                                   } else {
                                      continue $LCOMP280_GEN24022;
                                   }
                                } else {
                                   continue $LCOMP280_GEN24022;
                                }
                             } else {
                                continue $LCOMP280_GEN24022;
                             }
                         }
                         
                                     
                     } while(false);
                 enters_5 = ((IList)($alist_add_alist(((IList)enters_5),((IList)($listwriter279.done())))));
                 final IListWriter $listwriter285 = (IListWriter)$RVF.listWriter();
                 /*muExists*/$LCOMP286_GEN24155_CONS_precede: 
                     do {
                         $LCOMP286_GEN24155:
                         for(IValue $elem288_for : ((ISet)($arg1_325))){
                             IConstructor $elem288 = (IConstructor) $elem288_for;
                             if($has_type_and_arity($elem288, M_ParseTree.Condition_precede_Symbol, 1)){
                                IValue $arg0_289 = (IValue)($aadt_subscript_int(((IConstructor)($elem288)),0));
                                if($isComparable($arg0_289.getType(), M_ParseTree.ADT_Symbol)){
                                   if($has_type_and_arity($arg0_289, M_ParseTree.Symbol_lit_str, 1)){
                                      IValue $arg0_290 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_289)),0));
                                      if($isComparable($arg0_290.getType(), $T4)){
                                         IString s_19 = ((IString)($arg0_290));
                                         final Template $template287 = (Template)new Template($RVF, "new StringPrecedeRequirement(new int[] {");
                                         $template287.beginIndent("                                        ");
                                         $template287.addStr(((IString)($me.literals2ints(((IList)(M_lang_rascal_grammar_definition_Literals.str2syms(((IString)($arg0_290)))))))).getValue());
                                         $template287.endIndent("                                        ");
                                         $template287.addStr("})");
                                         $listwriter285.append($template287.close());
                                      
                                      } else {
                                         continue $LCOMP286_GEN24155;
                                      }
                                   } else {
                                      continue $LCOMP286_GEN24155;
                                   }
                                } else {
                                   continue $LCOMP286_GEN24155;
                                }
                             } else {
                                continue $LCOMP286_GEN24155;
                             }
                         }
                         
                                     
                     } while(false);
                 enters_5 = ((IList)($alist_add_alist(((IList)enters_5),((IList)($listwriter285.done())))));
                 final IListWriter $listwriter291 = (IListWriter)$RVF.listWriter();
                 /*muExists*/$LCOMP292_GEN24296_CONS_precede: 
                     do {
                         $LCOMP292_GEN24296:
                         for(IValue $elem294_for : ((ISet)($arg1_325))){
                             IConstructor $elem294 = (IConstructor) $elem294_for;
                             if($has_type_and_arity($elem294, M_ParseTree.Condition_precede_Symbol, 1)){
                                IValue $arg0_295 = (IValue)($aadt_subscript_int(((IConstructor)($elem294)),0));
                                if($isComparable($arg0_295.getType(), M_ParseTree.ADT_Symbol)){
                                   if($has_type_and_arity($arg0_295, M_ParseTree.Symbol_cilit_str, 1)){
                                      IValue $arg0_296 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_295)),0));
                                      if($isComparable($arg0_296.getType(), $T4)){
                                         IString s_20 = ((IString)($arg0_296));
                                         final Template $template293 = (Template)new Template($RVF, "new CaseInsensitiveStringPrecedeRequirement(new int[][]{");
                                         $template293.beginIndent("                                                        ");
                                         $template293.addStr(((IString)($me.ciliterals2ints(((IList)(M_lang_rascal_grammar_definition_Literals.cistr2syms(((IString)($arg0_296)))))))).getValue());
                                         $template293.endIndent("                                                        ");
                                         $template293.addStr("})");
                                         $listwriter291.append($template293.close());
                                      
                                      } else {
                                         continue $LCOMP292_GEN24296;
                                      }
                                   } else {
                                      continue $LCOMP292_GEN24296;
                                   }
                                } else {
                                   continue $LCOMP292_GEN24296;
                                }
                             } else {
                                continue $LCOMP292_GEN24296;
                             }
                         }
                         
                                     
                     } while(false);
                 enters_5 = ((IList)($alist_add_alist(((IList)enters_5),((IList)($listwriter291.done())))));
                 final IListWriter $listwriter297 = (IListWriter)$RVF.listWriter();
                 /*muExists*/$LCOMP298_GEN24423_CONS_not_precede: 
                     do {
                         $LCOMP298_GEN24423:
                         for(IValue $elem300_for : ((ISet)($arg1_325))){
                             IConstructor $elem300 = (IConstructor) $elem300_for;
                             if($has_type_and_arity($elem300, M_ParseTree.Condition_not_precede_Symbol, 1)){
                                IValue $arg0_301 = (IValue)($aadt_subscript_int(((IConstructor)($elem300)),0));
                                if($isComparable($arg0_301.getType(), M_ParseTree.ADT_Symbol)){
                                   if($has_type_and_arity($arg0_301, M_ParseTree.Symbol_char_class_list_CharRange, 1)){
                                      IValue $arg0_302 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_301)),0));
                                      if($isComparable($arg0_302.getType(), $T11)){
                                         IList ranges_21 = ((IList)($arg0_302));
                                         final Template $template299 = (Template)new Template($RVF, "new CharPrecedeRestriction(new int[][]{");
                                         $template299.beginIndent("                                       ");
                                         $template299.addStr(((IString)($me.generateCharClassArrays(((IList)($arg0_302))))).getValue());
                                         $template299.endIndent("                                       ");
                                         $template299.addStr("})");
                                         $listwriter297.append($template299.close());
                                      
                                      } else {
                                         continue $LCOMP298_GEN24423;
                                      }
                                   } else {
                                      continue $LCOMP298_GEN24423;
                                   }
                                } else {
                                   continue $LCOMP298_GEN24423;
                                }
                             } else {
                                continue $LCOMP298_GEN24423;
                             }
                         }
                         
                                     
                     } while(false);
                 enters_5 = ((IList)($alist_add_alist(((IList)enters_5),((IList)($listwriter297.done())))));
                 final IListWriter $listwriter303 = (IListWriter)$RVF.listWriter();
                 /*muExists*/$LCOMP304_GEN24561_CONS_not_precede: 
                     do {
                         $LCOMP304_GEN24561:
                         for(IValue $elem306_for : ((ISet)($arg1_325))){
                             IConstructor $elem306 = (IConstructor) $elem306_for;
                             if($has_type_and_arity($elem306, M_ParseTree.Condition_not_precede_Symbol, 1)){
                                IValue $arg0_307 = (IValue)($aadt_subscript_int(((IConstructor)($elem306)),0));
                                if($isComparable($arg0_307.getType(), M_ParseTree.ADT_Symbol)){
                                   if($has_type_and_arity($arg0_307, M_ParseTree.Symbol_lit_str, 1)){
                                      IValue $arg0_308 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_307)),0));
                                      if($isComparable($arg0_308.getType(), $T4)){
                                         IString s_22 = ((IString)($arg0_308));
                                         final Template $template305 = (Template)new Template($RVF, "new StringPrecedeRestriction(new int[] {");
                                         $template305.beginIndent("                                        ");
                                         $template305.addStr(((IString)($me.literals2ints(((IList)(M_lang_rascal_grammar_definition_Literals.str2syms(((IString)($arg0_308)))))))).getValue());
                                         $template305.endIndent("                                        ");
                                         $template305.addStr("})");
                                         $listwriter303.append($template305.close());
                                      
                                      } else {
                                         continue $LCOMP304_GEN24561;
                                      }
                                   } else {
                                      continue $LCOMP304_GEN24561;
                                   }
                                } else {
                                   continue $LCOMP304_GEN24561;
                                }
                             } else {
                                continue $LCOMP304_GEN24561;
                             }
                         }
                         
                                     
                     } while(false);
                 enters_5 = ((IList)($alist_add_alist(((IList)enters_5),((IList)($listwriter303.done())))));
                 final IListWriter $listwriter309 = (IListWriter)$RVF.listWriter();
                 /*muExists*/$LCOMP310_GEN24706_CONS_not_precede: 
                     do {
                         $LCOMP310_GEN24706:
                         for(IValue $elem312_for : ((ISet)($arg1_325))){
                             IConstructor $elem312 = (IConstructor) $elem312_for;
                             if($has_type_and_arity($elem312, M_ParseTree.Condition_not_precede_Symbol, 1)){
                                IValue $arg0_313 = (IValue)($aadt_subscript_int(((IConstructor)($elem312)),0));
                                if($isComparable($arg0_313.getType(), M_ParseTree.ADT_Symbol)){
                                   if($has_type_and_arity($arg0_313, M_ParseTree.Symbol_cilit_str, 1)){
                                      IValue $arg0_314 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_313)),0));
                                      if($isComparable($arg0_314.getType(), $T4)){
                                         IString s_23 = ((IString)($arg0_314));
                                         final Template $template311 = (Template)new Template($RVF, "new CaseInsensitiveStringPrecedeRestriction(new int[][]{");
                                         $template311.beginIndent("                                                        ");
                                         $template311.addStr(((IString)($me.ciliterals2ints(((IList)(M_lang_rascal_grammar_definition_Literals.cistr2syms(((IString)($arg0_314)))))))).getValue());
                                         $template311.endIndent("                                                        ");
                                         $template311.addStr("})");
                                         $listwriter309.append($template311.close());
                                      
                                      } else {
                                         continue $LCOMP310_GEN24706;
                                      }
                                   } else {
                                      continue $LCOMP310_GEN24706;
                                   }
                                } else {
                                   continue $LCOMP310_GEN24706;
                                }
                             } else {
                                continue $LCOMP310_GEN24706;
                             }
                         }
                         
                                     
                     } while(false);
                 enters_5 = ((IList)($alist_add_alist(((IList)enters_5),((IList)($listwriter309.done())))));
                 final IListWriter $listwriter315 = (IListWriter)$RVF.listWriter();
                 /*muExists*/$LCOMP316_GEN24792_CONS_at_column: 
                     do {
                         $LCOMP316_GEN24792:
                         for(IValue $elem318_for : ((ISet)($arg1_325))){
                             IConstructor $elem318 = (IConstructor) $elem318_for;
                             if($has_type_and_arity($elem318, M_ParseTree.Condition_at_column_int, 1)){
                                IValue $arg0_319 = (IValue)($aadt_subscript_int(((IConstructor)($elem318)),0));
                                if($isComparable($arg0_319.getType(), $T7)){
                                   IInteger i_24 = null;
                                   final Template $template317 = (Template)new Template($RVF, "new AtColumnRequirement(");
                                   $template317.beginIndent("                        ");
                                   $template317.addVal($arg0_319);
                                   $template317.endIndent("                        ");
                                   $template317.addStr(")");
                                   $listwriter315.append($template317.close());
                                
                                } else {
                                   continue $LCOMP316_GEN24792;
                                }
                             } else {
                                continue $LCOMP316_GEN24792;
                             }
                         }
                         
                                     
                     } while(false);
                 enters_5 = ((IList)($alist_add_alist(((IList)enters_5),((IList)($listwriter315.done())))));
                 final IListWriter $listwriter320 = (IListWriter)$RVF.listWriter();
                 /*muExists*/$LCOMP321_GEN24874_CONS_begin_of_line: 
                     do {
                         $LCOMP321_GEN24874:
                         for(IValue $elem322_for : ((ISet)($arg1_325))){
                             IConstructor $elem322 = (IConstructor) $elem322_for;
                             if($has_type_and_arity($elem322, M_ParseTree.Condition_begin_of_line_, 0)){
                                $listwriter320.append(((IString)$constants.get(40)/*"new AtStartOfLineRequirement()"*/));
                             
                             } else {
                                continue $LCOMP321_GEN24874;
                             }
                         }
                         
                                     
                     } while(false);
                 enters_5 = ((IList)($alist_add_alist(((IList)enters_5),((IList)($listwriter320.done())))));
                 sym_1 = ((IConstructor)(((IConstructor)($aadt_get_field(((IConstructor)sym_1), "symbol")))));
                 if($has_type_and_arity(sym_1, M_Type.Symbol_label_str_Symbol, 2)){
                    IValue $arg0_324 = (IValue)($aadt_subscript_int(((IConstructor)sym_1),0));
                    if($isComparable($arg0_324.getType(), $T1)){
                       IValue $arg1_323 = (IValue)($aadt_subscript_int(((IConstructor)sym_1),1));
                       if($isComparable($arg1_323.getType(), M_ParseTree.ADT_Symbol)){
                          IConstructor sym1_25 = null;
                          sym_1 = ((IConstructor)($arg1_323));
                       
                       }
                    
                    }
                 
                 }
              
              }
           
           }
        
        }
        filters_7 = ((IString)$constants.get(37)/*""*/);
        if((((IBool)($equal(((IList)enters_5),((IList)$constants.get(31)/*[]*/)).not()))).getValue()){
           final Template $template327 = (Template)new Template($RVF, "new IEnterFilter[] {");
           $template327.beginIndent("                    ");
           $template327.addStr(((IString)(M_List.head(((IList)enters_5)))).getValue());
           $template327.endIndent("                    ");
           ;/*muExists*/LAB61: 
               do {
                   if((((IBool)($equal(((IList)enters_5),((IList)$constants.get(31)/*[]*/)).not()))).getValue()){
                      LAB61_GEN25125:
                      for(IValue $elem328_for : ((IList)(M_List.tail(((IList)enters_5))))){
                          IString $elem328 = (IString) $elem328_for;
                          IString f_26 = null;
                          $template327.addStr(", ");
                          $template327.beginIndent("  ");
                          $template327.addStr(((IString)($elem328)).getValue());
                          $template327.endIndent("  ");
                      
                      }
                      continue LAB61;
                                  
                   } else {
                      continue LAB61;
                   }
               } while(false);
           $template327.addStr("}");
           filters_7 = ((IString)($astr_add_astr(((IString)filters_7),((IString)($template327.close())))));
        
        } else {
           filters_7 = ((IString)($astr_add_astr(((IString)filters_7),((IString)$constants.get(41)/*"null"*/))));
        
        }if((((IBool)($equal(((IList)exits_6),((IList)$constants.get(31)/*[]*/)).not()))).getValue()){
           final Template $template329 = (Template)new Template($RVF, ", new ICompletionFilter[] {");
           $template329.beginIndent("                           ");
           $template329.addStr(((IString)(M_List.head(((IList)exits_6)))).getValue());
           $template329.endIndent("                           ");
           ;/*muExists*/LAB63: 
               do {
                   if((((IBool)($equal(((IList)exits_6),((IList)$constants.get(31)/*[]*/)).not()))).getValue()){
                      LAB63_GEN25307:
                      for(IValue $elem330_for : ((IList)(M_List.tail(((IList)exits_6))))){
                          IString $elem330 = (IString) $elem330_for;
                          IString f_27 = null;
                          $template329.addStr(", ");
                          $template329.beginIndent("  ");
                          $template329.addStr(((IString)($elem330)).getValue());
                          $template329.endIndent("  ");
                      
                      }
                      continue LAB63;
                                  
                   } else {
                      continue LAB63;
                   }
               } while(false);
           $template329.addStr("}");
           filters_7 = ((IString)($astr_add_astr(((IString)filters_7),((IString)($template329.close())))));
        
        } else {
           filters_7 = ((IString)($astr_add_astr(((IString)filters_7),((IString)$constants.get(42)/*", null"*/))));
        
        }final IConstructor $switchVal331 = ((IConstructor)sym_1);
        boolean noCaseMatched_$switchVal331 = true;
        SWITCH64: switch(Fingerprint.getFingerprint($switchVal331)){
        
            case -964239440:
                if(noCaseMatched_$switchVal331){
                    noCaseMatched_$switchVal331 = false;
                    if($isSubtypeOf($switchVal331.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_964239440_14: 
                           do {
                               if($has_type_and_arity($switchVal331, M_ParseTree.Symbol_iter_star_seps_Symbol_list_Symbol, 2)){
                                  IValue $arg0_380 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal331)),0));
                                  if($isComparable($arg0_380.getType(), M_ParseTree.ADT_Symbol)){
                                     IConstructor s_39 = ((IConstructor)($arg0_380));
                                     IValue $arg1_379 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal331)),1));
                                     if($isComparable($arg1_379.getType(), $T6)){
                                        IList seps_40 = ((IList)($arg1_379));
                                        IConstructor reg_41 = ((IConstructor)($RVF.constructor(M_ParseTree.Production_regular_Symbol, new IValue[]{((IConstructor)sym_1)})));
                                        final Template $template378 = (Template)new Template($RVF, "new SeparatedListStackNode<IConstructor>(");
                                        $template378.beginIndent("                                           ");
                                        $template378.addVal(itemId_4);
                                        $template378.endIndent("                                           ");
                                        $template378.addStr(", ");
                                        $template378.beginIndent("  ");
                                        $template378.addVal(dot_2);
                                        $template378.endIndent("  ");
                                        $template378.addStr(", ");
                                        $template378.beginIndent("  ");
                                        $template378.addStr(((IString)($me.value2id(((IValue)reg_41)))).getValue());
                                        $template378.endIndent("  ");
                                        $template378.addStr(", ");
                                        $template378.beginIndent("  ");
                                        $template378.addStr(((IString)($atuple_field_project((ITuple)((ITuple)($me.sym2newitem(((IConstructor)grammar_0), ((IConstructor)($arg0_380)), ((IInteger)$constants.get(19)/*0*/)))), ((IInteger)$constants.get(19)/*0*/)))).getValue());
                                        $template378.endIndent("  ");
                                        $template378.addStr(", (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{");
                                        $template378.beginIndent("                                                                ");
                                        $template378.addStr(((IString)($me.generateSeparatorExpects(((IConstructor)grammar_0), ((IList)($arg1_379))))).getValue());
                                        $template378.endIndent("                                                                ");
                                        $template378.addStr("}, false, ");
                                        $template378.beginIndent("          ");
                                        $template378.addStr(((IString)filters_7).getValue());
                                        $template378.endIndent("          ");
                                        $template378.addStr(")");
                                        return ((ITuple)($RVF.tuple(((IString)($template378.close())), ((IInteger)itemId_4))));
                                     
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 1444258592:
                if(noCaseMatched_$switchVal331){
                    noCaseMatched_$switchVal331 = false;
                    if($isSubtypeOf($switchVal331.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_1444258592_5: 
                           do {
                               if($has_type_and_arity($switchVal331, M_ParseTree.Symbol_parameterized_sort_str_list_Symbol, 2)){
                                  IValue $arg0_344 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal331)),0));
                                  if($isComparable($arg0_344.getType(), $T1)){
                                     IValue $arg1_343 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal331)),1));
                                     if($isComparable($arg1_343.getType(), $T1)){
                                        final Template $template342 = (Template)new Template($RVF, "new NonTerminalStackNode<IConstructor>(");
                                        $template342.beginIndent("                                         ");
                                        $template342.addVal(itemId_4);
                                        $template342.endIndent("                                         ");
                                        $template342.addStr(", ");
                                        $template342.beginIndent("  ");
                                        $template342.addVal(dot_2);
                                        $template342.endIndent("  ");
                                        $template342.addStr(", \"");
                                        $template342.beginIndent("    ");
                                        $template342.addStr(((IString)(getParserMethodName(((IConstructor)sym_1), Util.kwpMap()))).getValue());
                                        $template342.endIndent("    ");
                                        $template342.addStr("\", ");
                                        $template342.beginIndent("    ");
                                        $template342.addStr(((IString)filters_7).getValue());
                                        $template342.endIndent("    ");
                                        $template342.addStr(")");
                                        return ((ITuple)($RVF.tuple(((IString)($template342.close())), ((IInteger)itemId_4))));
                                     
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 1206598288:
                if(noCaseMatched_$switchVal331){
                    noCaseMatched_$switchVal331 = false;
                    if($isSubtypeOf($switchVal331.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_1206598288_7: 
                           do {
                               if($has_type_and_arity($switchVal331, M_Type.Symbol_parameter_str_Symbol, 2)){
                                  IValue $arg0_350 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal331)),0));
                                  if($isComparable($arg0_350.getType(), $T1)){
                                     IValue $arg1_349 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal331)),1));
                                     if($isComparable($arg1_349.getType(), $T1)){
                                        final Template $template348 = (Template)new Template($RVF, "All parameters should have been instantiated by now: ");
                                        $template348.beginIndent("                                                     ");
                                        $template348.addVal(sym_1);
                                        $template348.endIndent("                                                     ");
                                        throw new Throw($template348.close());
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 757310344:
                if(noCaseMatched_$switchVal331){
                    noCaseMatched_$switchVal331 = false;
                    if($isSubtypeOf($switchVal331.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_757310344_10: 
                           do {
                               if($has_type_and_arity($switchVal331, M_ParseTree.Symbol_cilit_str, 1)){
                                  IValue $arg0_370 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal331)),0));
                                  if($isComparable($arg0_370.getType(), $T4)){
                                     IString l_31 = ((IString)($arg0_370));
                                     /*muExists*/IF66: 
                                         do {
                                             final IConstructor $subject_val364 = ((IConstructor)($amap_subscript(((IMap)(((IMap)($aadt_get_field(((IConstructor)grammar_0), "rules"))))),((IConstructor)(getType(((IConstructor)sym_1)))))));
                                             IF66_DESC27292:
                                             for(IValue $elem365 : new DescendantMatchIterator($subject_val364, 
                                                 new DescendantDescriptorAlwaysTrue($RVF.bool(false)))){
                                                 if($isComparable($elem365.getType(), M_ParseTree.ADT_Production)){
                                                    if($has_type_and_arity($elem365, M_ParseTree.Production_prod_Symbol_list_Symbol_set_Attr, 3)){
                                                       IValue $arg0_368 = (IValue)($subscript_int(((IValue)($elem365)),0));
                                                       if($isComparable($arg0_368.getType(), M_ParseTree.ADT_Symbol)){
                                                          if($has_type_and_arity($arg0_368, M_ParseTree.Symbol_cilit_str, 1)){
                                                             IValue $arg0_369 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_368)),0));
                                                             if($isComparable($arg0_369.getType(), $T4)){
                                                                if(($arg0_370 != null)){
                                                                   if($arg0_370.match($arg0_369)){
                                                                      IValue $arg1_367 = (IValue)($subscript_int(((IValue)($elem365)),1));
                                                                      if($isComparable($arg1_367.getType(), $T6)){
                                                                         if(true){
                                                                            IList chars_33 = ((IList)($arg1_367));
                                                                            IValue $arg2_366 = (IValue)($subscript_int(((IValue)($elem365)),2));
                                                                            if($isComparable($arg2_366.getType(), $T1)){
                                                                               IConstructor p_32 = ((IConstructor)($elem365));
                                                                               final Template $template363 = (Template)new Template($RVF, "new CaseInsensitiveLiteralStackNode<IConstructor>(");
                                                                               $template363.beginIndent("                                                    ");
                                                                               $template363.addVal(itemId_4);
                                                                               $template363.endIndent("                                                    ");
                                                                               $template363.addStr(", ");
                                                                               $template363.beginIndent("  ");
                                                                               $template363.addVal(dot_2);
                                                                               $template363.endIndent("  ");
                                                                               $template363.addStr(", ");
                                                                               $template363.beginIndent("  ");
                                                                               $template363.addStr(((IString)($me.value2id(((IValue)p_32)))).getValue());
                                                                               $template363.endIndent("  ");
                                                                               $template363.addStr(", new int[] {");
                                                                               $template363.beginIndent("             ");
                                                                               $template363.addStr(((IString)($me.literals2ints(((IList)($arg1_367))))).getValue());
                                                                               $template363.endIndent("             ");
                                                                               $template363.addStr("}, ");
                                                                               $template363.beginIndent("   ");
                                                                               $template363.addStr(((IString)filters_7).getValue());
                                                                               $template363.endIndent("   ");
                                                                               $template363.addStr(")");
                                                                               return ((ITuple)($RVF.tuple(((IString)($template363.close())), ((IInteger)itemId_4))));
                                                                            
                                                                            } else {
                                                                               continue IF66_DESC27292;
                                                                            }
                                                                         } else {
                                                                            continue IF66_DESC27292;
                                                                         }
                                                                      } else {
                                                                         continue IF66_DESC27292;
                                                                      }
                                                                   } else {
                                                                      continue IF66_DESC27292;
                                                                   }
                                                                } else {
                                                                   $arg0_370 = ((IValue)($arg0_369));
                                                                   IValue $arg1_367 = (IValue)($subscript_int(((IValue)($elem365)),1));
                                                                   if($isComparable($arg1_367.getType(), $T6)){
                                                                      if(true){
                                                                         IList chars_33 = ((IList)($arg1_367));
                                                                         IValue $arg2_366 = (IValue)($subscript_int(((IValue)($elem365)),2));
                                                                         if($isComparable($arg2_366.getType(), $T1)){
                                                                            IConstructor p_32 = ((IConstructor)($elem365));
                                                                            final Template $template363 = (Template)new Template($RVF, "new CaseInsensitiveLiteralStackNode<IConstructor>(");
                                                                            $template363.beginIndent("                                                    ");
                                                                            $template363.addVal(itemId_4);
                                                                            $template363.endIndent("                                                    ");
                                                                            $template363.addStr(", ");
                                                                            $template363.beginIndent("  ");
                                                                            $template363.addVal(dot_2);
                                                                            $template363.endIndent("  ");
                                                                            $template363.addStr(", ");
                                                                            $template363.beginIndent("  ");
                                                                            $template363.addStr(((IString)($me.value2id(((IValue)p_32)))).getValue());
                                                                            $template363.endIndent("  ");
                                                                            $template363.addStr(", new int[] {");
                                                                            $template363.beginIndent("             ");
                                                                            $template363.addStr(((IString)($me.literals2ints(((IList)($arg1_367))))).getValue());
                                                                            $template363.endIndent("             ");
                                                                            $template363.addStr("}, ");
                                                                            $template363.beginIndent("   ");
                                                                            $template363.addStr(((IString)filters_7).getValue());
                                                                            $template363.endIndent("   ");
                                                                            $template363.addStr(")");
                                                                            return ((ITuple)($RVF.tuple(((IString)($template363.close())), ((IInteger)itemId_4))));
                                                                         
                                                                         } else {
                                                                            continue IF66_DESC27292;
                                                                         }
                                                                      } else {
                                                                         continue IF66_DESC27292;
                                                                      }
                                                                   } else {
                                                                      continue IF66_DESC27292;
                                                                   }
                                                                }
                                                             } else {
                                                                continue IF66_DESC27292;
                                                             }
                                                          } else {
                                                             continue IF66_DESC27292;
                                                          }
                                                       } else {
                                                          continue IF66_DESC27292;
                                                       }
                                                    } else {
                                                       continue IF66_DESC27292;
                                                    }
                                                 } else {
                                                    continue IF66_DESC27292;
                                                 }
                                             }
                                             
                                                          
                                         } while(false);
                                     final Template $template362 = (Template)new Template($RVF, "ci-literal not found in grammar: ");
                                     $template362.beginIndent("                                 ");
                                     $template362.addVal(grammar_0);
                                     $template362.endIndent("                                 ");
                                     throw new Throw($template362.close());
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 856312:
                if(noCaseMatched_$switchVal331){
                    noCaseMatched_$switchVal331 = false;
                    if($isSubtypeOf($switchVal331.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_856312_2: 
                           do {
                               if($has_type_and_arity($switchVal331, M_ParseTree.Symbol_lex_str, 1)){
                                  IValue $arg0_337 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal331)),0));
                                  if($isComparable($arg0_337.getType(), $T1)){
                                     final Template $template336 = (Template)new Template($RVF, "new NonTerminalStackNode<IConstructor>(");
                                     $template336.beginIndent("                                         ");
                                     $template336.addVal(itemId_4);
                                     $template336.endIndent("                                         ");
                                     $template336.addStr(", ");
                                     $template336.beginIndent("  ");
                                     $template336.addVal(dot_2);
                                     $template336.endIndent("  ");
                                     $template336.addStr(", \"");
                                     $template336.beginIndent("    ");
                                     $template336.addStr(((IString)(getParserMethodName(((IConstructor)sym_1), Util.kwpMap()))).getValue());
                                     $template336.endIndent("    ");
                                     $template336.addStr("\", ");
                                     $template336.beginIndent("    ");
                                     $template336.addStr(((IString)filters_7).getValue());
                                     $template336.endIndent("    ");
                                     $template336.addStr(")");
                                     return ((ITuple)($RVF.tuple(((IString)($template336.close())), ((IInteger)itemId_4))));
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 1154855088:
                if(noCaseMatched_$switchVal331){
                    noCaseMatched_$switchVal331 = false;
                    if($isSubtypeOf($switchVal331.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_1154855088_6: 
                           do {
                               if($has_type_and_arity($switchVal331, M_ParseTree.Symbol_parameterized_lex_str_list_Symbol, 2)){
                                  IValue $arg0_347 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal331)),0));
                                  if($isComparable($arg0_347.getType(), $T1)){
                                     IValue $arg1_346 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal331)),1));
                                     if($isComparable($arg1_346.getType(), $T1)){
                                        final Template $template345 = (Template)new Template($RVF, "new NonTerminalStackNode<IConstructor>(");
                                        $template345.beginIndent("                                         ");
                                        $template345.addVal(itemId_4);
                                        $template345.endIndent("                                         ");
                                        $template345.addStr(", ");
                                        $template345.beginIndent("  ");
                                        $template345.addVal(dot_2);
                                        $template345.endIndent("  ");
                                        $template345.addStr(", \"");
                                        $template345.beginIndent("    ");
                                        $template345.addStr(((IString)(getParserMethodName(((IConstructor)sym_1), Util.kwpMap()))).getValue());
                                        $template345.endIndent("    ");
                                        $template345.addStr("\", ");
                                        $template345.beginIndent("    ");
                                        $template345.addStr(((IString)filters_7).getValue());
                                        $template345.endIndent("    ");
                                        $template345.addStr(")");
                                        return ((ITuple)($RVF.tuple(((IString)($template345.close())), ((IInteger)itemId_4))));
                                     
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 910072:
                if(noCaseMatched_$switchVal331){
                    noCaseMatched_$switchVal331 = false;
                    if($isSubtypeOf($switchVal331.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_910072_17: 
                           do {
                               if($has_type_and_arity($switchVal331, M_ParseTree.Symbol_seq_list_Symbol, 1)){
                                  IValue $arg0_389 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal331)),0));
                                  if($isComparable($arg0_389.getType(), $T6)){
                                     IList ss_47 = ((IList)($arg0_389));
                                     final Template $template388 = (Template)new Template($RVF, "new SequenceStackNode<IConstructor>(");
                                     $template388.beginIndent("                                      ");
                                     $template388.addVal(itemId_4);
                                     $template388.endIndent("                                      ");
                                     $template388.addStr(", ");
                                     $template388.beginIndent("  ");
                                     $template388.addVal(dot_2);
                                     $template388.endIndent("  ");
                                     $template388.addStr(", ");
                                     $template388.beginIndent("  ");
                                     $template388.addStr(((IString)($me.value2id(((IValue)($RVF.constructor(M_ParseTree.Production_regular_Symbol, new IValue[]{((IConstructor)sym_1)})))))).getValue());
                                     $template388.endIndent("  ");
                                     $template388.addStr(", (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{");
                                     $template388.beginIndent("                                                                ");
                                     $template388.addStr(((IString)($me.generateSequenceExpects(((IConstructor)grammar_0), ((IList)($arg0_389))))).getValue());
                                     $template388.endIndent("                                                                ");
                                     $template388.addStr("}, ");
                                     $template388.beginIndent("   ");
                                     $template388.addStr(((IString)filters_7).getValue());
                                     $template388.endIndent("   ");
                                     $template388.addStr(")");
                                     return ((ITuple)($RVF.tuple(((IString)($template388.close())), ((IInteger)itemId_4))));
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 826203960:
                if(noCaseMatched_$switchVal331){
                    noCaseMatched_$switchVal331 = false;
                    if($isSubtypeOf($switchVal331.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_826203960_12: 
                           do {
                               if($has_type_and_arity($switchVal331, M_ParseTree.Symbol_iter_star_Symbol, 1)){
                                  IValue $arg0_374 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal331)),0));
                                  if($isComparable($arg0_374.getType(), M_ParseTree.ADT_Symbol)){
                                     IConstructor s_35 = ((IConstructor)($arg0_374));
                                     final Template $template373 = (Template)new Template($RVF, "new ListStackNode<IConstructor>(");
                                     $template373.beginIndent("                                  ");
                                     $template373.addVal(itemId_4);
                                     $template373.endIndent("                                  ");
                                     $template373.addStr(", ");
                                     $template373.beginIndent("  ");
                                     $template373.addVal(dot_2);
                                     $template373.endIndent("  ");
                                     $template373.addStr(", ");
                                     $template373.beginIndent("  ");
                                     $template373.addStr(((IString)($me.value2id(((IValue)($RVF.constructor(M_ParseTree.Production_regular_Symbol, new IValue[]{((IConstructor)sym_1)})))))).getValue());
                                     $template373.endIndent("  ");
                                     $template373.addStr(", ");
                                     $template373.beginIndent("  ");
                                     $template373.addStr(((IString)($atuple_field_project((ITuple)((ITuple)($me.sym2newitem(((IConstructor)grammar_0), ((IConstructor)($arg0_374)), ((IInteger)$constants.get(19)/*0*/)))), ((IInteger)$constants.get(19)/*0*/)))).getValue());
                                     $template373.endIndent("  ");
                                     $template373.addStr(", false, ");
                                     $template373.beginIndent("         ");
                                     $template373.addStr(((IString)filters_7).getValue());
                                     $template373.endIndent("         ");
                                     $template373.addStr(")");
                                     return ((ITuple)($RVF.tuple(((IString)($template373.close())), ((IInteger)itemId_4))));
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 773448:
                if(noCaseMatched_$switchVal331){
                    noCaseMatched_$switchVal331 = false;
                    if($isSubtypeOf($switchVal331.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_773448_16: 
                           do {
                               if($has_type_and_arity($switchVal331, M_ParseTree.Symbol_alt_set_Symbol, 1)){
                                  IValue $arg0_387 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal331)),0));
                                  if($isComparable($arg0_387.getType(), $T0)){
                                     ISet as_44 = ((ISet)($arg0_387));
                                     final IListWriter $listwriter383 = (IListWriter)$RVF.listWriter();
                                     $LCOMP384_GEN29047:
                                     for(IValue $elem385_for : ((ISet)($arg0_387))){
                                         IConstructor $elem385 = (IConstructor) $elem385_for;
                                         IConstructor a_46 = null;
                                         $listwriter383.append($elem385);
                                     
                                     }
                                     
                                                 IList alts_45 = ((IList)($listwriter383.done()));
                                     final Template $template386 = (Template)new Template($RVF, "new AlternativeStackNode<IConstructor>(");
                                     $template386.beginIndent("                                         ");
                                     $template386.addVal(itemId_4);
                                     $template386.endIndent("                                         ");
                                     $template386.addStr(", ");
                                     $template386.beginIndent("  ");
                                     $template386.addVal(dot_2);
                                     $template386.endIndent("  ");
                                     $template386.addStr(", ");
                                     $template386.beginIndent("  ");
                                     $template386.addStr(((IString)($me.value2id(((IValue)($RVF.constructor(M_ParseTree.Production_regular_Symbol, new IValue[]{((IConstructor)sym_1)})))))).getValue());
                                     $template386.endIndent("  ");
                                     $template386.addStr(", (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{");
                                     $template386.beginIndent("                                                                ");
                                     $template386.addStr(((IString)($me.generateAltExpects(((IConstructor)grammar_0), ((IList)alts_45)))).getValue());
                                     $template386.endIndent("                                                                ");
                                     $template386.addStr("}, ");
                                     $template386.beginIndent("   ");
                                     $template386.addStr(((IString)filters_7).getValue());
                                     $template386.endIndent("   ");
                                     $template386.addStr(")");
                                     return ((ITuple)($RVF.tuple(((IString)($template386.close())), ((IInteger)itemId_4))));
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 1652184736:
                if(noCaseMatched_$switchVal331){
                    noCaseMatched_$switchVal331 = false;
                    if($isSubtypeOf($switchVal331.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_1652184736_13: 
                           do {
                               if($has_type_and_arity($switchVal331, M_ParseTree.Symbol_iter_seps_Symbol_list_Symbol, 2)){
                                  IValue $arg0_377 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal331)),0));
                                  if($isComparable($arg0_377.getType(), M_ParseTree.ADT_Symbol)){
                                     IConstructor s_36 = ((IConstructor)($arg0_377));
                                     IValue $arg1_376 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal331)),1));
                                     if($isComparable($arg1_376.getType(), $T6)){
                                        IList seps_37 = ((IList)($arg1_376));
                                        IConstructor reg_38 = ((IConstructor)($RVF.constructor(M_ParseTree.Production_regular_Symbol, new IValue[]{((IConstructor)sym_1)})));
                                        final Template $template375 = (Template)new Template($RVF, "new SeparatedListStackNode<IConstructor>(");
                                        $template375.beginIndent("                                           ");
                                        $template375.addVal(itemId_4);
                                        $template375.endIndent("                                           ");
                                        $template375.addStr(", ");
                                        $template375.beginIndent("  ");
                                        $template375.addVal(dot_2);
                                        $template375.endIndent("  ");
                                        $template375.addStr(", ");
                                        $template375.beginIndent("  ");
                                        $template375.addStr(((IString)($me.value2id(((IValue)reg_38)))).getValue());
                                        $template375.endIndent("  ");
                                        $template375.addStr(", ");
                                        $template375.beginIndent("  ");
                                        $template375.addStr(((IString)($atuple_field_project((ITuple)((ITuple)($me.sym2newitem(((IConstructor)grammar_0), ((IConstructor)($arg0_377)), ((IInteger)$constants.get(19)/*0*/)))), ((IInteger)$constants.get(19)/*0*/)))).getValue());
                                        $template375.endIndent("  ");
                                        $template375.addStr(", (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{");
                                        $template375.beginIndent("                                                                ");
                                        $template375.addStr(((IString)($me.generateSeparatorExpects(((IConstructor)grammar_0), ((IList)($arg1_376))))).getValue());
                                        $template375.endIndent("                                                                ");
                                        $template375.addStr("}, true, ");
                                        $template375.beginIndent("         ");
                                        $template375.addStr(((IString)filters_7).getValue());
                                        $template375.endIndent("         ");
                                        $template375.addStr(")");
                                        return ((ITuple)($RVF.tuple(((IString)($template375.close())), ((IInteger)itemId_4))));
                                     
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case -333228984:
                if(noCaseMatched_$switchVal331){
                    noCaseMatched_$switchVal331 = false;
                    if($isSubtypeOf($switchVal331.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_333228984_4: 
                           do {
                               if($has_type_and_arity($switchVal331, M_ParseTree.Symbol_layouts_str, 1)){
                                  IValue $arg0_341 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal331)),0));
                                  if($isComparable($arg0_341.getType(), $T1)){
                                     final Template $template340 = (Template)new Template($RVF, "new NonTerminalStackNode<IConstructor>(");
                                     $template340.beginIndent("                                         ");
                                     $template340.addVal(itemId_4);
                                     $template340.endIndent("                                         ");
                                     $template340.addStr(", ");
                                     $template340.beginIndent("  ");
                                     $template340.addVal(dot_2);
                                     $template340.endIndent("  ");
                                     $template340.addStr(", \"");
                                     $template340.beginIndent("    ");
                                     $template340.addStr(((IString)(getParserMethodName(((IConstructor)sym_1), Util.kwpMap()))).getValue());
                                     $template340.endIndent("    ");
                                     $template340.addStr("\", ");
                                     $template340.beginIndent("    ");
                                     $template340.addStr(((IString)filters_7).getValue());
                                     $template340.endIndent("    ");
                                     $template340.addStr(")");
                                     return ((ITuple)($RVF.tuple(((IString)($template340.close())), ((IInteger)itemId_4))));
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 0:
                if(noCaseMatched_$switchVal331){
                    noCaseMatched_$switchVal331 = false;
                    
                }
                
        
            case -1948270072:
                if(noCaseMatched_$switchVal331){
                    noCaseMatched_$switchVal331 = false;
                    if($isSubtypeOf($switchVal331.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_1948270072_18: 
                           do {
                               if($has_type_and_arity($switchVal331, M_ParseTree.Symbol_char_class_list_CharRange, 1)){
                                  IValue $arg0_391 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal331)),0));
                                  if($isComparable($arg0_391.getType(), $T11)){
                                     IList ranges_48 = ((IList)($arg0_391));
                                     final Template $template390 = (Template)new Template($RVF, "new CharStackNode<IConstructor>(");
                                     $template390.beginIndent("                                  ");
                                     $template390.addVal(itemId_4);
                                     $template390.endIndent("                                  ");
                                     $template390.addStr(", ");
                                     $template390.beginIndent("  ");
                                     $template390.addVal(dot_2);
                                     $template390.endIndent("  ");
                                     $template390.addStr(", new int[][]{");
                                     $template390.beginIndent("              ");
                                     $template390.addStr(((IString)($me.generateCharClassArrays(((IList)($arg0_391))))).getValue());
                                     $template390.endIndent("              ");
                                     $template390.addStr("}, ");
                                     $template390.beginIndent("   ");
                                     $template390.addStr(((IString)filters_7).getValue());
                                     $template390.endIndent("   ");
                                     $template390.addStr(")");
                                     return ((ITuple)($RVF.tuple(((IString)($template390.close())), ((IInteger)itemId_4))));
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 857272:
                if(noCaseMatched_$switchVal331){
                    noCaseMatched_$switchVal331 = false;
                    if($isSubtypeOf($switchVal331.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_857272_9: 
                           do {
                               if($has_type_and_arity($switchVal331, M_ParseTree.Symbol_lit_str, 1)){
                                  IValue $arg0_361 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal331)),0));
                                  if($isComparable($arg0_361.getType(), $T4)){
                                     IString l_28 = ((IString)($arg0_361));
                                     /*muExists*/IF65: 
                                         do {
                                             final IConstructor $subject_val355 = ((IConstructor)($amap_subscript(((IMap)(((IMap)($aadt_get_field(((IConstructor)grammar_0), "rules"))))),((IConstructor)(getType(((IConstructor)sym_1)))))));
                                             IF65_DESC26947:
                                             for(IValue $elem356 : new DescendantMatchIterator($subject_val355, 
                                                 new DescendantDescriptorAlwaysTrue($RVF.bool(false)))){
                                                 if($isComparable($elem356.getType(), M_ParseTree.ADT_Production)){
                                                    if($has_type_and_arity($elem356, M_ParseTree.Production_prod_Symbol_list_Symbol_set_Attr, 3)){
                                                       IValue $arg0_359 = (IValue)($subscript_int(((IValue)($elem356)),0));
                                                       if($isComparable($arg0_359.getType(), M_ParseTree.ADT_Symbol)){
                                                          if($has_type_and_arity($arg0_359, M_ParseTree.Symbol_lit_str, 1)){
                                                             IValue $arg0_360 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_359)),0));
                                                             if($isComparable($arg0_360.getType(), $T4)){
                                                                if(($arg0_361 != null)){
                                                                   if($arg0_361.match($arg0_360)){
                                                                      IValue $arg1_358 = (IValue)($subscript_int(((IValue)($elem356)),1));
                                                                      if($isComparable($arg1_358.getType(), $T6)){
                                                                         if(true){
                                                                            IList chars_30 = ((IList)($arg1_358));
                                                                            IValue $arg2_357 = (IValue)($subscript_int(((IValue)($elem356)),2));
                                                                            if($isComparable($arg2_357.getType(), $T1)){
                                                                               IConstructor p_29 = ((IConstructor)($elem356));
                                                                               final Template $template354 = (Template)new Template($RVF, "new LiteralStackNode<IConstructor>(");
                                                                               $template354.beginIndent("                                     ");
                                                                               $template354.addVal(itemId_4);
                                                                               $template354.endIndent("                                     ");
                                                                               $template354.addStr(", ");
                                                                               $template354.beginIndent("  ");
                                                                               $template354.addVal(dot_2);
                                                                               $template354.endIndent("  ");
                                                                               $template354.addStr(", ");
                                                                               $template354.beginIndent("  ");
                                                                               $template354.addStr(((IString)($me.value2id(((IValue)p_29)))).getValue());
                                                                               $template354.endIndent("  ");
                                                                               $template354.addStr(", new int[] {");
                                                                               $template354.beginIndent("             ");
                                                                               $template354.addStr(((IString)($me.literals2ints(((IList)($arg1_358))))).getValue());
                                                                               $template354.endIndent("             ");
                                                                               $template354.addStr("}, ");
                                                                               $template354.beginIndent("   ");
                                                                               $template354.addStr(((IString)filters_7).getValue());
                                                                               $template354.endIndent("   ");
                                                                               $template354.addStr(")");
                                                                               return ((ITuple)($RVF.tuple(((IString)($template354.close())), ((IInteger)itemId_4))));
                                                                            
                                                                            } else {
                                                                               continue IF65_DESC26947;
                                                                            }
                                                                         } else {
                                                                            continue IF65_DESC26947;
                                                                         }
                                                                      } else {
                                                                         continue IF65_DESC26947;
                                                                      }
                                                                   } else {
                                                                      continue IF65_DESC26947;
                                                                   }
                                                                } else {
                                                                   $arg0_361 = ((IValue)($arg0_360));
                                                                   IValue $arg1_358 = (IValue)($subscript_int(((IValue)($elem356)),1));
                                                                   if($isComparable($arg1_358.getType(), $T6)){
                                                                      if(true){
                                                                         IList chars_30 = ((IList)($arg1_358));
                                                                         IValue $arg2_357 = (IValue)($subscript_int(((IValue)($elem356)),2));
                                                                         if($isComparable($arg2_357.getType(), $T1)){
                                                                            IConstructor p_29 = ((IConstructor)($elem356));
                                                                            final Template $template354 = (Template)new Template($RVF, "new LiteralStackNode<IConstructor>(");
                                                                            $template354.beginIndent("                                     ");
                                                                            $template354.addVal(itemId_4);
                                                                            $template354.endIndent("                                     ");
                                                                            $template354.addStr(", ");
                                                                            $template354.beginIndent("  ");
                                                                            $template354.addVal(dot_2);
                                                                            $template354.endIndent("  ");
                                                                            $template354.addStr(", ");
                                                                            $template354.beginIndent("  ");
                                                                            $template354.addStr(((IString)($me.value2id(((IValue)p_29)))).getValue());
                                                                            $template354.endIndent("  ");
                                                                            $template354.addStr(", new int[] {");
                                                                            $template354.beginIndent("             ");
                                                                            $template354.addStr(((IString)($me.literals2ints(((IList)($arg1_358))))).getValue());
                                                                            $template354.endIndent("             ");
                                                                            $template354.addStr("}, ");
                                                                            $template354.beginIndent("   ");
                                                                            $template354.addStr(((IString)filters_7).getValue());
                                                                            $template354.endIndent("   ");
                                                                            $template354.addStr(")");
                                                                            return ((ITuple)($RVF.tuple(((IString)($template354.close())), ((IInteger)itemId_4))));
                                                                         
                                                                         } else {
                                                                            continue IF65_DESC26947;
                                                                         }
                                                                      } else {
                                                                         continue IF65_DESC26947;
                                                                      }
                                                                   } else {
                                                                      continue IF65_DESC26947;
                                                                   }
                                                                }
                                                             } else {
                                                                continue IF65_DESC26947;
                                                             }
                                                          } else {
                                                             continue IF65_DESC26947;
                                                          }
                                                       } else {
                                                          continue IF65_DESC26947;
                                                       }
                                                    } else {
                                                       continue IF65_DESC26947;
                                                    }
                                                 } else {
                                                    continue IF65_DESC26947;
                                                 }
                                             }
                                             
                                                          
                                         } while(false);
                                     final Template $template353 = (Template)new Template($RVF, "literal not found in grammar: ");
                                     $template353.beginIndent("                              ");
                                     $template353.addVal(grammar_0);
                                     $template353.endIndent("                              ");
                                     throw new Throw($template353.close());
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case -109773488:
                if(noCaseMatched_$switchVal331){
                    noCaseMatched_$switchVal331 = false;
                    if($isSubtypeOf($switchVal331.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_109773488_3: 
                           do {
                               if($has_type_and_arity($switchVal331, M_ParseTree.Symbol_keywords_str, 1)){
                                  IValue $arg0_339 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal331)),0));
                                  if($isComparable($arg0_339.getType(), $T1)){
                                     final Template $template338 = (Template)new Template($RVF, "new NonTerminalStackNode<IConstructor>(");
                                     $template338.beginIndent("                                         ");
                                     $template338.addVal(itemId_4);
                                     $template338.endIndent("                                         ");
                                     $template338.addStr(", ");
                                     $template338.beginIndent("  ");
                                     $template338.addVal(dot_2);
                                     $template338.endIndent("  ");
                                     $template338.addStr(", \"");
                                     $template338.beginIndent("    ");
                                     $template338.addStr(((IString)(getParserMethodName(((IConstructor)sym_1), Util.kwpMap()))).getValue());
                                     $template338.endIndent("    ");
                                     $template338.addStr("\", ");
                                     $template338.beginIndent("    ");
                                     $template338.addStr(((IString)filters_7).getValue());
                                     $template338.endIndent("    ");
                                     $template338.addStr(")");
                                     return ((ITuple)($RVF.tuple(((IString)($template338.close())), ((IInteger)itemId_4))));
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 25942208:
                if(noCaseMatched_$switchVal331){
                    noCaseMatched_$switchVal331 = false;
                    if($isSubtypeOf($switchVal331.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_25942208_11: 
                           do {
                               if($has_type_and_arity($switchVal331, M_ParseTree.Symbol_iter_Symbol, 1)){
                                  IValue $arg0_372 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal331)),0));
                                  if($isComparable($arg0_372.getType(), M_ParseTree.ADT_Symbol)){
                                     IConstructor s_34 = ((IConstructor)($arg0_372));
                                     final Template $template371 = (Template)new Template($RVF, "new ListStackNode<IConstructor>(");
                                     $template371.beginIndent("                                  ");
                                     $template371.addVal(itemId_4);
                                     $template371.endIndent("                                  ");
                                     $template371.addStr(", ");
                                     $template371.beginIndent("  ");
                                     $template371.addVal(dot_2);
                                     $template371.endIndent("  ");
                                     $template371.addStr(", ");
                                     $template371.beginIndent("  ");
                                     $template371.addStr(((IString)($me.value2id(((IValue)($RVF.constructor(M_ParseTree.Production_regular_Symbol, new IValue[]{((IConstructor)sym_1)})))))).getValue());
                                     $template371.endIndent("  ");
                                     $template371.addStr(", ");
                                     $template371.beginIndent("  ");
                                     $template371.addStr(((IString)($atuple_field_project((ITuple)((ITuple)($me.sym2newitem(((IConstructor)grammar_0), ((IConstructor)($arg0_372)), ((IInteger)$constants.get(19)/*0*/)))), ((IInteger)$constants.get(19)/*0*/)))).getValue());
                                     $template371.endIndent("  ");
                                     $template371.addStr(", true, ");
                                     $template371.beginIndent("        ");
                                     $template371.addStr(((IString)filters_7).getValue());
                                     $template371.endIndent("        ");
                                     $template371.addStr(")");
                                     return ((ITuple)($RVF.tuple(((IString)($template371.close())), ((IInteger)itemId_4))));
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 878060304:
                if(noCaseMatched_$switchVal331){
                    noCaseMatched_$switchVal331 = false;
                    if($isSubtypeOf($switchVal331.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_878060304_8: 
                           do {
                               if($has_type_and_arity($switchVal331, M_ParseTree.Symbol_start_Symbol, 1)){
                                  IValue $arg0_352 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal331)),0));
                                  if($isComparable($arg0_352.getType(), $T1)){
                                     final Template $template351 = (Template)new Template($RVF, "new NonTerminalStackNode<IConstructor>(");
                                     $template351.beginIndent("                                         ");
                                     $template351.addVal(itemId_4);
                                     $template351.endIndent("                                         ");
                                     $template351.addStr(", ");
                                     $template351.beginIndent("  ");
                                     $template351.addVal(dot_2);
                                     $template351.endIndent("  ");
                                     $template351.addStr(", ");
                                     $template351.beginIndent("  ");
                                     $template351.addStr(((IString)(getParserMethodName(((IConstructor)sym_1), Util.kwpMap()))).getValue());
                                     $template351.endIndent("  ");
                                     $template351.addStr("\", ");
                                     $template351.beginIndent("    ");
                                     $template351.addStr(((IString)filters_7).getValue());
                                     $template351.endIndent("    ");
                                     $template351.addStr(")");
                                     return ((ITuple)($RVF.tuple(((IString)($template351.close())), ((IInteger)itemId_4))));
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 882072:
                if(noCaseMatched_$switchVal331){
                    noCaseMatched_$switchVal331 = false;
                    if($isSubtypeOf($switchVal331.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_882072_15: 
                           do {
                               if($has_type_and_arity($switchVal331, M_ParseTree.Symbol_opt_Symbol, 1)){
                                  IValue $arg0_382 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal331)),0));
                                  if($isComparable($arg0_382.getType(), M_ParseTree.ADT_Symbol)){
                                     IConstructor s_42 = ((IConstructor)($arg0_382));
                                     IConstructor reg_43 = ((IConstructor)($RVF.constructor(M_ParseTree.Production_regular_Symbol, new IValue[]{((IConstructor)sym_1)})));
                                     final Template $template381 = (Template)new Template($RVF, "new OptionalStackNode<IConstructor>(");
                                     $template381.beginIndent("                                      ");
                                     $template381.addVal(itemId_4);
                                     $template381.endIndent("                                      ");
                                     $template381.addStr(", ");
                                     $template381.beginIndent("  ");
                                     $template381.addVal(dot_2);
                                     $template381.endIndent("  ");
                                     $template381.addStr(", ");
                                     $template381.beginIndent("  ");
                                     $template381.addStr(((IString)($me.value2id(((IValue)reg_43)))).getValue());
                                     $template381.endIndent("  ");
                                     $template381.addStr(", ");
                                     $template381.beginIndent("  ");
                                     $template381.addStr(((IString)($atuple_field_project((ITuple)((ITuple)($me.sym2newitem(((IConstructor)grammar_0), ((IConstructor)($arg0_382)), ((IInteger)$constants.get(19)/*0*/)))), ((IInteger)$constants.get(19)/*0*/)))).getValue());
                                     $template381.endIndent("  ");
                                     $template381.addStr(", ");
                                     $template381.beginIndent("  ");
                                     $template381.addStr(((IString)filters_7).getValue());
                                     $template381.endIndent("  ");
                                     $template381.addStr(")");
                                     return ((ITuple)($RVF.tuple(((IString)($template381.close())), ((IInteger)itemId_4))));
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 28290288:
                if(noCaseMatched_$switchVal331){
                    noCaseMatched_$switchVal331 = false;
                    if($isSubtypeOf($switchVal331.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_28290288_0: 
                           do {
                               if($has_type_and_arity($switchVal331, M_ParseTree.Symbol_sort_str, 1)){
                                  IValue $arg0_335 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal331)),0));
                                  if($isComparable($arg0_335.getType(), $T1)){
                                     final Template $template334 = (Template)new Template($RVF, "new NonTerminalStackNode<IConstructor>(");
                                     $template334.beginIndent("                                         ");
                                     $template334.addVal(itemId_4);
                                     $template334.endIndent("                                         ");
                                     $template334.addStr(", ");
                                     $template334.beginIndent("  ");
                                     $template334.addVal(dot_2);
                                     $template334.endIndent("  ");
                                     $template334.addStr(", \"");
                                     $template334.beginIndent("    ");
                                     $template334.addStr(((IString)(getParserMethodName(((IConstructor)sym_1), Util.kwpMap()))).getValue());
                                     $template334.endIndent("    ");
                                     $template334.addStr("\", ");
                                     $template334.beginIndent("    ");
                                     $template334.addStr(((IString)filters_7).getValue());
                                     $template334.endIndent("    ");
                                     $template334.addStr(")");
                                     return ((ITuple)($RVF.tuple(((IString)($template334.close())), ((IInteger)itemId_4))));
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            default: if($isSubtypeOf($switchVal331.getType(),M_ParseTree.ADT_Symbol)){
                        /*muExists*/CASE_0_1: 
                            do {
                                if($has_type_and_arity($switchVal331, M_ParseTree.Symbol_empty_, 0)){
                                   final Template $template333 = (Template)new Template($RVF, "new EmptyStackNode<IConstructor>(");
                                   $template333.beginIndent("                                   ");
                                   $template333.addVal(itemId_4);
                                   $template333.endIndent("                                   ");
                                   $template333.addStr(", ");
                                   $template333.beginIndent("  ");
                                   $template333.addVal(dot_2);
                                   $template333.endIndent("  ");
                                   $template333.addStr(", ");
                                   $template333.beginIndent("  ");
                                   $template333.addStr(((IString)($me.value2id(((IValue)($RVF.constructor(M_ParseTree.Production_regular_Symbol, new IValue[]{((IConstructor)sym_1)})))))).getValue());
                                   $template333.endIndent("  ");
                                   $template333.addStr(", ");
                                   $template333.beginIndent("  ");
                                   $template333.addStr(((IString)filters_7).getValue());
                                   $template333.endIndent("  ");
                                   $template333.addStr(")");
                                   return ((ITuple)($RVF.tuple(((IString)($template333.close())), ((IInteger)itemId_4))));
                                
                                }
                        
                            } while(false);
                     
                     }
                     final Template $template332 = (Template)new Template($RVF, "unexpected symbol ");
                     $template332.beginIndent("                  ");
                     $template332.addVal(sym_1);
                     $template332.endIndent("                  ");
                     $template332.addStr(" while generating parser code");
                     throw new Throw($template332.close());
        }
        
                   
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(29883,290,<625,0>,<633,1>) 
    public IString generateCharClassArrays$d069c937b5f855f9(IList ranges_0){ 
        
        
        if((((IBool)($equal(((IList)ranges_0), ((IList)$constants.get(31)/*[]*/))))).getValue()){
           return ((IString)$constants.get(37)/*""*/);
        
        }
        IString result_1 = ((IString)$constants.get(37)/*""*/);
        final IConstructor $subject_val393 = ((IConstructor)(M_List.head(((IList)ranges_0))));
        if($has_type_and_arity($subject_val393, M_ParseTree.CharRange_range_int_int, 2)){
           IValue $arg0_395 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val393)),0));
           if($isComparable($arg0_395.getType(), $T7)){
              IInteger from_2 = null;
              IValue $arg1_394 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val393)),1));
              if($isComparable($arg1_394.getType(), $T7)){
                 IInteger $to_3 = null;
                 final Template $template392 = (Template)new Template($RVF, "{");
                 $template392.beginIndent(" ");
                 $template392.addVal($arg0_395);
                 $template392.endIndent(" ");
                 $template392.addStr(",");
                 $template392.beginIndent(" ");
                 $template392.addVal($arg1_394);
                 $template392.endIndent(" ");
                 $template392.addStr("}");
                 result_1 = ((IString)($astr_add_astr(((IString)result_1),((IString)($template392.close())))));
              
              }
           
           }
        
        }
        /*muExists*/FOR69: 
            do {
                /*muExists*/FOR69_GEN30081_CONS_range: 
                    do {
                        FOR69_GEN30081:
                        for(IValue $elem397_for : ((IList)(M_List.tail(((IList)ranges_0))))){
                            IConstructor $elem397 = (IConstructor) $elem397_for;
                            if($has_type_and_arity($elem397, M_ParseTree.CharRange_range_int_int, 2)){
                               IValue $arg0_399 = (IValue)($aadt_subscript_int(((IConstructor)($elem397)),0));
                               if($isComparable($arg0_399.getType(), $T7)){
                                  IInteger from_4 = null;
                                  IValue $arg1_398 = (IValue)($aadt_subscript_int(((IConstructor)($elem397)),1));
                                  if($isComparable($arg1_398.getType(), $T7)){
                                     IInteger $to_5 = null;
                                     final Template $template396 = (Template)new Template($RVF, ",{");
                                     $template396.beginIndent("  ");
                                     $template396.addVal($arg0_399);
                                     $template396.endIndent("  ");
                                     $template396.addStr(",");
                                     $template396.beginIndent(" ");
                                     $template396.addVal($arg1_398);
                                     $template396.endIndent(" ");
                                     $template396.addStr("}");
                                     result_1 = ((IString)($astr_add_astr(((IString)result_1),((IString)($template396.close())))));
                                  
                                  } else {
                                     continue FOR69_GEN30081;
                                  }
                               } else {
                                  continue FOR69_GEN30081;
                               }
                            } else {
                               continue FOR69_GEN30081;
                            }
                        }
                        continue FOR69;
                                    
                    } while(false);
        
            } while(false);
        /* void:  muCon([]) */return ((IString)result_1);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(30177,52,<635,0>,<637,1>) 
    public IString esc$ff62cb0f1d0b4eca(IConstructor s_0){ 
        
        
        final Template $template400 = (Template)new Template($RVF, "");
        $template400.addVal(s_0);
        return ((IString)($me.esc(((IString)($template400.close())))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(30347,67,<641,0>,<643,1>) 
    public IString esc$c38f01ee7e9a3d64(IString s_0){ 
        
        
        return ((IString)(M_String.escape(((IString)s_0), ((IMap)javaStringEscapes))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(30573,65,<647,0>,<649,1>) 
    public IString escId$0579c21bf1a62ae0(IString s_0){ 
        
        
        return ((IString)(M_String.escape(((IString)s_0), ((IMap)javaIdEscapes))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(30642,185,<651,0>,<657,1>) 
    public IString sym2name$998ae8a0fd447728(IConstructor s_0){ 
        
        
        final IConstructor $switchVal401 = ((IConstructor)s_0);
        boolean noCaseMatched_$switchVal401 = true;
        SWITCH70: switch(Fingerprint.getFingerprint($switchVal401)){
        
            case 1643638592:
                if(noCaseMatched_$switchVal401){
                    noCaseMatched_$switchVal401 = false;
                    if($isSubtypeOf($switchVal401.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_1643638592_1: 
                           do {
                               if($has_type_and_arity($switchVal401, M_Type.Symbol_label_str_Symbol, 2)){
                                  IValue $arg0_405 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal401)),0));
                                  if($isComparable($arg0_405.getType(), $T1)){
                                     IValue $arg1_404 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal401)),1));
                                     if($isComparable($arg1_404.getType(), M_ParseTree.ADT_Symbol)){
                                        IConstructor x_2 = ((IConstructor)($arg1_404));
                                        return ((IString)($me.sym2name(((IConstructor)($arg1_404)))));
                                     
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 28290288:
                if(noCaseMatched_$switchVal401){
                    noCaseMatched_$switchVal401 = false;
                    if($isSubtypeOf($switchVal401.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_28290288_0: 
                           do {
                               if($has_type_and_arity($switchVal401, M_ParseTree.Symbol_sort_str, 1)){
                                  IValue $arg0_403 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal401)),0));
                                  if($isComparable($arg0_403.getType(), $T4)){
                                     IString x_1 = null;
                                     final Template $template402 = (Template)new Template($RVF, "");
                                     $template402.addStr(((IString)($arg0_403)).getValue());
                                     return ((IString)($template402.close()));
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            default: return ((IString)($me.value2id(((IValue)s_0))));
        }
        
                   
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(30831,58,<659,0>,<662,1>) 
    public IString value2id$8728571069fac63e(IValue v_0){ 
        
        
        return ((IString)($me.v2i(((IValue)v_0))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(30893,81,<664,0>,<664,81>) 
    public IString uu$e34dca19232e21a6(IValue s_0){ 
        
        
        final Template $template406 = (Template)new Template($RVF, "");
        $template406.addVal(M_Node.unsetRec(((IValue)s_0)));
        return ((IString)(M_String.escape(((IString)(M_String.toBase64(((IString)($template406.close())), Util.kwpMap()))), ((IMap)$constants.get(43)/*("+":"11","/":"22","=":"00")*/))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(30978,2203,<666,0>,<695,1>) 
    public IString v2i$f9cb5e177efa6f97(IValue v_0){ 
        
        
        final IValue $switchVal407 = ((IValue)v_0);
        boolean noCaseMatched_$switchVal407 = true;
        SWITCH71: switch(Fingerprint.getFingerprint($switchVal407)){
        
            case 1643638592:
                if(noCaseMatched_$switchVal407){
                    noCaseMatched_$switchVal407 = false;
                    if($isSubtypeOf($switchVal407.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_1643638592_2: 
                           do {
                               if($has_type_and_arity($switchVal407, M_Type.Symbol_label_str_Symbol, 2)){
                                  IValue $arg0_424 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),0));
                                  if($isComparable($arg0_424.getType(), $T4)){
                                     IValue $arg1_423 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),1));
                                     if($isComparable($arg1_423.getType(), M_ParseTree.ADT_Symbol)){
                                        IConstructor u_5 = ((IConstructor)($arg1_423));
                                        return ((IString)($me.v2i(((IValue)($arg1_423)))));
                                     
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case -964239440:
                if(noCaseMatched_$switchVal407){
                    noCaseMatched_$switchVal407 = false;
                    if($isSubtypeOf($switchVal407.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_964239440_7: 
                           do {
                               if($has_type_and_arity($switchVal407, M_ParseTree.Symbol_iter_star_seps_Symbol_list_Symbol, 2)){
                                  IValue $arg0_440 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),0));
                                  if($isComparable($arg0_440.getType(), M_ParseTree.ADT_Symbol)){
                                     IConstructor s_10 = ((IConstructor)($arg0_440));
                                     IValue $arg1_438 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),1));
                                     if($isComparable($arg1_438.getType(), $T33)){
                                        final IList $subject439 = ((IList)($arg1_438));
                                        int $subject439_cursor = 0;
                                        if($isSubtypeOf($subject439.getType(),$T33)){
                                           final int $subject439_len = (int)((IList)($subject439)).length();
                                           if($subject439_len == 1){
                                              if($subject439_cursor < $subject439_len){
                                                 IConstructor sep_11 = ((IConstructor)($alist_subscript_int(((IList)($subject439)),$subject439_cursor)));
                                                 $subject439_cursor += 1;
                                                 if($subject439_cursor == $subject439_len){
                                                    final Template $template437 = (Template)new Template($RVF, "_iter_star_seps_");
                                                    $template437.beginIndent("                ");
                                                    $template437.addStr(((IString)($me.v2i(((IValue)($arg0_440))))).getValue());
                                                    $template437.endIndent("                ");
                                                    $template437.addStr("_");
                                                    $template437.beginIndent(" ");
                                                    $template437.addStr(((IString)($me.v2i(((IValue)sep_11)))).getValue());
                                                    $template437.endIndent(" ");
                                                    return ((IString)($template437.close()));
                                                 
                                                 } else {
                                                    continue CASE_964239440_7;/*list match1*/
                                                 }
                                              }
                                           
                                           }
                                        
                                        }
                                     
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
                    if($isSubtypeOf($switchVal407.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_964239440_9: 
                           do {
                               if($has_type_and_arity($switchVal407, M_ParseTree.Symbol_iter_star_seps_Symbol_list_Symbol, 2)){
                                  IValue $arg0_448 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),0));
                                  if($isComparable($arg0_448.getType(), M_ParseTree.ADT_Symbol)){
                                     IConstructor s_15 = ((IConstructor)($arg0_448));
                                     IValue $arg1_447 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),1));
                                     if($isComparable($arg1_447.getType(), $T6)){
                                        IList seps_16 = ((IList)($arg1_447));
                                        final Template $template445 = (Template)new Template($RVF, "_iter_star_seps_");
                                        $template445.beginIndent("                ");
                                        $template445.addStr(((IString)($me.v2i(((IValue)($arg0_448))))).getValue());
                                        $template445.endIndent("                ");
                                        $template445.addStr("_");
                                        /*muExists*/LAB74: 
                                            do {
                                                LAB74_GEN32194:
                                                for(IValue $elem446_for : ((IList)($arg1_447))){
                                                    IConstructor $elem446 = (IConstructor) $elem446_for;
                                                    IValue elem_17 = ((IValue)($elem446));
                                                    ;$template445.addStr(((IString)($me.v2i(((IValue)elem_17)))).getValue());
                                                    $template445.addStr("_");
                                                
                                                }
                                                continue LAB74;
                                                            
                                            } while(false);
                                        return ((IString)($astr_slice(((IString)($template445.close())), null, null, -1)));
                                     
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 1444258592:
                if(noCaseMatched_$switchVal407){
                    noCaseMatched_$switchVal407 = false;
                    if($isSubtypeOf($switchVal407.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_1444258592_15: 
                           do {
                               if($has_type_and_arity($switchVal407, M_ParseTree.Symbol_parameterized_sort_str_list_Symbol, 2)){
                                  IValue $arg0_460 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),0));
                                  if($isComparable($arg0_460.getType(), $T4)){
                                     IString s_23 = ((IString)($arg0_460));
                                     IValue $arg1_459 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),1));
                                     if($isComparable($arg1_459.getType(), $T6)){
                                        IList args_24 = ((IList)($arg1_459));
                                        final Template $template458 = (Template)new Template($RVF, "");
                                        $template458.addStr(((IString)($arg0_460)).getValue());
                                        $template458.addStr("_");
                                        $template458.beginIndent(" ");
                                        $template458.addStr(((IString)($me.uu(((IValue)($arg1_459))))).getValue());
                                        $template458.endIndent(" ");
                                        return ((IString)($template458.close()));
                                     
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 878060304:
                if(noCaseMatched_$switchVal407){
                    noCaseMatched_$switchVal407 = false;
                    if($isSubtypeOf($switchVal407.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_878060304_0: 
                           do {
                               if($has_type_and_arity($switchVal407, M_ParseTree.Symbol_start_Symbol, 1)){
                                  IValue $arg0_416 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),0));
                                  if($isComparable($arg0_416.getType(), M_ParseTree.ADT_Symbol)){
                                     IConstructor s_1 = ((IConstructor)($arg0_416));
                                     final Template $template415 = (Template)new Template($RVF, "start__");
                                     $template415.beginIndent("       ");
                                     $template415.addStr(((IString)($me.v2i(((IValue)($arg0_416))))).getValue());
                                     $template415.endIndent("       ");
                                     return ((IString)($template415.close()));
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 757310344:
                if(noCaseMatched_$switchVal407){
                    noCaseMatched_$switchVal407 = false;
                    if($isSubtypeOf($switchVal407.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_757310344_17: 
                           do {
                               if($has_type_and_arity($switchVal407, M_ParseTree.Symbol_cilit_str, 1)){
                                  IValue $arg0_465 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),0));
                                  if($isComparable($arg0_465.getType(), $T4)){
                                     final Matcher $matcher466 = (Matcher)$regExpCompile("(^[A-Za-z0-9\\-\\_]+$)", ((IString)($arg0_465)).getValue());
                                     boolean $found467 = true;
                                     
                                         while($found467){
                                             $found467 = $matcher466.find();
                                             if($found467){
                                                IString s_27 = ((IString)($RVF.string($matcher466.group(1))));
                                                final Template $template464 = (Template)new Template($RVF, "cilit_");
                                                $template464.beginIndent("      ");
                                                $template464.addStr(((IString)($me.escId(((IString)s_27)))).getValue());
                                                $template464.endIndent("      ");
                                                return ((IString)($template464.close()));
                                             
                                             }
                                     
                                         }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 856312:
                if(noCaseMatched_$switchVal407){
                    noCaseMatched_$switchVal407 = false;
                    if($isSubtypeOf($switchVal407.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_856312_12: 
                           do {
                               if($has_type_and_arity($switchVal407, M_ParseTree.Symbol_lex_str, 1)){
                                  IValue $arg0_455 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),0));
                                  if($isComparable($arg0_455.getType(), $T4)){
                                     IString s_21 = null;
                                     final Template $template454 = (Template)new Template($RVF, "");
                                     $template454.addStr(((IString)($arg0_455)).getValue());
                                     return ((IString)($template454.close()));
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 1154855088:
                if(noCaseMatched_$switchVal407){
                    noCaseMatched_$switchVal407 = false;
                    if($isSubtypeOf($switchVal407.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_1154855088_16: 
                           do {
                               if($has_type_and_arity($switchVal407, M_ParseTree.Symbol_parameterized_lex_str_list_Symbol, 2)){
                                  IValue $arg0_463 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),0));
                                  if($isComparable($arg0_463.getType(), $T4)){
                                     IString s_25 = ((IString)($arg0_463));
                                     IValue $arg1_462 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),1));
                                     if($isComparable($arg1_462.getType(), $T6)){
                                        IList args_26 = ((IList)($arg1_462));
                                        final Template $template461 = (Template)new Template($RVF, "");
                                        $template461.addStr(((IString)($arg0_463)).getValue());
                                        $template461.addStr("_");
                                        $template461.beginIndent(" ");
                                        $template461.addStr(((IString)($me.uu(((IValue)($arg1_462))))).getValue());
                                        $template461.endIndent(" ");
                                        return ((IString)($template461.close()));
                                     
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 28290288:
                if(noCaseMatched_$switchVal407){
                    noCaseMatched_$switchVal407 = false;
                    if($isSubtypeOf($switchVal407.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_28290288_11: 
                           do {
                               if($has_type_and_arity($switchVal407, M_ParseTree.Symbol_sort_str, 1)){
                                  IValue $arg0_453 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),0));
                                  if($isComparable($arg0_453.getType(), $T4)){
                                     IString s_20 = null;
                                     final Template $template452 = (Template)new Template($RVF, "");
                                     $template452.addStr(((IString)($arg0_453)).getValue());
                                     return ((IString)($template452.close()));
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 910072:
                if(noCaseMatched_$switchVal407){
                    noCaseMatched_$switchVal407 = false;
                    if($isSubtypeOf($switchVal407.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_910072_10: 
                           do {
                               if($has_type_and_arity($switchVal407, M_ParseTree.Symbol_seq_list_Symbol, 1)){
                                  IValue $arg0_451 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),0));
                                  if($isComparable($arg0_451.getType(), $T6)){
                                     IList lst_18 = ((IList)($arg0_451));
                                     final Template $template449 = (Template)new Template($RVF, "seq_");
                                     /*muExists*/LAB75: 
                                         do {
                                             LAB75_GEN32297:
                                             for(IValue $elem450_for : ((IList)($arg0_451))){
                                                 IConstructor $elem450 = (IConstructor) $elem450_for;
                                                 IValue elem_19 = ((IValue)($elem450));
                                                 ;$template449.addStr(((IString)($me.v2i(((IValue)elem_19)))).getValue());
                                                 $template449.addStr("_");
                                             
                                             }
                                             continue LAB75;
                                                         
                                         } while(false);
                                     return ((IString)($astr_slice(((IString)($template449.close())), null, null, -1)));
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 773448:
                if(noCaseMatched_$switchVal407){
                    noCaseMatched_$switchVal407 = false;
                    if($isSubtypeOf($switchVal407.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_773448_5: 
                           do {
                               if($has_type_and_arity($switchVal407, M_ParseTree.Symbol_alt_set_Symbol, 1)){
                                  IValue $arg0_430 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),0));
                                  if($isComparable($arg0_430.getType(), $T0)){
                                     ISet alts_7 = ((ISet)($arg0_430));
                                     final Template $template428 = (Template)new Template($RVF, "alt_");
                                     /*muExists*/LAB72: 
                                         do {
                                             LAB72_GEN31732:
                                             for(IValue $elem429_for : ((IList)(M_Set.sort(((ISet)($arg0_430)))))){
                                                 IConstructor $elem429 = (IConstructor) $elem429_for;
                                                 IValue elem_8 = ((IValue)($elem429));
                                                 ;$template428.addStr(((IString)($me.v2i(((IValue)elem_8)))).getValue());
                                                 $template428.addStr("_");
                                             
                                             }
                                             continue LAB72;
                                                         
                                         } while(false);
                                     return ((IString)($astr_slice(((IString)($template428.close())), null, null, -1)));
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 1652184736:
                if(noCaseMatched_$switchVal407){
                    noCaseMatched_$switchVal407 = false;
                    if($isSubtypeOf($switchVal407.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_1652184736_6: 
                           do {
                               if($has_type_and_arity($switchVal407, M_ParseTree.Symbol_iter_seps_Symbol_list_Symbol, 2)){
                                  IValue $arg0_436 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),0));
                                  if($isComparable($arg0_436.getType(), M_ParseTree.ADT_Symbol)){
                                     IConstructor s_9 = ((IConstructor)($arg0_436));
                                     IValue $arg1_434 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),1));
                                     if($isComparable($arg1_434.getType(), $T34)){
                                        final IList $subject435 = ((IList)($arg1_434));
                                        int $subject435_cursor = 0;
                                        if($isSubtypeOf($subject435.getType(),$T34)){
                                           final int $subject435_len = (int)((IList)($subject435)).length();
                                           if($subject435_len == 1){
                                              if($subject435_cursor < $subject435_len){
                                                 $subject435_cursor += 1;
                                                 if($subject435_cursor == $subject435_len){
                                                    final Template $template433 = (Template)new Template($RVF, "_iter_seps_");
                                                    $template433.beginIndent("           ");
                                                    $template433.addStr(((IString)($me.v2i(((IValue)($arg0_436))))).getValue());
                                                    $template433.endIndent("           ");
                                                    return ((IString)($template433.close()));
                                                 
                                                 } else {
                                                    continue CASE_1652184736_6;/*list match1*/
                                                 }
                                              }
                                           
                                           }
                                        
                                        }
                                     
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
                    if($isSubtypeOf($switchVal407.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_1652184736_8: 
                           do {
                               if($has_type_and_arity($switchVal407, M_ParseTree.Symbol_iter_seps_Symbol_list_Symbol, 2)){
                                  IValue $arg0_444 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),0));
                                  if($isComparable($arg0_444.getType(), M_ParseTree.ADT_Symbol)){
                                     IConstructor s_12 = ((IConstructor)($arg0_444));
                                     IValue $arg1_443 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),1));
                                     if($isComparable($arg1_443.getType(), $T6)){
                                        IList seps_13 = ((IList)($arg1_443));
                                        final Template $template441 = (Template)new Template($RVF, "_iter_seps_");
                                        $template441.beginIndent("           ");
                                        $template441.addStr(((IString)($me.v2i(((IValue)($arg0_444))))).getValue());
                                        $template441.endIndent("           ");
                                        $template441.addStr("_");
                                        /*muExists*/LAB73: 
                                            do {
                                                LAB73_GEN32048:
                                                for(IValue $elem442_for : ((IList)($arg1_443))){
                                                    IConstructor $elem442 = (IConstructor) $elem442_for;
                                                    IValue elem_14 = ((IValue)($elem442));
                                                    ;$template441.addStr(((IString)($me.v2i(((IValue)elem_14)))).getValue());
                                                    $template441.addStr("_");
                                                
                                                }
                                                continue LAB73;
                                                            
                                            } while(false);
                                        return ((IString)($astr_slice(((IString)($template441.close())), null, null, -1)));
                                     
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 51884336:
                if(noCaseMatched_$switchVal407){
                    noCaseMatched_$switchVal407 = false;
                    if($isSubtypeOf($switchVal407.getType(),M_Grammar.ADT_Item)){
                       /*muExists*/CASE_51884336_1: 
                           do {
                               if($has_type_and_arity($switchVal407, M_Grammar.Item_item_Production_int, 2)){
                                  IValue $arg0_419 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),0));
                                  if($isComparable($arg0_419.getType(), M_ParseTree.ADT_Production)){
                                     if($has_type_and_arity($arg0_419, M_ParseTree.Production_prod_Symbol_list_Symbol_set_Attr, 3)){
                                        IValue $arg0_422 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_419)),0));
                                        if($isComparable($arg0_422.getType(), M_ParseTree.ADT_Symbol)){
                                           IConstructor u_3 = ((IConstructor)($arg0_422));
                                           IValue $arg1_421 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_419)),1));
                                           if($isComparable($arg1_421.getType(), $T1)){
                                              IValue $arg2_420 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_419)),2));
                                              if($isComparable($arg2_420.getType(), $T1)){
                                                 IConstructor p_2 = ((IConstructor)($arg0_419));
                                                 IValue $arg1_418 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),1));
                                                 if($isComparable($arg1_418.getType(), $T7)){
                                                    IInteger i_4 = ((IInteger)($arg1_418));
                                                    final Template $template417 = (Template)new Template($RVF, "");
                                                    $template417.addStr(((IString)($me.v2i(((IValue)($arg0_422))))).getValue());
                                                    $template417.addStr(".");
                                                    $template417.beginIndent(" ");
                                                    $template417.addStr(((IString)($me.v2i(((IValue)($arg0_419))))).getValue());
                                                    $template417.endIndent(" ");
                                                    $template417.addStr("_");
                                                    $template417.beginIndent(" ");
                                                    $template417.addStr(((IString)($me.v2i(((IValue)($arg1_418))))).getValue());
                                                    $template417.endIndent(" ");
                                                    return ((IString)($template417.close()));
                                                 
                                                 }
                                              
                                              }
                                           
                                           }
                                        
                                        }
                                     
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case -333228984:
                if(noCaseMatched_$switchVal407){
                    noCaseMatched_$switchVal407 = false;
                    if($isSubtypeOf($switchVal407.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_333228984_3: 
                           do {
                               if($has_type_and_arity($switchVal407, M_ParseTree.Symbol_layouts_str, 1)){
                                  IValue $arg0_425 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),0));
                                  if($isComparable($arg0_425.getType(), $T4)){
                                     return ((IString)$constants.get(44)/*"$anylayout$"*/);
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 0:
                if(noCaseMatched_$switchVal407){
                    noCaseMatched_$switchVal407 = false;
                    
                }
                
        
            case -2144737184:
                if(noCaseMatched_$switchVal407){
                    noCaseMatched_$switchVal407 = false;
                    if($isSubtypeOf($switchVal407.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_2144737184_4: 
                           do {
                               if($has_type_and_arity($switchVal407, M_ParseTree.Symbol_conditional_Symbol_set_Condition, 2)){
                                  IValue $arg0_427 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),0));
                                  if($isComparable($arg0_427.getType(), M_ParseTree.ADT_Symbol)){
                                     IConstructor s_6 = ((IConstructor)($arg0_427));
                                     IValue $arg1_426 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),1));
                                     if($isComparable($arg1_426.getType(), $T1)){
                                        return ((IString)($me.v2i(((IValue)($arg0_427)))));
                                     
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 857272:
                if(noCaseMatched_$switchVal407){
                    noCaseMatched_$switchVal407 = false;
                    if($isSubtypeOf($switchVal407.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_857272_18: 
                           do {
                               if($has_type_and_arity($switchVal407, M_ParseTree.Symbol_lit_str, 1)){
                                  IValue $arg0_469 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),0));
                                  if($isComparable($arg0_469.getType(), $T4)){
                                     final Matcher $matcher470 = (Matcher)$regExpCompile("(^[A-Za-z0-9\\-\\_]+$)", ((IString)($arg0_469)).getValue());
                                     boolean $found471 = true;
                                     
                                         while($found471){
                                             $found471 = $matcher470.find();
                                             if($found471){
                                                IString s_28 = ((IString)($RVF.string($matcher470.group(1))));
                                                final Template $template468 = (Template)new Template($RVF, "lit_");
                                                $template468.beginIndent("    ");
                                                $template468.addStr(((IString)($me.escId(((IString)s_28)))).getValue());
                                                $template468.endIndent("    ");
                                                return ((IString)($template468.close()));
                                             
                                             }
                                     
                                         }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case -109773488:
                if(noCaseMatched_$switchVal407){
                    noCaseMatched_$switchVal407 = false;
                    if($isSubtypeOf($switchVal407.getType(),M_ParseTree.ADT_Symbol)){
                       /*muExists*/CASE_109773488_13: 
                           do {
                               if($has_type_and_arity($switchVal407, M_ParseTree.Symbol_keywords_str, 1)){
                                  IValue $arg0_457 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal407)),0));
                                  if($isComparable($arg0_457.getType(), $T4)){
                                     IString s_22 = null;
                                     final Template $template456 = (Template)new Template($RVF, "");
                                     $template456.addStr(((IString)($arg0_457)).getValue());
                                     return ((IString)($template456.close()));
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            default: if($isSubtypeOf($switchVal407.getType(),$T36)){
                        /*muExists*/CASE_0_14: 
                            do {
                                if($switchVal407 instanceof INode && ((INode)$switchVal407).arity() == 0 && ((INode)$switchVal407).getName().equals("empty")){
                                   return ((IString)$constants.get(45)/*"empty_empty"*/);
                                
                                }
                        
                            } while(false);
                     
                     }
                     if($isSubtypeOf($switchVal407.getType(),$T7)){
                        /*muExists*/CASE_0_19: 
                            do {
                                IInteger i_29 = null;
                                /*muExists*/$RET408: 
                                    do {
                                        if((((IBool)($aint_less_aint(((IInteger)($switchVal407)),((IInteger)$constants.get(19)/*0*/))))).getValue()){
                                           final Template $template409 = (Template)new Template($RVF, "min_");
                                           $template409.beginIndent("    ");
                                           $template409.addVal(((IInteger)($switchVal407)).negate());
                                           $template409.endIndent("    ");
                                           return ((IString)($template409.close()));
                                        
                                        }
                                
                                    } while(false);
                                final Template $template410 = (Template)new Template($RVF, "");
                                $template410.addVal($switchVal407);
                                return ((IString)($template410.close()));
                        
                            } while(false);
                     
                     }
                     if($isSubtypeOf($switchVal407.getType(),$T4)){
                        /*muExists*/CASE_0_20: 
                            do {
                                IString s_30 = ((IString)($switchVal407));
                                IString $reducer412 = (IString)(((IString)$constants.get(37)/*""*/));
                                final IInteger $lst2 = ((IInteger)(M_String.size(((IString)s_30))));
                                final boolean $dir3 = ((IInteger)$constants.get(19)/*0*/).less($lst2).getValue();
                                
                                $REDUCER411_GEN33108:
                                for(IInteger $elem414 = ((IInteger)$constants.get(19)/*0*/); $dir3 ? $aint_less_aint($elem414,$lst2).getValue() 
                                                          : $aint_lessequal_aint($elem414,$lst2).not().getValue(); $elem414 = $aint_add_aint($elem414,$dir3 ? ((IInteger)$constants.get(9)/*1*/) : ((IInteger)$constants.get(24)/*-1*/))){
                                    IInteger i_32 = ((IInteger)($elem414));
                                    final Template $template413 = (Template)new Template($RVF, "_");
                                    $template413.beginIndent(" ");
                                    $template413.addVal(M_String.charAt(((IString)s_30), ((IInteger)i_32)));
                                    $template413.endIndent(" ");
                                    $reducer412 = ((IString)($astr_add_astr(((IString)($reducer412)),((IString)($template413.close())))));
                                }
                                
                                return ((IString)($reducer412));
                        
                            } while(false);
                     
                     }
                     return ((IString)($me.uu(((IValue)v_0))));
        
        }
        
                   
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(33305,53,<700,4>,<700,57>) 
    public IInteger newItem$883db0ce535f2e2a(ValueRef<IInteger> uniqueItem_1){ 
        
        
        uniqueItem_1.setValue(((IInteger)($aint_add_aint(uniqueItem_1.getValue(),((IInteger)$constants.get(9)/*1*/)))));
        return uniqueItem_1.getValue();
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(33365,107,<701,4>,<704,8>) 
    public IConstructor rewrite$00efbe0fdd947222(IConstructor p_0, ValueRef<IInteger> uniqueItem_1){ 
        
        
        try {
            IValue $visitResult = $TRAVERSE.traverse(DIRECTION.BottomUp, PROGRESS.Continuing, FIXEDPOINT.No, REBUILD.Yes, 
                 new DescendantDescriptorAlwaysTrue($RVF.bool(false)),
                 p_0,
                 (IVisitFunction) (IValue $VISIT78_subject, TraversalState $traversalState) -> {
                     VISIT78:switch(Fingerprint.getFingerprint($VISIT78_subject)){
                     
                         case 0:
                             
                     
                         default: 
                             if($isSubtypeOf($VISIT78_subject.getType(),M_ParseTree.ADT_Symbol)){
                                /*muExists*/CASE_0_0: 
                                    do {
                                        IConstructor s_1 = ((IConstructor)($VISIT78_subject));
                                        IConstructor $replacement472 = (IConstructor)(((IConstructor)($aadt_field_update("id", makeUnique_newItem(uniqueItem_1), ((IConstructor)s_1)))));
                                        if($isSubtypeOf($replacement472.getType(),$VISIT78_subject.getType())){
                                           $traversalState.setMatchedAndChanged(true, true);
                                           return $replacement472;
                                        
                                        } else {
                                           break VISIT78;// switch
                                        
                                        }
                                    } while(false);
                             
                             }
            
                     }
                     return $VISIT78_subject;
                 });
            return (IConstructor)$visitResult;
        
        } catch (ReturnFromTraversalException e) {
            return (IConstructor) e.getValue();
        }
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ParserGenerator.rsc|(33187,363,<698,0>,<707,1>) 
    public IConstructor makeUnique$edb0a92bc293a61d(IConstructor gr_0){ 
        
        
        final ValueRef<IInteger> uniqueItem_1 = new ValueRef<IInteger>("uniqueItem", ((IInteger)$constants.get(9)/*1*/));
        final IMapWriter $mapwriter473 = (IMapWriter)$RVF.mapWriter();
        $MCOMP474_GEN33531:
        for(IValue $elem475_for : ((IMap)(((IMap)($aadt_get_field(((IConstructor)gr_0), "rules")))))){
            IConstructor $elem475 = (IConstructor) $elem475_for;
            IConstructor s_3 = ((IConstructor)($elem475));
            $mapwriter473.insert($RVF.tuple(s_3, makeUnique_rewrite(((IConstructor)($amap_subscript(((IMap)(((IMap)($aadt_get_field(((IConstructor)gr_0), "rules"))))),((IConstructor)s_3)))), uniqueItem_1)));
        
        }
        
                    return ((IConstructor)(((IConstructor)($aadt_field_update("rules", $mapwriter473.done(), ((IConstructor)gr_0))))));
    
    }
    
    // Source: |rascal+module:///lang/rascal/grammar/ParserGenerator| 
    public IInteger $getkw_Symbol_id(IConstructor $getkw_Symbol_id){ 
        
        
        if($getkw_Symbol_id.asWithKeywordParameters().hasParameter("id")){
           return ((IInteger)(((IInteger)$getkw_Symbol_id.asWithKeywordParameters().getParameter("id"))));
        
        } else {
           return ((IInteger)$constants.get(19)/*0*/);
        
        }
    }
    
    // Source: |rascal+module:///lang/rascal/grammar/ParserGenerator| 
    public IString $getkw_Symbol_prefix(IConstructor $getkw_Symbol_prefix){ 
        
        
        if($getkw_Symbol_prefix.asWithKeywordParameters().hasParameter("prefix")){
           return ((IString)(((IString)$getkw_Symbol_prefix.asWithKeywordParameters().getParameter("prefix"))));
        
        } else {
           return ((IString)$constants.get(37)/*""*/);
        
        }
    }
    

    public static void main(String[] args) {
      throw new RuntimeException("No function `main` found in Rascal module `lang::rascal::grammar::ParserGenerator`");
    }
}