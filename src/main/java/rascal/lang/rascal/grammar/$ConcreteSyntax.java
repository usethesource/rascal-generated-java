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
public class $ConcreteSyntax 
    extends
        org.rascalmpl.runtime.$RascalModule
    implements 
    	rascal.lang.rascal.grammar.$ConcreteSyntax_$I {

    private final $ConcreteSyntax_$I $me;
    private final IList $constants;
    
    
    public final rascal.$IO M_IO;
    public final rascal.lang.rascal.grammar.definition.$Productions M_lang_rascal_grammar_definition_Productions;
    public final rascal.lang.rascal.grammar.definition.$Symbols M_lang_rascal_grammar_definition_Symbols;
    public final rascal.lang.rascal.grammar.definition.$Regular M_lang_rascal_grammar_definition_Regular;
    public final rascal.$ParseTree M_ParseTree;
    public final rascal.lang.rascal.syntax.$Rascal M_lang_rascal_syntax_Rascal;
    public final rascal.lang.rascal.grammar.definition.$Literals M_lang_rascal_grammar_definition_Literals;
    public final rascal.$ValueIO M_ValueIO;
    public final rascal.$Type M_Type;
    public final rascal.analysis.diff.edits.$FileSystemChanges M_analysis_diff_edits_FileSystemChanges;
    public final rascal.$List M_List;
    public final rascal.$Grammar M_Grammar;
    public final rascal.$Message M_Message;

    
    
    public final io.usethesource.vallang.type.Type $T8;	/*avalue()*/
    public final io.usethesource.vallang.type.Type $T14;	/*aparameter("A",avalue(),closed=true)*/
    public final io.usethesource.vallang.type.Type $T6;	/*aint()*/
    public final io.usethesource.vallang.type.Type $T10;	/*astr()*/
    public final io.usethesource.vallang.type.Type $T4;	/*avoid()*/
    public final io.usethesource.vallang.type.Type $T9;	/*aparameter("T",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type ADT_Replacement;	/*aadt("Replacement",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Replacement;	/*aadt("Replacement",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T2;	/*alit(",")*/
    public final io.usethesource.vallang.type.Type ADT_Strategy;	/*aadt("Strategy",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Strategy;	/*aadt("Strategy",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_MidStringChars;	/*aadt("MidStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_MidStringChars;	/*aadt("MidStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_LocalVariableDeclaration;	/*aadt("LocalVariableDeclaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_LocalVariableDeclaration;	/*aadt("LocalVariableDeclaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Attr;	/*aadt("Attr",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ProtocolChars;	/*aadt("ProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ProtocolChars;	/*aadt("ProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Expression;	/*aadt("Expression",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Expression;	/*aadt("Expression",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Mapping_Expression;	/*aadt("Mapping",[aadt("Expression",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Mapping_Expression;	/*aadt("Mapping",[aadt("Expression",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Tree;	/*aadt("Tree",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T12;	/*aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)*/
    public final io.usethesource.vallang.type.Type ADT_KeywordArguments_1;	/*aadt("KeywordArguments",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordArguments_1;	/*aadt("KeywordArguments",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_LAYOUT;	/*aadt("LAYOUT",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_LAYOUT;	/*aadt("LAYOUT",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_IOCapability;	/*aadt("IOCapability",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Name;	/*aadt("Name",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Name;	/*aadt("Name",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TagString;	/*aadt("TagString",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TagString;	/*aadt("TagString",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Variable;	/*aadt("Variable",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Variable;	/*aadt("Variable",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FunctionType;	/*aadt("FunctionType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionType;	/*aadt("FunctionType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Visibility;	/*aadt("Visibility",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Visibility;	/*aadt("Visibility",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PostProtocolChars;	/*aadt("PostProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PostProtocolChars;	/*aadt("PostProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Range;	/*aadt("Range",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Range;	/*aadt("Range",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Concrete;	/*aadt("Concrete",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Concrete;	/*aadt("Concrete",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Pattern;	/*aadt("Pattern",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Pattern;	/*aadt("Pattern",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Mapping_Pattern;	/*aadt("Mapping",[aadt("Pattern",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Mapping_Pattern;	/*aadt("Mapping",[aadt("Pattern",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_DatePart;	/*aadt("DatePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DatePart;	/*aadt("DatePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Output;	/*aadt("Output",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Output;	/*aadt("Output",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RationalLiteral;	/*aadt("RationalLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RationalLiteral;	/*aadt("RationalLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RegExpLiteral;	/*aadt("RegExpLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RegExpLiteral;	/*aadt("RegExpLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Item;	/*aadt("Item",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_GrammarModule;	/*aadt("GrammarModule",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RegExpModifier;	/*aadt("RegExpModifier",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RegExpModifier;	/*aadt("RegExpModifier",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Prod;	/*aadt("Prod",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Prod;	/*aadt("Prod",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TreeSearchResult_Tree;	/*aadt("TreeSearchResult",[aadt("Tree",[],dataSyntax())],dataSyntax())*/
    public final io.usethesource.vallang.type.Type TreeSearchResult_Tree_treeFound_Tree;	/*acons(aadt("TreeSearchResult",[aadt("Tree",[],dataSyntax())],dataSyntax()),[aadt("Tree",[],dataSyntax(),alabel="tree")],[],alabel="treeFound")*/
    public final io.usethesource.vallang.type.Type ADT_ModuleParameters;	/*aadt("ModuleParameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ModuleParameters;	/*aadt("ModuleParameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T13;	/*aparameter("T",aadt("Tree",[],dataSyntax()),closed=false)*/
    public final io.usethesource.vallang.type.Type ADT_Mapping_1;	/*aadt("Mapping",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Mapping_1;	/*aadt("Mapping",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_OptionalTerminator;	/*aadt("OptionalTerminator",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_OptionalTerminator;	/*aadt("OptionalTerminator",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Case;	/*aadt("Case",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Case;	/*aadt("Case",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ImportedModule;	/*aadt("ImportedModule",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ImportedModule;	/*aadt("ImportedModule",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_BooleanLiteral;	/*aadt("BooleanLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_BooleanLiteral;	/*aadt("BooleanLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Declarator;	/*aadt("Declarator",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Declarator;	/*aadt("Declarator",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_SyntaxDefinition;	/*aadt("SyntaxDefinition",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_SyntaxDefinition;	/*aadt("SyntaxDefinition",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_IntegerLiteral;	/*aadt("IntegerLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_IntegerLiteral;	/*aadt("IntegerLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_KeywordArguments_Expression;	/*aadt("KeywordArguments",[aadt("Expression",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordArguments_Expression;	/*aadt("KeywordArguments",[aadt("Expression",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Target;	/*aadt("Target",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Target;	/*aadt("Target",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TimePartNoTZ;	/*aadt("TimePartNoTZ",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TimePartNoTZ;	/*aadt("TimePartNoTZ",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Renaming;	/*aadt("Renaming",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Renaming;	/*aadt("Renaming",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_KeywordFormals;	/*aadt("KeywordFormals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordFormals;	/*aadt("KeywordFormals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Maybe_1;	/*aadt("Maybe",[aparameter("A",avalue(),closed=true)],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Catch;	/*aadt("Catch",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Catch;	/*aadt("Catch",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Production;	/*aadt("Production",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_OptionalExpression;	/*aadt("OptionalExpression",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_OptionalExpression;	/*aadt("OptionalExpression",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Renamings;	/*aadt("Renamings",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Renamings;	/*aadt("Renamings",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_DataTarget;	/*aadt("DataTarget",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DataTarget;	/*aadt("DataTarget",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_GrammarDefinition;	/*aadt("GrammarDefinition",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PostStringChars;	/*aadt("PostStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PostStringChars;	/*aadt("PostStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Field;	/*aadt("Field",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Field;	/*aadt("Field",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Maybe_Attr;	/*aadt("Maybe",[aadt("Attr",[],dataSyntax())],dataSyntax())*/
    public final io.usethesource.vallang.type.Type Maybe_Attr_just_Attr;	/*acons(aadt("Maybe",[aadt("Attr",[],dataSyntax())],dataSyntax()),[aadt("Attr",[],dataSyntax(),alabel="val")],[],alabel="just")*/
    public final io.usethesource.vallang.type.Type ADT_LocationLiteral;	/*aadt("LocationLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_LocationLiteral;	/*aadt("LocationLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Tag;	/*aadt("Tag",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Tag;	/*aadt("Tag",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Type;	/*aadt("Type",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Type;	/*aadt("Type",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TimeZonePart;	/*aadt("TimeZonePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TimeZonePart;	/*aadt("TimeZonePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_HexIntegerLiteral;	/*aadt("HexIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_HexIntegerLiteral;	/*aadt("HexIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ShellCommand;	/*aadt("ShellCommand",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ShellCommand;	/*aadt("ShellCommand",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FunctionBody;	/*aadt("FunctionBody",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionBody;	/*aadt("FunctionBody",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Declaration;	/*aadt("Declaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Declaration;	/*aadt("Declaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Symbol;	/*aadt("Symbol",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_StringLiteral;	/*aadt("StringLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringLiteral;	/*aadt("StringLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PreStringChars;	/*aadt("PreStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PreStringChars;	/*aadt("PreStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type $T7;	/*alist(aparameter("T",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type ADT_KeywordArguments_Pattern;	/*aadt("KeywordArguments",[aadt("Pattern",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordArguments_Pattern;	/*aadt("KeywordArguments",[aadt("Pattern",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TreeSearchResult_void;	/*aadt("TreeSearchResult",[avoid()],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TypeArg;	/*aadt("TypeArg",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TypeArg;	/*aadt("TypeArg",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_NonterminalLabel;	/*aadt("NonterminalLabel",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_NonterminalLabel;	/*aadt("NonterminalLabel",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Bound;	/*aadt("Bound",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Bound;	/*aadt("Bound",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Nonterminal;	/*aadt("Nonterminal",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Nonterminal;	/*aadt("Nonterminal",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RegExp;	/*aadt("RegExp",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RegExp;	/*aadt("RegExp",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Tags;	/*aadt("Tags",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Tags;	/*aadt("Tags",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PathPart;	/*aadt("PathPart",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PathPart;	/*aadt("PathPart",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Class;	/*aadt("Class",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Class;	/*aadt("Class",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_KeywordArgument_1;	/*aadt("KeywordArgument",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordArgument_1;	/*aadt("KeywordArgument",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Associativity;	/*aadt("Associativity",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Signature;	/*aadt("Signature",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Signature;	/*aadt("Signature",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FileSystemChange;	/*aadt("FileSystemChange",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ModuleActuals;	/*aadt("ModuleActuals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ModuleActuals;	/*aadt("ModuleActuals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_URLChars;	/*aadt("URLChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_URLChars;	/*aadt("URLChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Condition;	/*aadt("Condition",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Maybe_Symbol;	/*aadt("Maybe",[aadt("Symbol",[],dataSyntax())],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_KeywordFormal;	/*aadt("KeywordFormal",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordFormal;	/*aadt("KeywordFormal",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Maybe_Associativity;	/*aadt("Maybe",[aadt("Associativity",[],dataSyntax(),alabel="a")],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_DataTypeSelector;	/*aadt("DataTypeSelector",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DataTypeSelector;	/*aadt("DataTypeSelector",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Start;	/*aadt("Start",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Start;	/*aadt("Start",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_OptionalComma;	/*aadt("OptionalComma",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_OptionalComma;	/*aadt("OptionalComma",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PrePathChars;	/*aadt("PrePathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PrePathChars;	/*aadt("PrePathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_StringConstant;	/*aadt("StringConstant",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringConstant;	/*aadt("StringConstant",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_DateAndTime;	/*aadt("DateAndTime",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DateAndTime;	/*aadt("DateAndTime",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_OptionalEqualSign;	/*aadt("OptionalEqualSign",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_OptionalEqualSign;	/*aadt("OptionalEqualSign",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Backslash;	/*aadt("Backslash",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Backslash;	/*aadt("Backslash",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Char;	/*aadt("Char",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Char;	/*aadt("Char",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_StringTail;	/*aadt("StringTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringTail;	/*aadt("StringTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Header;	/*aadt("Header",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Header;	/*aadt("Header",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_JustDate;	/*aadt("JustDate",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_JustDate;	/*aadt("JustDate",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Assignment;	/*aadt("Assignment",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Assignment;	/*aadt("Assignment",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T3;	/*aset(aadt("Symbol",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type ADT_Exception;	/*aadt("Exception",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PatternWithAction;	/*aadt("PatternWithAction",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PatternWithAction;	/*aadt("PatternWithAction",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FunctionDeclaration;	/*aadt("FunctionDeclaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionDeclaration;	/*aadt("FunctionDeclaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_CaseInsensitiveStringConstant;	/*aadt("CaseInsensitiveStringConstant",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_CaseInsensitiveStringConstant;	/*aadt("CaseInsensitiveStringConstant",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Body;	/*aadt("Body",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Body;	/*aadt("Body",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T5;	/*aset(aadt("Production",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type ADT_Variant;	/*aadt("Variant",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Variant;	/*aadt("Variant",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_UserType;	/*aadt("UserType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_UserType;	/*aadt("UserType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Import;	/*aadt("Import",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Import;	/*aadt("Import",[],contextFreeSyntax())*/
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
    public final io.usethesource.vallang.type.Type $T11;	/*alist(aadt("Symbol",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type ADT_StringMiddle;	/*aadt("StringMiddle",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringMiddle;	/*aadt("StringMiddle",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T1;	/*\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())])*/
    public final io.usethesource.vallang.type.Type ADT_RealLiteral;	/*aadt("RealLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RealLiteral;	/*aadt("RealLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TypeVar;	/*aadt("TypeVar",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TypeVar;	/*aadt("TypeVar",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Formals;	/*aadt("Formals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Formals;	/*aadt("Formals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_CharRange;	/*aadt("CharRange",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_QualifiedName;	/*aadt("QualifiedName",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_QualifiedName;	/*aadt("QualifiedName",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_MidPathChars;	/*aadt("MidPathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_MidPathChars;	/*aadt("MidPathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_HorizontalSpace;	/*aadt("HorizontalSpace",[],layoutSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_NamedBackslash;	/*aadt("NamedBackslash",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_NamedBackslash;	/*aadt("NamedBackslash",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RascalKeywords;	/*aadt("RascalKeywords",[],keywordSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Parameters;	/*aadt("Parameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Parameters;	/*aadt("Parameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_MidProtocolChars;	/*aadt("MidProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_MidProtocolChars;	/*aadt("MidProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Maybe_void;	/*aadt("Maybe",[avoid()],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Command;	/*aadt("Command",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Command;	/*aadt("Command",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_StructuredType;	/*aadt("StructuredType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StructuredType;	/*aadt("StructuredType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_OctalIntegerLiteral;	/*aadt("OctalIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_OctalIntegerLiteral;	/*aadt("OctalIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ProtocolPart;	/*aadt("ProtocolPart",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ProtocolPart;	/*aadt("ProtocolPart",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_StringTemplate;	/*aadt("StringTemplate",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringTemplate;	/*aadt("StringTemplate",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Assoc;	/*aadt("Assoc",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Assoc;	/*aadt("Assoc",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RuntimeException;	/*aadt("RuntimeException",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_DecimalIntegerLiteral;	/*aadt("DecimalIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DecimalIntegerLiteral;	/*aadt("DecimalIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Kind;	/*aadt("Kind",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Kind;	/*aadt("Kind",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_DateTimeLiteral;	/*aadt("DateTimeLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DateTimeLiteral;	/*aadt("DateTimeLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Label;	/*aadt("Label",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Label;	/*aadt("Label",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Maybe_Symbol_just_Symbol;	/*acons(aadt("Maybe",[aadt("Symbol",[],dataSyntax())],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="val")],[],alabel="just")*/
    public final io.usethesource.vallang.type.Type Maybe_Associativity_just_Associativity;	/*acons(aadt("Maybe",[aadt("Associativity",[],dataSyntax())],dataSyntax()),[aadt("Associativity",[],dataSyntax(),alabel="val")],[],alabel="just")*/
    public final io.usethesource.vallang.type.Type ADT_PreProtocolChars;	/*aadt("PreProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PreProtocolChars;	/*aadt("PreProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PathTail;	/*aadt("PathTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PathTail;	/*aadt("PathTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PathChars;	/*aadt("PathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PathChars;	/*aadt("PathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Toplevel;	/*aadt("Toplevel",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Toplevel;	/*aadt("Toplevel",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T0;	/*aset(aadt("Condition",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type ADT_EvalCommand;	/*aadt("EvalCommand",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_EvalCommand;	/*aadt("EvalCommand",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PostPathChars;	/*aadt("PostPathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PostPathChars;	/*aadt("PostPathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FunctionModifier;	/*aadt("FunctionModifier",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionModifier;	/*aadt("FunctionModifier",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Module;	/*aadt("Module",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Module;	/*aadt("Module",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Sym;	/*aadt("Sym",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Sym;	/*aadt("Sym",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_StringCharacter;	/*aadt("StringCharacter",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringCharacter;	/*aadt("StringCharacter",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Literal;	/*aadt("Literal",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Literal;	/*aadt("Literal",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Statement;	/*aadt("Statement",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Statement;	/*aadt("Statement",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ProtocolTail;	/*aadt("ProtocolTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ProtocolTail;	/*aadt("ProtocolTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_BasicType;	/*aadt("BasicType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_BasicType;	/*aadt("BasicType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Commands;	/*aadt("Commands",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Commands;	/*aadt("Commands",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Visit;	/*aadt("Visit",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Visit;	/*aadt("Visit",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Comment;	/*aadt("Comment",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Comment;	/*aadt("Comment",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_NamedRegExp;	/*aadt("NamedRegExp",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_NamedRegExp;	/*aadt("NamedRegExp",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_JustTime;	/*aadt("JustTime",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_JustTime;	/*aadt("JustTime",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ConcretePart;	/*aadt("ConcretePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ConcretePart;	/*aadt("ConcretePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ProdModifier;	/*aadt("ProdModifier",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ProdModifier;	/*aadt("ProdModifier",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Assignable;	/*aadt("Assignable",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Assignable;	/*aadt("Assignable",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_UnicodeEscape;	/*aadt("UnicodeEscape",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_UnicodeEscape;	/*aadt("UnicodeEscape",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_CommonKeywordParameters;	/*aadt("CommonKeywordParameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_CommonKeywordParameters;	/*aadt("CommonKeywordParameters",[],contextFreeSyntax())*/

    public $ConcreteSyntax(RascalExecutionContext rex){
        this(rex, null);
    }
    
    public $ConcreteSyntax(RascalExecutionContext rex, Object extended){
       super(rex);
       this.$me = extended == null ? this : ($ConcreteSyntax_$I)extended;
       ModuleStore mstore = rex.getModuleStore();
       mstore.put(rascal.lang.rascal.grammar.$ConcreteSyntax.class, this);
       
       mstore.importModule(rascal.$IO.class, rex, rascal.$IO::new);
       mstore.importModule(rascal.lang.rascal.grammar.definition.$Productions.class, rex, rascal.lang.rascal.grammar.definition.$Productions::new);
       mstore.importModule(rascal.lang.rascal.grammar.definition.$Symbols.class, rex, rascal.lang.rascal.grammar.definition.$Symbols::new);
       mstore.importModule(rascal.lang.rascal.grammar.definition.$Regular.class, rex, rascal.lang.rascal.grammar.definition.$Regular::new);
       mstore.importModule(rascal.$ParseTree.class, rex, rascal.$ParseTree::new);
       mstore.importModule(rascal.lang.rascal.syntax.$Rascal.class, rex, rascal.lang.rascal.syntax.$Rascal::new);
       mstore.importModule(rascal.lang.rascal.grammar.definition.$Literals.class, rex, rascal.lang.rascal.grammar.definition.$Literals::new);
       mstore.importModule(rascal.$ValueIO.class, rex, rascal.$ValueIO::new);
       mstore.importModule(rascal.$Type.class, rex, rascal.$Type::new);
       mstore.importModule(rascal.analysis.diff.edits.$FileSystemChanges.class, rex, rascal.analysis.diff.edits.$FileSystemChanges::new);
       mstore.importModule(rascal.$List.class, rex, rascal.$List::new);
       mstore.importModule(rascal.$Grammar.class, rex, rascal.$Grammar::new);
       mstore.importModule(rascal.$Message.class, rex, rascal.$Message::new); 
       
       M_IO = mstore.getModule(rascal.$IO.class);
       M_lang_rascal_grammar_definition_Productions = mstore.getModule(rascal.lang.rascal.grammar.definition.$Productions.class);
       M_lang_rascal_grammar_definition_Symbols = mstore.getModule(rascal.lang.rascal.grammar.definition.$Symbols.class);
       M_lang_rascal_grammar_definition_Regular = mstore.getModule(rascal.lang.rascal.grammar.definition.$Regular.class);
       M_ParseTree = mstore.getModule(rascal.$ParseTree.class);
       M_lang_rascal_syntax_Rascal = mstore.getModule(rascal.lang.rascal.syntax.$Rascal.class);
       M_lang_rascal_grammar_definition_Literals = mstore.getModule(rascal.lang.rascal.grammar.definition.$Literals.class);
       M_ValueIO = mstore.getModule(rascal.$ValueIO.class);
       M_Type = mstore.getModule(rascal.$Type.class);
       M_analysis_diff_edits_FileSystemChanges = mstore.getModule(rascal.analysis.diff.edits.$FileSystemChanges.class);
       M_List = mstore.getModule(rascal.$List.class);
       M_Grammar = mstore.getModule(rascal.$Grammar.class);
       M_Message = mstore.getModule(rascal.$Message.class); 
       
                          
       
       $TS.importStore(M_IO.$TS);
       $TS.importStore(M_lang_rascal_grammar_definition_Productions.$TS);
       $TS.importStore(M_lang_rascal_grammar_definition_Symbols.$TS);
       $TS.importStore(M_lang_rascal_grammar_definition_Regular.$TS);
       $TS.importStore(M_ParseTree.$TS);
       $TS.importStore(M_lang_rascal_syntax_Rascal.$TS);
       $TS.importStore(M_lang_rascal_grammar_definition_Literals.$TS);
       $TS.importStore(M_ValueIO.$TS);
       $TS.importStore(M_Type.$TS);
       $TS.importStore(M_analysis_diff_edits_FileSystemChanges.$TS);
       $TS.importStore(M_List.$TS);
       $TS.importStore(M_Grammar.$TS);
       $TS.importStore(M_Message.$TS);
       
       $constants = readBinaryConstantsFile(this.getClass(), "rascal/lang/rascal/grammar/$ConcreteSyntax.constants", 12, "a879f06accc59e7b8a3cbc72e7ea7198");
       NT_Replacement = $sort("Replacement");
       ADT_Replacement = $adt("Replacement");
       NT_Strategy = $sort("Strategy");
       ADT_Strategy = $adt("Strategy");
       NT_MidStringChars = $lex("MidStringChars");
       ADT_MidStringChars = $adt("MidStringChars");
       NT_LocalVariableDeclaration = $sort("LocalVariableDeclaration");
       ADT_LocalVariableDeclaration = $adt("LocalVariableDeclaration");
       ADT_Attr = $adt("Attr");
       NT_ProtocolChars = $lex("ProtocolChars");
       ADT_ProtocolChars = $adt("ProtocolChars");
       NT_Expression = $sort("Expression");
       ADT_Expression = $adt("Expression");
       ADT_Tree = $adt("Tree");
       NT_LAYOUT = $lex("LAYOUT");
       ADT_LAYOUT = $adt("LAYOUT");
       ADT_IOCapability = $adt("IOCapability");
       NT_Name = $lex("Name");
       ADT_Name = $adt("Name");
       NT_TagString = $lex("TagString");
       ADT_TagString = $adt("TagString");
       NT_Variable = $sort("Variable");
       ADT_Variable = $adt("Variable");
       NT_FunctionType = $sort("FunctionType");
       ADT_FunctionType = $adt("FunctionType");
       NT_Visibility = $sort("Visibility");
       ADT_Visibility = $adt("Visibility");
       NT_PostProtocolChars = $lex("PostProtocolChars");
       ADT_PostProtocolChars = $adt("PostProtocolChars");
       NT_Range = $sort("Range");
       ADT_Range = $adt("Range");
       NT_Concrete = $lex("Concrete");
       ADT_Concrete = $adt("Concrete");
       NT_Pattern = $sort("Pattern");
       ADT_Pattern = $adt("Pattern");
       NT_DatePart = $lex("DatePart");
       ADT_DatePart = $adt("DatePart");
       NT_Output = $lex("Output");
       ADT_Output = $adt("Output");
       NT_RationalLiteral = $lex("RationalLiteral");
       ADT_RationalLiteral = $adt("RationalLiteral");
       NT_RegExpLiteral = $lex("RegExpLiteral");
       ADT_RegExpLiteral = $adt("RegExpLiteral");
       ADT_Item = $adt("Item");
       ADT_GrammarModule = $adt("GrammarModule");
       NT_RegExpModifier = $lex("RegExpModifier");
       ADT_RegExpModifier = $adt("RegExpModifier");
       NT_Prod = $sort("Prod");
       ADT_Prod = $adt("Prod");
       NT_ModuleParameters = $sort("ModuleParameters");
       ADT_ModuleParameters = $adt("ModuleParameters");
       NT_OptionalTerminator = $lex("OptionalTerminator");
       ADT_OptionalTerminator = $adt("OptionalTerminator");
       NT_Case = $sort("Case");
       ADT_Case = $adt("Case");
       NT_ImportedModule = $sort("ImportedModule");
       ADT_ImportedModule = $adt("ImportedModule");
       NT_BooleanLiteral = $lex("BooleanLiteral");
       ADT_BooleanLiteral = $adt("BooleanLiteral");
       NT_Declarator = $sort("Declarator");
       ADT_Declarator = $adt("Declarator");
       NT_SyntaxDefinition = $sort("SyntaxDefinition");
       ADT_SyntaxDefinition = $adt("SyntaxDefinition");
       NT_IntegerLiteral = $sort("IntegerLiteral");
       ADT_IntegerLiteral = $adt("IntegerLiteral");
       NT_Target = $sort("Target");
       ADT_Target = $adt("Target");
       NT_TimePartNoTZ = $lex("TimePartNoTZ");
       ADT_TimePartNoTZ = $adt("TimePartNoTZ");
       NT_Renaming = $sort("Renaming");
       ADT_Renaming = $adt("Renaming");
       NT_KeywordFormals = $sort("KeywordFormals");
       ADT_KeywordFormals = $adt("KeywordFormals");
       NT_Catch = $sort("Catch");
       ADT_Catch = $adt("Catch");
       ADT_Production = $adt("Production");
       NT_OptionalExpression = $sort("OptionalExpression");
       ADT_OptionalExpression = $adt("OptionalExpression");
       NT_Renamings = $sort("Renamings");
       ADT_Renamings = $adt("Renamings");
       NT_DataTarget = $sort("DataTarget");
       ADT_DataTarget = $adt("DataTarget");
       ADT_GrammarDefinition = $adt("GrammarDefinition");
       NT_PostStringChars = $lex("PostStringChars");
       ADT_PostStringChars = $adt("PostStringChars");
       NT_Field = $sort("Field");
       ADT_Field = $adt("Field");
       NT_LocationLiteral = $sort("LocationLiteral");
       ADT_LocationLiteral = $adt("LocationLiteral");
       NT_Tag = $sort("Tag");
       ADT_Tag = $adt("Tag");
       NT_Type = $sort("Type");
       ADT_Type = $adt("Type");
       NT_TimeZonePart = $lex("TimeZonePart");
       ADT_TimeZonePart = $adt("TimeZonePart");
       NT_HexIntegerLiteral = $lex("HexIntegerLiteral");
       ADT_HexIntegerLiteral = $adt("HexIntegerLiteral");
       NT_ShellCommand = $sort("ShellCommand");
       ADT_ShellCommand = $adt("ShellCommand");
       NT_FunctionBody = $sort("FunctionBody");
       ADT_FunctionBody = $adt("FunctionBody");
       NT_Declaration = $sort("Declaration");
       ADT_Declaration = $adt("Declaration");
       ADT_Symbol = $adt("Symbol");
       NT_StringLiteral = $sort("StringLiteral");
       ADT_StringLiteral = $adt("StringLiteral");
       NT_PreStringChars = $lex("PreStringChars");
       ADT_PreStringChars = $adt("PreStringChars");
       NT_TypeArg = $sort("TypeArg");
       ADT_TypeArg = $adt("TypeArg");
       NT_NonterminalLabel = $lex("NonterminalLabel");
       ADT_NonterminalLabel = $adt("NonterminalLabel");
       NT_Bound = $sort("Bound");
       ADT_Bound = $adt("Bound");
       NT_Nonterminal = $lex("Nonterminal");
       ADT_Nonterminal = $adt("Nonterminal");
       NT_RegExp = $lex("RegExp");
       ADT_RegExp = $adt("RegExp");
       NT_Tags = $sort("Tags");
       ADT_Tags = $adt("Tags");
       NT_PathPart = $sort("PathPart");
       ADT_PathPart = $adt("PathPart");
       NT_Class = $sort("Class");
       ADT_Class = $adt("Class");
       ADT_Associativity = $adt("Associativity");
       NT_Signature = $sort("Signature");
       ADT_Signature = $adt("Signature");
       ADT_FileSystemChange = $adt("FileSystemChange");
       NT_ModuleActuals = $sort("ModuleActuals");
       ADT_ModuleActuals = $adt("ModuleActuals");
       NT_URLChars = $lex("URLChars");
       ADT_URLChars = $adt("URLChars");
       ADT_Condition = $adt("Condition");
       NT_KeywordFormal = $sort("KeywordFormal");
       ADT_KeywordFormal = $adt("KeywordFormal");
       NT_DataTypeSelector = $sort("DataTypeSelector");
       ADT_DataTypeSelector = $adt("DataTypeSelector");
       NT_Start = $sort("Start");
       ADT_Start = $adt("Start");
       NT_OptionalComma = $lex("OptionalComma");
       ADT_OptionalComma = $adt("OptionalComma");
       NT_PrePathChars = $lex("PrePathChars");
       ADT_PrePathChars = $adt("PrePathChars");
       NT_StringConstant = $lex("StringConstant");
       ADT_StringConstant = $adt("StringConstant");
       NT_DateAndTime = $lex("DateAndTime");
       ADT_DateAndTime = $adt("DateAndTime");
       NT_OptionalEqualSign = $lex("OptionalEqualSign");
       ADT_OptionalEqualSign = $adt("OptionalEqualSign");
       NT_Backslash = $lex("Backslash");
       ADT_Backslash = $adt("Backslash");
       NT_Char = $lex("Char");
       ADT_Char = $adt("Char");
       NT_StringTail = $sort("StringTail");
       ADT_StringTail = $adt("StringTail");
       NT_Header = $sort("Header");
       ADT_Header = $adt("Header");
       NT_JustDate = $lex("JustDate");
       ADT_JustDate = $adt("JustDate");
       NT_Assignment = $sort("Assignment");
       ADT_Assignment = $adt("Assignment");
       ADT_Exception = $adt("Exception");
       NT_PatternWithAction = $sort("PatternWithAction");
       ADT_PatternWithAction = $adt("PatternWithAction");
       NT_FunctionDeclaration = $sort("FunctionDeclaration");
       ADT_FunctionDeclaration = $adt("FunctionDeclaration");
       NT_CaseInsensitiveStringConstant = $lex("CaseInsensitiveStringConstant");
       ADT_CaseInsensitiveStringConstant = $adt("CaseInsensitiveStringConstant");
       NT_Body = $sort("Body");
       ADT_Body = $adt("Body");
       NT_Variant = $sort("Variant");
       ADT_Variant = $adt("Variant");
       NT_UserType = $sort("UserType");
       ADT_UserType = $adt("UserType");
       NT_Import = $sort("Import");
       ADT_Import = $adt("Import");
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
       NT_RealLiteral = $lex("RealLiteral");
       ADT_RealLiteral = $adt("RealLiteral");
       NT_TypeVar = $sort("TypeVar");
       ADT_TypeVar = $adt("TypeVar");
       NT_Formals = $sort("Formals");
       ADT_Formals = $adt("Formals");
       ADT_CharRange = $adt("CharRange");
       NT_QualifiedName = $sort("QualifiedName");
       ADT_QualifiedName = $adt("QualifiedName");
       NT_MidPathChars = $lex("MidPathChars");
       ADT_MidPathChars = $adt("MidPathChars");
       ADT_HorizontalSpace = $layouts("HorizontalSpace");
       NT_NamedBackslash = $lex("NamedBackslash");
       ADT_NamedBackslash = $adt("NamedBackslash");
       ADT_RascalKeywords = $keywords("RascalKeywords");
       NT_Parameters = $sort("Parameters");
       ADT_Parameters = $adt("Parameters");
       NT_MidProtocolChars = $lex("MidProtocolChars");
       ADT_MidProtocolChars = $adt("MidProtocolChars");
       NT_Command = $sort("Command");
       ADT_Command = $adt("Command");
       NT_StructuredType = $sort("StructuredType");
       ADT_StructuredType = $adt("StructuredType");
       NT_OctalIntegerLiteral = $lex("OctalIntegerLiteral");
       ADT_OctalIntegerLiteral = $adt("OctalIntegerLiteral");
       NT_ProtocolPart = $sort("ProtocolPart");
       ADT_ProtocolPart = $adt("ProtocolPart");
       NT_StringTemplate = $sort("StringTemplate");
       ADT_StringTemplate = $adt("StringTemplate");
       NT_Assoc = $sort("Assoc");
       ADT_Assoc = $adt("Assoc");
       ADT_RuntimeException = $adt("RuntimeException");
       NT_DecimalIntegerLiteral = $lex("DecimalIntegerLiteral");
       ADT_DecimalIntegerLiteral = $adt("DecimalIntegerLiteral");
       NT_Kind = $sort("Kind");
       ADT_Kind = $adt("Kind");
       NT_DateTimeLiteral = $sort("DateTimeLiteral");
       ADT_DateTimeLiteral = $adt("DateTimeLiteral");
       NT_Label = $sort("Label");
       ADT_Label = $adt("Label");
       NT_PreProtocolChars = $lex("PreProtocolChars");
       ADT_PreProtocolChars = $adt("PreProtocolChars");
       NT_PathTail = $sort("PathTail");
       ADT_PathTail = $adt("PathTail");
       NT_PathChars = $lex("PathChars");
       ADT_PathChars = $adt("PathChars");
       NT_Toplevel = $sort("Toplevel");
       ADT_Toplevel = $adt("Toplevel");
       NT_EvalCommand = $sort("EvalCommand");
       ADT_EvalCommand = $adt("EvalCommand");
       NT_PostPathChars = $lex("PostPathChars");
       ADT_PostPathChars = $adt("PostPathChars");
       NT_FunctionModifier = $sort("FunctionModifier");
       ADT_FunctionModifier = $adt("FunctionModifier");
       NT_Module = $sort("Module");
       ADT_Module = $adt("Module");
       NT_Sym = $sort("Sym");
       ADT_Sym = $adt("Sym");
       NT_StringCharacter = $lex("StringCharacter");
       ADT_StringCharacter = $adt("StringCharacter");
       NT_Literal = $sort("Literal");
       ADT_Literal = $adt("Literal");
       NT_Statement = $sort("Statement");
       ADT_Statement = $adt("Statement");
       NT_ProtocolTail = $sort("ProtocolTail");
       ADT_ProtocolTail = $adt("ProtocolTail");
       NT_BasicType = $sort("BasicType");
       ADT_BasicType = $adt("BasicType");
       NT_Commands = $sort("Commands");
       ADT_Commands = $adt("Commands");
       NT_Visit = $sort("Visit");
       ADT_Visit = $adt("Visit");
       NT_Comment = $lex("Comment");
       ADT_Comment = $adt("Comment");
       NT_NamedRegExp = $lex("NamedRegExp");
       ADT_NamedRegExp = $adt("NamedRegExp");
       NT_JustTime = $lex("JustTime");
       ADT_JustTime = $adt("JustTime");
       NT_ConcretePart = $lex("ConcretePart");
       ADT_ConcretePart = $adt("ConcretePart");
       NT_ProdModifier = $sort("ProdModifier");
       ADT_ProdModifier = $adt("ProdModifier");
       NT_Assignable = $sort("Assignable");
       ADT_Assignable = $adt("Assignable");
       NT_UnicodeEscape = $lex("UnicodeEscape");
       ADT_UnicodeEscape = $adt("UnicodeEscape");
       NT_CommonKeywordParameters = $sort("CommonKeywordParameters");
       ADT_CommonKeywordParameters = $adt("CommonKeywordParameters");
       $T8 = $TF.valueType();
       $T14 = $TF.parameterType("A", $T8);
       $T6 = $TF.integerType();
       $T10 = $TF.stringType();
       $T4 = $TF.voidType();
       $T9 = $TF.parameterType("T", $T8);
       $T2 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")));
       NT_Mapping_Expression = $parameterizedSort("Mapping", new Type[] { ADT_Expression }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Expression"))));
       $T12 = $TF.parameterType("T", ADT_Tree);
       NT_KeywordArguments_1 = $parameterizedSort("KeywordArguments", new Type[] { $T12 }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Parameter, $RVF.string("T"), $RVF.constructor(RascalValueFactory.Symbol_Adt, $RVF.string("Tree"), $RVF.list()))));
       NT_Mapping_Pattern = $parameterizedSort("Mapping", new Type[] { ADT_Pattern }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Pattern"))));
       ADT_TreeSearchResult_Tree = $parameterizedAdt("TreeSearchResult", new Type[] { ADT_Tree });
       $T13 = $TF.parameterType("T", ADT_Tree);
       NT_Mapping_1 = $parameterizedSort("Mapping", new Type[] { $T12 }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Parameter, $RVF.string("T"), $RVF.constructor(RascalValueFactory.Symbol_Adt, $RVF.string("Tree"), $RVF.list()))));
       NT_KeywordArguments_Expression = $parameterizedSort("KeywordArguments", new Type[] { ADT_Expression }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Expression"))));
       ADT_Maybe_1 = $parameterizedAdt("Maybe", new Type[] { $T14 });
       ADT_Maybe_Attr = $parameterizedAdt("Maybe", new Type[] { ADT_Attr });
       $T7 = $TF.listType($T9);
       NT_KeywordArguments_Pattern = $parameterizedSort("KeywordArguments", new Type[] { ADT_Pattern }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Pattern"))));
       ADT_TreeSearchResult_void = $parameterizedAdt("TreeSearchResult", new Type[] { $T4 });
       NT_KeywordArgument_1 = $parameterizedSort("KeywordArgument", new Type[] { $T12 }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Parameter, $RVF.string("T"), $RVF.constructor(RascalValueFactory.Symbol_Adt, $RVF.string("Tree"), $RVF.list()))));
       ADT_Maybe_Symbol = $parameterizedAdt("Maybe", new Type[] { ADT_Symbol });
       ADT_Maybe_Associativity = $parameterizedAdt("Maybe", new Type[] { ADT_Associativity });
       $T3 = $TF.setType(ADT_Symbol);
       $T5 = $TF.setType(ADT_Production);
       ADT_TreeSearchResult_1 = $parameterizedAdt("TreeSearchResult", new Type[] { $T12 });
       $T11 = $TF.listType(ADT_Symbol);
       $T1 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Expression")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       ADT_Maybe_void = $parameterizedAdt("Maybe", new Type[] { $T4 });
       $T0 = $TF.setType(ADT_Condition);
       ADT_Mapping_Expression = $TF.abstractDataType($TS, "Mapping", new Type[] { ADT_Expression });
       ADT_KeywordArguments_1 = $TF.abstractDataType($TS, "KeywordArguments", new Type[] { $T12 });
       ADT_Mapping_Pattern = $TF.abstractDataType($TS, "Mapping", new Type[] { ADT_Pattern });
       ADT_Mapping_1 = $TF.abstractDataType($TS, "Mapping", new Type[] { $T12 });
       ADT_KeywordArguments_Expression = $TF.abstractDataType($TS, "KeywordArguments", new Type[] { ADT_Expression });
       ADT_KeywordArguments_Pattern = $TF.abstractDataType($TS, "KeywordArguments", new Type[] { ADT_Pattern });
       ADT_KeywordArgument_1 = $TF.abstractDataType($TS, "KeywordArgument", new Type[] { $T12 });
       TreeSearchResult_Tree_treeFound_Tree = $TF.constructor($TS, ADT_TreeSearchResult_Tree, "treeFound", M_ParseTree.ADT_Tree, "tree");
       Maybe_Attr_just_Attr = $TF.constructor($TS, ADT_Maybe_Attr, "just", M_Type.ADT_Attr, "val");
       Maybe_Symbol_just_Symbol = $TF.constructor($TS, ADT_Maybe_Symbol, "just", M_Type.ADT_Symbol, "val");
       Maybe_Associativity_just_Associativity = $TF.constructor($TS, ADT_Maybe_Associativity, "just", M_ParseTree.ADT_Associativity, "val");
    
       
       
    }
    public IBool quotable(IValue $P0){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol)){
         $result = (IBool)quotable$4d07feb9232ca481((IConstructor) $P0);
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
    public IConstructor choice(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IConstructor) M_Type.choice($P0, $P1);
    }
    public IValue max(IValue $P0){ // Generated by Resolver
       return (IValue) M_List.max($P0);
    }
    public IConstructor priority(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IConstructor) M_ParseTree.priority($P0, $P1);
    }
    public INode conditional(IValue $P0, IValue $P1){ // Generated by Resolver
       INode $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol) && $isSubtypeOf($P1Type,$T0)){
         $result = (INode)M_lang_rascal_grammar_definition_Symbols.conditional$f76d16966a8bef69((IConstructor) $P0, (ISet) $P1);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol) && $isSubtypeOf($P1Type,$T0)){
         $result = (INode)M_lang_rascal_grammar_definition_Symbols.conditional$a6b35eeaa096c9bf((IConstructor) $P0, (ISet) $P1);
         if($result != null) return $result;
         return $RVF.constructor(M_ParseTree.Symbol_conditional_Symbol_set_Condition, new IValue[]{(IConstructor) $P0, (ISet) $P1});
       }
       if($isNonTerminal($P0Type, M_lang_rascal_syntax_Rascal.NT_Expression) && $isSubtypeOf($P1Type,$T1)){
         return $RVF.constructor(M_lang_rascal_syntax_Rascal.Replacement_conditional_Expression_iter_seps_Expression, new IValue[]{(ITree) $P0, (ITree) $P1});
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IConstructor grammar(IValue $P0){ // Generated by Resolver
       return (IConstructor) M_Grammar.grammar($P0);
    }
    public IConstructor grammar(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IConstructor) M_Grammar.grammar($P0, $P1);
    }
    public IBool isList(IValue $P0){ // Generated by Resolver
       return (IBool) M_lang_rascal_grammar_definition_Regular.isList($P0);
    }
    public IConstructor alt(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T3)){
         $result = (IConstructor)M_lang_rascal_grammar_definition_Symbols.alt$aa65059e487d6ff2((ISet) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T3)){
         return $RVF.constructor(M_ParseTree.Symbol_alt_set_Symbol, new IValue[]{(ISet) $P0});
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IBool equivalent(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IBool) M_Type.equivalent($P0, $P1);
    }
    public IConstructor denormalize(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol)){
         $result = (IConstructor)denormalize$cc07ea414fba2028((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IConstructor toCompanionList(IValue $P0){ // Generated by Resolver
       return (IConstructor) M_lang_rascal_grammar_definition_Regular.toCompanionList($P0);
    }
    public IList tail(IValue $P0){ // Generated by Resolver
       return (IList) M_List.tail($P0);
    }
    public ITuple headTail(IValue $P0){ // Generated by Resolver
       return (ITuple) M_List.headTail($P0);
    }
    public IConstructor removeConditionals(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol)){
         $result = (IConstructor)removeConditionals$cf3b4d99cf536e70((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IConstructor treeAt(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       return (IConstructor) M_ParseTree.treeAt($P0, $P1, $P2);
    }
    public IBool isRegular(IValue $P0){ // Generated by Resolver
       return (IBool) M_lang_rascal_grammar_definition_Regular.isRegular($P0);
    }
    public IConstructor addHoles(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_Grammar.ADT_Grammar)){
         $result = (IConstructor)addHoles$85105b4042bdb599((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public ISet holes(IValue $P0){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_Grammar.ADT_Grammar)){
         $result = (ISet)holes$a648980fab61dfce((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IBool intersects(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IBool) M_Type.intersects($P0, $P1);
    }
    public IConstructor strip(IValue $P0){ // Generated by Resolver
       return (IConstructor) M_lang_rascal_grammar_definition_Symbols.strip($P0);
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
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol) && $isSubtypeOf($P1Type, M_ParseTree.ADT_Associativity) && $isSubtypeOf($P2Type,$T5)){
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
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol) && $isSubtypeOf($P1Type, M_ParseTree.ADT_Associativity) && $isSubtypeOf($P2Type,$T5)){
         return $RVF.constructor(M_ParseTree.Production_associativity_Symbol_Associativity_set_Production, new IValue[]{(IConstructor) $P0, (IConstructor) $P1, (ISet) $P2});
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IString createHole(IValue $P0, IValue $P1){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isNonTerminal($P0Type, ((IConstructor)$constants.get(0)/*lex("ConcretePart")*/)) && $isSubtypeOf($P1Type,$T6)){
         $result = (IString)createHole$73c4bc2ae3b2c484((ITree) $P0, (IInteger) $P1);
         if($result != null) return $result;
       }
       if($isNonTerminal($P0Type, M_lang_rascal_syntax_Rascal.NT_ConcreteHole) && $isSubtypeOf($P1Type,$T6)){
         $result = (IString)createHole$c4ee71e0413856a8((ITree) $P0, (IInteger) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IValue glb(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IValue) M_Type.glb($P0, $P1);
    }
    public IValue sort(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T7)){
         $result = (IValue)M_List.sort$fa0b19c35a18e804((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T10)){
         return $RVF.constructor(M_ParseTree.Symbol_sort_str, new IValue[]{(IString) $P0});
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList sort(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.sort($P0, $P1);
    }
    public IConstructor seq(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T11)){
         $result = (IConstructor)M_lang_rascal_grammar_definition_Symbols.seq$0a415a2b58bb9727((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T11)){
         return $RVF.constructor(M_ParseTree.Symbol_seq_list_Symbol, new IValue[]{(IList) $P0});
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IConstructor getTargetSymbol(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol)){
         $result = (IConstructor)getTargetSymbol$64b6d67354a52f40((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }

    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ConcreteSyntax.rsc|(885,86,<23,0>,<23,86>) 
    public IConstructor addHoles$85105b4042bdb599(IConstructor object_0){ 
        
        
        return ((IConstructor)(M_Grammar.compose(((IConstructor)object_0), ((IConstructor)(M_Grammar.grammar(((ISet)$constants.get(1)/*{}*/), ((ISet)($me.holes(((IConstructor)object_0))))))))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ConcreteSyntax.rsc|(975,2261,<25,0>,<55,1>) 
    public ISet holes$a648980fab61dfce(IConstructor object_0){ 
        
        
        final ISetWriter $setwriter0 = (ISetWriter)$RVF.setWriter();
        ;
        $SCOMP1_GEN3178:
        for(IValue $elem3_for : ((IMap)(((IMap)($aadt_get_field(((IConstructor)object_0), "rules")))))){
            IConstructor $elem3 = (IConstructor) $elem3_for;
            if(true){
               IConstructor nont_1 = ((IConstructor)($elem3));
               if((((IBool)($me.quotable(((IConstructor)nont_1))))).getValue()){
                 $setwriter0.insert(((IConstructor)$constants.get(2)/*regular(iter(\char-class([range(48,57)])))*/));
                 final Template $template2 = (Template)new Template($RVF, "");
                 $template2.addVal($me.removeConditionals(((IConstructor)($me.denormalize(((IConstructor)nont_1))))));
                 $setwriter0.insert($RVF.constructor(M_ParseTree.Production_prod_Symbol_list_Symbol_set_Attr, new IValue[]{((IConstructor)($RVF.constructor(M_Type.Symbol_label_str_Symbol, new IValue[]{((IString)$constants.get(5)/*"$MetaHole"*/), ((IConstructor)($me.getTargetSymbol(((IConstructor)nont_1))))}))), ((IList)($RVF.list(((IConstructor)$constants.get(6)/*\char-class([range(0,0)])*/), $RVF.constructor(M_ParseTree.Symbol_lit_str, new IValue[]{((IString)($template2.close()))}), ((IConstructor)$constants.get(7)/*lit(":")*/), ((IConstructor)$constants.get(4)/*iter(\char-class([range(48,57)]))*/), ((IConstructor)$constants.get(6)/*\char-class([range(0,0)])*/)))), ((ISet)($RVF.set(((IConstructor)($RVF.constructor(M_Type.Attr_tag_value, new IValue[]{((IValue)($RVF.node(((IString)(((IString)$constants.get(8)/*"holeType"*/))).getValue(), new IValue[] { nont_1 }, Util.kwpMap())))}))))))}));
               
               } else {
                 continue $SCOMP1_GEN3178;
               }
            
            } else {
               continue $SCOMP1_GEN3178;
            }
        }
        
                    return ((ISet)($setwriter0.done()));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ConcreteSyntax.rsc|(3240,238,<57,0>,<59,72>) 
    public IString createHole$73c4bc2ae3b2c484(ITree hole_0, IInteger idx_1){ 
        
        
        return ((IString)($me.createHole(((ITree)(((ITree)($aadt_get_field(((ITree)hole_0), "hole"))))), ((IInteger)idx_1))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ConcreteSyntax.rsc|(3480,109,<60,0>,<61,65>) 
    public IString createHole$c4ee71e0413856a8(ITree hole_0, IInteger idx_1){ 
        
        
        final Template $template4 = (Template)new Template($RVF, " ");
        $template4.beginIndent("      ");
        $template4.addVal($me.denormalize(((IConstructor)(M_lang_rascal_grammar_definition_Symbols.sym2symbol(((ITree)(((ITree)($aadt_get_field(((IConstructor)hole_0), "symbol"))))), Util.kwpMap())))));
        $template4.endIndent("      ");
        $template4.addStr(":");
        $template4.beginIndent(" ");
        $template4.addVal(idx_1);
        $template4.endIndent(" ");
        $template4.addStr(" ");
        return ((IString)($template4.close()));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ConcreteSyntax.rsc|(3593,1020,<63,0>,<79,8>) 
    public IConstructor denormalize$cc07ea414fba2028(IConstructor s_0){ 
        
        
        try {
            IValue $visitResult = $TRAVERSE.traverse(DIRECTION.BottomUp, PROGRESS.Continuing, FIXEDPOINT.No, REBUILD.Yes, 
                 new DescendantDescriptor(new io.usethesource.vallang.type.Type[]{$TF.listType(ADT_Symbol), M_Type.ADT_Exception, $TF.setType(ADT_Symbol), $TF.setType(ADT_Condition), M_lang_rascal_syntax_Rascal.ADT_KeywordArguments_1, M_ParseTree.ADT_Tree, M_ParseTree.ADT_TreeSearchResult_1, M_ParseTree.ADT_Condition, M_Type.ADT_Production, M_Type.ADT_Symbol, M_Grammar.ADT_Grammar, M_ParseTree.ADT_CharRange, M_Grammar.ADT_Item, M_Grammar.ADT_GrammarModule, $TF.listType(ADT_CharRange), M_Grammar.ADT_GrammarDefinition}, 
                                          new io.usethesource.vallang.IConstructor[]{}, 
                                          $RVF.bool(false)),
                 s_0,
                 (IVisitFunction) (IValue $VISIT0_subject, TraversalState $traversalState) -> {
                     VISIT0:switch(Fingerprint.getFingerprint($VISIT0_subject)){
                     
                         case -964239440:
                             if($isSubtypeOf($VISIT0_subject.getType(),M_Type.ADT_Symbol)){
                                /*muExists*/CASE_964239440_2: 
                                    do {
                                        if($has_type_and_arity($VISIT0_subject, M_ParseTree.Symbol_iter_star_seps_Symbol_list_Symbol, 2)){
                                           IValue $arg0_22 = (IValue)($aadt_subscript_int(((IConstructor)($VISIT0_subject)),0));
                                           if($isComparable($arg0_22.getType(), M_Type.ADT_Symbol)){
                                              ValueRef<IConstructor> u_4 = new ValueRef<IConstructor>();
                                              IValue $arg1_16 = (IValue)($aadt_subscript_int(((IConstructor)($VISIT0_subject)),1));
                                              if($isComparable($arg1_16.getType(), $T11)){
                                                 final IList $subject17 = ((IList)($arg1_16));
                                                 int $subject17_cursor = 0;
                                                 if($isSubtypeOf($subject17.getType(),$T11)){
                                                    final int $subject17_len = (int)((IList)($subject17)).length();
                                                    if($subject17_len == 3){
                                                       final IConstructor $subject20 = ((IConstructor)($alist_subscript_int(((IList)($subject17)),$subject17_cursor)));
                                                       if($has_type_and_arity($subject20, M_ParseTree.Symbol_layouts_str, 1)){
                                                          IValue $arg0_21 = (IValue)($aadt_subscript_int(((IConstructor)($subject20)),0));
                                                          if($isComparable($arg0_21.getType(), $T8)){
                                                             $subject17_cursor += 1;
                                                             if($subject17_cursor < $subject17_len){
                                                                IConstructor t_5 = ((IConstructor)($alist_subscript_int(((IList)($subject17)),$subject17_cursor)));
                                                                $subject17_cursor += 1;
                                                                final IConstructor $subject18 = ((IConstructor)($alist_subscript_int(((IList)($subject17)),$subject17_cursor)));
                                                                if($has_type_and_arity($subject18, M_ParseTree.Symbol_layouts_str, 1)){
                                                                   IValue $arg0_19 = (IValue)($aadt_subscript_int(((IConstructor)($subject18)),0));
                                                                   if($isComparable($arg0_19.getType(), $T8)){
                                                                      $subject17_cursor += 1;
                                                                      if($subject17_cursor == $subject17_len){
                                                                         IConstructor $replacement15 = (IConstructor)($RVF.constructor(M_ParseTree.Symbol_iter_star_seps_Symbol_list_Symbol, new IValue[]{((IConstructor)($arg0_22)), ((IList)($RVF.list(((IConstructor)t_5))))}));
                                                                         if($isSubtypeOf($replacement15.getType(),$VISIT0_subject.getType())){
                                                                            $traversalState.setMatchedAndChanged(true, true);
                                                                            return $replacement15;
                                                                         
                                                                         } else {
                                                                            break VISIT0;// switch
                                                                         
                                                                         }
                                                                      } else {
                                                                         continue CASE_964239440_2;/*list match1*/
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
                             if($isSubtypeOf($VISIT0_subject.getType(),M_Type.ADT_Symbol)){
                                /*muExists*/CASE_964239440_4: 
                                    do {
                                        if($has_type_and_arity($VISIT0_subject, M_ParseTree.Symbol_iter_star_seps_Symbol_list_Symbol, 2)){
                                           IValue $arg0_34 = (IValue)($aadt_subscript_int(((IConstructor)($VISIT0_subject)),0));
                                           if($isComparable($arg0_34.getType(), M_Type.ADT_Symbol)){
                                              ValueRef<IConstructor> u_7 = new ValueRef<IConstructor>();
                                              IValue $arg1_30 = (IValue)($aadt_subscript_int(((IConstructor)($VISIT0_subject)),1));
                                              if($isComparable($arg1_30.getType(), $T11)){
                                                 final IList $subject31 = ((IList)($arg1_30));
                                                 int $subject31_cursor = 0;
                                                 if($isSubtypeOf($subject31.getType(),$T11)){
                                                    final int $subject31_len = (int)((IList)($subject31)).length();
                                                    if($subject31_len == 1){
                                                       final IConstructor $subject32 = ((IConstructor)($alist_subscript_int(((IList)($subject31)),$subject31_cursor)));
                                                       if($has_type_and_arity($subject32, M_ParseTree.Symbol_layouts_str, 1)){
                                                          IValue $arg0_33 = (IValue)($aadt_subscript_int(((IConstructor)($subject32)),0));
                                                          if($isComparable($arg0_33.getType(), $T8)){
                                                             $subject31_cursor += 1;
                                                             if($subject31_cursor == $subject31_len){
                                                                IConstructor $replacement29 = (IConstructor)($RVF.constructor(M_ParseTree.Symbol_iter_star_Symbol, new IValue[]{((IConstructor)($arg0_34))}));
                                                                if($isSubtypeOf($replacement29.getType(),$VISIT0_subject.getType())){
                                                                   $traversalState.setMatchedAndChanged(true, true);
                                                                   return $replacement29;
                                                                
                                                                } else {
                                                                   break VISIT0;// switch
                                                                
                                                                }
                                                             } else {
                                                                continue CASE_964239440_4;/*list match1*/
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
            
                     
                         case 856312:
                             if($isSubtypeOf($VISIT0_subject.getType(),M_Type.ADT_Symbol)){
                                /*muExists*/CASE_856312_0: 
                                    do {
                                        if($has_type_and_arity($VISIT0_subject, M_ParseTree.Symbol_lex_str, 1)){
                                           IValue $arg0_6 = (IValue)($aadt_subscript_int(((IConstructor)($VISIT0_subject)),0));
                                           if($isComparable($arg0_6.getType(), $T10)){
                                              ValueRef<IString> n_1 = new ValueRef<IString>();
                                              IConstructor $replacement5 = (IConstructor)($RVF.constructor(M_ParseTree.Symbol_sort_str, new IValue[]{((IString)($arg0_6))}));
                                              if($isSubtypeOf($replacement5.getType(),$VISIT0_subject.getType())){
                                                 $traversalState.setMatchedAndChanged(true, true);
                                                 return $replacement5;
                                              
                                              } else {
                                                 break VISIT0;// switch
                                              
                                              }
                                           }
                                        
                                        }
                                
                                    } while(false);
                             
                             }
            
                     
                         case 910072:
                             if($isSubtypeOf($VISIT0_subject.getType(),M_Type.ADT_Symbol)){
                                /*muExists*/CASE_910072_5: 
                                    do {
                                        if($has_type_and_arity($VISIT0_subject, M_ParseTree.Symbol_seq_list_Symbol, 1)){
                                           IValue $arg0_39 = (IValue)($aadt_subscript_int(((IConstructor)($VISIT0_subject)),0));
                                           if($isComparable($arg0_39.getType(), $T11)){
                                              ValueRef<IList> ss_8 = new ValueRef<IList>();
                                              final IListWriter $listwriter36 = (IListWriter)$RVF.listWriter();
                                              $LCOMP37_GEN4577:
                                              for(IValue $elem38_for : ((IList)($arg0_39))){
                                                  IConstructor $elem38 = (IConstructor) $elem38_for;
                                                  ValueRef<IConstructor> t_9 = new ValueRef<IConstructor>();
                                                  if($is(((IConstructor)($elem38)),((IString)$constants.get(9)/*"layouts"*/))){
                                                    continue $LCOMP37_GEN4577;
                                                  } else {
                                                    $listwriter36.append($elem38);
                                                  
                                                  }
                                              
                                              }
                                              
                                                          IConstructor $replacement35 = (IConstructor)(seq(((IList)($listwriter36.done()))));
                                              if($isSubtypeOf($replacement35.getType(),$VISIT0_subject.getType())){
                                                 $traversalState.setMatchedAndChanged(true, true);
                                                 return $replacement35;
                                              
                                              } else {
                                                 break VISIT0;// switch
                                              
                                              }
                                           }
                                        
                                        }
                                
                                    } while(false);
                             
                             }
            
                     
                         case 1652184736:
                             if($isSubtypeOf($VISIT0_subject.getType(),M_Type.ADT_Symbol)){
                                /*muExists*/CASE_1652184736_1: 
                                    do {
                                        if($has_type_and_arity($VISIT0_subject, M_ParseTree.Symbol_iter_seps_Symbol_list_Symbol, 2)){
                                           IValue $arg0_14 = (IValue)($aadt_subscript_int(((IConstructor)($VISIT0_subject)),0));
                                           if($isComparable($arg0_14.getType(), M_Type.ADT_Symbol)){
                                              ValueRef<IConstructor> u_2 = new ValueRef<IConstructor>();
                                              IValue $arg1_8 = (IValue)($aadt_subscript_int(((IConstructor)($VISIT0_subject)),1));
                                              if($isComparable($arg1_8.getType(), $T11)){
                                                 final IList $subject9 = ((IList)($arg1_8));
                                                 int $subject9_cursor = 0;
                                                 if($isSubtypeOf($subject9.getType(),$T11)){
                                                    final int $subject9_len = (int)((IList)($subject9)).length();
                                                    if($subject9_len == 3){
                                                       final IConstructor $subject12 = ((IConstructor)($alist_subscript_int(((IList)($subject9)),$subject9_cursor)));
                                                       if($has_type_and_arity($subject12, M_ParseTree.Symbol_layouts_str, 1)){
                                                          IValue $arg0_13 = (IValue)($aadt_subscript_int(((IConstructor)($subject12)),0));
                                                          if($isComparable($arg0_13.getType(), $T8)){
                                                             $subject9_cursor += 1;
                                                             if($subject9_cursor < $subject9_len){
                                                                IConstructor t_3 = ((IConstructor)($alist_subscript_int(((IList)($subject9)),$subject9_cursor)));
                                                                $subject9_cursor += 1;
                                                                final IConstructor $subject10 = ((IConstructor)($alist_subscript_int(((IList)($subject9)),$subject9_cursor)));
                                                                if($has_type_and_arity($subject10, M_ParseTree.Symbol_layouts_str, 1)){
                                                                   IValue $arg0_11 = (IValue)($aadt_subscript_int(((IConstructor)($subject10)),0));
                                                                   if($isComparable($arg0_11.getType(), $T8)){
                                                                      $subject9_cursor += 1;
                                                                      if($subject9_cursor == $subject9_len){
                                                                         IConstructor $replacement7 = (IConstructor)($RVF.constructor(M_ParseTree.Symbol_iter_seps_Symbol_list_Symbol, new IValue[]{((IConstructor)($arg0_14)), ((IList)($RVF.list(((IConstructor)t_3))))}));
                                                                         if($isSubtypeOf($replacement7.getType(),$VISIT0_subject.getType())){
                                                                            $traversalState.setMatchedAndChanged(true, true);
                                                                            return $replacement7;
                                                                         
                                                                         } else {
                                                                            break VISIT0;// switch
                                                                         
                                                                         }
                                                                      } else {
                                                                         continue CASE_1652184736_1;/*list match1*/
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
                             if($isSubtypeOf($VISIT0_subject.getType(),M_Type.ADT_Symbol)){
                                /*muExists*/CASE_1652184736_3: 
                                    do {
                                        if($has_type_and_arity($VISIT0_subject, M_ParseTree.Symbol_iter_seps_Symbol_list_Symbol, 2)){
                                           IValue $arg0_28 = (IValue)($aadt_subscript_int(((IConstructor)($VISIT0_subject)),0));
                                           if($isComparable($arg0_28.getType(), M_Type.ADT_Symbol)){
                                              ValueRef<IConstructor> u_6 = new ValueRef<IConstructor>();
                                              IValue $arg1_24 = (IValue)($aadt_subscript_int(((IConstructor)($VISIT0_subject)),1));
                                              if($isComparable($arg1_24.getType(), $T11)){
                                                 final IList $subject25 = ((IList)($arg1_24));
                                                 int $subject25_cursor = 0;
                                                 if($isSubtypeOf($subject25.getType(),$T11)){
                                                    final int $subject25_len = (int)((IList)($subject25)).length();
                                                    if($subject25_len == 1){
                                                       final IConstructor $subject26 = ((IConstructor)($alist_subscript_int(((IList)($subject25)),$subject25_cursor)));
                                                       if($has_type_and_arity($subject26, M_ParseTree.Symbol_layouts_str, 1)){
                                                          IValue $arg0_27 = (IValue)($aadt_subscript_int(((IConstructor)($subject26)),0));
                                                          if($isComparable($arg0_27.getType(), $T8)){
                                                             $subject25_cursor += 1;
                                                             if($subject25_cursor == $subject25_len){
                                                                IConstructor $replacement23 = (IConstructor)($RVF.constructor(M_ParseTree.Symbol_iter_Symbol, new IValue[]{((IConstructor)($arg0_28))}));
                                                                if($isSubtypeOf($replacement23.getType(),$VISIT0_subject.getType())){
                                                                   $traversalState.setMatchedAndChanged(true, true);
                                                                   return $replacement23;
                                                                
                                                                } else {
                                                                   break VISIT0;// switch
                                                                
                                                                }
                                                             } else {
                                                                continue CASE_1652184736_3;/*list match1*/
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
                     return $VISIT0_subject;
                 });
            return (IConstructor)$visitResult;
        
        } catch (ReturnFromTraversalException e) {
            return (IConstructor) e.getValue();
        }
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ConcreteSyntax.rsc|(4617,200,<81,0>,<83,50>) 
    public IConstructor removeConditionals$cf3b4d99cf536e70(IConstructor sym_0){ 
        
        
        try {
            IValue $visitResult = $TRAVERSE.traverse(DIRECTION.BottomUp, PROGRESS.Continuing, FIXEDPOINT.No, REBUILD.Yes, 
                 new DescendantDescriptor(new io.usethesource.vallang.type.Type[]{$TF.listType(ADT_Symbol), M_Type.ADT_Exception, $TF.setType(ADT_Symbol), $TF.setType(ADT_Condition), M_lang_rascal_syntax_Rascal.ADT_KeywordArguments_1, M_ParseTree.ADT_Tree, M_ParseTree.ADT_TreeSearchResult_1, M_ParseTree.ADT_Condition, M_Type.ADT_Production, M_Type.ADT_Symbol, M_Grammar.ADT_Grammar, M_ParseTree.ADT_CharRange, M_Grammar.ADT_Item, M_Grammar.ADT_GrammarModule, $TF.listType(ADT_CharRange), M_Grammar.ADT_GrammarDefinition}, 
                                          new io.usethesource.vallang.IConstructor[]{}, 
                                          $RVF.bool(false)),
                 sym_0,
                 (IVisitFunction) (IValue $VISIT1_subject, TraversalState $traversalState) -> {
                     VISIT1:switch(Fingerprint.getFingerprint($VISIT1_subject)){
                     
                         case -2144737184:
                             if($isSubtypeOf($VISIT1_subject.getType(),M_Type.ADT_Symbol)){
                                /*muExists*/CASE_2144737184_0: 
                                    do {
                                        if($has_type_and_arity($VISIT1_subject, M_ParseTree.Symbol_conditional_Symbol_set_Condition, 2)){
                                           IValue $arg0_42 = (IValue)($aadt_subscript_int(((IConstructor)($VISIT1_subject)),0));
                                           if($isComparable($arg0_42.getType(), M_Type.ADT_Symbol)){
                                              ValueRef<IConstructor> s_1 = new ValueRef<IConstructor>();
                                              IValue $arg1_41 = (IValue)($aadt_subscript_int(((IConstructor)($VISIT1_subject)),1));
                                              if($isComparable($arg1_41.getType(), $T8)){
                                                 IConstructor $replacement40 = (IConstructor)($arg0_42);
                                                 if($isSubtypeOf($replacement40.getType(),$VISIT1_subject.getType())){
                                                    $traversalState.setMatchedAndChanged(true, true);
                                                    return $replacement40;
                                                 
                                                 } else {
                                                    break VISIT1;// switch
                                                 
                                                 }
                                              }
                                           
                                           }
                                        
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ConcreteSyntax.rsc|(4821,621,<85,0>,<103,1>) 
    public IConstructor getTargetSymbol$64b6d67354a52f40(IConstructor sym_0){ 
        
        
        final IConstructor $switchVal43 = ((IConstructor)sym_0);
        boolean noCaseMatched_$switchVal43 = true;
        SWITCH2: switch(Fingerprint.getFingerprint($switchVal43)){
        
            case -964239440:
                if(noCaseMatched_$switchVal43){
                    noCaseMatched_$switchVal43 = false;
                    if($isSubtypeOf($switchVal43.getType(),M_Type.ADT_Symbol)){
                       /*muExists*/CASE_964239440_3: 
                           do {
                               if($has_type_and_arity($switchVal43, M_ParseTree.Symbol_iter_star_seps_Symbol_list_Symbol, 2)){
                                  IValue $arg0_49 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal43)),0));
                                  if($isComparable($arg0_49.getType(), M_Type.ADT_Symbol)){
                                     IConstructor s_4 = null;
                                     IValue $arg1_48 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal43)),1));
                                     if($isComparable($arg1_48.getType(), $T8)){
                                        return ((IConstructor)($arg0_49));
                                     
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 25942208:
                if(noCaseMatched_$switchVal43){
                    noCaseMatched_$switchVal43 = false;
                    if($isSubtypeOf($switchVal43.getType(),M_Type.ADT_Symbol)){
                       /*muExists*/CASE_25942208_0: 
                           do {
                               if($has_type_and_arity($switchVal43, M_ParseTree.Symbol_iter_Symbol, 1)){
                                  IValue $arg0_44 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal43)),0));
                                  if($isComparable($arg0_44.getType(), M_Type.ADT_Symbol)){
                                     IConstructor s_1 = null;
                                     return ((IConstructor)($arg0_44));
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 882072:
                if(noCaseMatched_$switchVal43){
                    noCaseMatched_$switchVal43 = false;
                    if($isSubtypeOf($switchVal43.getType(),M_Type.ADT_Symbol)){
                       /*muExists*/CASE_882072_4: 
                           do {
                               if($has_type_and_arity($switchVal43, M_ParseTree.Symbol_opt_Symbol, 1)){
                                  IValue $arg0_50 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal43)),0));
                                  if($isComparable($arg0_50.getType(), M_Type.ADT_Symbol)){
                                     IConstructor s_5 = null;
                                     return ((IConstructor)($arg0_50));
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 826203960:
                if(noCaseMatched_$switchVal43){
                    noCaseMatched_$switchVal43 = false;
                    if($isSubtypeOf($switchVal43.getType(),M_Type.ADT_Symbol)){
                       /*muExists*/CASE_826203960_1: 
                           do {
                               if($has_type_and_arity($switchVal43, M_ParseTree.Symbol_iter_star_Symbol, 1)){
                                  IValue $arg0_45 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal43)),0));
                                  if($isComparable($arg0_45.getType(), M_Type.ADT_Symbol)){
                                     IConstructor s_2 = null;
                                     return ((IConstructor)($arg0_45));
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 773448:
                if(noCaseMatched_$switchVal43){
                    noCaseMatched_$switchVal43 = false;
                    if($isSubtypeOf($switchVal43.getType(),M_Type.ADT_Symbol)){
                       /*muExists*/CASE_773448_5: 
                           do {
                               if($has_type_and_arity($switchVal43, M_ParseTree.Symbol_alt_set_Symbol, 1)){
                                  IValue $arg0_53 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal43)),0));
                                  if($isComparable($arg0_53.getType(), $T3)){
                                     ISet $subject54 = (ISet)($arg0_53);
                                     if(((ISet)($subject54)).size() >= 1){
                                        CASE_773448_5_CONS_alt_SET_VARs:
                                        for(IValue $elem60_for : ((ISet)($subject54))){
                                            IConstructor $elem60 = (IConstructor) $elem60_for;
                                            IConstructor s_6 = ((IConstructor)($elem60));
                                            final ISet $subject56 = ((ISet)(((ISet)($subject54)).delete(((IConstructor)s_6))));
                                            if(((ISet)($subject56)).size() >= 1){
                                               CASE_773448_5_CONS_alt_SET_VARs_VAR$_52:
                                               for(IValue $elem58_for : ((ISet)($subject56))){
                                                   IConstructor $elem58 = (IConstructor) $elem58_for;
                                                   final ISet $subject57 = ((ISet)(((ISet)($subject56)).delete(((IConstructor)($elem58)))));
                                                   if(((ISet)($subject57)).size() == 0){
                                                      return ((IConstructor)s_6);
                                                   
                                                   } else {
                                                      continue CASE_773448_5_CONS_alt_SET_VARs_VAR$_52;/*set pat3*/
                                                   }
                                               }
                                               continue CASE_773448_5_CONS_alt_SET_VARs;/*set pat4*/
                                                           
                                            } else {
                                               continue CASE_773448_5_CONS_alt_SET_VARs;/*set pat4*/
                                            }
                                        }
                                        
                                                    
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 1652184736:
                if(noCaseMatched_$switchVal43){
                    noCaseMatched_$switchVal43 = false;
                    if($isSubtypeOf($switchVal43.getType(),M_Type.ADT_Symbol)){
                       /*muExists*/CASE_1652184736_2: 
                           do {
                               if($has_type_and_arity($switchVal43, M_ParseTree.Symbol_iter_seps_Symbol_list_Symbol, 2)){
                                  IValue $arg0_47 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal43)),0));
                                  if($isComparable($arg0_47.getType(), M_Type.ADT_Symbol)){
                                     IConstructor s_3 = null;
                                     IValue $arg1_46 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal43)),1));
                                     if($isComparable($arg1_46.getType(), $T8)){
                                        return ((IConstructor)($arg0_47));
                                     
                                     }
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            default: return ((IConstructor)sym_0);
        }
        
                   
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/ConcreteSyntax.rsc|(5820,1002,<120,0>,<151,1>) 
    public IBool quotable$4d07feb9232ca481(IConstructor x_0){ 
        
        
        final IConstructor $switchVal61 = ((IConstructor)x_0);
        boolean noCaseMatched_$switchVal61 = true;
        SWITCH3: switch(Fingerprint.getFingerprint($switchVal61)){
        
            case 1444258592:
                if(noCaseMatched_$switchVal61){
                    noCaseMatched_$switchVal61 = false;
                    if($isSubtypeOf($switchVal61.getType(),M_Type.ADT_Symbol)){
                       /*muExists*/CASE_1444258592_7: 
                           do {
                               if($has_type_and_arity($switchVal61, M_ParseTree.Symbol_parameterized_sort_str_list_Symbol, 2)){
                                  IValue $arg0_76 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal61)),0));
                                  if($isComparable($arg0_76.getType(), $T8)){
                                     IValue $arg1_70 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal61)),1));
                                     if($isComparable($arg1_70.getType(), $T11)){
                                        final IList $subject71 = ((IList)($arg1_70));
                                        int $subject71_cursor = 0;
                                        if($isSubtypeOf($subject71.getType(),$T11)){
                                           final int $subject71_len = (int)((IList)($subject71)).length();
                                           if($subject71_len >= 1){
                                              final IConstructor $subject73 = ((IConstructor)($alist_subscript_int(((IList)($subject71)),$subject71_cursor)));
                                              if($has_type_and_arity($subject73, M_Type.Symbol_parameter_str_Symbol, 2)){
                                                 IValue $arg0_75 = (IValue)($aadt_subscript_int(((IConstructor)($subject73)),0));
                                                 if($isComparable($arg0_75.getType(), $T8)){
                                                    IValue $arg1_74 = (IValue)($aadt_subscript_int(((IConstructor)($subject73)),1));
                                                    if($isComparable($arg1_74.getType(), $T8)){
                                                       $subject71_cursor += 1;
                                                       final int $__172_start = (int)$subject71_cursor;
                                                       final int $__172_len = (int)$subject71_len - $__172_start - 0;
                                                       $subject71_cursor = $__172_start + $__172_len;
                                                       /*muExists*/CASE_1444258592_7_CONS_parameterized_sort_LIST_CONS_parameter_MVAR$_69: 
                                                           do {
                                                               if($subject71_cursor == $subject71_len){
                                                                  return ((IBool)$constants.get(10)/*false*/);
                                                               
                                                               } else {
                                                                  continue CASE_1444258592_7_CONS_parameterized_sort_LIST_CONS_parameter_MVAR$_69;/*list match1*/
                                                               }
                                                           } while(false);
                                                    
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
                
        
            case 878060304:
                if(noCaseMatched_$switchVal61){
                    noCaseMatched_$switchVal61 = false;
                    if($isSubtypeOf($switchVal61.getType(),M_Type.ADT_Symbol)){
                       /*muExists*/CASE_878060304_6: 
                           do {
                               if($has_type_and_arity($switchVal61, M_ParseTree.Symbol_start_Symbol, 1)){
                                  IValue $arg0_67 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal61)),0));
                                  if($isComparable($arg0_67.getType(), $T8)){
                                     return ((IBool)$constants.get(10)/*false*/);
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 757310344:
                if(noCaseMatched_$switchVal61){
                    noCaseMatched_$switchVal61 = false;
                    if($isSubtypeOf($switchVal61.getType(),M_Type.ADT_Symbol)){
                       /*muExists*/CASE_757310344_2: 
                           do {
                               if($has_type_and_arity($switchVal61, M_ParseTree.Symbol_cilit_str, 1)){
                                  IValue $arg0_63 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal61)),0));
                                  if($isComparable($arg0_63.getType(), $T8)){
                                     return ((IBool)$constants.get(10)/*false*/);
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 1154855088:
                if(noCaseMatched_$switchVal61){
                    noCaseMatched_$switchVal61 = false;
                    if($isSubtypeOf($switchVal61.getType(),M_Type.ADT_Symbol)){
                       /*muExists*/CASE_1154855088_8: 
                           do {
                               if($has_type_and_arity($switchVal61, M_ParseTree.Symbol_parameterized_lex_str_list_Symbol, 2)){
                                  IValue $arg0_85 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal61)),0));
                                  if($isComparable($arg0_85.getType(), $T8)){
                                     IValue $arg1_79 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal61)),1));
                                     if($isComparable($arg1_79.getType(), $T11)){
                                        final IList $subject80 = ((IList)($arg1_79));
                                        int $subject80_cursor = 0;
                                        if($isSubtypeOf($subject80.getType(),$T11)){
                                           final int $subject80_len = (int)((IList)($subject80)).length();
                                           if($subject80_len >= 1){
                                              final IConstructor $subject82 = ((IConstructor)($alist_subscript_int(((IList)($subject80)),$subject80_cursor)));
                                              if($has_type_and_arity($subject82, M_Type.Symbol_parameter_str_Symbol, 2)){
                                                 IValue $arg0_84 = (IValue)($aadt_subscript_int(((IConstructor)($subject82)),0));
                                                 if($isComparable($arg0_84.getType(), $T8)){
                                                    IValue $arg1_83 = (IValue)($aadt_subscript_int(((IConstructor)($subject82)),1));
                                                    if($isComparable($arg1_83.getType(), $T8)){
                                                       $subject80_cursor += 1;
                                                       final int $__181_start = (int)$subject80_cursor;
                                                       final int $__181_len = (int)$subject80_len - $__181_start - 0;
                                                       $subject80_cursor = $__181_start + $__181_len;
                                                       /*muExists*/CASE_1154855088_8_CONS_parameterized_lex_LIST_CONS_parameter_MVAR$_78: 
                                                           do {
                                                               if($subject80_cursor == $subject80_len){
                                                                  return ((IBool)$constants.get(10)/*false*/);
                                                               
                                                               } else {
                                                                  continue CASE_1154855088_8_CONS_parameterized_lex_LIST_CONS_parameter_MVAR$_78;/*list match1*/
                                                               }
                                                           } while(false);
                                                    
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
                
        
            case -333228984:
                if(noCaseMatched_$switchVal61){
                    noCaseMatched_$switchVal61 = false;
                    if($isSubtypeOf($switchVal61.getType(),M_Type.ADT_Symbol)){
                       /*muExists*/CASE_333228984_4: 
                           do {
                               if($has_type_and_arity($switchVal61, M_ParseTree.Symbol_layouts_str, 1)){
                                  IValue $arg0_65 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal61)),0));
                                  if($isComparable($arg0_65.getType(), $T8)){
                                     return ((IBool)$constants.get(10)/*false*/);
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 0:
                if(noCaseMatched_$switchVal61){
                    noCaseMatched_$switchVal61 = false;
                    
                }
                
        
            case -1948270072:
                if(noCaseMatched_$switchVal61){
                    noCaseMatched_$switchVal61 = false;
                    if($isSubtypeOf($switchVal61.getType(),M_Type.ADT_Symbol)){
                       /*muExists*/CASE_1948270072_3: 
                           do {
                               if($has_type_and_arity($switchVal61, M_ParseTree.Symbol_char_class_list_CharRange, 1)){
                                  IValue $arg0_64 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal61)),0));
                                  if($isComparable($arg0_64.getType(), $T8)){
                                     return ((IBool)$constants.get(10)/*false*/);
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case 857272:
                if(noCaseMatched_$switchVal61){
                    noCaseMatched_$switchVal61 = false;
                    if($isSubtypeOf($switchVal61.getType(),M_Type.ADT_Symbol)){
                       /*muExists*/CASE_857272_0: 
                           do {
                               if($has_type_and_arity($switchVal61, M_ParseTree.Symbol_lit_str, 1)){
                                  IValue $arg0_62 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal61)),0));
                                  if($isComparable($arg0_62.getType(), $T8)){
                                     return ((IBool)$constants.get(10)/*false*/);
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            case -109773488:
                if(noCaseMatched_$switchVal61){
                    noCaseMatched_$switchVal61 = false;
                    if($isSubtypeOf($switchVal61.getType(),M_Type.ADT_Symbol)){
                       /*muExists*/CASE_109773488_5: 
                           do {
                               if($has_type_and_arity($switchVal61, M_ParseTree.Symbol_keywords_str, 1)){
                                  IValue $arg0_66 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal61)),0));
                                  if($isComparable($arg0_66.getType(), $T8)){
                                     return ((IBool)$constants.get(10)/*false*/);
                                  
                                  }
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            default: if($isSubtypeOf($switchVal61.getType(),M_Type.ADT_Symbol)){
                        /*muExists*/CASE_0_1: 
                            do {
                                if($has_type_and_arity($switchVal61, M_ParseTree.Symbol_empty_, 0)){
                                   return ((IBool)$constants.get(10)/*false*/);
                                
                                }
                        
                            } while(false);
                     
                     }
                     return ((IBool)$constants.get(11)/*true*/);
        
        }
        
                   
    }
    

    public static void main(String[] args) {
      throw new RuntimeException("No function `main` found in Rascal module `lang::rascal::grammar::ConcreteSyntax`");
    }
}