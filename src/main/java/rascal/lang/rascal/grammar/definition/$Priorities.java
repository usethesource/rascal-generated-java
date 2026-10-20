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
public class $Priorities 
    extends
        org.rascalmpl.runtime.$RascalModule
    implements 
    	rascal.lang.rascal.grammar.definition.$Priorities_$I,
    	rascal.$Message_$I,
    	rascal.$ParseTree_$I,
    	rascal.$Type_$I,
    	rascal.$List_$I {

    private final $Priorities_$I $me;
    private final IList $constants;
    
    
    public final rascal.$Set M_Set;
    public final rascal.$IO M_IO;
    public final rascal.lang.rascal.grammar.definition.$Productions M_lang_rascal_grammar_definition_Productions;
    public final rascal.lang.rascal.grammar.definition.$Symbols M_lang_rascal_grammar_definition_Symbols;
    public final rascal.$Exception M_Exception;
    public final rascal.util.$Maybe M_util_Maybe;
    public final rascal.analysis.diff.edits.$FileSystemChanges M_analysis_diff_edits_FileSystemChanges;
    public final rascal.$Node M_Node;
    public final rascal.$Grammar M_Grammar;
    public final rascal.$Message M_Message;
    public final rascal.lang.rascal.format.$Grammar M_lang_rascal_format_Grammar;
    public final rascal.$ParseTree M_ParseTree;
    public final rascal.lang.rascal.grammar.definition.$References M_lang_rascal_grammar_definition_References;
    public final rascal.$Type M_Type;
    public final rascal.$Map M_Map;
    public final rascal.$List M_List;

    
    
    public final io.usethesource.vallang.type.Type $T1;	/*avalue()*/
    public final io.usethesource.vallang.type.Type $T18;	/*aparameter("A",avalue(),closed=true)*/
    public final io.usethesource.vallang.type.Type $T13;	/*avoid()*/
    public final io.usethesource.vallang.type.Type $T5;	/*aparameter("T",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type $T9;	/*astr()*/
    public final io.usethesource.vallang.type.Type $T3;	/*aparameter("V",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type $T12;	/*aparameter("U",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type $T2;	/*aparameter("K",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type ADT_Strategy;	/*aadt("Strategy",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Strategy;	/*aadt("Strategy",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Attr;	/*aadt("Attr",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Expression;	/*aadt("Expression",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Expression;	/*aadt("Expression",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Mapping_Expression;	/*aadt("Mapping",[aadt("Expression",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Mapping_Expression;	/*aadt("Mapping",[aadt("Expression",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_MidStringChars;	/*aadt("MidStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_MidStringChars;	/*aadt("MidStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Case;	/*aadt("Case",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Case;	/*aadt("Case",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_BooleanLiteral;	/*aadt("BooleanLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_BooleanLiteral;	/*aadt("BooleanLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_LocalVariableDeclaration;	/*aadt("LocalVariableDeclaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_LocalVariableDeclaration;	/*aadt("LocalVariableDeclaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ImportedModule;	/*aadt("ImportedModule",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ImportedModule;	/*aadt("ImportedModule",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Tree;	/*aadt("Tree",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T16;	/*aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)*/
    public final io.usethesource.vallang.type.Type ADT_KeywordArguments_1;	/*aadt("KeywordArguments",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordArguments_1;	/*aadt("KeywordArguments",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Range;	/*aadt("Range",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Range;	/*aadt("Range",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Concrete;	/*aadt("Concrete",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Concrete;	/*aadt("Concrete",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_LAYOUT;	/*aadt("LAYOUT",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_LAYOUT;	/*aadt("LAYOUT",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_IOCapability;	/*aadt("IOCapability",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TagString;	/*aadt("TagString",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TagString;	/*aadt("TagString",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ProtocolChars;	/*aadt("ProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ProtocolChars;	/*aadt("ProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Replacement;	/*aadt("Replacement",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Replacement;	/*aadt("Replacement",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Visibility;	/*aadt("Visibility",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Visibility;	/*aadt("Visibility",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PostProtocolChars;	/*aadt("PostProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PostProtocolChars;	/*aadt("PostProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FunctionType;	/*aadt("FunctionType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionType;	/*aadt("FunctionType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_SyntaxDefinition;	/*aadt("SyntaxDefinition",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_SyntaxDefinition;	/*aadt("SyntaxDefinition",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Output;	/*aadt("Output",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Output;	/*aadt("Output",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type $T17;	/*aparameter("T",aadt("Tree",[],dataSyntax()),closed=false)*/
    public final io.usethesource.vallang.type.Type ADT_RationalLiteral;	/*aadt("RationalLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RationalLiteral;	/*aadt("RationalLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Item;	/*aadt("Item",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ModuleParameters;	/*aadt("ModuleParameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ModuleParameters;	/*aadt("ModuleParameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_DatePart;	/*aadt("DatePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DatePart;	/*aadt("DatePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Label;	/*aadt("Label",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Label;	/*aadt("Label",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Prod;	/*aadt("Prod",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Prod;	/*aadt("Prod",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Production;	/*aadt("Production",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Maybe_Production;	/*aadt("Maybe",[aadt("Production",[],dataSyntax())],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TreeSearchResult_Tree;	/*aadt("TreeSearchResult",[aadt("Tree",[],dataSyntax())],dataSyntax())*/
    public final io.usethesource.vallang.type.Type TreeSearchResult_Tree_treeFound_Tree;	/*acons(aadt("TreeSearchResult",[aadt("Tree",[],dataSyntax())],dataSyntax()),[aadt("Tree",[],dataSyntax(),alabel="tree")],[],alabel="treeFound")*/
    public final io.usethesource.vallang.type.Type ADT_Pattern;	/*aadt("Pattern",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Pattern;	/*aadt("Pattern",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Mapping_Pattern;	/*aadt("Mapping",[aadt("Pattern",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Mapping_Pattern;	/*aadt("Mapping",[aadt("Pattern",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Kind;	/*aadt("Kind",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Kind;	/*aadt("Kind",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_KeywordArguments_Expression;	/*aadt("KeywordArguments",[aadt("Expression",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordArguments_Expression;	/*aadt("KeywordArguments",[aadt("Expression",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TimePartNoTZ;	/*aadt("TimePartNoTZ",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TimePartNoTZ;	/*aadt("TimePartNoTZ",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type $T0;	/*amap(aparameter("K",avalue(),closed=false),aparameter("V",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type ADT_OptionalTerminator;	/*aadt("OptionalTerminator",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_OptionalTerminator;	/*aadt("OptionalTerminator",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_GrammarModule;	/*aadt("GrammarModule",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RegExpLiteral;	/*aadt("RegExpLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RegExpLiteral;	/*aadt("RegExpLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Declarator;	/*aadt("Declarator",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Declarator;	/*aadt("Declarator",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RegExpModifier;	/*aadt("RegExpModifier",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RegExpModifier;	/*aadt("RegExpModifier",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Target;	/*aadt("Target",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Target;	/*aadt("Target",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Mapping_1;	/*aadt("Mapping",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Mapping_1;	/*aadt("Mapping",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Maybe_Production_just_Production;	/*acons(aadt("Maybe",[aadt("Production",[],dataSyntax())],dataSyntax()),[aadt("Production",[],dataSyntax(),alabel="val")],[],alabel="just")*/
    public final io.usethesource.vallang.type.Type ADT_KeywordFormals;	/*aadt("KeywordFormals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordFormals;	/*aadt("KeywordFormals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_DataTarget;	/*aadt("DataTarget",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DataTarget;	/*aadt("DataTarget",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Renaming;	/*aadt("Renaming",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Renaming;	/*aadt("Renaming",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Maybe_1;	/*aadt("Maybe",[aparameter("A",avalue(),closed=true)],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Catch;	/*aadt("Catch",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Catch;	/*aadt("Catch",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_KeywordFormal;	/*aadt("KeywordFormal",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordFormal;	/*aadt("KeywordFormal",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Associativity;	/*aadt("Associativity",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Renamings;	/*aadt("Renamings",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Renamings;	/*aadt("Renamings",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_OptionalExpression;	/*aadt("OptionalExpression",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_OptionalExpression;	/*aadt("OptionalExpression",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_GrammarDefinition;	/*aadt("GrammarDefinition",[],dataSyntax())*/
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
    public final io.usethesource.vallang.type.Type ADT_Symbol;	/*aadt("Symbol",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_HexIntegerLiteral;	/*aadt("HexIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_HexIntegerLiteral;	/*aadt("HexIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PostStringChars;	/*aadt("PostStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PostStringChars;	/*aadt("PostStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TimeZonePart;	/*aadt("TimeZonePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TimeZonePart;	/*aadt("TimeZonePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Declaration;	/*aadt("Declaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Declaration;	/*aadt("Declaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ShellCommand;	/*aadt("ShellCommand",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ShellCommand;	/*aadt("ShellCommand",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Nonterminal;	/*aadt("Nonterminal",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Nonterminal;	/*aadt("Nonterminal",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RegExp;	/*aadt("RegExp",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RegExp;	/*aadt("RegExp",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PreStringChars;	/*aadt("PreStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PreStringChars;	/*aadt("PreStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type $T4;	/*alist(aparameter("T",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type ADT_StringLiteral;	/*aadt("StringLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringLiteral;	/*aadt("StringLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TreeSearchResult_void;	/*aadt("TreeSearchResult",[avoid()],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Name;	/*aadt("Name",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Name;	/*aadt("Name",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_IntegerLiteral;	/*aadt("IntegerLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_IntegerLiteral;	/*aadt("IntegerLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Variable;	/*aadt("Variable",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Variable;	/*aadt("Variable",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TypeArg;	/*aadt("TypeArg",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TypeArg;	/*aadt("TypeArg",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_NonterminalLabel;	/*aadt("NonterminalLabel",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_NonterminalLabel;	/*aadt("NonterminalLabel",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Bound;	/*aadt("Bound",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Bound;	/*aadt("Bound",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Class;	/*aadt("Class",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Class;	/*aadt("Class",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Condition;	/*aadt("Condition",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PathPart;	/*aadt("PathPart",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PathPart;	/*aadt("PathPart",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Signature;	/*aadt("Signature",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Signature;	/*aadt("Signature",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_KeywordArgument_1;	/*aadt("KeywordArgument",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordArgument_1;	/*aadt("KeywordArgument",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FunctionBody;	/*aadt("FunctionBody",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionBody;	/*aadt("FunctionBody",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Tags;	/*aadt("Tags",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Tags;	/*aadt("Tags",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_KeywordArguments_Pattern;	/*aadt("KeywordArguments",[aadt("Pattern",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordArguments_Pattern;	/*aadt("KeywordArguments",[aadt("Pattern",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ModuleActuals;	/*aadt("ModuleActuals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ModuleActuals;	/*aadt("ModuleActuals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_URLChars;	/*aadt("URLChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_URLChars;	/*aadt("URLChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FileSystemChange;	/*aadt("FileSystemChange",[],dataSyntax())*/
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
    public final io.usethesource.vallang.type.Type ADT_CaseInsensitiveStringConstant;	/*aadt("CaseInsensitiveStringConstant",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_CaseInsensitiveStringConstant;	/*aadt("CaseInsensitiveStringConstant",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type $T11;	/*areified(aparameter("U",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type ADT_JustDate;	/*aadt("JustDate",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_JustDate;	/*aadt("JustDate",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Header;	/*aadt("Header",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Header;	/*aadt("Header",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Exception;	/*aadt("Exception",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Assignment;	/*aadt("Assignment",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Assignment;	/*aadt("Assignment",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T8;	/*aset(aadt("Symbol",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type Associativity_prio_;	/*acons(aadt("Associativity",[],dataSyntax()),[],[],alabel="prio")*/
    public final io.usethesource.vallang.type.Type ADT_FunctionDeclaration;	/*aadt("FunctionDeclaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionDeclaration;	/*aadt("FunctionDeclaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Body;	/*aadt("Body",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Body;	/*aadt("Body",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T14;	/*aset(aadt("Production",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type ADT_Variant;	/*aadt("Variant",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Variant;	/*aadt("Variant",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_UserType;	/*aadt("UserType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_UserType;	/*aadt("UserType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T20;	/*aset(aadt("Attr",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type ADT_Comprehension;	/*aadt("Comprehension",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Comprehension;	/*aadt("Comprehension",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Import;	/*aadt("Import",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Import;	/*aadt("Import",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FunctionModifiers;	/*aadt("FunctionModifiers",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionModifiers;	/*aadt("FunctionModifiers",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TreeSearchResult_1;	/*aadt("TreeSearchResult",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_LAYOUTLIST;	/*aadt("LAYOUTLIST",[],layoutSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ConcreteHole;	/*aadt("ConcreteHole",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ConcreteHole;	/*aadt("ConcreteHole",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Grammar;	/*aadt("Grammar",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Message;	/*aadt("Message",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_CharRange;	/*aadt("CharRange",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T15;	/*alist(aadt("Symbol",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type ADT_Sym;	/*aadt("Sym",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Sym;	/*aadt("Sym",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_StringMiddle;	/*aadt("StringMiddle",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringMiddle;	/*aadt("StringMiddle",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T19;	/*alist(aadt("Production",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type ADT_RealLiteral;	/*aadt("RealLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RealLiteral;	/*aadt("RealLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TypeVar;	/*aadt("TypeVar",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TypeVar;	/*aadt("TypeVar",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Formals;	/*aadt("Formals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Formals;	/*aadt("Formals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_QualifiedName;	/*aadt("QualifiedName",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_QualifiedName;	/*aadt("QualifiedName",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_MidPathChars;	/*aadt("MidPathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_MidPathChars;	/*aadt("MidPathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_NamedBackslash;	/*aadt("NamedBackslash",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_NamedBackslash;	/*aadt("NamedBackslash",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_HorizontalSpace;	/*aadt("HorizontalSpace",[],layoutSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_MidProtocolChars;	/*aadt("MidProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_MidProtocolChars;	/*aadt("MidProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RascalKeywords;	/*aadt("RascalKeywords",[],keywordSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Parameters;	/*aadt("Parameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Parameters;	/*aadt("Parameters",[],contextFreeSyntax())*/
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
    public final io.usethesource.vallang.type.Type ADT_RuntimeException;	/*aadt("RuntimeException",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_NamedRegExp;	/*aadt("NamedRegExp",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_NamedRegExp;	/*aadt("NamedRegExp",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Assoc;	/*aadt("Assoc",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Assoc;	/*aadt("Assoc",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_DateTimeLiteral;	/*aadt("DateTimeLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DateTimeLiteral;	/*aadt("DateTimeLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_DecimalIntegerLiteral;	/*aadt("DecimalIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DecimalIntegerLiteral;	/*aadt("DecimalIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Maybe_Symbol;	/*aadt("Maybe",[aadt("Symbol",[],dataSyntax())],dataSyntax())*/
    public final io.usethesource.vallang.type.Type Maybe_Symbol_just_Symbol;	/*acons(aadt("Maybe",[aadt("Symbol",[],dataSyntax())],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="val")],[],alabel="just")*/
    public final io.usethesource.vallang.type.Type ADT_Maybe_void;	/*aadt("Maybe",[avoid()],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T6;	/*aset(aparameter("T",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type ADT_PathTail;	/*aadt("PathTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PathTail;	/*aadt("PathTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Maybe_Associativity_just_Associativity;	/*acons(aadt("Maybe",[aadt("Associativity",[],dataSyntax())],dataSyntax()),[aadt("Associativity",[],dataSyntax(),alabel="val")],[],alabel="just")*/
    public final io.usethesource.vallang.type.Type ADT_Toplevel;	/*aadt("Toplevel",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Toplevel;	/*aadt("Toplevel",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ConcretePart;	/*aadt("ConcretePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ConcretePart;	/*aadt("ConcretePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PathChars;	/*aadt("PathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PathChars;	/*aadt("PathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PostPathChars;	/*aadt("PostPathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PostPathChars;	/*aadt("PostPathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type $T7;	/*aset(aadt("Condition",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type ADT_EvalCommand;	/*aadt("EvalCommand",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_EvalCommand;	/*aadt("EvalCommand",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PatternWithAction;	/*aadt("PatternWithAction",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PatternWithAction;	/*aadt("PatternWithAction",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Module;	/*aadt("Module",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Module;	/*aadt("Module",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Statement;	/*aadt("Statement",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Statement;	/*aadt("Statement",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_StringCharacter;	/*aadt("StringCharacter",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringCharacter;	/*aadt("StringCharacter",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Literal;	/*aadt("Literal",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Literal;	/*aadt("Literal",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ProtocolTail;	/*aadt("ProtocolTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ProtocolTail;	/*aadt("ProtocolTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_BasicType;	/*aadt("BasicType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_BasicType;	/*aadt("BasicType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T10;	/*areified(aparameter("T",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type ADT_Comment;	/*aadt("Comment",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Comment;	/*aadt("Comment",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Commands;	/*aadt("Commands",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Commands;	/*aadt("Commands",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PreProtocolChars;	/*aadt("PreProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PreProtocolChars;	/*aadt("PreProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_JustTime;	/*aadt("JustTime",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_JustTime;	/*aadt("JustTime",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FunctionModifier;	/*aadt("FunctionModifier",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionModifier;	/*aadt("FunctionModifier",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ProdModifier;	/*aadt("ProdModifier",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ProdModifier;	/*aadt("ProdModifier",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Assignable;	/*aadt("Assignable",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Assignable;	/*aadt("Assignable",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_UnicodeEscape;	/*aadt("UnicodeEscape",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_UnicodeEscape;	/*aadt("UnicodeEscape",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_CommonKeywordParameters;	/*aadt("CommonKeywordParameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_CommonKeywordParameters;	/*aadt("CommonKeywordParameters",[],contextFreeSyntax())*/

    public $Priorities(RascalExecutionContext rex){
        this(rex, null);
    }
    
    public $Priorities(RascalExecutionContext rex, Object extended){
       super(rex);
       this.$me = extended == null ? this : ($Priorities_$I)extended;
       ModuleStore mstore = rex.getModuleStore();
       mstore.put(rascal.lang.rascal.grammar.definition.$Priorities.class, this);
       
       mstore.importModule(rascal.$Set.class, rex, rascal.$Set::new);
       mstore.importModule(rascal.$IO.class, rex, rascal.$IO::new);
       mstore.importModule(rascal.lang.rascal.grammar.definition.$Productions.class, rex, rascal.lang.rascal.grammar.definition.$Productions::new);
       mstore.importModule(rascal.lang.rascal.grammar.definition.$Symbols.class, rex, rascal.lang.rascal.grammar.definition.$Symbols::new);
       mstore.importModule(rascal.$Exception.class, rex, rascal.$Exception::new);
       mstore.importModule(rascal.util.$Maybe.class, rex, rascal.util.$Maybe::new);
       mstore.importModule(rascal.analysis.diff.edits.$FileSystemChanges.class, rex, rascal.analysis.diff.edits.$FileSystemChanges::new);
       mstore.importModule(rascal.$Node.class, rex, rascal.$Node::new);
       mstore.importModule(rascal.$Grammar.class, rex, rascal.$Grammar::new);
       mstore.importModule(rascal.lang.rascal.format.$Grammar.class, rex, rascal.lang.rascal.format.$Grammar::new);
       mstore.importModule(rascal.lang.rascal.grammar.definition.$References.class, rex, rascal.lang.rascal.grammar.definition.$References::new);
       mstore.importModule(rascal.$Map.class, rex, rascal.$Map::new); 
       
       M_Set = mstore.getModule(rascal.$Set.class);
       M_IO = mstore.getModule(rascal.$IO.class);
       M_lang_rascal_grammar_definition_Productions = mstore.getModule(rascal.lang.rascal.grammar.definition.$Productions.class);
       M_lang_rascal_grammar_definition_Symbols = mstore.getModule(rascal.lang.rascal.grammar.definition.$Symbols.class);
       M_Exception = mstore.getModule(rascal.$Exception.class);
       M_util_Maybe = mstore.getModule(rascal.util.$Maybe.class);
       M_analysis_diff_edits_FileSystemChanges = mstore.getModule(rascal.analysis.diff.edits.$FileSystemChanges.class);
       M_Node = mstore.getModule(rascal.$Node.class);
       M_Grammar = mstore.getModule(rascal.$Grammar.class);
       M_lang_rascal_format_Grammar = mstore.getModule(rascal.lang.rascal.format.$Grammar.class);
       M_lang_rascal_grammar_definition_References = mstore.getModule(rascal.lang.rascal.grammar.definition.$References.class);
       M_Map = mstore.getModule(rascal.$Map.class); 
       
       M_Message = mstore.extendModule(rascal.$Message.class, rex, rascal.$Message::new, $me);
       M_ParseTree = mstore.extendModule(rascal.$ParseTree.class, rex, rascal.$ParseTree::new, $me);
       M_Type = mstore.extendModule(rascal.$Type.class, rex, rascal.$Type::new, $me);
       M_List = mstore.extendModule(rascal.$List.class, rex, rascal.$List::new, $me);
                          
       
       $TS.importStore(M_Set.$TS);
       $TS.importStore(M_IO.$TS);
       $TS.importStore(M_lang_rascal_grammar_definition_Productions.$TS);
       $TS.importStore(M_lang_rascal_grammar_definition_Symbols.$TS);
       $TS.importStore(M_Exception.$TS);
       $TS.importStore(M_util_Maybe.$TS);
       $TS.importStore(M_analysis_diff_edits_FileSystemChanges.$TS);
       $TS.importStore(M_Node.$TS);
       $TS.importStore(M_Grammar.$TS);
       $TS.importStore(M_Message.$TS);
       $TS.importStore(M_lang_rascal_format_Grammar.$TS);
       $TS.importStore(M_ParseTree.$TS);
       $TS.importStore(M_lang_rascal_grammar_definition_References.$TS);
       $TS.importStore(M_Type.$TS);
       $TS.importStore(M_Map.$TS);
       $TS.importStore(M_List.$TS);
       
       $constants = readBinaryConstantsFile(this.getClass(), "rascal/lang/rascal/grammar/definition/$Priorities.constants", 5, "5a671e7b791df5802d0f8bf8e26b68e7");
       NT_Strategy = $sort("Strategy");
       ADT_Strategy = $adt("Strategy");
       ADT_Attr = $adt("Attr");
       NT_Expression = $sort("Expression");
       ADT_Expression = $adt("Expression");
       NT_MidStringChars = $lex("MidStringChars");
       ADT_MidStringChars = $adt("MidStringChars");
       NT_Case = $sort("Case");
       ADT_Case = $adt("Case");
       NT_BooleanLiteral = $lex("BooleanLiteral");
       ADT_BooleanLiteral = $adt("BooleanLiteral");
       NT_LocalVariableDeclaration = $sort("LocalVariableDeclaration");
       ADT_LocalVariableDeclaration = $adt("LocalVariableDeclaration");
       NT_ImportedModule = $sort("ImportedModule");
       ADT_ImportedModule = $adt("ImportedModule");
       ADT_Tree = $adt("Tree");
       NT_Range = $sort("Range");
       ADT_Range = $adt("Range");
       NT_Concrete = $lex("Concrete");
       ADT_Concrete = $adt("Concrete");
       NT_LAYOUT = $lex("LAYOUT");
       ADT_LAYOUT = $adt("LAYOUT");
       ADT_IOCapability = $adt("IOCapability");
       NT_TagString = $lex("TagString");
       ADT_TagString = $adt("TagString");
       NT_ProtocolChars = $lex("ProtocolChars");
       ADT_ProtocolChars = $adt("ProtocolChars");
       NT_Replacement = $sort("Replacement");
       ADT_Replacement = $adt("Replacement");
       NT_Visibility = $sort("Visibility");
       ADT_Visibility = $adt("Visibility");
       NT_PostProtocolChars = $lex("PostProtocolChars");
       ADT_PostProtocolChars = $adt("PostProtocolChars");
       NT_FunctionType = $sort("FunctionType");
       ADT_FunctionType = $adt("FunctionType");
       NT_SyntaxDefinition = $sort("SyntaxDefinition");
       ADT_SyntaxDefinition = $adt("SyntaxDefinition");
       NT_Output = $lex("Output");
       ADT_Output = $adt("Output");
       NT_RationalLiteral = $lex("RationalLiteral");
       ADT_RationalLiteral = $adt("RationalLiteral");
       ADT_Item = $adt("Item");
       NT_ModuleParameters = $sort("ModuleParameters");
       ADT_ModuleParameters = $adt("ModuleParameters");
       NT_DatePart = $lex("DatePart");
       ADT_DatePart = $adt("DatePart");
       NT_Label = $sort("Label");
       ADT_Label = $adt("Label");
       NT_Prod = $sort("Prod");
       ADT_Prod = $adt("Prod");
       ADT_Production = $adt("Production");
       NT_Pattern = $sort("Pattern");
       ADT_Pattern = $adt("Pattern");
       NT_Kind = $sort("Kind");
       ADT_Kind = $adt("Kind");
       NT_TimePartNoTZ = $lex("TimePartNoTZ");
       ADT_TimePartNoTZ = $adt("TimePartNoTZ");
       NT_OptionalTerminator = $lex("OptionalTerminator");
       ADT_OptionalTerminator = $adt("OptionalTerminator");
       ADT_GrammarModule = $adt("GrammarModule");
       NT_RegExpLiteral = $lex("RegExpLiteral");
       ADT_RegExpLiteral = $adt("RegExpLiteral");
       NT_Declarator = $sort("Declarator");
       ADT_Declarator = $adt("Declarator");
       NT_RegExpModifier = $lex("RegExpModifier");
       ADT_RegExpModifier = $adt("RegExpModifier");
       NT_Target = $sort("Target");
       ADT_Target = $adt("Target");
       NT_KeywordFormals = $sort("KeywordFormals");
       ADT_KeywordFormals = $adt("KeywordFormals");
       NT_DataTarget = $sort("DataTarget");
       ADT_DataTarget = $adt("DataTarget");
       NT_Renaming = $sort("Renaming");
       ADT_Renaming = $adt("Renaming");
       NT_Catch = $sort("Catch");
       ADT_Catch = $adt("Catch");
       NT_KeywordFormal = $sort("KeywordFormal");
       ADT_KeywordFormal = $adt("KeywordFormal");
       ADT_Associativity = $adt("Associativity");
       NT_Renamings = $sort("Renamings");
       ADT_Renamings = $adt("Renamings");
       NT_OptionalExpression = $sort("OptionalExpression");
       ADT_OptionalExpression = $adt("OptionalExpression");
       ADT_GrammarDefinition = $adt("GrammarDefinition");
       NT_Field = $sort("Field");
       ADT_Field = $adt("Field");
       NT_LocationLiteral = $sort("LocationLiteral");
       ADT_LocationLiteral = $adt("LocationLiteral");
       NT_Tag = $sort("Tag");
       ADT_Tag = $adt("Tag");
       NT_Type = $sort("Type");
       ADT_Type = $adt("Type");
       ADT_Symbol = $adt("Symbol");
       NT_HexIntegerLiteral = $lex("HexIntegerLiteral");
       ADT_HexIntegerLiteral = $adt("HexIntegerLiteral");
       NT_PostStringChars = $lex("PostStringChars");
       ADT_PostStringChars = $adt("PostStringChars");
       NT_TimeZonePart = $lex("TimeZonePart");
       ADT_TimeZonePart = $adt("TimeZonePart");
       NT_Declaration = $sort("Declaration");
       ADT_Declaration = $adt("Declaration");
       NT_ShellCommand = $sort("ShellCommand");
       ADT_ShellCommand = $adt("ShellCommand");
       NT_Nonterminal = $lex("Nonterminal");
       ADT_Nonterminal = $adt("Nonterminal");
       NT_RegExp = $lex("RegExp");
       ADT_RegExp = $adt("RegExp");
       NT_PreStringChars = $lex("PreStringChars");
       ADT_PreStringChars = $adt("PreStringChars");
       NT_StringLiteral = $sort("StringLiteral");
       ADT_StringLiteral = $adt("StringLiteral");
       NT_Name = $lex("Name");
       ADT_Name = $adt("Name");
       NT_IntegerLiteral = $sort("IntegerLiteral");
       ADT_IntegerLiteral = $adt("IntegerLiteral");
       NT_Variable = $sort("Variable");
       ADT_Variable = $adt("Variable");
       NT_TypeArg = $sort("TypeArg");
       ADT_TypeArg = $adt("TypeArg");
       NT_NonterminalLabel = $lex("NonterminalLabel");
       ADT_NonterminalLabel = $adt("NonterminalLabel");
       NT_Bound = $sort("Bound");
       ADT_Bound = $adt("Bound");
       NT_Class = $sort("Class");
       ADT_Class = $adt("Class");
       ADT_Condition = $adt("Condition");
       NT_PathPart = $sort("PathPart");
       ADT_PathPart = $adt("PathPart");
       NT_Signature = $sort("Signature");
       ADT_Signature = $adt("Signature");
       NT_FunctionBody = $sort("FunctionBody");
       ADT_FunctionBody = $adt("FunctionBody");
       NT_Tags = $sort("Tags");
       ADT_Tags = $adt("Tags");
       NT_ModuleActuals = $sort("ModuleActuals");
       ADT_ModuleActuals = $adt("ModuleActuals");
       NT_URLChars = $lex("URLChars");
       ADT_URLChars = $adt("URLChars");
       ADT_FileSystemChange = $adt("FileSystemChange");
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
       NT_CaseInsensitiveStringConstant = $lex("CaseInsensitiveStringConstant");
       ADT_CaseInsensitiveStringConstant = $adt("CaseInsensitiveStringConstant");
       NT_JustDate = $lex("JustDate");
       ADT_JustDate = $adt("JustDate");
       NT_Header = $sort("Header");
       ADT_Header = $adt("Header");
       ADT_Exception = $adt("Exception");
       NT_Assignment = $sort("Assignment");
       ADT_Assignment = $adt("Assignment");
       NT_FunctionDeclaration = $sort("FunctionDeclaration");
       ADT_FunctionDeclaration = $adt("FunctionDeclaration");
       NT_Body = $sort("Body");
       ADT_Body = $adt("Body");
       NT_Variant = $sort("Variant");
       ADT_Variant = $adt("Variant");
       NT_UserType = $sort("UserType");
       ADT_UserType = $adt("UserType");
       NT_Comprehension = $sort("Comprehension");
       ADT_Comprehension = $adt("Comprehension");
       NT_Import = $sort("Import");
       ADT_Import = $adt("Import");
       NT_FunctionModifiers = $sort("FunctionModifiers");
       ADT_FunctionModifiers = $adt("FunctionModifiers");
       ADT_LAYOUTLIST = $layouts("LAYOUTLIST");
       NT_ConcreteHole = $sort("ConcreteHole");
       ADT_ConcreteHole = $adt("ConcreteHole");
       ADT_Grammar = $adt("Grammar");
       ADT_Message = $adt("Message");
       ADT_CharRange = $adt("CharRange");
       NT_Sym = $sort("Sym");
       ADT_Sym = $adt("Sym");
       NT_StringMiddle = $sort("StringMiddle");
       ADT_StringMiddle = $adt("StringMiddle");
       NT_RealLiteral = $lex("RealLiteral");
       ADT_RealLiteral = $adt("RealLiteral");
       NT_TypeVar = $sort("TypeVar");
       ADT_TypeVar = $adt("TypeVar");
       NT_Formals = $sort("Formals");
       ADT_Formals = $adt("Formals");
       NT_QualifiedName = $sort("QualifiedName");
       ADT_QualifiedName = $adt("QualifiedName");
       NT_MidPathChars = $lex("MidPathChars");
       ADT_MidPathChars = $adt("MidPathChars");
       NT_NamedBackslash = $lex("NamedBackslash");
       ADT_NamedBackslash = $adt("NamedBackslash");
       ADT_HorizontalSpace = $layouts("HorizontalSpace");
       NT_MidProtocolChars = $lex("MidProtocolChars");
       ADT_MidProtocolChars = $adt("MidProtocolChars");
       ADT_RascalKeywords = $keywords("RascalKeywords");
       NT_Parameters = $sort("Parameters");
       ADT_Parameters = $adt("Parameters");
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
       ADT_RuntimeException = $adt("RuntimeException");
       NT_NamedRegExp = $lex("NamedRegExp");
       ADT_NamedRegExp = $adt("NamedRegExp");
       NT_Assoc = $sort("Assoc");
       ADT_Assoc = $adt("Assoc");
       NT_DateTimeLiteral = $sort("DateTimeLiteral");
       ADT_DateTimeLiteral = $adt("DateTimeLiteral");
       NT_DecimalIntegerLiteral = $lex("DecimalIntegerLiteral");
       ADT_DecimalIntegerLiteral = $adt("DecimalIntegerLiteral");
       NT_PathTail = $sort("PathTail");
       ADT_PathTail = $adt("PathTail");
       NT_Toplevel = $sort("Toplevel");
       ADT_Toplevel = $adt("Toplevel");
       NT_ConcretePart = $lex("ConcretePart");
       ADT_ConcretePart = $adt("ConcretePart");
       NT_PathChars = $lex("PathChars");
       ADT_PathChars = $adt("PathChars");
       NT_PostPathChars = $lex("PostPathChars");
       ADT_PostPathChars = $adt("PostPathChars");
       NT_EvalCommand = $sort("EvalCommand");
       ADT_EvalCommand = $adt("EvalCommand");
       NT_PatternWithAction = $sort("PatternWithAction");
       ADT_PatternWithAction = $adt("PatternWithAction");
       NT_Module = $sort("Module");
       ADT_Module = $adt("Module");
       NT_Statement = $sort("Statement");
       ADT_Statement = $adt("Statement");
       NT_StringCharacter = $lex("StringCharacter");
       ADT_StringCharacter = $adt("StringCharacter");
       NT_Literal = $sort("Literal");
       ADT_Literal = $adt("Literal");
       NT_ProtocolTail = $sort("ProtocolTail");
       ADT_ProtocolTail = $adt("ProtocolTail");
       NT_BasicType = $sort("BasicType");
       ADT_BasicType = $adt("BasicType");
       NT_Comment = $lex("Comment");
       ADT_Comment = $adt("Comment");
       NT_Commands = $sort("Commands");
       ADT_Commands = $adt("Commands");
       NT_PreProtocolChars = $lex("PreProtocolChars");
       ADT_PreProtocolChars = $adt("PreProtocolChars");
       NT_JustTime = $lex("JustTime");
       ADT_JustTime = $adt("JustTime");
       NT_FunctionModifier = $sort("FunctionModifier");
       ADT_FunctionModifier = $adt("FunctionModifier");
       NT_ProdModifier = $sort("ProdModifier");
       ADT_ProdModifier = $adt("ProdModifier");
       NT_Assignable = $sort("Assignable");
       ADT_Assignable = $adt("Assignable");
       NT_UnicodeEscape = $lex("UnicodeEscape");
       ADT_UnicodeEscape = $adt("UnicodeEscape");
       NT_CommonKeywordParameters = $sort("CommonKeywordParameters");
       ADT_CommonKeywordParameters = $adt("CommonKeywordParameters");
       $T1 = $TF.valueType();
       $T18 = $TF.parameterType("A", $T1);
       $T13 = $TF.voidType();
       $T5 = $TF.parameterType("T", $T1);
       $T9 = $TF.stringType();
       $T3 = $TF.parameterType("V", $T1);
       $T12 = $TF.parameterType("U", $T1);
       $T2 = $TF.parameterType("K", $T1);
       NT_Mapping_Expression = $parameterizedSort("Mapping", new Type[] { ADT_Expression }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Expression"))));
       $T16 = $TF.parameterType("T", ADT_Tree);
       NT_KeywordArguments_1 = $parameterizedSort("KeywordArguments", new Type[] { $T16 }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Parameter, $RVF.string("T"), $RVF.constructor(RascalValueFactory.Symbol_Adt, $RVF.string("Tree"), $RVF.list()))));
       $T17 = $TF.parameterType("T", ADT_Tree);
       ADT_Maybe_Production = $parameterizedAdt("Maybe", new Type[] { ADT_Production });
       ADT_TreeSearchResult_Tree = $parameterizedAdt("TreeSearchResult", new Type[] { ADT_Tree });
       NT_Mapping_Pattern = $parameterizedSort("Mapping", new Type[] { ADT_Pattern }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Pattern"))));
       NT_KeywordArguments_Expression = $parameterizedSort("KeywordArguments", new Type[] { ADT_Expression }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Expression"))));
       $T0 = $TF.mapType($T2,$T3);
       NT_Mapping_1 = $parameterizedSort("Mapping", new Type[] { $T16 }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Parameter, $RVF.string("T"), $RVF.constructor(RascalValueFactory.Symbol_Adt, $RVF.string("Tree"), $RVF.list()))));
       ADT_Maybe_1 = $parameterizedAdt("Maybe", new Type[] { $T18 });
       ADT_Maybe_Attr = $parameterizedAdt("Maybe", new Type[] { ADT_Attr });
       $T4 = $TF.listType($T5);
       ADT_TreeSearchResult_void = $parameterizedAdt("TreeSearchResult", new Type[] { $T13 });
       NT_KeywordArgument_1 = $parameterizedSort("KeywordArgument", new Type[] { $T16 }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Parameter, $RVF.string("T"), $RVF.constructor(RascalValueFactory.Symbol_Adt, $RVF.string("Tree"), $RVF.list()))));
       NT_KeywordArguments_Pattern = $parameterizedSort("KeywordArguments", new Type[] { ADT_Pattern }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Pattern"))));
       ADT_Maybe_Associativity = $parameterizedAdt("Maybe", new Type[] { ADT_Associativity });
       $T11 = $RTF.reifiedType($T12);
       $T8 = $TF.setType(ADT_Symbol);
       $T14 = $TF.setType(ADT_Production);
       $T20 = $TF.setType(ADT_Attr);
       ADT_TreeSearchResult_1 = $parameterizedAdt("TreeSearchResult", new Type[] { $T16 });
       $T15 = $TF.listType(ADT_Symbol);
       $T19 = $TF.listType(ADT_Production);
       ADT_Maybe_Symbol = $parameterizedAdt("Maybe", new Type[] { ADT_Symbol });
       ADT_Maybe_void = $parameterizedAdt("Maybe", new Type[] { $T13 });
       $T6 = $TF.setType($T5);
       $T7 = $TF.setType(ADT_Condition);
       $T10 = $RTF.reifiedType($T5);
       ADT_Mapping_Expression = $TF.abstractDataType($TS, "Mapping", new Type[] { ADT_Expression });
       ADT_KeywordArguments_1 = $TF.abstractDataType($TS, "KeywordArguments", new Type[] { $T16 });
       ADT_Mapping_Pattern = $TF.abstractDataType($TS, "Mapping", new Type[] { ADT_Pattern });
       ADT_KeywordArguments_Expression = $TF.abstractDataType($TS, "KeywordArguments", new Type[] { ADT_Expression });
       ADT_Mapping_1 = $TF.abstractDataType($TS, "Mapping", new Type[] { $T16 });
       ADT_KeywordArgument_1 = $TF.abstractDataType($TS, "KeywordArgument", new Type[] { $T16 });
       ADT_KeywordArguments_Pattern = $TF.abstractDataType($TS, "KeywordArguments", new Type[] { ADT_Pattern });
       TreeSearchResult_Tree_treeFound_Tree = $TF.constructor($TS, ADT_TreeSearchResult_Tree, "treeFound", M_ParseTree.ADT_Tree, "tree");
       Maybe_Production_just_Production = $TF.constructor($TS, ADT_Maybe_Production, "just", M_Type.ADT_Production, "val");
       Maybe_Attr_just_Attr = $TF.constructor($TS, ADT_Maybe_Attr, "just", M_Type.ADT_Attr, "val");
       Associativity_prio_ = $TF.constructor($TS, ADT_Associativity, "prio");
       Maybe_Symbol_just_Symbol = $TF.constructor($TS, ADT_Maybe_Symbol, "just", M_Type.ADT_Symbol, "val");
       Maybe_Associativity_just_Associativity = $TF.constructor($TS, ADT_Maybe_Associativity, "just", M_ParseTree.ADT_Associativity, "val");
    
       
       
    }
    public IString intercalate(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IString) M_List.intercalate($P0, $P1);
    }
    public IValue head(IValue $P0){ // Generated by Resolver
       return (IValue) M_List.head($P0);
    }
    public IList head(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.head($P0, $P1);
    }
    public IBool sameType(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IBool) M_ParseTree.sameType($P0, $P1);
    }
    public ISet doNotNest(IValue $P0){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_Grammar.ADT_Grammar)){
         $result = (ISet)doNotNest$ae210627e1e180e4((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IInteger size(IValue $P0){ // Generated by Resolver
       IInteger $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IInteger)M_Map.size$37f80aadf49ad435((IMap) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T4)){
         $result = (IInteger)M_List.size$811ff6e419f455d9((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T6)){
         $result = (IInteger)M_Set.size$38d40110541faa91((ISet) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IMap toMap(IValue $P0){ // Generated by Resolver
       return (IMap) M_List.toMap($P0);
    }
    public IConstructor choice(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IConstructor) M_Type.choice($P0, $P1);
    }
    public ISet extract(IValue $P0){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       switch(Fingerprint.getFingerprint($P0)){
       	
       case -1467508160:
       		if($isSubtypeOf($P0Type, M_Type.ADT_Production)){
       		  $result = (ISet)extract$1ff12ed142411ae7((IConstructor) $P0);
       		  if($result != null) return $result;
       		}
       		break;	
       case -304752112:
       		if($isSubtypeOf($P0Type, M_Type.ADT_Production)){
       		  $result = (ISet)extract$12411589ebde364e((IConstructor) $P0);
       		  if($result != null) return $result;
       		}
       		break;	
       case -2132978880:
       		if($isSubtypeOf($P0Type, M_Type.ADT_Production)){
       		  $result = (ISet)extract$36b34b298fada776((IConstructor) $P0);
       		  if($result != null) return $result;
       		}
       		break;
       }
       if($isSubtypeOf($P0Type, M_Type.ADT_Production)){
         $result = (ISet)extract$854ea82ef14e27e0((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public ISet extract(IValue $P0, IValue $P1){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       switch(Fingerprint.getFingerprint($P0)){
       	
       case -1467508160:
       		if($isSubtypeOf($P0Type, M_Type.ADT_Production) && $isSubtypeOf($P1Type, M_Type.ADT_Production)){
       		  $result = (ISet)extract$ade6968c812a18eb((IConstructor) $P0, (IConstructor) $P1);
       		  if($result != null) return $result;
       		}
       		break;	
       case 110389984:
       		if($isSubtypeOf($P0Type, M_Type.ADT_Production) && $isSubtypeOf($P1Type, M_Type.ADT_Production)){
       		  $result = (ISet)extract$3c0c80a7f79c719e((IConstructor) $P0, (IConstructor) $P1);
       		  if($result != null) return $result;
       		}
       		break;	
       case -304752112:
       		if($isSubtypeOf($P0Type, M_Type.ADT_Production) && $isSubtypeOf($P1Type, M_Type.ADT_Production)){
       		  $result = (ISet)extract$42b76330dba83192((IConstructor) $P0, (IConstructor) $P1);
       		  if($result != null) return $result;
       		}
       		break;	
       case -2132978880:
       		if($isSubtypeOf($P0Type, M_Type.ADT_Production) && $isSubtypeOf($P1Type, M_Type.ADT_Production)){
       		  $result = (ISet)extract$1f17b589f355e891((IConstructor) $P0, (IConstructor) $P1);
       		  if($result != null) return $result;
       		}
       		break;
       }
       if($isSubtypeOf($P0Type, M_Type.ADT_Production) && $isSubtypeOf($P1Type, M_Type.ADT_Production)){
         $result = (ISet)extract$d6c0ce92bf6e785b((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
         $result = (ISet)extract$7394180a0fe67e22((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
         $result = (ISet)extract$26b58ea803b8e739((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IList mapper(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.mapper($P0, $P1);
    }
    public IList reverse(IValue $P0){ // Generated by Resolver
       return (IList) M_List.reverse($P0);
    }
    public TypedFunctionInstance2<IValue, IValue, IValue> firstAmbiguityFinder(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       return (TypedFunctionInstance2<IValue, IValue, IValue>) M_ParseTree.firstAmbiguityFinder($P0, $kwpActuals);
    }
    public IBool isEmpty(IValue $P0){ // Generated by Resolver
       return (IBool) M_List.isEmpty($P0);
    }
    public IList remove(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.remove($P0, $P1);
    }
    public IValue max(IValue $P0){ // Generated by Resolver
       return (IValue) M_List.max($P0);
    }
    public IConstructor priority(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IConstructor) M_ParseTree.priority($P0, $P1);
    }
    public IValue getFirstFrom(IValue $P0){ // Generated by Resolver
       return (IValue) M_List.getFirstFrom($P0);
    }
    public IMap distribution(IValue $P0){ // Generated by Resolver
       return (IMap) M_List.distribution($P0);
    }
    public TypedFunctionInstance2<IValue, IValue, IValue> loadParser(IValue $P0, IValue $P1, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       return (TypedFunctionInstance2<IValue, IValue, IValue>) M_ParseTree.loadParser($P0, $P1, $kwpActuals);
    }
    public IString printSymbol(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IString) M_ParseTree.printSymbol($P0, $P1);
    }
    public IBool same(IValue $P0, IValue $P1){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type, M_Type.ADT_Production) && $isSubtypeOf($P1Type, M_Type.ADT_Production)){
         $result = (IBool)M_lang_rascal_format_Grammar.same$b86cfbf8f6db7b7e((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol) && $isSubtypeOf($P1Type, M_Type.ADT_Symbol)){
         $result = (IBool)same$3d81c15a40e141f4((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IConstructor conditional(IValue $P0, IValue $P1){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol) && $isSubtypeOf($P1Type,$T7)){
         $result = (IConstructor)M_lang_rascal_grammar_definition_Symbols.conditional$f76d16966a8bef69((IConstructor) $P0, (ISet) $P1);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol) && $isSubtypeOf($P1Type,$T7)){
         $result = (IConstructor)M_lang_rascal_grammar_definition_Symbols.conditional$a6b35eeaa096c9bf((IConstructor) $P0, (ISet) $P1);
         if($result != null) return $result;
         return $RVF.constructor(M_ParseTree.Symbol_conditional_Symbol_set_Condition, new IValue[]{(IConstructor) $P0, (ISet) $P1});
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IBool isSorted(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       return (IBool) M_List.isSorted($P0, $kwpActuals);
    }
    public IList take(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.take($P0, $P1);
    }
    public ISet toSet(IValue $P0){ // Generated by Resolver
       return (ISet) M_List.toSet($P0);
    }
    public IList zipi(IValue $P0){ // Generated by Resolver
       return (IList) M_List.zipi($P0);
    }
    public ITuple takeOneFrom(IValue $P0){ // Generated by Resolver
       return (ITuple) M_List.takeOneFrom($P0);
    }
    public IConstructor alt(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T8)){
         $result = (IConstructor)M_lang_rascal_grammar_definition_Symbols.alt$aa65059e487d6ff2((ISet) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T8)){
         return $RVF.constructor(M_ParseTree.Symbol_alt_set_Symbol, new IValue[]{(ISet) $P0});
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IInteger indexOf(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IInteger) M_List.indexOf($P0, $P1);
    }
    public ITuple unzip2(IValue $P0){ // Generated by Resolver
       return (ITuple) M_List.unzip2($P0);
    }
    public IConstructor var_func(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       return (IConstructor) M_Type.var_func($P0, $P1, $P2);
    }
    public IBool equivalent(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IBool) M_Type.equivalent($P0, $P1);
    }
    public IList takeWhile(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.takeWhile($P0, $P1);
    }
    public INumber sum(IValue $P0){ // Generated by Resolver
       return (INumber) M_List.sum($P0);
    }
    public IList delete(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.delete($P0, $P1);
    }
    public ITuple unzip3(IValue $P0){ // Generated by Resolver
       return (ITuple) M_List.unzip3($P0);
    }
    public IBool eq(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IBool) M_Type.eq($P0, $P1);
    }
    public IList insertAt(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       return (IList) M_List.insertAt($P0, $P1, $P2);
    }
    public IValue reducer(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       return (IValue) M_List.reducer($P0, $P1, $P2);
    }
    public IString toString(IValue $P0){ // Generated by Resolver
       return (IString) M_List.toString($P0);
    }
    public IConstructor lrel(IValue $P0){ // Generated by Resolver
       return (IConstructor) M_Type.lrel($P0);
    }
    public ISet permutations(IValue $P0){ // Generated by Resolver
       return (ISet) M_List.permutations($P0);
    }
    public TypedFunctionInstance3<IValue, IValue, IValue, IValue> loadParsers(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       return (TypedFunctionInstance3<IValue, IValue, IValue, IValue>) M_ParseTree.loadParsers($P0, $kwpActuals);
    }
    public IValue make(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       return (IValue) M_Type.make($P0, $P1, $P2);
    }
    public IValue make(IValue $P0, IValue $P1, IValue $P2, IValue $P3){ // Generated by Resolver
       return (IValue) M_Type.make($P0, $P1, $P2, $P3);
    }
    public IList drop(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.drop($P0, $P1);
    }
    public IValue elementAt(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IValue) M_List.elementAt($P0, $P1);
    }
    public void println(IValue $P0){ // Generated by Resolver
        M_IO.println($P0);
    }
    public void println(){ // Generated by Resolver
        M_IO.println();
    }
    public IValue implode(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IValue) M_ParseTree.implode($P0, $P1);
    }
    public TypedFunctionInstance3<IValue, IValue, IValue, IValue> firstAmbiguityFinders(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       return (TypedFunctionInstance3<IValue, IValue, IValue, IValue>) M_ParseTree.firstAmbiguityFinders($P0, $kwpActuals);
    }
    public IList upTill(IValue $P0){ // Generated by Resolver
       return (IList) M_List.upTill($P0);
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
    public ITuple pop(IValue $P0){ // Generated by Resolver
       return (ITuple) M_List.pop($P0);
    }
    public IConstructor typeOf(IValue $P0){ // Generated by Resolver
       return (IConstructor) M_Type.typeOf($P0);
    }
    public IList zip2(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.zip2($P0, $P1);
    }
    public IList zip2(IValue $P0, IValue $P1, IValue $P2, IValue $P3){ // Generated by Resolver
       return (IList) M_List.zip2($P0, $P1, $P2, $P3);
    }
    public IConstructor treeAt(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       return (IConstructor) M_ParseTree.treeAt($P0, $P1, $P2);
    }
    public IMap toMapUnique(IValue $P0){ // Generated by Resolver
       return (IMap) M_List.toMapUnique($P0);
    }
    public IValue index(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T4)){
         $result = (IValue)M_List.index$f006059c1d37534f((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T6)){
         $result = (IValue)M_Set.index$8a5f4e126881ec51((ISet) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList slice(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       return (IList) M_List.slice($P0, $P1, $P2);
    }
    public IValue min(IValue $P0){ // Generated by Resolver
       return (IValue) M_List.min($P0);
    }
    public IList prefix(IValue $P0){ // Generated by Resolver
       return (IList) M_List.prefix($P0);
    }
    public IList zip3(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       return (IList) M_List.zip3($P0, $P1, $P2);
    }
    public IList zip3(IValue $P0, IValue $P1, IValue $P2, IValue $P3, IValue $P4, IValue $P5){ // Generated by Resolver
       return (IList) M_List.zip3($P0, $P1, $P2, $P3, $P4, $P5);
    }
    public void storeParsers(IValue $P0, IValue $P1){ // Generated by Resolver
        M_ParseTree.storeParsers($P0, $P1);
    }
    public IInteger lastIndexOf(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IInteger) M_List.lastIndexOf($P0, $P1);
    }
    public ITree parse(IValue $P0, IValue $P1, IValue $P2, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       return (ITree) M_ParseTree.parse($P0, $P1, $P2, $kwpActuals);
    }
    public ITree parse(IValue $P0, IValue $P1, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       return (ITree) M_ParseTree.parse($P0, $P1, $kwpActuals);
    }
    public TypedFunctionInstance3<IValue, IValue, IValue, IValue> parsers(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       return (TypedFunctionInstance3<IValue, IValue, IValue, IValue>) M_ParseTree.parsers($P0, $kwpActuals);
    }
    public IList concat(IValue $P0){ // Generated by Resolver
       return (IList) M_List.concat($P0);
    }
    public IBool intersects(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IBool) M_Type.intersects($P0, $P1);
    }
    public IValue top(IValue $P0){ // Generated by Resolver
       return (IValue) M_List.top($P0);
    }
    public IString itoString(IValue $P0){ // Generated by Resolver
       return (IString) M_List.itoString($P0);
    }
    public IValue last(IValue $P0){ // Generated by Resolver
       return (IValue) M_List.last($P0);
    }
    public IConstructor striprec(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol)){
         $result = (IConstructor)striprec$65016c35e152c386((IConstructor) $P0);
         if($result != null) return $result;
         $result = (IConstructor)M_lang_rascal_grammar_definition_Symbols.striprec$940249987df9573b((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList intersperse(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.intersperse($P0, $P1);
    }
    public IList merge(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       return (IList) M_List.merge($P0, $P1, $P2);
    }
    public IList merge(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.merge($P0, $P1);
    }
    public IConstructor strip(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       switch(Fingerprint.getFingerprint($P0)){
       	
       case 1643638592:
       		if($isSubtypeOf($P0Type, M_Type.ADT_Symbol)){
       		  $result = (IConstructor)strip$7ed4e2ded4dfeea9((IConstructor) $P0);
       		  if($result != null) return $result;
       		  $result = (IConstructor)M_lang_rascal_grammar_definition_Symbols.strip$c3c2ce8c421ad271((IConstructor) $P0);
       		  if($result != null) return $result;
       		}
       		break;	
       case -2144737184:
       		if($isSubtypeOf($P0Type, M_Type.ADT_Symbol)){
       		  $result = (IConstructor)strip$da2dbb10ad3e1058((IConstructor) $P0);
       		  if($result != null) return $result;
       		  $result = (IConstructor)M_lang_rascal_grammar_definition_Symbols.strip$7e488443a1dcf4b5((IConstructor) $P0);
       		  if($result != null) return $result;
       		}
       		break;
       }
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol)){
         $result = (IConstructor)strip$123f0b34c6070c0a((IConstructor) $P0);
         if($result != null) return $result;
         $result = (IConstructor)M_lang_rascal_grammar_definition_Symbols.strip$f35045192114982b((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IConstructor rel(IValue $P0){ // Generated by Resolver
       return (IConstructor) M_Type.rel($P0);
    }
    public IBool isNonTerminalType(IValue $P0){ // Generated by Resolver
       return (IBool) M_ParseTree.isNonTerminalType($P0);
    }
    public IValue typeCast(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IValue) M_Type.typeCast($P0, $P1);
    }
    public IValue lub(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IValue) M_Type.lub($P0, $P1);
    }
    public ISet except(IValue $P0, IValue $P1){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       switch(Fingerprint.getFingerprint($P0)){
       	
       case 101776608:
       		if($isSubtypeOf($P0Type, M_Type.ADT_Production) && $isSubtypeOf($P1Type, M_Grammar.ADT_Grammar)){
       		  $result = (ISet)except$d2f4254084079d53((IConstructor) $P0, (IConstructor) $P1);
       		  if($result != null) return $result;
       		}
       		break;	
       case 110389984:
       		if($isSubtypeOf($P0Type, M_Type.ADT_Production) && $isSubtypeOf($P1Type, M_Grammar.ADT_Grammar)){
       		  $result = (ISet)except$d276f0c8da39329d((IConstructor) $P0, (IConstructor) $P1);
       		  if($result != null) return $result;
       		}
       		break;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public ISourceLocation find(IValue $P0, IValue $P1){ // Generated by Resolver
       return (ISourceLocation) M_IO.find($P0, $P1);
    }
    public IConstructor find(IValue $P0, IValue $P1, IValue $P2, IValue $P3){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       Type $P3Type = $P3.getType();
       if($isSubtypeOf($P0Type,$T9) && $isSubtypeOf($P1Type, M_Type.ADT_Symbol) && $isSubtypeOf($P2Type, M_Type.ADT_Symbol) && $isSubtypeOf($P3Type, M_Grammar.ADT_Grammar)){
         $result = (IConstructor)find$c2b2b71e6e1c54f5((IString) $P0, (IConstructor) $P1, (IConstructor) $P2, (IConstructor) $P3);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2, $P3));
    }
    public IList shuffle(IValue $P0){ // Generated by Resolver
       return (IList) M_List.shuffle($P0);
    }
    public IList shuffle(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.shuffle($P0, $P1);
    }
    public IConstructor overloaded(IValue $P0){ // Generated by Resolver
       return (IConstructor) M_Type.overloaded($P0);
    }
    public IBool comparable(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IBool) M_Type.comparable($P0, $P1);
    }
    public IBool subtype(IValue $P0, IValue $P1){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol) && $isSubtypeOf($P1Type, M_Type.ADT_Symbol)){
         $result = (IBool)M_ParseTree.subtype$3580db8bffd2c66d((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol) && $isSubtypeOf($P1Type, M_Type.ADT_Symbol)){
         $result = (IBool)M_Type.subtype$5812ee03e14f807b((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T10) && $isSubtypeOf($P1Type,$T11)){
         $result = (IBool)M_Type.subtype$5251fdf562c874a7((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
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
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol) && $isSubtypeOf($P1Type, M_ParseTree.ADT_Associativity) && $isSubtypeOf($P2Type,$T14)){
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
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol) && $isSubtypeOf($P1Type, M_ParseTree.ADT_Associativity) && $isSubtypeOf($P2Type,$T14)){
         return $RVF.constructor(M_ParseTree.Production_associativity_Symbol_Associativity_set_Production, new IValue[]{(IConstructor) $P0, (IConstructor) $P1, (ISet) $P2});
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IValue getOneFrom(IValue $P0){ // Generated by Resolver
       return (IValue) M_List.getOneFrom($P0);
    }
    public IString unparse(IValue $P0){ // Generated by Resolver
       return (IString) M_ParseTree.unparse($P0);
    }
    public IMap removeFromBag(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       return (IMap) M_List.removeFromBag($P0, $P1, $P2);
    }
    public IMap removeFromBag(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IMap) M_List.removeFromBag($P0, $P1);
    }
    public ITuple split(IValue $P0){ // Generated by Resolver
       return (ITuple) M_List.split($P0);
    }
    public IList push(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.push($P0, $P1);
    }
    public ISet permutationsBag(IValue $P0){ // Generated by Resolver
       return (ISet) M_List.permutationsBag($P0);
    }
    public IBool isdef(IValue $P0, IValue $P1){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type, M_Grammar.ADT_Grammar) && $isSubtypeOf($P1Type, M_Type.ADT_Symbol)){
         $result = (IBool)isdef$d7bbd25caf107523((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public ITree reposition(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       return (ITree) M_ParseTree.reposition($P0, $kwpActuals);
    }
    public IList mix(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.mix($P0, $P1);
    }
    public IInteger mainMessageHandler(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       return (IInteger) M_Message.mainMessageHandler($P0, $kwpActuals);
    }
    public IValue glb(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IValue) M_Type.glb($P0, $P1);
    }
    public ITree firstAmbiguity(IValue $P0, IValue $P1){ // Generated by Resolver
       return (ITree) M_ParseTree.firstAmbiguity($P0, $P1);
    }
    public ISet toRel(IValue $P0){ // Generated by Resolver
       return (ISet) M_List.toRel($P0);
    }
    public IValue sort(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T4)){
         $result = (IValue)M_List.sort$fa0b19c35a18e804((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T9)){
         return $RVF.constructor(M_ParseTree.Symbol_sort_str, new IValue[]{(IString) $P0});
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList sort(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.sort($P0, $P1);
    }
    public TypedFunctionInstance2<IValue, IValue, IValue> parser(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       return (TypedFunctionInstance2<IValue, IValue, IValue>) M_ParseTree.parser($P0, $kwpActuals);
    }
    public IConstructor seq(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T15)){
         $result = (IConstructor)M_lang_rascal_grammar_definition_Symbols.seq$0a415a2b58bb9727((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T15)){
         return $RVF.constructor(M_ParseTree.Symbol_seq_list_Symbol, new IValue[]{(IList) $P0});
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList dup(IValue $P0){ // Generated by Resolver
       return (IList) M_List.dup($P0);
    }
    public IList group(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.group($P0, $P1);
    }
    public IString write(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       return (IString) M_Message.write($P0, $kwpActuals);
    }

    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Priorities.rsc|(872,5776,<28,0>,<132,1>) 
    public ISet doNotNest$ae210627e1e180e4(IConstructor g_0){ 
        
        
        g_0 = ((IConstructor)(M_lang_rascal_grammar_definition_References.references(((IConstructor)g_0))));
        ISet result_1 = ((ISet)$constants.get(0)/*{}*/);
        /*muExists*/FOR0: 
            do {
                FOR0_GEN2086:
                for(IValue $elem63_for : ((IMap)(((IMap)($aadt_get_field(((IConstructor)g_0), "rules")))))){
                    IConstructor $elem63 = (IConstructor) $elem63_for;
                    IConstructor s_2 = ((IConstructor)($elem63));
                    ISet defined_3 = ((ISet)(extract(((IConstructor)($amap_subscript(((IMap)(((IMap)($aadt_get_field(((IConstructor)g_0), "rules"))))),((IConstructor)s_2)))))));
                    final ISetWriter $setwriter0 = (ISetWriter)$RVF.setWriter();
                    ;
                    $SCOMP1_GEN2813:
                    for(IValue $elem2_for : ((ISet)defined_3)){
                        IValue $elem2 = (IValue) $elem2_for;
                        final IValue $tuple_subject3 = ((IValue)($elem2));
                        if($tuple_subject3 instanceof ITuple && ((ITuple)$tuple_subject3).arity() == 3){
                           /*muExists*/$SCOMP1_GEN2813_TUPLE: 
                               do {
                                   IConstructor f_5 = null;
                                   final IConstructor $subject4 = ((IConstructor)($subscript_int(((IValue)($tuple_subject3)),1)));
                                   if($has_type_and_arity($subject4, M_ParseTree.Associativity_left_, 0)){
                                      IConstructor c_6 = null;
                                      $setwriter0.insert($RVF.tuple(((IConstructor)($subscript_int(((IValue)($tuple_subject3)),0))), ((IConstructor)($subscript_int(((IValue)($tuple_subject3)),2)))));
                                   
                                   } else {
                                      continue $SCOMP1_GEN2813_TUPLE;/*computeFail*/
                                   }
                               } while(false);
                        
                        } else {
                           continue $SCOMP1_GEN2813;
                        }
                    }
                    
                                ISet lefts_4 = ((ISet)(((ISet)($setwriter0.done())).asRelation().closure()));
                    final ISetWriter $setwriter5 = (ISetWriter)$RVF.setWriter();
                    ;
                    $SCOMP6_GEN2872:
                    for(IValue $elem7_for : ((ISet)defined_3)){
                        IValue $elem7 = (IValue) $elem7_for;
                        final IValue $tuple_subject8 = ((IValue)($elem7));
                        if($tuple_subject8 instanceof ITuple && ((ITuple)$tuple_subject8).arity() == 3){
                           /*muExists*/$SCOMP6_GEN2872_TUPLE: 
                               do {
                                   IConstructor f_8 = null;
                                   final IConstructor $subject9 = ((IConstructor)($subscript_int(((IValue)($tuple_subject8)),1)));
                                   if($has_type_and_arity($subject9, M_ParseTree.Associativity_right_, 0)){
                                      IConstructor c_9 = null;
                                      $setwriter5.insert($RVF.tuple(((IConstructor)($subscript_int(((IValue)($tuple_subject8)),0))), ((IConstructor)($subscript_int(((IValue)($tuple_subject8)),2)))));
                                   
                                   } else {
                                      continue $SCOMP6_GEN2872_TUPLE;/*computeFail*/
                                   }
                               } while(false);
                        
                        } else {
                           continue $SCOMP6_GEN2872;
                        }
                    }
                    
                                ISet rights_7 = ((ISet)(((ISet)($setwriter5.done())).asRelation().closure()));
                    final ISetWriter $setwriter10 = (ISetWriter)$RVF.setWriter();
                    ;
                    $SCOMP11_GEN2932:
                    for(IValue $elem12_for : ((ISet)defined_3)){
                        IValue $elem12 = (IValue) $elem12_for;
                        final IValue $tuple_subject13 = ((IValue)($elem12));
                        if($tuple_subject13 instanceof ITuple && ((ITuple)$tuple_subject13).arity() == 3){
                           /*muExists*/$SCOMP11_GEN2932_TUPLE: 
                               do {
                                   IConstructor f_11 = null;
                                   final IConstructor $subject14 = ((IConstructor)($subscript_int(((IValue)($tuple_subject13)),1)));
                                   if($has_type_and_arity($subject14, M_ParseTree.Associativity_non_assoc_, 0)){
                                      IConstructor c_12 = null;
                                      $setwriter10.insert($RVF.tuple(((IConstructor)($subscript_int(((IValue)($tuple_subject13)),0))), ((IConstructor)($subscript_int(((IValue)($tuple_subject13)),2)))));
                                   
                                   } else {
                                      continue $SCOMP11_GEN2932_TUPLE;/*computeFail*/
                                   }
                               } while(false);
                        
                        } else {
                           continue $SCOMP11_GEN2932;
                        }
                    }
                    
                                ISet nons_10 = ((ISet)(((ISet)($setwriter10.done())).asRelation().closure()));
                    final ISetWriter $setwriter15 = (ISetWriter)$RVF.setWriter();
                    ;
                    $SCOMP16_GEN2991:
                    for(IValue $elem17_for : ((ISet)defined_3)){
                        IValue $elem17 = (IValue) $elem17_for;
                        final IValue $tuple_subject18 = ((IValue)($elem17));
                        if($tuple_subject18 instanceof ITuple && ((ITuple)$tuple_subject18).arity() == 3){
                           /*muExists*/$SCOMP16_GEN2991_TUPLE: 
                               do {
                                   IConstructor f_14 = null;
                                   final IConstructor $subject19 = ((IConstructor)($subscript_int(((IValue)($tuple_subject18)),1)));
                                   if($has_type_and_arity($subject19, Associativity_prio_, 0)){
                                      IConstructor c_15 = null;
                                      $setwriter15.insert($RVF.tuple(((IConstructor)($subscript_int(((IValue)($tuple_subject18)),0))), ((IConstructor)($subscript_int(((IValue)($tuple_subject18)),2)))));
                                   
                                   } else {
                                      continue $SCOMP16_GEN2991_TUPLE;/*computeFail*/
                                   }
                               } while(false);
                        
                        } else {
                           continue $SCOMP16_GEN2991;
                        }
                    }
                    
                                ISet prios_13 = ((ISet)($setwriter15.done()));
                    ISet groups_16 = ((ISet)($aset_add_aset(((ISet)($aset_add_aset(((ISet)lefts_4),((ISet)rights_7)))),((ISet)nons_10))));
                    prios_13 = ((ISet)($aset_add_aset(((ISet)prios_13),((ISet)($aset_add_aset(((ISet)(((ISet)prios_13).asRelation().compose(((ISet)groups_16).asRelation()))),((ISet)(((ISet)groups_16).asRelation().compose(((ISet)prios_13).asRelation())))))))));
                    prios_13 = ((ISet)(((ISet)prios_13).asRelation().closure()));
                    /*muExists*/FOR1: 
                        do {
                            FOR1_GEN3599:
                            for(IValue $elem22_for : ((ISet)(((ISet)lefts_4).intersect(((ISet)rights_7))))){
                                IValue $elem22 = (IValue) $elem22_for;
                                final IValue $tuple_subject23 = ((IValue)($elem22));
                                if($tuple_subject23 instanceof ITuple && ((ITuple)$tuple_subject23).arity() == 2){
                                   /*muExists*/FOR1_GEN3599_TUPLE: 
                                       do {
                                           IConstructor f_17 = ((IConstructor)($subscript_int(((IValue)($tuple_subject23)),0)));
                                           IConstructor c_18 = ((IConstructor)($subscript_int(((IValue)($tuple_subject23)),1)));
                                           if((((IBool)($equal(((IConstructor)f_17), ((IConstructor)c_18))))).getValue()){
                                              final Template $template21 = (Template)new Template($RVF, "warning, not syntax-safe: ");
                                              $template21.beginIndent("                          ");
                                              $template21.addStr(((IString)(M_lang_rascal_format_Grammar.prod2rascal(((IConstructor)f_17)))).getValue());
                                              $template21.endIndent("                          ");
                                              $template21.addStr(" is both left and right associative.");
                                              M_IO.println(((IValue)($template21.close())));
                                           
                                           } else {
                                              final Template $template20 = (Template)new Template($RVF, "warning, not syntax-safe: ");
                                              $template20.beginIndent("                          ");
                                              $template20.addStr(((IString)(M_lang_rascal_format_Grammar.prod2rascal(((IConstructor)f_17)))).getValue());
                                              $template20.endIndent("                          ");
                                              $template20.addStr(" and ");
                                              $template20.beginIndent("     ");
                                              $template20.addStr(((IString)(M_lang_rascal_format_Grammar.prod2rascal(((IConstructor)c_18)))).getValue());
                                              $template20.endIndent("     ");
                                              $template20.addStr(" are both left and right associative to eachother.");
                                              M_IO.println(((IValue)($template20.close())));
                                           
                                           }
                                       } while(false);
                                
                                } else {
                                   continue FOR1_GEN3599;
                                }
                            }
                            continue FOR1;
                                        
                        } while(false);
                    /* void:  muCon([]) *//*muExists*/FOR3: 
                        do {
                            FOR3_GEN4073:
                            for(IValue $elem26_for : ((ISet)(((ISet)prios_13).intersect(((ISet)($arel_field_project((ISet)((ISet)prios_13), ((IInteger)$constants.get(1)/*1*/), ((IInteger)$constants.get(2)/*0*/)))))))){
                                IValue $elem26 = (IValue) $elem26_for;
                                final IValue $tuple_subject27 = ((IValue)($elem26));
                                if($tuple_subject27 instanceof ITuple && ((ITuple)$tuple_subject27).arity() == 2){
                                   /*muExists*/FOR3_GEN4073_TUPLE: 
                                       do {
                                           IConstructor f_19 = ((IConstructor)($subscript_int(((IValue)($tuple_subject27)),0)));
                                           IConstructor c_20 = ((IConstructor)($subscript_int(((IValue)($tuple_subject27)),1)));
                                           if((((IBool)($equal(((IConstructor)f_19), ((IConstructor)c_20))))).getValue()){
                                              final Template $template25 = (Template)new Template($RVF, "warning, not syntax-safe: ");
                                              $template25.beginIndent("                          ");
                                              $template25.addStr(((IString)(M_lang_rascal_format_Grammar.prod2rascal(((IConstructor)f_19)))).getValue());
                                              $template25.endIndent("                          ");
                                              $template25.addStr(" > ");
                                              $template25.beginIndent("    ");
                                              $template25.addStr(((IString)(M_lang_rascal_format_Grammar.prod2rascal(((IConstructor)c_20)))).getValue());
                                              $template25.endIndent("    ");
                                              $template25.addStr(", has a priority with itself.");
                                              M_IO.println(((IValue)($template25.close())));
                                           
                                           } else {
                                              final Template $template24 = (Template)new Template($RVF, "warning, not syntax-safe: ");
                                              $template24.beginIndent("                          ");
                                              $template24.addStr(((IString)(M_lang_rascal_format_Grammar.prod2rascal(((IConstructor)f_19)))).getValue());
                                              $template24.endIndent("                          ");
                                              $template24.addStr(" {<,>} ");
                                              $template24.beginIndent("         ");
                                              $template24.addStr(((IString)(M_lang_rascal_format_Grammar.prod2rascal(((IConstructor)c_20)))).getValue());
                                              $template24.endIndent("         ");
                                              $template24.addStr(", reflexive priority.");
                                              M_IO.println(((IValue)($template24.close())));
                                           
                                           }
                                       } while(false);
                                
                                } else {
                                   continue FOR3_GEN4073;
                                }
                            }
                            continue FOR3;
                                        
                        } while(false);
                    /* void:  muCon([]) */final ISetWriter $setwriter28 = (ISetWriter)$RVF.setWriter();
                    ;
                    $SCOMP29_GEN4647:
                    for(IValue $elem32_for : ((ISet)($aset_add_aset(((ISet)($aset_add_aset(((ISet)prios_13),((ISet)rights_7)))),((ISet)nons_10))))){
                        IValue $elem32 = (IValue) $elem32_for;
                        final IValue $tuple_subject33 = ((IValue)($elem32));
                        if($tuple_subject33 instanceof ITuple && ((ITuple)$tuple_subject33).arity() == 2){
                           /*muExists*/$SCOMP29_GEN4647_TUPLE: 
                               do {
                                   final IConstructor $subject40 = ((IConstructor)($subscript_int(((IValue)($tuple_subject33)),0)));
                                   if($has_type_and_arity($subject40, M_ParseTree.Production_prod_Symbol_list_Symbol_set_Attr, 3)){
                                      IValue $arg0_45 = (IValue)($aadt_subscript_int(((IConstructor)($subject40)),0));
                                      if($isComparable($arg0_45.getType(), M_Type.ADT_Symbol)){
                                         if(true){
                                            IConstructor ss_22 = ((IConstructor)($arg0_45));
                                            IValue $arg1_42 = (IValue)($aadt_subscript_int(((IConstructor)($subject40)),1));
                                            if($isComparable($arg1_42.getType(), $T15)){
                                               final IList $subject43 = ((IList)($arg1_42));
                                               int $subject43_cursor = 0;
                                               if($isSubtypeOf($subject43.getType(),$T15)){
                                                  final int $subject43_len = (int)((IList)($subject43)).length();
                                                  if($subject43_len >= 1){
                                                     if($subject43_cursor < $subject43_len){
                                                        IConstructor lr_23 = ((IConstructor)($alist_subscript_int(((IList)($subject43)),$subject43_cursor)));
                                                        $subject43_cursor += 1;
                                                        final int $__144_start = (int)$subject43_cursor;
                                                        final int $__144_len = (int)$subject43_len - $__144_start - 0;
                                                        $subject43_cursor = $__144_start + $__144_len;
                                                        /*muExists*/$SCOMP29_GEN4647_TUPLE_CONS_prod_LIST_VARlr_MVAR$_30: 
                                                            do {
                                                                if($subject43_cursor == $subject43_len){
                                                                   IValue $arg2_41 = (IValue)($aadt_subscript_int(((IConstructor)($subject40)),2));
                                                                   if($isComparable($arg2_41.getType(), $T1)){
                                                                      IConstructor f_21 = ((IConstructor)($subscript_int(((IValue)($tuple_subject33)),0)));
                                                                      final IConstructor $subject34 = ((IConstructor)($subscript_int(((IValue)($tuple_subject33)),1)));
                                                                      if($has_type_and_arity($subject34, M_ParseTree.Production_prod_Symbol_list_Symbol_set_Attr, 3)){
                                                                         IValue $arg0_39 = (IValue)($aadt_subscript_int(((IConstructor)($subject34)),0));
                                                                         if($isComparable($arg0_39.getType(), M_Type.ADT_Symbol)){
                                                                            if(true){
                                                                               IConstructor t_25 = ((IConstructor)($arg0_39));
                                                                               IValue $arg1_36 = (IValue)($aadt_subscript_int(((IConstructor)($subject34)),1));
                                                                               if($isComparable($arg1_36.getType(), $T15)){
                                                                                  final IList $subject37 = ((IList)($arg1_36));
                                                                                  int $subject37_cursor = 0;
                                                                                  if($isSubtypeOf($subject37.getType(),$T15)){
                                                                                     final int $subject37_len = (int)((IList)($subject37)).length();
                                                                                     if($subject37_len >= 1){
                                                                                        final int $__138_start = (int)$subject37_cursor;
                                                                                        final int $__138_len = (int)$subject37_len - $__138_start - 1;
                                                                                        $subject37_cursor = $__138_start + $__138_len;
                                                                                        /*muExists*/$SCOMP29_GEN4647_TUPLE_CONS_prod_CONS_prod_LIST_MVAR$_31: 
                                                                                            do {
                                                                                                if($subject37_cursor < $subject37_len){
                                                                                                   IConstructor rr_26 = ((IConstructor)($alist_subscript_int(((IList)($subject37)),$subject37_cursor)));
                                                                                                   $subject37_cursor += 1;
                                                                                                   if($subject37_cursor == $subject37_len){
                                                                                                      IValue $arg2_35 = (IValue)($aadt_subscript_int(((IConstructor)($subject34)),2));
                                                                                                      if($isComparable($arg2_35.getType(), $T1)){
                                                                                                         IConstructor c_24 = ((IConstructor)($subscript_int(((IValue)($tuple_subject33)),1)));
                                                                                                         if((((IBool)($me.same(((IConstructor)($arg0_45)), ((IConstructor)lr_23))))).getValue()){
                                                                                                           if((((IBool)($me.same(((IConstructor)($arg0_39)), ((IConstructor)rr_26))))).getValue()){
                                                                                                             if((((IBool)($me.same(((IConstructor)($arg0_45)), ((IConstructor)($arg0_39)))))).getValue()){
                                                                                                               $setwriter28.insert($RVF.tuple(((IConstructor)f_21), ((IInteger)$constants.get(2)/*0*/), ((IConstructor)c_24)));
                                                                                                             
                                                                                                             } else {
                                                                                                               continue $SCOMP29_GEN4647_TUPLE_CONS_prod_CONS_prod_LIST_MVAR$_31;
                                                                                                             }
                                                                                                           
                                                                                                           } else {
                                                                                                             continue $SCOMP29_GEN4647_TUPLE_CONS_prod_CONS_prod_LIST_MVAR$_31;
                                                                                                           }
                                                                                                         
                                                                                                         } else {
                                                                                                           continue $SCOMP29_GEN4647_TUPLE_CONS_prod_CONS_prod_LIST_MVAR$_31;
                                                                                                         }
                                                                                                      
                                                                                                      } else {
                                                                                                         continue $SCOMP29_GEN4647_TUPLE_CONS_prod_CONS_prod_LIST_MVAR$_31;/*computeFail*/
                                                                                                      }
                                                                                                   } else {
                                                                                                      continue $SCOMP29_GEN4647_TUPLE_CONS_prod_CONS_prod_LIST_MVAR$_31;/*list match1*/
                                                                                                   }
                                                                                                } else {
                                                                                                   continue $SCOMP29_GEN4647_TUPLE_CONS_prod_CONS_prod_LIST_MVAR$_31;/*computeFail*/
                                                                                                }
                                                                                            } while(false);
                                                                                        continue $SCOMP29_GEN4647_TUPLE_CONS_prod_LIST_VARlr_MVAR$_30;/*computeFail*/
                                                                                     } else {
                                                                                        continue $SCOMP29_GEN4647_TUPLE_CONS_prod_LIST_VARlr_MVAR$_30;/*computeFail*/
                                                                                     }
                                                                                  } else {
                                                                                     continue $SCOMP29_GEN4647_TUPLE_CONS_prod_LIST_VARlr_MVAR$_30;/*computeFail*/
                                                                                  }
                                                                               } else {
                                                                                  continue $SCOMP29_GEN4647_TUPLE_CONS_prod_LIST_VARlr_MVAR$_30;/*computeFail*/
                                                                               }
                                                                            } else {
                                                                               continue $SCOMP29_GEN4647_TUPLE_CONS_prod_LIST_VARlr_MVAR$_30;/*computeFail*/
                                                                            }
                                                                         } else {
                                                                            continue $SCOMP29_GEN4647_TUPLE_CONS_prod_LIST_VARlr_MVAR$_30;/*computeFail*/
                                                                         }
                                                                      } else {
                                                                         continue $SCOMP29_GEN4647_TUPLE_CONS_prod_LIST_VARlr_MVAR$_30;/*computeFail*/
                                                                      }
                                                                   } else {
                                                                      continue $SCOMP29_GEN4647_TUPLE_CONS_prod_LIST_VARlr_MVAR$_30;/*computeFail*/
                                                                   }
                                                                } else {
                                                                   continue $SCOMP29_GEN4647_TUPLE_CONS_prod_LIST_VARlr_MVAR$_30;/*list match1*/
                                                                }
                                                            } while(false);
                                                        continue $SCOMP29_GEN4647;
                                                     } else {
                                                        continue $SCOMP29_GEN4647;
                                                     }
                                                  } else {
                                                     continue $SCOMP29_GEN4647;
                                                  }
                                               } else {
                                                  continue $SCOMP29_GEN4647;
                                               }
                                            } else {
                                               continue $SCOMP29_GEN4647;
                                            }
                                         } else {
                                            continue $SCOMP29_GEN4647;
                                         }
                                      } else {
                                         continue $SCOMP29_GEN4647;
                                      }
                                   } else {
                                      continue $SCOMP29_GEN4647;
                                   }
                               } while(false);
                        
                        } else {
                           continue $SCOMP29_GEN4647;
                        }
                    }
                    
                                final ISetWriter $setwriter46 = (ISetWriter)$RVF.setWriter();
                    ;
                    $SCOMP47_GEN4936:
                    for(IValue $elem49_for : ((ISet)($aset_add_aset(((ISet)($aset_add_aset(((ISet)prios_13),((ISet)lefts_4)))),((ISet)nons_10))))){
                        IValue $elem49 = (IValue) $elem49_for;
                        final IValue $tuple_subject50 = ((IValue)($elem49));
                        if($tuple_subject50 instanceof ITuple && ((ITuple)$tuple_subject50).arity() == 2){
                           /*muExists*/$SCOMP47_GEN4936_TUPLE: 
                               do {
                                   final IConstructor $subject57 = ((IConstructor)($subscript_int(((IValue)($tuple_subject50)),0)));
                                   if($has_type_and_arity($subject57, M_ParseTree.Production_prod_Symbol_list_Symbol_set_Attr, 3)){
                                      IValue $arg0_62 = (IValue)($aadt_subscript_int(((IConstructor)($subject57)),0));
                                      if($isComparable($arg0_62.getType(), M_Type.ADT_Symbol)){
                                         if(true){
                                            IConstructor ss_28 = ((IConstructor)($arg0_62));
                                            IValue $arg1_59 = (IValue)($aadt_subscript_int(((IConstructor)($subject57)),1));
                                            if($isComparable($arg1_59.getType(), $T15)){
                                               final IList $subject60 = ((IList)($arg1_59));
                                               int $subject60_cursor = 0;
                                               if($isSubtypeOf($subject60.getType(),$T15)){
                                                  final int $subject60_len = (int)((IList)($subject60)).length();
                                                  if($subject60_len >= 1){
                                                     final int $pre_2961_start = (int)$subject60_cursor;
                                                     $SCOMP47_GEN4936_TUPLE_CONS_prod_LIST_MVARpre:
                                                     
                                                     for(int $pre_2961_len = 0; $pre_2961_len <= $subject60_len - $pre_2961_start - 1; $pre_2961_len += 1){
                                                        IList pre_29 = ((IList)($subject60.sublist($pre_2961_start, $pre_2961_len)));
                                                        $subject60_cursor = $pre_2961_start + $pre_2961_len;
                                                        if($subject60_cursor < $subject60_len){
                                                           IConstructor rr_30 = ((IConstructor)($alist_subscript_int(((IList)($subject60)),$subject60_cursor)));
                                                           $subject60_cursor += 1;
                                                           if($subject60_cursor == $subject60_len){
                                                              IValue $arg2_58 = (IValue)($aadt_subscript_int(((IConstructor)($subject57)),2));
                                                              if($isComparable($arg2_58.getType(), $T1)){
                                                                 IConstructor f_27 = ((IConstructor)($subscript_int(((IValue)($tuple_subject50)),0)));
                                                                 final IConstructor $subject51 = ((IConstructor)($subscript_int(((IValue)($tuple_subject50)),1)));
                                                                 if($has_type_and_arity($subject51, M_ParseTree.Production_prod_Symbol_list_Symbol_set_Attr, 3)){
                                                                    IValue $arg0_56 = (IValue)($aadt_subscript_int(((IConstructor)($subject51)),0));
                                                                    if($isComparable($arg0_56.getType(), M_Type.ADT_Symbol)){
                                                                       if(true){
                                                                          IConstructor t_32 = ((IConstructor)($arg0_56));
                                                                          IValue $arg1_53 = (IValue)($aadt_subscript_int(((IConstructor)($subject51)),1));
                                                                          if($isComparable($arg1_53.getType(), $T15)){
                                                                             final IList $subject54 = ((IList)($arg1_53));
                                                                             int $subject54_cursor = 0;
                                                                             if($isSubtypeOf($subject54.getType(),$T15)){
                                                                                final int $subject54_len = (int)((IList)($subject54)).length();
                                                                                if($subject54_len >= 1){
                                                                                   if($subject54_cursor < $subject54_len){
                                                                                      IConstructor lr_33 = ((IConstructor)($alist_subscript_int(((IList)($subject54)),$subject54_cursor)));
                                                                                      $subject54_cursor += 1;
                                                                                      final int $__155_start = (int)$subject54_cursor;
                                                                                      final int $__155_len = (int)$subject54_len - $__155_start - 0;
                                                                                      $subject54_cursor = $__155_start + $__155_len;
                                                                                      /*muExists*/$SCOMP47_GEN4936_TUPLE_CONS_prod_CONS_prod_LIST_VARlr_MVAR$_48: 
                                                                                          do {
                                                                                              if($subject54_cursor == $subject54_len){
                                                                                                 IValue $arg2_52 = (IValue)($aadt_subscript_int(((IConstructor)($subject51)),2));
                                                                                                 if($isComparable($arg2_52.getType(), $T1)){
                                                                                                    IConstructor c_31 = ((IConstructor)($subscript_int(((IValue)($tuple_subject50)),1)));
                                                                                                    if((((IBool)($me.same(((IConstructor)($arg0_62)), ((IConstructor)rr_30))))).getValue()){
                                                                                                      if((((IBool)($me.same(((IConstructor)($arg0_56)), ((IConstructor)lr_33))))).getValue()){
                                                                                                        if((((IBool)($me.same(((IConstructor)($arg0_62)), ((IConstructor)($arg0_56)))))).getValue()){
                                                                                                          $setwriter46.insert($RVF.tuple(((IConstructor)f_27), ((IInteger)($me.size(((IList)pre_29)))), ((IConstructor)c_31)));
                                                                                                        
                                                                                                        } else {
                                                                                                          continue $SCOMP47_GEN4936_TUPLE_CONS_prod_CONS_prod_LIST_VARlr_MVAR$_48;
                                                                                                        }
                                                                                                      
                                                                                                      } else {
                                                                                                        continue $SCOMP47_GEN4936_TUPLE_CONS_prod_CONS_prod_LIST_VARlr_MVAR$_48;
                                                                                                      }
                                                                                                    
                                                                                                    } else {
                                                                                                      continue $SCOMP47_GEN4936_TUPLE_CONS_prod_CONS_prod_LIST_VARlr_MVAR$_48;
                                                                                                    }
                                                                                                 
                                                                                                 } else {
                                                                                                    continue $SCOMP47_GEN4936_TUPLE_CONS_prod_CONS_prod_LIST_VARlr_MVAR$_48;/*computeFail*/
                                                                                                 }
                                                                                              } else {
                                                                                                 continue $SCOMP47_GEN4936_TUPLE_CONS_prod_CONS_prod_LIST_VARlr_MVAR$_48;/*list match1*/
                                                                                              }
                                                                                          } while(false);
                                                                                      continue $SCOMP47_GEN4936_TUPLE_CONS_prod_LIST_MVARpre;/*computeFail*/
                                                                                   } else {
                                                                                      continue $SCOMP47_GEN4936_TUPLE_CONS_prod_LIST_MVARpre;/*computeFail*/
                                                                                   }
                                                                                } else {
                                                                                   continue $SCOMP47_GEN4936_TUPLE_CONS_prod_LIST_MVARpre;/*computeFail*/
                                                                                }
                                                                             } else {
                                                                                continue $SCOMP47_GEN4936_TUPLE_CONS_prod_LIST_MVARpre;/*computeFail*/
                                                                             }
                                                                          } else {
                                                                             continue $SCOMP47_GEN4936_TUPLE_CONS_prod_LIST_MVARpre;/*computeFail*/
                                                                          }
                                                                       } else {
                                                                          continue $SCOMP47_GEN4936_TUPLE_CONS_prod_LIST_MVARpre;/*computeFail*/
                                                                       }
                                                                    } else {
                                                                       continue $SCOMP47_GEN4936_TUPLE_CONS_prod_LIST_MVARpre;/*computeFail*/
                                                                    }
                                                                 } else {
                                                                    continue $SCOMP47_GEN4936_TUPLE_CONS_prod_LIST_MVARpre;/*computeFail*/
                                                                 }
                                                              } else {
                                                                 continue $SCOMP47_GEN4936_TUPLE_CONS_prod_LIST_MVARpre;/*computeFail*/
                                                              }
                                                           } else {
                                                              continue $SCOMP47_GEN4936_TUPLE_CONS_prod_LIST_MVARpre;/*list match1*/
                                                           }
                                                        } else {
                                                           continue $SCOMP47_GEN4936_TUPLE_CONS_prod_LIST_MVARpre;/*computeFail*/
                                                        }
                                                     }
                                                     continue $SCOMP47_GEN4936;
                                                  
                                                  } else {
                                                     continue $SCOMP47_GEN4936;
                                                  }
                                               } else {
                                                  continue $SCOMP47_GEN4936;
                                               }
                                            } else {
                                               continue $SCOMP47_GEN4936;
                                            }
                                         } else {
                                            continue $SCOMP47_GEN4936;
                                         }
                                      } else {
                                         continue $SCOMP47_GEN4936;
                                      }
                                   } else {
                                      continue $SCOMP47_GEN4936;
                                   }
                               } while(false);
                        
                        } else {
                           continue $SCOMP47_GEN4936;
                        }
                    }
                    
                                result_1 = ((ISet)($aset_add_aset(((ISet)result_1),((ISet)($aset_add_aset(((ISet)($setwriter28.done())),((ISet)($setwriter46.done()))))))));
                
                }
                continue FOR0;
                            
            } while(false);
        /* void:  muCon([]) */final ISetWriter $setwriter64 = (ISetWriter)$RVF.setWriter();
        ;
        $SCOMP65_GEN6598:
        for(IValue $elem66_for : ((IConstructor)g_0)){
            IValue $elem66 = (IValue) $elem66_for;
            $SCOMP65_GEN6598_DESC6598:
            for(IValue $elem67 : new DescendantMatchIterator($elem66, 
                new DescendantDescriptorAlwaysTrue($RVF.bool(false)))){
                if($isComparable($elem67.getType(), M_Type.ADT_Production)){
                   if($isSubtypeOf($elem67.getType(),M_Type.ADT_Production)){
                      IConstructor p_34 = null;
                      if($is(((IConstructor)($elem67)),((IString)$constants.get(3)/*"prod"*/))){
                        $setwriter_splice($setwriter64,except(((IConstructor)($elem67)), ((IConstructor)g_0)));
                      
                      } else {
                        if($is(((IConstructor)($elem67)),((IString)$constants.get(4)/*"regular"*/))){
                          $setwriter_splice($setwriter64,except(((IConstructor)($elem67)), ((IConstructor)g_0)));
                        
                        } else {
                          continue $SCOMP65_GEN6598_DESC6598;
                        }
                      
                      }
                   
                   } else {
                      continue $SCOMP65_GEN6598_DESC6598;
                   }
                } else {
                   continue $SCOMP65_GEN6598_DESC6598;
                }
            }
            continue $SCOMP65_GEN6598;
                         
        }
        
                    return ((ISet)($aset_add_aset(((ISet)result_1),((ISet)($setwriter64.done())))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Priorities.rsc|(6652,45,<134,0>,<134,45>) 
    public ISet extract$854ea82ef14e27e0(IConstructor $__0){ 
        
        
        return ((ISet)$constants.get(0)/*{}*/);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Priorities.rsc|(6702,90,<136,0>,<137,30>) 
    public ISet extract$12411589ebde364e(IConstructor $0){ 
        
        
        if($has_type_and_arity($0, M_Type.Production_choice_Symbol_set_Production, 2)){
           IValue $arg0_72 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_72.getType(), M_Type.ADT_Symbol)){
              IConstructor s_0 = null;
              IValue $arg1_71 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
              if($isComparable($arg1_71.getType(), $T14)){
                 ISet alts_1 = null;
                 final ISetWriter $setwriter68 = (ISetWriter)$RVF.setWriter();
                 ;
                 $SCOMP69_GEN6781:
                 for(IValue $elem70_for : ((ISet)($arg1_71))){
                     IConstructor $elem70 = (IConstructor) $elem70_for;
                     IConstructor a_2 = null;
                     $setwriter_splice($setwriter68,extract(((IConstructor)($elem70))));
                 
                 }
                 
                             return ((ISet)($setwriter68.done()));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Priorities.rsc|(6903,125,<140,0>,<141,40>) 
    public ISet extract$36b34b298fada776(IConstructor $0){ 
        
        
        if($has_type_and_arity($0, M_ParseTree.Production_associativity_Symbol_Associativity_set_Production, 3)){
           IValue $arg0_79 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_79.getType(), M_Type.ADT_Symbol)){
              if(true){
                 IConstructor s_0 = null;
                 IValue $arg1_78 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
                 if($isComparable($arg1_78.getType(), M_ParseTree.ADT_Associativity)){
                    if(true){
                       IConstructor a_1 = null;
                       IValue $arg2_77 = (IValue)($aadt_subscript_int(((IConstructor)$0),2));
                       if($isComparable($arg2_77.getType(), $T14)){
                          if(true){
                             ISet alts_2 = null;
                             final ISetWriter $setwriter73 = (ISetWriter)$RVF.setWriter();
                             ;
                             $SCOMP74_GEN7005:
                             for(IValue $elem75_for : ((ISet)($aset_product_aset(((ISet)($arg2_77)),((ISet)($arg2_77)))))){
                                 IValue $elem75 = (IValue) $elem75_for;
                                 final IValue $tuple_subject76 = ((IValue)($elem75));
                                 if($tuple_subject76 instanceof ITuple && ((ITuple)$tuple_subject76).arity() == 2){
                                    /*muExists*/$SCOMP74_GEN7005_TUPLE: 
                                        do {
                                            IConstructor x_3 = null;
                                            IConstructor y_4 = null;
                                            $setwriter73.insert($RVF.tuple(((IConstructor)($subscript_int(((IValue)($tuple_subject76)),0))), ((IConstructor)($arg1_78)), ((IConstructor)($subscript_int(((IValue)($tuple_subject76)),1)))));
                                    
                                        } while(false);
                                 
                                 } else {
                                    continue $SCOMP74_GEN7005;
                                 }
                             }
                             
                                         return ((ISet)($setwriter73.done()));
                          
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Priorities.rsc|(7032,145,<143,0>,<144,80>) 
    public ISet extract$1ff12ed142411ae7(IConstructor $0){ 
        
        
        if($has_type_and_arity($0, M_ParseTree.Production_priority_Symbol_list_Production, 2)){
           IValue $arg0_88 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_88.getType(), M_Type.ADT_Symbol)){
              if(true){
                 IConstructor s_0 = null;
                 IValue $arg1_87 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
                 if($isComparable($arg1_87.getType(), $T19)){
                    if(true){
                       IList levels_1 = null;
                       final ISetWriter $setwriter80 = (ISetWriter)$RVF.setWriter();
                       ;
                       /*muExists*/$SCOMP81: 
                           do {
                               final IList $subject84 = ((IList)($arg1_87));
                               int $subject84_cursor = 0;
                               if($isSubtypeOf($subject84.getType(),$T19)){
                                  final int $subject84_len = (int)((IList)($subject84)).length();
                                  if($subject84_len >= 2){
                                     final int $__186_start = (int)$subject84_cursor;
                                     $SCOMP81_LIST_MVAR$_82:
                                     
                                     for(int $__186_len = 0; $__186_len <= $subject84_len - $__186_start - 2; $__186_len += 1){
                                        $subject84_cursor = $__186_start + $__186_len;
                                        if($subject84_cursor < $subject84_len){
                                           IConstructor high_2 = ((IConstructor)($alist_subscript_int(((IList)($subject84)),$subject84_cursor)));
                                           $subject84_cursor += 1;
                                           if($subject84_cursor < $subject84_len){
                                              IConstructor low_3 = ((IConstructor)($alist_subscript_int(((IList)($subject84)),$subject84_cursor)));
                                              $subject84_cursor += 1;
                                              final int $__185_start = (int)$subject84_cursor;
                                              final int $__185_len = (int)$subject84_len - $__185_start - 0;
                                              $subject84_cursor = $__185_start + $__185_len;
                                              /*muExists*/$SCOMP81_LIST_MVAR$_82_VARhigh_VARlow_MVAR$_83: 
                                                  do {
                                                      if($subject84_cursor == $subject84_len){
                                                         $setwriter_splice($setwriter80,extract(((IConstructor)high_2), ((IConstructor)low_3)));
                                                      
                                                      } else {
                                                         continue $SCOMP81_LIST_MVAR$_82_VARhigh_VARlow_MVAR$_83;/*list match1*/
                                                      }
                                                  } while(false);
                                              continue $SCOMP81_LIST_MVAR$_82;/*computeFail*/
                                           } else {
                                              continue $SCOMP81_LIST_MVAR$_82;/*computeFail*/
                                           }
                                        } else {
                                           continue $SCOMP81_LIST_MVAR$_82;/*computeFail*/
                                        }
                                     }
                                     
                                  
                                  }
                               
                               }
                       
                           } while(false);
                       return ((ISet)($setwriter80.done()));
                    
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Priorities.rsc|(7376,81,<148,0>,<149,26>) 
    public ISet extract$3c0c80a7f79c719e(IConstructor high_0, IConstructor low_1){ 
        
        
        if($has_type_and_arity(high_0, M_ParseTree.Production_prod_Symbol_list_Symbol_set_Attr, 3)){
           IValue $arg0_94 = (IValue)($aadt_subscript_int(((IConstructor)high_0),0));
           if($isComparable($arg0_94.getType(), $T1)){
              IValue $arg1_93 = (IValue)($aadt_subscript_int(((IConstructor)high_0),1));
              if($isComparable($arg1_93.getType(), $T1)){
                 IValue $arg2_92 = (IValue)($aadt_subscript_int(((IConstructor)high_0),2));
                 if($isComparable($arg2_92.getType(), $T1)){
                    if($has_type_and_arity(low_1, M_ParseTree.Production_prod_Symbol_list_Symbol_set_Attr, 3)){
                       IValue $arg0_91 = (IValue)($aadt_subscript_int(((IConstructor)low_1),0));
                       if($isComparable($arg0_91.getType(), $T1)){
                          IValue $arg1_90 = (IValue)($aadt_subscript_int(((IConstructor)low_1),1));
                          if($isComparable($arg1_90.getType(), $T1)){
                             IValue $arg2_89 = (IValue)($aadt_subscript_int(((IConstructor)low_1),2));
                             if($isComparable($arg2_89.getType(), $T1)){
                                return ((ISet)($RVF.set(((IValue)($RVF.tuple(((IConstructor)high_0), ((IConstructor)($RVF.constructor(Associativity_prio_, new IValue[]{}))), ((IConstructor)low_1)))))));
                             
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Priorities.rsc|(7463,109,<151,0>,<152,41>) 
    public ISet extract$42b76330dba83192(IConstructor $0, IConstructor low_1){ 
        
        
        if($has_type_and_arity($0, M_Type.Production_choice_Symbol_set_Production, 2)){
           IValue $arg0_99 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_99.getType(), $T1)){
              IValue $arg1_98 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
              if($isComparable($arg1_98.getType(), $T14)){
                 ISet alts_0 = null;
                 final ISetWriter $setwriter95 = (ISetWriter)$RVF.setWriter();
                 ;
                 $SCOMP96_GEN7558:
                 for(IValue $elem97_for : ((ISet)($arg1_98))){
                     IConstructor $elem97 = (IConstructor) $elem97_for;
                     IConstructor high_2 = null;
                     $setwriter_splice($setwriter95,extract(((IConstructor)($elem97)), ((IConstructor)low_1)));
                 
                 }
                 
                             return ((ISet)($setwriter95.done()));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Priorities.rsc|(7579,109,<154,0>,<155,40>) 
    public ISet extract$d6c0ce92bf6e785b(IConstructor high_0, IConstructor $1){ 
        
        
        if($has_type_and_arity($1, M_Type.Production_choice_Symbol_set_Production, 2)){
           IValue $arg0_104 = (IValue)($aadt_subscript_int(((IConstructor)$1),0));
           if($isComparable($arg0_104.getType(), $T1)){
              IValue $arg1_103 = (IValue)($aadt_subscript_int(((IConstructor)$1),1));
              if($isComparable($arg1_103.getType(), $T14)){
                 ISet alts_1 = null;
                 final ISetWriter $setwriter100 = (ISetWriter)$RVF.setWriter();
                 ;
                 $SCOMP101_GEN7675:
                 for(IValue $elem102_for : ((ISet)($arg1_103))){
                     IConstructor $elem102 = (IConstructor) $elem102_for;
                     IConstructor low_2 = null;
                     $setwriter_splice($setwriter100,extract(((IConstructor)high_0), ((IConstructor)($elem102))));
                 
                 }
                 
                             return ((ISet)($setwriter100.done()));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Priorities.rsc|(7693,148,<157,0>,<159,15>) 
    public ISet extract$1f17b589f355e891(IConstructor a_0, IConstructor low_2){ 
        
        
        if($has_type_and_arity(a_0, M_ParseTree.Production_associativity_Symbol_Associativity_set_Production, 3)){
           IValue $arg0_110 = (IValue)($aadt_subscript_int(((IConstructor)a_0),0));
           if($isComparable($arg0_110.getType(), $T1)){
              IValue $arg1_109 = (IValue)($aadt_subscript_int(((IConstructor)a_0),1));
              if($isComparable($arg1_109.getType(), $T1)){
                 IValue $arg2_108 = (IValue)($aadt_subscript_int(((IConstructor)a_0),2));
                 if($isComparable($arg2_108.getType(), $T14)){
                    ISet alts_1 = null;
                    final ISetWriter $setwriter105 = (ISetWriter)$RVF.setWriter();
                    ;
                    $SCOMP106_GEN7811:
                    for(IValue $elem107_for : ((ISet)($arg2_108))){
                        IConstructor $elem107 = (IConstructor) $elem107_for;
                        IConstructor high_3 = null;
                        $setwriter_splice($setwriter105,extract(((IConstructor)($elem107)), ((IConstructor)low_2)));
                    
                    }
                    
                                return ((ISet)($aset_add_aset(((ISet)($setwriter105.done())),((ISet)(extract(((IConstructor)a_0)))))));
                 
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Priorities.rsc|(7848,148,<161,0>,<163,15>) 
    public ISet extract$7394180a0fe67e22(IConstructor high_0, IConstructor a_1){ 
        
        
        if($has_type_and_arity(a_1, M_ParseTree.Production_associativity_Symbol_Associativity_set_Production, 3)){
           IValue $arg0_116 = (IValue)($aadt_subscript_int(((IConstructor)a_1),0));
           if($isComparable($arg0_116.getType(), $T1)){
              IValue $arg1_115 = (IValue)($aadt_subscript_int(((IConstructor)a_1),1));
              if($isComparable($arg1_115.getType(), $T1)){
                 IValue $arg2_114 = (IValue)($aadt_subscript_int(((IConstructor)a_1),2));
                 if($isComparable($arg2_114.getType(), $T14)){
                    ISet alts_2 = null;
                    final ISetWriter $setwriter111 = (ISetWriter)$RVF.setWriter();
                    ;
                    $SCOMP112_GEN7967:
                    for(IValue $elem113_for : ((ISet)($arg2_114))){
                        IConstructor $elem113 = (IConstructor) $elem113_for;
                        IConstructor low_3 = null;
                        $setwriter_splice($setwriter111,extract(((IConstructor)high_0), ((IConstructor)($elem113))));
                    
                    }
                    
                                return ((ISet)($aset_add_aset(((ISet)($setwriter111.done())),((ISet)(extract(((IConstructor)a_1)))))));
                 
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Priorities.rsc|(8002,148,<165,0>,<167,41>) 
    public ISet extract$ade6968c812a18eb(IConstructor p_0, IConstructor low_2){ 
        
        
        if($has_type_and_arity(p_0, M_ParseTree.Production_priority_Symbol_list_Production, 2)){
           IValue $arg0_121 = (IValue)($aadt_subscript_int(((IConstructor)p_0),0));
           if($isComparable($arg0_121.getType(), M_Type.ADT_Symbol)){
              IValue $arg1_120 = (IValue)($aadt_subscript_int(((IConstructor)p_0),1));
              if($isComparable($arg1_120.getType(), $T19)){
                 IList alts_1 = null;
                 final ISetWriter $setwriter117 = (ISetWriter)$RVF.setWriter();
                 ;
                 $SCOMP118_GEN8136:
                 for(IValue $elem119_for : ((IList)($arg1_120))){
                     IConstructor $elem119 = (IConstructor) $elem119_for;
                     IConstructor high_3 = null;
                     $setwriter_splice($setwriter117,extract(((IConstructor)($elem119)), ((IConstructor)low_2)));
                 
                 }
                 
                             return ((ISet)($aset_add_aset(((ISet)(extract(((IConstructor)p_0)))),((ISet)($setwriter117.done())))));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Priorities.rsc|(8157,148,<169,0>,<171,40>) 
    public ISet extract$26b58ea803b8e739(IConstructor high_0, IConstructor p_1){ 
        
        
        if($has_type_and_arity(p_1, M_ParseTree.Production_priority_Symbol_list_Production, 2)){
           IValue $arg0_126 = (IValue)($aadt_subscript_int(((IConstructor)p_1),0));
           if($isComparable($arg0_126.getType(), M_Type.ADT_Symbol)){
              IValue $arg1_125 = (IValue)($aadt_subscript_int(((IConstructor)p_1),1));
              if($isComparable($arg1_125.getType(), $T19)){
                 IList alts_2 = null;
                 final ISetWriter $setwriter122 = (ISetWriter)$RVF.setWriter();
                 ;
                 $SCOMP123_GEN8292:
                 for(IValue $elem124_for : ((IList)($arg1_125))){
                     IConstructor $elem124 = (IConstructor) $elem124_for;
                     IConstructor low_3 = null;
                     $setwriter_splice($setwriter122,extract(((IConstructor)high_0), ((IConstructor)($elem124))));
                 
                 }
                 
                             return ((ISet)($aset_add_aset(((ISet)(extract(((IConstructor)p_1)))),((ISet)($setwriter122.done())))));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Priorities.rsc|(8318,511,<174,0>,<179,80>) 
    public ISet except$d276f0c8da39329d(IConstructor p_0, IConstructor g_2){ 
        
        
        if($has_type_and_arity(p_0, M_ParseTree.Production_prod_Symbol_list_Symbol_set_Attr, 3)){
           IValue $arg0_144 = (IValue)($aadt_subscript_int(((IConstructor)p_0),0));
           if($isComparable($arg0_144.getType(), M_Type.ADT_Symbol)){
              IValue $arg1_143 = (IValue)($aadt_subscript_int(((IConstructor)p_0),1));
              if($isComparable($arg1_143.getType(), $T15)){
                 if(true){
                    IList lhs_1 = ((IList)($arg1_143));
                    IValue $arg2_142 = (IValue)($aadt_subscript_int(((IConstructor)p_0),2));
                    if($isComparable($arg2_142.getType(), $T20)){
                       final ISetWriter $setwriter127 = (ISetWriter)$RVF.setWriter();
                       ;
                       $SCOMP128_GEN8675:
                       for(IValue $elem141_for : ((IList)($me.index(((IList)($arg1_143)))))){
                           IInteger $elem141 = (IInteger) $elem141_for;
                           IInteger i_3 = ((IInteger)($elem141));
                           final IConstructor $subject_val138 = ((IConstructor)(M_lang_rascal_grammar_definition_Symbols.delabel(((IConstructor)($alist_subscript_int(((IList)($arg1_143)),((IInteger)i_3).intValue()))))));
                           if($has_type_and_arity($subject_val138, M_ParseTree.Symbol_conditional_Symbol_set_Condition, 2)){
                              IValue $arg0_140 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val138)),0));
                              if($isComparable($arg0_140.getType(), M_Type.ADT_Symbol)){
                                 IConstructor s_4 = ((IConstructor)($arg0_140));
                                 IValue $arg1_139 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val138)),1));
                                 if($isComparable($arg1_139.getType(), $T7)){
                                    ISet excepts_5 = ((ISet)($arg1_139));
                                    if((((IBool)($me.isdef(((IConstructor)g_2), ((IConstructor)($arg0_140)))))).getValue()){
                                      $SCOMP128_GEN8675_GEN8768:
                                      for(IValue $elem136_for : ((ISet)($arg1_139))){
                                          IConstructor $elem136 = (IConstructor) $elem136_for;
                                          if($has_type_and_arity($elem136, M_ParseTree.Condition_except_str, 1)){
                                             IValue $arg0_137 = (IValue)($aadt_subscript_int(((IConstructor)($elem136)),0));
                                             if($isComparable($arg0_137.getType(), $T9)){
                                                IString c_6 = null;
                                                final IConstructor $subject_val129 = ((IConstructor)($amap_subscript(((IMap)(((IMap)($aadt_get_field(((IConstructor)g_2), "rules"))))),((IConstructor)($arg0_140)))));
                                                $SCOMP128_GEN8675_GEN8768_CONS_except_DESC8790:
                                                for(IValue $elem130 : new DescendantMatchIterator($subject_val129, 
                                                    new DescendantDescriptorAlwaysTrue($RVF.bool(false)))){
                                                    if($isComparable($elem130.getType(), M_Type.ADT_Production)){
                                                       if($has_type_and_arity($elem130, M_ParseTree.Production_prod_Symbol_list_Symbol_set_Attr, 3)){
                                                          IValue $arg0_133 = (IValue)($subscript_int(((IValue)($elem130)),0));
                                                          if($isComparable($arg0_133.getType(), M_Type.ADT_Symbol)){
                                                             if($has_type_and_arity($arg0_133, M_Type.Symbol_label_str_Symbol, 2)){
                                                                IValue $arg0_135 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_133)),0));
                                                                if($isComparable($arg0_135.getType(), $T9)){
                                                                   if(($arg0_137 != null)){
                                                                      if($arg0_137.match($arg0_135)){
                                                                         IValue $arg1_134 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_133)),1));
                                                                         if($isComparable($arg1_134.getType(), M_Type.ADT_Symbol)){
                                                                            if(($arg0_140 != null)){
                                                                               if($arg0_140.match($arg1_134)){
                                                                                  IValue $arg1_132 = (IValue)($subscript_int(((IValue)($elem130)),1));
                                                                                  if($isComparable($arg1_132.getType(), $T1)){
                                                                                     IValue $arg2_131 = (IValue)($subscript_int(((IValue)($elem130)),2));
                                                                                     if($isComparable($arg2_131.getType(), $T1)){
                                                                                        IConstructor q_7 = ((IConstructor)($elem130));
                                                                                        $setwriter127.insert($RVF.tuple(((IConstructor)p_0), ((IInteger)i_3), ((IConstructor)q_7)));
                                                                                     
                                                                                     } else {
                                                                                        continue $SCOMP128_GEN8675_GEN8768_CONS_except_DESC8790;
                                                                                     }
                                                                                  } else {
                                                                                     continue $SCOMP128_GEN8675_GEN8768_CONS_except_DESC8790;
                                                                                  }
                                                                               } else {
                                                                                  continue $SCOMP128_GEN8675_GEN8768_CONS_except_DESC8790;
                                                                               }
                                                                            } else {
                                                                               $arg0_140 = ((IValue)($arg1_134));
                                                                               IValue $arg1_132 = (IValue)($subscript_int(((IValue)($elem130)),1));
                                                                               if($isComparable($arg1_132.getType(), $T1)){
                                                                                  IValue $arg2_131 = (IValue)($subscript_int(((IValue)($elem130)),2));
                                                                                  if($isComparable($arg2_131.getType(), $T1)){
                                                                                     IConstructor q_7 = ((IConstructor)($elem130));
                                                                                     $setwriter127.insert($RVF.tuple(((IConstructor)p_0), ((IInteger)i_3), ((IConstructor)q_7)));
                                                                                  
                                                                                  } else {
                                                                                     continue $SCOMP128_GEN8675_GEN8768_CONS_except_DESC8790;
                                                                                  }
                                                                               } else {
                                                                                  continue $SCOMP128_GEN8675_GEN8768_CONS_except_DESC8790;
                                                                               }
                                                                            }
                                                                         } else {
                                                                            continue $SCOMP128_GEN8675_GEN8768_CONS_except_DESC8790;
                                                                         }
                                                                      } else {
                                                                         continue $SCOMP128_GEN8675_GEN8768_CONS_except_DESC8790;
                                                                      }
                                                                   } else {
                                                                      $arg0_137 = ((IValue)($arg0_135));
                                                                      IValue $arg1_134 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_133)),1));
                                                                      if($isComparable($arg1_134.getType(), M_Type.ADT_Symbol)){
                                                                         if(($arg0_140 != null)){
                                                                            if($arg0_140.match($arg1_134)){
                                                                               IValue $arg1_132 = (IValue)($subscript_int(((IValue)($elem130)),1));
                                                                               if($isComparable($arg1_132.getType(), $T1)){
                                                                                  IValue $arg2_131 = (IValue)($subscript_int(((IValue)($elem130)),2));
                                                                                  if($isComparable($arg2_131.getType(), $T1)){
                                                                                     IConstructor q_7 = ((IConstructor)($elem130));
                                                                                     $setwriter127.insert($RVF.tuple(((IConstructor)p_0), ((IInteger)i_3), ((IConstructor)q_7)));
                                                                                  
                                                                                  } else {
                                                                                     continue $SCOMP128_GEN8675_GEN8768_CONS_except_DESC8790;
                                                                                  }
                                                                               } else {
                                                                                  continue $SCOMP128_GEN8675_GEN8768_CONS_except_DESC8790;
                                                                               }
                                                                            } else {
                                                                               continue $SCOMP128_GEN8675_GEN8768_CONS_except_DESC8790;
                                                                            }
                                                                         } else {
                                                                            $arg0_140 = ((IValue)($arg1_134));
                                                                            IValue $arg1_132 = (IValue)($subscript_int(((IValue)($elem130)),1));
                                                                            if($isComparable($arg1_132.getType(), $T1)){
                                                                               IValue $arg2_131 = (IValue)($subscript_int(((IValue)($elem130)),2));
                                                                               if($isComparable($arg2_131.getType(), $T1)){
                                                                                  IConstructor q_7 = ((IConstructor)($elem130));
                                                                                  $setwriter127.insert($RVF.tuple(((IConstructor)p_0), ((IInteger)i_3), ((IConstructor)q_7)));
                                                                               
                                                                               } else {
                                                                                  continue $SCOMP128_GEN8675_GEN8768_CONS_except_DESC8790;
                                                                               }
                                                                            } else {
                                                                               continue $SCOMP128_GEN8675_GEN8768_CONS_except_DESC8790;
                                                                            }
                                                                         }
                                                                      } else {
                                                                         continue $SCOMP128_GEN8675_GEN8768_CONS_except_DESC8790;
                                                                      }
                                                                   }
                                                                } else {
                                                                   continue $SCOMP128_GEN8675_GEN8768_CONS_except_DESC8790;
                                                                }
                                                             } else {
                                                                continue $SCOMP128_GEN8675_GEN8768_CONS_except_DESC8790;
                                                             }
                                                          } else {
                                                             continue $SCOMP128_GEN8675_GEN8768_CONS_except_DESC8790;
                                                          }
                                                       } else {
                                                          continue $SCOMP128_GEN8675_GEN8768_CONS_except_DESC8790;
                                                       }
                                                    } else {
                                                       continue $SCOMP128_GEN8675_GEN8768_CONS_except_DESC8790;
                                                    }
                                                }
                                                continue $SCOMP128_GEN8675_GEN8768;
                                                             
                                             } else {
                                                continue $SCOMP128_GEN8675_GEN8768;
                                             }
                                          } else {
                                             continue $SCOMP128_GEN8675_GEN8768;
                                          }
                                      }
                                      continue $SCOMP128_GEN8675;
                                                  
                                    } else {
                                      continue $SCOMP128_GEN8675;
                                    }
                                 
                                 } else {
                                    continue $SCOMP128_GEN8675;
                                 }
                              } else {
                                 continue $SCOMP128_GEN8675;
                              }
                           } else {
                              continue $SCOMP128_GEN8675;
                           }
                       }
                       
                                   return ((ISet)($setwriter127.done()));
                    
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Priorities.rsc|(8888,46,<182,0>,<182,46>) 
    public IBool isdef$d7bbd25caf107523(IConstructor g_0, IConstructor s_1){ 
        
        
        return $RVF.bool($is_defined_value($guarded_map_subscript(((IMap)(((IMap)($aadt_get_field(((IConstructor)g_0), "rules"))))),((IConstructor)s_1))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Priorities.rsc|(8992,228,<185,0>,<192,1>) 
    public IConstructor find$c2b2b71e6e1c54f5(IString c_0, IConstructor s_1, IConstructor t_2, IConstructor g_3){ 
        
        
        GuardedIValue guarded5 = $guarded_map_subscript(((IMap)(((IMap)($aadt_get_field(((IConstructor)g_3), "rules"))))),((IConstructor)t_2));
        IConstructor rules_4 = null;
        if($is_defined_value(guarded5)){
           rules_4 = ((IConstructor)(((IConstructor)$get_defined_value(guarded5))));
        
        } else {
           rules_4 = ((IConstructor)(M_Type.choice(((IConstructor)s_1), ((ISet)$constants.get(0)/*{}*/))));
        
        }/*muExists*/IF6: 
            do {
                IF6_DESC9101:
                for(IValue $elem145 : new DescendantMatchIterator(rules_4, 
                    new DescendantDescriptorAlwaysTrue($RVF.bool(false)))){
                    if($isComparable($elem145.getType(), M_Type.ADT_Production)){
                       if($isSubtypeOf($elem145.getType(),M_Type.ADT_Production)){
                          if($has_type_and_arity($elem145, M_ParseTree.Production_prod_Symbol_list_Symbol_set_Attr, 3)){
                             IValue $arg0_148 = (IValue)($subscript_int(((IValue)($elem145)),0));
                             if($isComparable($arg0_148.getType(), M_Type.ADT_Symbol)){
                                if($has_type_and_arity($arg0_148, M_Type.Symbol_label_str_Symbol, 2)){
                                   IValue $arg0_150 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_148)),0));
                                   if($isComparable($arg0_150.getType(), $T9)){
                                      if((c_0 != null)){
                                         if(c_0.match($arg0_150)){
                                            IValue $arg1_149 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_148)),1));
                                            if($isComparable($arg1_149.getType(), M_Type.ADT_Symbol)){
                                               if((t_2 != null)){
                                                  if(t_2.match($arg1_149)){
                                                     IValue $arg1_147 = (IValue)($subscript_int(((IValue)($elem145)),1));
                                                     if($isComparable($arg1_147.getType(), $T1)){
                                                        IValue $arg2_146 = (IValue)($subscript_int(((IValue)($elem145)),2));
                                                        if($isComparable($arg2_146.getType(), $T1)){
                                                           IConstructor q_5 = ((IConstructor)($elem145));
                                                           return ((IConstructor)($RVF.constructor(Maybe_Production_just_Production, new IValue[]{((IConstructor)q_5)})));
                                                        
                                                        } else {
                                                           continue IF6_DESC9101;
                                                        }
                                                     } else {
                                                        continue IF6_DESC9101;
                                                     }
                                                  } else {
                                                     continue IF6_DESC9101;
                                                  }
                                               } else {
                                                  t_2 = ((IConstructor)($arg1_149));
                                                  IValue $arg1_147 = (IValue)($subscript_int(((IValue)($elem145)),1));
                                                  if($isComparable($arg1_147.getType(), $T1)){
                                                     IValue $arg2_146 = (IValue)($subscript_int(((IValue)($elem145)),2));
                                                     if($isComparable($arg2_146.getType(), $T1)){
                                                        IConstructor q_5 = ((IConstructor)($elem145));
                                                        return ((IConstructor)($RVF.constructor(Maybe_Production_just_Production, new IValue[]{((IConstructor)q_5)})));
                                                     
                                                     } else {
                                                        continue IF6_DESC9101;
                                                     }
                                                  } else {
                                                     continue IF6_DESC9101;
                                                  }
                                               }
                                            } else {
                                               continue IF6_DESC9101;
                                            }
                                         } else {
                                            continue IF6_DESC9101;
                                         }
                                      } else {
                                         c_0 = ((IString)($arg0_150));
                                         IValue $arg1_149 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_148)),1));
                                         if($isComparable($arg1_149.getType(), M_Type.ADT_Symbol)){
                                            if((t_2 != null)){
                                               if(t_2.match($arg1_149)){
                                                  IValue $arg1_147 = (IValue)($subscript_int(((IValue)($elem145)),1));
                                                  if($isComparable($arg1_147.getType(), $T1)){
                                                     IValue $arg2_146 = (IValue)($subscript_int(((IValue)($elem145)),2));
                                                     if($isComparable($arg2_146.getType(), $T1)){
                                                        IConstructor q_5 = ((IConstructor)($elem145));
                                                        return ((IConstructor)($RVF.constructor(Maybe_Production_just_Production, new IValue[]{((IConstructor)q_5)})));
                                                     
                                                     } else {
                                                        continue IF6_DESC9101;
                                                     }
                                                  } else {
                                                     continue IF6_DESC9101;
                                                  }
                                               } else {
                                                  continue IF6_DESC9101;
                                               }
                                            } else {
                                               t_2 = ((IConstructor)($arg1_149));
                                               IValue $arg1_147 = (IValue)($subscript_int(((IValue)($elem145)),1));
                                               if($isComparable($arg1_147.getType(), $T1)){
                                                  IValue $arg2_146 = (IValue)($subscript_int(((IValue)($elem145)),2));
                                                  if($isComparable($arg2_146.getType(), $T1)){
                                                     IConstructor q_5 = ((IConstructor)($elem145));
                                                     return ((IConstructor)($RVF.constructor(Maybe_Production_just_Production, new IValue[]{((IConstructor)q_5)})));
                                                  
                                                  } else {
                                                     continue IF6_DESC9101;
                                                  }
                                               } else {
                                                  continue IF6_DESC9101;
                                               }
                                            }
                                         } else {
                                            continue IF6_DESC9101;
                                         }
                                      }
                                   } else {
                                      continue IF6_DESC9101;
                                   }
                                } else {
                                   continue IF6_DESC9101;
                                }
                             } else {
                                continue IF6_DESC9101;
                             }
                          } else {
                             continue IF6_DESC9101;
                          }
                       } else {
                          continue IF6_DESC9101;
                       }
                    } else {
                       continue IF6_DESC9101;
                    }
                }
                
                             
            } while(false);
        return ((IConstructor)($RVF.constructor(M_util_Maybe.Maybe_1_nothing_, new IValue[]{})));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Priorities.rsc|(9224,1589,<194,0>,<219,1>) 
    public ISet except$d2f4254084079d53(IConstructor p_0, IConstructor g_2){ 
        
        
        if($has_type_and_arity(p_0, M_ParseTree.Production_regular_Symbol, 1)){
           IValue $arg0_264 = (IValue)($aadt_subscript_int(((IConstructor)p_0),0));
           if($isComparable($arg0_264.getType(), M_Type.ADT_Symbol)){
              if(true){
                 IConstructor s_1 = ((IConstructor)($arg0_264));
                 final IConstructor $switchVal151 = ((IConstructor)($arg0_264));
                 boolean noCaseMatched_$switchVal151 = true;
                 SWITCH7: switch(Fingerprint.getFingerprint($switchVal151)){
                 
                     case -964239440:
                         if(noCaseMatched_$switchVal151){
                             noCaseMatched_$switchVal151 = false;
                             if($isSubtypeOf($switchVal151.getType(),M_Type.ADT_Symbol)){
                                /*muExists*/CASE_964239440_5: 
                                    do {
                                        if($has_type_and_arity($switchVal151, M_ParseTree.Symbol_iter_star_seps_Symbol_list_Symbol, 2)){
                                           IValue $arg0_228 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal151)),0));
                                           if($isComparable($arg0_228.getType(), M_Type.ADT_Symbol)){
                                              if($has_type_and_arity($arg0_228, M_ParseTree.Symbol_conditional_Symbol_set_Condition, 2)){
                                                 IValue $arg0_230 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_228)),0));
                                                 if($isComparable($arg0_230.getType(), M_Type.ADT_Symbol)){
                                                    IConstructor t_31 = ((IConstructor)($arg0_230));
                                                    IValue $arg1_229 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_228)),1));
                                                    if($isComparable($arg1_229.getType(), $T7)){
                                                       ISet cs_32 = ((ISet)($arg1_229));
                                                       IValue $arg1_227 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal151)),1));
                                                       if($isComparable($arg1_227.getType(), $T15)){
                                                          IList ss_33 = ((IList)($arg1_227));
                                                          final ISetWriter $setwriter211 = (ISetWriter)$RVF.setWriter();
                                                          ;
                                                          /*muExists*/$SCOMP212_GEN10157_CONS_except: 
                                                              do {
                                                                  $SCOMP212_GEN10157:
                                                                  for(IValue $elem215_for : ((ISet)($arg1_229))){
                                                                      IConstructor $elem215 = (IConstructor) $elem215_for;
                                                                      if($has_type_and_arity($elem215, M_ParseTree.Condition_except_str, 1)){
                                                                         IValue $arg0_216 = (IValue)($aadt_subscript_int(((IConstructor)($elem215)),0));
                                                                         if($isComparable($arg0_216.getType(), $T9)){
                                                                            IString c_34 = ((IString)($arg0_216));
                                                                            final IConstructor $subject_val213 = ((IConstructor)($me.find(((IString)($arg0_216)), ((IConstructor)($arg0_264)), ((IConstructor)($arg0_230)), ((IConstructor)g_2))));
                                                                            if($has_type_and_arity($subject_val213, M_util_Maybe.Maybe_1_just_, 1)){
                                                                               IValue $arg0_214 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val213)),0));
                                                                               if($isComparable($arg0_214.getType(), M_Type.ADT_Production)){
                                                                                  IConstructor q_35 = null;
                                                                                  $setwriter211.insert($RVF.tuple(((IConstructor)p_0), ((IInteger)$constants.get(2)/*0*/), ((IConstructor)($arg0_214))));
                                                                               
                                                                               } else {
                                                                                  continue $SCOMP212_GEN10157;
                                                                               }
                                                                            } else {
                                                                               continue $SCOMP212_GEN10157;
                                                                            }
                                                                         } else {
                                                                            continue $SCOMP212_GEN10157;
                                                                         }
                                                                      } else {
                                                                         continue $SCOMP212_GEN10157;
                                                                      }
                                                                  }
                                                                  
                                                                              
                                                              } while(false);
                                                          final ISetWriter $setwriter217 = (ISetWriter)$RVF.setWriter();
                                                          ;
                                                          $SCOMP218_GEN10238:
                                                          for(IValue $elem226_for : ((IList)($me.index(((IList)($arg1_227)))))){
                                                              IInteger $elem226 = (IInteger) $elem226_for;
                                                              IInteger i_36 = ((IInteger)($elem226));
                                                              final IConstructor $subject_val223 = ((IConstructor)($alist_subscript_int(((IList)($arg1_227)),((IInteger)i_36).intValue())));
                                                              if($has_type_and_arity($subject_val223, M_ParseTree.Symbol_conditional_Symbol_set_Condition, 2)){
                                                                 IValue $arg0_225 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val223)),0));
                                                                 if($isComparable($arg0_225.getType(), M_Type.ADT_Symbol)){
                                                                    IConstructor u_37 = ((IConstructor)($arg0_225));
                                                                    IValue $arg1_224 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val223)),1));
                                                                    if($isComparable($arg1_224.getType(), $T7)){
                                                                       ISet css_38 = ((ISet)($arg1_224));
                                                                       $SCOMP218_GEN10238_GEN10283:
                                                                       for(IValue $elem221_for : ((ISet)($arg1_224))){
                                                                           IConstructor $elem221 = (IConstructor) $elem221_for;
                                                                           if($has_type_and_arity($elem221, M_ParseTree.Condition_except_str, 1)){
                                                                              IValue $arg0_222 = (IValue)($aadt_subscript_int(((IConstructor)($elem221)),0));
                                                                              if($isComparable($arg0_222.getType(), $T9)){
                                                                                 IString ds_39 = ((IString)($arg0_222));
                                                                                 final IConstructor $subject_val219 = ((IConstructor)($me.find(((IString)($arg0_222)), ((IConstructor)($arg0_264)), ((IConstructor)($arg0_225)), ((IConstructor)g_2))));
                                                                                 if($has_type_and_arity($subject_val219, M_util_Maybe.Maybe_1_just_, 1)){
                                                                                    IValue $arg0_220 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val219)),0));
                                                                                    if($isComparable($arg0_220.getType(), M_Type.ADT_Production)){
                                                                                       IConstructor q_40 = null;
                                                                                       $setwriter217.insert($RVF.tuple(((IConstructor)p_0), ((IInteger)($aint_add_aint(((IInteger)i_36),((IInteger)$constants.get(1)/*1*/)))), ((IConstructor)($arg0_220))));
                                                                                    
                                                                                    } else {
                                                                                       continue $SCOMP218_GEN10238_GEN10283;
                                                                                    }
                                                                                 } else {
                                                                                    continue $SCOMP218_GEN10238_GEN10283;
                                                                                 }
                                                                              } else {
                                                                                 continue $SCOMP218_GEN10238_GEN10283;
                                                                              }
                                                                           } else {
                                                                              continue $SCOMP218_GEN10238_GEN10283;
                                                                           }
                                                                       }
                                                                       continue $SCOMP218_GEN10238;
                                                                                   
                                                                    } else {
                                                                       continue $SCOMP218_GEN10238;
                                                                    }
                                                                 } else {
                                                                    continue $SCOMP218_GEN10238;
                                                                 }
                                                              } else {
                                                                 continue $SCOMP218_GEN10238;
                                                              }
                                                          }
                                                          
                                                                      return ((ISet)($aset_add_aset(((ISet)($setwriter211.done())),((ISet)($setwriter217.done())))));
                                                       
                                                       }
                                                    
                                                    }
                                                 
                                                 }
                                              
                                              }
                                           
                                           }
                                        
                                        }
                                
                                    } while(false);
                             
                             }
                             if($isSubtypeOf($switchVal151.getType(),M_Type.ADT_Symbol)){
                                /*muExists*/CASE_964239440_6: 
                                    do {
                                        if($has_type_and_arity($switchVal151, M_ParseTree.Symbol_iter_star_seps_Symbol_list_Symbol, 2)){
                                           IValue $arg0_242 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal151)),0));
                                           if($isComparable($arg0_242.getType(), $T1)){
                                              IValue $arg1_241 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal151)),1));
                                              if($isComparable($arg1_241.getType(), $T15)){
                                                 IList ss_41 = ((IList)($arg1_241));
                                                 final ISetWriter $setwriter231 = (ISetWriter)$RVF.setWriter();
                                                 ;
                                                 $SCOMP232_GEN10402:
                                                 for(IValue $elem240_for : ((IList)($me.index(((IList)($arg1_241)))))){
                                                     IInteger $elem240 = (IInteger) $elem240_for;
                                                     IInteger i_42 = ((IInteger)($elem240));
                                                     final IConstructor $subject_val237 = ((IConstructor)($alist_subscript_int(((IList)($arg1_241)),((IInteger)i_42).intValue())));
                                                     if($has_type_and_arity($subject_val237, M_ParseTree.Symbol_conditional_Symbol_set_Condition, 2)){
                                                        IValue $arg0_239 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val237)),0));
                                                        if($isComparable($arg0_239.getType(), M_Type.ADT_Symbol)){
                                                           IConstructor u_43 = ((IConstructor)($arg0_239));
                                                           IValue $arg1_238 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val237)),1));
                                                           if($isComparable($arg1_238.getType(), $T7)){
                                                              ISet css_44 = ((ISet)($arg1_238));
                                                              $SCOMP232_GEN10402_GEN10447:
                                                              for(IValue $elem235_for : ((ISet)($arg1_238))){
                                                                  IConstructor $elem235 = (IConstructor) $elem235_for;
                                                                  if($has_type_and_arity($elem235, M_ParseTree.Condition_except_str, 1)){
                                                                     IValue $arg0_236 = (IValue)($aadt_subscript_int(((IConstructor)($elem235)),0));
                                                                     if($isComparable($arg0_236.getType(), $T9)){
                                                                        IString ds_45 = ((IString)($arg0_236));
                                                                        final IConstructor $subject_val233 = ((IConstructor)($me.find(((IString)($arg0_236)), ((IConstructor)($arg0_264)), ((IConstructor)($arg0_239)), ((IConstructor)g_2))));
                                                                        if($has_type_and_arity($subject_val233, M_util_Maybe.Maybe_1_just_, 1)){
                                                                           IValue $arg0_234 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val233)),0));
                                                                           if($isComparable($arg0_234.getType(), M_Type.ADT_Production)){
                                                                              IConstructor q_46 = null;
                                                                              $setwriter231.insert($RVF.tuple(((IConstructor)p_0), ((IInteger)($aint_add_aint(((IInteger)i_42),((IInteger)$constants.get(1)/*1*/)))), ((IConstructor)($arg0_234))));
                                                                           
                                                                           } else {
                                                                              continue $SCOMP232_GEN10402_GEN10447;
                                                                           }
                                                                        } else {
                                                                           continue $SCOMP232_GEN10402_GEN10447;
                                                                        }
                                                                     } else {
                                                                        continue $SCOMP232_GEN10402_GEN10447;
                                                                     }
                                                                  } else {
                                                                     continue $SCOMP232_GEN10402_GEN10447;
                                                                  }
                                                              }
                                                              continue $SCOMP232_GEN10402;
                                                                          
                                                           } else {
                                                              continue $SCOMP232_GEN10402;
                                                           }
                                                        } else {
                                                           continue $SCOMP232_GEN10402;
                                                        }
                                                     } else {
                                                        continue $SCOMP232_GEN10402;
                                                     }
                                                 }
                                                 
                                                             return ((ISet)($setwriter231.done()));
                                              
                                              }
                                           
                                           }
                                        
                                        }
                                
                                    } while(false);
                             
                             }
                 
                         }
                         
                 
                     case 25942208:
                         if(noCaseMatched_$switchVal151){
                             noCaseMatched_$switchVal151 = false;
                             if($isSubtypeOf($switchVal151.getType(),M_Type.ADT_Symbol)){
                                /*muExists*/CASE_25942208_2: 
                                    do {
                                        if($has_type_and_arity($switchVal151, M_ParseTree.Symbol_iter_Symbol, 1)){
                                           IValue $arg0_176 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal151)),0));
                                           if($isComparable($arg0_176.getType(), M_Type.ADT_Symbol)){
                                              if($has_type_and_arity($arg0_176, M_ParseTree.Symbol_conditional_Symbol_set_Condition, 2)){
                                                 IValue $arg0_178 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_176)),0));
                                                 if($isComparable($arg0_178.getType(), M_Type.ADT_Symbol)){
                                                    IConstructor t_11 = ((IConstructor)($arg0_178));
                                                    IValue $arg1_177 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_176)),1));
                                                    if($isComparable($arg1_177.getType(), $T7)){
                                                       ISet cs_12 = ((ISet)($arg1_177));
                                                       final ISetWriter $setwriter170 = (ISetWriter)$RVF.setWriter();
                                                       ;
                                                       /*muExists*/$SCOMP171_GEN9614_CONS_except: 
                                                           do {
                                                               $SCOMP171_GEN9614:
                                                               for(IValue $elem174_for : ((ISet)($arg1_177))){
                                                                   IConstructor $elem174 = (IConstructor) $elem174_for;
                                                                   if($has_type_and_arity($elem174, M_ParseTree.Condition_except_str, 1)){
                                                                      IValue $arg0_175 = (IValue)($aadt_subscript_int(((IConstructor)($elem174)),0));
                                                                      if($isComparable($arg0_175.getType(), $T9)){
                                                                         IString c_13 = ((IString)($arg0_175));
                                                                         final IConstructor $subject_val172 = ((IConstructor)($me.find(((IString)($arg0_175)), ((IConstructor)($arg0_264)), ((IConstructor)($arg0_178)), ((IConstructor)g_2))));
                                                                         if($has_type_and_arity($subject_val172, M_util_Maybe.Maybe_1_just_, 1)){
                                                                            IValue $arg0_173 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val172)),0));
                                                                            if($isComparable($arg0_173.getType(), M_Type.ADT_Production)){
                                                                               IConstructor q_14 = null;
                                                                               $setwriter170.insert($RVF.tuple(((IConstructor)p_0), ((IInteger)$constants.get(2)/*0*/), ((IConstructor)($arg0_173))));
                                                                            
                                                                            } else {
                                                                               continue $SCOMP171_GEN9614;
                                                                            }
                                                                         } else {
                                                                            continue $SCOMP171_GEN9614;
                                                                         }
                                                                      } else {
                                                                         continue $SCOMP171_GEN9614;
                                                                      }
                                                                   } else {
                                                                      continue $SCOMP171_GEN9614;
                                                                   }
                                                               }
                                                               
                                                                           
                                                           } while(false);
                                                       return ((ISet)($setwriter170.done()));
                                                    
                                                    }
                                                 
                                                 }
                                              
                                              }
                                           
                                           }
                                        
                                        }
                                
                                    } while(false);
                             
                             }
                 
                         }
                         
                 
                     case 882072:
                         if(noCaseMatched_$switchVal151){
                             noCaseMatched_$switchVal151 = false;
                             if($isSubtypeOf($switchVal151.getType(),M_Type.ADT_Symbol)){
                                /*muExists*/CASE_882072_0: 
                                    do {
                                        if($has_type_and_arity($switchVal151, M_ParseTree.Symbol_opt_Symbol, 1)){
                                           IValue $arg0_158 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal151)),0));
                                           if($isComparable($arg0_158.getType(), M_Type.ADT_Symbol)){
                                              if($has_type_and_arity($arg0_158, M_ParseTree.Symbol_conditional_Symbol_set_Condition, 2)){
                                                 IValue $arg0_160 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_158)),0));
                                                 if($isComparable($arg0_160.getType(), M_Type.ADT_Symbol)){
                                                    IConstructor t_3 = ((IConstructor)($arg0_160));
                                                    IValue $arg1_159 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_158)),1));
                                                    if($isComparable($arg1_159.getType(), $T7)){
                                                       ISet cs_4 = ((ISet)($arg1_159));
                                                       final ISetWriter $setwriter152 = (ISetWriter)$RVF.setWriter();
                                                       ;
                                                       /*muExists*/$SCOMP153_GEN9375_CONS_except: 
                                                           do {
                                                               $SCOMP153_GEN9375:
                                                               for(IValue $elem156_for : ((ISet)($arg1_159))){
                                                                   IConstructor $elem156 = (IConstructor) $elem156_for;
                                                                   if($has_type_and_arity($elem156, M_ParseTree.Condition_except_str, 1)){
                                                                      IValue $arg0_157 = (IValue)($aadt_subscript_int(((IConstructor)($elem156)),0));
                                                                      if($isComparable($arg0_157.getType(), $T9)){
                                                                         IString c_5 = ((IString)($arg0_157));
                                                                         final IConstructor $subject_val154 = ((IConstructor)($me.find(((IString)($arg0_157)), ((IConstructor)($arg0_264)), ((IConstructor)($arg0_160)), ((IConstructor)g_2))));
                                                                         if($has_type_and_arity($subject_val154, M_util_Maybe.Maybe_1_just_, 1)){
                                                                            IValue $arg0_155 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val154)),0));
                                                                            if($isComparable($arg0_155.getType(), M_Type.ADT_Production)){
                                                                               IConstructor q_6 = null;
                                                                               $setwriter152.insert($RVF.tuple(((IConstructor)p_0), ((IInteger)$constants.get(2)/*0*/), ((IConstructor)($arg0_155))));
                                                                            
                                                                            } else {
                                                                               continue $SCOMP153_GEN9375;
                                                                            }
                                                                         } else {
                                                                            continue $SCOMP153_GEN9375;
                                                                         }
                                                                      } else {
                                                                         continue $SCOMP153_GEN9375;
                                                                      }
                                                                   } else {
                                                                      continue $SCOMP153_GEN9375;
                                                                   }
                                                               }
                                                               
                                                                           
                                                           } while(false);
                                                       return ((ISet)($setwriter152.done()));
                                                    
                                                    }
                                                 
                                                 }
                                              
                                              }
                                           
                                           }
                                        
                                        }
                                
                                    } while(false);
                             
                             }
                 
                         }
                         
                 
                     case 910072:
                         if(noCaseMatched_$switchVal151){
                             noCaseMatched_$switchVal151 = false;
                             if($isSubtypeOf($switchVal151.getType(),M_Type.ADT_Symbol)){
                                /*muExists*/CASE_910072_8: 
                                    do {
                                        if($has_type_and_arity($switchVal151, M_ParseTree.Symbol_seq_list_Symbol, 1)){
                                           IValue $arg0_263 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal151)),0));
                                           if($isComparable($arg0_263.getType(), $T15)){
                                              IList ss_52 = ((IList)($arg0_263));
                                              final ISetWriter $setwriter253 = (ISetWriter)$RVF.setWriter();
                                              ;
                                              $SCOMP254_GEN10684:
                                              for(IValue $elem262_for : ((IList)($me.index(((IList)($arg0_263)))))){
                                                  IInteger $elem262 = (IInteger) $elem262_for;
                                                  IInteger i_53 = ((IInteger)($elem262));
                                                  $SCOMP254_GEN10684_GEN10700:
                                                  for(IValue $elem259_for : ((IList)($arg0_263))){
                                                      IConstructor $elem259 = (IConstructor) $elem259_for;
                                                      if($has_type_and_arity($elem259, M_ParseTree.Symbol_conditional_Symbol_set_Condition, 2)){
                                                         IValue $arg0_261 = (IValue)($aadt_subscript_int(((IConstructor)($elem259)),0));
                                                         if($isComparable($arg0_261.getType(), M_Type.ADT_Symbol)){
                                                            IConstructor t_54 = ((IConstructor)($arg0_261));
                                                            IValue $arg1_260 = (IValue)($aadt_subscript_int(((IConstructor)($elem259)),1));
                                                            if($isComparable($arg1_260.getType(), $T7)){
                                                               ISet cs_55 = ((ISet)($arg1_260));
                                                               $SCOMP254_GEN10684_GEN10700_CONS_conditional_GEN10725:
                                                               for(IValue $elem257_for : ((ISet)($arg1_260))){
                                                                   IConstructor $elem257 = (IConstructor) $elem257_for;
                                                                   if($has_type_and_arity($elem257, M_ParseTree.Condition_except_str, 1)){
                                                                      IValue $arg0_258 = (IValue)($aadt_subscript_int(((IConstructor)($elem257)),0));
                                                                      if($isComparable($arg0_258.getType(), $T9)){
                                                                         IString c_56 = ((IString)($arg0_258));
                                                                         final IConstructor $subject_val255 = ((IConstructor)($me.find(((IString)($arg0_258)), ((IConstructor)($arg0_264)), ((IConstructor)($arg0_261)), ((IConstructor)g_2))));
                                                                         if($has_type_and_arity($subject_val255, M_util_Maybe.Maybe_1_just_, 1)){
                                                                            IValue $arg0_256 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val255)),0));
                                                                            if($isComparable($arg0_256.getType(), M_Type.ADT_Production)){
                                                                               IConstructor q_57 = null;
                                                                               $setwriter253.insert($RVF.tuple(((IConstructor)p_0), ((IInteger)i_53), ((IConstructor)($arg0_256))));
                                                                            
                                                                            } else {
                                                                               continue $SCOMP254_GEN10684_GEN10700_CONS_conditional_GEN10725;
                                                                            }
                                                                         } else {
                                                                            continue $SCOMP254_GEN10684_GEN10700_CONS_conditional_GEN10725;
                                                                         }
                                                                      } else {
                                                                         continue $SCOMP254_GEN10684_GEN10700_CONS_conditional_GEN10725;
                                                                      }
                                                                   } else {
                                                                      continue $SCOMP254_GEN10684_GEN10700_CONS_conditional_GEN10725;
                                                                   }
                                                               }
                                                               continue $SCOMP254_GEN10684_GEN10700;
                                                                           
                                                            } else {
                                                               continue $SCOMP254_GEN10684_GEN10700;
                                                            }
                                                         } else {
                                                            continue $SCOMP254_GEN10684_GEN10700;
                                                         }
                                                      } else {
                                                         continue $SCOMP254_GEN10684_GEN10700;
                                                      }
                                                  }
                                                  continue $SCOMP254_GEN10684;
                                                              
                                              }
                                              
                                                          return ((ISet)($setwriter253.done()));
                                           
                                           }
                                        
                                        }
                                
                                    } while(false);
                             
                             }
                 
                         }
                         
                 
                     case 826203960:
                         if(noCaseMatched_$switchVal151){
                             noCaseMatched_$switchVal151 = false;
                             if($isSubtypeOf($switchVal151.getType(),M_Type.ADT_Symbol)){
                                /*muExists*/CASE_826203960_1: 
                                    do {
                                        if($has_type_and_arity($switchVal151, M_ParseTree.Symbol_iter_star_Symbol, 1)){
                                           IValue $arg0_167 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal151)),0));
                                           if($isComparable($arg0_167.getType(), M_Type.ADT_Symbol)){
                                              if($has_type_and_arity($arg0_167, M_ParseTree.Symbol_conditional_Symbol_set_Condition, 2)){
                                                 IValue $arg0_169 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_167)),0));
                                                 if($isComparable($arg0_169.getType(), M_Type.ADT_Symbol)){
                                                    IConstructor t_7 = ((IConstructor)($arg0_169));
                                                    IValue $arg1_168 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_167)),1));
                                                    if($isComparable($arg1_168.getType(), $T7)){
                                                       ISet cs_8 = ((ISet)($arg1_168));
                                                       final ISetWriter $setwriter161 = (ISetWriter)$RVF.setWriter();
                                                       ;
                                                       /*muExists*/$SCOMP162_GEN9497_CONS_except: 
                                                           do {
                                                               $SCOMP162_GEN9497:
                                                               for(IValue $elem165_for : ((ISet)($arg1_168))){
                                                                   IConstructor $elem165 = (IConstructor) $elem165_for;
                                                                   if($has_type_and_arity($elem165, M_ParseTree.Condition_except_str, 1)){
                                                                      IValue $arg0_166 = (IValue)($aadt_subscript_int(((IConstructor)($elem165)),0));
                                                                      if($isComparable($arg0_166.getType(), $T9)){
                                                                         IString c_9 = ((IString)($arg0_166));
                                                                         final IConstructor $subject_val163 = ((IConstructor)($me.find(((IString)($arg0_166)), ((IConstructor)($arg0_264)), ((IConstructor)($arg0_169)), ((IConstructor)g_2))));
                                                                         if($has_type_and_arity($subject_val163, M_util_Maybe.Maybe_1_just_, 1)){
                                                                            IValue $arg0_164 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val163)),0));
                                                                            if($isComparable($arg0_164.getType(), M_Type.ADT_Production)){
                                                                               IConstructor q_10 = null;
                                                                               $setwriter161.insert($RVF.tuple(((IConstructor)p_0), ((IInteger)$constants.get(2)/*0*/), ((IConstructor)($arg0_164))));
                                                                            
                                                                            } else {
                                                                               continue $SCOMP162_GEN9497;
                                                                            }
                                                                         } else {
                                                                            continue $SCOMP162_GEN9497;
                                                                         }
                                                                      } else {
                                                                         continue $SCOMP162_GEN9497;
                                                                      }
                                                                   } else {
                                                                      continue $SCOMP162_GEN9497;
                                                                   }
                                                               }
                                                               
                                                                           
                                                           } while(false);
                                                       return ((ISet)($setwriter161.done()));
                                                    
                                                    }
                                                 
                                                 }
                                              
                                              }
                                           
                                           }
                                        
                                        }
                                
                                    } while(false);
                             
                             }
                 
                         }
                         
                 
                     case 773448:
                         if(noCaseMatched_$switchVal151){
                             noCaseMatched_$switchVal151 = false;
                             if($isSubtypeOf($switchVal151.getType(),M_Type.ADT_Symbol)){
                                /*muExists*/CASE_773448_7: 
                                    do {
                                        if($has_type_and_arity($switchVal151, M_ParseTree.Symbol_alt_set_Symbol, 1)){
                                           IValue $arg0_252 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal151)),0));
                                           if($isComparable($arg0_252.getType(), $T8)){
                                              ISet as_47 = ((ISet)($arg0_252));
                                              final ISetWriter $setwriter243 = (ISetWriter)$RVF.setWriter();
                                              ;
                                              /*muExists*/$SCOMP244_GEN10558_CONS_conditional: 
                                                  do {
                                                      $SCOMP244_GEN10558:
                                                      for(IValue $elem249_for : ((ISet)($arg0_252))){
                                                          IConstructor $elem249 = (IConstructor) $elem249_for;
                                                          if($has_type_and_arity($elem249, M_ParseTree.Symbol_conditional_Symbol_set_Condition, 2)){
                                                             IValue $arg0_251 = (IValue)($aadt_subscript_int(((IConstructor)($elem249)),0));
                                                             if($isComparable($arg0_251.getType(), M_Type.ADT_Symbol)){
                                                                IConstructor t_48 = ((IConstructor)($arg0_251));
                                                                IValue $arg1_250 = (IValue)($aadt_subscript_int(((IConstructor)($elem249)),1));
                                                                if($isComparable($arg1_250.getType(), $T7)){
                                                                   ISet cs_49 = ((ISet)($arg1_250));
                                                                   $SCOMP244_GEN10558_CONS_conditional_GEN10583:
                                                                   for(IValue $elem247_for : ((ISet)($arg1_250))){
                                                                       IConstructor $elem247 = (IConstructor) $elem247_for;
                                                                       if($has_type_and_arity($elem247, M_ParseTree.Condition_except_str, 1)){
                                                                          IValue $arg0_248 = (IValue)($aadt_subscript_int(((IConstructor)($elem247)),0));
                                                                          if($isComparable($arg0_248.getType(), $T9)){
                                                                             IString c_50 = ((IString)($arg0_248));
                                                                             final IConstructor $subject_val245 = ((IConstructor)($me.find(((IString)($arg0_248)), ((IConstructor)($arg0_264)), ((IConstructor)($arg0_251)), ((IConstructor)g_2))));
                                                                             if($has_type_and_arity($subject_val245, M_util_Maybe.Maybe_1_just_, 1)){
                                                                                IValue $arg0_246 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val245)),0));
                                                                                if($isComparable($arg0_246.getType(), M_Type.ADT_Production)){
                                                                                   IConstructor q_51 = null;
                                                                                   $setwriter243.insert($RVF.tuple(((IConstructor)p_0), ((IInteger)$constants.get(2)/*0*/), ((IConstructor)($arg0_246))));
                                                                                
                                                                                } else {
                                                                                   continue $SCOMP244_GEN10558_CONS_conditional_GEN10583;
                                                                                }
                                                                             } else {
                                                                                continue $SCOMP244_GEN10558_CONS_conditional_GEN10583;
                                                                             }
                                                                          } else {
                                                                             continue $SCOMP244_GEN10558_CONS_conditional_GEN10583;
                                                                          }
                                                                       } else {
                                                                          continue $SCOMP244_GEN10558_CONS_conditional_GEN10583;
                                                                       }
                                                                   }
                                                                   continue $SCOMP244_GEN10558;
                                                                               
                                                                } else {
                                                                   continue $SCOMP244_GEN10558;
                                                                }
                                                             } else {
                                                                continue $SCOMP244_GEN10558;
                                                             }
                                                          } else {
                                                             continue $SCOMP244_GEN10558;
                                                          }
                                                      }
                                                      
                                                                  
                                                  } while(false);
                                              return ((ISet)($setwriter243.done()));
                                           
                                           }
                                        
                                        }
                                
                                    } while(false);
                             
                             }
                 
                         }
                         
                 
                     case 1652184736:
                         if(noCaseMatched_$switchVal151){
                             noCaseMatched_$switchVal151 = false;
                             if($isSubtypeOf($switchVal151.getType(),M_Type.ADT_Symbol)){
                                /*muExists*/CASE_1652184736_3: 
                                    do {
                                        if($has_type_and_arity($switchVal151, M_ParseTree.Symbol_iter_seps_Symbol_list_Symbol, 2)){
                                           IValue $arg0_196 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal151)),0));
                                           if($isComparable($arg0_196.getType(), M_Type.ADT_Symbol)){
                                              if($has_type_and_arity($arg0_196, M_ParseTree.Symbol_conditional_Symbol_set_Condition, 2)){
                                                 IValue $arg0_198 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_196)),0));
                                                 if($isComparable($arg0_198.getType(), M_Type.ADT_Symbol)){
                                                    IConstructor t_15 = ((IConstructor)($arg0_198));
                                                    IValue $arg1_197 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_196)),1));
                                                    if($isComparable($arg1_197.getType(), $T7)){
                                                       ISet cs_16 = ((ISet)($arg1_197));
                                                       IValue $arg1_195 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal151)),1));
                                                       if($isComparable($arg1_195.getType(), $T15)){
                                                          IList ss_17 = ((IList)($arg1_195));
                                                          final ISetWriter $setwriter179 = (ISetWriter)$RVF.setWriter();
                                                          ;
                                                          /*muExists*/$SCOMP180_GEN9739_CONS_except: 
                                                              do {
                                                                  $SCOMP180_GEN9739:
                                                                  for(IValue $elem183_for : ((ISet)($arg1_197))){
                                                                      IConstructor $elem183 = (IConstructor) $elem183_for;
                                                                      if($has_type_and_arity($elem183, M_ParseTree.Condition_except_str, 1)){
                                                                         IValue $arg0_184 = (IValue)($aadt_subscript_int(((IConstructor)($elem183)),0));
                                                                         if($isComparable($arg0_184.getType(), $T9)){
                                                                            IString c_18 = ((IString)($arg0_184));
                                                                            final IConstructor $subject_val181 = ((IConstructor)($me.find(((IString)($arg0_184)), ((IConstructor)($arg0_264)), ((IConstructor)($arg0_198)), ((IConstructor)g_2))));
                                                                            if($has_type_and_arity($subject_val181, M_util_Maybe.Maybe_1_just_, 1)){
                                                                               IValue $arg0_182 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val181)),0));
                                                                               if($isComparable($arg0_182.getType(), M_Type.ADT_Production)){
                                                                                  IConstructor q_19 = null;
                                                                                  $setwriter179.insert($RVF.tuple(((IConstructor)p_0), ((IInteger)$constants.get(2)/*0*/), ((IConstructor)($arg0_182))));
                                                                               
                                                                               } else {
                                                                                  continue $SCOMP180_GEN9739;
                                                                               }
                                                                            } else {
                                                                               continue $SCOMP180_GEN9739;
                                                                            }
                                                                         } else {
                                                                            continue $SCOMP180_GEN9739;
                                                                         }
                                                                      } else {
                                                                         continue $SCOMP180_GEN9739;
                                                                      }
                                                                  }
                                                                  
                                                                              
                                                              } while(false);
                                                          final ISetWriter $setwriter185 = (ISetWriter)$RVF.setWriter();
                                                          ;
                                                          $SCOMP186_GEN9820:
                                                          for(IValue $elem194_for : ((IList)($me.index(((IList)($arg1_195)))))){
                                                              IInteger $elem194 = (IInteger) $elem194_for;
                                                              IInteger i_20 = ((IInteger)($elem194));
                                                              final IConstructor $subject_val191 = ((IConstructor)($alist_subscript_int(((IList)($arg1_195)),((IInteger)i_20).intValue())));
                                                              if($has_type_and_arity($subject_val191, M_ParseTree.Symbol_conditional_Symbol_set_Condition, 2)){
                                                                 IValue $arg0_193 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val191)),0));
                                                                 if($isComparable($arg0_193.getType(), M_Type.ADT_Symbol)){
                                                                    IConstructor u_21 = ((IConstructor)($arg0_193));
                                                                    IValue $arg1_192 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val191)),1));
                                                                    if($isComparable($arg1_192.getType(), $T7)){
                                                                       ISet css_22 = ((ISet)($arg1_192));
                                                                       $SCOMP186_GEN9820_GEN9865:
                                                                       for(IValue $elem189_for : ((ISet)($arg1_192))){
                                                                           IConstructor $elem189 = (IConstructor) $elem189_for;
                                                                           if($has_type_and_arity($elem189, M_ParseTree.Condition_except_str, 1)){
                                                                              IValue $arg0_190 = (IValue)($aadt_subscript_int(((IConstructor)($elem189)),0));
                                                                              if($isComparable($arg0_190.getType(), $T9)){
                                                                                 IString ds_23 = ((IString)($arg0_190));
                                                                                 final IConstructor $subject_val187 = ((IConstructor)($me.find(((IString)($arg0_190)), ((IConstructor)($arg0_264)), ((IConstructor)($arg0_193)), ((IConstructor)g_2))));
                                                                                 if($has_type_and_arity($subject_val187, M_util_Maybe.Maybe_1_just_, 1)){
                                                                                    IValue $arg0_188 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val187)),0));
                                                                                    if($isComparable($arg0_188.getType(), M_Type.ADT_Production)){
                                                                                       IConstructor q_24 = null;
                                                                                       $setwriter185.insert($RVF.tuple(((IConstructor)p_0), ((IInteger)($aint_add_aint(((IInteger)i_20),((IInteger)$constants.get(1)/*1*/)))), ((IConstructor)($arg0_188))));
                                                                                    
                                                                                    } else {
                                                                                       continue $SCOMP186_GEN9820_GEN9865;
                                                                                    }
                                                                                 } else {
                                                                                    continue $SCOMP186_GEN9820_GEN9865;
                                                                                 }
                                                                              } else {
                                                                                 continue $SCOMP186_GEN9820_GEN9865;
                                                                              }
                                                                           } else {
                                                                              continue $SCOMP186_GEN9820_GEN9865;
                                                                           }
                                                                       }
                                                                       continue $SCOMP186_GEN9820;
                                                                                   
                                                                    } else {
                                                                       continue $SCOMP186_GEN9820;
                                                                    }
                                                                 } else {
                                                                    continue $SCOMP186_GEN9820;
                                                                 }
                                                              } else {
                                                                 continue $SCOMP186_GEN9820;
                                                              }
                                                          }
                                                          
                                                                      return ((ISet)($aset_add_aset(((ISet)($setwriter179.done())),((ISet)($setwriter185.done())))));
                                                       
                                                       }
                                                    
                                                    }
                                                 
                                                 }
                                              
                                              }
                                           
                                           }
                                        
                                        }
                                
                                    } while(false);
                             
                             }
                             if($isSubtypeOf($switchVal151.getType(),M_Type.ADT_Symbol)){
                                /*muExists*/CASE_1652184736_4: 
                                    do {
                                        if($has_type_and_arity($switchVal151, M_ParseTree.Symbol_iter_seps_Symbol_list_Symbol, 2)){
                                           IValue $arg0_210 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal151)),0));
                                           if($isComparable($arg0_210.getType(), $T1)){
                                              IValue $arg1_209 = (IValue)($aadt_subscript_int(((IConstructor)($switchVal151)),1));
                                              if($isComparable($arg1_209.getType(), $T15)){
                                                 IList ss_25 = ((IList)($arg1_209));
                                                 final ISetWriter $setwriter199 = (ISetWriter)$RVF.setWriter();
                                                 ;
                                                 $SCOMP200_GEN9979:
                                                 for(IValue $elem208_for : ((IList)($me.index(((IList)($arg1_209)))))){
                                                     IInteger $elem208 = (IInteger) $elem208_for;
                                                     IInteger i_26 = ((IInteger)($elem208));
                                                     final IConstructor $subject_val205 = ((IConstructor)($alist_subscript_int(((IList)($arg1_209)),((IInteger)i_26).intValue())));
                                                     if($has_type_and_arity($subject_val205, M_ParseTree.Symbol_conditional_Symbol_set_Condition, 2)){
                                                        IValue $arg0_207 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val205)),0));
                                                        if($isComparable($arg0_207.getType(), M_Type.ADT_Symbol)){
                                                           IConstructor u_27 = ((IConstructor)($arg0_207));
                                                           IValue $arg1_206 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val205)),1));
                                                           if($isComparable($arg1_206.getType(), $T7)){
                                                              ISet css_28 = ((ISet)($arg1_206));
                                                              $SCOMP200_GEN9979_GEN10024:
                                                              for(IValue $elem203_for : ((ISet)($arg1_206))){
                                                                  IConstructor $elem203 = (IConstructor) $elem203_for;
                                                                  if($has_type_and_arity($elem203, M_ParseTree.Condition_except_str, 1)){
                                                                     IValue $arg0_204 = (IValue)($aadt_subscript_int(((IConstructor)($elem203)),0));
                                                                     if($isComparable($arg0_204.getType(), $T9)){
                                                                        IString ds_29 = ((IString)($arg0_204));
                                                                        final IConstructor $subject_val201 = ((IConstructor)($me.find(((IString)($arg0_204)), ((IConstructor)($arg0_264)), ((IConstructor)($arg0_207)), ((IConstructor)g_2))));
                                                                        if($has_type_and_arity($subject_val201, M_util_Maybe.Maybe_1_just_, 1)){
                                                                           IValue $arg0_202 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val201)),0));
                                                                           if($isComparable($arg0_202.getType(), M_Type.ADT_Production)){
                                                                              IConstructor q_30 = null;
                                                                              $setwriter199.insert($RVF.tuple(((IConstructor)p_0), ((IInteger)($aint_add_aint(((IInteger)i_26),((IInteger)$constants.get(1)/*1*/)))), ((IConstructor)($arg0_202))));
                                                                           
                                                                           } else {
                                                                              continue $SCOMP200_GEN9979_GEN10024;
                                                                           }
                                                                        } else {
                                                                           continue $SCOMP200_GEN9979_GEN10024;
                                                                        }
                                                                     } else {
                                                                        continue $SCOMP200_GEN9979_GEN10024;
                                                                     }
                                                                  } else {
                                                                     continue $SCOMP200_GEN9979_GEN10024;
                                                                  }
                                                              }
                                                              continue $SCOMP200_GEN9979;
                                                                          
                                                           } else {
                                                              continue $SCOMP200_GEN9979;
                                                           }
                                                        } else {
                                                           continue $SCOMP200_GEN9979;
                                                        }
                                                     } else {
                                                        continue $SCOMP200_GEN9979;
                                                     }
                                                 }
                                                 
                                                             return ((ISet)($setwriter199.done()));
                                              
                                              }
                                           
                                           }
                                        
                                        }
                                
                                    } while(false);
                             
                             }
                 
                         }
                         
                 
                     default: return ((ISet)$constants.get(0)/*{}*/);
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Priorities.rsc|(10821,71,<223,0>,<223,71>) 
    public IBool same$3d81c15a40e141f4(IConstructor x_0, IConstructor ref_1){ 
        
        
        return ((IBool)($equal(((IConstructor)($me.striprec(((IConstructor)x_0)))), ((IConstructor)($me.striprec(((IConstructor)ref_1)))))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Priorities.rsc|(10896,75,<225,0>,<225,75>) 
    public IConstructor striprec$65016c35e152c386(IConstructor x_0){ 
        
        
        try {
            IValue $visitResult = $TRAVERSE.traverse(DIRECTION.BottomUp, PROGRESS.Continuing, FIXEDPOINT.No, REBUILD.Yes, 
                 new DescendantDescriptor(new io.usethesource.vallang.type.Type[]{$TF.listType(ADT_Symbol), M_Type.ADT_Exception, $TF.setType(ADT_Symbol), $TF.setType(ADT_Condition), ADT_KeywordArguments_1, M_ParseTree.ADT_Tree, M_ParseTree.ADT_TreeSearchResult_1, M_ParseTree.ADT_Condition, M_Type.ADT_Production, M_Type.ADT_Symbol, M_Grammar.ADT_Grammar, M_ParseTree.ADT_CharRange, M_Grammar.ADT_Item, M_Grammar.ADT_GrammarModule, $TF.listType(ADT_CharRange), M_Grammar.ADT_GrammarDefinition}, 
                                          new io.usethesource.vallang.IConstructor[]{}, 
                                          $RVF.bool(false)),
                 x_0,
                 (IVisitFunction) (IValue $VISIT8_subject, TraversalState $traversalState) -> {
                     VISIT8:switch(Fingerprint.getFingerprint($VISIT8_subject)){
                     
                         case 0:
                             
                     
                         default: 
                             if($isSubtypeOf($VISIT8_subject.getType(),M_Type.ADT_Symbol)){
                                /*muExists*/CASE_0_0: 
                                    do {
                                        ValueRef<IConstructor> s_1 = new ValueRef<IConstructor>();
                                        IConstructor $replacement265 = (IConstructor)($me.strip(((IConstructor)($VISIT8_subject))));
                                        if($isSubtypeOf($replacement265.getType(),$VISIT8_subject.getType())){
                                           $traversalState.setMatchedAndChanged(true, true);
                                           return $replacement265;
                                        
                                        } else {
                                           break VISIT8;// switch
                                        
                                        }
                                    } while(false);
                             
                             }
            
                     }
                     return $VISIT8_subject;
                 });
            return (IConstructor)$visitResult;
        
        } catch (ReturnFromTraversalException e) {
            return (IConstructor) e.getValue();
        }
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Priorities.rsc|(10975,52,<227,0>,<227,52>) 
    public IConstructor strip$7ed4e2ded4dfeea9(IConstructor $0){ 
        
        
        if($has_type_and_arity($0, M_Type.Symbol_label_str_Symbol, 2)){
           IValue $arg0_267 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_267.getType(), $T1)){
              IValue $arg1_266 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
              if($isComparable($arg1_266.getType(), M_Type.ADT_Symbol)){
                 IConstructor s_0 = null;
                 return ((IConstructor)($me.strip(((IConstructor)($arg1_266)))));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Priorities.rsc|(11029,58,<228,0>,<228,58>) 
    public IConstructor strip$da2dbb10ad3e1058(IConstructor $0){ 
        
        
        if($has_type_and_arity($0, M_ParseTree.Symbol_conditional_Symbol_set_Condition, 2)){
           IValue $arg0_269 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_269.getType(), M_Type.ADT_Symbol)){
              IConstructor s_0 = null;
              IValue $arg1_268 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
              if($isComparable($arg1_268.getType(), $T1)){
                 return ((IConstructor)($me.strip(((IConstructor)($arg0_269)))));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Priorities.rsc|(11089,43,<229,0>,<229,43>) 
    public IConstructor strip$123f0b34c6070c0a(IConstructor s_0){ 
        
        
        return ((IConstructor)s_0);
    
    }
    

    public static void main(String[] args) {
      throw new RuntimeException("No function `main` found in Rascal module `lang::rascal::grammar::definition::Priorities`");
    }
}