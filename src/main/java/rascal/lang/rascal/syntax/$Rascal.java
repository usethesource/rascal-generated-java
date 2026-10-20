package rascal.lang.rascal.syntax;
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
public class $Rascal 
    extends
        org.rascalmpl.runtime.$RascalModule
    implements 
    	rascal.lang.rascal.syntax.$Rascal_$I {

    private final $Rascal_$I $me;
    private final IList $constants;
    
    

    
    
    public final io.usethesource.vallang.type.Type $T47;	/*astr(alabel="anonymouscontinuation")*/
    public final io.usethesource.vallang.type.Type $T43;	/*astr(alabel="l2")*/
    public final io.usethesource.vallang.type.Type $T38;	/*astr(alabel="anonymousunicode")*/
    public final io.usethesource.vallang.type.Type $T44;	/*astr(alabel="l3")*/
    public final io.usethesource.vallang.type.Type $T42;	/*astr(alabel="l1")*/
    public final io.usethesource.vallang.type.Type $T45;	/*astr(alabel="parts")*/
    public final io.usethesource.vallang.type.Type $T35;	/*astr(alabel="anonymoustext")*/
    public final io.usethesource.vallang.type.Type ADT_Expression;	/*aadt("Expression",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Expression;	/*aadt("Expression",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Expression_greaterThanOrEq_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="greaterThanOrEq")*/
    public final io.usethesource.vallang.type.Type ADT_Statement;	/*aadt("Statement",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Statement;	/*aadt("Statement",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_LAYOUTLIST;	/*aadt("LAYOUTLIST",[],layoutSyntax())*/
    public final io.usethesource.vallang.type.Type $T17;	/*\iter-star-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="postStatsElse")*/
    public final io.usethesource.vallang.type.Type ADT_StringLiteral;	/*aadt("StringLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringLiteral;	/*aadt("StringLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type StringLiteral_interpolated_PreStringChars_Expression_StringTail;	/*acons(aadt("StringLiteral",[],contextFreeSyntax()),[aadt("PreStringChars",[],lexicalSyntax(),alabel="pre"),aadt("Expression",[],contextFreeSyntax(),alabel="expression"),aadt("StringTail",[],contextFreeSyntax(),alabel="tail")],[],alabel="interpolated")*/
    public final io.usethesource.vallang.type.Type ADT_Renamings;	/*aadt("Renamings",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Renamings;	/*aadt("Renamings",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Renaming;	/*aadt("Renaming",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Renaming;	/*aadt("Renaming",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T3;	/*alit(",")*/
    public final io.usethesource.vallang.type.Type $T53;	/*\iter-seps(aadt("Renaming",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="renamings")*/
    public final io.usethesource.vallang.type.Type Renamings_default_iter_seps_Renaming;	/*acons(aadt("Renamings",[],contextFreeSyntax()),[\iter-seps(aadt("Renaming",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="renamings")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type ADT_Comprehension;	/*aadt("Comprehension",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Comprehension;	/*aadt("Comprehension",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T5;	/*\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="results")*/
    public final io.usethesource.vallang.type.Type $T6;	/*\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="generators")*/
    public final io.usethesource.vallang.type.Type Comprehension_set_iter_seps_Expression_iter_seps_Expression;	/*acons(aadt("Comprehension",[],contextFreeSyntax()),[\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="results"),\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="generators")],[],alabel="set")*/
    public final io.usethesource.vallang.type.Type ADT_BooleanLiteral;	/*aadt("BooleanLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_BooleanLiteral;	/*aadt("BooleanLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Tree;	/*aadt("Tree",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T1;	/*aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)*/
    public final io.usethesource.vallang.type.Type ADT_KeywordArguments_1;	/*aadt("KeywordArguments",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordArguments_1;	/*aadt("KeywordArguments",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PatternWithAction;	/*aadt("PatternWithAction",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PatternWithAction;	/*aadt("PatternWithAction",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type PatternWithAction_replacing_Pattern_Replacement;	/*acons(aadt("PatternWithAction",[],contextFreeSyntax()),[aadt("Pattern",[],contextFreeSyntax(),alabel="pattern"),aadt("Replacement",[],contextFreeSyntax(),alabel="replacement")],[],alabel="replacing")*/
    public final io.usethesource.vallang.type.Type ADT_UnicodeEscape;	/*aadt("UnicodeEscape",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_UnicodeEscape;	/*aadt("UnicodeEscape",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type UnicodeEscape_utf32_;	/*acons(aadt("UnicodeEscape",[],lexicalSyntax()),[],[],alabel="utf32")*/
    public final io.usethesource.vallang.type.Type ADT_Type;	/*aadt("Type",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Type;	/*aadt("Type",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Type_bracket_Type;	/*acons(aadt("Type",[],contextFreeSyntax()),[aadt("Type",[],contextFreeSyntax(),alabel="type")],[],alabel="bracket")*/
    public final io.usethesource.vallang.type.Type ADT_ShellCommand;	/*aadt("ShellCommand",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ShellCommand;	/*aadt("ShellCommand",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ShellCommand_quit_OptionalTerminator;	/*acons(aadt("ShellCommand",[],contextFreeSyntax()),[aadt("OptionalTerminator",[],lexicalSyntax(),alabel="terminator")],[],alabel="quit")*/
    public final io.usethesource.vallang.type.Type ADT_KeywordFormal;	/*aadt("KeywordFormal",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordFormal;	/*aadt("KeywordFormal",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type KeywordFormal_default_Type_Name_Expression;	/*acons(aadt("KeywordFormal",[],contextFreeSyntax()),[aadt("Type",[],contextFreeSyntax(),alabel="type"),aadt("Name",[],lexicalSyntax(),alabel="name"),aadt("Expression",[],contextFreeSyntax(),alabel="expression")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type ADT_Case;	/*aadt("Case",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Case;	/*aadt("Case",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Kind;	/*aadt("Kind",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Kind;	/*aadt("Kind",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Kind_all_;	/*acons(aadt("Kind",[],contextFreeSyntax()),[],[],alabel="all")*/
    public final io.usethesource.vallang.type.Type ADT_Mapping_Expression;	/*aadt("Mapping",[aadt("Expression",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Mapping_Expression;	/*aadt("Mapping",[aadt("Expression",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Strategy;	/*aadt("Strategy",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Strategy;	/*aadt("Strategy",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Mapping_1;	/*aadt("Mapping",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Mapping_1;	/*aadt("Mapping",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Sym;	/*aadt("Sym",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Sym;	/*aadt("Sym",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Sym_iterStarSep_Sym_Sym;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("Sym",[],contextFreeSyntax(),alabel="symbol"),aadt("Sym",[],contextFreeSyntax(),alabel="sep")],[],alabel="iterStarSep")*/
    public final io.usethesource.vallang.type.Type ADT_TimePartNoTZ;	/*aadt("TimePartNoTZ",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TimePartNoTZ;	/*aadt("TimePartNoTZ",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Pattern;	/*aadt("Pattern",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Pattern;	/*aadt("Pattern",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Expression_join_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="join")*/
    public final io.usethesource.vallang.type.Type ADT_OptionalTerminator;	/*aadt("OptionalTerminator",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_OptionalTerminator;	/*aadt("OptionalTerminator",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Target;	/*aadt("Target",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Target;	/*aadt("Target",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_IntegerLiteral;	/*aadt("IntegerLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_IntegerLiteral;	/*aadt("IntegerLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type IntegerLiteral_octalIntegerLiteral_OctalIntegerLiteral;	/*acons(aadt("IntegerLiteral",[],contextFreeSyntax()),[aadt("OctalIntegerLiteral",[],lexicalSyntax(),alabel="anonymousoctalIntegerLiteral")],[],alabel="octalIntegerLiteral")*/
    public final io.usethesource.vallang.type.Type ADT_FunctionModifier;	/*aadt("FunctionModifier",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionModifier;	/*aadt("FunctionModifier",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type FunctionModifier_default_;	/*acons(aadt("FunctionModifier",[],contextFreeSyntax()),[],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type Statement_expression_Expression;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="expression")],[],alabel="expression")*/
    public final io.usethesource.vallang.type.Type ADT_Command;	/*aadt("Command",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Command;	/*aadt("Command",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Command_import_Import;	/*acons(aadt("Command",[],contextFreeSyntax()),[aadt("Import",[],contextFreeSyntax(),alabel="anonymousimport")],[],alabel="import")*/
    public final io.usethesource.vallang.type.Type ADT_KeywordArguments_Expression;	/*aadt("KeywordArguments",[aadt("Expression",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordArguments_Expression;	/*aadt("KeywordArguments",[aadt("Expression",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Literal;	/*aadt("Literal",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Literal;	/*aadt("Literal",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Literal_integer_IntegerLiteral;	/*acons(aadt("Literal",[],contextFreeSyntax()),[aadt("IntegerLiteral",[],contextFreeSyntax(),alabel="anonymousinteger")],[],alabel="integer")*/
    public final io.usethesource.vallang.type.Type ADT_Assignable;	/*aadt("Assignable",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Assignable;	/*aadt("Assignable",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T52;	/*\iter-seps(aadt("Assignable",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="elements")*/
    public final io.usethesource.vallang.type.Type Assignable_tuple_iter_seps_Assignable;	/*acons(aadt("Assignable",[],contextFreeSyntax()),[\iter-seps(aadt("Assignable",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="elements")],[],alabel="tuple")*/
    public final io.usethesource.vallang.type.Type Sym_iterStar_Sym;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("Sym",[],contextFreeSyntax(),alabel="symbol")],[],alabel="iterStar")*/
    public final io.usethesource.vallang.type.Type ADT_ImportedModule;	/*aadt("ImportedModule",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ImportedModule;	/*aadt("ImportedModule",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T9;	/*\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="conditions")*/
    public final io.usethesource.vallang.type.Type Statement_ifThenElse_Label_iter_seps_Expression_Statement_Statement;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("Label",[],contextFreeSyntax(),alabel="label"),\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="conditions"),aadt("Statement",[],contextFreeSyntax(),alabel="thenStatement"),aadt("Statement",[],contextFreeSyntax(),alabel="elseStatement")],[],alabel="ifThenElse")*/
    public final io.usethesource.vallang.type.Type $T51;	/*\iter-seps(aadt("Sym",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="parameters")*/
    public final io.usethesource.vallang.type.Type Sym_parametrized_Nonterminal_iter_seps_Sym;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("Nonterminal",[],lexicalSyntax(),alabel="anonymousparametrized"),\iter-seps(aadt("Sym",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="parameters")],[],alabel="parametrized")*/
    public final io.usethesource.vallang.type.Type $T25;	/*\iter-star-seps(aadt("Pattern",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="arguments")*/
    public final io.usethesource.vallang.type.Type ADT_Prod;	/*aadt("Prod",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Prod;	/*aadt("Prod",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_ProdModifier;	/*aadt("ProdModifier",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ProdModifier;	/*aadt("ProdModifier",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T54;	/*\iter-star-seps(aadt("ProdModifier",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="modifiers")*/
    public final io.usethesource.vallang.type.Type $T55;	/*\iter-star-seps(aadt("Sym",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="syms")*/
    public final io.usethesource.vallang.type.Type Prod_labeled_iter_star_seps_ProdModifier_Name_iter_star_seps_Sym;	/*acons(aadt("Prod",[],contextFreeSyntax()),[\iter-star-seps(aadt("ProdModifier",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="modifiers"),aadt("Name",[],lexicalSyntax(),alabel="name"),\iter-star-seps(aadt("Sym",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="syms")],[],alabel="labeled")*/
    public final io.usethesource.vallang.type.Type Sym_nonterminal_Nonterminal;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("Nonterminal",[],lexicalSyntax(),alabel="anonymousnonterminal")],[],alabel="nonterminal")*/
    public final io.usethesource.vallang.type.Type ADT_Output;	/*aadt("Output",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Output;	/*aadt("Output",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type Output_resultOutput_;	/*acons(aadt("Output",[],lexicalSyntax()),[],[],alabel="resultOutput")*/
    public final io.usethesource.vallang.type.Type $T11;	/*alit("|")*/
    public final io.usethesource.vallang.type.Type $T12;	/*\iter-seps(aadt("Sym",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit("|"),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="alternatives")*/
    public final io.usethesource.vallang.type.Type ADT_Class;	/*aadt("Class",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Class;	/*aadt("Class",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Class_intersection_Class_Class;	/*acons(aadt("Class",[],contextFreeSyntax()),[aadt("Class",[],contextFreeSyntax(),alabel="lhs"),aadt("Class",[],contextFreeSyntax(),alabel="rhs")],[],alabel="intersection")*/
    public final io.usethesource.vallang.type.Type ShellCommand_setOption_QualifiedName_OptionalEqualSign_Expression_OptionalTerminator;	/*acons(aadt("ShellCommand",[],contextFreeSyntax()),[aadt("QualifiedName",[],contextFreeSyntax(),alabel="name"),aadt("OptionalEqualSign",[],lexicalSyntax(),alabel="sign"),aadt("Expression",[],contextFreeSyntax(),alabel="expression"),aadt("OptionalTerminator",[],lexicalSyntax(),alabel="terminator")],[],alabel="setOption")*/
    public final io.usethesource.vallang.type.Type Pattern_multiVariable_QualifiedName;	/*acons(aadt("Pattern",[],contextFreeSyntax()),[aadt("QualifiedName",[],contextFreeSyntax(),alabel="qualifiedName")],[],alabel="multiVariable")*/
    public final io.usethesource.vallang.type.Type Sym_optional_Sym;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("Sym",[],contextFreeSyntax(),alabel="symbol")],[],alabel="optional")*/
    public final io.usethesource.vallang.type.Type ADT_Concrete;	/*aadt("Concrete",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Concrete;	/*aadt("Concrete",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type Sym_caseInsensitiveLiteral_CaseInsensitiveStringConstant;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("CaseInsensitiveStringConstant",[],lexicalSyntax(),alabel="anonymouscaseInsensitiveLiteral")],[],alabel="caseInsensitiveLiteral")*/
    public final io.usethesource.vallang.type.Type ADT_OptionalEqualSign;	/*aadt("OptionalEqualSign",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_OptionalEqualSign;	/*aadt("OptionalEqualSign",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type OptionalEqualSign_absent_;	/*acons(aadt("OptionalEqualSign",[],lexicalSyntax()),[],[],alabel="absent")*/
    public final io.usethesource.vallang.type.Type $T18;	/*\iter-seps(aadt("Type",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="types")*/
    public final io.usethesource.vallang.type.Type ADT_Variable;	/*aadt("Variable",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Variable;	/*aadt("Variable",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Variable_initialized_Name_Expression;	/*acons(aadt("Variable",[],contextFreeSyntax()),[aadt("Name",[],lexicalSyntax(),alabel="name"),aadt("Expression",[],contextFreeSyntax(),alabel="initial")],[],alabel="initialized")*/
    public final io.usethesource.vallang.type.Type Class_bracket_Class;	/*acons(aadt("Class",[],contextFreeSyntax()),[aadt("Class",[],contextFreeSyntax(),alabel="charClass")],[],alabel="bracket")*/
    public final io.usethesource.vallang.type.Type ADT_PostProtocolChars;	/*aadt("PostProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PostProtocolChars;	/*aadt("PostProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Assignment;	/*aadt("Assignment",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Assignment;	/*aadt("Assignment",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Assignment_division_;	/*acons(aadt("Assignment",[],contextFreeSyntax()),[],[],alabel="division")*/
    public final io.usethesource.vallang.type.Type $T29;	/*\iter-seps(aadt("Pattern",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="elements")*/
    public final io.usethesource.vallang.type.Type ADT_Range;	/*aadt("Range",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Range;	/*aadt("Range",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Expression_sliceStep_Expression_OptionalExpression_Expression_OptionalExpression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="anonymoussliceStep"),aadt("OptionalExpression",[],contextFreeSyntax(),alabel="optFirst"),aadt("Expression",[],contextFreeSyntax(),alabel="second"),aadt("OptionalExpression",[],contextFreeSyntax(),alabel="optLast")],[],alabel="sliceStep")*/
    public final io.usethesource.vallang.type.Type ADT_MidStringChars;	/*aadt("MidStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_MidStringChars;	/*aadt("MidStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type Expression_concrete_Concrete;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Concrete",[],lexicalSyntax(),alabel="anonymousconcrete")],[],alabel="concrete")*/
    public final io.usethesource.vallang.type.Type Expression_literal_Literal;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Literal",[],contextFreeSyntax(),alabel="anonymousliteral")],[],alabel="literal")*/
    public final io.usethesource.vallang.type.Type Command_statement_Statement;	/*acons(aadt("Command",[],contextFreeSyntax()),[aadt("Statement",[],contextFreeSyntax(),alabel="anonymousstatement")],[],alabel="statement")*/
    public final io.usethesource.vallang.type.Type ADT_LocalVariableDeclaration;	/*aadt("LocalVariableDeclaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_LocalVariableDeclaration;	/*aadt("LocalVariableDeclaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Expression_composition_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="composition")*/
    public final io.usethesource.vallang.type.Type Type_selector_DataTypeSelector;	/*acons(aadt("Type",[],contextFreeSyntax()),[aadt("DataTypeSelector",[],contextFreeSyntax(),alabel="anonymousselector")],[],alabel="selector")*/
    public final io.usethesource.vallang.type.Type ImportedModule_renamings_QualifiedName_Renamings;	/*acons(aadt("ImportedModule",[],contextFreeSyntax()),[aadt("QualifiedName",[],contextFreeSyntax(),alabel="name"),aadt("Renamings",[],contextFreeSyntax(),alabel="renamings")],[],alabel="renamings")*/
    public final io.usethesource.vallang.type.Type ADT_ProtocolChars;	/*aadt("ProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ProtocolChars;	/*aadt("ProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_BasicType;	/*aadt("BasicType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_BasicType;	/*aadt("BasicType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type BasicType_bag_;	/*acons(aadt("BasicType",[],contextFreeSyntax()),[],[],alabel="bag")*/
    public final io.usethesource.vallang.type.Type ADT_Visibility;	/*aadt("Visibility",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Visibility;	/*aadt("Visibility",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type BasicType_tuple_;	/*acons(aadt("BasicType",[],contextFreeSyntax()),[],[],alabel="tuple")*/
    public final io.usethesource.vallang.type.Type ADT_FunctionType;	/*aadt("FunctionType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionType;	/*aadt("FunctionType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type UnicodeEscape_ascii_;	/*acons(aadt("UnicodeEscape",[],lexicalSyntax()),[],[],alabel="ascii")*/
    public final io.usethesource.vallang.type.Type KeywordArguments_1_none_;	/*acons(aadt("KeywordArguments",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax()),[],[],alabel="none")*/
    public final io.usethesource.vallang.type.Type ADT_Replacement;	/*aadt("Replacement",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Replacement;	/*aadt("Replacement",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Kind_module_;	/*acons(aadt("Kind",[],contextFreeSyntax()),[],[],alabel="module")*/
    public final io.usethesource.vallang.type.Type ADT_StringCharacter;	/*aadt("StringCharacter",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringCharacter;	/*aadt("StringCharacter",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type StringCharacter_continuation_str;	/*acons(aadt("StringCharacter",[],lexicalSyntax()),[astr(alabel="anonymouscontinuation")],[],alabel="continuation")*/
    public final io.usethesource.vallang.type.Type ADT_Label;	/*aadt("Label",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Label;	/*aadt("Label",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Output_stdoutOutput_;	/*acons(aadt("Output",[],lexicalSyntax()),[],[],alabel="stdoutOutput")*/
    public final io.usethesource.vallang.type.Type Expression_transitiveReflexiveClosure_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="argument")],[],alabel="transitiveReflexiveClosure")*/
    public final io.usethesource.vallang.type.Type BasicType_list_;	/*acons(aadt("BasicType",[],contextFreeSyntax()),[],[],alabel="list")*/
    public final io.usethesource.vallang.type.Type ADT_DateTimeLiteral;	/*aadt("DateTimeLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DateTimeLiteral;	/*aadt("DateTimeLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_SyntaxDefinition;	/*aadt("SyntaxDefinition",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_SyntaxDefinition;	/*aadt("SyntaxDefinition",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type SyntaxDefinition_layout_Visibility_Sym_Prod;	/*acons(aadt("SyntaxDefinition",[],contextFreeSyntax()),[aadt("Visibility",[],contextFreeSyntax(),alabel="vis"),aadt("Sym",[],contextFreeSyntax(),alabel="defined"),aadt("Prod",[],contextFreeSyntax(),alabel="production")],[],alabel="layout")*/
    public final io.usethesource.vallang.type.Type Expression_modulo_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="modulo")*/
    public final io.usethesource.vallang.type.Type ADT_TypeArg;	/*aadt("TypeArg",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TypeArg;	/*aadt("TypeArg",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T60;	/*\iter-seps(aadt("TypeArg",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="arguments")*/
    public final io.usethesource.vallang.type.Type ShellCommand_unextend_QualifiedName_OptionalTerminator;	/*acons(aadt("ShellCommand",[],contextFreeSyntax()),[aadt("QualifiedName",[],contextFreeSyntax(),alabel="name"),aadt("OptionalTerminator",[],lexicalSyntax(),alabel="terminator")],[],alabel="unextend")*/
    public final io.usethesource.vallang.type.Type SyntaxDefinition_keyword_Sym_Prod;	/*acons(aadt("SyntaxDefinition",[],contextFreeSyntax()),[aadt("Sym",[],contextFreeSyntax(),alabel="defined"),aadt("Prod",[],contextFreeSyntax(),alabel="production")],[],alabel="keyword")*/
    public final io.usethesource.vallang.type.Type ADT_RegExpModifier;	/*aadt("RegExpModifier",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RegExpModifier;	/*aadt("RegExpModifier",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type Statement_filter_;	/*acons(aadt("Statement",[],contextFreeSyntax()),[],[],alabel="filter")*/
    public final io.usethesource.vallang.type.Type Statement_doWhile_Label_Statement_Expression;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("Label",[],contextFreeSyntax(),alabel="label"),aadt("Statement",[],contextFreeSyntax(),alabel="body"),aadt("Expression",[],contextFreeSyntax(),alabel="condition")],[],alabel="doWhile")*/
    public final io.usethesource.vallang.type.Type Expression_reifiedType_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="symbol"),aadt("Expression",[],contextFreeSyntax(),alabel="definitions")],[],alabel="reifiedType")*/
    public final io.usethesource.vallang.type.Type $T65;	/*\iter-seps(aadt("Assignable",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="arguments")*/
    public final io.usethesource.vallang.type.Type Visibility_private_;	/*acons(aadt("Visibility",[],contextFreeSyntax()),[],[],alabel="private")*/
    public final io.usethesource.vallang.type.Type ADT_StringTail;	/*aadt("StringTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringTail;	/*aadt("StringTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type StringTail_midTemplate_MidStringChars_StringTemplate_StringTail;	/*acons(aadt("StringTail",[],contextFreeSyntax()),[aadt("MidStringChars",[],lexicalSyntax(),alabel="mid"),aadt("StringTemplate",[],contextFreeSyntax(),alabel="template"),aadt("StringTail",[],contextFreeSyntax(),alabel="tail")],[],alabel="midTemplate")*/
    public final io.usethesource.vallang.type.Type Strategy_bottomUpBreak_;	/*acons(aadt("Strategy",[],contextFreeSyntax()),[],[],alabel="bottomUpBreak")*/
    public final io.usethesource.vallang.type.Type BasicType_real_;	/*acons(aadt("BasicType",[],contextFreeSyntax()),[],[],alabel="real")*/
    public final io.usethesource.vallang.type.Type ADT_FunctionModifiers;	/*aadt("FunctionModifiers",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionModifiers;	/*aadt("FunctionModifiers",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T46;	/*\iter-star-seps(aadt("FunctionModifier",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="anonymousmodifierlist")*/
    public final io.usethesource.vallang.type.Type FunctionModifiers_modifierlist_iter_star_seps_FunctionModifier;	/*acons(aadt("FunctionModifiers",[],contextFreeSyntax()),[\iter-star-seps(aadt("FunctionModifier",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="anonymousmodifierlist")],[],alabel="modifierlist")*/
    public final io.usethesource.vallang.type.Type Sym_characterClass_Class;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("Class",[],contextFreeSyntax(),alabel="anonymouscharacterClass")],[],alabel="characterClass")*/
    public final io.usethesource.vallang.type.Type $T14;	/*\iter-star-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="preStatsThen")*/
    public final io.usethesource.vallang.type.Type ADT_Declaration;	/*aadt("Declaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Declaration;	/*aadt("Declaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Declaration_annotation_Tags_Visibility_Type_Type_Name;	/*acons(aadt("Declaration",[],contextFreeSyntax()),[aadt("Tags",[],contextFreeSyntax(),alabel="tags"),aadt("Visibility",[],contextFreeSyntax(),alabel="visibility"),aadt("Type",[],contextFreeSyntax(),alabel="annoType"),aadt("Type",[],contextFreeSyntax(),alabel="onType"),aadt("Name",[],lexicalSyntax(),alabel="name")],[],alabel="annotation")*/
    public final io.usethesource.vallang.type.Type ADT_DecimalIntegerLiteral;	/*aadt("DecimalIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DecimalIntegerLiteral;	/*aadt("DecimalIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Assoc;	/*aadt("Assoc",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Assoc;	/*aadt("Assoc",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Pattern_negative_Pattern;	/*acons(aadt("Pattern",[],contextFreeSyntax()),[aadt("Pattern",[],contextFreeSyntax(),alabel="argument")],[],alabel="negative")*/
    public final io.usethesource.vallang.type.Type Comprehension_map_Expression_Expression_iter_seps_Expression;	/*acons(aadt("Comprehension",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="from"),aadt("Expression",[],contextFreeSyntax(),alabel="to"),\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="generators")],[],alabel="map")*/
    public final io.usethesource.vallang.type.Type Expression_qualifiedName_QualifiedName;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("QualifiedName",[],contextFreeSyntax(),alabel="anonymousqualifiedName")],[],alabel="qualifiedName")*/
    public final io.usethesource.vallang.type.Type ADT_FunctionDeclaration;	/*aadt("FunctionDeclaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionDeclaration;	/*aadt("FunctionDeclaration",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type FunctionDeclaration_conditional_Tags_Visibility_Signature_Expression_iter_seps_Expression;	/*acons(aadt("FunctionDeclaration",[],contextFreeSyntax()),[aadt("Tags",[],contextFreeSyntax(),alabel="tags"),aadt("Visibility",[],contextFreeSyntax(),alabel="visibility"),aadt("Signature",[],contextFreeSyntax(),alabel="signature"),aadt("Expression",[],contextFreeSyntax(),alabel="expression"),\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="conditions")],[],alabel="conditional")*/
    public final io.usethesource.vallang.type.Type Statement_return_Statement;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("Statement",[],contextFreeSyntax(),alabel="statement")],[],alabel="return")*/
    public final io.usethesource.vallang.type.Type ADT_Toplevel;	/*aadt("Toplevel",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Toplevel;	/*aadt("Toplevel",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T62;	/*\iter-star-seps(aadt("Toplevel",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="anonymoustoplevels")*/
    public final io.usethesource.vallang.type.Type $T58;	/*\iter-star-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="statements")*/
    public final io.usethesource.vallang.type.Type IntegerLiteral_hexIntegerLiteral_HexIntegerLiteral;	/*acons(aadt("IntegerLiteral",[],contextFreeSyntax()),[aadt("HexIntegerLiteral",[],lexicalSyntax(),alabel="anonymoushexIntegerLiteral")],[],alabel="hexIntegerLiteral")*/
    public final io.usethesource.vallang.type.Type ADT_UserType;	/*aadt("UserType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_UserType;	/*aadt("UserType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T48;	/*\iter-seps(aadt("Type",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="parameters")*/
    public final io.usethesource.vallang.type.Type UserType_parametric_QualifiedName_iter_seps_Type;	/*acons(aadt("UserType",[],contextFreeSyntax()),[aadt("QualifiedName",[],contextFreeSyntax(),alabel="anonymousparametric"),\iter-seps(aadt("Type",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="parameters")],[],alabel="parametric")*/
    public final io.usethesource.vallang.type.Type ADT_ConcretePart;	/*aadt("ConcretePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ConcretePart;	/*aadt("ConcretePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ConcretePart_gt_;	/*acons(aadt("ConcretePart",[],lexicalSyntax()),[],[],alabel="gt")*/
    public final io.usethesource.vallang.type.Type Kind_function_;	/*acons(aadt("Kind",[],contextFreeSyntax()),[],[],alabel="function")*/
    public final io.usethesource.vallang.type.Type ShellCommand_unimport_QualifiedName_OptionalTerminator;	/*acons(aadt("ShellCommand",[],contextFreeSyntax()),[aadt("QualifiedName",[],contextFreeSyntax(),alabel="name"),aadt("OptionalTerminator",[],lexicalSyntax(),alabel="terminator")],[],alabel="unimport")*/
    public final io.usethesource.vallang.type.Type Expression_equals_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="equals")*/
    public final io.usethesource.vallang.type.Type $T37;	/*\iter-star-seps(aadt("TypeArg",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="arguments")*/
    public final io.usethesource.vallang.type.Type FunctionType_typeArguments_Type_iter_star_seps_TypeArg;	/*acons(aadt("FunctionType",[],contextFreeSyntax()),[aadt("Type",[],contextFreeSyntax(),alabel="type"),\iter-star-seps(aadt("TypeArg",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="arguments")],[],alabel="typeArguments")*/
    public final io.usethesource.vallang.type.Type ADT_StringMiddle;	/*aadt("StringMiddle",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringMiddle;	/*aadt("StringMiddle",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type StringMiddle_template_MidStringChars_StringTemplate_StringMiddle;	/*acons(aadt("StringMiddle",[],contextFreeSyntax()),[aadt("MidStringChars",[],lexicalSyntax(),alabel="mid"),aadt("StringTemplate",[],contextFreeSyntax(),alabel="template"),aadt("StringMiddle",[],contextFreeSyntax(),alabel="tail")],[],alabel="template")*/
    public final io.usethesource.vallang.type.Type Expression_nonEquals_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="nonEquals")*/
    public final io.usethesource.vallang.type.Type ShellCommand_unsetOption_QualifiedName_OptionalTerminator;	/*acons(aadt("ShellCommand",[],contextFreeSyntax()),[aadt("QualifiedName",[],contextFreeSyntax(),alabel="name"),aadt("OptionalTerminator",[],lexicalSyntax(),alabel="terminator")],[],alabel="unsetOption")*/
    public final io.usethesource.vallang.type.Type $T50;	/*\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="elements")*/
    public final io.usethesource.vallang.type.Type Expression_tuple_iter_seps_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="elements")],[],alabel="tuple")*/
    public final io.usethesource.vallang.type.Type ADT_DatePart;	/*aadt("DatePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DatePart;	/*aadt("DatePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type Strategy_topDown_;	/*acons(aadt("Strategy",[],contextFreeSyntax()),[],[],alabel="topDown")*/
    public final io.usethesource.vallang.type.Type ADT_Declarator;	/*aadt("Declarator",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Declarator;	/*aadt("Declarator",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Literal_regExp_RegExpLiteral;	/*acons(aadt("Literal",[],contextFreeSyntax()),[aadt("RegExpLiteral",[],lexicalSyntax(),alabel="anonymousregExp")],[],alabel="regExp")*/
    public final io.usethesource.vallang.type.Type ADT_PathTail;	/*aadt("PathTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PathTail;	/*aadt("PathTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type PathTail_mid_MidPathChars_Expression_PathTail;	/*acons(aadt("PathTail",[],contextFreeSyntax()),[aadt("MidPathChars",[],lexicalSyntax(),alabel="mid"),aadt("Expression",[],contextFreeSyntax(),alabel="expression"),aadt("PathTail",[],contextFreeSyntax(),alabel="tail")],[],alabel="mid")*/
    public final io.usethesource.vallang.type.Type Type_basic_BasicType;	/*acons(aadt("Type",[],contextFreeSyntax()),[aadt("BasicType",[],contextFreeSyntax(),alabel="anonymousbasic")],[],alabel="basic")*/
    public final io.usethesource.vallang.type.Type ADT_Name;	/*aadt("Name",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Name;	/*aadt("Name",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Catch;	/*aadt("Catch",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Catch;	/*aadt("Catch",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T32;	/*\iter-seps(aadt("Catch",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="handlers")*/
    public final io.usethesource.vallang.type.Type ADT_ProtocolPart;	/*aadt("ProtocolPart",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ProtocolPart;	/*aadt("ProtocolPart",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ProtocolPart_interpolated_PreProtocolChars_Expression_ProtocolTail;	/*acons(aadt("ProtocolPart",[],contextFreeSyntax()),[aadt("PreProtocolChars",[],lexicalSyntax(),alabel="pre"),aadt("Expression",[],contextFreeSyntax(),alabel="expression"),aadt("ProtocolTail",[],contextFreeSyntax(),alabel="tail")],[],alabel="interpolated")*/
    public final io.usethesource.vallang.type.Type Expression_reducer_Expression_Expression_iter_seps_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="init"),aadt("Expression",[],contextFreeSyntax(),alabel="result"),\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="generators")],[],alabel="reducer")*/
    public final io.usethesource.vallang.type.Type ADT_RegExpLiteral;	/*aadt("RegExpLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RegExpLiteral;	/*aadt("RegExpLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type Assignable_ifDefinedOrDefault_Assignable_Expression;	/*acons(aadt("Assignable",[],contextFreeSyntax()),[aadt("Assignable",[],contextFreeSyntax(),alabel="receiver"),aadt("Expression",[],contextFreeSyntax(),alabel="defaultExpression")],[],alabel="ifDefinedOrDefault")*/
    public final io.usethesource.vallang.type.Type ADT_OptionalExpression;	/*aadt("OptionalExpression",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_OptionalExpression;	/*aadt("OptionalExpression",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type OptionalExpression_noExpression_;	/*acons(aadt("OptionalExpression",[],contextFreeSyntax()),[],[],alabel="noExpression")*/
    public final io.usethesource.vallang.type.Type Expression_equivalence_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="equivalence")*/
    public final io.usethesource.vallang.type.Type $T49;	/*\iter-star-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="elements0")*/
    public final io.usethesource.vallang.type.Type Expression_set_iter_star_seps_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[\iter-star-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="elements0")],[],alabel="set")*/
    public final io.usethesource.vallang.type.Type Label_empty_;	/*acons(aadt("Label",[],contextFreeSyntax()),[],[],alabel="empty")*/
    public final io.usethesource.vallang.type.Type Strategy_innermost_;	/*acons(aadt("Strategy",[],contextFreeSyntax()),[],[],alabel="innermost")*/
    public final io.usethesource.vallang.type.Type Expression_stepRange_Expression_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="first"),aadt("Expression",[],contextFreeSyntax(),alabel="second"),aadt("Expression",[],contextFreeSyntax(),alabel="last")],[],alabel="stepRange")*/
    public final io.usethesource.vallang.type.Type ADT_Import;	/*aadt("Import",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Import;	/*aadt("Import",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Import_default_ImportedModule;	/*acons(aadt("Import",[],contextFreeSyntax()),[aadt("ImportedModule",[],contextFreeSyntax(),alabel="module")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type Sym_column_Sym_IntegerLiteral;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("Sym",[],contextFreeSyntax(),alabel="symbol"),aadt("IntegerLiteral",[],contextFreeSyntax(),alabel="column")],[],alabel="column")*/
    public final io.usethesource.vallang.type.Type ADT_ModuleParameters;	/*aadt("ModuleParameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ModuleParameters;	/*aadt("ModuleParameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T0;	/*aparameter("T",aadt("Tree",[],dataSyntax()),closed=false)*/
    public final io.usethesource.vallang.type.Type ADT_RationalLiteral;	/*aadt("RationalLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RationalLiteral;	/*aadt("RationalLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type $T59;	/*\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="subscripts")*/
    public final io.usethesource.vallang.type.Type BasicType_void_;	/*acons(aadt("BasicType",[],contextFreeSyntax()),[],[],alabel="void")*/
    public final io.usethesource.vallang.type.Type $T28;	/*\iter-seps(aadt("Variable",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="variables")*/
    public final io.usethesource.vallang.type.Type Declaration_variable_Tags_Visibility_Type_iter_seps_Variable;	/*acons(aadt("Declaration",[],contextFreeSyntax()),[aadt("Tags",[],contextFreeSyntax(),alabel="tags"),aadt("Visibility",[],contextFreeSyntax(),alabel="visibility"),aadt("Type",[],contextFreeSyntax(),alabel="type"),\iter-seps(aadt("Variable",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="variables")],[],alabel="variable")*/
    public final io.usethesource.vallang.type.Type Assoc_left_;	/*acons(aadt("Assoc",[],contextFreeSyntax()),[],[],alabel="left")*/
    public final io.usethesource.vallang.type.Type ADT_QualifiedName;	/*aadt("QualifiedName",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_QualifiedName;	/*aadt("QualifiedName",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T8;	/*opt(aadt("QualifiedName",[],contextFreeSyntax()),alabel="optName")*/
    public final io.usethesource.vallang.type.Type ShellCommand_test_opt_QualifiedName_OptionalTerminator;	/*acons(aadt("ShellCommand",[],contextFreeSyntax()),[opt(aadt("QualifiedName",[],contextFreeSyntax()),alabel="optName"),aadt("OptionalTerminator",[],lexicalSyntax(),alabel="terminator")],[],alabel="test")*/
    public final io.usethesource.vallang.type.Type $T30;	/*\iter-star-seps(aadt("Import",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="imports")*/
    public final io.usethesource.vallang.type.Type BasicType_type_;	/*acons(aadt("BasicType",[],contextFreeSyntax()),[],[],alabel="type")*/
    public final io.usethesource.vallang.type.Type ADT_StructuredType;	/*aadt("StructuredType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StructuredType;	/*aadt("StructuredType",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type StructuredType_default_BasicType_iter_seps_TypeArg;	/*acons(aadt("StructuredType",[],contextFreeSyntax()),[aadt("BasicType",[],contextFreeSyntax(),alabel="basicType"),\iter-seps(aadt("TypeArg",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="arguments")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type Literal_real_RealLiteral;	/*acons(aadt("Literal",[],contextFreeSyntax()),[aadt("RealLiteral",[],lexicalSyntax(),alabel="anonymousreal")],[],alabel="real")*/
    public final io.usethesource.vallang.type.Type $T61;	/*\iter-seps(aadt("QualifiedName",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="variables")*/
    public final io.usethesource.vallang.type.Type Statement_solve_iter_seps_QualifiedName_Bound_Statement;	/*acons(aadt("Statement",[],contextFreeSyntax()),[\iter-seps(aadt("QualifiedName",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="variables"),aadt("Bound",[],contextFreeSyntax(),alabel="bound"),aadt("Statement",[],contextFreeSyntax(),alabel="body")],[],alabel="solve")*/
    public final io.usethesource.vallang.type.Type Type_variable_TypeVar;	/*acons(aadt("Type",[],contextFreeSyntax()),[aadt("TypeVar",[],contextFreeSyntax(),alabel="anonymousvariable")],[],alabel="variable")*/
    public final io.usethesource.vallang.type.Type $T63;	/*\iter-star-seps(aadt("Range",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="ranges")*/
    public final io.usethesource.vallang.type.Type Class_simpleCharclass_iter_star_seps_Range;	/*acons(aadt("Class",[],contextFreeSyntax()),[\iter-star-seps(aadt("Range",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="ranges")],[],alabel="simpleCharclass")*/
    public final io.usethesource.vallang.type.Type Type_user_UserType;	/*acons(aadt("Type",[],contextFreeSyntax()),[aadt("UserType",[],contextFreeSyntax(),alabel="anonymoususer")],[],alabel="user")*/
    public final io.usethesource.vallang.type.Type Pattern_splice_Pattern;	/*acons(aadt("Pattern",[],contextFreeSyntax()),[aadt("Pattern",[],contextFreeSyntax(),alabel="argument")],[],alabel="splice")*/
    public final io.usethesource.vallang.type.Type DateTimeLiteral_dateAndTimeLiteral_DateAndTime;	/*acons(aadt("DateTimeLiteral",[],contextFreeSyntax()),[aadt("DateAndTime",[],lexicalSyntax(),alabel="anonymousdateAndTimeLiteral")],[],alabel="dateAndTimeLiteral")*/
    public final io.usethesource.vallang.type.Type Pattern_typedVariableBecomes_Type_Name_Pattern;	/*acons(aadt("Pattern",[],contextFreeSyntax()),[aadt("Type",[],contextFreeSyntax(),alabel="type"),aadt("Name",[],lexicalSyntax(),alabel="name"),aadt("Pattern",[],contextFreeSyntax(),alabel="pattern")],[],alabel="typedVariableBecomes")*/
    public final io.usethesource.vallang.type.Type ADT_Body;	/*aadt("Body",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Body;	/*aadt("Body",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Body_toplevels_iter_star_seps_Toplevel;	/*acons(aadt("Body",[],contextFreeSyntax()),[\iter-star-seps(aadt("Toplevel",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="anonymoustoplevels")],[],alabel="toplevels")*/
    public final io.usethesource.vallang.type.Type ImportedModule_actualsRenaming_QualifiedName_ModuleActuals_Renamings;	/*acons(aadt("ImportedModule",[],contextFreeSyntax()),[aadt("QualifiedName",[],contextFreeSyntax(),alabel="name"),aadt("ModuleActuals",[],contextFreeSyntax(),alabel="actuals"),aadt("Renamings",[],contextFreeSyntax(),alabel="renamings")],[],alabel="actualsRenaming")*/
    public final io.usethesource.vallang.type.Type Assignment_ifDefined_;	/*acons(aadt("Assignment",[],contextFreeSyntax()),[],[],alabel="ifDefined")*/
    public final io.usethesource.vallang.type.Type ADT_URLChars;	/*aadt("URLChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_URLChars;	/*aadt("URLChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type $T16;	/*\iter-star-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="preStatsElse")*/
    public final io.usethesource.vallang.type.Type Visibility_default_;	/*acons(aadt("Visibility",[],contextFreeSyntax()),[],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type ADT_Tags;	/*aadt("Tags",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Tags;	/*aadt("Tags",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Assignable_sliceStep_Assignable_OptionalExpression_Expression_OptionalExpression;	/*acons(aadt("Assignable",[],contextFreeSyntax()),[aadt("Assignable",[],contextFreeSyntax(),alabel="receiver"),aadt("OptionalExpression",[],contextFreeSyntax(),alabel="optFirst"),aadt("Expression",[],contextFreeSyntax(),alabel="second"),aadt("OptionalExpression",[],contextFreeSyntax(),alabel="optLast")],[],alabel="sliceStep")*/
    public final io.usethesource.vallang.type.Type ADT_ModuleActuals;	/*aadt("ModuleActuals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ModuleActuals;	/*aadt("ModuleActuals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Expression_subscript_Expression_iter_seps_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="anonymoussubscript"),\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="subscripts")],[],alabel="subscript")*/
    public final io.usethesource.vallang.type.Type BasicType_int_;	/*acons(aadt("BasicType",[],contextFreeSyntax()),[],[],alabel="int")*/
    public final io.usethesource.vallang.type.Type ADT_PathPart;	/*aadt("PathPart",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PathPart;	/*aadt("PathPart",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T20;	/*\iter-seps(aadt("Case",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="cases")*/
    public final io.usethesource.vallang.type.Type ADT_Signature;	/*aadt("Signature",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Signature;	/*aadt("Signature",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_KeywordArgument_1;	/*aadt("KeywordArgument",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordArgument_1;	/*aadt("KeywordArgument",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Parameters;	/*aadt("Parameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Parameters;	/*aadt("Parameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Parameters_varArgs_Formals_KeywordFormals;	/*acons(aadt("Parameters",[],contextFreeSyntax()),[aadt("Formals",[],contextFreeSyntax(),alabel="formals"),aadt("KeywordFormals",[],contextFreeSyntax(),alabel="keywordFormals")],[],alabel="varArgs")*/
    public final io.usethesource.vallang.type.Type $T41;	/*\iter-star-seps(aadt("Pattern",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="elements0")*/
    public final io.usethesource.vallang.type.Type Pattern_list_iter_star_seps_Pattern;	/*acons(aadt("Pattern",[],contextFreeSyntax()),[\iter-star-seps(aadt("Pattern",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="elements0")],[],alabel="list")*/
    public final io.usethesource.vallang.type.Type BasicType_listRelation_;	/*acons(aadt("BasicType",[],contextFreeSyntax()),[],[],alabel="listRelation")*/
    public final io.usethesource.vallang.type.Type Expression_negation_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="argument")],[],alabel="negation")*/
    public final io.usethesource.vallang.type.Type $T2;	/*\iter-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="statements")*/
    public final io.usethesource.vallang.type.Type Expression_closure_Type_Parameters_iter_seps_Statement;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Type",[],contextFreeSyntax(),alabel="type"),aadt("Parameters",[],contextFreeSyntax(),alabel="parameters"),\iter-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="statements")],[],alabel="closure")*/
    public final io.usethesource.vallang.type.Type Statement_append_DataTarget_Statement;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("DataTarget",[],contextFreeSyntax(),alabel="dataTarget"),aadt("Statement",[],contextFreeSyntax(),alabel="statement")],[],alabel="append")*/
    public final io.usethesource.vallang.type.Type $T36;	/*\iter-star-seps(aadt("Pattern",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="anonymousdefault")*/
    public final io.usethesource.vallang.type.Type Assignable_annotation_Assignable_Name;	/*acons(aadt("Assignable",[],contextFreeSyntax()),[aadt("Assignable",[],contextFreeSyntax(),alabel="receiver"),aadt("Name",[],lexicalSyntax(),alabel="annotation")],[],alabel="annotation")*/
    public final io.usethesource.vallang.type.Type Assignable_bracket_Assignable;	/*acons(aadt("Assignable",[],contextFreeSyntax()),[aadt("Assignable",[],contextFreeSyntax(),alabel="arg")],[],alabel="bracket")*/
    public final io.usethesource.vallang.type.Type Expression_ifDefinedOtherwise_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="ifDefinedOtherwise")*/
    public final io.usethesource.vallang.type.Type ADT_FunctionBody;	/*aadt("FunctionBody",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_FunctionBody;	/*aadt("FunctionBody",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Expression_list_iter_star_seps_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[\iter-star-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="elements0")],[],alabel="list")*/
    public final io.usethesource.vallang.type.Type Expression_asType_Type_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Type",[],contextFreeSyntax(),alabel="type"),aadt("Expression",[],contextFreeSyntax(),alabel="argument")],[],alabel="asType")*/
    public final io.usethesource.vallang.type.Type ADT_Tag;	/*aadt("Tag",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Tag;	/*aadt("Tag",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_LocationLiteral;	/*aadt("LocationLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_LocationLiteral;	/*aadt("LocationLiteral",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Target_labeled_Name;	/*acons(aadt("Target",[],contextFreeSyntax()),[aadt("Name",[],lexicalSyntax(),alabel="anonymouslabeled")],[],alabel="labeled")*/
    public final io.usethesource.vallang.type.Type StringMiddle_interpolated_MidStringChars_Expression_StringMiddle;	/*acons(aadt("StringMiddle",[],contextFreeSyntax()),[aadt("MidStringChars",[],lexicalSyntax(),alabel="mid"),aadt("Expression",[],contextFreeSyntax(),alabel="expression"),aadt("StringMiddle",[],contextFreeSyntax(),alabel="tail")],[],alabel="interpolated")*/
    public final io.usethesource.vallang.type.Type ADT_Field;	/*aadt("Field",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Field;	/*aadt("Field",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Assignable_constructor_Name_iter_seps_Assignable;	/*acons(aadt("Assignable",[],contextFreeSyntax()),[aadt("Name",[],lexicalSyntax(),alabel="name"),\iter-seps(aadt("Assignable",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="arguments")],[],alabel="constructor")*/
    public final io.usethesource.vallang.type.Type Statement_visit_Label_Visit;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("Label",[],contextFreeSyntax(),alabel="label"),aadt("Visit",[],contextFreeSyntax(),alabel="visit")],[],alabel="visit")*/
    public final io.usethesource.vallang.type.Type Declaration_function_FunctionDeclaration;	/*acons(aadt("Declaration",[],contextFreeSyntax()),[aadt("FunctionDeclaration",[],contextFreeSyntax(),alabel="anonymousfunction")],[],alabel="function")*/
    public final io.usethesource.vallang.type.Type ADT_HexIntegerLiteral;	/*aadt("HexIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_HexIntegerLiteral;	/*aadt("HexIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PostStringChars;	/*aadt("PostStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PostStringChars;	/*aadt("PostStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type $T64;	/*\iter-seps(aadt("Type",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="exceptions")*/
    public final io.usethesource.vallang.type.Type Signature_withThrows_FunctionModifiers_Type_Name_Parameters_iter_seps_Type;	/*acons(aadt("Signature",[],contextFreeSyntax()),[aadt("FunctionModifiers",[],contextFreeSyntax(),alabel="modifiers"),aadt("Type",[],contextFreeSyntax(),alabel="type"),aadt("Name",[],lexicalSyntax(),alabel="name"),aadt("Parameters",[],contextFreeSyntax(),alabel="parameters"),\iter-seps(aadt("Type",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="exceptions")],[],alabel="withThrows")*/
    public final io.usethesource.vallang.type.Type Prod_unlabeled_iter_star_seps_ProdModifier_iter_star_seps_Sym;	/*acons(aadt("Prod",[],contextFreeSyntax()),[\iter-star-seps(aadt("ProdModifier",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="modifiers"),\iter-star-seps(aadt("Sym",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="syms")],[],alabel="unlabeled")*/
    public final io.usethesource.vallang.type.Type ADT_DataTarget;	/*aadt("DataTarget",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DataTarget;	/*aadt("DataTarget",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_DataTypeSelector;	/*aadt("DataTypeSelector",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DataTypeSelector;	/*aadt("DataTypeSelector",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type DataTypeSelector_selector_QualifiedName_Name;	/*acons(aadt("DataTypeSelector",[],contextFreeSyntax()),[aadt("QualifiedName",[],contextFreeSyntax(),alabel="sort"),aadt("Name",[],lexicalSyntax(),alabel="production")],[],alabel="selector")*/
    public final io.usethesource.vallang.type.Type ConcretePart_newline_;	/*acons(aadt("ConcretePart",[],lexicalSyntax()),[],[],alabel="newline")*/
    public final io.usethesource.vallang.type.Type Literal_rational_RationalLiteral;	/*acons(aadt("Literal",[],contextFreeSyntax()),[aadt("RationalLiteral",[],lexicalSyntax(),alabel="anonymousrational")],[],alabel="rational")*/
    public final io.usethesource.vallang.type.Type StringMiddle_mid_MidStringChars;	/*acons(aadt("StringMiddle",[],contextFreeSyntax()),[aadt("MidStringChars",[],lexicalSyntax(),alabel="anonymousmid")],[],alabel="mid")*/
    public final io.usethesource.vallang.type.Type Field_name_Name;	/*acons(aadt("Field",[],contextFreeSyntax()),[aadt("Name",[],lexicalSyntax(),alabel="anonymousname")],[],alabel="name")*/
    public final io.usethesource.vallang.type.Type ShellCommand_listDeclarations_OptionalTerminator;	/*acons(aadt("ShellCommand",[],contextFreeSyntax()),[aadt("OptionalTerminator",[],lexicalSyntax(),alabel="terminator")],[],alabel="listDeclarations")*/
    public final io.usethesource.vallang.type.Type $T7;	/*\iter-seps(aadt("QualifiedName",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="names")*/
    public final io.usethesource.vallang.type.Type Type_structured_StructuredType;	/*acons(aadt("Type",[],contextFreeSyntax()),[aadt("StructuredType",[],contextFreeSyntax(),alabel="anonymousstructured")],[],alabel="structured")*/
    public final io.usethesource.vallang.type.Type Pattern_literal_Literal;	/*acons(aadt("Pattern",[],contextFreeSyntax()),[aadt("Literal",[],contextFreeSyntax(),alabel="anonymousliteral")],[],alabel="literal")*/
    public final io.usethesource.vallang.type.Type ADT_KeywordFormals;	/*aadt("KeywordFormals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordFormals;	/*aadt("KeywordFormals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ProtocolPart_nonInterpolated_ProtocolChars;	/*acons(aadt("ProtocolPart",[],contextFreeSyntax()),[aadt("ProtocolChars",[],lexicalSyntax(),alabel="anonymousnonInterpolated")],[],alabel="nonInterpolated")*/
    public final io.usethesource.vallang.type.Type Expression_intersection_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="intersection")*/
    public final io.usethesource.vallang.type.Type Declaration_alias_Tags_Visibility_UserType_Type;	/*acons(aadt("Declaration",[],contextFreeSyntax()),[aadt("Tags",[],contextFreeSyntax(),alabel="tags"),aadt("Visibility",[],contextFreeSyntax(),alabel="visibility"),aadt("UserType",[],contextFreeSyntax(),alabel="user"),aadt("Type",[],contextFreeSyntax(),alabel="base")],[],alabel="alias")*/
    public final io.usethesource.vallang.type.Type Sym_literal_StringConstant;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("StringConstant",[],lexicalSyntax(),alabel="anonymousliteral")],[],alabel="literal")*/
    public final io.usethesource.vallang.type.Type Class_complement_Class;	/*acons(aadt("Class",[],contextFreeSyntax()),[aadt("Class",[],contextFreeSyntax(),alabel="charClass")],[],alabel="complement")*/
    public final io.usethesource.vallang.type.Type Statement_for_Label_iter_seps_Expression_Statement;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("Label",[],contextFreeSyntax(),alabel="label"),\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="generators"),aadt("Statement",[],contextFreeSyntax(),alabel="body")],[],alabel="for")*/
    public final io.usethesource.vallang.type.Type ADT_NonterminalLabel;	/*aadt("NonterminalLabel",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_NonterminalLabel;	/*aadt("NonterminalLabel",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type $T39;	/*alit("::")*/
    public final io.usethesource.vallang.type.Type $T40;	/*\iter-seps(aadt("Name",[],lexicalSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit("::"),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="anonymousdefault")*/
    public final io.usethesource.vallang.type.Type Expression_splice_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="argument")],[],alabel="splice")*/
    public final io.usethesource.vallang.type.Type $T23;	/*\iter-star-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="postStats")*/
    public final io.usethesource.vallang.type.Type Pattern_reifiedType_Pattern_Pattern;	/*acons(aadt("Pattern",[],contextFreeSyntax()),[aadt("Pattern",[],contextFreeSyntax(),alabel="symbol"),aadt("Pattern",[],contextFreeSyntax(),alabel="definitions")],[],alabel="reifiedType")*/
    public final io.usethesource.vallang.type.Type Replacement_unconditional_Expression;	/*acons(aadt("Replacement",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="anonymousunconditional")],[],alabel="unconditional")*/
    public final io.usethesource.vallang.type.Type $T4;	/*\iter-seps(aadt("KeywordArgument",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=false)],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="anonymousdefault")*/
    public final io.usethesource.vallang.type.Type OptionalTerminator_absent_;	/*acons(aadt("OptionalTerminator",[],lexicalSyntax()),[],[],alabel="absent")*/
    public final io.usethesource.vallang.type.Type ADT_Start;	/*aadt("Start",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Start;	/*aadt("Start",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Start_present_;	/*acons(aadt("Start",[],contextFreeSyntax()),[],[],alabel="present")*/
    public final io.usethesource.vallang.type.Type BasicType_value_;	/*acons(aadt("BasicType",[],contextFreeSyntax()),[],[],alabel="value")*/
    public final io.usethesource.vallang.type.Type Statement_functionDeclaration_FunctionDeclaration;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("FunctionDeclaration",[],contextFreeSyntax(),alabel="anonymousfunctionDeclaration")],[],alabel="functionDeclaration")*/
    public final io.usethesource.vallang.type.Type BasicType_string_;	/*acons(aadt("BasicType",[],contextFreeSyntax()),[],[],alabel="string")*/
    public final io.usethesource.vallang.type.Type Expression_it_;	/*acons(aadt("Expression",[],contextFreeSyntax()),[],[],alabel="it")*/
    public final io.usethesource.vallang.type.Type ADT_LAYOUT;	/*aadt("LAYOUT",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_LAYOUT;	/*aadt("LAYOUT",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type $T24;	/*\iter-seps(aadt("Field",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="fields")*/
    public final io.usethesource.vallang.type.Type Statement_variableDeclaration_LocalVariableDeclaration;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("LocalVariableDeclaration",[],contextFreeSyntax(),alabel="declaration")],[],alabel="variableDeclaration")*/
    public final io.usethesource.vallang.type.Type StringCharacter_esc_;	/*acons(aadt("StringCharacter",[],lexicalSyntax()),[],[],alabel="esc")*/
    public final io.usethesource.vallang.type.Type BasicType_dateTime_;	/*acons(aadt("BasicType",[],contextFreeSyntax()),[],[],alabel="dateTime")*/
    public final io.usethesource.vallang.type.Type Prod_associativityGroup_Assoc_Prod;	/*acons(aadt("Prod",[],contextFreeSyntax()),[aadt("Assoc",[],contextFreeSyntax(),alabel="associativity"),aadt("Prod",[],contextFreeSyntax(),alabel="group")],[],alabel="associativityGroup")*/
    public final io.usethesource.vallang.type.Type Signature_noThrows_FunctionModifiers_Type_Name_Parameters;	/*acons(aadt("Signature",[],contextFreeSyntax()),[aadt("FunctionModifiers",[],contextFreeSyntax(),alabel="modifiers"),aadt("Type",[],contextFreeSyntax(),alabel="type"),aadt("Name",[],lexicalSyntax(),alabel="name"),aadt("Parameters",[],contextFreeSyntax(),alabel="parameters")],[],alabel="noThrows")*/
    public final io.usethesource.vallang.type.Type Expression_has_Expression_Name;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="expression"),aadt("Name",[],lexicalSyntax(),alabel="name")],[],alabel="has")*/
    public final io.usethesource.vallang.type.Type ADT_Mapping_Pattern;	/*aadt("Mapping",[aadt("Pattern",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Mapping_Pattern;	/*aadt("Mapping",[aadt("Pattern",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Pattern_qualifiedName_QualifiedName;	/*acons(aadt("Pattern",[],contextFreeSyntax()),[aadt("QualifiedName",[],contextFreeSyntax(),alabel="anonymousqualifiedName")],[],alabel="qualifiedName")*/
    public final io.usethesource.vallang.type.Type Sym_empty_;	/*acons(aadt("Sym",[],contextFreeSyntax()),[],[],alabel="empty")*/
    public final io.usethesource.vallang.type.Type $T31;	/*\iter-star-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="statements0")*/
    public final io.usethesource.vallang.type.Type Expression_lessThanOrEq_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="lessThanOrEq")*/
    public final io.usethesource.vallang.type.Type BasicType_num_;	/*acons(aadt("BasicType",[],contextFreeSyntax()),[],[],alabel="num")*/
    public final io.usethesource.vallang.type.Type ADT_TagString;	/*aadt("TagString",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TagString;	/*aadt("TagString",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type Sym_iterSep_Sym_Sym;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("Sym",[],contextFreeSyntax(),alabel="symbol"),aadt("Sym",[],contextFreeSyntax(),alabel="sep")],[],alabel="iterSep")*/
    public final io.usethesource.vallang.type.Type Sym_labeled_Sym_NonterminalLabel;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("Sym",[],contextFreeSyntax(),alabel="symbol"),aadt("NonterminalLabel",[],lexicalSyntax(),alabel="label")],[],alabel="labeled")*/
    public final io.usethesource.vallang.type.Type ADT_EvalCommand;	/*aadt("EvalCommand",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_EvalCommand;	/*aadt("EvalCommand",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type EvalCommand_declaration_Declaration;	/*acons(aadt("EvalCommand",[],contextFreeSyntax()),[aadt("Declaration",[],contextFreeSyntax(),alabel="anonymousdeclaration")],[],alabel="declaration")*/
    public final io.usethesource.vallang.type.Type ADT_Nonterminal;	/*aadt("Nonterminal",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Nonterminal;	/*aadt("Nonterminal",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type Case_patternWithAction_PatternWithAction;	/*acons(aadt("Case",[],contextFreeSyntax()),[aadt("PatternWithAction",[],contextFreeSyntax(),alabel="patternWithAction")],[],alabel="patternWithAction")*/
    public final io.usethesource.vallang.type.Type Class_difference_Class_Class;	/*acons(aadt("Class",[],contextFreeSyntax()),[aadt("Class",[],contextFreeSyntax(),alabel="lhs"),aadt("Class",[],contextFreeSyntax(),alabel="rhs")],[],alabel="difference")*/
    public final io.usethesource.vallang.type.Type BasicType_map_;	/*acons(aadt("BasicType",[],contextFreeSyntax()),[],[],alabel="map")*/
    public final io.usethesource.vallang.type.Type ADT_KeywordArguments_Pattern;	/*aadt("KeywordArguments",[aadt("Pattern",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_KeywordArguments_Pattern;	/*aadt("KeywordArguments",[aadt("Pattern",[],contextFreeSyntax())],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Prod_all_Prod_Prod;	/*acons(aadt("Prod",[],contextFreeSyntax()),[aadt("Prod",[],contextFreeSyntax(),alabel="lhs"),aadt("Prod",[],contextFreeSyntax(),alabel="rhs")],[],alabel="all")*/
    public final io.usethesource.vallang.type.Type StringTail_post_PostStringChars;	/*acons(aadt("StringTail",[],contextFreeSyntax()),[aadt("PostStringChars",[],lexicalSyntax(),alabel="anonymouspost")],[],alabel="post")*/
    public final io.usethesource.vallang.type.Type TypeArg_named_Type_Name;	/*acons(aadt("TypeArg",[],contextFreeSyntax()),[aadt("Type",[],contextFreeSyntax(),alabel="type"),aadt("Name",[],lexicalSyntax(),alabel="name")],[],alabel="named")*/
    public final io.usethesource.vallang.type.Type Sym_start_Nonterminal;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("Nonterminal",[],lexicalSyntax(),alabel="nonterminal")],[],alabel="start")*/
    public final io.usethesource.vallang.type.Type ADT_PreStringChars;	/*aadt("PreStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PreStringChars;	/*aadt("PreStringChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RegExp;	/*aadt("RegExp",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RegExp;	/*aadt("RegExp",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type Case_default_Statement;	/*acons(aadt("Case",[],contextFreeSyntax()),[aadt("Statement",[],contextFreeSyntax(),alabel="statement")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type ADT_Header;	/*aadt("Header",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Header;	/*aadt("Header",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Header_default_Tags_QualifiedName_iter_star_seps_Import;	/*acons(aadt("Header",[],contextFreeSyntax()),[aadt("Tags",[],contextFreeSyntax(),alabel="tags"),aadt("QualifiedName",[],contextFreeSyntax(),alabel="name"),\iter-star-seps(aadt("Import",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="imports")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type Expression_ifThenElse_Expression_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="condition"),aadt("Expression",[],contextFreeSyntax(),alabel="thenExp"),aadt("Expression",[],contextFreeSyntax(),alabel="elseExp")],[],alabel="ifThenElse")*/
    public final io.usethesource.vallang.type.Type ADT_TimeZonePart;	/*aadt("TimeZonePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TimeZonePart;	/*aadt("TimeZonePart",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type Pattern_anti_Pattern;	/*acons(aadt("Pattern",[],contextFreeSyntax()),[aadt("Pattern",[],contextFreeSyntax(),alabel="pattern")],[],alabel="anti")*/
    public final io.usethesource.vallang.type.Type $T13;	/*\iter-star-seps(aadt("Tag",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="anonymousdefault")*/
    public final io.usethesource.vallang.type.Type Statement_tryFinally_Statement_iter_seps_Catch_Statement;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("Statement",[],contextFreeSyntax(),alabel="body"),\iter-seps(aadt("Catch",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="handlers"),aadt("Statement",[],contextFreeSyntax(),alabel="finallyBody")],[],alabel="tryFinally")*/
    public final io.usethesource.vallang.type.Type ADT_Variant;	/*aadt("Variant",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Variant;	/*aadt("Variant",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T56;	/*\iter-seps(aadt("Variant",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit("|"),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="variants")*/
    public final io.usethesource.vallang.type.Type Declaration_data_Tags_Visibility_UserType_CommonKeywordParameters_iter_seps_Variant;	/*acons(aadt("Declaration",[],contextFreeSyntax()),[aadt("Tags",[],contextFreeSyntax(),alabel="tags"),aadt("Visibility",[],contextFreeSyntax(),alabel="visibility"),aadt("UserType",[],contextFreeSyntax(),alabel="user"),aadt("CommonKeywordParameters",[],contextFreeSyntax(),alabel="commonKeywordParameters"),\iter-seps(aadt("Variant",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit("|"),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="variants")],[],alabel="data")*/
    public final io.usethesource.vallang.type.Type Kind_data_;	/*acons(aadt("Kind",[],contextFreeSyntax()),[],[],alabel="data")*/
    public final io.usethesource.vallang.type.Type ADT_TypeVar;	/*aadt("TypeVar",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_TypeVar;	/*aadt("TypeVar",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T57;	/*\iter-seps(aadt("TypeVar",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="parameters")*/
    public final io.usethesource.vallang.type.Type ModuleParameters_default_iter_seps_TypeVar;	/*acons(aadt("ModuleParameters",[],contextFreeSyntax()),[\iter-seps(aadt("TypeVar",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="parameters")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type FunctionDeclaration_expression_Tags_Visibility_Signature_Expression;	/*acons(aadt("FunctionDeclaration",[],contextFreeSyntax()),[aadt("Tags",[],contextFreeSyntax(),alabel="tags"),aadt("Visibility",[],contextFreeSyntax(),alabel="visibility"),aadt("Signature",[],contextFreeSyntax(),alabel="signature"),aadt("Expression",[],contextFreeSyntax(),alabel="expression")],[],alabel="expression")*/
    public final io.usethesource.vallang.type.Type Declaration_dataAbstract_Tags_Visibility_UserType_CommonKeywordParameters;	/*acons(aadt("Declaration",[],contextFreeSyntax()),[aadt("Tags",[],contextFreeSyntax(),alabel="tags"),aadt("Visibility",[],contextFreeSyntax(),alabel="visibility"),aadt("UserType",[],contextFreeSyntax(),alabel="user"),aadt("CommonKeywordParameters",[],contextFreeSyntax(),alabel="commonKeywordParameters")],[],alabel="dataAbstract")*/
    public final io.usethesource.vallang.type.Type Renaming_default_Name_Name;	/*acons(aadt("Renaming",[],contextFreeSyntax()),[aadt("Name",[],lexicalSyntax(),alabel="from"),aadt("Name",[],lexicalSyntax(),alabel="to")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type BasicType_relation_;	/*acons(aadt("BasicType",[],contextFreeSyntax()),[],[],alabel="relation")*/
    public final io.usethesource.vallang.type.Type ADT_StringTemplate;	/*aadt("StringTemplate",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringTemplate;	/*aadt("StringTemplate",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type $T22;	/*\iter-star-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="preStats")*/
    public final io.usethesource.vallang.type.Type StringTemplate_doWhile_iter_star_seps_Statement_StringMiddle_iter_star_seps_Statement_Expression;	/*acons(aadt("StringTemplate",[],contextFreeSyntax()),[\iter-star-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="preStats"),aadt("StringMiddle",[],contextFreeSyntax(),alabel="body"),\iter-star-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="postStats"),aadt("Expression",[],contextFreeSyntax(),alabel="condition")],[],alabel="doWhile")*/
    public final io.usethesource.vallang.type.Type FunctionBody_default_iter_star_seps_Statement;	/*acons(aadt("FunctionBody",[],contextFreeSyntax()),[\iter-star-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="statements")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type Target_empty_;	/*acons(aadt("Target",[],contextFreeSyntax()),[],[],alabel="empty")*/
    public final io.usethesource.vallang.type.Type Expression_setAnnotation_Expression_Name_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="expression"),aadt("Name",[],lexicalSyntax(),alabel="name"),aadt("Expression",[],contextFreeSyntax(),alabel="value")],[],alabel="setAnnotation")*/
    public final io.usethesource.vallang.type.Type Assignment_default_;	/*acons(aadt("Assignment",[],contextFreeSyntax()),[],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type ADT_Bound;	/*aadt("Bound",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Bound;	/*aadt("Bound",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type DateTimeLiteral_timeLiteral_JustTime;	/*acons(aadt("DateTimeLiteral",[],contextFreeSyntax()),[aadt("JustTime",[],lexicalSyntax(),alabel="anonymoustimeLiteral")],[],alabel="timeLiteral")*/
    public final io.usethesource.vallang.type.Type Expression_getAnnotation_Expression_Name;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="anonymousgetAnnotation"),aadt("Name",[],lexicalSyntax(),alabel="name")],[],alabel="getAnnotation")*/
    public final io.usethesource.vallang.type.Type TypeArg_default_Type;	/*acons(aadt("TypeArg",[],contextFreeSyntax()),[aadt("Type",[],contextFreeSyntax(),alabel="anonymousdefault")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type Bound_default_Expression;	/*acons(aadt("Bound",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="expression")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type ConcretePart_bs_;	/*acons(aadt("ConcretePart",[],lexicalSyntax()),[],[],alabel="bs")*/
    public final io.usethesource.vallang.type.Type BasicType_node_;	/*acons(aadt("BasicType",[],contextFreeSyntax()),[],[],alabel="node")*/
    public final io.usethesource.vallang.type.Type Expression_lessThan_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="lessThan")*/
    public final io.usethesource.vallang.type.Type Expression_in_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="in")*/
    public final io.usethesource.vallang.type.Type Variable_unInitialized_Name;	/*acons(aadt("Variable",[],contextFreeSyntax()),[aadt("Name",[],lexicalSyntax(),alabel="anonymousunInitialized")],[],alabel="unInitialized")*/
    public final io.usethesource.vallang.type.Type ModuleActuals_default_iter_seps_Type;	/*acons(aadt("ModuleActuals",[],contextFreeSyntax()),[\iter-seps(aadt("Type",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="types")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type $T19;	/*\iter-seps(aadt("KeywordFormal",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="anonymousdefault")*/
    public final io.usethesource.vallang.type.Type KeywordFormals_default_OptionalComma_iter_seps_KeywordFormal;	/*acons(aadt("KeywordFormals",[],contextFreeSyntax()),[aadt("OptionalComma",[],lexicalSyntax(),alabel="optionalComma"),\iter-seps(aadt("KeywordFormal",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="anonymousdefault")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type Expression_any_iter_seps_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="generators")],[],alabel="any")*/
    public final io.usethesource.vallang.type.Type $T26;	/*\iter-seps(aadt("KeywordFormal",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="keywordFormalList")*/
    public final io.usethesource.vallang.type.Type BasicType_set_;	/*acons(aadt("BasicType",[],contextFreeSyntax()),[],[],alabel="set")*/
    public final io.usethesource.vallang.type.Type $T15;	/*\iter-star-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="postStatsThen")*/
    public final io.usethesource.vallang.type.Type StringTemplate_ifThenElse_iter_seps_Expression_iter_star_seps_Statement_StringMiddle_iter_star_seps_Statement_iter_star_seps_Statement_StringMiddle_iter_star_seps_Statement;	/*acons(aadt("StringTemplate",[],contextFreeSyntax()),[\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="conditions"),\iter-star-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="preStatsThen"),aadt("StringMiddle",[],contextFreeSyntax(),alabel="thenString"),\iter-star-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="postStatsThen"),\iter-star-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="preStatsElse"),aadt("StringMiddle",[],contextFreeSyntax(),alabel="elseString"),\iter-star-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="postStatsElse")],[],alabel="ifThenElse")*/
    public final io.usethesource.vallang.type.Type Assignable_fieldAccess_Assignable_Name;	/*acons(aadt("Assignable",[],contextFreeSyntax()),[aadt("Assignable",[],contextFreeSyntax(),alabel="receiver"),aadt("Name",[],lexicalSyntax(),alabel="field")],[],alabel="fieldAccess")*/
    public final io.usethesource.vallang.type.Type ADT_Backslash;	/*aadt("Backslash",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Backslash;	/*aadt("Backslash",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ConcretePart_hole_ConcreteHole;	/*acons(aadt("ConcretePart",[],lexicalSyntax()),[aadt("ConcreteHole",[],contextFreeSyntax(),alabel="anonymoushole")],[],alabel="hole")*/
    public final io.usethesource.vallang.type.Type Assoc_right_;	/*acons(aadt("Assoc",[],contextFreeSyntax()),[],[],alabel="right")*/
    public final io.usethesource.vallang.type.Type Assignment_subtraction_;	/*acons(aadt("Assignment",[],contextFreeSyntax()),[],[],alabel="subtraction")*/
    public final io.usethesource.vallang.type.Type Pattern_asType_Type_Pattern;	/*acons(aadt("Pattern",[],contextFreeSyntax()),[aadt("Type",[],contextFreeSyntax(),alabel="type"),aadt("Pattern",[],contextFreeSyntax(),alabel="argument")],[],alabel="asType")*/
    public final io.usethesource.vallang.type.Type ADT_CaseInsensitiveStringConstant;	/*aadt("CaseInsensitiveStringConstant",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_CaseInsensitiveStringConstant;	/*aadt("CaseInsensitiveStringConstant",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type Expression_bracket_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="expression")],[],alabel="bracket")*/
    public final io.usethesource.vallang.type.Type ShellCommand_help_OptionalTerminator;	/*acons(aadt("ShellCommand",[],contextFreeSyntax()),[aadt("OptionalTerminator",[],lexicalSyntax(),alabel="terminator")],[],alabel="help")*/
    public final io.usethesource.vallang.type.Type PathTail_post_PostPathChars;	/*acons(aadt("PathTail",[],contextFreeSyntax()),[aadt("PostPathChars",[],lexicalSyntax(),alabel="anonymouspost")],[],alabel="post")*/
    public final io.usethesource.vallang.type.Type StringLiteral_nonInterpolated_StringConstant;	/*acons(aadt("StringLiteral",[],contextFreeSyntax()),[aadt("StringConstant",[],lexicalSyntax(),alabel="anonymousnonInterpolated")],[],alabel="nonInterpolated")*/
    public final io.usethesource.vallang.type.Type ProdModifier_bracket_;	/*acons(aadt("ProdModifier",[],contextFreeSyntax()),[],[],alabel="bracket")*/
    public final io.usethesource.vallang.type.Type Catch_default_Statement;	/*acons(aadt("Catch",[],contextFreeSyntax()),[aadt("Statement",[],contextFreeSyntax(),alabel="body")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type UserType_name_QualifiedName;	/*acons(aadt("UserType",[],contextFreeSyntax()),[aadt("QualifiedName",[],contextFreeSyntax(),alabel="anonymousname")],[],alabel="name")*/
    public final io.usethesource.vallang.type.Type Import_extend_ImportedModule;	/*acons(aadt("Import",[],contextFreeSyntax()),[aadt("ImportedModule",[],contextFreeSyntax(),alabel="module")],[],alabel="extend")*/
    public final io.usethesource.vallang.type.Type Tags_default_iter_star_seps_Tag;	/*acons(aadt("Tags",[],contextFreeSyntax()),[\iter-star-seps(aadt("Tag",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="anonymousdefault")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type Bound_empty_;	/*acons(aadt("Bound",[],contextFreeSyntax()),[],[],alabel="empty")*/
    public final io.usethesource.vallang.type.Type Start_absent_;	/*acons(aadt("Start",[],contextFreeSyntax()),[],[],alabel="absent")*/
    public final io.usethesource.vallang.type.Type Statement_insert_DataTarget_Statement;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("DataTarget",[],contextFreeSyntax(),alabel="dataTarget"),aadt("Statement",[],contextFreeSyntax(),alabel="statement")],[],alabel="insert")*/
    public final io.usethesource.vallang.type.Type $T21;	/*\iter-star-seps(aadt("Mapping",[aadt("Pattern",[],contextFreeSyntax())],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="mappings")*/
    public final io.usethesource.vallang.type.Type Pattern_map_iter_star_seps_Mapping_Pattern;	/*acons(aadt("Pattern",[],contextFreeSyntax()),[\iter-star-seps(aadt("Mapping",[aadt("Pattern",[],contextFreeSyntax())],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="mappings")],[],alabel="map")*/
    public final io.usethesource.vallang.type.Type IntegerLiteral_decimalIntegerLiteral_DecimalIntegerLiteral;	/*acons(aadt("IntegerLiteral",[],contextFreeSyntax()),[aadt("DecimalIntegerLiteral",[],lexicalSyntax(),alabel="anonymousdecimalIntegerLiteral")],[],alabel="decimalIntegerLiteral")*/
    public final io.usethesource.vallang.type.Type Expression_transitiveClosure_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="argument")],[],alabel="transitiveClosure")*/
    public final io.usethesource.vallang.type.Type ADT_OptionalComma;	/*aadt("OptionalComma",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_OptionalComma;	/*aadt("OptionalComma",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type Kind_variable_;	/*acons(aadt("Kind",[],contextFreeSyntax()),[],[],alabel="variable")*/
    public final io.usethesource.vallang.type.Type FunctionDeclaration_default_Tags_Visibility_Signature_FunctionBody;	/*acons(aadt("FunctionDeclaration",[],contextFreeSyntax()),[aadt("Tags",[],contextFreeSyntax(),alabel="tags"),aadt("Visibility",[],contextFreeSyntax(),alabel="visibility"),aadt("Signature",[],contextFreeSyntax(),alabel="signature"),aadt("FunctionBody",[],contextFreeSyntax(),alabel="body")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type ADT_StringConstant;	/*aadt("StringConstant",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_StringConstant;	/*aadt("StringConstant",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type Expression_fieldUpdate_Expression_Name_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="expression"),aadt("Name",[],lexicalSyntax(),alabel="key"),aadt("Expression",[],contextFreeSyntax(),alabel="replacement")],[],alabel="fieldUpdate")*/
    public final io.usethesource.vallang.type.Type Type_symbol_Sym;	/*acons(aadt("Type",[],contextFreeSyntax()),[aadt("Sym",[],contextFreeSyntax(),alabel="anonymoussymbol")],[],alabel="symbol")*/
    public final io.usethesource.vallang.type.Type Expression_match_Pattern_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Pattern",[],contextFreeSyntax(),alabel="pattern"),aadt("Expression",[],contextFreeSyntax(),alabel="expression")],[],alabel="match")*/
    public final io.usethesource.vallang.type.Type Pattern_callOrTree_Pattern_iter_star_seps_Pattern_KeywordArguments_Pattern;	/*acons(aadt("Pattern",[],contextFreeSyntax()),[aadt("Pattern",[],contextFreeSyntax(),alabel="expression"),\iter-star-seps(aadt("Pattern",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="arguments"),aadt("KeywordArguments",[aadt("Pattern",[],contextFreeSyntax())],contextFreeSyntax(),alabel="keywordArguments")],[],alabel="callOrTree")*/
    public final io.usethesource.vallang.type.Type ADT_ConcreteHole;	/*aadt("ConcreteHole",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ConcreteHole;	/*aadt("ConcreteHole",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PrePathChars;	/*aadt("PrePathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PrePathChars;	/*aadt("PrePathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type Statement_assert_Expression;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="expression")],[],alabel="assert")*/
    public final io.usethesource.vallang.type.Type PatternWithAction_arbitrary_Pattern_Statement;	/*acons(aadt("PatternWithAction",[],contextFreeSyntax()),[aadt("Pattern",[],contextFreeSyntax(),alabel="pattern"),aadt("Statement",[],contextFreeSyntax(),alabel="statement")],[],alabel="arbitrary")*/
    public final io.usethesource.vallang.type.Type StringTemplate_while_Expression_iter_star_seps_Statement_StringMiddle_iter_star_seps_Statement;	/*acons(aadt("StringTemplate",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="condition"),\iter-star-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="preStats"),aadt("StringMiddle",[],contextFreeSyntax(),alabel="body"),\iter-star-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="postStats")],[],alabel="while")*/
    public final io.usethesource.vallang.type.Type Prod_reference_Name;	/*acons(aadt("Prod",[],contextFreeSyntax()),[aadt("Name",[],lexicalSyntax(),alabel="referenced")],[],alabel="reference")*/
    public final io.usethesource.vallang.type.Type ProdModifier_tag_Tag;	/*acons(aadt("ProdModifier",[],contextFreeSyntax()),[aadt("Tag",[],contextFreeSyntax(),alabel="anonymoustag")],[],alabel="tag")*/
    public final io.usethesource.vallang.type.Type Output_stderrOutput_;	/*acons(aadt("Output",[],lexicalSyntax()),[],[],alabel="stderrOutput")*/
    public final io.usethesource.vallang.type.Type Statement_assignment_Assignable_Assignment_Statement;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("Assignable",[],contextFreeSyntax(),alabel="assignable"),aadt("Assignment",[],contextFreeSyntax(),alabel="operator"),aadt("Statement",[],contextFreeSyntax(),alabel="statement")],[],alabel="assignment")*/
    public final io.usethesource.vallang.type.Type Statement_while_Label_iter_seps_Expression_Statement;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("Label",[],contextFreeSyntax(),alabel="label"),\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="conditions"),aadt("Statement",[],contextFreeSyntax(),alabel="body")],[],alabel="while")*/
    public final io.usethesource.vallang.type.Type Expression_remainder_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="remainder")*/
    public final io.usethesource.vallang.type.Type ADT_Visit;	/*aadt("Visit",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Visit;	/*aadt("Visit",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Visit_givenStrategy_Strategy_Expression_iter_seps_Case;	/*acons(aadt("Visit",[],contextFreeSyntax()),[aadt("Strategy",[],contextFreeSyntax(),alabel="strategy"),aadt("Expression",[],contextFreeSyntax(),alabel="subject"),\iter-seps(aadt("Case",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="cases")],[],alabel="givenStrategy")*/
    public final io.usethesource.vallang.type.Type ConcretePart_bq_;	/*acons(aadt("ConcretePart",[],lexicalSyntax()),[],[],alabel="bq")*/
    public final io.usethesource.vallang.type.Type Command_declaration_Declaration;	/*acons(aadt("Command",[],contextFreeSyntax()),[aadt("Declaration",[],contextFreeSyntax(),alabel="anonymousdeclaration")],[],alabel="declaration")*/
    public final io.usethesource.vallang.type.Type Expression_fieldProject_Expression_iter_seps_Field;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="anonymousfieldProject"),\iter-seps(aadt("Field",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="fields")],[],alabel="fieldProject")*/
    public final io.usethesource.vallang.type.Type Range_character_Char;	/*acons(aadt("Range",[],contextFreeSyntax()),[aadt("Char",[],lexicalSyntax(),alabel="anonymouscharacter")],[],alabel="character")*/
    public final io.usethesource.vallang.type.Type Statement_switch_Label_Expression_iter_seps_Case;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("Label",[],contextFreeSyntax(),alabel="label"),aadt("Expression",[],contextFreeSyntax(),alabel="expression"),\iter-seps(aadt("Case",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="cases")],[],alabel="switch")*/
    public final io.usethesource.vallang.type.Type Strategy_topDownBreak_;	/*acons(aadt("Strategy",[],contextFreeSyntax()),[],[],alabel="topDownBreak")*/
    public final io.usethesource.vallang.type.Type LocalVariableDeclaration_default_Declarator;	/*acons(aadt("LocalVariableDeclaration",[],contextFreeSyntax()),[aadt("Declarator",[],contextFreeSyntax(),alabel="anonymousdefault")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type ADT_Module;	/*aadt("Module",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Module;	/*aadt("Module",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Module_default_Header_Body;	/*acons(aadt("Module",[],contextFreeSyntax()),[aadt("Header",[],contextFreeSyntax(),alabel="header"),aadt("Body",[],contextFreeSyntax(),alabel="body")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type LocalVariableDeclaration_dynamic_Declarator;	/*acons(aadt("LocalVariableDeclaration",[],contextFreeSyntax()),[aadt("Declarator",[],contextFreeSyntax(),alabel="declarator")],[],alabel="dynamic")*/
    public final io.usethesource.vallang.type.Type ADT_Formals;	/*aadt("Formals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Formals;	/*aadt("Formals",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type Sym_endOfLine_Sym;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("Sym",[],contextFreeSyntax(),alabel="symbol")],[],alabel="endOfLine")*/
    public final io.usethesource.vallang.type.Type LocationLiteral_default_ProtocolPart_PathPart;	/*acons(aadt("LocationLiteral",[],contextFreeSyntax()),[aadt("ProtocolPart",[],contextFreeSyntax(),alabel="protocolPart"),aadt("PathPart",[],contextFreeSyntax(),alabel="pathPart")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type BasicType_rational_;	/*acons(aadt("BasicType",[],contextFreeSyntax()),[],[],alabel="rational")*/
    public final io.usethesource.vallang.type.Type $T33;	/*\iter-seps(aadt("EvalCommand",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="anonymouscommandlist")*/
    public final io.usethesource.vallang.type.Type Class_union_Class_Class;	/*acons(aadt("Class",[],contextFreeSyntax()),[aadt("Class",[],contextFreeSyntax(),alabel="lhs"),aadt("Class",[],contextFreeSyntax(),alabel="rhs")],[],alabel="union")*/
    public final io.usethesource.vallang.type.Type ConcretePart_lt_;	/*acons(aadt("ConcretePart",[],lexicalSyntax()),[],[],alabel="lt")*/
    public final io.usethesource.vallang.type.Type Statement_globalDirective_Type_iter_seps_QualifiedName;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("Type",[],contextFreeSyntax(),alabel="type"),\iter-seps(aadt("QualifiedName",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="names")],[],alabel="globalDirective")*/
    public final io.usethesource.vallang.type.Type ADT_MidPathChars;	/*aadt("MidPathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_MidPathChars;	/*aadt("MidPathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ShellCommand_undeclare_opt_QualifiedName_OptionalTerminator;	/*acons(aadt("ShellCommand",[],contextFreeSyntax()),[opt(aadt("QualifiedName",[],contextFreeSyntax()),alabel="optName"),aadt("OptionalTerminator",[],lexicalSyntax(),alabel="terminator")],[],alabel="undeclare")*/
    public final io.usethesource.vallang.type.Type Type_function_FunctionType;	/*acons(aadt("Type",[],contextFreeSyntax()),[aadt("FunctionType",[],contextFreeSyntax(),alabel="anonymousfunction")],[],alabel="function")*/
    public final io.usethesource.vallang.type.Type $T10;	/*\iter-star-seps(aadt("Mapping",[aadt("Expression",[],contextFreeSyntax())],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="mappings")*/
    public final io.usethesource.vallang.type.Type KeywordArguments_1_default_OptionalComma_iter_seps_KeywordArgument_1;	/*acons(aadt("KeywordArguments",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax()),[aadt("OptionalComma",[],lexicalSyntax(),alabel="optionalComma"),\iter-seps(aadt("KeywordArgument",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=false)],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="anonymousdefault")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type ShellCommand_setOptionTrue_QualifiedName_OptionalTerminator;	/*acons(aadt("ShellCommand",[],contextFreeSyntax()),[aadt("QualifiedName",[],contextFreeSyntax(),alabel="name"),aadt("OptionalTerminator",[],lexicalSyntax(),alabel="terminator")],[],alabel="setOptionTrue")*/
    public final io.usethesource.vallang.type.Type Tag_default_Name_TagString;	/*acons(aadt("Tag",[],contextFreeSyntax()),[aadt("Name",[],lexicalSyntax(),alabel="name"),aadt("TagString",[],lexicalSyntax(),alabel="contents")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type Literal_boolean_BooleanLiteral;	/*acons(aadt("Literal",[],contextFreeSyntax()),[aadt("BooleanLiteral",[],lexicalSyntax(),alabel="anonymousboolean")],[],alabel="boolean")*/
    public final io.usethesource.vallang.type.Type Expression_nonEmptyBlock_iter_seps_Statement;	/*acons(aadt("Expression",[],contextFreeSyntax()),[\iter-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="statements")],[],alabel="nonEmptyBlock")*/
    public final io.usethesource.vallang.type.Type Expression_implication_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="implication")*/
    public final io.usethesource.vallang.type.Type FunctionModifier_test_;	/*acons(aadt("FunctionModifier",[],contextFreeSyntax()),[],[],alabel="test")*/
    public final io.usethesource.vallang.type.Type ShellCommand_clear_OptionalTerminator;	/*acons(aadt("ShellCommand",[],contextFreeSyntax()),[aadt("OptionalTerminator",[],lexicalSyntax(),alabel="terminator")],[],alabel="clear")*/
    public final io.usethesource.vallang.type.Type Statement_nonEmptyBlock_Label_iter_seps_Statement;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("Label",[],contextFreeSyntax(),alabel="label"),\iter-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="statements")],[],alabel="nonEmptyBlock")*/
    public final io.usethesource.vallang.type.Type Strategy_outermost_;	/*acons(aadt("Strategy",[],contextFreeSyntax()),[],[],alabel="outermost")*/
    public final io.usethesource.vallang.type.Type Expression_slice_Expression_OptionalExpression_OptionalExpression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="anonymousslice"),aadt("OptionalExpression",[],contextFreeSyntax(),alabel="optFirst"),aadt("OptionalExpression",[],contextFreeSyntax(),alabel="optLast")],[],alabel="slice")*/
    public final io.usethesource.vallang.type.Type Statement_assertWithMessage_Expression_Expression;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="expression"),aadt("Expression",[],contextFreeSyntax(),alabel="message")],[],alabel="assertWithMessage")*/
    public final io.usethesource.vallang.type.Type Command_expression_Expression;	/*acons(aadt("Command",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="anonymousexpression")],[],alabel="expression")*/
    public final io.usethesource.vallang.type.Type Expression_greaterThan_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="greaterThan")*/
    public final io.usethesource.vallang.type.Type Comprehension_list_iter_seps_Expression_iter_seps_Expression;	/*acons(aadt("Comprehension",[],contextFreeSyntax()),[\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="results"),\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="generators")],[],alabel="list")*/
    public final io.usethesource.vallang.type.Type EvalCommand_output_Output;	/*acons(aadt("EvalCommand",[],contextFreeSyntax()),[aadt("Output",[],lexicalSyntax(),alabel="anonymousoutput")],[],alabel="output")*/
    public final io.usethesource.vallang.type.Type SyntaxDefinition_lexical_Sym_Prod;	/*acons(aadt("SyntaxDefinition",[],contextFreeSyntax()),[aadt("Sym",[],contextFreeSyntax(),alabel="defined"),aadt("Prod",[],contextFreeSyntax(),alabel="production")],[],alabel="lexical")*/
    public final io.usethesource.vallang.type.Type Literal_dateTime_DateTimeLiteral;	/*acons(aadt("Literal",[],contextFreeSyntax()),[aadt("DateTimeLiteral",[],contextFreeSyntax(),alabel="anonymousdateTime")],[],alabel="dateTime")*/
    public final io.usethesource.vallang.type.Type Sym_alternative_Sym_iter_seps_Sym;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("Sym",[],contextFreeSyntax(),alabel="first"),\iter-seps(aadt("Sym",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit("|"),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="alternatives")],[],alabel="alternative")*/
    public final io.usethesource.vallang.type.Type Toplevel_givenVisibility_Declaration;	/*acons(aadt("Toplevel",[],contextFreeSyntax()),[aadt("Declaration",[],contextFreeSyntax(),alabel="anonymousgivenVisibility")],[],alabel="givenVisibility")*/
    public final io.usethesource.vallang.type.Type Assignment_intersection_;	/*acons(aadt("Assignment",[],contextFreeSyntax()),[],[],alabel="intersection")*/
    public final io.usethesource.vallang.type.Type Expression_addition_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="addition")*/
    public final io.usethesource.vallang.type.Type Visibility_public_;	/*acons(aadt("Visibility",[],contextFreeSyntax()),[],[],alabel="public")*/
    public final io.usethesource.vallang.type.Type Expression_all_iter_seps_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="generators")],[],alabel="all")*/
    public final io.usethesource.vallang.type.Type ConcreteHole_one_Sym_Name;	/*acons(aadt("ConcreteHole",[],contextFreeSyntax()),[aadt("Sym",[],contextFreeSyntax(),alabel="symbol"),aadt("Name",[],lexicalSyntax(),alabel="name")],[],alabel="one")*/
    public final io.usethesource.vallang.type.Type Tag_empty_Name;	/*acons(aadt("Tag",[],contextFreeSyntax()),[aadt("Name",[],lexicalSyntax(),alabel="name")],[],alabel="empty")*/
    public final io.usethesource.vallang.type.Type ADT_Char;	/*aadt("Char",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Char;	/*aadt("Char",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type Parameters_default_Formals_KeywordFormals;	/*acons(aadt("Parameters",[],contextFreeSyntax()),[aadt("Formals",[],contextFreeSyntax(),alabel="formals"),aadt("KeywordFormals",[],contextFreeSyntax(),alabel="keywordFormals")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type Sym_follow_Sym_Sym;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("Sym",[],contextFreeSyntax(),alabel="symbol"),aadt("Sym",[],contextFreeSyntax(),alabel="match")],[],alabel="follow")*/
    public final io.usethesource.vallang.type.Type Expression_product_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="product")*/
    public final io.usethesource.vallang.type.Type ADT_CommonKeywordParameters;	/*aadt("CommonKeywordParameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_CommonKeywordParameters;	/*aadt("CommonKeywordParameters",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type CommonKeywordParameters_absent_;	/*acons(aadt("CommonKeywordParameters",[],contextFreeSyntax()),[],[],alabel="absent")*/
    public final io.usethesource.vallang.type.Type EvalCommand_statement_Statement;	/*acons(aadt("EvalCommand",[],contextFreeSyntax()),[aadt("Statement",[],contextFreeSyntax(),alabel="anonymousstatement")],[],alabel="statement")*/
    public final io.usethesource.vallang.type.Type Range_fromTo_Char_Char;	/*acons(aadt("Range",[],contextFreeSyntax()),[aadt("Char",[],lexicalSyntax(),alabel="start"),aadt("Char",[],lexicalSyntax(),alabel="end")],[],alabel="fromTo")*/
    public final io.usethesource.vallang.type.Type ADT_RealLiteral;	/*aadt("RealLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_RealLiteral;	/*aadt("RealLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type Label_default_Name;	/*acons(aadt("Label",[],contextFreeSyntax()),[aadt("Name",[],lexicalSyntax(),alabel="name")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type Statement_ifThen_Label_iter_seps_Expression_Statement;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("Label",[],contextFreeSyntax(),alabel="label"),\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="conditions"),aadt("Statement",[],contextFreeSyntax(),alabel="thenStatement")],[],alabel="ifThen")*/
    public final io.usethesource.vallang.type.Type Sym_unequal_Sym_Sym;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("Sym",[],contextFreeSyntax(),alabel="symbol"),aadt("Sym",[],contextFreeSyntax(),alabel="match")],[],alabel="unequal")*/
    public final io.usethesource.vallang.type.Type Mapping_1_default_;	/*acons(aadt("Mapping",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax()),[],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type Statement_break_Target;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("Target",[],contextFreeSyntax(),alabel="target")],[],alabel="break")*/
    public final io.usethesource.vallang.type.Type ImportedModule_actuals_QualifiedName_ModuleActuals;	/*acons(aadt("ImportedModule",[],contextFreeSyntax()),[aadt("QualifiedName",[],contextFreeSyntax(),alabel="name"),aadt("ModuleActuals",[],contextFreeSyntax(),alabel="actuals")],[],alabel="actuals")*/
    public final io.usethesource.vallang.type.Type Expression_fieldAccess_Expression_Name;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="expression"),aadt("Name",[],lexicalSyntax(),alabel="field")],[],alabel="fieldAccess")*/
    public final io.usethesource.vallang.type.Type Assignable_slice_Assignable_OptionalExpression_OptionalExpression;	/*acons(aadt("Assignable",[],contextFreeSyntax()),[aadt("Assignable",[],contextFreeSyntax(),alabel="receiver"),aadt("OptionalExpression",[],contextFreeSyntax(),alabel="optFirst"),aadt("OptionalExpression",[],contextFreeSyntax(),alabel="optLast")],[],alabel="slice")*/
    public final io.usethesource.vallang.type.Type ADT_DateAndTime;	/*aadt("DateAndTime",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_DateAndTime;	/*aadt("DateAndTime",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type Sym_notPrecede_Sym_Sym;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("Sym",[],contextFreeSyntax(),alabel="match"),aadt("Sym",[],contextFreeSyntax(),alabel="symbol")],[],alabel="notPrecede")*/
    public final io.usethesource.vallang.type.Type Catch_binding_Pattern_Statement;	/*acons(aadt("Catch",[],contextFreeSyntax()),[aadt("Pattern",[],contextFreeSyntax(),alabel="pattern"),aadt("Statement",[],contextFreeSyntax(),alabel="body")],[],alabel="binding")*/
    public final io.usethesource.vallang.type.Type Expression_map_iter_star_seps_Mapping_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[\iter-star-seps(aadt("Mapping",[aadt("Expression",[],contextFreeSyntax())],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="mappings")],[],alabel="map")*/
    public final io.usethesource.vallang.type.Type ProdModifier_associativity_Assoc;	/*acons(aadt("ProdModifier",[],contextFreeSyntax()),[aadt("Assoc",[],contextFreeSyntax(),alabel="anonymousassociativity")],[],alabel="associativity")*/
    public final io.usethesource.vallang.type.Type Assoc_associative_;	/*acons(aadt("Assoc",[],contextFreeSyntax()),[],[],alabel="associative")*/
    public final io.usethesource.vallang.type.Type PathPart_nonInterpolated_PathChars;	/*acons(aadt("PathPart",[],contextFreeSyntax()),[aadt("PathChars",[],lexicalSyntax(),alabel="anonymousnonInterpolated")],[],alabel="nonInterpolated")*/
    public final io.usethesource.vallang.type.Type ConcretePart_text_str;	/*acons(aadt("ConcretePart",[],lexicalSyntax()),[astr(alabel="anonymoustext")],[],alabel="text")*/
    public final io.usethesource.vallang.type.Type Expression_range_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="first"),aadt("Expression",[],contextFreeSyntax(),alabel="last")],[],alabel="range")*/
    public final io.usethesource.vallang.type.Type Sym_startOfLine_Sym;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("Sym",[],contextFreeSyntax(),alabel="symbol")],[],alabel="startOfLine")*/
    public final io.usethesource.vallang.type.Type Sym_notFollow_Sym_Sym;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("Sym",[],contextFreeSyntax(),alabel="symbol"),aadt("Sym",[],contextFreeSyntax(),alabel="match")],[],alabel="notFollow")*/
    public final io.usethesource.vallang.type.Type ADT_ProtocolTail;	/*aadt("ProtocolTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_ProtocolTail;	/*aadt("ProtocolTail",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type DataTarget_empty_;	/*acons(aadt("DataTarget",[],contextFreeSyntax()),[],[],alabel="empty")*/
    public final io.usethesource.vallang.type.Type Assignable_subscript_Assignable_Expression;	/*acons(aadt("Assignable",[],contextFreeSyntax()),[aadt("Assignable",[],contextFreeSyntax(),alabel="receiver"),aadt("Expression",[],contextFreeSyntax(),alabel="subscript")],[],alabel="subscript")*/
    public final io.usethesource.vallang.type.Type Assignment_append_;	/*acons(aadt("Assignment",[],contextFreeSyntax()),[],[],alabel="append")*/
    public final io.usethesource.vallang.type.Type Expression_division_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="division")*/
    public final io.usethesource.vallang.type.Type KeywordFormals_none_;	/*acons(aadt("KeywordFormals",[],contextFreeSyntax()),[],[],alabel="none")*/
    public final io.usethesource.vallang.type.Type OptionalEqualSign_present_;	/*acons(aadt("OptionalEqualSign",[],lexicalSyntax()),[],[],alabel="present")*/
    public final io.usethesource.vallang.type.Type Pattern_concrete_Concrete;	/*acons(aadt("Pattern",[],contextFreeSyntax()),[aadt("Concrete",[],lexicalSyntax(),alabel="anonymousconcrete")],[],alabel="concrete")*/
    public final io.usethesource.vallang.type.Type ADT_OctalIntegerLiteral;	/*aadt("OctalIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_OctalIntegerLiteral;	/*aadt("OctalIntegerLiteral",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type Formals_default_iter_star_seps_Pattern;	/*acons(aadt("Formals",[],contextFreeSyntax()),[\iter-star-seps(aadt("Pattern",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="anonymousdefault")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type $T34;	/*\iter-seps(aadt("Sym",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="sequence")*/
    public final io.usethesource.vallang.type.Type Sym_sequence_Sym_iter_seps_Sym;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("Sym",[],contextFreeSyntax(),alabel="first"),\iter-seps(aadt("Sym",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="sequence")],[],alabel="sequence")*/
    public final io.usethesource.vallang.type.Type DateTimeLiteral_dateLiteral_JustDate;	/*acons(aadt("DateTimeLiteral",[],contextFreeSyntax()),[aadt("JustDate",[],lexicalSyntax(),alabel="anonymousdateLiteral")],[],alabel="dateLiteral")*/
    public final io.usethesource.vallang.type.Type $T27;	/*\iter-star-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="arguments")*/
    public final io.usethesource.vallang.type.Type Expression_enumerator_Pattern_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Pattern",[],contextFreeSyntax(),alabel="pattern"),aadt("Expression",[],contextFreeSyntax(),alabel="expression")],[],alabel="enumerator")*/
    public final io.usethesource.vallang.type.Type FunctionDeclaration_abstract_Tags_Visibility_Signature;	/*acons(aadt("FunctionDeclaration",[],contextFreeSyntax()),[aadt("Tags",[],contextFreeSyntax(),alabel="tags"),aadt("Visibility",[],contextFreeSyntax(),alabel="visibility"),aadt("Signature",[],contextFreeSyntax(),alabel="signature")],[],alabel="abstract")*/
    public final io.usethesource.vallang.type.Type Kind_anno_;	/*acons(aadt("Kind",[],contextFreeSyntax()),[],[],alabel="anno")*/
    public final io.usethesource.vallang.type.Type Expression_noMatch_Pattern_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Pattern",[],contextFreeSyntax(),alabel="pattern"),aadt("Expression",[],contextFreeSyntax(),alabel="expression")],[],alabel="noMatch")*/
    public final io.usethesource.vallang.type.Type Literal_location_LocationLiteral;	/*acons(aadt("Literal",[],contextFreeSyntax()),[aadt("LocationLiteral",[],contextFreeSyntax(),alabel="anonymouslocation")],[],alabel="location")*/
    public final io.usethesource.vallang.type.Type OptionalExpression_expression_Expression;	/*acons(aadt("OptionalExpression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="anonymousexpression")],[],alabel="expression")*/
    public final io.usethesource.vallang.type.Type BasicType_bool_;	/*acons(aadt("BasicType",[],contextFreeSyntax()),[],[],alabel="bool")*/
    public final io.usethesource.vallang.type.Type Assignment_product_;	/*acons(aadt("Assignment",[],contextFreeSyntax()),[],[],alabel="product")*/
    public final io.usethesource.vallang.type.Type Expression_appendAfter_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="appendAfter")*/
    public final io.usethesource.vallang.type.Type Sym_except_Sym_NonterminalLabel;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("Sym",[],contextFreeSyntax(),alabel="symbol"),aadt("NonterminalLabel",[],lexicalSyntax(),alabel="label")],[],alabel="except")*/
    public final io.usethesource.vallang.type.Type ShellCommand_history_OptionalTerminator;	/*acons(aadt("ShellCommand",[],contextFreeSyntax()),[aadt("OptionalTerminator",[],lexicalSyntax(),alabel="terminator")],[],alabel="history")*/
    public final io.usethesource.vallang.type.Type ADT_Commands;	/*aadt("Commands",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Commands;	/*aadt("Commands",[],contextFreeSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Comment;	/*aadt("Comment",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_Comment;	/*aadt("Comment",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ProtocolTail_mid_MidProtocolChars_Expression_ProtocolTail;	/*acons(aadt("ProtocolTail",[],contextFreeSyntax()),[aadt("MidProtocolChars",[],lexicalSyntax(),alabel="mid"),aadt("Expression",[],contextFreeSyntax(),alabel="expression"),aadt("ProtocolTail",[],contextFreeSyntax(),alabel="tail")],[],alabel="mid")*/
    public final io.usethesource.vallang.type.Type DataTarget_labeled_Name;	/*acons(aadt("DataTarget",[],contextFreeSyntax()),[aadt("Name",[],lexicalSyntax(),alabel="label")],[],alabel="labeled")*/
    public final io.usethesource.vallang.type.Type Pattern_set_iter_star_seps_Pattern;	/*acons(aadt("Pattern",[],contextFreeSyntax()),[\iter-star-seps(aadt("Pattern",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="elements0")],[],alabel="set")*/
    public final io.usethesource.vallang.type.Type FunctionModifier_java_;	/*acons(aadt("FunctionModifier",[],contextFreeSyntax()),[],[],alabel="java")*/
    public final io.usethesource.vallang.type.Type Concrete_typed_str_Sym_str_str_str;	/*acons(aadt("Concrete",[],lexicalSyntax()),[astr(alabel="l1"),aadt("Sym",[],contextFreeSyntax(),alabel="symbol"),astr(alabel="l2"),astr(alabel="l3"),astr(alabel="parts")],[],alabel="typed")*/
    public final io.usethesource.vallang.type.Type ADT_RascalKeywords;	/*aadt("RascalKeywords",[],keywordSyntax())*/
    public final io.usethesource.vallang.type.Type PathPart_interpolated_PrePathChars_Expression_PathTail;	/*acons(aadt("PathPart",[],contextFreeSyntax()),[aadt("PrePathChars",[],lexicalSyntax(),alabel="pre"),aadt("Expression",[],contextFreeSyntax(),alabel="expression"),aadt("PathTail",[],contextFreeSyntax(),alabel="tail")],[],alabel="interpolated")*/
    public final io.usethesource.vallang.type.Type ADT_MidProtocolChars;	/*aadt("MidProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_MidProtocolChars;	/*aadt("MidProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_NamedRegExp;	/*aadt("NamedRegExp",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_NamedRegExp;	/*aadt("NamedRegExp",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type Expression_comprehension_Comprehension;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Comprehension",[],contextFreeSyntax(),alabel="anonymouscomprehension")],[],alabel="comprehension")*/
    public final io.usethesource.vallang.type.Type OptionalTerminator_present_;	/*acons(aadt("OptionalTerminator",[],lexicalSyntax()),[],[],alabel="present")*/
    public final io.usethesource.vallang.type.Type QualifiedName_default_iter_seps_Name;	/*acons(aadt("QualifiedName",[],contextFreeSyntax()),[\iter-seps(aadt("Name",[],lexicalSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit("::"),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="anonymousdefault")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type Expression_subtraction_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="subtraction")*/
    public final io.usethesource.vallang.type.Type Prod_first_Prod_Prod;	/*acons(aadt("Prod",[],contextFreeSyntax()),[aadt("Prod",[],contextFreeSyntax(),alabel="lhs"),aadt("Prod",[],contextFreeSyntax(),alabel="rhs")],[],alabel="first")*/
    public final io.usethesource.vallang.type.Type ADT_PreProtocolChars;	/*aadt("PreProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PreProtocolChars;	/*aadt("PreProtocolChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type StringCharacter_anychar_;	/*acons(aadt("StringCharacter",[],lexicalSyntax()),[],[],alabel="anychar")*/
    public final io.usethesource.vallang.type.Type Statement_emptyStatement_;	/*acons(aadt("Statement",[],contextFreeSyntax()),[],[],alabel="emptyStatement")*/
    public final io.usethesource.vallang.type.Type ADT_NamedBackslash;	/*aadt("NamedBackslash",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_NamedBackslash;	/*aadt("NamedBackslash",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type KeywordArgument_1_default_Name;	/*acons(aadt("KeywordArgument",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],contextFreeSyntax()),[aadt("Name",[],lexicalSyntax(),alabel="name")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type ShellCommand_edit_QualifiedName_OptionalTerminator;	/*acons(aadt("ShellCommand",[],contextFreeSyntax()),[aadt("QualifiedName",[],contextFreeSyntax(),alabel="name"),aadt("OptionalTerminator",[],lexicalSyntax(),alabel="terminator")],[],alabel="edit")*/
    public final io.usethesource.vallang.type.Type Literal_string_StringLiteral;	/*acons(aadt("Literal",[],contextFreeSyntax()),[aadt("StringLiteral",[],contextFreeSyntax(),alabel="anonymousstring")],[],alabel="string")*/
    public final io.usethesource.vallang.type.Type Variant_nAryConstructor_Name_iter_star_seps_TypeArg_KeywordFormals;	/*acons(aadt("Variant",[],contextFreeSyntax()),[aadt("Name",[],lexicalSyntax(),alabel="name"),\iter-star-seps(aadt("TypeArg",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="arguments"),aadt("KeywordFormals",[],contextFreeSyntax(),alabel="keywordArguments")],[],alabel="nAryConstructor")*/
    public final io.usethesource.vallang.type.Type BasicType_loc_;	/*acons(aadt("BasicType",[],contextFreeSyntax()),[],[],alabel="loc")*/
    public final io.usethesource.vallang.type.Type Expression_notIn_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="notIn")*/
    public final io.usethesource.vallang.type.Type StringCharacter_unicode_str;	/*acons(aadt("StringCharacter",[],lexicalSyntax()),[astr(alabel="anonymousunicode")],[],alabel="unicode")*/
    public final io.usethesource.vallang.type.Type TypeVar_bounded_Name_Type;	/*acons(aadt("TypeVar",[],contextFreeSyntax()),[aadt("Name",[],lexicalSyntax(),alabel="name"),aadt("Type",[],contextFreeSyntax(),alabel="bound")],[],alabel="bounded")*/
    public final io.usethesource.vallang.type.Type Expression_insertBefore_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="insertBefore")*/
    public final io.usethesource.vallang.type.Type Pattern_typedVariable_Type_Name;	/*acons(aadt("Pattern",[],contextFreeSyntax()),[aadt("Type",[],contextFreeSyntax(),alabel="type"),aadt("Name",[],lexicalSyntax(),alabel="name")],[],alabel="typedVariable")*/
    public final io.usethesource.vallang.type.Type ADT_HorizontalSpace;	/*aadt("HorizontalSpace",[],layoutSyntax())*/
    public final io.usethesource.vallang.type.Type Header_parameters_Tags_QualifiedName_ModuleParameters_iter_star_seps_Import;	/*acons(aadt("Header",[],contextFreeSyntax()),[aadt("Tags",[],contextFreeSyntax(),alabel="tags"),aadt("QualifiedName",[],contextFreeSyntax(),alabel="name"),aadt("ModuleParameters",[],contextFreeSyntax(),alabel="params"),\iter-star-seps(aadt("Import",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="imports")],[],alabel="parameters")*/
    public final io.usethesource.vallang.type.Type StringTemplate_for_iter_seps_Expression_iter_star_seps_Statement_StringMiddle_iter_star_seps_Statement;	/*acons(aadt("StringTemplate",[],contextFreeSyntax()),[\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="generators"),\iter-star-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="preStats"),aadt("StringMiddle",[],contextFreeSyntax(),alabel="body"),\iter-star-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="postStats")],[],alabel="for")*/
    public final io.usethesource.vallang.type.Type EvalCommand_import_Import;	/*acons(aadt("EvalCommand",[],contextFreeSyntax()),[aadt("Import",[],contextFreeSyntax(),alabel="anonymousimport")],[],alabel="import")*/
    public final io.usethesource.vallang.type.Type Command_shell_ShellCommand;	/*acons(aadt("Command",[],contextFreeSyntax()),[aadt("ShellCommand",[],contextFreeSyntax(),alabel="command")],[],alabel="shell")*/
    public final io.usethesource.vallang.type.Type Import_external_QualifiedName_LocationLiteral;	/*acons(aadt("Import",[],contextFreeSyntax()),[aadt("QualifiedName",[],contextFreeSyntax(),alabel="name"),aadt("LocationLiteral",[],contextFreeSyntax(),alabel="at")],[],alabel="external")*/
    public final io.usethesource.vallang.type.Type Statement_try_Statement_iter_seps_Catch;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("Statement",[],contextFreeSyntax(),alabel="body"),\iter-seps(aadt("Catch",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="handlers")],[],alabel="try")*/
    public final io.usethesource.vallang.type.Type ADT_PathChars;	/*aadt("PathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PathChars;	/*aadt("PathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_PostPathChars;	/*aadt("PostPathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_PostPathChars;	/*aadt("PostPathChars",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type Expression_isDefined_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="argument")],[],alabel="isDefined")*/
    public final io.usethesource.vallang.type.Type Field_index_IntegerLiteral;	/*acons(aadt("Field",[],contextFreeSyntax()),[aadt("IntegerLiteral",[],contextFreeSyntax(),alabel="anonymousindex")],[],alabel="index")*/
    public final io.usethesource.vallang.type.Type UnicodeEscape_utf16_;	/*acons(aadt("UnicodeEscape",[],lexicalSyntax()),[],[],alabel="utf16")*/
    public final io.usethesource.vallang.type.Type ADT_JustDate;	/*aadt("JustDate",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_JustDate;	/*aadt("JustDate",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type Expression_callOrTree_Expression_iter_star_seps_Expression_KeywordArguments_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="expression"),\iter-star-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="arguments"),aadt("KeywordArguments",[aadt("Expression",[],contextFreeSyntax())],contextFreeSyntax(),alabel="keywordArguments")],[],alabel="callOrTree")*/
    public final io.usethesource.vallang.type.Type Expression_is_Expression_Name;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="expression"),aadt("Name",[],lexicalSyntax(),alabel="name")],[],alabel="is")*/
    public final io.usethesource.vallang.type.Type Statement_fail_Target;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("Target",[],contextFreeSyntax(),alabel="target")],[],alabel="fail")*/
    public final io.usethesource.vallang.type.Type CommonKeywordParameters_present_iter_seps_KeywordFormal;	/*acons(aadt("CommonKeywordParameters",[],contextFreeSyntax()),[\iter-seps(aadt("KeywordFormal",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="keywordFormalList")],[],alabel="present")*/
    public final io.usethesource.vallang.type.Type Expression_or_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="or")*/
    public final io.usethesource.vallang.type.Type Kind_tag_;	/*acons(aadt("Kind",[],contextFreeSyntax()),[],[],alabel="tag")*/
    public final io.usethesource.vallang.type.Type Pattern_tuple_iter_seps_Pattern;	/*acons(aadt("Pattern",[],contextFreeSyntax()),[\iter-seps(aadt("Pattern",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="elements")],[],alabel="tuple")*/
    public final io.usethesource.vallang.type.Type Expression_voidClosure_Parameters_iter_star_seps_Statement;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Parameters",[],contextFreeSyntax(),alabel="parameters"),\iter-star-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="statements0")],[],alabel="voidClosure")*/
    public final io.usethesource.vallang.type.Type Sym_parameter_Nonterminal;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("Nonterminal",[],lexicalSyntax(),alabel="nonterminal")],[],alabel="parameter")*/
    public final io.usethesource.vallang.type.Type Replacement_conditional_Expression_iter_seps_Expression;	/*acons(aadt("Replacement",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="replacementExpression"),\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="conditions")],[],alabel="conditional")*/
    public final io.usethesource.vallang.type.Type TypeVar_free_Name;	/*acons(aadt("TypeVar",[],contextFreeSyntax()),[aadt("Name",[],lexicalSyntax(),alabel="name")],[],alabel="free")*/
    public final io.usethesource.vallang.type.Type Declarator_default_Type_iter_seps_Variable;	/*acons(aadt("Declarator",[],contextFreeSyntax()),[aadt("Type",[],contextFreeSyntax(),alabel="type"),\iter-seps(aadt("Variable",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="variables")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type Strategy_bottomUp_;	/*acons(aadt("Strategy",[],contextFreeSyntax()),[],[],alabel="bottomUp")*/
    public final io.usethesource.vallang.type.Type Declaration_tag_Tags_Visibility_Kind_Name_iter_seps_Type;	/*acons(aadt("Declaration",[],contextFreeSyntax()),[aadt("Tags",[],contextFreeSyntax(),alabel="tags"),aadt("Visibility",[],contextFreeSyntax(),alabel="visibility"),aadt("Kind",[],contextFreeSyntax(),alabel="kind"),aadt("Name",[],lexicalSyntax(),alabel="name"),\iter-seps(aadt("Type",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="types")],[],alabel="tag")*/
    public final io.usethesource.vallang.type.Type Sym_precede_Sym_Sym;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("Sym",[],contextFreeSyntax(),alabel="match"),aadt("Sym",[],contextFreeSyntax(),alabel="symbol")],[],alabel="precede")*/
    public final io.usethesource.vallang.type.Type Expression_and_Expression_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="lhs"),aadt("Expression",[],contextFreeSyntax(),alabel="rhs")],[],alabel="and")*/
    public final io.usethesource.vallang.type.Type Pattern_variableBecomes_Name_Pattern;	/*acons(aadt("Pattern",[],contextFreeSyntax()),[aadt("Name",[],lexicalSyntax(),alabel="name"),aadt("Pattern",[],contextFreeSyntax(),alabel="pattern")],[],alabel="variableBecomes")*/
    public final io.usethesource.vallang.type.Type Kind_alias_;	/*acons(aadt("Kind",[],contextFreeSyntax()),[],[],alabel="alias")*/
    public final io.usethesource.vallang.type.Type Assignment_addition_;	/*acons(aadt("Assignment",[],contextFreeSyntax()),[],[],alabel="addition")*/
    public final io.usethesource.vallang.type.Type Assoc_nonAssociative_;	/*acons(aadt("Assoc",[],contextFreeSyntax()),[],[],alabel="nonAssociative")*/
    public final io.usethesource.vallang.type.Type ProtocolTail_post_PostProtocolChars;	/*acons(aadt("ProtocolTail",[],contextFreeSyntax()),[aadt("PostProtocolChars",[],lexicalSyntax(),alabel="anonymouspost")],[],alabel="post")*/
    public final io.usethesource.vallang.type.Type ShellCommand_listModules_OptionalTerminator;	/*acons(aadt("ShellCommand",[],contextFreeSyntax()),[aadt("OptionalTerminator",[],lexicalSyntax(),alabel="terminator")],[],alabel="listModules")*/
    public final io.usethesource.vallang.type.Type Expression_visit_Label_Visit;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Label",[],contextFreeSyntax(),alabel="label"),aadt("Visit",[],contextFreeSyntax(),alabel="visit")],[],alabel="visit")*/
    public final io.usethesource.vallang.type.Type Sym_iter_Sym;	/*acons(aadt("Sym",[],contextFreeSyntax()),[aadt("Sym",[],contextFreeSyntax(),alabel="symbol")],[],alabel="iter")*/
    public final io.usethesource.vallang.type.Type SyntaxDefinition_language_Start_Sym_Prod;	/*acons(aadt("SyntaxDefinition",[],contextFreeSyntax()),[aadt("Start",[],contextFreeSyntax(),alabel="start"),aadt("Sym",[],contextFreeSyntax(),alabel="defined"),aadt("Prod",[],contextFreeSyntax(),alabel="production")],[],alabel="language")*/
    public final io.usethesource.vallang.type.Type Pattern_splicePlus_Pattern;	/*acons(aadt("Pattern",[],contextFreeSyntax()),[aadt("Pattern",[],contextFreeSyntax(),alabel="argument")],[],alabel="splicePlus")*/
    public final io.usethesource.vallang.type.Type Expression_negative_Expression;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="argument")],[],alabel="negative")*/
    public final io.usethesource.vallang.type.Type StringTail_midInterpolated_MidStringChars_Expression_StringTail;	/*acons(aadt("StringTail",[],contextFreeSyntax()),[aadt("MidStringChars",[],lexicalSyntax(),alabel="mid"),aadt("Expression",[],contextFreeSyntax(),alabel="expression"),aadt("StringTail",[],contextFreeSyntax(),alabel="tail")],[],alabel="midInterpolated")*/
    public final io.usethesource.vallang.type.Type OptionalComma_default_;	/*acons(aadt("OptionalComma",[],lexicalSyntax()),[],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type Expression_reifyType_Type;	/*acons(aadt("Expression",[],contextFreeSyntax()),[aadt("Type",[],contextFreeSyntax(),alabel="anonymousreifyType")],[],alabel="reifyType")*/
    public final io.usethesource.vallang.type.Type ADT_JustTime;	/*aadt("JustTime",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type NT_JustTime;	/*aadt("JustTime",[],lexicalSyntax())*/
    public final io.usethesource.vallang.type.Type ImportedModule_default_QualifiedName;	/*acons(aadt("ImportedModule",[],contextFreeSyntax()),[aadt("QualifiedName",[],contextFreeSyntax(),alabel="anonymousdefault")],[],alabel="default")*/
    public final io.usethesource.vallang.type.Type StringTemplate_ifThen_iter_seps_Expression_iter_star_seps_Statement_StringMiddle_iter_star_seps_Statement;	/*acons(aadt("StringTemplate",[],contextFreeSyntax()),[\iter-seps(aadt("Expression",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax()),alit(","),aadt("LAYOUTLIST",[],layoutSyntax())],alabel="conditions"),\iter-star-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="preStats"),aadt("StringMiddle",[],contextFreeSyntax(),alabel="body"),\iter-star-seps(aadt("Statement",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="postStats")],[],alabel="ifThen")*/
    public final io.usethesource.vallang.type.Type Assignable_variable_QualifiedName;	/*acons(aadt("Assignable",[],contextFreeSyntax()),[aadt("QualifiedName",[],contextFreeSyntax(),alabel="anonymousvariable")],[],alabel="variable")*/
    public final io.usethesource.vallang.type.Type Import_syntax_SyntaxDefinition;	/*acons(aadt("Import",[],contextFreeSyntax()),[aadt("SyntaxDefinition",[],contextFreeSyntax(),alabel="anonymoussyntax")],[],alabel="syntax")*/
    public final io.usethesource.vallang.type.Type Pattern_descendant_Pattern;	/*acons(aadt("Pattern",[],contextFreeSyntax()),[aadt("Pattern",[],contextFreeSyntax(),alabel="pattern")],[],alabel="descendant")*/
    public final io.usethesource.vallang.type.Type StringLiteral_template_PreStringChars_StringTemplate_StringTail;	/*acons(aadt("StringLiteral",[],contextFreeSyntax()),[aadt("PreStringChars",[],lexicalSyntax(),alabel="pre"),aadt("StringTemplate",[],contextFreeSyntax(),alabel="template"),aadt("StringTail",[],contextFreeSyntax(),alabel="tail")],[],alabel="template")*/
    public final io.usethesource.vallang.type.Type Commands_commandlist_iter_seps_EvalCommand;	/*acons(aadt("Commands",[],contextFreeSyntax()),[\iter-seps(aadt("EvalCommand",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="anonymouscommandlist")],[],alabel="commandlist")*/
    public final io.usethesource.vallang.type.Type Statement_throw_Statement;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("Statement",[],contextFreeSyntax(),alabel="statement")],[],alabel="throw")*/
    public final io.usethesource.vallang.type.Type Kind_view_;	/*acons(aadt("Kind",[],contextFreeSyntax()),[],[],alabel="view")*/
    public final io.usethesource.vallang.type.Type Visit_defaultStrategy_Expression_iter_seps_Case;	/*acons(aadt("Visit",[],contextFreeSyntax()),[aadt("Expression",[],contextFreeSyntax(),alabel="subject"),\iter-seps(aadt("Case",[],contextFreeSyntax()),[aadt("LAYOUTLIST",[],layoutSyntax())],alabel="cases")],[],alabel="defaultStrategy")*/
    public final io.usethesource.vallang.type.Type Statement_continue_Target;	/*acons(aadt("Statement",[],contextFreeSyntax()),[aadt("Target",[],contextFreeSyntax(),alabel="target")],[],alabel="continue")*/
    public final io.usethesource.vallang.type.Type Tag_expression_Name_Expression;	/*acons(aadt("Tag",[],contextFreeSyntax()),[aadt("Name",[],lexicalSyntax(),alabel="name"),aadt("Expression",[],contextFreeSyntax(),alabel="anonymousexpression")],[],alabel="expression")*/

    public $Rascal(RascalExecutionContext rex){
        this(rex, null);
    }
    
    public $Rascal(RascalExecutionContext rex, Object extended){
       super(rex);
       this.$me = extended == null ? this : ($Rascal_$I)extended;
       ModuleStore mstore = rex.getModuleStore();
       mstore.put(rascal.lang.rascal.syntax.$Rascal.class, this);
        
        
       
                          
       
       
       $constants = readBinaryConstantsFile(this.getClass(), "rascal/lang/rascal/syntax/$Rascal.constants", 0, "d751713988987e9331980363e24189ce");
       NT_Expression = $sort("Expression");
       ADT_Expression = $adt("Expression");
       NT_Statement = $sort("Statement");
       ADT_Statement = $adt("Statement");
       ADT_LAYOUTLIST = $layouts("LAYOUTLIST");
       NT_StringLiteral = $sort("StringLiteral");
       ADT_StringLiteral = $adt("StringLiteral");
       NT_Renamings = $sort("Renamings");
       ADT_Renamings = $adt("Renamings");
       NT_Renaming = $sort("Renaming");
       ADT_Renaming = $adt("Renaming");
       NT_Comprehension = $sort("Comprehension");
       ADT_Comprehension = $adt("Comprehension");
       NT_BooleanLiteral = $lex("BooleanLiteral");
       ADT_BooleanLiteral = $adt("BooleanLiteral");
       ADT_Tree = $adt("Tree");
       NT_PatternWithAction = $sort("PatternWithAction");
       ADT_PatternWithAction = $adt("PatternWithAction");
       NT_UnicodeEscape = $lex("UnicodeEscape");
       ADT_UnicodeEscape = $adt("UnicodeEscape");
       NT_Type = $sort("Type");
       ADT_Type = $adt("Type");
       NT_ShellCommand = $sort("ShellCommand");
       ADT_ShellCommand = $adt("ShellCommand");
       NT_KeywordFormal = $sort("KeywordFormal");
       ADT_KeywordFormal = $adt("KeywordFormal");
       NT_Case = $sort("Case");
       ADT_Case = $adt("Case");
       NT_Kind = $sort("Kind");
       ADT_Kind = $adt("Kind");
       NT_Strategy = $sort("Strategy");
       ADT_Strategy = $adt("Strategy");
       NT_Sym = $sort("Sym");
       ADT_Sym = $adt("Sym");
       NT_TimePartNoTZ = $lex("TimePartNoTZ");
       ADT_TimePartNoTZ = $adt("TimePartNoTZ");
       NT_Pattern = $sort("Pattern");
       ADT_Pattern = $adt("Pattern");
       NT_OptionalTerminator = $lex("OptionalTerminator");
       ADT_OptionalTerminator = $adt("OptionalTerminator");
       NT_Target = $sort("Target");
       ADT_Target = $adt("Target");
       NT_IntegerLiteral = $sort("IntegerLiteral");
       ADT_IntegerLiteral = $adt("IntegerLiteral");
       NT_FunctionModifier = $sort("FunctionModifier");
       ADT_FunctionModifier = $adt("FunctionModifier");
       NT_Command = $sort("Command");
       ADT_Command = $adt("Command");
       NT_Literal = $sort("Literal");
       ADT_Literal = $adt("Literal");
       NT_Assignable = $sort("Assignable");
       ADT_Assignable = $adt("Assignable");
       NT_ImportedModule = $sort("ImportedModule");
       ADT_ImportedModule = $adt("ImportedModule");
       NT_Prod = $sort("Prod");
       ADT_Prod = $adt("Prod");
       NT_ProdModifier = $sort("ProdModifier");
       ADT_ProdModifier = $adt("ProdModifier");
       NT_Output = $lex("Output");
       ADT_Output = $adt("Output");
       NT_Class = $sort("Class");
       ADT_Class = $adt("Class");
       NT_Concrete = $lex("Concrete");
       ADT_Concrete = $adt("Concrete");
       NT_OptionalEqualSign = $lex("OptionalEqualSign");
       ADT_OptionalEqualSign = $adt("OptionalEqualSign");
       NT_Variable = $sort("Variable");
       ADT_Variable = $adt("Variable");
       NT_PostProtocolChars = $lex("PostProtocolChars");
       ADT_PostProtocolChars = $adt("PostProtocolChars");
       NT_Assignment = $sort("Assignment");
       ADT_Assignment = $adt("Assignment");
       NT_Range = $sort("Range");
       ADT_Range = $adt("Range");
       NT_MidStringChars = $lex("MidStringChars");
       ADT_MidStringChars = $adt("MidStringChars");
       NT_LocalVariableDeclaration = $sort("LocalVariableDeclaration");
       ADT_LocalVariableDeclaration = $adt("LocalVariableDeclaration");
       NT_ProtocolChars = $lex("ProtocolChars");
       ADT_ProtocolChars = $adt("ProtocolChars");
       NT_BasicType = $sort("BasicType");
       ADT_BasicType = $adt("BasicType");
       NT_Visibility = $sort("Visibility");
       ADT_Visibility = $adt("Visibility");
       NT_FunctionType = $sort("FunctionType");
       ADT_FunctionType = $adt("FunctionType");
       NT_Replacement = $sort("Replacement");
       ADT_Replacement = $adt("Replacement");
       NT_StringCharacter = $lex("StringCharacter");
       ADT_StringCharacter = $adt("StringCharacter");
       NT_Label = $sort("Label");
       ADT_Label = $adt("Label");
       NT_DateTimeLiteral = $sort("DateTimeLiteral");
       ADT_DateTimeLiteral = $adt("DateTimeLiteral");
       NT_SyntaxDefinition = $sort("SyntaxDefinition");
       ADT_SyntaxDefinition = $adt("SyntaxDefinition");
       NT_TypeArg = $sort("TypeArg");
       ADT_TypeArg = $adt("TypeArg");
       NT_RegExpModifier = $lex("RegExpModifier");
       ADT_RegExpModifier = $adt("RegExpModifier");
       NT_StringTail = $sort("StringTail");
       ADT_StringTail = $adt("StringTail");
       NT_FunctionModifiers = $sort("FunctionModifiers");
       ADT_FunctionModifiers = $adt("FunctionModifiers");
       NT_Declaration = $sort("Declaration");
       ADT_Declaration = $adt("Declaration");
       NT_DecimalIntegerLiteral = $lex("DecimalIntegerLiteral");
       ADT_DecimalIntegerLiteral = $adt("DecimalIntegerLiteral");
       NT_Assoc = $sort("Assoc");
       ADT_Assoc = $adt("Assoc");
       NT_FunctionDeclaration = $sort("FunctionDeclaration");
       ADT_FunctionDeclaration = $adt("FunctionDeclaration");
       NT_Toplevel = $sort("Toplevel");
       ADT_Toplevel = $adt("Toplevel");
       NT_UserType = $sort("UserType");
       ADT_UserType = $adt("UserType");
       NT_ConcretePart = $lex("ConcretePart");
       ADT_ConcretePart = $adt("ConcretePart");
       NT_StringMiddle = $sort("StringMiddle");
       ADT_StringMiddle = $adt("StringMiddle");
       NT_DatePart = $lex("DatePart");
       ADT_DatePart = $adt("DatePart");
       NT_Declarator = $sort("Declarator");
       ADT_Declarator = $adt("Declarator");
       NT_PathTail = $sort("PathTail");
       ADT_PathTail = $adt("PathTail");
       NT_Name = $lex("Name");
       ADT_Name = $adt("Name");
       NT_Catch = $sort("Catch");
       ADT_Catch = $adt("Catch");
       NT_ProtocolPart = $sort("ProtocolPart");
       ADT_ProtocolPart = $adt("ProtocolPart");
       NT_RegExpLiteral = $lex("RegExpLiteral");
       ADT_RegExpLiteral = $adt("RegExpLiteral");
       NT_OptionalExpression = $sort("OptionalExpression");
       ADT_OptionalExpression = $adt("OptionalExpression");
       NT_Import = $sort("Import");
       ADT_Import = $adt("Import");
       NT_ModuleParameters = $sort("ModuleParameters");
       ADT_ModuleParameters = $adt("ModuleParameters");
       NT_RationalLiteral = $lex("RationalLiteral");
       ADT_RationalLiteral = $adt("RationalLiteral");
       NT_QualifiedName = $sort("QualifiedName");
       ADT_QualifiedName = $adt("QualifiedName");
       NT_StructuredType = $sort("StructuredType");
       ADT_StructuredType = $adt("StructuredType");
       NT_Body = $sort("Body");
       ADT_Body = $adt("Body");
       NT_URLChars = $lex("URLChars");
       ADT_URLChars = $adt("URLChars");
       NT_Tags = $sort("Tags");
       ADT_Tags = $adt("Tags");
       NT_ModuleActuals = $sort("ModuleActuals");
       ADT_ModuleActuals = $adt("ModuleActuals");
       NT_PathPart = $sort("PathPart");
       ADT_PathPart = $adt("PathPart");
       NT_Signature = $sort("Signature");
       ADT_Signature = $adt("Signature");
       NT_Parameters = $sort("Parameters");
       ADT_Parameters = $adt("Parameters");
       NT_FunctionBody = $sort("FunctionBody");
       ADT_FunctionBody = $adt("FunctionBody");
       NT_Tag = $sort("Tag");
       ADT_Tag = $adt("Tag");
       NT_LocationLiteral = $sort("LocationLiteral");
       ADT_LocationLiteral = $adt("LocationLiteral");
       NT_Field = $sort("Field");
       ADT_Field = $adt("Field");
       NT_HexIntegerLiteral = $lex("HexIntegerLiteral");
       ADT_HexIntegerLiteral = $adt("HexIntegerLiteral");
       NT_PostStringChars = $lex("PostStringChars");
       ADT_PostStringChars = $adt("PostStringChars");
       NT_DataTarget = $sort("DataTarget");
       ADT_DataTarget = $adt("DataTarget");
       NT_DataTypeSelector = $sort("DataTypeSelector");
       ADT_DataTypeSelector = $adt("DataTypeSelector");
       NT_KeywordFormals = $sort("KeywordFormals");
       ADT_KeywordFormals = $adt("KeywordFormals");
       NT_NonterminalLabel = $lex("NonterminalLabel");
       ADT_NonterminalLabel = $adt("NonterminalLabel");
       NT_Start = $sort("Start");
       ADT_Start = $adt("Start");
       NT_LAYOUT = $lex("LAYOUT");
       ADT_LAYOUT = $adt("LAYOUT");
       NT_TagString = $lex("TagString");
       ADT_TagString = $adt("TagString");
       NT_EvalCommand = $sort("EvalCommand");
       ADT_EvalCommand = $adt("EvalCommand");
       NT_Nonterminal = $lex("Nonterminal");
       ADT_Nonterminal = $adt("Nonterminal");
       NT_PreStringChars = $lex("PreStringChars");
       ADT_PreStringChars = $adt("PreStringChars");
       NT_RegExp = $lex("RegExp");
       ADT_RegExp = $adt("RegExp");
       NT_Header = $sort("Header");
       ADT_Header = $adt("Header");
       NT_TimeZonePart = $lex("TimeZonePart");
       ADT_TimeZonePart = $adt("TimeZonePart");
       NT_Variant = $sort("Variant");
       ADT_Variant = $adt("Variant");
       NT_TypeVar = $sort("TypeVar");
       ADT_TypeVar = $adt("TypeVar");
       NT_StringTemplate = $sort("StringTemplate");
       ADT_StringTemplate = $adt("StringTemplate");
       NT_Bound = $sort("Bound");
       ADT_Bound = $adt("Bound");
       NT_Backslash = $lex("Backslash");
       ADT_Backslash = $adt("Backslash");
       NT_CaseInsensitiveStringConstant = $lex("CaseInsensitiveStringConstant");
       ADT_CaseInsensitiveStringConstant = $adt("CaseInsensitiveStringConstant");
       NT_OptionalComma = $lex("OptionalComma");
       ADT_OptionalComma = $adt("OptionalComma");
       NT_StringConstant = $lex("StringConstant");
       ADT_StringConstant = $adt("StringConstant");
       NT_ConcreteHole = $sort("ConcreteHole");
       ADT_ConcreteHole = $adt("ConcreteHole");
       NT_PrePathChars = $lex("PrePathChars");
       ADT_PrePathChars = $adt("PrePathChars");
       NT_Visit = $sort("Visit");
       ADT_Visit = $adt("Visit");
       NT_Module = $sort("Module");
       ADT_Module = $adt("Module");
       NT_Formals = $sort("Formals");
       ADT_Formals = $adt("Formals");
       NT_MidPathChars = $lex("MidPathChars");
       ADT_MidPathChars = $adt("MidPathChars");
       NT_Char = $lex("Char");
       ADT_Char = $adt("Char");
       NT_CommonKeywordParameters = $sort("CommonKeywordParameters");
       ADT_CommonKeywordParameters = $adt("CommonKeywordParameters");
       NT_RealLiteral = $lex("RealLiteral");
       ADT_RealLiteral = $adt("RealLiteral");
       NT_DateAndTime = $lex("DateAndTime");
       ADT_DateAndTime = $adt("DateAndTime");
       NT_ProtocolTail = $sort("ProtocolTail");
       ADT_ProtocolTail = $adt("ProtocolTail");
       NT_OctalIntegerLiteral = $lex("OctalIntegerLiteral");
       ADT_OctalIntegerLiteral = $adt("OctalIntegerLiteral");
       NT_Commands = $sort("Commands");
       ADT_Commands = $adt("Commands");
       NT_Comment = $lex("Comment");
       ADT_Comment = $adt("Comment");
       ADT_RascalKeywords = $keywords("RascalKeywords");
       NT_MidProtocolChars = $lex("MidProtocolChars");
       ADT_MidProtocolChars = $adt("MidProtocolChars");
       NT_NamedRegExp = $lex("NamedRegExp");
       ADT_NamedRegExp = $adt("NamedRegExp");
       NT_PreProtocolChars = $lex("PreProtocolChars");
       ADT_PreProtocolChars = $adt("PreProtocolChars");
       NT_NamedBackslash = $lex("NamedBackslash");
       ADT_NamedBackslash = $adt("NamedBackslash");
       ADT_HorizontalSpace = $layouts("HorizontalSpace");
       NT_PathChars = $lex("PathChars");
       ADT_PathChars = $adt("PathChars");
       NT_PostPathChars = $lex("PostPathChars");
       ADT_PostPathChars = $adt("PostPathChars");
       NT_JustDate = $lex("JustDate");
       ADT_JustDate = $adt("JustDate");
       NT_JustTime = $lex("JustTime");
       ADT_JustTime = $adt("JustTime");
       $T47 = $TF.stringType();
       $T43 = $TF.stringType();
       $T38 = $TF.stringType();
       $T44 = $TF.stringType();
       $T42 = $TF.stringType();
       $T45 = $TF.stringType();
       $T35 = $TF.stringType();
       Expression_greaterThanOrEq_Expression_Expression = $TF.constructor($TS, NT_Expression, "greaterThanOrEq", NT_Expression, "lhs", NT_Expression, "rhs");
       $T17 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Statement")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       StringLiteral_interpolated_PreStringChars_Expression_StringTail = $TF.constructor($TS, NT_StringLiteral, "interpolated", NT_PreStringChars, "pre", NT_Expression, "expression", NT_StringTail, "tail");
       $T3 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")));
       $T53 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Renaming")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Renamings_default_iter_seps_Renaming = $TF.constructor($TS, NT_Renamings, "default", $T53, "renamings");
       $T5 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Expression")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       $T6 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Expression")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Comprehension_set_iter_seps_Expression_iter_seps_Expression = $TF.constructor($TS, NT_Comprehension, "set", $T5, "results", $T6, "generators");
       $T1 = $TF.parameterType("T", ADT_Tree);
       NT_KeywordArguments_1 = $parameterizedSort("KeywordArguments", new Type[] { $T1 }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Parameter, $RVF.string("T"), $RVF.constructor(RascalValueFactory.Symbol_Adt, $RVF.string("Tree"), $RVF.list()))));
       PatternWithAction_replacing_Pattern_Replacement = $TF.constructor($TS, NT_PatternWithAction, "replacing", NT_Pattern, "pattern", NT_Replacement, "replacement");
       UnicodeEscape_utf32_ = $TF.constructor($TS, NT_UnicodeEscape, "utf32");
       Type_bracket_Type = $TF.constructor($TS, NT_Type, "bracket", NT_Type, "type");
       ShellCommand_quit_OptionalTerminator = $TF.constructor($TS, NT_ShellCommand, "quit", NT_OptionalTerminator, "terminator");
       KeywordFormal_default_Type_Name_Expression = $TF.constructor($TS, NT_KeywordFormal, "default", NT_Type, "type", NT_Name, "name", NT_Expression, "expression");
       Kind_all_ = $TF.constructor($TS, NT_Kind, "all");
       NT_Mapping_Expression = $parameterizedSort("Mapping", new Type[] { ADT_Expression }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Expression"))));
       NT_Mapping_1 = $parameterizedSort("Mapping", new Type[] { $T1 }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Parameter, $RVF.string("T"), $RVF.constructor(RascalValueFactory.Symbol_Adt, $RVF.string("Tree"), $RVF.list()))));
       Sym_iterStarSep_Sym_Sym = $TF.constructor($TS, NT_Sym, "iterStarSep", NT_Sym, "symbol", NT_Sym, "sep");
       Expression_join_Expression_Expression = $TF.constructor($TS, NT_Expression, "join", NT_Expression, "lhs", NT_Expression, "rhs");
       IntegerLiteral_octalIntegerLiteral_OctalIntegerLiteral = $TF.constructor($TS, NT_IntegerLiteral, "octalIntegerLiteral", NT_OctalIntegerLiteral, "anonymousoctalIntegerLiteral");
       FunctionModifier_default_ = $TF.constructor($TS, NT_FunctionModifier, "default");
       Statement_expression_Expression = $TF.constructor($TS, NT_Statement, "expression", NT_Expression, "expression");
       Command_import_Import = $TF.constructor($TS, NT_Command, "import", NT_Import, "anonymousimport");
       NT_KeywordArguments_Expression = $parameterizedSort("KeywordArguments", new Type[] { ADT_Expression }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Expression"))));
       Literal_integer_IntegerLiteral = $TF.constructor($TS, NT_Literal, "integer", NT_IntegerLiteral, "anonymousinteger");
       $T52 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Assignable")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Assignable_tuple_iter_seps_Assignable = $TF.constructor($TS, NT_Assignable, "tuple", $T52, "elements");
       Sym_iterStar_Sym = $TF.constructor($TS, NT_Sym, "iterStar", NT_Sym, "symbol");
       $T9 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Expression")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Statement_ifThenElse_Label_iter_seps_Expression_Statement_Statement = $TF.constructor($TS, NT_Statement, "ifThenElse", NT_Label, "label", $T9, "conditions", NT_Statement, "thenStatement", NT_Statement, "elseStatement");
       $T51 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Sym")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Sym_parametrized_Nonterminal_iter_seps_Sym = $TF.constructor($TS, NT_Sym, "parametrized", NT_Nonterminal, "anonymousparametrized", $T51, "parameters");
       $T25 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Pattern")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       $T54 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("ProdModifier")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       $T55 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Sym")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Prod_labeled_iter_star_seps_ProdModifier_Name_iter_star_seps_Sym = $TF.constructor($TS, NT_Prod, "labeled", $T54, "modifiers", NT_Name, "name", $T55, "syms");
       Sym_nonterminal_Nonterminal = $TF.constructor($TS, NT_Sym, "nonterminal", NT_Nonterminal, "anonymousnonterminal");
       Output_resultOutput_ = $TF.constructor($TS, NT_Output, "resultOutput");
       $T11 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string("|")));
       $T12 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Sym")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string("|")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Class_intersection_Class_Class = $TF.constructor($TS, NT_Class, "intersection", NT_Class, "lhs", NT_Class, "rhs");
       ShellCommand_setOption_QualifiedName_OptionalEqualSign_Expression_OptionalTerminator = $TF.constructor($TS, NT_ShellCommand, "setOption", NT_QualifiedName, "name", NT_OptionalEqualSign, "sign", NT_Expression, "expression", NT_OptionalTerminator, "terminator");
       Pattern_multiVariable_QualifiedName = $TF.constructor($TS, NT_Pattern, "multiVariable", NT_QualifiedName, "qualifiedName");
       Sym_optional_Sym = $TF.constructor($TS, NT_Sym, "optional", NT_Sym, "symbol");
       Sym_caseInsensitiveLiteral_CaseInsensitiveStringConstant = $TF.constructor($TS, NT_Sym, "caseInsensitiveLiteral", NT_CaseInsensitiveStringConstant, "anonymouscaseInsensitiveLiteral");
       OptionalEqualSign_absent_ = $TF.constructor($TS, NT_OptionalEqualSign, "absent");
       $T18 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Type")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Variable_initialized_Name_Expression = $TF.constructor($TS, NT_Variable, "initialized", NT_Name, "name", NT_Expression, "initial");
       Class_bracket_Class = $TF.constructor($TS, NT_Class, "bracket", NT_Class, "charClass");
       Assignment_division_ = $TF.constructor($TS, NT_Assignment, "division");
       $T29 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Pattern")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Expression_sliceStep_Expression_OptionalExpression_Expression_OptionalExpression = $TF.constructor($TS, NT_Expression, "sliceStep", NT_Expression, "anonymoussliceStep", NT_OptionalExpression, "optFirst", NT_Expression, "second", NT_OptionalExpression, "optLast");
       Expression_concrete_Concrete = $TF.constructor($TS, NT_Expression, "concrete", NT_Concrete, "anonymousconcrete");
       Expression_literal_Literal = $TF.constructor($TS, NT_Expression, "literal", NT_Literal, "anonymousliteral");
       Command_statement_Statement = $TF.constructor($TS, NT_Command, "statement", NT_Statement, "anonymousstatement");
       Expression_composition_Expression_Expression = $TF.constructor($TS, NT_Expression, "composition", NT_Expression, "lhs", NT_Expression, "rhs");
       Type_selector_DataTypeSelector = $TF.constructor($TS, NT_Type, "selector", NT_DataTypeSelector, "anonymousselector");
       ImportedModule_renamings_QualifiedName_Renamings = $TF.constructor($TS, NT_ImportedModule, "renamings", NT_QualifiedName, "name", NT_Renamings, "renamings");
       BasicType_bag_ = $TF.constructor($TS, NT_BasicType, "bag");
       BasicType_tuple_ = $TF.constructor($TS, NT_BasicType, "tuple");
       UnicodeEscape_ascii_ = $TF.constructor($TS, NT_UnicodeEscape, "ascii");
       KeywordArguments_1_none_ = $TF.constructor($TS, NT_KeywordArguments_1, "none");
       Kind_module_ = $TF.constructor($TS, NT_Kind, "module");
       StringCharacter_continuation_str = $TF.constructor($TS, NT_StringCharacter, "continuation", $T47, "anonymouscontinuation");
       Output_stdoutOutput_ = $TF.constructor($TS, NT_Output, "stdoutOutput");
       Expression_transitiveReflexiveClosure_Expression = $TF.constructor($TS, NT_Expression, "transitiveReflexiveClosure", NT_Expression, "argument");
       BasicType_list_ = $TF.constructor($TS, NT_BasicType, "list");
       SyntaxDefinition_layout_Visibility_Sym_Prod = $TF.constructor($TS, NT_SyntaxDefinition, "layout", NT_Visibility, "vis", NT_Sym, "defined", NT_Prod, "production");
       Expression_modulo_Expression_Expression = $TF.constructor($TS, NT_Expression, "modulo", NT_Expression, "lhs", NT_Expression, "rhs");
       $T60 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("TypeArg")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       ShellCommand_unextend_QualifiedName_OptionalTerminator = $TF.constructor($TS, NT_ShellCommand, "unextend", NT_QualifiedName, "name", NT_OptionalTerminator, "terminator");
       SyntaxDefinition_keyword_Sym_Prod = $TF.constructor($TS, NT_SyntaxDefinition, "keyword", NT_Sym, "defined", NT_Prod, "production");
       Statement_filter_ = $TF.constructor($TS, NT_Statement, "filter");
       Statement_doWhile_Label_Statement_Expression = $TF.constructor($TS, NT_Statement, "doWhile", NT_Label, "label", NT_Statement, "body", NT_Expression, "condition");
       Expression_reifiedType_Expression_Expression = $TF.constructor($TS, NT_Expression, "reifiedType", NT_Expression, "symbol", NT_Expression, "definitions");
       $T65 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Assignable")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Visibility_private_ = $TF.constructor($TS, NT_Visibility, "private");
       StringTail_midTemplate_MidStringChars_StringTemplate_StringTail = $TF.constructor($TS, NT_StringTail, "midTemplate", NT_MidStringChars, "mid", NT_StringTemplate, "template", NT_StringTail, "tail");
       Strategy_bottomUpBreak_ = $TF.constructor($TS, NT_Strategy, "bottomUpBreak");
       BasicType_real_ = $TF.constructor($TS, NT_BasicType, "real");
       $T46 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("FunctionModifier")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       FunctionModifiers_modifierlist_iter_star_seps_FunctionModifier = $TF.constructor($TS, NT_FunctionModifiers, "modifierlist", $T46, "anonymousmodifierlist");
       Sym_characterClass_Class = $TF.constructor($TS, NT_Sym, "characterClass", NT_Class, "anonymouscharacterClass");
       $T14 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Statement")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Declaration_annotation_Tags_Visibility_Type_Type_Name = $TF.constructor($TS, NT_Declaration, "annotation", NT_Tags, "tags", NT_Visibility, "visibility", NT_Type, "annoType", NT_Type, "onType", NT_Name, "name");
       Pattern_negative_Pattern = $TF.constructor($TS, NT_Pattern, "negative", NT_Pattern, "argument");
       Comprehension_map_Expression_Expression_iter_seps_Expression = $TF.constructor($TS, NT_Comprehension, "map", NT_Expression, "from", NT_Expression, "to", $T6, "generators");
       Expression_qualifiedName_QualifiedName = $TF.constructor($TS, NT_Expression, "qualifiedName", NT_QualifiedName, "anonymousqualifiedName");
       FunctionDeclaration_conditional_Tags_Visibility_Signature_Expression_iter_seps_Expression = $TF.constructor($TS, NT_FunctionDeclaration, "conditional", NT_Tags, "tags", NT_Visibility, "visibility", NT_Signature, "signature", NT_Expression, "expression", $T9, "conditions");
       Statement_return_Statement = $TF.constructor($TS, NT_Statement, "return", NT_Statement, "statement");
       $T62 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Toplevel")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       $T58 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Statement")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       IntegerLiteral_hexIntegerLiteral_HexIntegerLiteral = $TF.constructor($TS, NT_IntegerLiteral, "hexIntegerLiteral", NT_HexIntegerLiteral, "anonymoushexIntegerLiteral");
       $T48 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Type")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       UserType_parametric_QualifiedName_iter_seps_Type = $TF.constructor($TS, NT_UserType, "parametric", NT_QualifiedName, "anonymousparametric", $T48, "parameters");
       ConcretePart_gt_ = $TF.constructor($TS, NT_ConcretePart, "gt");
       Kind_function_ = $TF.constructor($TS, NT_Kind, "function");
       ShellCommand_unimport_QualifiedName_OptionalTerminator = $TF.constructor($TS, NT_ShellCommand, "unimport", NT_QualifiedName, "name", NT_OptionalTerminator, "terminator");
       Expression_equals_Expression_Expression = $TF.constructor($TS, NT_Expression, "equals", NT_Expression, "lhs", NT_Expression, "rhs");
       $T37 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("TypeArg")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       FunctionType_typeArguments_Type_iter_star_seps_TypeArg = $TF.constructor($TS, NT_FunctionType, "typeArguments", NT_Type, "type", $T37, "arguments");
       StringMiddle_template_MidStringChars_StringTemplate_StringMiddle = $TF.constructor($TS, NT_StringMiddle, "template", NT_MidStringChars, "mid", NT_StringTemplate, "template", NT_StringMiddle, "tail");
       Expression_nonEquals_Expression_Expression = $TF.constructor($TS, NT_Expression, "nonEquals", NT_Expression, "lhs", NT_Expression, "rhs");
       ShellCommand_unsetOption_QualifiedName_OptionalTerminator = $TF.constructor($TS, NT_ShellCommand, "unsetOption", NT_QualifiedName, "name", NT_OptionalTerminator, "terminator");
       $T50 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Expression")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Expression_tuple_iter_seps_Expression = $TF.constructor($TS, NT_Expression, "tuple", $T50, "elements");
       Strategy_topDown_ = $TF.constructor($TS, NT_Strategy, "topDown");
       Literal_regExp_RegExpLiteral = $TF.constructor($TS, NT_Literal, "regExp", NT_RegExpLiteral, "anonymousregExp");
       PathTail_mid_MidPathChars_Expression_PathTail = $TF.constructor($TS, NT_PathTail, "mid", NT_MidPathChars, "mid", NT_Expression, "expression", NT_PathTail, "tail");
       Type_basic_BasicType = $TF.constructor($TS, NT_Type, "basic", NT_BasicType, "anonymousbasic");
       $T32 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Catch")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       ProtocolPart_interpolated_PreProtocolChars_Expression_ProtocolTail = $TF.constructor($TS, NT_ProtocolPart, "interpolated", NT_PreProtocolChars, "pre", NT_Expression, "expression", NT_ProtocolTail, "tail");
       Expression_reducer_Expression_Expression_iter_seps_Expression = $TF.constructor($TS, NT_Expression, "reducer", NT_Expression, "init", NT_Expression, "result", $T6, "generators");
       Assignable_ifDefinedOrDefault_Assignable_Expression = $TF.constructor($TS, NT_Assignable, "ifDefinedOrDefault", NT_Assignable, "receiver", NT_Expression, "defaultExpression");
       OptionalExpression_noExpression_ = $TF.constructor($TS, NT_OptionalExpression, "noExpression");
       Expression_equivalence_Expression_Expression = $TF.constructor($TS, NT_Expression, "equivalence", NT_Expression, "lhs", NT_Expression, "rhs");
       $T49 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Expression")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Expression_set_iter_star_seps_Expression = $TF.constructor($TS, NT_Expression, "set", $T49, "elements0");
       Label_empty_ = $TF.constructor($TS, NT_Label, "empty");
       Strategy_innermost_ = $TF.constructor($TS, NT_Strategy, "innermost");
       Expression_stepRange_Expression_Expression_Expression = $TF.constructor($TS, NT_Expression, "stepRange", NT_Expression, "first", NT_Expression, "second", NT_Expression, "last");
       Import_default_ImportedModule = $TF.constructor($TS, NT_Import, "default", NT_ImportedModule, "module");
       Sym_column_Sym_IntegerLiteral = $TF.constructor($TS, NT_Sym, "column", NT_Sym, "symbol", NT_IntegerLiteral, "column");
       $T0 = $TF.parameterType("T", ADT_Tree);
       $T59 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Expression")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       BasicType_void_ = $TF.constructor($TS, NT_BasicType, "void");
       $T28 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Variable")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Declaration_variable_Tags_Visibility_Type_iter_seps_Variable = $TF.constructor($TS, NT_Declaration, "variable", NT_Tags, "tags", NT_Visibility, "visibility", NT_Type, "type", $T28, "variables");
       Assoc_left_ = $TF.constructor($TS, NT_Assoc, "left");
       $T8 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_Opt, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("QualifiedName"))));
       ShellCommand_test_opt_QualifiedName_OptionalTerminator = $TF.constructor($TS, NT_ShellCommand, "test", $T8, "optName", NT_OptionalTerminator, "terminator");
       $T30 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Import")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       BasicType_type_ = $TF.constructor($TS, NT_BasicType, "type");
       StructuredType_default_BasicType_iter_seps_TypeArg = $TF.constructor($TS, NT_StructuredType, "default", NT_BasicType, "basicType", $T60, "arguments");
       Literal_real_RealLiteral = $TF.constructor($TS, NT_Literal, "real", NT_RealLiteral, "anonymousreal");
       $T61 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("QualifiedName")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Statement_solve_iter_seps_QualifiedName_Bound_Statement = $TF.constructor($TS, NT_Statement, "solve", $T61, "variables", NT_Bound, "bound", NT_Statement, "body");
       Type_variable_TypeVar = $TF.constructor($TS, NT_Type, "variable", NT_TypeVar, "anonymousvariable");
       $T63 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Range")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Class_simpleCharclass_iter_star_seps_Range = $TF.constructor($TS, NT_Class, "simpleCharclass", $T63, "ranges");
       Type_user_UserType = $TF.constructor($TS, NT_Type, "user", NT_UserType, "anonymoususer");
       Pattern_splice_Pattern = $TF.constructor($TS, NT_Pattern, "splice", NT_Pattern, "argument");
       DateTimeLiteral_dateAndTimeLiteral_DateAndTime = $TF.constructor($TS, NT_DateTimeLiteral, "dateAndTimeLiteral", NT_DateAndTime, "anonymousdateAndTimeLiteral");
       Pattern_typedVariableBecomes_Type_Name_Pattern = $TF.constructor($TS, NT_Pattern, "typedVariableBecomes", NT_Type, "type", NT_Name, "name", NT_Pattern, "pattern");
       Body_toplevels_iter_star_seps_Toplevel = $TF.constructor($TS, NT_Body, "toplevels", $T62, "anonymoustoplevels");
       ImportedModule_actualsRenaming_QualifiedName_ModuleActuals_Renamings = $TF.constructor($TS, NT_ImportedModule, "actualsRenaming", NT_QualifiedName, "name", NT_ModuleActuals, "actuals", NT_Renamings, "renamings");
       Assignment_ifDefined_ = $TF.constructor($TS, NT_Assignment, "ifDefined");
       $T16 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Statement")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Visibility_default_ = $TF.constructor($TS, NT_Visibility, "default");
       Assignable_sliceStep_Assignable_OptionalExpression_Expression_OptionalExpression = $TF.constructor($TS, NT_Assignable, "sliceStep", NT_Assignable, "receiver", NT_OptionalExpression, "optFirst", NT_Expression, "second", NT_OptionalExpression, "optLast");
       Expression_subscript_Expression_iter_seps_Expression = $TF.constructor($TS, NT_Expression, "subscript", NT_Expression, "anonymoussubscript", $T59, "subscripts");
       BasicType_int_ = $TF.constructor($TS, NT_BasicType, "int");
       $T20 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Case")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       NT_KeywordArgument_1 = $parameterizedSort("KeywordArgument", new Type[] { $T1 }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Parameter, $RVF.string("T"), $RVF.constructor(RascalValueFactory.Symbol_Adt, $RVF.string("Tree"), $RVF.list()))));
       Parameters_varArgs_Formals_KeywordFormals = $TF.constructor($TS, NT_Parameters, "varArgs", NT_Formals, "formals", NT_KeywordFormals, "keywordFormals");
       $T41 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Pattern")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Pattern_list_iter_star_seps_Pattern = $TF.constructor($TS, NT_Pattern, "list", $T41, "elements0");
       BasicType_listRelation_ = $TF.constructor($TS, NT_BasicType, "listRelation");
       Expression_negation_Expression = $TF.constructor($TS, NT_Expression, "negation", NT_Expression, "argument");
       $T2 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Statement")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Expression_closure_Type_Parameters_iter_seps_Statement = $TF.constructor($TS, NT_Expression, "closure", NT_Type, "type", NT_Parameters, "parameters", $T2, "statements");
       Statement_append_DataTarget_Statement = $TF.constructor($TS, NT_Statement, "append", NT_DataTarget, "dataTarget", NT_Statement, "statement");
       $T36 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Pattern")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Assignable_annotation_Assignable_Name = $TF.constructor($TS, NT_Assignable, "annotation", NT_Assignable, "receiver", NT_Name, "annotation");
       Assignable_bracket_Assignable = $TF.constructor($TS, NT_Assignable, "bracket", NT_Assignable, "arg");
       Expression_ifDefinedOtherwise_Expression_Expression = $TF.constructor($TS, NT_Expression, "ifDefinedOtherwise", NT_Expression, "lhs", NT_Expression, "rhs");
       Expression_list_iter_star_seps_Expression = $TF.constructor($TS, NT_Expression, "list", $T49, "elements0");
       Expression_asType_Type_Expression = $TF.constructor($TS, NT_Expression, "asType", NT_Type, "type", NT_Expression, "argument");
       Target_labeled_Name = $TF.constructor($TS, NT_Target, "labeled", NT_Name, "anonymouslabeled");
       StringMiddle_interpolated_MidStringChars_Expression_StringMiddle = $TF.constructor($TS, NT_StringMiddle, "interpolated", NT_MidStringChars, "mid", NT_Expression, "expression", NT_StringMiddle, "tail");
       Assignable_constructor_Name_iter_seps_Assignable = $TF.constructor($TS, NT_Assignable, "constructor", NT_Name, "name", $T65, "arguments");
       Statement_visit_Label_Visit = $TF.constructor($TS, NT_Statement, "visit", NT_Label, "label", NT_Visit, "visit");
       Declaration_function_FunctionDeclaration = $TF.constructor($TS, NT_Declaration, "function", NT_FunctionDeclaration, "anonymousfunction");
       $T64 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Type")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Signature_withThrows_FunctionModifiers_Type_Name_Parameters_iter_seps_Type = $TF.constructor($TS, NT_Signature, "withThrows", NT_FunctionModifiers, "modifiers", NT_Type, "type", NT_Name, "name", NT_Parameters, "parameters", $T64, "exceptions");
       Prod_unlabeled_iter_star_seps_ProdModifier_iter_star_seps_Sym = $TF.constructor($TS, NT_Prod, "unlabeled", $T54, "modifiers", $T55, "syms");
       DataTypeSelector_selector_QualifiedName_Name = $TF.constructor($TS, NT_DataTypeSelector, "selector", NT_QualifiedName, "sort", NT_Name, "production");
       ConcretePart_newline_ = $TF.constructor($TS, NT_ConcretePart, "newline");
       Literal_rational_RationalLiteral = $TF.constructor($TS, NT_Literal, "rational", NT_RationalLiteral, "anonymousrational");
       StringMiddle_mid_MidStringChars = $TF.constructor($TS, NT_StringMiddle, "mid", NT_MidStringChars, "anonymousmid");
       Field_name_Name = $TF.constructor($TS, NT_Field, "name", NT_Name, "anonymousname");
       ShellCommand_listDeclarations_OptionalTerminator = $TF.constructor($TS, NT_ShellCommand, "listDeclarations", NT_OptionalTerminator, "terminator");
       $T7 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("QualifiedName")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Type_structured_StructuredType = $TF.constructor($TS, NT_Type, "structured", NT_StructuredType, "anonymousstructured");
       Pattern_literal_Literal = $TF.constructor($TS, NT_Pattern, "literal", NT_Literal, "anonymousliteral");
       ProtocolPart_nonInterpolated_ProtocolChars = $TF.constructor($TS, NT_ProtocolPart, "nonInterpolated", NT_ProtocolChars, "anonymousnonInterpolated");
       Expression_intersection_Expression_Expression = $TF.constructor($TS, NT_Expression, "intersection", NT_Expression, "lhs", NT_Expression, "rhs");
       Declaration_alias_Tags_Visibility_UserType_Type = $TF.constructor($TS, NT_Declaration, "alias", NT_Tags, "tags", NT_Visibility, "visibility", NT_UserType, "user", NT_Type, "base");
       Sym_literal_StringConstant = $TF.constructor($TS, NT_Sym, "literal", NT_StringConstant, "anonymousliteral");
       Class_complement_Class = $TF.constructor($TS, NT_Class, "complement", NT_Class, "charClass");
       Statement_for_Label_iter_seps_Expression_Statement = $TF.constructor($TS, NT_Statement, "for", NT_Label, "label", $T6, "generators", NT_Statement, "body");
       $T39 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string("::")));
       $T40 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Lex, $RVF.string("Name")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string("::")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Expression_splice_Expression = $TF.constructor($TS, NT_Expression, "splice", NT_Expression, "argument");
       $T23 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Statement")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Pattern_reifiedType_Pattern_Pattern = $TF.constructor($TS, NT_Pattern, "reifiedType", NT_Pattern, "symbol", NT_Pattern, "definitions");
       Replacement_unconditional_Expression = $TF.constructor($TS, NT_Replacement, "unconditional", NT_Expression, "anonymousunconditional");
       $T4 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("KeywordArgument")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       OptionalTerminator_absent_ = $TF.constructor($TS, NT_OptionalTerminator, "absent");
       Start_present_ = $TF.constructor($TS, NT_Start, "present");
       BasicType_value_ = $TF.constructor($TS, NT_BasicType, "value");
       Statement_functionDeclaration_FunctionDeclaration = $TF.constructor($TS, NT_Statement, "functionDeclaration", NT_FunctionDeclaration, "anonymousfunctionDeclaration");
       BasicType_string_ = $TF.constructor($TS, NT_BasicType, "string");
       Expression_it_ = $TF.constructor($TS, NT_Expression, "it");
       $T24 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Field")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Statement_variableDeclaration_LocalVariableDeclaration = $TF.constructor($TS, NT_Statement, "variableDeclaration", NT_LocalVariableDeclaration, "declaration");
       StringCharacter_esc_ = $TF.constructor($TS, NT_StringCharacter, "esc");
       BasicType_dateTime_ = $TF.constructor($TS, NT_BasicType, "dateTime");
       Prod_associativityGroup_Assoc_Prod = $TF.constructor($TS, NT_Prod, "associativityGroup", NT_Assoc, "associativity", NT_Prod, "group");
       Signature_noThrows_FunctionModifiers_Type_Name_Parameters = $TF.constructor($TS, NT_Signature, "noThrows", NT_FunctionModifiers, "modifiers", NT_Type, "type", NT_Name, "name", NT_Parameters, "parameters");
       Expression_has_Expression_Name = $TF.constructor($TS, NT_Expression, "has", NT_Expression, "expression", NT_Name, "name");
       NT_Mapping_Pattern = $parameterizedSort("Mapping", new Type[] { ADT_Pattern }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Pattern"))));
       Pattern_qualifiedName_QualifiedName = $TF.constructor($TS, NT_Pattern, "qualifiedName", NT_QualifiedName, "anonymousqualifiedName");
       Sym_empty_ = $TF.constructor($TS, NT_Sym, "empty");
       $T31 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Statement")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Expression_lessThanOrEq_Expression_Expression = $TF.constructor($TS, NT_Expression, "lessThanOrEq", NT_Expression, "lhs", NT_Expression, "rhs");
       BasicType_num_ = $TF.constructor($TS, NT_BasicType, "num");
       Sym_iterSep_Sym_Sym = $TF.constructor($TS, NT_Sym, "iterSep", NT_Sym, "symbol", NT_Sym, "sep");
       Sym_labeled_Sym_NonterminalLabel = $TF.constructor($TS, NT_Sym, "labeled", NT_Sym, "symbol", NT_NonterminalLabel, "label");
       EvalCommand_declaration_Declaration = $TF.constructor($TS, NT_EvalCommand, "declaration", NT_Declaration, "anonymousdeclaration");
       Case_patternWithAction_PatternWithAction = $TF.constructor($TS, NT_Case, "patternWithAction", NT_PatternWithAction, "patternWithAction");
       Class_difference_Class_Class = $TF.constructor($TS, NT_Class, "difference", NT_Class, "lhs", NT_Class, "rhs");
       BasicType_map_ = $TF.constructor($TS, NT_BasicType, "map");
       NT_KeywordArguments_Pattern = $parameterizedSort("KeywordArguments", new Type[] { ADT_Pattern }, $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Pattern"))));
       Prod_all_Prod_Prod = $TF.constructor($TS, NT_Prod, "all", NT_Prod, "lhs", NT_Prod, "rhs");
       StringTail_post_PostStringChars = $TF.constructor($TS, NT_StringTail, "post", NT_PostStringChars, "anonymouspost");
       TypeArg_named_Type_Name = $TF.constructor($TS, NT_TypeArg, "named", NT_Type, "type", NT_Name, "name");
       Sym_start_Nonterminal = $TF.constructor($TS, NT_Sym, "start", NT_Nonterminal, "nonterminal");
       Case_default_Statement = $TF.constructor($TS, NT_Case, "default", NT_Statement, "statement");
       Header_default_Tags_QualifiedName_iter_star_seps_Import = $TF.constructor($TS, NT_Header, "default", NT_Tags, "tags", NT_QualifiedName, "name", $T30, "imports");
       Expression_ifThenElse_Expression_Expression_Expression = $TF.constructor($TS, NT_Expression, "ifThenElse", NT_Expression, "condition", NT_Expression, "thenExp", NT_Expression, "elseExp");
       Pattern_anti_Pattern = $TF.constructor($TS, NT_Pattern, "anti", NT_Pattern, "pattern");
       $T13 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Tag")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Statement_tryFinally_Statement_iter_seps_Catch_Statement = $TF.constructor($TS, NT_Statement, "tryFinally", NT_Statement, "body", $T32, "handlers", NT_Statement, "finallyBody");
       $T56 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Variant")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string("|")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Declaration_data_Tags_Visibility_UserType_CommonKeywordParameters_iter_seps_Variant = $TF.constructor($TS, NT_Declaration, "data", NT_Tags, "tags", NT_Visibility, "visibility", NT_UserType, "user", NT_CommonKeywordParameters, "commonKeywordParameters", $T56, "variants");
       Kind_data_ = $TF.constructor($TS, NT_Kind, "data");
       $T57 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("TypeVar")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       ModuleParameters_default_iter_seps_TypeVar = $TF.constructor($TS, NT_ModuleParameters, "default", $T57, "parameters");
       FunctionDeclaration_expression_Tags_Visibility_Signature_Expression = $TF.constructor($TS, NT_FunctionDeclaration, "expression", NT_Tags, "tags", NT_Visibility, "visibility", NT_Signature, "signature", NT_Expression, "expression");
       Declaration_dataAbstract_Tags_Visibility_UserType_CommonKeywordParameters = $TF.constructor($TS, NT_Declaration, "dataAbstract", NT_Tags, "tags", NT_Visibility, "visibility", NT_UserType, "user", NT_CommonKeywordParameters, "commonKeywordParameters");
       Renaming_default_Name_Name = $TF.constructor($TS, NT_Renaming, "default", NT_Name, "from", NT_Name, "to");
       BasicType_relation_ = $TF.constructor($TS, NT_BasicType, "relation");
       $T22 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Statement")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       StringTemplate_doWhile_iter_star_seps_Statement_StringMiddle_iter_star_seps_Statement_Expression = $TF.constructor($TS, NT_StringTemplate, "doWhile", $T22, "preStats", NT_StringMiddle, "body", $T23, "postStats", NT_Expression, "condition");
       FunctionBody_default_iter_star_seps_Statement = $TF.constructor($TS, NT_FunctionBody, "default", $T58, "statements");
       Target_empty_ = $TF.constructor($TS, NT_Target, "empty");
       Expression_setAnnotation_Expression_Name_Expression = $TF.constructor($TS, NT_Expression, "setAnnotation", NT_Expression, "expression", NT_Name, "name", NT_Expression, "value");
       Assignment_default_ = $TF.constructor($TS, NT_Assignment, "default");
       DateTimeLiteral_timeLiteral_JustTime = $TF.constructor($TS, NT_DateTimeLiteral, "timeLiteral", NT_JustTime, "anonymoustimeLiteral");
       Expression_getAnnotation_Expression_Name = $TF.constructor($TS, NT_Expression, "getAnnotation", NT_Expression, "anonymousgetAnnotation", NT_Name, "name");
       TypeArg_default_Type = $TF.constructor($TS, NT_TypeArg, "default", NT_Type, "anonymousdefault");
       Bound_default_Expression = $TF.constructor($TS, NT_Bound, "default", NT_Expression, "expression");
       ConcretePart_bs_ = $TF.constructor($TS, NT_ConcretePart, "bs");
       BasicType_node_ = $TF.constructor($TS, NT_BasicType, "node");
       Expression_lessThan_Expression_Expression = $TF.constructor($TS, NT_Expression, "lessThan", NT_Expression, "lhs", NT_Expression, "rhs");
       Expression_in_Expression_Expression = $TF.constructor($TS, NT_Expression, "in", NT_Expression, "lhs", NT_Expression, "rhs");
       Variable_unInitialized_Name = $TF.constructor($TS, NT_Variable, "unInitialized", NT_Name, "anonymousunInitialized");
       ModuleActuals_default_iter_seps_Type = $TF.constructor($TS, NT_ModuleActuals, "default", $T18, "types");
       $T19 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("KeywordFormal")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       KeywordFormals_default_OptionalComma_iter_seps_KeywordFormal = $TF.constructor($TS, NT_KeywordFormals, "default", NT_OptionalComma, "optionalComma", $T19, "anonymousdefault");
       Expression_any_iter_seps_Expression = $TF.constructor($TS, NT_Expression, "any", $T6, "generators");
       $T26 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("KeywordFormal")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       BasicType_set_ = $TF.constructor($TS, NT_BasicType, "set");
       $T15 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Statement")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       StringTemplate_ifThenElse_iter_seps_Expression_iter_star_seps_Statement_StringMiddle_iter_star_seps_Statement_iter_star_seps_Statement_StringMiddle_iter_star_seps_Statement = $TF.constructor($TS, NT_StringTemplate, "ifThenElse", $T9, "conditions", $T14, "preStatsThen", NT_StringMiddle, "thenString", $T15, "postStatsThen", $T16, "preStatsElse", NT_StringMiddle, "elseString", $T17, "postStatsElse");
       Assignable_fieldAccess_Assignable_Name = $TF.constructor($TS, NT_Assignable, "fieldAccess", NT_Assignable, "receiver", NT_Name, "field");
       ConcretePart_hole_ConcreteHole = $TF.constructor($TS, NT_ConcretePart, "hole", NT_ConcreteHole, "anonymoushole");
       Assoc_right_ = $TF.constructor($TS, NT_Assoc, "right");
       Assignment_subtraction_ = $TF.constructor($TS, NT_Assignment, "subtraction");
       Pattern_asType_Type_Pattern = $TF.constructor($TS, NT_Pattern, "asType", NT_Type, "type", NT_Pattern, "argument");
       Expression_bracket_Expression = $TF.constructor($TS, NT_Expression, "bracket", NT_Expression, "expression");
       ShellCommand_help_OptionalTerminator = $TF.constructor($TS, NT_ShellCommand, "help", NT_OptionalTerminator, "terminator");
       PathTail_post_PostPathChars = $TF.constructor($TS, NT_PathTail, "post", NT_PostPathChars, "anonymouspost");
       StringLiteral_nonInterpolated_StringConstant = $TF.constructor($TS, NT_StringLiteral, "nonInterpolated", NT_StringConstant, "anonymousnonInterpolated");
       ProdModifier_bracket_ = $TF.constructor($TS, NT_ProdModifier, "bracket");
       Catch_default_Statement = $TF.constructor($TS, NT_Catch, "default", NT_Statement, "body");
       UserType_name_QualifiedName = $TF.constructor($TS, NT_UserType, "name", NT_QualifiedName, "anonymousname");
       Import_extend_ImportedModule = $TF.constructor($TS, NT_Import, "extend", NT_ImportedModule, "module");
       Tags_default_iter_star_seps_Tag = $TF.constructor($TS, NT_Tags, "default", $T13, "anonymousdefault");
       Bound_empty_ = $TF.constructor($TS, NT_Bound, "empty");
       Start_absent_ = $TF.constructor($TS, NT_Start, "absent");
       Statement_insert_DataTarget_Statement = $TF.constructor($TS, NT_Statement, "insert", NT_DataTarget, "dataTarget", NT_Statement, "statement");
       $T21 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Mapping")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Pattern_map_iter_star_seps_Mapping_Pattern = $TF.constructor($TS, NT_Pattern, "map", $T21, "mappings");
       IntegerLiteral_decimalIntegerLiteral_DecimalIntegerLiteral = $TF.constructor($TS, NT_IntegerLiteral, "decimalIntegerLiteral", NT_DecimalIntegerLiteral, "anonymousdecimalIntegerLiteral");
       Expression_transitiveClosure_Expression = $TF.constructor($TS, NT_Expression, "transitiveClosure", NT_Expression, "argument");
       Kind_variable_ = $TF.constructor($TS, NT_Kind, "variable");
       FunctionDeclaration_default_Tags_Visibility_Signature_FunctionBody = $TF.constructor($TS, NT_FunctionDeclaration, "default", NT_Tags, "tags", NT_Visibility, "visibility", NT_Signature, "signature", NT_FunctionBody, "body");
       Expression_fieldUpdate_Expression_Name_Expression = $TF.constructor($TS, NT_Expression, "fieldUpdate", NT_Expression, "expression", NT_Name, "key", NT_Expression, "replacement");
       Type_symbol_Sym = $TF.constructor($TS, NT_Type, "symbol", NT_Sym, "anonymoussymbol");
       Expression_match_Pattern_Expression = $TF.constructor($TS, NT_Expression, "match", NT_Pattern, "pattern", NT_Expression, "expression");
       Pattern_callOrTree_Pattern_iter_star_seps_Pattern_KeywordArguments_Pattern = $TF.constructor($TS, NT_Pattern, "callOrTree", NT_Pattern, "expression", $T25, "arguments", NT_KeywordArguments_Pattern, "keywordArguments");
       Statement_assert_Expression = $TF.constructor($TS, NT_Statement, "assert", NT_Expression, "expression");
       PatternWithAction_arbitrary_Pattern_Statement = $TF.constructor($TS, NT_PatternWithAction, "arbitrary", NT_Pattern, "pattern", NT_Statement, "statement");
       StringTemplate_while_Expression_iter_star_seps_Statement_StringMiddle_iter_star_seps_Statement = $TF.constructor($TS, NT_StringTemplate, "while", NT_Expression, "condition", $T22, "preStats", NT_StringMiddle, "body", $T23, "postStats");
       Prod_reference_Name = $TF.constructor($TS, NT_Prod, "reference", NT_Name, "referenced");
       ProdModifier_tag_Tag = $TF.constructor($TS, NT_ProdModifier, "tag", NT_Tag, "anonymoustag");
       Output_stderrOutput_ = $TF.constructor($TS, NT_Output, "stderrOutput");
       Statement_assignment_Assignable_Assignment_Statement = $TF.constructor($TS, NT_Statement, "assignment", NT_Assignable, "assignable", NT_Assignment, "operator", NT_Statement, "statement");
       Statement_while_Label_iter_seps_Expression_Statement = $TF.constructor($TS, NT_Statement, "while", NT_Label, "label", $T9, "conditions", NT_Statement, "body");
       Expression_remainder_Expression_Expression = $TF.constructor($TS, NT_Expression, "remainder", NT_Expression, "lhs", NT_Expression, "rhs");
       Visit_givenStrategy_Strategy_Expression_iter_seps_Case = $TF.constructor($TS, NT_Visit, "givenStrategy", NT_Strategy, "strategy", NT_Expression, "subject", $T20, "cases");
       ConcretePart_bq_ = $TF.constructor($TS, NT_ConcretePart, "bq");
       Command_declaration_Declaration = $TF.constructor($TS, NT_Command, "declaration", NT_Declaration, "anonymousdeclaration");
       Expression_fieldProject_Expression_iter_seps_Field = $TF.constructor($TS, NT_Expression, "fieldProject", NT_Expression, "anonymousfieldProject", $T24, "fields");
       Range_character_Char = $TF.constructor($TS, NT_Range, "character", NT_Char, "anonymouscharacter");
       Statement_switch_Label_Expression_iter_seps_Case = $TF.constructor($TS, NT_Statement, "switch", NT_Label, "label", NT_Expression, "expression", $T20, "cases");
       Strategy_topDownBreak_ = $TF.constructor($TS, NT_Strategy, "topDownBreak");
       LocalVariableDeclaration_default_Declarator = $TF.constructor($TS, NT_LocalVariableDeclaration, "default", NT_Declarator, "anonymousdefault");
       Module_default_Header_Body = $TF.constructor($TS, NT_Module, "default", NT_Header, "header", NT_Body, "body");
       LocalVariableDeclaration_dynamic_Declarator = $TF.constructor($TS, NT_LocalVariableDeclaration, "dynamic", NT_Declarator, "declarator");
       Sym_endOfLine_Sym = $TF.constructor($TS, NT_Sym, "endOfLine", NT_Sym, "symbol");
       LocationLiteral_default_ProtocolPart_PathPart = $TF.constructor($TS, NT_LocationLiteral, "default", NT_ProtocolPart, "protocolPart", NT_PathPart, "pathPart");
       BasicType_rational_ = $TF.constructor($TS, NT_BasicType, "rational");
       $T33 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("EvalCommand")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Class_union_Class_Class = $TF.constructor($TS, NT_Class, "union", NT_Class, "lhs", NT_Class, "rhs");
       ConcretePart_lt_ = $TF.constructor($TS, NT_ConcretePart, "lt");
       Statement_globalDirective_Type_iter_seps_QualifiedName = $TF.constructor($TS, NT_Statement, "globalDirective", NT_Type, "type", $T7, "names");
       ShellCommand_undeclare_opt_QualifiedName_OptionalTerminator = $TF.constructor($TS, NT_ShellCommand, "undeclare", $T8, "optName", NT_OptionalTerminator, "terminator");
       Type_function_FunctionType = $TF.constructor($TS, NT_Type, "function", NT_FunctionType, "anonymousfunction");
       $T10 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Mapping")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       KeywordArguments_1_default_OptionalComma_iter_seps_KeywordArgument_1 = $TF.constructor($TS, NT_KeywordArguments_1, "default", NT_OptionalComma, "optionalComma", $T4, "anonymousdefault");
       ShellCommand_setOptionTrue_QualifiedName_OptionalTerminator = $TF.constructor($TS, NT_ShellCommand, "setOptionTrue", NT_QualifiedName, "name", NT_OptionalTerminator, "terminator");
       Tag_default_Name_TagString = $TF.constructor($TS, NT_Tag, "default", NT_Name, "name", NT_TagString, "contents");
       Literal_boolean_BooleanLiteral = $TF.constructor($TS, NT_Literal, "boolean", NT_BooleanLiteral, "anonymousboolean");
       Expression_nonEmptyBlock_iter_seps_Statement = $TF.constructor($TS, NT_Expression, "nonEmptyBlock", $T2, "statements");
       Expression_implication_Expression_Expression = $TF.constructor($TS, NT_Expression, "implication", NT_Expression, "lhs", NT_Expression, "rhs");
       FunctionModifier_test_ = $TF.constructor($TS, NT_FunctionModifier, "test");
       ShellCommand_clear_OptionalTerminator = $TF.constructor($TS, NT_ShellCommand, "clear", NT_OptionalTerminator, "terminator");
       Statement_nonEmptyBlock_Label_iter_seps_Statement = $TF.constructor($TS, NT_Statement, "nonEmptyBlock", NT_Label, "label", $T2, "statements");
       Strategy_outermost_ = $TF.constructor($TS, NT_Strategy, "outermost");
       Expression_slice_Expression_OptionalExpression_OptionalExpression = $TF.constructor($TS, NT_Expression, "slice", NT_Expression, "anonymousslice", NT_OptionalExpression, "optFirst", NT_OptionalExpression, "optLast");
       Statement_assertWithMessage_Expression_Expression = $TF.constructor($TS, NT_Statement, "assertWithMessage", NT_Expression, "expression", NT_Expression, "message");
       Command_expression_Expression = $TF.constructor($TS, NT_Command, "expression", NT_Expression, "anonymousexpression");
       Expression_greaterThan_Expression_Expression = $TF.constructor($TS, NT_Expression, "greaterThan", NT_Expression, "lhs", NT_Expression, "rhs");
       Comprehension_list_iter_seps_Expression_iter_seps_Expression = $TF.constructor($TS, NT_Comprehension, "list", $T5, "results", $T6, "generators");
       EvalCommand_output_Output = $TF.constructor($TS, NT_EvalCommand, "output", NT_Output, "anonymousoutput");
       SyntaxDefinition_lexical_Sym_Prod = $TF.constructor($TS, NT_SyntaxDefinition, "lexical", NT_Sym, "defined", NT_Prod, "production");
       Literal_dateTime_DateTimeLiteral = $TF.constructor($TS, NT_Literal, "dateTime", NT_DateTimeLiteral, "anonymousdateTime");
       Sym_alternative_Sym_iter_seps_Sym = $TF.constructor($TS, NT_Sym, "alternative", NT_Sym, "first", $T12, "alternatives");
       Toplevel_givenVisibility_Declaration = $TF.constructor($TS, NT_Toplevel, "givenVisibility", NT_Declaration, "anonymousgivenVisibility");
       Assignment_intersection_ = $TF.constructor($TS, NT_Assignment, "intersection");
       Expression_addition_Expression_Expression = $TF.constructor($TS, NT_Expression, "addition", NT_Expression, "lhs", NT_Expression, "rhs");
       Visibility_public_ = $TF.constructor($TS, NT_Visibility, "public");
       Expression_all_iter_seps_Expression = $TF.constructor($TS, NT_Expression, "all", $T6, "generators");
       ConcreteHole_one_Sym_Name = $TF.constructor($TS, NT_ConcreteHole, "one", NT_Sym, "symbol", NT_Name, "name");
       Tag_empty_Name = $TF.constructor($TS, NT_Tag, "empty", NT_Name, "name");
       Parameters_default_Formals_KeywordFormals = $TF.constructor($TS, NT_Parameters, "default", NT_Formals, "formals", NT_KeywordFormals, "keywordFormals");
       Sym_follow_Sym_Sym = $TF.constructor($TS, NT_Sym, "follow", NT_Sym, "symbol", NT_Sym, "match");
       Expression_product_Expression_Expression = $TF.constructor($TS, NT_Expression, "product", NT_Expression, "lhs", NT_Expression, "rhs");
       CommonKeywordParameters_absent_ = $TF.constructor($TS, NT_CommonKeywordParameters, "absent");
       EvalCommand_statement_Statement = $TF.constructor($TS, NT_EvalCommand, "statement", NT_Statement, "anonymousstatement");
       Range_fromTo_Char_Char = $TF.constructor($TS, NT_Range, "fromTo", NT_Char, "start", NT_Char, "end");
       Label_default_Name = $TF.constructor($TS, NT_Label, "default", NT_Name, "name");
       Statement_ifThen_Label_iter_seps_Expression_Statement = $TF.constructor($TS, NT_Statement, "ifThen", NT_Label, "label", $T9, "conditions", NT_Statement, "thenStatement");
       Sym_unequal_Sym_Sym = $TF.constructor($TS, NT_Sym, "unequal", NT_Sym, "symbol", NT_Sym, "match");
       Mapping_1_default_ = $TF.constructor($TS, NT_Mapping_1, "default");
       Statement_break_Target = $TF.constructor($TS, NT_Statement, "break", NT_Target, "target");
       ImportedModule_actuals_QualifiedName_ModuleActuals = $TF.constructor($TS, NT_ImportedModule, "actuals", NT_QualifiedName, "name", NT_ModuleActuals, "actuals");
       Expression_fieldAccess_Expression_Name = $TF.constructor($TS, NT_Expression, "fieldAccess", NT_Expression, "expression", NT_Name, "field");
       Assignable_slice_Assignable_OptionalExpression_OptionalExpression = $TF.constructor($TS, NT_Assignable, "slice", NT_Assignable, "receiver", NT_OptionalExpression, "optFirst", NT_OptionalExpression, "optLast");
       Sym_notPrecede_Sym_Sym = $TF.constructor($TS, NT_Sym, "notPrecede", NT_Sym, "match", NT_Sym, "symbol");
       Catch_binding_Pattern_Statement = $TF.constructor($TS, NT_Catch, "binding", NT_Pattern, "pattern", NT_Statement, "body");
       Expression_map_iter_star_seps_Mapping_Expression = $TF.constructor($TS, NT_Expression, "map", $T10, "mappings");
       ProdModifier_associativity_Assoc = $TF.constructor($TS, NT_ProdModifier, "associativity", NT_Assoc, "anonymousassociativity");
       Assoc_associative_ = $TF.constructor($TS, NT_Assoc, "associative");
       PathPart_nonInterpolated_PathChars = $TF.constructor($TS, NT_PathPart, "nonInterpolated", NT_PathChars, "anonymousnonInterpolated");
       ConcretePart_text_str = $TF.constructor($TS, NT_ConcretePart, "text", $T35, "anonymoustext");
       Expression_range_Expression_Expression = $TF.constructor($TS, NT_Expression, "range", NT_Expression, "first", NT_Expression, "last");
       Sym_startOfLine_Sym = $TF.constructor($TS, NT_Sym, "startOfLine", NT_Sym, "symbol");
       Sym_notFollow_Sym_Sym = $TF.constructor($TS, NT_Sym, "notFollow", NT_Sym, "symbol", NT_Sym, "match");
       DataTarget_empty_ = $TF.constructor($TS, NT_DataTarget, "empty");
       Assignable_subscript_Assignable_Expression = $TF.constructor($TS, NT_Assignable, "subscript", NT_Assignable, "receiver", NT_Expression, "subscript");
       Assignment_append_ = $TF.constructor($TS, NT_Assignment, "append");
       Expression_division_Expression_Expression = $TF.constructor($TS, NT_Expression, "division", NT_Expression, "lhs", NT_Expression, "rhs");
       KeywordFormals_none_ = $TF.constructor($TS, NT_KeywordFormals, "none");
       OptionalEqualSign_present_ = $TF.constructor($TS, NT_OptionalEqualSign, "present");
       Pattern_concrete_Concrete = $TF.constructor($TS, NT_Pattern, "concrete", NT_Concrete, "anonymousconcrete");
       Formals_default_iter_star_seps_Pattern = $TF.constructor($TS, NT_Formals, "default", $T36, "anonymousdefault");
       $T34 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Sym")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Sym_sequence_Sym_iter_seps_Sym = $TF.constructor($TS, NT_Sym, "sequence", NT_Sym, "first", $T34, "sequence");
       DateTimeLiteral_dateLiteral_JustDate = $TF.constructor($TS, NT_DateTimeLiteral, "dateLiteral", NT_JustDate, "anonymousdateLiteral");
       $T27 = $RTF.nonTerminalType($RVF.constructor(RascalValueFactory.Symbol_IterStarSeps, $RVF.constructor(RascalValueFactory.Symbol_Sort, $RVF.string("Expression")), $RVF.list($RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")), $RVF.constructor(RascalValueFactory.Symbol_Lit, $RVF.string(",")), $RVF.constructor(RascalValueFactory.Symbol_Layouts, $RVF.string("LAYOUTLIST")))));
       Expression_enumerator_Pattern_Expression = $TF.constructor($TS, NT_Expression, "enumerator", NT_Pattern, "pattern", NT_Expression, "expression");
       FunctionDeclaration_abstract_Tags_Visibility_Signature = $TF.constructor($TS, NT_FunctionDeclaration, "abstract", NT_Tags, "tags", NT_Visibility, "visibility", NT_Signature, "signature");
       Kind_anno_ = $TF.constructor($TS, NT_Kind, "anno");
       Expression_noMatch_Pattern_Expression = $TF.constructor($TS, NT_Expression, "noMatch", NT_Pattern, "pattern", NT_Expression, "expression");
       Literal_location_LocationLiteral = $TF.constructor($TS, NT_Literal, "location", NT_LocationLiteral, "anonymouslocation");
       OptionalExpression_expression_Expression = $TF.constructor($TS, NT_OptionalExpression, "expression", NT_Expression, "anonymousexpression");
       BasicType_bool_ = $TF.constructor($TS, NT_BasicType, "bool");
       Assignment_product_ = $TF.constructor($TS, NT_Assignment, "product");
       Expression_appendAfter_Expression_Expression = $TF.constructor($TS, NT_Expression, "appendAfter", NT_Expression, "lhs", NT_Expression, "rhs");
       Sym_except_Sym_NonterminalLabel = $TF.constructor($TS, NT_Sym, "except", NT_Sym, "symbol", NT_NonterminalLabel, "label");
       ShellCommand_history_OptionalTerminator = $TF.constructor($TS, NT_ShellCommand, "history", NT_OptionalTerminator, "terminator");
       ProtocolTail_mid_MidProtocolChars_Expression_ProtocolTail = $TF.constructor($TS, NT_ProtocolTail, "mid", NT_MidProtocolChars, "mid", NT_Expression, "expression", NT_ProtocolTail, "tail");
       DataTarget_labeled_Name = $TF.constructor($TS, NT_DataTarget, "labeled", NT_Name, "label");
       Pattern_set_iter_star_seps_Pattern = $TF.constructor($TS, NT_Pattern, "set", $T41, "elements0");
       FunctionModifier_java_ = $TF.constructor($TS, NT_FunctionModifier, "java");
       Concrete_typed_str_Sym_str_str_str = $TF.constructor($TS, NT_Concrete, "typed", $T42, "l1", NT_Sym, "symbol", $T43, "l2", $T44, "l3", $T45, "parts");
       PathPart_interpolated_PrePathChars_Expression_PathTail = $TF.constructor($TS, NT_PathPart, "interpolated", NT_PrePathChars, "pre", NT_Expression, "expression", NT_PathTail, "tail");
       Expression_comprehension_Comprehension = $TF.constructor($TS, NT_Expression, "comprehension", NT_Comprehension, "anonymouscomprehension");
       OptionalTerminator_present_ = $TF.constructor($TS, NT_OptionalTerminator, "present");
       QualifiedName_default_iter_seps_Name = $TF.constructor($TS, NT_QualifiedName, "default", $T40, "anonymousdefault");
       Expression_subtraction_Expression_Expression = $TF.constructor($TS, NT_Expression, "subtraction", NT_Expression, "lhs", NT_Expression, "rhs");
       Prod_first_Prod_Prod = $TF.constructor($TS, NT_Prod, "first", NT_Prod, "lhs", NT_Prod, "rhs");
       StringCharacter_anychar_ = $TF.constructor($TS, NT_StringCharacter, "anychar");
       Statement_emptyStatement_ = $TF.constructor($TS, NT_Statement, "emptyStatement");
       KeywordArgument_1_default_Name = $TF.constructor($TS, NT_KeywordArgument_1, "default", NT_Name, "name");
       ShellCommand_edit_QualifiedName_OptionalTerminator = $TF.constructor($TS, NT_ShellCommand, "edit", NT_QualifiedName, "name", NT_OptionalTerminator, "terminator");
       Literal_string_StringLiteral = $TF.constructor($TS, NT_Literal, "string", NT_StringLiteral, "anonymousstring");
       Variant_nAryConstructor_Name_iter_star_seps_TypeArg_KeywordFormals = $TF.constructor($TS, NT_Variant, "nAryConstructor", NT_Name, "name", $T37, "arguments", NT_KeywordFormals, "keywordArguments");
       BasicType_loc_ = $TF.constructor($TS, NT_BasicType, "loc");
       Expression_notIn_Expression_Expression = $TF.constructor($TS, NT_Expression, "notIn", NT_Expression, "lhs", NT_Expression, "rhs");
       StringCharacter_unicode_str = $TF.constructor($TS, NT_StringCharacter, "unicode", $T38, "anonymousunicode");
       TypeVar_bounded_Name_Type = $TF.constructor($TS, NT_TypeVar, "bounded", NT_Name, "name", NT_Type, "bound");
       Expression_insertBefore_Expression_Expression = $TF.constructor($TS, NT_Expression, "insertBefore", NT_Expression, "lhs", NT_Expression, "rhs");
       Pattern_typedVariable_Type_Name = $TF.constructor($TS, NT_Pattern, "typedVariable", NT_Type, "type", NT_Name, "name");
       Header_parameters_Tags_QualifiedName_ModuleParameters_iter_star_seps_Import = $TF.constructor($TS, NT_Header, "parameters", NT_Tags, "tags", NT_QualifiedName, "name", NT_ModuleParameters, "params", $T30, "imports");
       StringTemplate_for_iter_seps_Expression_iter_star_seps_Statement_StringMiddle_iter_star_seps_Statement = $TF.constructor($TS, NT_StringTemplate, "for", $T6, "generators", $T22, "preStats", NT_StringMiddle, "body", $T23, "postStats");
       EvalCommand_import_Import = $TF.constructor($TS, NT_EvalCommand, "import", NT_Import, "anonymousimport");
       Command_shell_ShellCommand = $TF.constructor($TS, NT_Command, "shell", NT_ShellCommand, "command");
       Import_external_QualifiedName_LocationLiteral = $TF.constructor($TS, NT_Import, "external", NT_QualifiedName, "name", NT_LocationLiteral, "at");
       Statement_try_Statement_iter_seps_Catch = $TF.constructor($TS, NT_Statement, "try", NT_Statement, "body", $T32, "handlers");
       Expression_isDefined_Expression = $TF.constructor($TS, NT_Expression, "isDefined", NT_Expression, "argument");
       Field_index_IntegerLiteral = $TF.constructor($TS, NT_Field, "index", NT_IntegerLiteral, "anonymousindex");
       UnicodeEscape_utf16_ = $TF.constructor($TS, NT_UnicodeEscape, "utf16");
       Expression_callOrTree_Expression_iter_star_seps_Expression_KeywordArguments_Expression = $TF.constructor($TS, NT_Expression, "callOrTree", NT_Expression, "expression", $T27, "arguments", NT_KeywordArguments_Expression, "keywordArguments");
       Expression_is_Expression_Name = $TF.constructor($TS, NT_Expression, "is", NT_Expression, "expression", NT_Name, "name");
       Statement_fail_Target = $TF.constructor($TS, NT_Statement, "fail", NT_Target, "target");
       CommonKeywordParameters_present_iter_seps_KeywordFormal = $TF.constructor($TS, NT_CommonKeywordParameters, "present", $T26, "keywordFormalList");
       Expression_or_Expression_Expression = $TF.constructor($TS, NT_Expression, "or", NT_Expression, "lhs", NT_Expression, "rhs");
       Kind_tag_ = $TF.constructor($TS, NT_Kind, "tag");
       Pattern_tuple_iter_seps_Pattern = $TF.constructor($TS, NT_Pattern, "tuple", $T29, "elements");
       Expression_voidClosure_Parameters_iter_star_seps_Statement = $TF.constructor($TS, NT_Expression, "voidClosure", NT_Parameters, "parameters", $T31, "statements0");
       Sym_parameter_Nonterminal = $TF.constructor($TS, NT_Sym, "parameter", NT_Nonterminal, "nonterminal");
       Replacement_conditional_Expression_iter_seps_Expression = $TF.constructor($TS, NT_Replacement, "conditional", NT_Expression, "replacementExpression", $T9, "conditions");
       TypeVar_free_Name = $TF.constructor($TS, NT_TypeVar, "free", NT_Name, "name");
       Declarator_default_Type_iter_seps_Variable = $TF.constructor($TS, NT_Declarator, "default", NT_Type, "type", $T28, "variables");
       Strategy_bottomUp_ = $TF.constructor($TS, NT_Strategy, "bottomUp");
       Declaration_tag_Tags_Visibility_Kind_Name_iter_seps_Type = $TF.constructor($TS, NT_Declaration, "tag", NT_Tags, "tags", NT_Visibility, "visibility", NT_Kind, "kind", NT_Name, "name", $T18, "types");
       Sym_precede_Sym_Sym = $TF.constructor($TS, NT_Sym, "precede", NT_Sym, "match", NT_Sym, "symbol");
       Expression_and_Expression_Expression = $TF.constructor($TS, NT_Expression, "and", NT_Expression, "lhs", NT_Expression, "rhs");
       Pattern_variableBecomes_Name_Pattern = $TF.constructor($TS, NT_Pattern, "variableBecomes", NT_Name, "name", NT_Pattern, "pattern");
       Kind_alias_ = $TF.constructor($TS, NT_Kind, "alias");
       Assignment_addition_ = $TF.constructor($TS, NT_Assignment, "addition");
       Assoc_nonAssociative_ = $TF.constructor($TS, NT_Assoc, "nonAssociative");
       ProtocolTail_post_PostProtocolChars = $TF.constructor($TS, NT_ProtocolTail, "post", NT_PostProtocolChars, "anonymouspost");
       ShellCommand_listModules_OptionalTerminator = $TF.constructor($TS, NT_ShellCommand, "listModules", NT_OptionalTerminator, "terminator");
       Expression_visit_Label_Visit = $TF.constructor($TS, NT_Expression, "visit", NT_Label, "label", NT_Visit, "visit");
       Sym_iter_Sym = $TF.constructor($TS, NT_Sym, "iter", NT_Sym, "symbol");
       SyntaxDefinition_language_Start_Sym_Prod = $TF.constructor($TS, NT_SyntaxDefinition, "language", NT_Start, "start", NT_Sym, "defined", NT_Prod, "production");
       Pattern_splicePlus_Pattern = $TF.constructor($TS, NT_Pattern, "splicePlus", NT_Pattern, "argument");
       Expression_negative_Expression = $TF.constructor($TS, NT_Expression, "negative", NT_Expression, "argument");
       StringTail_midInterpolated_MidStringChars_Expression_StringTail = $TF.constructor($TS, NT_StringTail, "midInterpolated", NT_MidStringChars, "mid", NT_Expression, "expression", NT_StringTail, "tail");
       OptionalComma_default_ = $TF.constructor($TS, NT_OptionalComma, "default");
       Expression_reifyType_Type = $TF.constructor($TS, NT_Expression, "reifyType", NT_Type, "anonymousreifyType");
       ImportedModule_default_QualifiedName = $TF.constructor($TS, NT_ImportedModule, "default", NT_QualifiedName, "anonymousdefault");
       StringTemplate_ifThen_iter_seps_Expression_iter_star_seps_Statement_StringMiddle_iter_star_seps_Statement = $TF.constructor($TS, NT_StringTemplate, "ifThen", $T9, "conditions", $T22, "preStats", NT_StringMiddle, "body", $T23, "postStats");
       Assignable_variable_QualifiedName = $TF.constructor($TS, NT_Assignable, "variable", NT_QualifiedName, "anonymousvariable");
       Import_syntax_SyntaxDefinition = $TF.constructor($TS, NT_Import, "syntax", NT_SyntaxDefinition, "anonymoussyntax");
       Pattern_descendant_Pattern = $TF.constructor($TS, NT_Pattern, "descendant", NT_Pattern, "pattern");
       StringLiteral_template_PreStringChars_StringTemplate_StringTail = $TF.constructor($TS, NT_StringLiteral, "template", NT_PreStringChars, "pre", NT_StringTemplate, "template", NT_StringTail, "tail");
       Commands_commandlist_iter_seps_EvalCommand = $TF.constructor($TS, NT_Commands, "commandlist", $T33, "anonymouscommandlist");
       Statement_throw_Statement = $TF.constructor($TS, NT_Statement, "throw", NT_Statement, "statement");
       Kind_view_ = $TF.constructor($TS, NT_Kind, "view");
       Visit_defaultStrategy_Expression_iter_seps_Case = $TF.constructor($TS, NT_Visit, "defaultStrategy", NT_Expression, "subject", $T20, "cases");
       Statement_continue_Target = $TF.constructor($TS, NT_Statement, "continue", NT_Target, "target");
       Tag_expression_Name_Expression = $TF.constructor($TS, NT_Tag, "expression", NT_Name, "name", NT_Expression, "anonymousexpression");
       ADT_KeywordArguments_1 = $TF.abstractDataType($TS, "KeywordArguments", new Type[] { $T1 });
       ADT_Mapping_Expression = $TF.abstractDataType($TS, "Mapping", new Type[] { ADT_Expression });
       ADT_Mapping_1 = $TF.abstractDataType($TS, "Mapping", new Type[] { $T1 });
       ADT_KeywordArguments_Expression = $TF.abstractDataType($TS, "KeywordArguments", new Type[] { ADT_Expression });
       ADT_KeywordArgument_1 = $TF.abstractDataType($TS, "KeywordArgument", new Type[] { $T1 });
       ADT_Mapping_Pattern = $TF.abstractDataType($TS, "Mapping", new Type[] { ADT_Pattern });
       ADT_KeywordArguments_Pattern = $TF.abstractDataType($TS, "KeywordArguments", new Type[] { ADT_Pattern });
    
       
       
    }
    
    
    public static void main(String[] args) {
      throw new RuntimeException("No function `main` found in Rascal module `lang::rascal::syntax::Rascal`");
    }
}