package rascal.lang.rascal.grammar.definition;
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
public class $Modules 
    extends
        org.rascalmpl.runtime.$RascalModule
    implements 
    	rascal.lang.rascal.grammar.definition.$Modules_$I {

    private final $Modules_$I $me;
    private final IList $constants;
    
    
    public final rascal.$Set M_Set;
    public final rascal.$IO M_IO;
    public final rascal.lang.rascal.grammar.definition.$Productions M_lang_rascal_grammar_definition_Productions;
    public final rascal.util.$Monitor M_util_Monitor;
    public final rascal.$ParseTree M_ParseTree;
    public final rascal.lang.rascal.syntax.$Rascal M_lang_rascal_syntax_Rascal;
    public final rascal.lang.rascal.grammar.definition.$Literals M_lang_rascal_grammar_definition_Literals;
    public final rascal.lang.rascal.grammar.definition.$Names M_lang_rascal_grammar_definition_Names;
    public final rascal.$Type M_Type;
    public final rascal.lang.rascal.grammar.definition.$Layout M_lang_rascal_grammar_definition_Layout;
    public final rascal.analysis.diff.edits.$FileSystemChanges M_analysis_diff_edits_FileSystemChanges;
    public final rascal.$List M_List;
    public final rascal.$Grammar M_Grammar;
    public final rascal.$Message M_Message;

    
    
    public final io.usethesource.vallang.type.Type $T5;	/*astr()*/
    public final io.usethesource.vallang.type.Type $T9;	/*astr(alabel="name")*/
    public final io.usethesource.vallang.type.Type $T2;	/*avalue()*/
    public final io.usethesource.vallang.type.Type $T17;	/*aparameter("A",avalue(),closed=true)*/
    public final io.usethesource.vallang.type.Type $T6;	/*avoid()*/
    public final io.usethesource.vallang.type.Type $T3;	/*aparameter("T",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type ADT_Visibility;	/*aadt("Visibility",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Visibility;	/*aadt("Visibility",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Replacement;	/*aadt("Replacement",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Replacement;	/*aadt("Replacement",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_NonterminalLabel;	/*aadt("NonterminalLabel",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_NonterminalLabel;	/*aadt("NonterminalLabel",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PostProtocolChars;	/*aadt("PostProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PostProtocolChars;	/*aadt("PostProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FunctionType;	/*aadt("FunctionType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionType;	/*aadt("FunctionType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Strategy;	/*aadt("Strategy",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Strategy;	/*aadt("Strategy",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Import;	/*aadt("Import",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Import;	/*aadt("Import",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T0;	/*aset(aadt("Import",[],contextFreeSyntax()))*/
    public final io.usethesource.vallang.type.Type ADT_MidStringChars;	/*aadt("MidStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_MidStringChars;	/*aadt("MidStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TypeArg;	/*aadt("TypeArg",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TypeArg;	/*aadt("TypeArg",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Tree;	/*aadt("Tree",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T15;	/*aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)*/
    public final io.usethesource.vallang.type.Type ADT_KeywordArguments_1;	/*aadt("KeywordArguments",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordArguments_1;	/*aadt("KeywordArguments",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_LAYOUT;	/*aadt("LAYOUT",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_LAYOUT;	/*aadt("LAYOUT",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Pattern;	/*aadt("Pattern",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Pattern;	/*aadt("Pattern",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Mapping_Pattern;	/*aadt("Mapping",[aadt("Pattern",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Mapping_Pattern;	/*aadt("Mapping",[aadt("Pattern",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Name;	/*aadt("Name",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Name;	/*aadt("Name",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_IOCapability;	/*aadt("IOCapability",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TagString;	/*aadt("TagString",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TagString;	/*aadt("TagString",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Concrete;	/*aadt("Concrete",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Concrete;	/*aadt("Concrete",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ProtocolChars;	/*aadt("ProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ProtocolChars;	/*aadt("ProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type $T11;	/*aset(astr(),alabel="extends")*/
    public final io.usethesource.vallang.type.Type ADT_Range;	/*aadt("Range",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Range;	/*aadt("Range",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Variable;	/*aadt("Variable",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Variable;	/*aadt("Variable",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RegExpLiteral;	/*aadt("RegExpLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RegExpLiteral;	/*aadt("RegExpLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Item;	/*aadt("Item",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_GrammarModule;	/*aadt("GrammarModule",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_IntegerLiteral;	/*aadt("IntegerLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_IntegerLiteral;	/*aadt("IntegerLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Declarator;	/*aadt("Declarator",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Declarator;	/*aadt("Declarator",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Target;	/*aadt("Target",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Target;	/*aadt("Target",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ModuleParameters;	/*aadt("ModuleParameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ModuleParameters;	/*aadt("ModuleParameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T16;	/*aparameter("T",aadt("Tree",[],dataSyntax()),closed=false)*/
    public final io.usethesource.vallang.type.Type ADT_SyntaxDefinition;	/*aadt("SyntaxDefinition",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_SyntaxDefinition;	/*aadt("SyntaxDefinition",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_DatePart;	/*aadt("DatePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DatePart;	/*aadt("DatePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Output;	/*aadt("Output",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Output;	/*aadt("Output",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RationalLiteral;	/*aadt("RationalLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RationalLiteral;	/*aadt("RationalLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_BooleanLiteral;	/*aadt("BooleanLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_BooleanLiteral;	/*aadt("BooleanLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Case;	/*aadt("Case",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Case;	/*aadt("Case",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T10;	/*aset(astr(),alabel="imports")*/
    public final io.usethesource.vallang.type.Type ADT_Expression;	/*aadt("Expression",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Expression;	/*aadt("Expression",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Mapping_Expression;	/*aadt("Mapping",[aadt("Expression",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Mapping_Expression;	/*aadt("Mapping",[aadt("Expression",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_LocalVariableDeclaration;	/*aadt("LocalVariableDeclaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_LocalVariableDeclaration;	/*aadt("LocalVariableDeclaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Attr;	/*aadt("Attr",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TimePartNoTZ;	/*aadt("TimePartNoTZ",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TimePartNoTZ;	/*aadt("TimePartNoTZ",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_KeywordArguments_Expression;	/*aadt("KeywordArguments",[aadt("Expression",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordArguments_Expression;	/*aadt("KeywordArguments",[aadt("Expression",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Mapping_1;	/*aadt("Mapping",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Mapping_1;	/*aadt("Mapping",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_OptionalTerminator;	/*aadt("OptionalTerminator",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_OptionalTerminator;	/*aadt("OptionalTerminator",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Maybe_1;	/*aadt("Maybe",[aparameter("A",avalue(),closed=true)],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Renaming;	/*aadt("Renaming",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Renaming;	/*aadt("Renaming",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Production;	/*aadt("Production",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PostStringChars;	/*aadt("PostStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PostStringChars;	/*aadt("PostStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Catch;	/*aadt("Catch",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Catch;	/*aadt("Catch",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_HexIntegerLiteral;	/*aadt("HexIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_HexIntegerLiteral;	/*aadt("HexIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_OptionalExpression;	/*aadt("OptionalExpression",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_OptionalExpression;	/*aadt("OptionalExpression",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Renamings;	/*aadt("Renamings",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Renamings;	/*aadt("Renamings",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_DataTarget;	/*aadt("DataTarget",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DataTarget;	/*aadt("DataTarget",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_GrammarDefinition;	/*aadt("GrammarDefinition",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Type;	/*aadt("Type",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Type;	/*aadt("Type",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_LocationLiteral;	/*aadt("LocationLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_LocationLiteral;	/*aadt("LocationLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FunctionBody;	/*aadt("FunctionBody",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionBody;	/*aadt("FunctionBody",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Tag;	/*aadt("Tag",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Tag;	/*aadt("Tag",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Module;	/*aadt("Module",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Module;	/*aadt("Module",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T14;	/*aset(aadt("Module",[],contextFreeSyntax()))*/
    public final io.usethesource.vallang.type.Type ADT_Symbol;	/*aadt("Symbol",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TimeZonePart;	/*aadt("TimeZonePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TimeZonePart;	/*aadt("TimeZonePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_KeywordFormals;	/*aadt("KeywordFormals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordFormals;	/*aadt("KeywordFormals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ShellCommand;	/*aadt("ShellCommand",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ShellCommand;	/*aadt("ShellCommand",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Maybe_Attr;	/*aadt("Maybe",[aadt("Attr",[],dataSyntax())],dataSyntax())*/
    public final io.usethesource.vallang.type.Type Maybe_Attr_just_Attr;	/*acons(aadt("Maybe",[aadt("Attr",[],dataSyntax())],dataSyntax()),[aadt("Attr",[],dataSyntax(),alabel="val")],[],alabel="just")*/
    public final io.usethesource.vallang.type.Type ADT_Declaration;	/*aadt("Declaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Declaration;	/*aadt("Declaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Field;	/*aadt("Field",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Field;	/*aadt("Field",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T1;	/*alist(aparameter("T",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type ADT_StringLiteral;	/*aadt("StringLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringLiteral;	/*aadt("StringLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TreeSearchResult_void;	/*aadt("TreeSearchResult",[avoid()],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Tags;	/*aadt("Tags",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Tags;	/*aadt("Tags",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_KeywordArguments_Pattern;	/*aadt("KeywordArguments",[aadt("Pattern",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordArguments_Pattern;	/*aadt("KeywordArguments",[aadt("Pattern",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ModuleActuals;	/*aadt("ModuleActuals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ModuleActuals;	/*aadt("ModuleActuals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Bound;	/*aadt("Bound",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Bound;	/*aadt("Bound",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ImportedModule;	/*aadt("ImportedModule",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ImportedModule;	/*aadt("ImportedModule",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RegExp;	/*aadt("RegExp",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RegExp;	/*aadt("RegExp",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Nonterminal;	/*aadt("Nonterminal",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Nonterminal;	/*aadt("Nonterminal",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type $T12;	/*aset(aadt("SyntaxDefinition",[],contextFreeSyntax()),alabel="defs")*/
    public final io.usethesource.vallang.type.Type $T13;	/*atuple(atypeList([aset(astr(),alabel="imports"),aset(astr(),alabel="extends"),aset(aadt("SyntaxDefinition",[],contextFreeSyntax()),alabel="defs")]),alabel="mod")*/
    public final io.usethesource.vallang.type.Type ADT_PathPart;	/*aadt("PathPart",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PathPart;	/*aadt("PathPart",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Class;	/*aadt("Class",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Class;	/*aadt("Class",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_KeywordArgument_1;	/*aadt("KeywordArgument",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordArgument_1;	/*aadt("KeywordArgument",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Associativity;	/*aadt("Associativity",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Signature;	/*aadt("Signature",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Signature;	/*aadt("Signature",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_KeywordFormal;	/*aadt("KeywordFormal",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordFormal;	/*aadt("KeywordFormal",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T8;	/*amap(astr(alabel="name"),atuple(atypeList([aset(astr(),alabel="imports"),aset(astr(),alabel="extends"),aset(aadt("SyntaxDefinition",[],contextFreeSyntax()),alabel="defs")]),alabel="mod"))*/
    public final io.usethesource.vallang.type.Type ADT_PreStringChars;	/*aadt("PreStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PreStringChars;	/*aadt("PreStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FileSystemChange;	/*aadt("FileSystemChange",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Maybe_Symbol;	/*aadt("Maybe",[aadt("Symbol",[],dataSyntax())],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_URLChars;	/*aadt("URLChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_URLChars;	/*aadt("URLChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Start;	/*aadt("Start",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Start;	/*aadt("Start",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Maybe_Associativity;	/*aadt("Maybe",[aadt("Associativity",[],dataSyntax(),alabel="a")],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PrePathChars;	/*aadt("PrePathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PrePathChars;	/*aadt("PrePathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_StringConstant;	/*aadt("StringConstant",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringConstant;	/*aadt("StringConstant",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_OptionalComma;	/*aadt("OptionalComma",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_OptionalComma;	/*aadt("OptionalComma",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FunctionDeclaration;	/*aadt("FunctionDeclaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionDeclaration;	/*aadt("FunctionDeclaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Backslash;	/*aadt("Backslash",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Backslash;	/*aadt("Backslash",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_DateAndTime;	/*aadt("DateAndTime",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DateAndTime;	/*aadt("DateAndTime",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_StringTail;	/*aadt("StringTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringTail;	/*aadt("StringTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_CaseInsensitiveStringConstant;	/*aadt("CaseInsensitiveStringConstant",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_CaseInsensitiveStringConstant;	/*aadt("CaseInsensitiveStringConstant",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Char;	/*aadt("Char",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Char;	/*aadt("Char",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Assignment;	/*aadt("Assignment",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Assignment;	/*aadt("Assignment",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Header;	/*aadt("Header",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Header;	/*aadt("Header",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Exception;	/*aadt("Exception",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PatternWithAction;	/*aadt("PatternWithAction",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PatternWithAction;	/*aadt("PatternWithAction",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PostPathChars;	/*aadt("PostPathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PostPathChars;	/*aadt("PostPathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Body;	/*aadt("Body",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Body;	/*aadt("Body",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_DataTypeSelector;	/*aadt("DataTypeSelector",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DataTypeSelector;	/*aadt("DataTypeSelector",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TreeSearchResult_Tree;	/*aadt("TreeSearchResult",[aadt("Tree",[],dataSyntax())],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TypeVar;	/*aadt("TypeVar",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TypeVar;	/*aadt("TypeVar",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T7;	/*aset(aadt("Production",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type ADT_JustDate;	/*aadt("JustDate",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_JustDate;	/*aadt("JustDate",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Variant;	/*aadt("Variant",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Variant;	/*aadt("Variant",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_UserType;	/*aadt("UserType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_UserType;	/*aadt("UserType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FunctionModifiers;	/*aadt("FunctionModifiers",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionModifiers;	/*aadt("FunctionModifiers",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Comprehension;	/*aadt("Comprehension",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Comprehension;	/*aadt("Comprehension",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TreeSearchResult_1;	/*aadt("TreeSearchResult",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_LAYOUTLIST;	/*aadt("LAYOUTLIST",[],layoutSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ConcreteHole;	/*aadt("ConcreteHole",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ConcreteHole;	/*aadt("ConcreteHole",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Grammar;	/*aadt("Grammar",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Message;	/*aadt("Message",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_StringMiddle;	/*aadt("StringMiddle",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringMiddle;	/*aadt("StringMiddle",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Sym;	/*aadt("Sym",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Sym;	/*aadt("Sym",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RealLiteral;	/*aadt("RealLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RealLiteral;	/*aadt("RealLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type $T18;	/*\iter-star-seps(aadt("Import",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())])*/
    public final io.usethesource.vallang.type.Type ADT_OptionalEqualSign;	/*aadt("OptionalEqualSign",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_OptionalEqualSign;	/*aadt("OptionalEqualSign",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Formals;	/*aadt("Formals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Formals;	/*aadt("Formals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_CharRange;	/*aadt("CharRange",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_QualifiedName;	/*aadt("QualifiedName",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_QualifiedName;	/*aadt("QualifiedName",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_MidPathChars;	/*aadt("MidPathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_MidPathChars;	/*aadt("MidPathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type Maybe_Symbol_just_Symbol;	/*acons(aadt("Maybe",[aadt("Symbol",[],dataSyntax())],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="val")],[],alabel="just")*/
    public final io.usethesource.vallang.type.Type ADT_Maybe_void;	/*aadt("Maybe",[avoid()],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T4;	/*aset(aparameter("T",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type ADT_PathTail;	/*aadt("PathTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PathTail;	/*aadt("PathTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Maybe_Associativity_just_Associativity;	/*acons(aadt("Maybe",[aadt("Associativity",[],dataSyntax())],dataSyntax()),[aadt("Associativity",[],dataSyntax(),alabel="val")],[],alabel="just")*/
    public final io.usethesource.vallang.type.Type ADT_PreProtocolChars;	/*aadt("PreProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PreProtocolChars;	/*aadt("PreProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_NamedBackslash;	/*aadt("NamedBackslash",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_NamedBackslash;	/*aadt("NamedBackslash",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_HorizontalSpace;	/*aadt("HorizontalSpace",[],layoutSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_MidProtocolChars;	/*aadt("MidProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_MidProtocolChars;	/*aadt("MidProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RascalKeywords;	/*aadt("RascalKeywords",[],keywordSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Label;	/*aadt("Label",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Label;	/*aadt("Label",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Kind;	/*aadt("Kind",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Kind;	/*aadt("Kind",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Prod;	/*aadt("Prod",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Prod;	/*aadt("Prod",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type TreeSearchResult_Tree_treeFound_Tree;	/*acons(aadt("TreeSearchResult",[aadt("Tree",[],dataSyntax())],dataSyntax()),[aadt("Tree",[],dataSyntax(),alabel="tree")],[],alabel="treeFound")*/
    public final io.usethesource.vallang.type.Type ADT_RegExpModifier;	/*aadt("RegExpModifier",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RegExpModifier;	/*aadt("RegExpModifier",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Condition;	/*aadt("Condition",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_NamedRegExp;	/*aadt("NamedRegExp",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_NamedRegExp;	/*aadt("NamedRegExp",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Parameters;	/*aadt("Parameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Parameters;	/*aadt("Parameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RuntimeException;	/*aadt("RuntimeException",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_DecimalIntegerLiteral;	/*aadt("DecimalIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DecimalIntegerLiteral;	/*aadt("DecimalIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Assoc;	/*aadt("Assoc",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Assoc;	/*aadt("Assoc",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_DateTimeLiteral;	/*aadt("DateTimeLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DateTimeLiteral;	/*aadt("DateTimeLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FunctionModifier;	/*aadt("FunctionModifier",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionModifier;	/*aadt("FunctionModifier",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_EvalCommand;	/*aadt("EvalCommand",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_EvalCommand;	/*aadt("EvalCommand",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_JustTime;	/*aadt("JustTime",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_JustTime;	/*aadt("JustTime",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_UnicodeEscape;	/*aadt("UnicodeEscape",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_UnicodeEscape;	/*aadt("UnicodeEscape",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ProdModifier;	/*aadt("ProdModifier",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ProdModifier;	/*aadt("ProdModifier",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Assignable;	/*aadt("Assignable",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Assignable;	/*aadt("Assignable",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Statement;	/*aadt("Statement",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Statement;	/*aadt("Statement",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_StringCharacter;	/*aadt("StringCharacter",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringCharacter;	/*aadt("StringCharacter",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Literal;	/*aadt("Literal",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Literal;	/*aadt("Literal",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Toplevel;	/*aadt("Toplevel",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Toplevel;	/*aadt("Toplevel",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ConcretePart;	/*aadt("ConcretePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ConcretePart;	/*aadt("ConcretePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_StructuredType;	/*aadt("StructuredType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StructuredType;	/*aadt("StructuredType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Visit;	/*aadt("Visit",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Visit;	/*aadt("Visit",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Command;	/*aadt("Command",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Command;	/*aadt("Command",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_StringTemplate;	/*aadt("StringTemplate",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringTemplate;	/*aadt("StringTemplate",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_OctalIntegerLiteral;	/*aadt("OctalIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_OctalIntegerLiteral;	/*aadt("OctalIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ProtocolPart;	/*aadt("ProtocolPart",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ProtocolPart;	/*aadt("ProtocolPart",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_CommonKeywordParameters;	/*aadt("CommonKeywordParameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_CommonKeywordParameters;	/*aadt("CommonKeywordParameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PathChars;	/*aadt("PathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PathChars;	/*aadt("PathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_BasicType;	/*aadt("BasicType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_BasicType;	/*aadt("BasicType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Commands;	/*aadt("Commands",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Commands;	/*aadt("Commands",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ProtocolTail;	/*aadt("ProtocolTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ProtocolTail;	/*aadt("ProtocolTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Comment;	/*aadt("Comment",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Comment;	/*aadt("Comment",[],lexicalSyntax())*/

    public $Modules(RascalExecutionContext rex){
        this(rex, null);
    }
    
    public $Modules(RascalExecutionContext rex, Object extended){
       super(rex);
       this.$me = extended == null ? this : ($Modules_$I)extended;
       ModuleStore mstore = rex.getModuleStore();
       mstore.put(rascal.lang.rascal.grammar.definition.$Modules.class, this);
       
       mstore.importModule(rascal.$Set.class, rex, rascal.$Set::new);
       mstore.importModule(rascal.$IO.class, rex, rascal.$IO::new);
       mstore.importModule(rascal.lang.rascal.grammar.definition.$Productions.class, rex, rascal.lang.rascal.grammar.definition.$Productions::new);
       mstore.importModule(rascal.util.$Monitor.class, rex, rascal.util.$Monitor::new);
       mstore.importModule(rascal.$ParseTree.class, rex, rascal.$ParseTree::new);
       mstore.importModule(rascal.lang.rascal.syntax.$Rascal.class, rex, rascal.lang.rascal.syntax.$Rascal::new);
       mstore.importModule(rascal.lang.rascal.grammar.definition.$Literals.class, rex, rascal.lang.rascal.grammar.definition.$Literals::new);
       mstore.importModule(rascal.lang.rascal.grammar.definition.$Names.class, rex, rascal.lang.rascal.grammar.definition.$Names::new);
       mstore.importModule(rascal.$Type.class, rex, rascal.$Type::new);
       mstore.importModule(rascal.lang.rascal.grammar.definition.$Layout.class, rex, rascal.lang.rascal.grammar.definition.$Layout::new);
       mstore.importModule(rascal.analysis.diff.edits.$FileSystemChanges.class, rex, rascal.analysis.diff.edits.$FileSystemChanges::new);
       mstore.importModule(rascal.$List.class, rex, rascal.$List::new);
       mstore.importModule(rascal.$Grammar.class, rex, rascal.$Grammar::new);
       mstore.importModule(rascal.$Message.class, rex, rascal.$Message::new); 
       
       M_Set = mstore.getModule(rascal.$Set.class);
       M_IO = mstore.getModule(rascal.$IO.class);
       M_lang_rascal_grammar_definition_Productions = mstore.getModule(rascal.lang.rascal.grammar.definition.$Productions.class);
       M_util_Monitor = mstore.getModule(rascal.util.$Monitor.class);
       M_ParseTree = mstore.getModule(rascal.$ParseTree.class);
       M_lang_rascal_syntax_Rascal = mstore.getModule(rascal.lang.rascal.syntax.$Rascal.class);
       M_lang_rascal_grammar_definition_Literals = mstore.getModule(rascal.lang.rascal.grammar.definition.$Literals.class);
       M_lang_rascal_grammar_definition_Names = mstore.getModule(rascal.lang.rascal.grammar.definition.$Names.class);
       M_Type = mstore.getModule(rascal.$Type.class);
       M_lang_rascal_grammar_definition_Layout = mstore.getModule(rascal.lang.rascal.grammar.definition.$Layout.class);
       M_analysis_diff_edits_FileSystemChanges = mstore.getModule(rascal.analysis.diff.edits.$FileSystemChanges.class);
       M_List = mstore.getModule(rascal.$List.class);
       M_Grammar = mstore.getModule(rascal.$Grammar.class);
       M_Message = mstore.getModule(rascal.$Message.class); 
       
                          
       
       $TS.importStore(M_Set.$TS);
       $TS.importStore(M_IO.$TS);
       $TS.importStore(M_lang_rascal_grammar_definition_Productions.$TS);
       $TS.importStore(M_util_Monitor.$TS);
       $TS.importStore(M_ParseTree.$TS);
       $TS.importStore(M_lang_rascal_syntax_Rascal.$TS);
       $TS.importStore(M_lang_rascal_grammar_definition_Literals.$TS);
       $TS.importStore(M_lang_rascal_grammar_definition_Names.$TS);
       $TS.importStore(M_Type.$TS);
       $TS.importStore(M_lang_rascal_grammar_definition_Layout.$TS);
       $TS.importStore(M_analysis_diff_edits_FileSystemChanges.$TS);
       $TS.importStore(M_List.$TS);
       $TS.importStore(M_Grammar.$TS);
       $TS.importStore(M_Message.$TS);
       
       $constants = readBinaryConstantsFile(this.getClass(), "rascal/lang/rascal/grammar/definition/$Modules.constants", 1815, "f49dda225fc45a4877ed452d27c80014");
       NT_Visibility = $sort("Visibility");
       ADT_Visibility = $adt("Visibility");
       NT_Replacement = $sort("Replacement");
       ADT_Replacement = $adt("Replacement");
       NT_NonterminalLabel = $lex("NonterminalLabel");
       ADT_NonterminalLabel = $adt("NonterminalLabel");
       NT_PostProtocolChars = $lex("PostProtocolChars");
       ADT_PostProtocolChars = $adt("PostProtocolChars");
       NT_FunctionType = $sort("FunctionType");
       ADT_FunctionType = $adt("FunctionType");
       NT_Strategy = $sort("Strategy");
       ADT_Strategy = $adt("Strategy");
       NT_Import = $sort("Import");
       ADT_Import = $adt("Import");
       NT_MidStringChars = $lex("MidStringChars");
       ADT_MidStringChars = $adt("MidStringChars");
       NT_TypeArg = $sort("TypeArg");
       ADT_TypeArg = $adt("TypeArg");
       ADT_Tree = $adt("Tree");
       NT_LAYOUT = $lex("LAYOUT");
       ADT_LAYOUT = $adt("LAYOUT");
       NT_Pattern = $sort("Pattern");
       ADT_Pattern = $adt("Pattern");
       NT_Name = $lex("Name");
       ADT_Name = $adt("Name");
       ADT_IOCapability = $adt("IOCapability");
       NT_TagString = $lex("TagString");
       ADT_TagString = $adt("TagString");
       NT_Concrete = $lex("Concrete");
       ADT_Concrete = $adt("Concrete");
       NT_ProtocolChars = $lex("ProtocolChars");
       ADT_ProtocolChars = $adt("ProtocolChars");
       NT_Range = $sort("Range");
       ADT_Range = $adt("Range");
       NT_Variable = $sort("Variable");
       ADT_Variable = $adt("Variable");
       NT_RegExpLiteral = $lex("RegExpLiteral");
       ADT_RegExpLiteral = $adt("RegExpLiteral");
       ADT_Item = $adt("Item");
       ADT_GrammarModule = $adt("GrammarModule");
       NT_IntegerLiteral = $sort("IntegerLiteral");
       ADT_IntegerLiteral = $adt("IntegerLiteral");
       NT_Declarator = $sort("Declarator");
       ADT_Declarator = $adt("Declarator");
       NT_Target = $sort("Target");
       ADT_Target = $adt("Target");
       NT_ModuleParameters = $sort("ModuleParameters");
       ADT_ModuleParameters = $adt("ModuleParameters");
       NT_SyntaxDefinition = $sort("SyntaxDefinition");
       ADT_SyntaxDefinition = $adt("SyntaxDefinition");
       NT_DatePart = $lex("DatePart");
       ADT_DatePart = $adt("DatePart");
       NT_Output = $lex("Output");
       ADT_Output = $adt("Output");
       NT_RationalLiteral = $lex("RationalLiteral");
       ADT_RationalLiteral = $adt("RationalLiteral");
       NT_BooleanLiteral = $lex("BooleanLiteral");
       ADT_BooleanLiteral = $adt("BooleanLiteral");
       NT_Case = $sort("Case");
       ADT_Case = $adt("Case");
       NT_Expression = $sort("Expression");
       ADT_Expression = $adt("Expression");
       NT_LocalVariableDeclaration = $sort("LocalVariableDeclaration");
       ADT_LocalVariableDeclaration = $adt("LocalVariableDeclaration");
       ADT_Attr = $adt("Attr");
       NT_TimePartNoTZ = $lex("TimePartNoTZ");
       ADT_TimePartNoTZ = $adt("TimePartNoTZ");
       NT_OptionalTerminator = $lex("OptionalTerminator");
       ADT_OptionalTerminator = $adt("OptionalTerminator");
       NT_Renaming = $sort("Renaming");
       ADT_Renaming = $adt("Renaming");
       ADT_Production = $adt("Production");
       NT_PostStringChars = $lex("PostStringChars");
       ADT_PostStringChars = $adt("PostStringChars");
       NT_Catch = $sort("Catch");
       ADT_Catch = $adt("Catch");
       NT_HexIntegerLiteral = $lex("HexIntegerLiteral");
       ADT_HexIntegerLiteral = $adt("HexIntegerLiteral");
       NT_OptionalExpression = $sort("OptionalExpression");
       ADT_OptionalExpression = $adt("OptionalExpression");
       NT_Renamings = $sort("Renamings");
       ADT_Renamings = $adt("Renamings");
       NT_DataTarget = $sort("DataTarget");
       ADT_DataTarget = $adt("DataTarget");
       ADT_GrammarDefinition = $adt("GrammarDefinition");
       NT_Type = $sort("Type");
       ADT_Type = $adt("Type");
       NT_LocationLiteral = $sort("LocationLiteral");
       ADT_LocationLiteral = $adt("LocationLiteral");
       NT_FunctionBody = $sort("FunctionBody");
       ADT_FunctionBody = $adt("FunctionBody");
       NT_Tag = $sort("Tag");
       ADT_Tag = $adt("Tag");
       NT_Module = $sort("Module");
       ADT_Module = $adt("Module");
       ADT_Symbol = $adt("Symbol");
       NT_TimeZonePart = $lex("TimeZonePart");
       ADT_TimeZonePart = $adt("TimeZonePart");
       NT_KeywordFormals = $sort("KeywordFormals");
       ADT_KeywordFormals = $adt("KeywordFormals");
       NT_ShellCommand = $sort("ShellCommand");
       ADT_ShellCommand = $adt("ShellCommand");
       NT_Declaration = $sort("Declaration");
       ADT_Declaration = $adt("Declaration");
       NT_Field = $sort("Field");
       ADT_Field = $adt("Field");
       NT_StringLiteral = $sort("StringLiteral");
       ADT_StringLiteral = $adt("StringLiteral");
       NT_Tags = $sort("Tags");
       ADT_Tags = $adt("Tags");
       NT_ModuleActuals = $sort("ModuleActuals");
       ADT_ModuleActuals = $adt("ModuleActuals");
       NT_Bound = $sort("Bound");
       ADT_Bound = $adt("Bound");
       NT_ImportedModule = $sort("ImportedModule");
       ADT_ImportedModule = $adt("ImportedModule");
       NT_RegExp = $lex("RegExp");
       ADT_RegExp = $adt("RegExp");
       NT_Nonterminal = $lex("Nonterminal");
       ADT_Nonterminal = $adt("Nonterminal");
       NT_PathPart = $sort("PathPart");
       ADT_PathPart = $adt("PathPart");
       NT_Class = $sort("Class");
       ADT_Class = $adt("Class");
       ADT_Associativity = $adt("Associativity");
       NT_Signature = $sort("Signature");
       ADT_Signature = $adt("Signature");
       NT_KeywordFormal = $sort("KeywordFormal");
       ADT_KeywordFormal = $adt("KeywordFormal");
       NT_PreStringChars = $lex("PreStringChars");
       ADT_PreStringChars = $adt("PreStringChars");
       ADT_FileSystemChange = $adt("FileSystemChange");
       NT_URLChars = $lex("URLChars");
       ADT_URLChars = $adt("URLChars");
       NT_Start = $sort("Start");
       ADT_Start = $adt("Start");
       NT_PrePathChars = $lex("PrePathChars");
       ADT_PrePathChars = $adt("PrePathChars");
       NT_StringConstant = $lex("StringConstant");
       ADT_StringConstant = $adt("StringConstant");
       NT_OptionalComma = $lex("OptionalComma");
       ADT_OptionalComma = $adt("OptionalComma");
       NT_FunctionDeclaration = $sort("FunctionDeclaration");
       ADT_FunctionDeclaration = $adt("FunctionDeclaration");
       NT_Backslash = $lex("Backslash");
       ADT_Backslash = $adt("Backslash");
       NT_DateAndTime = $lex("DateAndTime");
       ADT_DateAndTime = $adt("DateAndTime");
       NT_StringTail = $sort("StringTail");
       ADT_StringTail = $adt("StringTail");
       NT_CaseInsensitiveStringConstant = $lex("CaseInsensitiveStringConstant");
       ADT_CaseInsensitiveStringConstant = $adt("CaseInsensitiveStringConstant");
       NT_Char = $lex("Char");
       ADT_Char = $adt("Char");
       NT_Assignment = $sort("Assignment");
       ADT_Assignment = $adt("Assignment");
       NT_Header = $sort("Header");
       ADT_Header = $adt("Header");
       ADT_Exception = $adt("Exception");
       NT_PatternWithAction = $sort("PatternWithAction");
       ADT_PatternWithAction = $adt("PatternWithAction");
       NT_PostPathChars = $lex("PostPathChars");
       ADT_PostPathChars = $adt("PostPathChars");
       NT_Body = $sort("Body");
       ADT_Body = $adt("Body");
       NT_DataTypeSelector = $sort("DataTypeSelector");
       ADT_DataTypeSelector = $adt("DataTypeSelector");
       NT_TypeVar = $sort("TypeVar");
       ADT_TypeVar = $adt("TypeVar");
       NT_JustDate = $lex("JustDate");
       ADT_JustDate = $adt("JustDate");
       NT_Variant = $sort("Variant");
       ADT_Variant = $adt("Variant");
       NT_UserType = $sort("UserType");
       ADT_UserType = $adt("UserType");
       NT_FunctionModifiers = $sort("FunctionModifiers");
       ADT_FunctionModifiers = $adt("FunctionModifiers");
       NT_Comprehension = $sort("Comprehension");
       ADT_Comprehension = $adt("Comprehension");
       ADT_LAYOUTLIST = $layouts("LAYOUTLIST");
       NT_ConcreteHole = $sort("ConcreteHole");
       ADT_ConcreteHole = $adt("ConcreteHole");
       ADT_Grammar = $adt("Grammar");
       ADT_Message = $adt("Message");
       NT_StringMiddle = $sort("StringMiddle");
       ADT_StringMiddle = $adt("StringMiddle");
       NT_Sym = $sort("Sym");
       ADT_Sym = $adt("Sym");
       NT_RealLiteral = $lex("RealLiteral");
       ADT_RealLiteral = $adt("RealLiteral");
       NT_OptionalEqualSign = $lex("OptionalEqualSign");
       ADT_OptionalEqualSign = $adt("OptionalEqualSign");
       NT_Formals = $sort("Formals");
       ADT_Formals = $adt("Formals");
       ADT_CharRange = $adt("CharRange");
       NT_QualifiedName = $sort("QualifiedName");
       ADT_QualifiedName = $adt("QualifiedName");
       NT_MidPathChars = $lex("MidPathChars");
       ADT_MidPathChars = $adt("MidPathChars");
       NT_PathTail = $sort("PathTail");
       ADT_PathTail = $adt("PathTail");
       NT_PreProtocolChars = $lex("PreProtocolChars");
       ADT_PreProtocolChars = $adt("PreProtocolChars");
       NT_NamedBackslash = $lex("NamedBackslash");
       ADT_NamedBackslash = $adt("NamedBackslash");
       ADT_HorizontalSpace = $layouts("HorizontalSpace");
       NT_MidProtocolChars = $lex("MidProtocolChars");
       ADT_MidProtocolChars = $adt("MidProtocolChars");
       ADT_RascalKeywords = $keywords("RascalKeywords");
       NT_Label = $sort("Label");
       ADT_Label = $adt("Label");
       NT_Kind = $sort("Kind");
       ADT_Kind = $adt("Kind");
       NT_Prod = $sort("Prod");
       ADT_Prod = $adt("Prod");
       NT_RegExpModifier = $lex("RegExpModifier");
       ADT_RegExpModifier = $adt("RegExpModifier");
       ADT_Condition = $adt("Condition");
       NT_NamedRegExp = $lex("NamedRegExp");
       ADT_NamedRegExp = $adt("NamedRegExp");
       NT_Parameters = $sort("Parameters");
       ADT_Parameters = $adt("Parameters");
       ADT_RuntimeException = $adt("RuntimeException");
       NT_DecimalIntegerLiteral = $lex("DecimalIntegerLiteral");
       ADT_DecimalIntegerLiteral = $adt("DecimalIntegerLiteral");
       NT_Assoc = $sort("Assoc");
       ADT_Assoc = $adt("Assoc");
       NT_DateTimeLiteral = $sort("DateTimeLiteral");
       ADT_DateTimeLiteral = $adt("DateTimeLiteral");
       NT_FunctionModifier = $sort("FunctionModifier");
       ADT_FunctionModifier = $adt("FunctionModifier");
       NT_EvalCommand = $sort("EvalCommand");
       ADT_EvalCommand = $adt("EvalCommand");
       NT_JustTime = $lex("JustTime");
       ADT_JustTime = $adt("JustTime");
       NT_UnicodeEscape = $lex("UnicodeEscape");
       ADT_UnicodeEscape = $adt("UnicodeEscape");
       NT_ProdModifier = $sort("ProdModifier");
       ADT_ProdModifier = $adt("ProdModifier");
       NT_Assignable = $sort("Assignable");
       ADT_Assignable = $adt("Assignable");
       NT_Statement = $sort("Statement");
       ADT_Statement = $adt("Statement");
       NT_StringCharacter = $lex("StringCharacter");
       ADT_StringCharacter = $adt("StringCharacter");
       NT_Literal = $sort("Literal");
       ADT_Literal = $adt("Literal");
       NT_Toplevel = $sort("Toplevel");
       ADT_Toplevel = $adt("Toplevel");
       NT_ConcretePart = $lex("ConcretePart");
       ADT_ConcretePart = $adt("ConcretePart");
       NT_StructuredType = $sort("StructuredType");
       ADT_StructuredType = $adt("StructuredType");
       NT_Visit = $sort("Visit");
       ADT_Visit = $adt("Visit");
       NT_Command = $sort("Command");
       ADT_Command = $adt("Command");
       NT_StringTemplate = $sort("StringTemplate");
       ADT_StringTemplate = $adt("StringTemplate");
       NT_OctalIntegerLiteral = $lex("OctalIntegerLiteral");
       ADT_OctalIntegerLiteral = $adt("OctalIntegerLiteral");
       NT_ProtocolPart = $sort("ProtocolPart");
       ADT_ProtocolPart = $adt("ProtocolPart");
       NT_CommonKeywordParameters = $sort("CommonKeywordParameters");
       ADT_CommonKeywordParameters = $adt("CommonKeywordParameters");
       NT_PathChars = $lex("PathChars");
       ADT_PathChars = $adt("PathChars");
       NT_BasicType = $sort("BasicType");
       ADT_BasicType = $adt("BasicType");
       NT_Commands = $sort("Commands");
       ADT_Commands = $adt("Commands");
       NT_ProtocolTail = $sort("ProtocolTail");
       ADT_ProtocolTail = $adt("ProtocolTail");
       NT_Comment = $lex("Comment");
       ADT_Comment = $adt("Comment");
       $T5 = $TF.stringType();
       $T9 = $TF.stringType();
       $T2 = $TF.valueType();
       $T17 = $TF.parameterType("A", $T2);
       $T6 = $TF.voidType();
       $T3 = $TF.parameterType("T", $T2);
       $T0 = $TF.setType(NT_Import);
       $T15 = $TF.parameterType("T", ADT_Tree);
       NT_KeywordArguments_1 = $parameterizedSort("KeywordArguments", new Type[] { $T15 }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Parameter, $RVF.string("T"), $RVF.constructor(RascalValueFactory.Symbol_Adt, $RVF.string("Tree"), $RVF.list()))));
       NT_Mapping_Pattern = $parameterizedSort("Mapping", new Type[] { ADT_Pattern }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Pattern"))));
       $T11 = $TF.setType($T5);
       $T16 = $TF.parameterType("T", ADT_Tree);
       $T10 = $TF.setType($T5);
       NT_Mapping_Expression = $parameterizedSort("Mapping", new Type[] { ADT_Expression }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Expression"))));
       NT_KeywordArguments_Expression = $parameterizedSort("KeywordArguments", new Type[] { ADT_Expression }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Expression"))));
       NT_Mapping_1 = $parameterizedSort("Mapping", new Type[] { $T15 }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Parameter, $RVF.string("T"), $RVF.constructor(RascalValueFactory.Symbol_Adt, $RVF.string("Tree"), $RVF.list()))));
       ADT_Maybe_1 = $parameterizedAdt("Maybe", new Type[] { $T17 });
       $T14 = $TF.setType(NT_Module);
       ADT_Maybe_Attr = $parameterizedAdt("Maybe", new Type[] { ADT_Attr });
       $T1 = $TF.listType($T3);
       ADT_TreeSearchResult_void = $parameterizedAdt("TreeSearchResult", new Type[] { $T6 });
       NT_KeywordArguments_Pattern = $parameterizedSort("KeywordArguments", new Type[] { ADT_Pattern }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Pattern"))));
       $T12 = $TF.setType(NT_SyntaxDefinition);
       $T13 = $TF.tupleType($T10, $T11, $T12);
       NT_KeywordArgument_1 = $parameterizedSort("KeywordArgument", new Type[] { $T15 }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Parameter, $RVF.string("T"), $RVF.constructor(RascalValueFactory.Symbol_Adt, $RVF.string("Tree"), $RVF.list()))));
       $T8 = $TF.mapType($T9, "name", $T13, "mod");
       ADT_Maybe_Symbol = $parameterizedAdt("Maybe", new Type[] { ADT_Symbol });
       ADT_Maybe_Associativity = $parameterizedAdt("Maybe", new Type[] { ADT_Associativity });
       ADT_TreeSearchResult_Tree = $parameterizedAdt("TreeSearchResult", new Type[] { ADT_Tree });
       $T7 = $TF.setType(ADT_Production);
       ADT_TreeSearchResult_1 = $parameterizedAdt("TreeSearchResult", new Type[] { $T15 });
       $T18 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Import")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       ADT_Maybe_void = $parameterizedAdt("Maybe", new Type[] { $T6 });
       $T4 = $TF.setType($T3);
       ADT_KeywordArguments_1 = $TF.abstractDataType($TS, "KeywordArguments", new Type[] { $T15 });
       ADT_Mapping_Pattern = $TF.abstractDataType($TS, "Mapping", new Type[] { ADT_Pattern });
       ADT_Mapping_Expression = $TF.abstractDataType($TS, "Mapping", new Type[] { ADT_Expression });
       ADT_KeywordArguments_Expression = $TF.abstractDataType($TS, "KeywordArguments", new Type[] { ADT_Expression });
       ADT_Mapping_1 = $TF.abstractDataType($TS, "Mapping", new Type[] { $T15 });
       ADT_KeywordArguments_Pattern = $TF.abstractDataType($TS, "KeywordArguments", new Type[] { ADT_Pattern });
       ADT_KeywordArgument_1 = $TF.abstractDataType($TS, "KeywordArgument", new Type[] { $T15 });
       Maybe_Attr_just_Attr = $TF.constructor($TS, ADT_Maybe_Attr, "just", M_Type.ADT_Attr, "val");
       Maybe_Symbol_just_Symbol = $TF.constructor($TS, ADT_Maybe_Symbol, "just", M_Type.ADT_Symbol, "val");
       Maybe_Associativity_just_Associativity = $TF.constructor($TS, ADT_Maybe_Associativity, "just", M_ParseTree.ADT_Associativity, "val");
       TreeSearchResult_Tree_treeFound_Tree = $TF.constructor($TS, ADT_TreeSearchResult_Tree, "treeFound", M_ParseTree.ADT_Tree, "tree");
    
       
       
    }
    public IConstructor imports2grammar(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IConstructor)imports2grammar$6f5cb5c7b725e5f9((ISet) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IBool sameType(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IBool) M_ParseTree.sameType($P0, $P1);
    }
    public IValue head(IValue $P0){ // Generated by Resolver
       return (IValue) M_List.head($P0);
    }
    public IConstructor fuse(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_Grammar.ADT_GrammarDefinition)){
         $result = (IConstructor)fuse$cde4ac198769a78a((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IConstructor module2grammar(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isNonTerminal($P0Type, M_lang_rascal_syntax_Rascal.NT_Module)){
         $result = (IConstructor)module2grammar$2ae4fac1e334acb7((ITree) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IConstructor choice(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IConstructor) M_Type.choice($P0, $P1);
    }
    public IValue max(IValue $P0){ // Generated by Resolver
       return (IValue) M_List.max($P0);
    }
    public IConstructor priority(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IConstructor) M_ParseTree.priority($P0, $P1);
    }
    public IConstructor grammar(IValue $P0){ // Generated by Resolver
       return (IConstructor) M_Grammar.grammar($P0);
    }
    public IConstructor grammar(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IConstructor) M_Grammar.grammar($P0, $P1);
    }
    public ITuple takeOneFrom(IValue $P0){ // Generated by Resolver
       ITuple $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T1)){
         $result = (ITuple)M_List.takeOneFrom$c52f3e30bbbc1271((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T4)){
         $result = (ITuple)M_Set.takeOneFrom$cae8ac4f2699365b((ISet) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public INode layouts(IValue $P0){ // Generated by Resolver
       INode $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_Grammar.ADT_GrammarDefinition)){
         $result = (INode)M_lang_rascal_grammar_definition_Layout.layouts$48b8dbd016b33b5e((IConstructor) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T5)){
         return $RVF.constructor(M_ParseTree.Symbol_layouts_str, new IValue[]{(IString) $P0});
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IConstructor layouts(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       return (IConstructor) M_lang_rascal_grammar_definition_Layout.layouts($P0, $P1, $P2);
    }
    public ISet collect(IValue $P0){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       if($isNonTerminal($P0Type, M_lang_rascal_syntax_Rascal.NT_Module)){
         $result = (ISet)collect$d5c0e418f2407f57((ITree) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IBool equivalent(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IBool) M_Type.equivalent($P0, $P1);
    }
    public IList tail(IValue $P0){ // Generated by Resolver
       return (IList) M_List.tail($P0);
    }
    public ITuple headTail(IValue $P0){ // Generated by Resolver
       return (ITuple) M_List.headTail($P0);
    }
    public IConstructor treeAt(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       return (IConstructor) M_ParseTree.treeAt($P0, $P1, $P2);
    }
    public IBool intersects(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IBool) M_Type.intersects($P0, $P1);
    }
    public IBool isNonTerminalType(IValue $P0){ // Generated by Resolver
       return (IBool) M_ParseTree.isNonTerminalType($P0);
    }
    public IValue lub(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IValue) M_Type.lub($P0, $P1);
    }
    public IBool comparable(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IBool) M_Type.comparable($P0, $P1);
    }
    public IBool subtype(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IBool) M_Type.subtype($P0, $P1);
    }
    public IConstructor associativity(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol) && $isSubtypeOf($P1Type, ADT_Maybe_void) && $isSubtypeOf($P2Type, M_Type.ADT_Production)){
         $result = (IConstructor)M_lang_rascal_grammar_definition_Productions.associativity$453839dc0f171b40((IConstructor) $P0, (IConstructor) $P1, (IConstructor) $P2);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol) && $isSubtypeOf($P1Type, M_ParseTree.ADT_Associativity) && $isSubtypeOf($P2Type,$T7)){
         $result = (IConstructor)M_ParseTree.associativity$1d00327eefbb3803((IConstructor) $P0, (IConstructor) $P1, (ISet) $P2);
         if($result != null) return $result;
         $result = (IConstructor)M_ParseTree.associativity$feae421831fcd92c((IConstructor) $P0, (IConstructor) $P1, (ISet) $P2);
         if($result != null) return $result;
         $result = (IConstructor)M_ParseTree.associativity$5296642432c60eb8((IConstructor) $P0, (IConstructor) $P1, (ISet) $P2);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol) && $isSubtypeOf($P1Type, ADT_Maybe_Associativity) && $isSubtypeOf($P2Type, M_Type.ADT_Production)){
         $result = (IConstructor)M_lang_rascal_grammar_definition_Productions.associativity$308c5e95cc6b10aa((IConstructor) $P0, (IConstructor) $P1, (IConstructor) $P2);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol) && $isSubtypeOf($P1Type, M_ParseTree.ADT_Associativity) && $isSubtypeOf($P2Type,$T7)){
         return $RVF.constructor(M_ParseTree.Production_associativity_Symbol_Associativity_set_Production, new IValue[]{(IConstructor) $P0, (IConstructor) $P1, (ISet) $P2});
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public ITuple getModuleMetaInf(IValue $P0){ // Generated by Resolver
       ITuple $result = null;
       Type $P0Type = $P0.getType();
       if($isNonTerminal($P0Type, M_lang_rascal_syntax_Rascal.NT_Module)){
         $result = (ITuple)getModuleMetaInf$7a842acfa8e5f964((ITree) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public ISet getModuleSyntaxDefinitions(IValue $P0){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       if($isNonTerminal($P0Type, M_lang_rascal_syntax_Rascal.NT_Module)){
         $result = (ISet)getModuleSyntaxDefinitions$96feb3035596d6cd((ITree) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString deslash(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T5)){
         $result = (IString)deslash$4c6fb43a5fffd2c4((IString) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IConstructor modules2grammar(IValue $P0, IValue $P1){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T5) && $isSubtypeOf($P1Type,$T8)){
         $result = (IConstructor)modules2grammar$927186881826b53a((IString) $P0, (IMap) $P1);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T5) && $isSubtypeOf($P1Type,$T14)){
         $result = (IConstructor)modules2grammar$5c549c8c80ced6de((IString) $P0, (ISet) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IValue glb(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IValue) M_Type.glb($P0, $P1);
    }
    public IConstructor modules2definition(IValue $P0, IValue $P1){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T5) && $isSubtypeOf($P1Type,$T14)){
         $result = (IConstructor)modules2definition$2d5c4ed2c51e050f((IString) $P0, (ISet) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }

    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Modules.rsc|(720,747,<21,0>,<33,1>) 
    private final ExpiringFunctionResultCache<IValue> $memo_modules2grammar$927186881826b53a = new ExpiringFunctionResultCache<IValue>(-1, -1);
    public IConstructor modules2grammar$927186881826b53a(IString main_0, IMap mods_1){ 
        
        
        final IValue[] $actuals = new IValue[] {main_0,mods_1};
        IValue $memoVal = $memo_modules2grammar$927186881826b53a.lookup($actuals, Collections.emptyMap());
        if($memoVal != null) return (IConstructor) $memoVal;
        final IMapWriter $mapwriter0 = (IMapWriter)$RVF.mapWriter();
        $MCOMP1_GEN1413:
        for(IValue $elem2_for : ((IMap)mods_1)){
            IString $elem2 = (IString) $elem2_for;
            IString m_3 = ((IString)($elem2));
            $mapwriter0.insert($RVF.tuple(m_3, $RVF.constructor(M_Grammar.GrammarModule_module_str_set_str_set_str_Grammar, new IValue[]{((IString)m_3), ((ISet)($atuple_field_project((ITuple)((ITuple)($amap_subscript(((IMap)mods_1),((IString)m_3)))), ((IInteger)$constants.get(0)/*0*/)))), ((ISet)($atuple_field_project((ITuple)((ITuple)($amap_subscript(((IMap)mods_1),((IString)m_3)))), ((IInteger)$constants.get(1)/*1*/)))), ((IConstructor)(M_lang_rascal_grammar_definition_Productions.syntax2grammar(((ISet)($atuple_field_project((ITuple)((ITuple)($amap_subscript(((IMap)mods_1),((IString)m_3)))), ((IInteger)$constants.get(2)/*2*/)))))))})));
        
        }
        
                    IConstructor def_2 = ((IConstructor)($RVF.constructor(M_Grammar.GrammarDefinition_definition_str_map_str_GrammarModule, new IValue[]{((IString)main_0), ((IMap)($mapwriter0.done()))})));
        $memoVal = M_lang_rascal_grammar_definition_Names.resolve(((IConstructor)($me.fuse(((IConstructor)(M_lang_rascal_grammar_definition_Layout.layouts(((IConstructor)def_2))))))));
        $memo_modules2grammar$927186881826b53a.store($actuals, Collections.emptyMap(), $memoVal);
        return (IConstructor)$memoVal;
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Modules.rsc|(1471,246,<35,0>,<39,1>) 
    private final ExpiringFunctionResultCache<IValue> $memo_modules2grammar$5c549c8c80ced6de = new ExpiringFunctionResultCache<IValue>(-1, -1);
    public IConstructor modules2grammar$5c549c8c80ced6de(IString main_0, ISet modules_1){ 
        
        
        final IValue[] $actuals = new IValue[] {main_0,modules_1};
        IValue $memoVal = $memo_modules2grammar$5c549c8c80ced6de.lookup($actuals, Collections.emptyMap());
        if($memoVal != null) return (IConstructor) $memoVal;
        $memoVal = M_lang_rascal_grammar_definition_Names.resolve(((IConstructor)($me.fuse(((IConstructor)(M_lang_rascal_grammar_definition_Layout.layouts(((IConstructor)($me.modules2definition(((IString)main_0), ((ISet)modules_1)))))))))));
        $memo_modules2grammar$5c549c8c80ced6de.store($actuals, Collections.emptyMap(), $memoVal);
        return (IConstructor)$memoVal;
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Modules.rsc|(1721,249,<41,0>,<44,1>) 
    public IConstructor modules2definition$2d5c4ed2c51e050f(IString main_0, ISet modules_1){ 
        
        
        final IMapWriter $mapwriter5 = (IMapWriter)$RVF.mapWriter();
        $MCOMP6_GEN1925:
        for(IValue $elem8_for : ((ISet)modules_1)){
            ITree $elem8 = (ITree) $elem8_for;
            ITree m_2 = ((ITree)($elem8));
            final IConstructor $subject_val7 = ((IConstructor)($me.module2grammar(((ITree)m_2))));
            IConstructor mod_3 = null;
            $mapwriter5.insert($RVF.tuple(((IString)($aadt_get_field(((IConstructor)($subject_val7)), "name"))), $subject_val7));
        
        }
        
                    return ((IConstructor)($RVF.constructor(M_Grammar.GrammarDefinition_definition_str_map_str_GrammarModule, new IValue[]{((IString)main_0), ((IMap)($mapwriter5.done()))})));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Modules.rsc|(1974,732,<46,0>,<68,1>) 
    public IConstructor fuse$cde4ac198769a78a(IConstructor def_0){ 
        
        
        IConstructor result_1 = ((IConstructor)$constants.get(3)/*grammar({},())*/);
        ISet todo_2 = ((ISet)($RVF.set(((IString)(((IString)($aadt_get_field(((IConstructor)def_0), "main"))))))));
        ISet done_3 = ((ISet)$constants.get(4)/*{}*/);
        ISet deps_4 = ((ISet)(M_Grammar.dependencies(((IConstructor)def_0))));
        /*muExists*/WHILE0_BT: 
            do {
                WHILE0:
                    while((((IBool)($equal(((ISet)todo_2),((ISet)$constants.get(4)/*{}*/)).not()))).getValue()){
                        ITuple $TMP9 = (ITuple)(M_Set.takeOneFrom(((ISet)todo_2)));
                        IString nm_5 = ((IString)($atuple_subscript_int(((ITuple)($TMP9)),0)));
                        todo_2 = ((ISet)($atuple_subscript_int(((ITuple)($TMP9)),1)));
                        done_3 = ((ISet)($aset_add_elm(((ISet)done_3),((IString)nm_5))));
                        if($is_defined_value($guarded_map_subscript(((IMap)(((IMap)($aadt_get_field(((IConstructor)def_0), "modules"))))),((IString)nm_5)))){
                           IConstructor mod_6 = ((IConstructor)($amap_subscript(((IMap)(((IMap)($aadt_get_field(((IConstructor)def_0), "modules"))))),((IString)nm_5))));
                           IConstructor $reducer12 = (IConstructor)(M_Grammar.compose(((IConstructor)result_1), ((IConstructor)(((IConstructor)($aadt_get_field(((IConstructor)mod_6), "grammar")))))));
                           $REDUCER11_GEN2484:
                           for(IValue $elem13_for : ((ISet)($arel_subscript1_noset(((ISet)deps_4),((IString)nm_5))))){
                               IString $elem13 = (IString) $elem13_for;
                               IString i_8 = ((IString)($elem13));
                               if($is_defined_value($guarded_map_subscript(((IMap)(((IMap)($aadt_get_field(((IConstructor)def_0), "modules"))))),((IString)i_8)))){
                                 $reducer12 = ((IConstructor)(M_Grammar.compose(((IConstructor)($reducer12)), ((IConstructor)(((IConstructor)($aadt_get_field(((IConstructor)($amap_subscript(((IMap)(((IMap)($aadt_get_field(((IConstructor)def_0), "modules"))))),((IString)i_8)))), "grammar"))))))));
                               
                               } else {
                                 continue $REDUCER11_GEN2484;
                               }
                           
                           }
                           
                                       result_1 = ((IConstructor)($reducer12));
                           todo_2 = ((ISet)($aset_add_aset(((ISet)todo_2),((ISet)(((ISet)(((ISet)($aadt_get_field(((IConstructor)mod_6), "extends"))))).subtract(((ISet)done_3)))))));
                        
                        } else {
                           final Template $template10 = (Template)new Template($RVF, "Fuse algorithm misses module definition for dependency ");
                           $template10.beginIndent("                                                       ");
                           $template10.addStr(((IString)nm_5).getValue());
                           $template10.endIndent("                                                       ");
                           $RVF.constructor(M_Message.Message_warning_str_loc, new IValue[]{((IString)($template10.close())), ((ISourceLocation)($create_aloc(((IString)$constants.get(5)/*"unknown:///"*/))))}, Util.kwpMap());
                        
                        }
                    }
        
            } while(false);
        /* void:  muCon([]) */return ((IConstructor)result_1);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Modules.rsc|(2715,165,<72,0>,<75,1>) 
    public IConstructor module2grammar$2ae4fac1e334acb7(ITree mod_0){ 
        
        
        ITuple $TMP14 = (ITuple)($me.getModuleMetaInf(((ITree)mod_0)));
        IString nm_1 = ((IString)($atuple_subscript_int(((ITuple)($TMP14)),0)));
        ISet imps_2 = ((ISet)($atuple_subscript_int(((ITuple)($TMP14)),1)));
        ISet exts_3 = ((ISet)($atuple_subscript_int(((ITuple)($TMP14)),2)));
        return ((IConstructor)($RVF.constructor(M_Grammar.GrammarModule_module_str_set_str_set_str_Grammar, new IValue[]{((IString)nm_1), ((ISet)imps_2), ((ISet)exts_3), ((IConstructor)(M_lang_rascal_grammar_definition_Productions.syntax2grammar(((ISet)($me.collect(((ITree)mod_0)))))))})));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Modules.rsc|(2885,784,<77,0>,<90,1>) 
    public ITuple getModuleMetaInf$7a842acfa8e5f964(ITree mod_0){ 
        
        
        final ITree $switchVal15 = ((ITree)mod_0);
        boolean noCaseMatched_$switchVal15 = true;
        SWITCH2: switch(Fingerprint.getFingerprint($switchVal15)){
        
            case 0:
                if(noCaseMatched_$switchVal15){
                    noCaseMatched_$switchVal15 = false;
                    
                }
                
        
            default: if($isSubtypeOf($switchVal15.getType(),M_lang_rascal_syntax_Rascal.NT_Module)){
                        /*muExists*/CASE_0_0: 
                            do {
                                if($nonterminal_has_name_and_arity($switchVal15, "default", 2)){
                                   IValue $arg0_36 = (IValue)($nonterminal_get_arg(((ITree)((ITree)($switchVal15))), ((IInteger)$constants.get(0)/*0*/).intValue()));
                                   if($isComparable($arg0_36.getType(), M_lang_rascal_syntax_Rascal.NT_Header)){
                                      if($nonterminal_has_name_and_arity($arg0_36, "parameters", 4)){
                                         IValue $arg0_40 = (IValue)($nonterminal_get_arg(((ITree)((ITree)($arg0_36))), ((IInteger)$constants.get(0)/*0*/).intValue()));
                                         if($isComparable($arg0_40.getType(), $T2)){
                                            IValue $arg1_39 = (IValue)($nonterminal_get_arg(((ITree)((ITree)($arg0_36))), ((IInteger)$constants.get(1)/*1*/).intValue()));
                                            if($isComparable($arg1_39.getType(), M_lang_rascal_syntax_Rascal.NT_QualifiedName)){
                                               ITree name_1 = ((ITree)($arg1_39));
                                               IValue $arg2_38 = (IValue)($nonterminal_get_arg(((ITree)((ITree)($arg0_36))), ((IInteger)$constants.get(2)/*2*/).intValue()));
                                               if($isComparable($arg2_38.getType(), $T2)){
                                                  IValue $arg3_37 = (IValue)($nonterminal_get_arg(((ITree)((ITree)($arg0_36))), ((IInteger)$constants.get(6)/*3*/).intValue()));
                                                  if($isComparable($arg3_37.getType(), $T18)){
                                                     ITree is_2 = ((ITree)($arg3_37));
                                                     IValue $arg1_35 = (IValue)($nonterminal_get_arg(((ITree)((ITree)($switchVal15))), ((IInteger)$constants.get(1)/*1*/).intValue()));
                                                     if($isComparable($arg1_35.getType(), $T2)){
                                                        final Template $template16 = (Template)new Template($RVF, "");
                                                        $template16.addVal($arg1_39);
                                                        final ISetWriter $setwriter17 = (ISetWriter)$RVF.setWriter();
                                                        ;
                                                        /*muExists*/$SCOMP18_GEN3227_CONS_$default: 
                                                            do {
                                                                final ITree $exp21 = ((ITree)($arg3_37));
                                                                final int $last22 = (int)((ITree)($exp21)).getArgs().length() - 1;
                                                                $SCOMP18_GEN3227:
                                                                
                                                                for(int $i23 = 0; $i23 <= $last22; $i23 += 2){
                                                                   final ITree $elem20 = ((ITree)($iter_subscript($exp21, $i23)));
                                                                   if($elem20 instanceof INode && ((INode)$elem20).arity() == 1 && ((INode)$elem20).getName().equals("default")){
                                                                      IValue $arg0_24 = (IValue)($nonterminal_get_arg(((ITree)((ITree)($elem20))), ((IInteger)$constants.get(0)/*0*/).intValue()));
                                                                      if($isComparable($arg0_24.getType(), M_lang_rascal_syntax_Rascal.NT_ImportedModule)){
                                                                         if($arg0_24 instanceof INode && ((INode)$arg0_24).arity() == 1 && ((INode)$arg0_24).getName().equals("default")){
                                                                            IValue $arg0_25 = (IValue)($nonterminal_get_arg(((ITree)((ITree)($arg0_24))), ((IInteger)$constants.get(0)/*0*/).intValue()));
                                                                            if($isComparable($arg0_25.getType(), M_lang_rascal_syntax_Rascal.NT_QualifiedName)){
                                                                               ITree i_3 = ((ITree)($arg0_25));
                                                                               final Template $template19 = (Template)new Template($RVF, "");
                                                                               $template19.addVal($arg0_25);
                                                                               $setwriter17.insert($me.deslash(((IString)($template19.close()))));
                                                                            
                                                                            } else {
                                                                               continue $SCOMP18_GEN3227;
                                                                            }
                                                                         } else {
                                                                            continue $SCOMP18_GEN3227;
                                                                         }
                                                                      } else {
                                                                         continue $SCOMP18_GEN3227;
                                                                      }
                                                                   } else {
                                                                      continue $SCOMP18_GEN3227;
                                                                   }
                                                                }
                                                                
                                                        
                                                            } while(false);
                                                        final ISetWriter $setwriter26 = (ISetWriter)$RVF.setWriter();
                                                        ;
                                                        /*muExists*/$SCOMP27_GEN3314_CONS_extend: 
                                                            do {
                                                                final ITree $exp30 = ((ITree)($arg3_37));
                                                                final int $last31 = (int)((ITree)($exp30)).getArgs().length() - 1;
                                                                $SCOMP27_GEN3314:
                                                                
                                                                for(int $i32 = 0; $i32 <= $last31; $i32 += 2){
                                                                   final ITree $elem29 = ((ITree)($iter_subscript($exp30, $i32)));
                                                                   if($nonterminal_has_name_and_arity($elem29, "extend", 1)){
                                                                      IValue $arg0_33 = (IValue)($nonterminal_get_arg(((ITree)((ITree)($elem29))), ((IInteger)$constants.get(0)/*0*/).intValue()));
                                                                      if($isComparable($arg0_33.getType(), M_lang_rascal_syntax_Rascal.NT_ImportedModule)){
                                                                         if($arg0_33 instanceof INode && ((INode)$arg0_33).arity() == 1 && ((INode)$arg0_33).getName().equals("default")){
                                                                            IValue $arg0_34 = (IValue)($nonterminal_get_arg(((ITree)((ITree)($arg0_33))), ((IInteger)$constants.get(0)/*0*/).intValue()));
                                                                            if($isComparable($arg0_34.getType(), M_lang_rascal_syntax_Rascal.NT_QualifiedName)){
                                                                               ITree i_4 = ((ITree)($arg0_34));
                                                                               final Template $template28 = (Template)new Template($RVF, "");
                                                                               $template28.addVal($arg0_34);
                                                                               $setwriter26.insert($me.deslash(((IString)($template28.close()))));
                                                                            
                                                                            } else {
                                                                               continue $SCOMP27_GEN3314;
                                                                            }
                                                                         } else {
                                                                            continue $SCOMP27_GEN3314;
                                                                         }
                                                                      } else {
                                                                         continue $SCOMP27_GEN3314;
                                                                      }
                                                                   } else {
                                                                      continue $SCOMP27_GEN3314;
                                                                   }
                                                                }
                                                                
                                                        
                                                            } while(false);
                                                        return ((ITuple)($RVF.tuple(((IString)($me.deslash(((IString)($template16.close()))))), ((ISet)($setwriter17.done())), ((ISet)($setwriter26.done())))));
                                                     
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
                     if($isSubtypeOf($switchVal15.getType(),M_lang_rascal_syntax_Rascal.NT_Module)){
                        /*muExists*/CASE_0_1: 
                            do {
                                if($nonterminal_has_name_and_arity($switchVal15, "default", 2)){
                                   IValue $arg0_61 = (IValue)($nonterminal_get_arg(((ITree)((ITree)($switchVal15))), ((IInteger)$constants.get(0)/*0*/).intValue()));
                                   if($isComparable($arg0_61.getType(), M_lang_rascal_syntax_Rascal.NT_Header)){
                                      if($nonterminal_has_name_and_arity($arg0_61, "default", 3)){
                                         IValue $arg0_64 = (IValue)($nonterminal_get_arg(((ITree)((ITree)($arg0_61))), ((IInteger)$constants.get(0)/*0*/).intValue()));
                                         if($isComparable($arg0_64.getType(), $T2)){
                                            IValue $arg1_63 = (IValue)($nonterminal_get_arg(((ITree)((ITree)($arg0_61))), ((IInteger)$constants.get(1)/*1*/).intValue()));
                                            if($isComparable($arg1_63.getType(), M_lang_rascal_syntax_Rascal.NT_QualifiedName)){
                                               ITree name_5 = ((ITree)($arg1_63));
                                               IValue $arg2_62 = (IValue)($nonterminal_get_arg(((ITree)((ITree)($arg0_61))), ((IInteger)$constants.get(2)/*2*/).intValue()));
                                               if($isComparable($arg2_62.getType(), $T18)){
                                                  ITree is_6 = ((ITree)($arg2_62));
                                                  IValue $arg1_60 = (IValue)($nonterminal_get_arg(((ITree)((ITree)($switchVal15))), ((IInteger)$constants.get(1)/*1*/).intValue()));
                                                  if($isComparable($arg1_60.getType(), $T2)){
                                                     final Template $template41 = (Template)new Template($RVF, "");
                                                     $template41.addVal($arg1_63);
                                                     final ISetWriter $setwriter42 = (ISetWriter)$RVF.setWriter();
                                                     ;
                                                     /*muExists*/$SCOMP43_GEN3481_CONS_$default: 
                                                         do {
                                                             final ITree $exp46 = ((ITree)($arg2_62));
                                                             final int $last47 = (int)((ITree)($exp46)).getArgs().length() - 1;
                                                             $SCOMP43_GEN3481:
                                                             
                                                             for(int $i48 = 0; $i48 <= $last47; $i48 += 2){
                                                                final ITree $elem45 = ((ITree)($iter_subscript($exp46, $i48)));
                                                                if($elem45 instanceof INode && ((INode)$elem45).arity() == 1 && ((INode)$elem45).getName().equals("default")){
                                                                   IValue $arg0_49 = (IValue)($nonterminal_get_arg(((ITree)((ITree)($elem45))), ((IInteger)$constants.get(0)/*0*/).intValue()));
                                                                   if($isComparable($arg0_49.getType(), M_lang_rascal_syntax_Rascal.NT_ImportedModule)){
                                                                      if($arg0_49 instanceof INode && ((INode)$arg0_49).arity() == 1 && ((INode)$arg0_49).getName().equals("default")){
                                                                         IValue $arg0_50 = (IValue)($nonterminal_get_arg(((ITree)((ITree)($arg0_49))), ((IInteger)$constants.get(0)/*0*/).intValue()));
                                                                         if($isComparable($arg0_50.getType(), M_lang_rascal_syntax_Rascal.NT_QualifiedName)){
                                                                            ITree i_7 = ((ITree)($arg0_50));
                                                                            final Template $template44 = (Template)new Template($RVF, "");
                                                                            $template44.addVal($arg0_50);
                                                                            $setwriter42.insert($me.deslash(((IString)($template44.close()))));
                                                                         
                                                                         } else {
                                                                            continue $SCOMP43_GEN3481;
                                                                         }
                                                                      } else {
                                                                         continue $SCOMP43_GEN3481;
                                                                      }
                                                                   } else {
                                                                      continue $SCOMP43_GEN3481;
                                                                   }
                                                                } else {
                                                                   continue $SCOMP43_GEN3481;
                                                                }
                                                             }
                                                             
                                                     
                                                         } while(false);
                                                     final ISetWriter $setwriter51 = (ISetWriter)$RVF.setWriter();
                                                     ;
                                                     /*muExists*/$SCOMP52_GEN3568_CONS_extend: 
                                                         do {
                                                             final ITree $exp55 = ((ITree)($arg2_62));
                                                             final int $last56 = (int)((ITree)($exp55)).getArgs().length() - 1;
                                                             $SCOMP52_GEN3568:
                                                             
                                                             for(int $i57 = 0; $i57 <= $last56; $i57 += 2){
                                                                final ITree $elem54 = ((ITree)($iter_subscript($exp55, $i57)));
                                                                if($nonterminal_has_name_and_arity($elem54, "extend", 1)){
                                                                   IValue $arg0_58 = (IValue)($nonterminal_get_arg(((ITree)((ITree)($elem54))), ((IInteger)$constants.get(0)/*0*/).intValue()));
                                                                   if($isComparable($arg0_58.getType(), M_lang_rascal_syntax_Rascal.NT_ImportedModule)){
                                                                      if($arg0_58 instanceof INode && ((INode)$arg0_58).arity() == 1 && ((INode)$arg0_58).getName().equals("default")){
                                                                         IValue $arg0_59 = (IValue)($nonterminal_get_arg(((ITree)((ITree)($arg0_58))), ((IInteger)$constants.get(0)/*0*/).intValue()));
                                                                         if($isComparable($arg0_59.getType(), M_lang_rascal_syntax_Rascal.NT_QualifiedName)){
                                                                            ITree i_8 = ((ITree)($arg0_59));
                                                                            final Template $template53 = (Template)new Template($RVF, "");
                                                                            $template53.addVal($arg0_59);
                                                                            $setwriter51.insert($me.deslash(((IString)($template53.close()))));
                                                                         
                                                                         } else {
                                                                            continue $SCOMP52_GEN3568;
                                                                         }
                                                                      } else {
                                                                         continue $SCOMP52_GEN3568;
                                                                      }
                                                                   } else {
                                                                      continue $SCOMP52_GEN3568;
                                                                   }
                                                                } else {
                                                                   continue $SCOMP52_GEN3568;
                                                                }
                                                             }
                                                             
                                                     
                                                         } while(false);
                                                     return ((ITuple)($RVF.tuple(((IString)($me.deslash(((IString)($template41.close()))))), ((ISet)($setwriter42.done())), ((ISet)($setwriter51.done())))));
                                                  
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
        
                   final Template $template65 = (Template)new Template($RVF, "unexpected module syntax ");
        $template65.beginIndent("                         ");
        $template65.addVal(mod_0);
        $template65.endIndent("                         ");
        throw new Throw($template65.close());
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Modules.rsc|(3674,85,<92,0>,<92,85>) 
    public ISet getModuleSyntaxDefinitions$96feb3035596d6cd(ITree mod_0){ 
        
        
        return ((ISet)($me.collect(((ITree)mod_0))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Modules.rsc|(3764,78,<94,0>,<98,1>) 
    public IString deslash$4c6fb43a5fffd2c4(IString input_0){ 
        
        
        try {
            IValue $visitResult = $TRAVERSE.traverse(DIRECTION.BottomUp, PROGRESS.Continuing, FIXEDPOINT.No, REBUILD.Yes, 
                 new DescendantDescriptor(new io.usethesource.vallang.type.Type[]{$TF.stringType()}, 
                                          new io.usethesource.vallang.IConstructor[]{}, 
                                          $RVF.bool(false)),
                 input_0,
                 (IVisitFunction) (IValue $VISIT3_subject, TraversalState $traversalState) -> {
                     VISIT3:switch(Fingerprint.getFingerprint($VISIT3_subject)){
                     
                         case 0:
                             
                     
                         default: 
                             if($isSubtypeOf($VISIT3_subject.getType(),$T5)){
                                /*muExists*/CASE_0_0: 
                                    do {
                                        final Matcher $matcher67 = (Matcher)$regExpCompile("\\\\", ((IString)($VISIT3_subject)).getValue());
                                        boolean $found68 = true;
                                        
                                            while($found68){
                                                $found68 = $matcher67.find();
                                                if($found68){
                                                   $traversalState.setBegin($matcher67.start());
                                                   $traversalState.setEnd($matcher67.end());
                                                   IString $replacement66 = (IString)(((IString)$constants.get(7)/*""*/));
                                                   if($isSubtypeOf($replacement66.getType(),$VISIT3_subject.getType())){
                                                      $traversalState.setMatchedAndChanged(true, true);
                                                      return $replacement66;
                                                   
                                                   } else {
                                                      break VISIT3;// switch
                                                   
                                                   }
                                                }
                                        
                                            }
                                
                                    } while(false);
                             
                             }
            
                     }
                     return $VISIT3_subject;
                 });
            return (IString)$visitResult;
        
        } catch (ReturnFromTraversalException e) {
            return (IString) e.getValue();
        }
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Modules.rsc|(3846,129,<100,0>,<102,1>) 
    public IConstructor imports2grammar$6f5cb5c7b725e5f9(ISet imports_0){ 
        
        
        final ISetWriter $setwriter69 = (ISetWriter)$RVF.setWriter();
        ;
        /*muExists*/$SCOMP70_GEN3931_CONS_syntax: 
            do {
                $SCOMP70_GEN3931:
                for(IValue $elem71_for : ((ISet)imports_0)){
                    ITree $elem71 = (ITree) $elem71_for;
                    if($nonterminal_has_name_and_arity($elem71, "syntax", 1)){
                       IValue $arg0_72 = (IValue)($nonterminal_get_arg(((ITree)((ITree)($elem71))), ((IInteger)$constants.get(0)/*0*/).intValue()));
                       if($isComparable($arg0_72.getType(), M_lang_rascal_syntax_Rascal.NT_SyntaxDefinition)){
                          ITree s_1 = null;
                          $setwriter69.insert($arg0_72);
                       
                       } else {
                          continue $SCOMP70_GEN3931;
                       }
                    } else {
                       continue $SCOMP70_GEN3931;
                    }
                }
                
                            
            } while(false);
        return ((IConstructor)(M_lang_rascal_grammar_definition_Productions.syntax2grammar(((ISet)($setwriter69.done())))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Modules.rsc|(3980,220,<104,0>,<112,1>) 
    public ISet collect$d5c0e418f2407f57(ITree mod_0){ 
        
        
        try {
            final ValueRef<ISet> result_1 = new ValueRef<ISet>("result", ((ISet)$constants.get(4)/*{}*/));
            $TRAVERSE.traverse(DIRECTION.TopDown, PROGRESS.Breaking, FIXEDPOINT.No, REBUILD.Yes, 
                 new DescendantDescriptor(new io.usethesource.vallang.type.Type[]{}, 
                                          new io.usethesource.vallang.IConstructor[]{((IConstructor)$constants.get(8)/*prod(label("empty",sort("Tag")),[lit("@"),layouts("LAYOUTLIST"),label("name",lex("Name"))],{tag("Fol ...*/), ((IConstructor)$constants.get(15)/*prod(label("default",sort("Import")),[lit("import"),layouts("LAYOUTLIST"),label("module",sort("Impor ...*/), ((IConstructor)$constants.get(22)/*prod(keywords("RascalKeywords"),[lit("tuple")],{})*/), ((IConstructor)$constants.get(25)/*prod(lex("RegExp"),[lit("\<"),lex("Name"),lit(":"),\iter-star(lex("NamedRegExp")),lit("\>")],{})*/), ((IConstructor)$constants.get(32)/*choice(sort("Class"),{prod(label("simpleCharclass",sort("Class")),[lit("["),layouts("LAYOUTLIST"),la ...*/), ((IConstructor)$constants.get(45)/*prod(label("intersection",sort("Class")),[label("lhs",sort("Class")),layouts("LAYOUTLIST"),lit("&&") ...*/), ((IConstructor)$constants.get(50)/*prod(label("default",sort("Catch")),[lit("catch"),layouts("LAYOUTLIST"),lit(":"),layouts("LAYOUTLIST ...*/), ((IConstructor)$constants.get(56)/*prod(label("outermost",sort("Strategy")),[lit("outermost")],{})*/), ((IConstructor)$constants.get(60)/*prod(label("default",sort("StructuredType")),[label("basicType",sort("BasicType")),layouts("LAYOUTLI ...*/), ((IConstructor)$constants.get(69)/*associativity(sort("Sym"),right(),{prod(label("precede",sort("Sym")),[label("match",sort("Sym")),lay ...*/), ((IConstructor)$constants.get(79)/*prod(label("dateTime",sort("BasicType")),[lit("datetime")],{})*/), ((IConstructor)$constants.get(82)/*prod(lex("DecimalIntegerLiteral"),[conditional(lit("0"),{\not-follow(\char-class([range(48,57),range ...*/), ((IConstructor)$constants.get(87)/*prod(label("iter",sort("Sym")),[label("symbol",sort("Sym")),layouts("LAYOUTLIST"),lit("+")],{})*/), ((IConstructor)$constants.get(90)/*prod(label("expression",sort("OptionalExpression")),[label("expression",sort("Expression"))],{})*/), ((IConstructor)$constants.get(95)/*prod(lex("HexIntegerLiteral"),[\char-class([range(48,48)]),\char-class([range(88,88),range(120,120)] ...*/), ((IConstructor)$constants.get(102)/*prod(label("absent",sort("Start")),[],{})*/), ((IConstructor)$constants.get(105)/*prod(label("symbol",sort("Type")),[label("symbol",conditional(sort("Sym"),{except("labeled"),except( ...*/), ((IConstructor)$constants.get(110)/*prod(label("ifThenElse",sort("StringTemplate")),[lit("if"),layouts("LAYOUTLIST"),lit("("),layouts("L ...*/), ((IConstructor)$constants.get(129)/*prod(label("fieldUpdate",sort("Expression")),[label("expression",sort("Expression")),layouts("LAYOUT ...*/), ((IConstructor)$constants.get(134)/*prod(label("subscript",sort("Expression")),[conditional(label("expression",sort("Expression")),{exce ...*/), ((IConstructor)$constants.get(138)/*prod(label("nonEquals",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"),li ...*/), ((IConstructor)$constants.get(143)/*prod(label("join",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"),lit("jo ...*/), ((IConstructor)$constants.get(146)/*prod(label("setOptionTrue",sort("ShellCommand")),[lit("set"),layouts("LAYOUTLIST"),label("name",sort ...*/), ((IConstructor)$constants.get(154)/*prod(label("bool",sort("BasicType")),[lit("bool")],{})*/), ((IConstructor)$constants.get(157)/*prod(label("right",sort("Assoc")),[lit("right")],{})*/), ((IConstructor)$constants.get(161)/*prod(lex("PostPathChars"),[lit("\>"),lex("URLChars"),lit("|")],{})*/), ((IConstructor)$constants.get(165)/*prod(keywords("RascalKeywords"),[lit("int")],{})*/), ((IConstructor)$constants.get(167)/*prod(label("undeclare",sort("ShellCommand")),[lit("undeclare"),layouts("LAYOUTLIST"),label("optName" ...*/), ((IConstructor)$constants.get(172)/*prod(label("function",sort("Declaration")),[label("functionDeclaration",sort("FunctionDeclaration")) ...*/), ((IConstructor)$constants.get(177)/*prod(keywords("RascalKeywords"),[lit("syntax")],{})*/), ((IConstructor)$constants.get(179)/*associativity(sort("Expression"),\non-assoc(),{prod(label("in",sort("Expression")),[label("lhs",sort ...*/), ((IConstructor)$constants.get(186)/*prod(label("match",sort("Expression")),[label("pattern",sort("Pattern")),layouts("LAYOUTLIST"),lit(" ...*/), ((IConstructor)$constants.get(191)/*prod(label("labeled",sort("Sym")),[label("symbol",sort("Sym")),layouts("LAYOUTLIST"),label("label",l ...*/), ((IConstructor)$constants.get(195)/*prod(label("literal",sort("Pattern")),[label("literal",sort("Literal"))],{})*/), ((IConstructor)$constants.get(199)/*prod(label("default",sort("Parameters")),[lit("("),layouts("LAYOUTLIST"),label("formals",sort("Forma ...*/), ((IConstructor)$constants.get(206)/*prod(label("intersection",sort("Assignment")),[lit("&=")],{})*/), ((IConstructor)$constants.get(210)/*prod(label("initialized",sort("Variable")),[label("name",lex("Name")),layouts("LAYOUTLIST"),lit("=") ...*/), ((IConstructor)$constants.get(214)/*prod(label("globalDirective",sort("Statement")),[lit("global"),layouts("LAYOUTLIST"),label("type",so ...*/), ((IConstructor)$constants.get(220)/*prod(keywords("RascalKeywords"),[lit("num")],{})*/), ((IConstructor)$constants.get(222)/*prod(label("template",sort("StringMiddle")),[label("mid",lex("MidStringChars")),layouts("LAYOUTLIST" ...*/), ((IConstructor)$constants.get(228)/*prod(keywords("RascalKeywords"),[lit("tag")],{})*/), ((IConstructor)$constants.get(230)/*prod(label("hole",lex("ConcretePart")),[label("hole",sort("ConcreteHole"))],{tag("category"("variabl ...*/), ((IConstructor)$constants.get(235)/*prod(label("union",sort("Class")),[label("lhs",sort("Class")),layouts("LAYOUTLIST"),lit("||"),layout ...*/), ((IConstructor)$constants.get(238)/*prod(label("alternative",sort("Sym")),[lit("("),layouts("LAYOUTLIST"),label("first",sort("Sym")),lay ...*/), ((IConstructor)$constants.get(243)/*prod(label("division",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"),lit ...*/), ((IConstructor)$constants.get(246)/*prod(label("subtraction",sort("Assignment")),[lit("-=")],{})*/), ((IConstructor)$constants.get(249)/*associativity(sort("Class"),left(),{prod(label("union",sort("Class")),[label("lhs",sort("Class")),la ...*/), ((IConstructor)$constants.get(250)/*prod(label("startOfLine",sort("Sym")),[lit("^"),layouts("LAYOUTLIST"),label("symbol",sort("Sym"))],{ ...*/), ((IConstructor)$constants.get(253)/*choice(sort("Class"),{associativity(sort("Class"),left(),{prod(label("union",sort("Class")),[label(" ...*/), ((IConstructor)$constants.get(256)/*prod(label("unsetOption",sort("ShellCommand")),[lit("unset"),layouts("LAYOUTLIST"),label("name",sort ...*/), ((IConstructor)$constants.get(259)/*prod(keywords("RascalKeywords"),[lit("import")],{})*/), ((IConstructor)$constants.get(260)/*prod(label("midTemplate",sort("StringTail")),[label("mid",lex("MidStringChars")),layouts("LAYOUTLIST ...*/), ((IConstructor)$constants.get(255)/*prod(label("bracket",sort("Class")),[lit("("),layouts("LAYOUTLIST"),label("charClass",sort("Class")) ...*/), ((IConstructor)$constants.get(264)/*prod(label("fieldAccess",sort("Assignable")),[label("receiver",sort("Assignable")),layouts("LAYOUTLI ...*/), ((IConstructor)$constants.get(270)/*prod(label("bracket",sort("Assignable")),[lit("("),layouts("LAYOUTLIST"),label("arg",sort("Assignabl ...*/), ((IConstructor)$constants.get(273)/*prod(label("replacing",sort("PatternWithAction")),[label("pattern",sort("Pattern")),layouts("LAYOUTL ...*/), ((IConstructor)$constants.get(279)/*prod(keywords("RascalKeywords"),[lit("data")],{})*/), ((IConstructor)$constants.get(281)/*prod(label("reifyType",sort("Expression")),[lit("#"),layouts("LAYOUTLIST"),conditional(label("type", ...*/), ((IConstructor)$constants.get(285)/*associativity(sort("Expression"),\non-assoc(),{prod(label("lessThan",sort("Expression")),[label("lhs ...*/), ((IConstructor)$constants.get(298)/*regular(\iter-seps(sort("Case"),[layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(301)/*prod(label("fieldAccess",sort("Expression")),[label("expression",sort("Expression")),layouts("LAYOUT ...*/), ((IConstructor)$constants.get(303)/*prod(lex("PostProtocolChars"),[lit("\>"),lex("URLChars"),lit("://")],{})*/), ((IConstructor)$constants.get(306)/*regular(\iter-seps(\parameterized-sort("KeywordArgument",[sort("Pattern")]),[layouts("LAYOUTLIST"),l ...*/), ((IConstructor)$constants.get(309)/*prod(label("public",sort("Visibility")),[lit("public")],{})*/), ((IConstructor)$constants.get(313)/*prod(keywords("RascalKeywords"),[lit("assert")],{})*/), ((IConstructor)$constants.get(315)/*prod(label("break",sort("Statement")),[lit("break"),layouts("LAYOUTLIST"),label("target",sort("Targe ...*/), ((IConstructor)$constants.get(320)/*prod(label("addition",sort("Assignment")),[lit("+=")],{})*/), ((IConstructor)$constants.get(323)/*prod(keywords("RascalKeywords"),[lit("loc")],{})*/), ((IConstructor)$constants.get(325)/*regular(\iter-star-seps(sort("Statement"),[layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(326)/*prod(label("default",\parameterized-sort("KeywordArgument",[parameter("T",adt("Tree",[]))])),[label( ...*/), ((IConstructor)$constants.get(332)/*prod(label("asType",sort("Expression")),[lit("["),layouts("LAYOUTLIST"),label("type",sort("Type")),l ...*/), ((IConstructor)$constants.get(336)/*prod(label("tag",sort("Kind")),[lit("tag")],{})*/), ((IConstructor)$constants.get(339)/*prod(label("map",sort("Comprehension")),[lit("("),layouts("LAYOUTLIST"),label("from",sort("Expressio ...*/), ((IConstructor)$constants.get(345)/*regular(\iter-star-seps(sort("FunctionModifier"),[layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(348)/*prod(lex("RegExp"),[lit("\<"),lex("Name"),lit("\>")],{})*/), ((IConstructor)$constants.get(349)/*regular(\iter-star-seps(sort("Toplevel"),[layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(352)/*prod(label("syntax",sort("Import")),[label("syntax",sort("SyntaxDefinition"))],{})*/), ((IConstructor)$constants.get(356)/*prod(label("present",lex("OptionalEqualSign")),[lit("=")],{})*/), ((IConstructor)$constants.get(185)/*prod(label("notIn",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"),lit("n ...*/), ((IConstructor)$constants.get(359)/*prod(label("variable",sort("Declaration")),[label("tags",sort("Tags")),layouts("LAYOUTLIST"),label(" ...*/), ((IConstructor)$constants.get(366)/*prod(label("expression",sort("Statement")),[label("expression",conditional(sort("Expression"),{excep ...*/), ((IConstructor)$constants.get(370)/*prod(label("bs",lex("ConcretePart")),[lit("\\\\")],{tag("category"("string"))})*/), ((IConstructor)$constants.get(373)/*prod(label("index",sort("Field")),[label("fieldIndex",sort("IntegerLiteral"))],{})*/), ((IConstructor)$constants.get(378)/*prod(label("all",sort("Kind")),[lit("all")],{})*/), ((IConstructor)$constants.get(381)/*prod(label("append",sort("Assignment")),[lit("\<\<=")],{})*/), ((IConstructor)$constants.get(384)/*prod(label("stderrOutput",lex("Output")),[conditional(lit("⚠"),{\begin-of-line()}),\iter-star(\char- ...*/), ((IConstructor)$constants.get(392)/*prod(keywords("RascalKeywords"),[lit("filter")],{})*/), ((IConstructor)$constants.get(394)/*regular(\iter-star(\char-class([range(9,9),range(32,32),range(160,160),range(5760,5760),range(8192,8 ...*/), ((IConstructor)$constants.get(397)/*prod(lex("LAYOUT"),[\char-class([range(9,13),range(32,32),range(133,133),range(160,160),range(5760,5 ...*/), ((IConstructor)$constants.get(400)/*regular(\iter-star-seps(sort("ProdModifier"),[layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(403)/*associativity(sort("Expression"),\non-assoc(),{prod(label("noMatch",sort("Expression")),[label("patt ...*/), ((IConstructor)$constants.get(411)/*prod(label("iterSep",sort("Sym")),[lit("{"),layouts("LAYOUTLIST"),label("symbol",sort("Sym")),layout ...*/), ((IConstructor)$constants.get(414)/*prod(label("empty",sort("Sym")),[lit("("),layouts("LAYOUTLIST"),lit(")")],{})*/), ((IConstructor)$constants.get(416)/*prod(label("default",sort("QualifiedName")),[conditional(label("names",\iter-seps(lex("Name"),[layou ...*/), ((IConstructor)$constants.get(422)/*prod(label("test",sort("FunctionModifier")),[lit("test")],{})*/), ((IConstructor)$constants.get(425)/*prod(label("typedVariableBecomes",sort("Pattern")),[label("type",sort("Type")),layouts("LAYOUTLIST") ...*/), ((IConstructor)$constants.get(427)/*prod(label("default",sort("Assignment")),[lit("=")],{})*/), ((IConstructor)$constants.get(429)/*prod(layouts("HorizontalSpace"),[\iter-star(\char-class([range(9,9),range(32,32),range(160,160),rang ...*/), ((IConstructor)$constants.get(431)/*prod(label("unequal",sort("Sym")),[label("symbol",sort("Sym")),layouts("LAYOUTLIST"),lit("\\"),layou ...*/), ((IConstructor)$constants.get(434)/*prod(keywords("RascalKeywords"),[lit("datetime")],{})*/), ((IConstructor)$constants.get(435)/*prod(label("mid",sort("StringMiddle")),[label("mid",lex("MidStringChars"))],{})*/), ((IConstructor)$constants.get(437)/*prod(label("template",sort("StringLiteral")),[label("pre",lex("PreStringChars")),layouts("LAYOUTLIST ...*/), ((IConstructor)$constants.get(442)/*prod(keywords("RascalKeywords"),[lit("fail")],{})*/), ((IConstructor)$constants.get(444)/*prod(label("all",sort("Expression")),[lit("all"),layouts("LAYOUTLIST"),lit("("),layouts("LAYOUTLIST" ...*/), ((IConstructor)$constants.get(446)/*prod(label("bq",lex("ConcretePart")),[lit("\\`")],{tag("category"("string"))})*/), ((IConstructor)$constants.get(449)/*prod(label("external",sort("Import")),[lit("import"),layouts("LAYOUTLIST"),label("name",sort("Qualif ...*/), ((IConstructor)$constants.get(453)/*regular(\iter-seps(sort("Pattern"),[layouts("LAYOUTLIST"),lit(","),layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(455)/*prod(label("modulo",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"),lit(" ...*/), ((IConstructor)$constants.get(458)/*prod(label("name",sort("Field")),[label("fieldName",lex("Name"))],{})*/), ((IConstructor)$constants.get(461)/*associativity(sort("Statement"),\non-assoc(),{prod(label("try",sort("Statement")),[lit("try"),layout ...*/), ((IConstructor)$constants.get(467)/*prod(label("listDeclarations",sort("ShellCommand")),[lit("declarations"),layouts("LAYOUTLIST"),label ...*/), ((IConstructor)$constants.get(470)/*prod(label("present",sort("CommonKeywordParameters")),[lit("("),layouts("LAYOUTLIST"),label("keyword ...*/), ((IConstructor)$constants.get(476)/*priority(sort("Expression"),[choice(sort("Expression"),{prod(label("it",sort("Expression")),[conditi ...*/), ((IConstructor)$constants.get(651)/*prod(lex("RegExpLiteral"),[lit("/"),\iter-star(lex("RegExp")),lit("/"),lex("RegExpModifier")],{})*/), ((IConstructor)$constants.get(655)/*prod(label("import",sort("EvalCommand")),[label("imported",sort("Import"))],{})*/), ((IConstructor)$constants.get(659)/*prod(keywords("RascalKeywords"),[lit("append")],{})*/), ((IConstructor)$constants.get(661)/*prod(lex("MidProtocolChars"),[lit("\>"),lex("URLChars"),lit("\<")],{})*/), ((IConstructor)$constants.get(578)/*prod(label("range",sort("Expression")),[lit("["),layouts("LAYOUTLIST"),label("first",sort("Expressio ...*/), ((IConstructor)$constants.get(663)/*prod(lex("JustTime"),[lit("$T"),lex("TimePartNoTZ"),lex("TimeZonePart"),lit("$")],{})*/), ((IConstructor)$constants.get(669)/*prod(label("utf16",lex("UnicodeEscape")),[lit("\\"),\char-class([range(117,117)]),\char-class([range ...*/), ((IConstructor)$constants.get(673)/*prod(label("tag",sort("Declaration")),[label("tags",sort("Tags")),layouts("LAYOUTLIST"),label("visib ...*/), ((IConstructor)$constants.get(679)/*prod(label("emptyStatement",sort("Statement")),[lit(";")],{})*/), ((IConstructor)$constants.get(681)/*prod(label("empty",sort("Label")),[],{})*/), ((IConstructor)$constants.get(683)/*prod(label("list",sort("Pattern")),[lit("["),layouts("LAYOUTLIST"),label("elements0",\iter-star-seps ...*/), ((IConstructor)$constants.get(687)/*prod(keywords("RascalKeywords"),[lit("mod")],{})*/), ((IConstructor)$constants.get(688)/*prod(keywords("RascalKeywords"),[lit("extend")],{})*/), ((IConstructor)$constants.get(690)/*prod(label("iterStar",sort("Sym")),[label("symbol",sort("Sym")),layouts("LAYOUTLIST"),lit("*")],{})*/), ((IConstructor)$constants.get(692)/*prod(keywords("RascalKeywords"),[lit("while")],{})*/), ((IConstructor)$constants.get(694)/*prod(keywords("RascalKeywords"),[lit("notin")],{})*/), ((IConstructor)$constants.get(695)/*prod(label("tuple",sort("Assignable")),[lit("\<"),layouts("LAYOUTLIST"),label("elements",\iter-seps( ...*/), ((IConstructor)$constants.get(699)/*prod(label("lessThanOrEq",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST") ...*/), ((IConstructor)$constants.get(700)/*associativity(sort("Statement"),\non-assoc(),{prod(label("throw",sort("Statement")),[lit("throw"),la ...*/), ((IConstructor)$constants.get(716)/*prod(label("default",sort("FunctionBody")),[lit("{"),layouts("LAYOUTLIST"),label("statements",\iter- ...*/), ((IConstructor)$constants.get(720)/*prod(label("variable",sort("Kind")),[lit("variable")],{})*/), ((IConstructor)$constants.get(723)/*prod(keywords("RascalKeywords"),[lit("type")],{})*/), ((IConstructor)$constants.get(724)/*prod(label("bracket",sort("ProdModifier")),[lit("bracket")],{})*/), ((IConstructor)$constants.get(727)/*prod(label("default",sort("LocationLiteral")),[label("protocolPart",sort("ProtocolPart")),layouts("L ...*/), ((IConstructor)$constants.get(733)/*prod(keywords("RascalKeywords"),[lit("switch")],{})*/), ((IConstructor)$constants.get(735)/*prod(keywords("RascalKeywords"),[lit("layout")],{})*/), ((IConstructor)$constants.get(737)/*prod(keywords("RascalKeywords"),[lit("case")],{})*/), ((IConstructor)$constants.get(739)/*prod(label("associativity",sort("ProdModifier")),[label("associativity",sort("Assoc"))],{})*/), ((IConstructor)$constants.get(742)/*prod(label("labeled",sort("DataTarget")),[label("label",lex("Name")),layouts("LAYOUTLIST"),lit(":")] ...*/), ((IConstructor)$constants.get(745)/*prod(label("dateAndTimeLiteral",sort("DateTimeLiteral")),[label("dateAndTime",lex("DateAndTime"))],{ ...*/), ((IConstructor)$constants.get(750)/*regular(\iter-seps(sort("Catch"),[layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(552)/*prod(label("getAnnotation",sort("Expression")),[conditional(label("expression",sort("Expression")),{ ...*/), ((IConstructor)$constants.get(751)/*prod(label("nAryConstructor",sort("Variant")),[label("name",lex("Name")),layouts("LAYOUTLIST"),lit(" ...*/), ((IConstructor)$constants.get(533)/*prod(label("slice",sort("Expression")),[conditional(label("expression",sort("Expression")),{except(" ...*/), ((IConstructor)$constants.get(528)/*prod(label("is",sort("Expression")),[label("expression",sort("Expression")),layouts("LAYOUTLIST"),li ...*/), ((IConstructor)$constants.get(410)/*prod(label("match",sort("Expression")),[label("pattern",sort("Pattern")),layouts("LAYOUTLIST"),lit(" ...*/), ((IConstructor)$constants.get(757)/*prod(label("structured",sort("Type")),[label("structured",sort("StructuredType"))],{})*/), ((IConstructor)$constants.get(760)/*choice(sort("Pattern"),{prod(label("list",sort("Pattern")),[lit("["),layouts("LAYOUTLIST"),label("el ...*/), ((IConstructor)$constants.get(794)/*prod(label("innermost",sort("Strategy")),[lit("innermost")],{})*/), ((IConstructor)$constants.get(778)/*prod(label("reifiedType",sort("Pattern")),[lit("type"),layouts("LAYOUTLIST"),lit("("),layouts("LAYOU ...*/), ((IConstructor)$constants.get(624)/*prod(label("nonEquals",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"),li ...*/), ((IConstructor)$constants.get(797)/*prod(label("nonInterpolated",sort("PathPart")),[label("pathChars",lex("PathChars"))],{})*/), ((IConstructor)$constants.get(801)/*prod(label("product",sort("Assignment")),[lit("*=")],{})*/), ((IConstructor)$constants.get(804)/*prod(label("optional",sort("Sym")),[label("symbol",sort("Sym")),layouts("LAYOUTLIST"),lit("?")],{})*/), ((IConstructor)$constants.get(806)/*prod(lex("BooleanLiteral"),[lit("true")],{})*/), ((IConstructor)$constants.get(809)/*prod(label("empty",sort("Bound")),[],{})*/), ((IConstructor)$constants.get(812)/*prod(lex("PreStringChars"),[\char-class([range(34,34)]),\iter-star(lex("StringCharacter")),\char-cla ...*/), ((IConstructor)$constants.get(817)/*regular(alt({conditional(\char-class([range(42,42)]),{\not-follow(\char-class([range(47,47)]))}),\ch ...*/), ((IConstructor)$constants.get(823)/*prod(label("alias",sort("Kind")),[lit("alias")],{})*/), ((IConstructor)$constants.get(826)/*prod(label("interpolated",sort("ProtocolPart")),[label("pre",lex("PreProtocolChars")),layouts("LAYOU ...*/), ((IConstructor)$constants.get(832)/*prod(label("givenStrategy",sort("Visit")),[label("strategy",sort("Strategy")),layouts("LAYOUTLIST"), ...*/), ((IConstructor)$constants.get(838)/*prod(label("declaration",sort("Command")),[label("declaration",sort("Declaration"))],{})*/), ((IConstructor)$constants.get(842)/*prod(label("data",sort("Declaration")),[label("tags",sort("Tags")),layouts("LAYOUTLIST"),label("visi ...*/), ((IConstructor)$constants.get(849)/*prod(label("notFollow",sort("Sym")),[label("symbol",sort("Sym")),layouts("LAYOUTLIST"),lit("!\>\>"), ...*/), ((IConstructor)$constants.get(852)/*prod(label("join",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"),lit("jo ...*/), ((IConstructor)$constants.get(853)/*prod(label("parametric",sort("UserType")),[conditional(label("name",sort("QualifiedName")),{follow(l ...*/), ((IConstructor)$constants.get(857)/*prod(keywords("RascalKeywords"),[lit("bool")],{})*/), ((IConstructor)$constants.get(858)/*prod(label("nonInterpolated",sort("ProtocolPart")),[label("protocolChars",lex("ProtocolChars"))],{})*/), ((IConstructor)$constants.get(766)/*prod(label("callOrTree",sort("Pattern")),[label("expression",sort("Pattern")),layouts("LAYOUTLIST"), ...*/), ((IConstructor)$constants.get(862)/*prod(label("functionDeclaration",sort("Statement")),[label("functionDeclaration",sort("FunctionDecla ...*/), ((IConstructor)$constants.get(715)/*prod(label("insert",sort("Statement")),[lit("insert"),layouts("LAYOUTLIST"),label("dataTarget",sort( ...*/), ((IConstructor)$constants.get(574)/*prod(label("any",sort("Expression")),[lit("any"),layouts("LAYOUTLIST"),lit("("),layouts("LAYOUTLIST" ...*/), ((IConstructor)$constants.get(640)/*prod(label("and",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"),lit("&&" ...*/), ((IConstructor)$constants.get(864)/*prod(label("start",sort("Sym")),[lit("start"),layouts("LAYOUTLIST"),lit("["),layouts("LAYOUTLIST"),l ...*/), ((IConstructor)$constants.get(869)/*prod(label("annotation",sort("Assignable")),[label("receiver",sort("Assignable")),layouts("LAYOUTLIS ...*/), ((IConstructor)$constants.get(594)/*associativity(sort("Expression"),left(),{prod(label("composition",sort("Expression")),[label("lhs",s ...*/), ((IConstructor)$constants.get(872)/*prod(label("none",\parameterized-sort("KeywordArguments",[sort("Pattern")])),[],{})*/), ((IConstructor)$constants.get(874)/*prod(keywords("RascalKeywords"),[lit("throw")],{})*/), ((IConstructor)$constants.get(628)/*associativity(sort("Expression"),\non-assoc(),{prod(label("nonEquals",sort("Expression")),[label("lh ...*/), ((IConstructor)$constants.get(875)/*prod(label("implication",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"), ...*/), ((IConstructor)$constants.get(582)/*prod(label("isDefined",sort("Expression")),[label("argument",sort("Expression")),layouts("LAYOUTLIST ...*/), ((IConstructor)$constants.get(793)/*prod(label("splicePlus",sort("Pattern")),[lit("+"),layouts("LAYOUTLIST"),label("argument",sort("Patt ...*/), ((IConstructor)$constants.get(876)/*prod(label("variable",sort("Type")),[label("typeVar",sort("TypeVar"))],{})*/), ((IConstructor)$constants.get(880)/*prod(label("dataAbstract",sort("Declaration")),[label("tags",sort("Tags")),layouts("LAYOUTLIST"),lab ...*/), ((IConstructor)$constants.get(882)/*prod(label("user",sort("Type")),[label("user",sort("UserType"))],{})*/), ((IConstructor)$constants.get(884)/*prod(label("extend",sort("Import")),[lit("extend"),layouts("LAYOUTLIST"),label("module",sort("Import ...*/), ((IConstructor)$constants.get(886)/*prod(label("present",sort("Start")),[lit("start")],{})*/), ((IConstructor)$constants.get(888)/*prod(label("left",sort("Assoc")),[lit("left")],{})*/), ((IConstructor)$constants.get(525)/*prod(label("sliceStep",sort("Expression")),[conditional(label("expression",sort("Expression")),{exce ...*/), ((IConstructor)$constants.get(891)/*prod(lex("Comment"),[lit("/*"),\iter-star(alt({conditional(\char-class([range(42,42)]),{\not-follow( ...*/), ((IConstructor)$constants.get(896)/*prod(lex("TimePartNoTZ"),[\char-class([range(48,50)]),\char-class([range(48,57)]),lit(":"),\char-cla ...*/), ((IConstructor)$constants.get(906)/*regular(\iter-seps(sort("Variable"),[layouts("LAYOUTLIST"),lit(","),layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(907)/*prod(label("selector",sort("Type")),[label("selector",sort("DataTypeSelector"))],{})*/), ((IConstructor)$constants.get(542)/*prod(label("stepRange",sort("Expression")),[lit("["),layouts("LAYOUTLIST"),label("first",sort("Expre ...*/), ((IConstructor)$constants.get(621)/*prod(label("appendAfter",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"), ...*/), ((IConstructor)$constants.get(911)/*prod(label("noMatch",sort("Expression")),[label("pattern",sort("Pattern")),layouts("LAYOUTLIST"),lit ...*/), ((IConstructor)$constants.get(912)/*prod(label("interpolated",sort("PathPart")),[label("pre",lex("PrePathChars")),layouts("LAYOUTLIST"), ...*/), ((IConstructor)$constants.get(511)/*prod(label("nonEmptyBlock",sort("Expression")),[lit("{"),layouts("LAYOUTLIST"),label("statements",\i ...*/), ((IConstructor)$constants.get(918)/*regular(\iter-seps(sort("TypeArg"),[layouts("LAYOUTLIST"),lit(","),layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(919)/*regular(iter(\char-class([range(48,55)])))*/), ((IConstructor)$constants.get(922)/*prod(label("nonEmptyBlock",sort("Statement")),[label("label",sort("Label")),layouts("LAYOUTLIST"),li ...*/), ((IConstructor)$constants.get(924)/*prod(label("unicode",lex("StringCharacter")),[lex("UnicodeEscape")],{})*/), ((IConstructor)$constants.get(926)/*prod(lex("MidStringChars"),[\char-class([range(62,62)]),\iter-star(lex("StringCharacter")),\char-cla ...*/), ((IConstructor)$constants.get(712)/*prod(label("return",sort("Statement")),[lit("return"),layouts("LAYOUTLIST"),label("statement",condit ...*/), ((IConstructor)$constants.get(650)/*associativity(sort("Expression"),right(),{prod(label("ifThenElse",sort("Expression")),[label("condit ...*/), ((IConstructor)$constants.get(928)/*prod(label("rational",sort("BasicType")),[lit("rat")],{})*/), ((IConstructor)$constants.get(931)/*associativity(sort("Class"),left(),{prod(label("intersection",sort("Class")),[label("lhs",sort("Clas ...*/), ((IConstructor)$constants.get(932)/*prod(label("set",sort("Comprehension")),[lit("{"),layouts("LAYOUTLIST"),label("results",\iter-seps(s ...*/), ((IConstructor)$constants.get(935)/*prod(label("binding",sort("Catch")),[lit("catch"),layouts("LAYOUTLIST"),label("pattern",sort("Patter ...*/), ((IConstructor)$constants.get(937)/*prod(lex("URLChars"),[\iter-star(\char-class([range(1,8),range(11,12),range(14,31),range(33,59),rang ...*/), ((IConstructor)$constants.get(940)/*prod(label("doWhile",sort("StringTemplate")),[lit("do"),layouts("LAYOUTLIST"),lit("{"),layouts("LAYO ...*/), ((IConstructor)$constants.get(946)/*prod(lex("MidPathChars"),[lit("\>"),lex("URLChars"),lit("\<")],{})*/), ((IConstructor)$constants.get(948)/*prod(label("concrete",sort("Expression")),[label("concrete",lex("Concrete"))],{})*/), ((IConstructor)$constants.get(952)/*prod(label("lessThan",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"),con ...*/), ((IConstructor)$constants.get(953)/*prod(keywords("RascalKeywords"),[lit("insert")],{})*/), ((IConstructor)$constants.get(954)/*prod(keywords("RascalKeywords"),[lit("anno")],{})*/), ((IConstructor)$constants.get(956)/*prod(lex("RealLiteral"),[conditional(lit("."),{\not-precede(\char-class([range(46,46)]))}),iter(\cha ...*/), ((IConstructor)$constants.get(963)/*prod(lex("RealLiteral"),[iter(\char-class([range(48,57)])),lit("."),\iter-star(\char-class([range(48 ...*/), ((IConstructor)$constants.get(968)/*prod(label("regExp",sort("Literal")),[label("regExpLiteral",lex("RegExpLiteral"))],{tag("category"(" ...*/), ((IConstructor)$constants.get(971)/*prod(keywords("RascalKeywords"),[lit("catch")],{})*/), ((IConstructor)$constants.get(75)/*prod(label("precede",sort("Sym")),[label("match",sort("Sym")),layouts("LAYOUTLIST"),lit("\<\<"),layo ...*/), ((IConstructor)$constants.get(972)/*prod(label("post",sort("PathTail")),[label("post",lex("PostPathChars"))],{})*/), ((IConstructor)$constants.get(975)/*prod(label("unextend",sort("ShellCommand")),[lit("unextend"),layouts("LAYOUTLIST"),label("name",sort ...*/), ((IConstructor)$constants.get(978)/*choice(sort("Sym"),{prod(label("except",sort("Sym")),[label("symbol",sort("Sym")),layouts("LAYOUTLIS ...*/), ((IConstructor)$constants.get(1012)/*regular(iter(\char-class([range(48,57),range(65,70),range(97,102)])))*/), ((IConstructor)$constants.get(1013)/*prod(keywords("RascalKeywords"),[lit("default")],{})*/), ((IConstructor)$constants.get(1015)/*prod(lex("TimeZonePart"),[\char-class([range(43,43),range(45,45)]),\char-class([range(48,49)]),\char ...*/), ((IConstructor)$constants.get(1017)/*prod(label("num",sort("BasicType")),[lit("num")],{})*/), ((IConstructor)$constants.get(1019)/*prod(label("absent",lex("OptionalEqualSign")),[],{})*/), ((IConstructor)$constants.get(1021)/*prod(lex("CaseInsensitiveStringConstant"),[lit("\'"),label("chars",\iter-star(lex("StringCharacter") ...*/), ((IConstructor)$constants.get(1024)/*regular(\iter-seps(sort("Type"),[layouts("LAYOUTLIST"),lit(","),layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(1025)/*regular(alt({seq([lit("\\"),\char-class([range(123,123),range(125,125)])]),lex("TagString"),\char-cl ...*/), ((IConstructor)$constants.get(1031)/*prod(label("list",sort("BasicType")),[lit("list")],{})*/), ((IConstructor)$constants.get(1034)/*prod(keywords("RascalKeywords"),[lit("alias")],{})*/), ((IConstructor)$constants.get(1035)/*prod(label("for",sort("StringTemplate")),[lit("for"),layouts("LAYOUTLIST"),lit("("),layouts("LAYOUTL ...*/), ((IConstructor)$constants.get(1038)/*prod(label("default",sort("Module")),[label("header",sort("Header")),layouts("LAYOUTLIST"),label("bo ...*/), ((IConstructor)$constants.get(590)/*choice(sort("Expression"),{prod(label("asType",sort("Expression")),[lit("["),layouts("LAYOUTLIST"),l ...*/), ((IConstructor)$constants.get(1045)/*prod(keywords("RascalKeywords"),[lit("throws")],{})*/), ((IConstructor)$constants.get(549)/*prod(label("setAnnotation",sort("Expression")),[label("expression",sort("Expression")),layouts("LAYO ...*/), ((IConstructor)$constants.get(1047)/*choice(sort("Pattern"),{prod(label("descendant",sort("Pattern")),[lit("/"),layouts("LAYOUTLIST"),lab ...*/), ((IConstructor)$constants.get(1056)/*prod(label("lt",lex("ConcretePart")),[lit("\\\<")],{tag("category"("string"))})*/), ((IConstructor)$constants.get(1059)/*regular(\iter-star-seps(sort("Sym"),[layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(612)/*prod(label("insertBefore",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST") ...*/), ((IConstructor)$constants.get(1061)/*prod(label("edit",sort("ShellCommand")),[lit("edit"),layouts("LAYOUTLIST"),label("name",sort("Qualif ...*/), ((IConstructor)$constants.get(1064)/*regular(\iter-seps(sort("Field"),[layouts("LAYOUTLIST"),lit(","),layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(1065)/*prod(label("equivalence",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"), ...*/), ((IConstructor)$constants.get(1066)/*prod(label("conditional",sort("FunctionDeclaration")),[label("tags",sort("Tags")),layouts("LAYOUTLIS ...*/), ((IConstructor)$constants.get(1071)/*prod(label("assertWithMessage",sort("Statement")),[lit("assert"),layouts("LAYOUTLIST"),label("expres ...*/), ((IConstructor)$constants.get(1074)/*regular(\iter-star(\char-class([range(1,9),range(11,12),range(14,1114111)])))*/), ((IConstructor)$constants.get(1075)/*prod(lex("RegExp"),[lex("Backslash")],{})*/), ((IConstructor)$constants.get(1077)/*prod(label("arbitrary",sort("PatternWithAction")),[label("pattern",sort("Pattern")),layouts("LAYOUTL ...*/), ((IConstructor)$constants.get(538)/*prod(label("comprehension",sort("Expression")),[label("comprehension",sort("Comprehension"))],{})*/), ((IConstructor)$constants.get(1080)/*regular(\iter-seps(sort("Renaming"),[layouts("LAYOUTLIST"),lit(","),layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(771)/*prod(label("set",sort("Pattern")),[lit("{"),layouts("LAYOUTLIST"),label("elements0",\iter-star-seps( ...*/), ((IConstructor)$constants.get(1083)/*prod(label("default",sort("Bound")),[lit(";"),layouts("LAYOUTLIST"),label("expression",sort("Express ...*/), ((IConstructor)$constants.get(1085)/*prod(keywords("RascalKeywords"),[lit("module")],{})*/), ((IConstructor)$constants.get(1087)/*prod(keywords("RascalKeywords"),[lit("one")],{})*/), ((IConstructor)$constants.get(1089)/*prod(keywords("RascalKeywords"),[lit("public")],{})*/), ((IConstructor)$constants.get(643)/*prod(label("or",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"),lit("||") ...*/), ((IConstructor)$constants.get(1090)/*prod(lex("Char"),[lex("UnicodeEscape")],{tag("category"("string"))})*/), ((IConstructor)$constants.get(1092)/*prod(label("labeled",sort("Target")),[label("name",lex("Name"))],{})*/), ((IConstructor)$constants.get(1094)/*regular(\iter-seps(\parameterized-sort("KeywordArgument",[sort("Expression")]),[layouts("LAYOUTLIST" ...*/), ((IConstructor)$constants.get(1097)/*prod(label("post",sort("ProtocolTail")),[label("post",lex("PostProtocolChars"))],{})*/), ((IConstructor)$constants.get(1100)/*prod(label("free",sort("TypeVar")),[lit("&"),layouts("LAYOUTLIST"),label("name",lex("Name"))],{})*/), ((IConstructor)$constants.get(1102)/*regular(\iter-star(lex("NamedRegExp")))*/), ((IConstructor)$constants.get(1103)/*prod(lex("TimeZonePart"),[lit("Z")],{})*/), ((IConstructor)$constants.get(1105)/*prod(lex("BooleanLiteral"),[lit("false")],{})*/), ((IConstructor)$constants.get(1107)/*prod(label("actualsRenaming",sort("ImportedModule")),[label("name",sort("QualifiedName")),layouts("L ...*/), ((IConstructor)$constants.get(1113)/*prod(label("text",lex("ConcretePart")),[conditional(iter(\char-class([range(1,9),range(11,59),range( ...*/), ((IConstructor)$constants.get(1118)/*prod(label("nonInterpolated",sort("StringLiteral")),[label("constant",lex("StringConstant"))],{})*/), ((IConstructor)$constants.get(1121)/*regular(\iter-seps(sort("Expression"),[layouts("LAYOUTLIST"),lit(","),layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(1122)/*prod(lex("TagString"),[conditional(lit("{"),{\not-precede(lit("\\"))}),label("contents",\iter-star(a ...*/), ((IConstructor)$constants.get(588)/*prod(label("splice",sort("Expression")),[lit("*"),layouts("LAYOUTLIST"),label("argument",sort("Expre ...*/), ((IConstructor)$constants.get(1127)/*prod(lex("Backslash"),[conditional(\char-class([range(92,92)]),{\not-follow(\char-class([range(47,47 ...*/), ((IConstructor)$constants.get(1131)/*prod(lex("NamedRegExp"),[lex("NamedBackslash")],{})*/), ((IConstructor)$constants.get(1133)/*prod(label("language",sort("SyntaxDefinition")),[label("start",sort("Start")),layouts("LAYOUTLIST"), ...*/), ((IConstructor)$constants.get(1139)/*prod(label("greaterThan",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"), ...*/), ((IConstructor)$constants.get(1140)/*regular(\iter-star-seps(sort("Import"),[layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(1142)/*regular(\iter-seps(sort("KeywordFormal"),[layouts("LAYOUTLIST"),lit(","),layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(789)/*prod(label("map",sort("Pattern")),[lit("("),layouts("LAYOUTLIST"),label("mappings",\iter-star-seps(\ ...*/), ((IConstructor)$constants.get(1143)/*prod(label("mid",sort("PathTail")),[label("mid",lex("MidPathChars")),layouts("LAYOUTLIST"),label("ex ...*/), ((IConstructor)$constants.get(297)/*prod(label("lessThanOrEq",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST") ...*/), ((IConstructor)$constants.get(1146)/*prod(label("default",sort("KeywordFormal")),[label("type",sort("Type")),layouts("LAYOUTLIST"),label( ...*/), ((IConstructor)$constants.get(1148)/*prod(keywords("RascalKeywords"),[lit("node")],{})*/), ((IConstructor)$constants.get(1150)/*prod(label("reference",sort("Prod")),[lit(":"),layouts("LAYOUTLIST"),label("referenced",lex("Name")) ...*/), ((IConstructor)$constants.get(1153)/*prod(label("commandlist",sort("Commands")),[label("commands",\iter-seps(sort("EvalCommand"),[layouts ...*/), ((IConstructor)$constants.get(1158)/*prod(label("renamings",sort("ImportedModule")),[label("name",sort("QualifiedName")),layouts("LAYOUTL ...*/), ((IConstructor)$constants.get(1160)/*prod(label("absent",sort("CommonKeywordParameters")),[],{})*/), ((IConstructor)$constants.get(1162)/*prod(lex("RationalLiteral"),[\char-class([range(49,57)]),\iter-star(\char-class([range(48,57)])),\ch ...*/), ((IConstructor)$constants.get(1167)/*prod(lex("DateAndTime"),[lit("$"),lex("DatePart"),lit("T"),conditional(lex("TimePartNoTZ"),{\not-fol ...*/), ((IConstructor)$constants.get(1171)/*prod(label("while",sort("Statement")),[label("label",sort("Label")),layouts("LAYOUTLIST"),lit("while ...*/), ((IConstructor)$constants.get(600)/*prod(label("product",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"),lit( ...*/), ((IConstructor)$constants.get(1174)/*prod(label("test",sort("ShellCommand")),[lit("test"),layouts("LAYOUTLIST"),label("optName",opt(sort( ...*/), ((IConstructor)$constants.get(1176)/*regular(\iter-star(\char-class([range(1,8),range(11,12),range(14,31),range(33,59),range(61,123),rang ...*/), ((IConstructor)$constants.get(1177)/*prod(lex("StringConstant"),[lit("\""),label("chars",\iter-star(lex("StringCharacter"))),lit("\"")],{ ...*/), ((IConstructor)$constants.get(1055)/*prod(label("anti",sort("Pattern")),[lit("!"),layouts("LAYOUTLIST"),label("pattern",sort("Pattern"))] ...*/), ((IConstructor)$constants.get(589)/*associativity(sort("Expression"),\non-assoc(),{prod(label("splice",sort("Expression")),[lit("*"),lay ...*/), ((IConstructor)$constants.get(1179)/*prod(label("default",sort("KeywordFormals")),[label("optionalComma",lex("OptionalComma")),layouts("L ...*/), ((IConstructor)$constants.get(1185)/*prod(keywords("RascalKeywords"),[lit("str")],{})*/), ((IConstructor)$constants.get(1187)/*prod(label("default",\parameterized-sort("Mapping",[sort("Expression")])),[label("from",conditional( ...*/), ((IConstructor)$constants.get(1191)/*regular(\iter-star(lex("StringCharacter")))*/), ((IConstructor)$constants.get(603)/*prod(label("remainder",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"),li ...*/), ((IConstructor)$constants.get(1192)/*prod(label("typed",lex("Concrete")),[lit("("),label("l1",layouts("LAYOUTLIST")),label("symbol",sort( ...*/), ((IConstructor)$constants.get(1200)/*prod(label("first",sort("Prod")),[label("lhs",sort("Prod")),layouts("LAYOUTLIST"),conditional(lit("\ ...*/), ((IConstructor)$constants.get(1205)/*prod(lex("NamedRegExp"),[lit("\<"),lex("Name"),lit("\>")],{})*/), ((IConstructor)$constants.get(1206)/*regular(\iter-star(lex("ConcretePart")))*/), ((IConstructor)$constants.get(784)/*prod(label("negative",sort("Pattern")),[lit("-"),layouts("LAYOUTLIST"),label("argument",sort("Patter ...*/), ((IConstructor)$constants.get(1207)/*prod(label("tag",sort("ProdModifier")),[label("tag",sort("Tag"))],{})*/), ((IConstructor)$constants.get(1210)/*prod(label("statement",sort("EvalCommand")),[label("statement",conditional(sort("Statement"),{except ...*/), ((IConstructor)$constants.get(1214)/*prod(label("quit",sort("ShellCommand")),[lit("quit"),layouts("LAYOUTLIST"),label("terminator",lex("O ...*/), ((IConstructor)$constants.get(1217)/*prod(label("for",sort("Statement")),[label("label",sort("Label")),layouts("LAYOUTLIST"),lit("for"),l ...*/), ((IConstructor)$constants.get(1219)/*prod(label("default",sort("Renaming")),[label("from",lex("Name")),layouts("LAYOUTLIST"),lit("=\>"),l ...*/), ((IConstructor)$constants.get(638)/*associativity(sort("Expression"),\non-assoc(),{prod(label("implication",sort("Expression")),[label(" ...*/), ((IConstructor)$constants.get(1223)/*prod(label("view",sort("Kind")),[lit("view")],{})*/), ((IConstructor)$constants.get(1226)/*prod(label("visit",sort("Statement")),[label("label",sort("Label")),layouts("LAYOUTLIST"),label("vis ...*/), ((IConstructor)$constants.get(546)/*prod(label("fieldProject",sort("Expression")),[conditional(label("expression",sort("Expression")),{e ...*/), ((IConstructor)$constants.get(1228)/*prod(lex("RealLiteral"),[iter(\char-class([range(48,57)])),\char-class([range(69,69),range(101,101)] ...*/), ((IConstructor)$constants.get(1229)/*prod(lex("RealLiteral"),[iter(\char-class([range(48,57)])),conditional(lit("."),{\not-follow(lit("." ...*/), ((IConstructor)$constants.get(1231)/*prod(label("bottomUp",sort("Strategy")),[lit("bottom-up")],{})*/), ((IConstructor)$constants.get(1234)/*prod(lex("JustDate"),[lit("$"),lex("DatePart"),lit("$")],{})*/), ((IConstructor)$constants.get(1236)/*prod(label("associative",sort("Assoc")),[lit("assoc")],{})*/), ((IConstructor)$constants.get(1239)/*prod(label("map",sort("BasicType")),[lit("map")],{})*/), ((IConstructor)$constants.get(1242)/*prod(label("tuple",sort("BasicType")),[lit("tuple")],{})*/), ((IConstructor)$constants.get(519)/*prod(label("reifiedType",sort("Expression")),[lit("type"),layouts("LAYOUTLIST"),lit("("),layouts("LA ...*/), ((IConstructor)$constants.get(1244)/*priority(sort("Sym"),[choice(sort("Sym"),{prod(label("except",sort("Sym")),[label("symbol",sort("Sym ...*/), ((IConstructor)$constants.get(1249)/*prod(label("nonAssociative",sort("Assoc")),[lit("non-assoc")],{})*/), ((IConstructor)$constants.get(1252)/*prod(label("ifThenElse",sort("Statement")),[label("label",sort("Label")),layouts("LAYOUTLIST"),lit(" ...*/), ((IConstructor)$constants.get(1256)/*prod(lex("OctalIntegerLiteral"),[\char-class([range(48,48)]),conditional(iter(\char-class([range(48, ...*/), ((IConstructor)$constants.get(1259)/*prod(lex("PreProtocolChars"),[lit("|"),lex("URLChars"),lit("\<")],{})*/), ((IConstructor)$constants.get(791)/*prod(label("qualifiedName",sort("Pattern")),[label("qualifiedName",sort("QualifiedName"))],{})*/), ((IConstructor)$constants.get(1260)/*prod(label("parameters",sort("Header")),[label("tags",sort("Tags")),layouts("LAYOUTLIST"),lit("modul ...*/), ((IConstructor)$constants.get(406)/*prod(label("noMatch",sort("Expression")),[label("pattern",sort("Pattern")),layouts("LAYOUTLIST"),lit ...*/), ((IConstructor)$constants.get(1265)/*regular(\iter-seps(sort("QualifiedName"),[layouts("LAYOUTLIST"),lit(","),layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(709)/*prod(label("append",sort("Statement")),[lit("append"),layouts("LAYOUTLIST"),label("dataTarget",sort( ...*/), ((IConstructor)$constants.get(1266)/*regular(\iter-seps(sort("Sym"),[layouts("LAYOUTLIST"),lit(","),layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(1267)/*prod(label("shell",sort("Command")),[lit(":"),layouts("LAYOUTLIST"),label("command",sort("ShellComma ...*/), ((IConstructor)$constants.get(1270)/*regular(\iter-star-seps(sort("Tag"),[layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(1272)/*prod(lex("TimeZonePart"),[\char-class([range(43,43),range(45,45)]),\char-class([range(48,49)]),\char ...*/), ((IConstructor)$constants.get(1273)/*prod(keywords("RascalKeywords"),[lit("any")],{})*/), ((IConstructor)$constants.get(985)/*prod(label("parametrized",sort("Sym")),[conditional(label("nonterminal",lex("Nonterminal")),{follow( ...*/), ((IConstructor)$constants.get(1274)/*prod(label("private",sort("Visibility")),[lit("private")],{})*/), ((IConstructor)$constants.get(1277)/*prod(lex("Name"),[conditional(seq([conditional(\char-class([range(65,90),range(95,95),range(97,122)] ...*/), ((IConstructor)$constants.get(1283)/*prod(lex("RegExp"),[\char-class([range(92,92)]),\char-class([range(47,47),range(60,60),range(62,62), ...*/), ((IConstructor)$constants.get(634)/*prod(label("implication",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"), ...*/), ((IConstructor)$constants.get(1284)/*prod(label("withThrows",sort("Signature")),[label("modifiers",sort("FunctionModifiers")),layouts("LA ...*/), ((IConstructor)$constants.get(1289)/*prod(keywords("RascalKeywords"),[lit("keyword")],{})*/), ((IConstructor)$constants.get(1291)/*priority(sort("Class"),[choice(sort("Class"),{prod(label("simpleCharclass",sort("Class")),[lit("["), ...*/), ((IConstructor)$constants.get(1295)/*prod(keywords("RascalKeywords"),[lit("void")],{})*/), ((IConstructor)$constants.get(1297)/*prod(label("rational",sort("Literal")),[label("rationalLiteral",lex("RationalLiteral"))],{tag("categ ...*/), ((IConstructor)$constants.get(289)/*prod(label("lessThan",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"),con ...*/), ((IConstructor)$constants.get(1300)/*prod(label("octalIntegerLiteral",sort("IntegerLiteral")),[label("octal",lex("OctalIntegerLiteral"))] ...*/), ((IConstructor)$constants.get(1303)/*prod(label("appendAfter",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"), ...*/), ((IConstructor)$constants.get(1304)/*regular(\iter-star-seps(sort("TypeArg"),[layouts("LAYOUTLIST"),lit(","),layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(1305)/*regular(\iter-star(alt({conditional(\char-class([range(42,42)]),{\not-follow(\char-class([range(47,4 ...*/), ((IConstructor)$constants.get(1306)/*prod(lex("Name"),[\char-class([range(92,92)]),\char-class([range(65,90),range(95,95),range(97,122)]) ...*/), ((IConstructor)$constants.get(1310)/*prod(lex("NamedBackslash"),[conditional(\char-class([range(92,92)]),{\not-follow(\char-class([range( ...*/), ((IConstructor)$constants.get(1003)/*prod(label("sequence",sort("Sym")),[lit("("),layouts("LAYOUTLIST"),label("first",sort("Sym")),layout ...*/), ((IConstructor)$constants.get(1313)/*prod(lex("RegExp"),[\char-class([range(1,46),range(48,59),range(61,61),range(63,91),range(93,1114111 ...*/), ((IConstructor)$constants.get(1315)/*prod(keywords("RascalKeywords"),[lit("finally")],{})*/), ((IConstructor)$constants.get(1317)/*prod(label("default",lex("OptionalComma")),[opt(lit(","))],{})*/), ((IConstructor)$constants.get(1320)/*prod(keywords("RascalKeywords"),[lit("real")],{})*/), ((IConstructor)$constants.get(997)/*prod(label("endOfLine",sort("Sym")),[label("symbol",sort("Sym")),layouts("LAYOUTLIST"),lit("$")],{})*/), ((IConstructor)$constants.get(1322)/*prod(label("assert",sort("Statement")),[lit("assert"),layouts("LAYOUTLIST"),label("expression",sort( ...*/), ((IConstructor)$constants.get(1324)/*prod(label("lexical",sort("SyntaxDefinition")),[lit("lexical"),layouts("LAYOUTLIST"),label("defined" ...*/), ((IConstructor)$constants.get(1327)/*prod(label("value",sort("BasicType")),[lit("value")],{})*/), ((IConstructor)$constants.get(1330)/*prod(keywords("RascalKeywords"),[lit("true")],{})*/), ((IConstructor)$constants.get(609)/*associativity(sort("Expression"),left(),{prod(label("intersection",sort("Expression")),[label("lhs", ...*/), ((IConstructor)$constants.get(1247)/*associativity(sort("Sym"),left(),{prod(label("notFollow",sort("Sym")),[label("symbol",sort("Sym")),l ...*/), ((IConstructor)$constants.get(1331)/*prod(keywords("RascalKeywords"),[lit("private")],{})*/), ((IConstructor)$constants.get(1332)/*prod(label("timeLiteral",sort("DateTimeLiteral")),[label("time",lex("JustTime"))],{})*/), ((IConstructor)$constants.get(1335)/*prod(keywords("RascalKeywords"),[lit("try")],{})*/), ((IConstructor)$constants.get(637)/*prod(label("equivalence",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"), ...*/), ((IConstructor)$constants.get(1336)/*prod(label("noThrows",sort("Signature")),[label("modifiers",sort("FunctionModifiers")),layouts("LAYO ...*/), ((IConstructor)$constants.get(1338)/*prod(label("greaterThanOrEq",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIS ...*/), ((IConstructor)$constants.get(1339)/*prod(label("midInterpolated",sort("StringTail")),[label("mid",lex("MidStringChars")),layouts("LAYOUT ...*/), ((IConstructor)$constants.get(497)/*prod(label("closure",sort("Expression")),[label("type",sort("Type")),layouts("LAYOUTLIST"),label("pa ...*/), ((IConstructor)$constants.get(1341)/*prod(keywords("RascalKeywords"),[lit("all")],{})*/), ((IConstructor)$constants.get(1342)/*regular(\iter-star-seps(\parameterized-sort("Mapping",[sort("Pattern")]),[layouts("LAYOUTLIST"),lit( ...*/), ((IConstructor)$constants.get(1343)/*prod(label("named",sort("TypeArg")),[label("type",sort("Type")),layouts("LAYOUTLIST"),label("name",l ...*/), ((IConstructor)$constants.get(705)/*prod(label("throw",sort("Statement")),[lit("throw"),layouts("LAYOUTLIST"),label("statement",conditio ...*/), ((IConstructor)$constants.get(1345)/*prod(label("anno",sort("Kind")),[lit("anno")],{})*/), ((IConstructor)$constants.get(1347)/*prod(label("modifierlist",sort("FunctionModifiers")),[label("modifiers",\iter-star-seps(sort("Functi ...*/), ((IConstructor)$constants.get(1350)/*prod(label("default",\parameterized-sort("Mapping",[sort("Pattern")])),[label("from",conditional(sor ...*/), ((IConstructor)$constants.get(992)/*prod(label("nonterminal",sort("Sym")),[conditional(label("nonterminal",lex("Nonterminal")),{\not-fol ...*/), ((IConstructor)$constants.get(1354)/*prod(label("variable",sort("Assignable")),[label("qualifiedName",sort("QualifiedName"))],{})*/), ((IConstructor)$constants.get(1356)/*prod(label("ifDefined",sort("Assignment")),[lit("?=")],{})*/), ((IConstructor)$constants.get(1359)/*prod(label("patternWithAction",sort("Case")),[lit("case"),layouts("LAYOUTLIST"),label("patternWithAc ...*/), ((IConstructor)$constants.get(1362)/*prod(lex("Comment"),[lit("//"),conditional(\iter-star(\char-class([range(1,9),range(11,1114111)])),{ ...*/), ((IConstructor)$constants.get(1368)/*prod(label("concrete",sort("Pattern")),[label("concrete",lex("Concrete"))],{})*/), ((IConstructor)$constants.get(484)/*prod(label("tuple",sort("Expression")),[lit("\<"),layouts("LAYOUTLIST"),label("elements",\iter-seps( ...*/), ((IConstructor)$constants.get(1370)/*regular(\iter-star(\char-class([range(1,9),range(11,1114111)])))*/), ((IConstructor)$constants.get(1371)/*prod(label("ifThen",sort("Statement")),[label("label",sort("Label")),layouts("LAYOUTLIST"),lit("if") ...*/), ((IConstructor)$constants.get(1375)/*prod(label("default",sort("Formals")),[label("formals",\iter-star-seps(sort("Pattern"),[layouts("LAY ...*/), ((IConstructor)$constants.get(1378)/*regular(\iter-seps(sort("Sym"),[layouts("LAYOUTLIST"),lit("|"),layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(1379)/*prod(keywords("RascalKeywords"),[lit("visit")],{})*/), ((IConstructor)$constants.get(1380)/*priority(sort("Pattern"),[choice(sort("Pattern"),{prod(label("list",sort("Pattern")),[lit("["),layou ...*/), ((IConstructor)$constants.get(1381)/*prod(label("default",sort("Label")),[label("name",lex("Name")),layouts("LAYOUTLIST"),lit(":")],{})*/), ((IConstructor)$constants.get(1383)/*prod(label("function",sort("Kind")),[lit("function")],{})*/), ((IConstructor)$constants.get(1386)/*prod(label("unInitialized",sort("Variable")),[label("name",lex("Name"))],{})*/), ((IConstructor)$constants.get(1388)/*prod(label("givenVisibility",sort("Toplevel")),[label("declaration",sort("Declaration"))],{})*/), ((IConstructor)$constants.get(1390)/*prod(lex("DecimalIntegerLiteral"),[\char-class([range(49,57)]),conditional(\iter-star(\char-class([r ...*/), ((IConstructor)$constants.get(1391)/*prod(label("default",sort("FunctionDeclaration")),[label("tags",sort("Tags")),layouts("LAYOUTLIST"), ...*/), ((IConstructor)$constants.get(1394)/*prod(keywords("RascalKeywords"),[lit("map")],{})*/), ((IConstructor)$constants.get(1395)/*prod(label("string",sort("BasicType")),[lit("str")],{})*/), ((IConstructor)$constants.get(1397)/*prod(label("while",sort("StringTemplate")),[lit("while"),layouts("LAYOUTLIST"),lit("("),layouts("LAY ...*/), ((IConstructor)$constants.get(1399)/*regular(\iter-seps(sort("Sym"),[layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(492)/*prod(label("visit",sort("Expression")),[label("label",sort("Label")),layouts("LAYOUTLIST"),label("vi ...*/), ((IConstructor)$constants.get(1400)/*prod(label("loc",sort("BasicType")),[lit("loc")],{})*/), ((IConstructor)$constants.get(630)/*prod(label("ifDefinedOtherwise",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUT ...*/), ((IConstructor)$constants.get(1246)/*prod(label("follow",sort("Sym")),[label("symbol",sort("Sym")),layouts("LAYOUTLIST"),lit("\>\>"),layo ...*/), ((IConstructor)$constants.get(1402)/*prod(label("real",sort("BasicType")),[lit("real")],{})*/), ((IConstructor)$constants.get(1404)/*prod(label("insertBefore",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST") ...*/), ((IConstructor)$constants.get(1405)/*prod(label("list",sort("Comprehension")),[lit("["),layouts("LAYOUTLIST"),label("results",\iter-seps( ...*/), ((IConstructor)$constants.get(1407)/*prod(lex("RealLiteral"),[conditional(lit("."),{\not-precede(\char-class([range(46,46)]))}),iter(\cha ...*/), ((IConstructor)$constants.get(466)/*prod(label("try",sort("Statement")),[lit("try"),layouts("LAYOUTLIST"),label("body",sort("Statement") ...*/), ((IConstructor)$constants.get(1408)/*prod(label("declaration",sort("EvalCommand")),[label("declaration",sort("Declaration"))],{})*/), ((IConstructor)$constants.get(1410)/*regular(\iter-star(lex("LAYOUT")))*/), ((IConstructor)$constants.get(644)/*associativity(sort("Expression"),left(),{prod(label("or",sort("Expression")),[label("lhs",sort("Expr ...*/), ((IConstructor)$constants.get(641)/*associativity(sort("Expression"),left(),{prod(label("and",sort("Expression")),[label("lhs",sort("Exp ...*/), ((IConstructor)$constants.get(782)/*prod(label("multiVariable",sort("Pattern")),[label("qualifiedName",sort("QualifiedName")),layouts("L ...*/), ((IConstructor)$constants.get(531)/*prod(label("voidClosure",sort("Expression")),[label("parameters",sort("Parameters")),layouts("LAYOUT ...*/), ((IConstructor)$constants.get(571)/*prod(label("transitiveClosure",sort("Expression")),[label("argument",sort("Expression")),layouts("LA ...*/), ((IConstructor)$constants.get(1412)/*prod(lex("DatePart"),[\char-class([range(48,57)]),\char-class([range(48,57)]),\char-class([range(48, ...*/), ((IConstructor)$constants.get(1414)/*prod(label("set",sort("BasicType")),[lit("set")],{})*/), ((IConstructor)$constants.get(1416)/*prod(label("equals",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"),lit(" ...*/), ((IConstructor)$constants.get(1417)/*prod(label("assignment",sort("Statement")),[label("assignable",sort("Assignable")),layouts("LAYOUTLI ...*/), ((IConstructor)$constants.get(1421)/*prod(label("annotation",sort("Declaration")),[label("tags",sort("Tags")),layouts("LAYOUTLIST"),label ...*/), ((IConstructor)$constants.get(1425)/*regular(\iter-star(\char-class([range(48,57),range(65,90),range(95,95),range(97,122)])))*/), ((IConstructor)$constants.get(1426)/*prod(label("default",sort("Tags")),[label("tags",\iter-star-seps(sort("Tag"),[layouts("LAYOUTLIST")] ...*/), ((IConstructor)$constants.get(1429)/*prod(layouts("LAYOUTLIST"),[conditional(\iter-star(lex("LAYOUT")),{\not-follow(\char-class([range(9, ...*/), ((IConstructor)$constants.get(1431)/*prod(label("default",sort("Renamings")),[lit("renaming"),layouts("LAYOUTLIST"),label("renamings",\it ...*/), ((IConstructor)$constants.get(1293)/*prod(label("difference",sort("Class")),[label("lhs",sort("Class")),layouts("LAYOUTLIST"),lit("-"),la ...*/), ((IConstructor)$constants.get(1435)/*prod(keywords("RascalKeywords"),[lit("lexical")],{})*/), ((IConstructor)$constants.get(1436)/*prod(label("filter",sort("Statement")),[lit("filter"),layouts("LAYOUTLIST"),lit(";")],{tag("breakabl ...*/), ((IConstructor)$constants.get(1438)/*regular(\iter-star(\char-class([range(45,45),range(48,57),range(65,90),range(95,95),range(97,122)])) ...*/), ((IConstructor)$constants.get(535)/*prod(label("list",sort("Expression")),[lit("["),layouts("LAYOUTLIST"),label("elements0",\iter-star-s ...*/), ((IConstructor)$constants.get(1009)/*prod(label("caseInsensitiveLiteral",sort("Sym")),[label("cistring",lex("CaseInsensitiveStringConstan ...*/), ((IConstructor)$constants.get(1439)/*prod(keywords("RascalKeywords"),[lit("value")],{})*/), ((IConstructor)$constants.get(294)/*prod(label("greaterThan",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"), ...*/), ((IConstructor)$constants.get(1440)/*prod(label("ifDefinedOrDefault",sort("Assignable")),[label("receiver",sort("Assignable")),layouts("L ...*/), ((IConstructor)$constants.get(1443)/*regular(\iter-star-seps(sort("Expression"),[layouts("LAYOUTLIST"),lit(","),layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(1444)/*prod(label("dateTime",sort("Literal")),[label("dateTimeLiteral",sort("DateTimeLiteral"))],{})*/), ((IConstructor)$constants.get(1447)/*prod(lex("RegExpModifier"),[\iter-star(\char-class([range(100,100),range(105,105),range(109,109),ran ...*/), ((IConstructor)$constants.get(514)/*prod(label("set",sort("Expression")),[lit("{"),layouts("LAYOUTLIST"),label("elements0",\iter-star-se ...*/), ((IConstructor)$constants.get(1450)/*prod(label("absent",lex("OptionalTerminator")),[],{})*/), ((IConstructor)$constants.get(1452)/*regular(\iter-seps(sort("Variant"),[layouts("LAYOUTLIST"),lit("|"),layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(1053)/*prod(label("variableBecomes",sort("Pattern")),[label("name",lex("Name")),layouts("LAYOUTLIST"),lit(" ...*/), ((IConstructor)$constants.get(614)/*prod(label("addition",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"),lit ...*/), ((IConstructor)$constants.get(1453)/*prod(keywords("RascalKeywords"),[lit("non-assoc")],{})*/), ((IConstructor)$constants.get(1454)/*associativity(sort("Prod"),left(),{prod(label("first",sort("Prod")),[label("lhs",sort("Prod")),layou ...*/), ((IConstructor)$constants.get(1455)/*prod(label("toplevels",sort("Body")),[label("toplevels",\iter-star-seps(sort("Toplevel"),[layouts("L ...*/), ((IConstructor)$constants.get(1458)/*prod(label("java",sort("FunctionModifier")),[lit("java")],{})*/), ((IConstructor)$constants.get(1461)/*prod(label("output",sort("EvalCommand")),[lex("Output")],{})*/), ((IConstructor)$constants.get(1463)/*prod(label("real",sort("Literal")),[label("realLiteral",lex("RealLiteral"))],{tag("category"("number ...*/), ((IConstructor)$constants.get(1466)/*prod(lex("PrePathChars"),[lex("URLChars"),lit("\<")],{})*/), ((IConstructor)$constants.get(1467)/*prod(label("history",sort("ShellCommand")),[lit("history"),layouts("LAYOUTLIST"),label("terminator", ...*/), ((IConstructor)$constants.get(1470)/*prod(label("dateLiteral",sort("DateTimeLiteral")),[label("date",lex("JustDate"))],{})*/), ((IConstructor)$constants.get(1473)/*prod(keywords("RascalKeywords"),[lit("if")],{})*/), ((IConstructor)$constants.get(78)/*prod(label("notPrecede",sort("Sym")),[label("match",sort("Sym")),layouts("LAYOUTLIST"),lit("!\<\<"), ...*/), ((IConstructor)$constants.get(1474)/*prod(label("relation",sort("BasicType")),[lit("rel")],{})*/), ((IConstructor)$constants.get(1477)/*prod(label("expression",sort("FunctionDeclaration")),[label("tags",sort("Tags")),layouts("LAYOUTLIST ...*/), ((IConstructor)$constants.get(1479)/*prod(label("void",sort("BasicType")),[lit("void")],{})*/), ((IConstructor)$constants.get(1481)/*regular(\iter-star-seps(sort("Range"),[layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(1482)/*prod(label("post",sort("StringTail")),[label("post",lex("PostStringChars"))],{})*/), ((IConstructor)$constants.get(1486)/*prod(label("ifThen",sort("StringTemplate")),[lit("if"),layouts("LAYOUTLIST"),lit("("),layouts("LAYOU ...*/), ((IConstructor)$constants.get(1488)/*choice(sort("Prod"),{prod(label("associativityGroup",sort("Prod")),[label("associativity",sort("Asso ...*/), ((IConstructor)$constants.get(1498)/*prod(label("default",sort("Declarator")),[label("type",sort("Type")),layouts("LAYOUTLIST"),label("va ...*/), ((IConstructor)$constants.get(1501)/*prod(keywords("RascalKeywords"),[lit("join")],{})*/), ((IConstructor)$constants.get(1502)/*prod(label("unconditional",sort("Replacement")),[label("replacementExpression",sort("Expression"))], ...*/), ((IConstructor)$constants.get(1505)/*prod(label("decimalIntegerLiteral",sort("IntegerLiteral")),[label("decimal",lex("DecimalIntegerLiter ...*/), ((IConstructor)$constants.get(618)/*prod(label("subtraction",sort("Expression")),[label("lhs",conditional(sort("Expression"),{except("tr ...*/), ((IConstructor)$constants.get(1508)/*prod(label("data",sort("Kind")),[lit("data")],{})*/), ((IConstructor)$constants.get(1510)/*prod(label("product",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"),lit( ...*/), ((IConstructor)$constants.get(1511)/*prod(label("remainder",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"),li ...*/), ((IConstructor)$constants.get(1512)/*prod(label("setOption",sort("ShellCommand")),[lit("set"),layouts("LAYOUTLIST"),label("name",sort("Qu ...*/), ((IConstructor)$constants.get(1515)/*prod(label("in",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"),lit("in") ...*/), ((IConstructor)$constants.get(1516)/*prod(lex("DateAndTime"),[lit("$"),lex("DatePart"),lit("T"),lex("TimePartNoTZ"),lex("TimeZonePart"),l ...*/), ((IConstructor)$constants.get(1517)/*prod(label("module",sort("Kind")),[lit("module")],{})*/), ((IConstructor)$constants.get(1519)/*prod(keywords("RascalKeywords"),[lit("else")],{})*/), ((IConstructor)$constants.get(1520)/*prod(keywords("RascalKeywords"),[lit("in")],{})*/), ((IConstructor)$constants.get(1521)/*prod(keywords("RascalKeywords"),[lit("it")],{})*/), ((IConstructor)$constants.get(1522)/*prod(keywords("RascalKeywords"),[lit("false")],{})*/), ((IConstructor)$constants.get(1523)/*prod(label("esc",lex("StringCharacter")),[lit("\\"),\char-class([range(34,34),range(39,39),range(60, ...*/), ((IConstructor)$constants.get(1526)/*prod(label("empty",sort("Target")),[],{})*/), ((IConstructor)$constants.get(1528)/*prod(keywords("RascalKeywords"),[lit("return")],{})*/), ((IConstructor)$constants.get(1529)/*prod(label("default",sort("TypeArg")),[label("type",sort("Type"))],{})*/), ((IConstructor)$constants.get(1531)/*prod(label("continue",sort("Statement")),[lit("continue"),layouts("LAYOUTLIST"),label("target",sort( ...*/), ((IConstructor)$constants.get(586)/*prod(label("negation",sort("Expression")),[lit("!"),layouts("LAYOUTLIST"),label("argument",condition ...*/), ((IConstructor)$constants.get(1534)/*prod(lex("DatePart"),[\char-class([range(48,57)]),\char-class([range(48,57)]),\char-class([range(48, ...*/), ((IConstructor)$constants.get(1535)/*prod(keywords("RascalKeywords"),[lit("for")],{})*/), ((IConstructor)$constants.get(1536)/*prod(label("newline",lex("ConcretePart")),[lit("\n"),\iter-star(\char-class([range(9,9),range(32,32) ...*/), ((IConstructor)$constants.get(1539)/*prod(label("doWhile",sort("Statement")),[label("label",sort("Label")),layouts("LAYOUTLIST"),lit("do" ...*/), ((IConstructor)$constants.get(1541)/*prod(label("int",sort("BasicType")),[lit("int")],{})*/), ((IConstructor)$constants.get(1543)/*prod(label("bounded",sort("TypeVar")),[lit("&"),layouts("LAYOUTLIST"),label("name",lex("Name")),layo ...*/), ((IConstructor)$constants.get(1547)/*prod(label("one",sort("ConcreteHole")),[lit("\<"),layouts("LAYOUTLIST"),label("symbol",sort("Sym")), ...*/), ((IConstructor)$constants.get(1549)/*prod(label("hexIntegerLiteral",sort("IntegerLiteral")),[label("hex",lex("HexIntegerLiteral"))],{})*/), ((IConstructor)$constants.get(1552)/*prod(label("location",sort("Literal")),[label("locationLiteral",sort("LocationLiteral"))],{tag("cate ...*/), ((IConstructor)$constants.get(1555)/*prod(label("default",sort("FunctionModifier")),[lit("default")],{})*/), ((IConstructor)$constants.get(1557)/*prod(label("default",sort("Visibility")),[],{})*/), ((IConstructor)$constants.get(1559)/*regular(\iter-star(lex("RegExp")))*/), ((IConstructor)$constants.get(1560)/*prod(label("enumerator",sort("Expression")),[label("pattern",sort("Pattern")),layouts("LAYOUTLIST"), ...*/), ((IConstructor)$constants.get(1561)/*prod(label("interpolated",sort("StringMiddle")),[label("mid",lex("MidStringChars")),layouts("LAYOUTL ...*/), ((IConstructor)$constants.get(563)/*prod(label("qualifiedName",sort("Expression")),[label("qualifiedName",sort("QualifiedName"))],{})*/), ((IConstructor)$constants.get(1563)/*prod(label("conditional",sort("Replacement")),[label("replacementExpression",sort("Expression")),lay ...*/), ((IConstructor)$constants.get(1565)/*prod(keywords("RascalKeywords"),[lit("break")],{})*/), ((IConstructor)$constants.get(1566)/*prod(label("tryFinally",sort("Statement")),[lit("try"),layouts("LAYOUTLIST"),label("body",sort("Stat ...*/), ((IConstructor)$constants.get(1569)/*prod(label("default",sort("Tag")),[lit("@"),layouts("LAYOUTLIST"),label("name",lex("Name")),layouts( ...*/), ((IConstructor)$constants.get(1572)/*prod(label("name",sort("UserType")),[label("name",sort("QualifiedName"))],{})*/), ((IConstructor)$constants.get(1574)/*prod(label("dynamic",sort("LocalVariableDeclaration")),[lit("dynamic"),layouts("LAYOUTLIST"),label(" ...*/), ((IConstructor)$constants.get(568)/*prod(label("map",sort("Expression")),[lit("("),layouts("LAYOUTLIST"),label("mappings",\iter-star-sep ...*/), ((IConstructor)$constants.get(1579)/*prod(label("variableDeclaration",sort("Statement")),[label("declaration",sort("LocalVariableDeclarat ...*/), ((IConstructor)$constants.get(604)/*associativity(sort("Expression"),left(),{prod(label("division",sort("Expression")),[label("lhs",sort ...*/), ((IConstructor)$constants.get(1582)/*prod(lex("LAYOUT"),[lex("Comment")],{})*/), ((IConstructor)$constants.get(980)/*prod(label("except",sort("Sym")),[label("symbol",sort("Sym")),layouts("LAYOUTLIST"),lit("!"),layouts ...*/), ((IConstructor)$constants.get(1583)/*prod(label("continuation",lex("StringCharacter")),[\char-class([range(10,10)]),layouts("HorizontalSp ...*/), ((IConstructor)$constants.get(1586)/*prod(lex("NamedRegExp"),[\char-class([range(1,46),range(48,59),range(61,61),range(63,91),range(93,11 ...*/), ((IConstructor)$constants.get(649)/*prod(label("ifThenElse",sort("Expression")),[label("condition",sort("Expression")),layouts("LAYOUTLI ...*/), ((IConstructor)$constants.get(1587)/*prod(label("keyword",sort("SyntaxDefinition")),[lit("keyword"),layouts("LAYOUTLIST"),label("defined" ...*/), ((IConstructor)$constants.get(486)/*prod(label("literal",sort("Expression")),[label("literal",sort("Literal"))],{})*/), ((IConstructor)$constants.get(1589)/*prod(lex("TimeZonePart"),[\char-class([range(43,43),range(45,45)]),\char-class([range(48,49)]),\char ...*/), ((IConstructor)$constants.get(593)/*prod(label("composition",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"), ...*/), ((IConstructor)$constants.get(1590)/*prod(label("fail",sort("Statement")),[lit("fail"),layouts("LAYOUTLIST"),label("target",sort("Target" ...*/), ((IConstructor)$constants.get(1592)/*prod(label("bracket",sort("Type")),[lit("("),layouts("LAYOUTLIST"),label("type",sort("Type")),layout ...*/), ((IConstructor)$constants.get(1594)/*prod(label("resultOutput",lex("Output")),[lit("⇨"),\iter-star(\char-class([range(1,9),range(11,12),r ...*/), ((IConstructor)$constants.get(1597)/*prod(label("empty",sort("DataTarget")),[],{})*/), ((IConstructor)$constants.get(1599)/*prod(keywords("RascalKeywords"),[lit("test")],{})*/), ((IConstructor)$constants.get(1600)/*prod(label("all",sort("Prod")),[label("lhs",sort("Prod")),layouts("LAYOUTLIST"),lit("|"),layouts("LA ...*/), ((IConstructor)$constants.get(1005)/*prod(label("characterClass",sort("Sym")),[label("charClass",sort("Class"))],{})*/), ((IConstructor)$constants.get(1602)/*prod(label("present",lex("OptionalTerminator")),[lit(";")],{})*/), ((IConstructor)$constants.get(1604)/*prod(lex("Char"),[lit("\\"),\char-class([range(32,32),range(34,34),range(39,39),range(45,45),range(6 ...*/), ((IConstructor)$constants.get(1606)/*prod(label("import",sort("Command")),[label("imported",sort("Import"))],{})*/), ((IConstructor)$constants.get(1608)/*prod(label("selector",sort("DataTypeSelector")),[label("sort",sort("QualifiedName")),layouts("LAYOUT ...*/), ((IConstructor)$constants.get(1294)/*associativity(sort("Class"),left(),{prod(label("difference",sort("Class")),[label("lhs",sort("Class" ...*/), ((IConstructor)$constants.get(292)/*prod(label("greaterThanOrEq",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIS ...*/), ((IConstructor)$constants.get(1611)/*prod(lex("NamedRegExp"),[\char-class([range(92,92)]),\char-class([range(47,47),range(60,60),range(62 ...*/), ((IConstructor)$constants.get(1612)/*prod(label("clear",sort("ShellCommand")),[lit("clear"),layouts("LAYOUTLIST"),label("terminator",lex( ...*/), ((IConstructor)$constants.get(595)/*prod(label("division",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"),lit ...*/), ((IConstructor)$constants.get(769)/*prod(label("tuple",sort("Pattern")),[lit("\<"),layouts("LAYOUTLIST"),label("elements",\iter-seps(sor ...*/), ((IConstructor)$constants.get(1615)/*prod(label("default",sort("ImportedModule")),[label("name",sort("QualifiedName"))],{})*/), ((IConstructor)$constants.get(1617)/*prod(label("default",\parameterized-sort("KeywordArguments",[sort("Expression")])),[label("optionalC ...*/), ((IConstructor)$constants.get(1621)/*prod(label("function",sort("Type")),[label("function",sort("FunctionType"))],{})*/), ((IConstructor)$constants.get(1011)/*prod(label("parameter",sort("Sym")),[lit("&"),layouts("LAYOUTLIST"),label("nonterminal",lex("Nonterm ...*/), ((IConstructor)$constants.get(555)/*prod(label("has",sort("Expression")),[label("expression",sort("Expression")),layouts("LAYOUTLIST"),l ...*/), ((IConstructor)$constants.get(1625)/*prod(label("switch",sort("Statement")),[label("label",sort("Label")),layouts("LAYOUTLIST"),lit("swit ...*/), ((IConstructor)$constants.get(1627)/*prod(empty(),[],{})*/), ((IConstructor)$constants.get(1628)/*prod(keywords("RascalKeywords"),[sort("BasicType")],{})*/), ((IConstructor)$constants.get(1629)/*prod(keywords("RascalKeywords"),[lit("list")],{})*/), ((IConstructor)$constants.get(1630)/*prod(keywords("RascalKeywords"),[lit("rel")],{})*/), ((IConstructor)$constants.get(584)/*prod(label("negative",sort("Expression")),[lit("-"),layouts("LAYOUTLIST"),label("argument",sort("Exp ...*/), ((IConstructor)$constants.get(1631)/*regular(\iter-star(\char-class([range(100,100),range(105,105),range(109,109),range(115,115)])))*/), ((IConstructor)$constants.get(1632)/*prod(label("none",sort("KeywordFormals")),[],{})*/), ((IConstructor)$constants.get(1634)/*prod(label("default",sort("Case")),[lit("default"),layouts("LAYOUTLIST"),lit(":"),layouts("LAYOUTLIS ...*/), ((IConstructor)$constants.get(1051)/*prod(label("asType",sort("Pattern")),[lit("["),layouts("LAYOUTLIST"),label("type",sort("Type")),layo ...*/), ((IConstructor)$constants.get(608)/*prod(label("intersection",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST") ...*/), ((IConstructor)$constants.get(1636)/*prod(label("actuals",sort("ImportedModule")),[label("name",sort("QualifiedName")),layouts("LAYOUTLIS ...*/), ((IConstructor)$constants.get(1638)/*prod(label("help",sort("ShellCommand")),[lit("help"),layouts("LAYOUTLIST"),label("terminator",lex("O ...*/), ((IConstructor)$constants.get(1641)/*prod(label("listRelation",sort("BasicType")),[lit("lrel")],{})*/), ((IConstructor)$constants.get(1644)/*prod(label("listModules",sort("ShellCommand")),[lit("modules"),layouts("LAYOUTLIST"),label("terminat ...*/), ((IConstructor)$constants.get(1647)/*priority(sort("Prod"),[choice(sort("Prod"),{prod(label("associativityGroup",sort("Prod")),[label("as ...*/), ((IConstructor)$constants.get(1649)/*prod(label("topDownBreak",sort("Strategy")),[lit("top-down-break")],{})*/), ((IConstructor)$constants.get(1652)/*prod(label("none",\parameterized-sort("KeywordArguments",[sort("Expression")])),[],{})*/), ((IConstructor)$constants.get(1654)/*prod(label("default",sort("LocalVariableDeclaration")),[label("declarator",sort("Declarator"))],{})*/), ((IConstructor)$constants.get(1656)/*prod(label("division",sort("Assignment")),[lit("/=")],{})*/), ((IConstructor)$constants.get(1659)/*prod(keywords("RascalKeywords"),[lit("lrel")],{})*/), ((IConstructor)$constants.get(1660)/*prod(label("stdoutOutput",lex("Output")),[conditional(lit("≫"),{\begin-of-line()}),\iter-star(\char- ...*/), ((IConstructor)$constants.get(1664)/*prod(lex("RealLiteral"),[iter(\char-class([range(48,57)])),\char-class([range(68,68),range(70,70),ra ...*/), ((IConstructor)$constants.get(1648)/*associativity(sort("Prod"),left(),{prod(label("all",sort("Prod")),[label("lhs",sort("Prod")),layouts ...*/), ((IConstructor)$constants.get(1665)/*prod(label("slice",sort("Assignable")),[label("receiver",sort("Assignable")),layouts("LAYOUTLIST"),l ...*/), ((IConstructor)$constants.get(1667)/*prod(label("bottomUpBreak",sort("Strategy")),[lit("bottom-up-break")],{})*/), ((IConstructor)$constants.get(995)/*prod(label("column",sort("Sym")),[label("symbol",sort("Sym")),layouts("LAYOUTLIST"),lit("@"),layouts ...*/), ((IConstructor)$constants.get(1670)/*regular(iter(\char-class([range(48,57)])))*/), ((IConstructor)$constants.get(1671)/*prod(keywords("RascalKeywords"),[lit("bracket")],{})*/), ((IConstructor)$constants.get(1672)/*prod(keywords("RascalKeywords"),[lit("continue")],{})*/), ((IConstructor)$constants.get(1673)/*prod(label("mid",sort("ProtocolTail")),[label("mid",lex("MidProtocolChars")),layouts("LAYOUTLIST"),l ...*/), ((IConstructor)$constants.get(1676)/*prod(label("gt",lex("ConcretePart")),[lit("\\\>")],{tag("category"("string"))})*/), ((IConstructor)$constants.get(1679)/*regular(\iter-seps(sort("TypeVar"),[layouts("LAYOUTLIST"),lit(","),layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(40)/*prod(label("simpleCharclass",sort("Class")),[lit("["),layouts("LAYOUTLIST"),label("ranges",\iter-sta ...*/), ((IConstructor)$constants.get(1681)/*prod(label("default",sort("ModuleActuals")),[lit("["),layouts("LAYOUTLIST"),label("types",\iter-seps ...*/), ((IConstructor)$constants.get(1683)/*prod(label("subscript",sort("Assignable")),[label("receiver",sort("Assignable")),layouts("LAYOUTLIST ...*/), ((IConstructor)$constants.get(1685)/*prod(label("node",sort("BasicType")),[lit("node")],{})*/), ((IConstructor)$constants.get(1687)/*prod(lex("NonterminalLabel"),[\char-class([range(97,122)]),conditional(\iter-star(\char-class([range ...*/), ((IConstructor)$constants.get(1689)/*prod(label("default",sort("ModuleParameters")),[lit("["),layouts("LAYOUTLIST"),label("parameters",\i ...*/), ((IConstructor)$constants.get(576)/*prod(label("bracket",sort("Expression")),[lit("("),layouts("LAYOUTLIST"),label("expression",sort("Ex ...*/), ((IConstructor)$constants.get(1692)/*prod(label("statement",sort("Command")),[label("statement",conditional(sort("Statement"),{except("va ...*/), ((IConstructor)$constants.get(1495)/*prod(label("unlabeled",sort("Prod")),[label("modifiers",\iter-star-seps(sort("ProdModifier"),[layout ...*/), ((IConstructor)$constants.get(627)/*prod(label("equals",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"),lit(" ...*/), ((IConstructor)$constants.get(1694)/*prod(label("topDown",sort("Strategy")),[lit("top-down")],{})*/), ((IConstructor)$constants.get(1697)/*associativity(sort("Sym"),left(),{prod(label("notFollow",sort("Sym")),[label("symbol",sort("Sym")),l ...*/), ((IConstructor)$constants.get(1698)/*regular(\iter-seps(sort("EvalCommand"),[layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(1699)/*regular(\iter-seps(lex("Name"),[layouts("LAYOUTLIST"),lit("::"),layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(1700)/*prod(label("interpolated",sort("StringLiteral")),[label("pre",lex("PreStringChars")),layouts("LAYOUT ...*/), ((IConstructor)$constants.get(1702)/*prod(label("string",sort("Literal")),[label("stringLiteral",sort("StringLiteral"))],{})*/), ((IConstructor)$constants.get(1705)/*prod(label("layout",sort("SyntaxDefinition")),[label("vis",sort("Visibility")),layouts("LAYOUTLIST") ...*/), ((IConstructor)$constants.get(1497)/*prod(label("labeled",sort("Prod")),[label("modifiers",\iter-star-seps(sort("ProdModifier"),[layouts( ...*/), ((IConstructor)$constants.get(774)/*prod(label("splice",sort("Pattern")),[lit("*"),layouts("LAYOUTLIST"),label("argument",sort("Pattern" ...*/), ((IConstructor)$constants.get(989)/*prod(label("literal",sort("Sym")),[label("string",lex("StringConstant"))],{})*/), ((IConstructor)$constants.get(1708)/*prod(label("basic",sort("Type")),[label("basic",sort("BasicType"))],{})*/), ((IConstructor)$constants.get(1711)/*regular(\iter-seps(sort("Statement"),[layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(1712)/*prod(keywords("RascalKeywords"),[lit("start")],{})*/), ((IConstructor)$constants.get(1713)/*prod(label("default",\parameterized-sort("KeywordArguments",[sort("Pattern")])),[label("optionalComm ...*/), ((IConstructor)$constants.get(1717)/*prod(label("defaultStrategy",sort("Visit")),[lit("visit"),layouts("LAYOUTLIST"),lit("("),layouts("LA ...*/), ((IConstructor)$constants.get(1719)/*prod(keywords("RascalKeywords"),[lit("o")],{})*/), ((IConstructor)$constants.get(1720)/*prod(label("boolean",sort("Literal")),[label("booleanLiteral",lex("BooleanLiteral"))],{})*/), ((IConstructor)$constants.get(1723)/*prod(lex("TimePartNoTZ"),[\char-class([range(48,50)]),\char-class([range(48,57)]),\char-class([range ...*/), ((IConstructor)$constants.get(1724)/*prod(label("fromTo",sort("Range")),[label("start",lex("Char")),layouts("LAYOUTLIST"),lit("-"),layout ...*/), ((IConstructor)$constants.get(1728)/*prod(label("constructor",sort("Assignable")),[label("name",lex("Name")),layouts("LAYOUTLIST"),lit("( ...*/), ((IConstructor)$constants.get(1731)/*regular(\iter-star(\char-class([range(48,57)])))*/), ((IConstructor)$constants.get(1732)/*prod(lex("Char"),[\char-class([range(1,31),range(33,33),range(35,38),range(40,44),range(46,59),range ...*/), ((IConstructor)$constants.get(1734)/*prod(lex("RationalLiteral"),[\char-class([range(48,57)]),\iter-star(\char-class([range(48,57)])),\ch ...*/), ((IConstructor)$constants.get(1735)/*prod(label("sliceStep",sort("Assignable")),[label("receiver",sort("Assignable")),layouts("LAYOUTLIST ...*/), ((IConstructor)$constants.get(1737)/*regular(\iter-star-seps(\parameterized-sort("Mapping",[sort("Expression")]),[layouts("LAYOUTLIST"),l ...*/), ((IConstructor)$constants.get(1049)/*prod(label("descendant",sort("Pattern")),[lit("/"),layouts("LAYOUTLIST"),label("pattern",sort("Patte ...*/), ((IConstructor)$constants.get(1738)/*prod(keywords("RascalKeywords"),[lit("set")],{})*/), ((IConstructor)$constants.get(1739)/*prod(label("notIn",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"),lit("n ...*/), ((IConstructor)$constants.get(1740)/*prod(label("addition",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"),lit ...*/), ((IConstructor)$constants.get(1741)/*prod(label("noExpression",sort("OptionalExpression")),[],{})*/), ((IConstructor)$constants.get(1743)/*regular(\iter-star(alt({seq([lit("\\"),\char-class([range(123,123),range(125,125)])]),lex("TagString ...*/), ((IConstructor)$constants.get(1744)/*prod(label("integer",sort("Literal")),[label("integerLiteral",sort("IntegerLiteral"))],{tag("categor ...*/), ((IConstructor)$constants.get(1747)/*prod(label("expression",sort("Tag")),[lit("@"),layouts("LAYOUTLIST"),label("name",lex("Name")),layou ...*/), ((IConstructor)$constants.get(1750)/*prod(label("solve",sort("Statement")),[lit("solve"),layouts("LAYOUTLIST"),lit("("),layouts("LAYOUTLI ...*/), ((IConstructor)$constants.get(1755)/*regular(\iter-star-seps(sort("Pattern"),[layouts("LAYOUTLIST"),lit(","),layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(1756)/*prod(keywords("RascalKeywords"),[lit("assoc")],{})*/), ((IConstructor)$constants.get(780)/*prod(label("typedVariable",sort("Pattern")),[label("type",sort("Type")),layouts("LAYOUTLIST"),label( ...*/), ((IConstructor)$constants.get(182)/*prod(label("in",sort("Expression")),[label("lhs",sort("Expression")),layouts("LAYOUTLIST"),lit("in") ...*/), ((IConstructor)$constants.get(1757)/*prod(label("character",sort("Range")),[label("character",lex("Char"))],{})*/), ((IConstructor)$constants.get(1760)/*prod(keywords("RascalKeywords"),[lit("bag")],{})*/), ((IConstructor)$constants.get(1762)/*prod(label("ascii",lex("UnicodeEscape")),[lit("\\"),\char-class([range(97,97)]),\char-class([range(4 ...*/), ((IConstructor)$constants.get(1765)/*prod(label("unimport",sort("ShellCommand")),[lit("unimport"),layouts("LAYOUTLIST"),label("name",sort ...*/), ((IConstructor)$constants.get(1768)/*prod(lex("PostStringChars"),[\char-class([range(62,62)]),\iter-star(lex("StringCharacter")),\char-cl ...*/), ((IConstructor)$constants.get(481)/*prod(label("it",sort("Expression")),[conditional(lit("it"),{\not-precede(\char-class([range(65,90),r ...*/), ((IConstructor)$constants.get(1769)/*prod(label("bag",sort("BasicType")),[lit("bag")],{})*/), ((IConstructor)$constants.get(623)/*associativity(sort("Expression"),left(),{prod(label("modulo",sort("Expression")),[label("lhs",sort(" ...*/), ((IConstructor)$constants.get(1771)/*prod(label("expression",sort("Command")),[label("expression",conditional(sort("Expression"),{except( ...*/), ((IConstructor)$constants.get(409)/*prod(label("enumerator",sort("Expression")),[label("pattern",sort("Pattern")),layouts("LAYOUTLIST"), ...*/), ((IConstructor)$constants.get(1775)/*prod(lex("JustTime"),[lit("$T"),conditional(lex("TimePartNoTZ"),{\not-follow(\char-class([range(43,4 ...*/), ((IConstructor)$constants.get(1776)/*prod(label("alias",sort("Declaration")),[label("tags",sort("Tags")),layouts("LAYOUTLIST"),label("vis ...*/), ((IConstructor)$constants.get(560)/*prod(label("transitiveReflexiveClosure",sort("Expression")),[label("argument",sort("Expression")),la ...*/), ((IConstructor)$constants.get(1779)/*prod(keywords("RascalKeywords"),[lit("dynamic")],{})*/), ((IConstructor)$constants.get(999)/*prod(label("iterStarSep",sort("Sym")),[lit("{"),layouts("LAYOUTLIST"),label("symbol",sort("Sym")),la ...*/), ((IConstructor)$constants.get(44)/*prod(label("complement",sort("Class")),[lit("!"),layouts("LAYOUTLIST"),label("charClass",sort("Class ...*/), ((IConstructor)$constants.get(1780)/*prod(label("typeArguments",sort("FunctionType")),[label("type",sort("Type")),layouts("LAYOUTLIST"),l ...*/), ((IConstructor)$constants.get(509)/*prod(label("callOrTree",sort("Expression")),[label("expression",conditional(sort("Expression"),{exce ...*/), ((IConstructor)$constants.get(1248)/*associativity(sort("Sym"),left(),{prod(label("unequal",sort("Sym")),[label("symbol",sort("Sym")),lay ...*/), ((IConstructor)$constants.get(1782)/*prod(label("subtraction",sort("Expression")),[label("lhs",conditional(sort("Expression"),{except("tr ...*/), ((IConstructor)$constants.get(1783)/*prod(keywords("RascalKeywords"),[lit("solve")],{})*/), ((IConstructor)$constants.get(1784)/*prod(label("abstract",sort("FunctionDeclaration")),[label("tags",sort("Tags")),layouts("LAYOUTLIST") ...*/), ((IConstructor)$constants.get(631)/*associativity(sort("Expression"),\non-assoc(),{prod(label("ifDefinedOtherwise",sort("Expression")),[ ...*/), ((IConstructor)$constants.get(1786)/*regular(\iter-seps(sort("Assignable"),[layouts("LAYOUTLIST"),lit(","),layouts("LAYOUTLIST")]))*/), ((IConstructor)$constants.get(1787)/*prod(lex("ProtocolChars"),[\char-class([range(124,124)]),lex("URLChars"),conditional(lit("://"),{\no ...*/), ((IConstructor)$constants.get(1491)/*prod(label("associativityGroup",sort("Prod")),[label("associativity",sort("Assoc")),layouts("LAYOUTL ...*/), ((IConstructor)$constants.get(1791)/*prod(label("varArgs",sort("Parameters")),[lit("("),layouts("LAYOUTLIST"),label("formals",sort("Forma ...*/), ((IConstructor)$constants.get(622)/*associativity(sort("Expression"),left(),{prod(label("insertBefore",sort("Expression")),[label("lhs", ...*/), ((IConstructor)$constants.get(1794)/*prod(lex("PathChars"),[lex("URLChars"),\char-class([range(124,124)])],{})*/), ((IConstructor)$constants.get(501)/*prod(label("reducer",sort("Expression")),[lit("("),layouts("LAYOUTLIST"),label("init",sort("Expressi ...*/), ((IConstructor)$constants.get(1795)/*prod(lex("Nonterminal"),[conditional(seq([conditional(\char-class([range(65,90)]),{\not-precede(\cha ...*/), ((IConstructor)$constants.get(1800)/*prod(label("utf32",lex("UnicodeEscape")),[lit("\\"),\char-class([range(85,85)]),alt({lit("10"),seq([ ...*/), ((IConstructor)$constants.get(579)/*choice(sort("Expression"),{prod(label("it",sort("Expression")),[conditional(lit("it"),{\not-precede( ...*/), ((IConstructor)$constants.get(1806)/*regular(iter(\char-class([range(1,9),range(11,59),range(61,61),range(63,91),range(93,95),range(97,11 ...*/), ((IConstructor)$constants.get(1807)/*prod(label("default",sort("Header")),[label("tags",sort("Tags")),layouts("LAYOUTLIST"),lit("module") ...*/), ((IConstructor)$constants.get(1809)/*prod(label("anychar",lex("StringCharacter")),[\char-class([range(1,33),range(35,38),range(40,59),ran ...*/), ((IConstructor)$constants.get(1812)/*prod(keywords("RascalKeywords"),[lit("rat")],{})*/), ((IConstructor)$constants.get(1813)/*prod(label("type",sort("BasicType")),[lit("type")],{})*/)}, 
                                          $RVF.bool(true)),
                 mod_0,
                 (IVisitFunction) (IValue $VISIT5_subject, TraversalState $traversalState) -> {
                     VISIT5:switch(Fingerprint.getConcreteFingerprint($VISIT5_subject)){
                     
                         case 0:
                             
                     
                         default: 
                             if($isSubtypeOf($VISIT5_subject.getType(),M_lang_rascal_syntax_Rascal.NT_SyntaxDefinition)){
                                /*muExists*/CASE_0_0: 
                                    do {
                                        ValueRef<ITree> s_2 = new ValueRef<ITree>();
                                        ITree $aux_1 = ((ITree)($VISIT5_subject));
                                        result_1.setValue($aset_add_elm(result_1.getValue(),$aux_1));
                                        $traversalState.setMatched(true); 
                                        break VISIT5;
                                    } while(false);
                             
                             }
                             if($isSubtypeOf($VISIT5_subject.getType(),M_lang_rascal_syntax_Rascal.NT_Body)){
                                /*muExists*/CASE_0_1: 
                                    do {
                                        ValueRef<ITree> b_3 = new ValueRef<ITree>();
                                        ITree $replacement73 = (ITree)($VISIT5_subject);
                                        if($isSubtypeOf($replacement73.getType(),$VISIT5_subject.getType())){
                                           $traversalState.setMatchedAndChanged(true, true);
                                           return $replacement73;
                                        
                                        } else {
                                           break VISIT5;// switch
                                        
                                        }
                                    } while(false);
                             
                             }
            
                     }
                     return $VISIT5_subject;
                 });return result_1.getValue();
        
        } catch (ReturnFromTraversalException e) {
            return (ISet) e.getValue();
        }
    
    }
    

    public static void main(String[] args) {
      throw new RuntimeException("No function `main` found in Rascal module `lang::rascal::grammar::definition::Modules`");
    }
}