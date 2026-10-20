package rascal;
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
public class $ParseTree 
    extends
        org.rascalmpl.runtime.$RascalModule
    implements 
    	rascal.$Message_$I,
    	rascal.$ParseTree_$I,
    	rascal.$Type_$I,
    	rascal.$List_$I {

    private final $ParseTree_$I $me;
    private final IList $constants;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_parse$6f6b93176be80747;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_parse$66e93821e413f32f;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_parse$47fb5ed5d88ced9a;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_parser$6ca25a388c8ab884;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_firstAmbiguityFinder$ce3bf029110f9986;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_parsers$a57d129a731dc0ad;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_firstAmbiguityFinders$0d5a93ee0e899388;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_loadParsers$d8c91830dd2332d3;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_loadParser$a512631cb177aade;

    
    public final rascal.$Set M_Set;
    public final rascal.$IO M_IO;
    public final rascal.$Message M_Message;
    public final rascal.$Exception M_Exception;
    public final rascal.$Type M_Type;
    public final rascal.analysis.diff.edits.$FileSystemChanges M_analysis_diff_edits_FileSystemChanges;
    public final rascal.$Node M_Node;
    public final rascal.$Map M_Map;
    public final rascal.$List M_List;

    
    final org.rascalmpl.library.Prelude $Prelude; // TODO: asBaseClassName will generate name collisions if there are more of the same name in different packages

    
    public final io.usethesource.vallang.type.Type $T24;	/*aint(alabel="cycleLength")*/
    public final io.usethesource.vallang.type.Type $T2;	/*avalue()*/
    public final io.usethesource.vallang.type.Type $T11;	/*aparameter("U",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type $T38;	/*astr(alabel="string")*/
    public final io.usethesource.vallang.type.Type $T41;	/*aint(alabel="begin")*/
    public final io.usethesource.vallang.type.Type $T26;	/*aint(alabel="column")*/
    public final io.usethesource.vallang.type.Type $T5;	/*aparameter("T",avalue(),closed=false,alabel="h")*/
    public final io.usethesource.vallang.type.Type $T37;	/*astr(alabel="label")*/
    public final io.usethesource.vallang.type.Type $T20;	/*avoid()*/
    public final io.usethesource.vallang.type.Type $T32;	/*astr(alabel="name")*/
    public final io.usethesource.vallang.type.Type $T25;	/*astr(alabel="cons")*/
    public final io.usethesource.vallang.type.Type $T39;	/*aloc(alabel="src")*/
    public final io.usethesource.vallang.type.Type $T3;	/*aparameter("T",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type $T46;	/*avalue(alabel="input")*/
    public final io.usethesource.vallang.type.Type $T42;	/*aint(alabel="end")*/
    public final io.usethesource.vallang.type.Type $T40;	/*aint(alabel="character")*/
    public final io.usethesource.vallang.type.Type $T36;	/*aint(alabel="dot")*/
    public final io.usethesource.vallang.type.Type $T17;	/*astr()*/
    public final io.usethesource.vallang.type.Type $T47;	/*aloc(alabel="origin")*/
    public final io.usethesource.vallang.type.Type $T53;	/*aint()*/
    public final io.usethesource.vallang.type.Type $T45;	/*aparameter("T",avalue(),closed=true)*/
    public final io.usethesource.vallang.type.Type $T9;	/*aparameter("T",avalue(),closed=false,alabel="f")*/
    public final io.usethesource.vallang.type.Type $T49;	/*aparameter("U",avalue(),closed=true)*/
    public final io.usethesource.vallang.type.Type $T12;	/*aloc()*/
    public final io.usethesource.vallang.type.Type ADT_Symbol;	/*aadt("Symbol",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type Symbol_keywords_str;	/*acons(aadt("Symbol",[],dataSyntax()),[astr(alabel="name")],[],alabel="keywords")*/
    public final io.usethesource.vallang.type.Type ADT_Tree;	/*aadt("Tree",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type Tree_cycle_Symbol_int;	/*acons(aadt("Tree",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="symbol"),aint(alabel="cycleLength")],[],alabel="cycle")*/
    public final io.usethesource.vallang.type.Type $T16;	/*aparameter("T",aadt("Tree",[],dataSyntax()),closed=false)*/
    public final io.usethesource.vallang.type.Type $T15;	/*areified(aparameter("T",aadt("Tree",[],dataSyntax()),closed=false))*/
    public final io.usethesource.vallang.type.Type $T34;	/*alist(aadt("Symbol",[],dataSyntax()),alabel="separators")*/
    public final io.usethesource.vallang.type.Type Symbol_iter_star_seps_Symbol_list_Symbol;	/*acons(aadt("Symbol",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="symbol"),alist(aadt("Symbol",[],dataSyntax()),alabel="separators")],[],alabel="iter-star-seps")*/
    public final io.usethesource.vallang.type.Type $T0;	/*areified(aadt("Tree",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type ADT_Condition;	/*aadt("Condition",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TreeSearchResult_Tree;	/*aadt("TreeSearchResult",[aadt("Tree",[],dataSyntax())],dataSyntax())*/
    public final io.usethesource.vallang.type.Type TreeSearchResult_Tree_treeFound_Tree;	/*acons(aadt("TreeSearchResult",[aadt("Tree",[],dataSyntax())],dataSyntax()),[aadt("Tree",[],dataSyntax(),alabel="tree")],[],alabel="treeFound")*/
    public final io.usethesource.vallang.type.Type $T8;	/*alist(aparameter("T",avalue(),closed=false,alabel="f"))*/
    public final io.usethesource.vallang.type.Type Symbol_cilit_str;	/*acons(aadt("Symbol",[],dataSyntax()),[astr(alabel="string")],[],alabel="cilit")*/
    public final io.usethesource.vallang.type.Type $T50;	/*areified(aparameter("U",avalue(),closed=false),alabel="nonterminal")*/
    public final io.usethesource.vallang.type.Type $T48;	/*afunc(aparameter("U",avalue(),closed=true),[areified(aparameter("U",avalue(),closed=false),alabel="nonterminal"),avalue(alabel="input"),aloc(alabel="origin")],[])*/
    public final io.usethesource.vallang.type.Type ADT_Production;	/*aadt("Production",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T31;	/*alist(aadt("Production",[],dataSyntax()),alabel="choices")*/
    public final io.usethesource.vallang.type.Type Condition_end_of_line_;	/*acons(aadt("Condition",[],dataSyntax()),[],[],alabel="end-of-line")*/
    public final io.usethesource.vallang.type.Type $T30;	/*aparameter("T",aadt("Tree",[],dataSyntax()),closed=false,alabel="tree")*/
    public final io.usethesource.vallang.type.Type $T43;	/*alist(aadt("Tree",[],dataSyntax()),alabel="args")*/
    public final io.usethesource.vallang.type.Type $T29;	/*aset(aadt("Condition",[],dataSyntax()),alabel="conditions")*/
    public final io.usethesource.vallang.type.Type Symbol_lex_str;	/*acons(aadt("Symbol",[],dataSyntax()),[astr(alabel="name")],[],alabel="lex")*/
    public final io.usethesource.vallang.type.Type Symbol_iter_Symbol;	/*acons(aadt("Symbol",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="symbol")],[],alabel="iter")*/
    public final io.usethesource.vallang.type.Type ADT_Associativity;	/*aadt("Associativity",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TreeSearchResult_void;	/*aadt("TreeSearchResult",[avoid()],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T6;	/*alist(aparameter("T",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type $T33;	/*alist(aadt("Symbol",[],dataSyntax()),alabel="parameters")*/
    public final io.usethesource.vallang.type.Type Symbol_parameterized_lex_str_list_Symbol;	/*acons(aadt("Symbol",[],dataSyntax()),[astr(alabel="name"),alist(aadt("Symbol",[],dataSyntax()),alabel="parameters")],[],alabel="parameterized-lex")*/
    public final io.usethesource.vallang.type.Type ADT_Attr;	/*aadt("Attr",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type Attr_assoc_Associativity;	/*acons(aadt("Attr",[],dataSyntax()),[aadt("Associativity",[],dataSyntax(),alabel="assoc")],[],alabel="assoc")*/
    public final io.usethesource.vallang.type.Type Production_reference_Symbol_str;	/*acons(aadt("Production",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="def"),astr(alabel="cons")],[],alabel="reference")*/
    public final io.usethesource.vallang.type.Type Associativity_assoc_;	/*acons(aadt("Associativity",[],dataSyntax()),[],[],alabel="assoc")*/
    public final io.usethesource.vallang.type.Type Tree_appl_Production_list_Tree;	/*acons(aadt("Tree",[],dataSyntax()),[aadt("Production",[],dataSyntax(),alabel="prod"),alist(aadt("Tree",[],dataSyntax()),alabel="args")],[],alabel="appl")*/
    public final io.usethesource.vallang.type.Type ADT_FileSystemChange;	/*aadt("FileSystemChange",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type Associativity_non_assoc_;	/*acons(aadt("Associativity",[],dataSyntax()),[],[],alabel="non-assoc")*/
    public final io.usethesource.vallang.type.Type Symbol_sort_str;	/*acons(aadt("Symbol",[],dataSyntax()),[astr(alabel="name")],[],alabel="sort")*/
    public final io.usethesource.vallang.type.Type Condition_not_follow_Symbol;	/*acons(aadt("Condition",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="symbol")],[],alabel="not-follow")*/
    public final io.usethesource.vallang.type.Type $T35;	/*aset(aadt("Tree",[],dataSyntax()),alabel="alternatives")*/
    public final io.usethesource.vallang.type.Type ADT_CharRange;	/*aadt("CharRange",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T21;	/*alist(aadt("CharRange",[],dataSyntax()),alabel="ranges")*/
    public final io.usethesource.vallang.type.Type Symbol_start_Symbol;	/*acons(aadt("Symbol",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="symbol")],[],alabel="start")*/
    public final io.usethesource.vallang.type.Type ADT_IOCapability;	/*aadt("IOCapability",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type Tree_char_int;	/*acons(aadt("Tree",[],dataSyntax()),[aint(alabel="character")],[],alabel="char")*/
    public final io.usethesource.vallang.type.Type Symbol_lit_str;	/*acons(aadt("Symbol",[],dataSyntax()),[astr(alabel="string")],[],alabel="lit")*/
    public final io.usethesource.vallang.type.Type Condition_not_precede_Symbol;	/*acons(aadt("Condition",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="symbol")],[],alabel="not-precede")*/
    public final io.usethesource.vallang.type.Type Condition_delete_Symbol;	/*acons(aadt("Condition",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="symbol")],[],alabel="delete")*/
    public final io.usethesource.vallang.type.Type $T19;	/*aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)*/
    public final io.usethesource.vallang.type.Type ADT_TreeSearchResult_1;	/*aadt("TreeSearchResult",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],dataSyntax())*/
    public final io.usethesource.vallang.type.Type CharRange_range_int_int;	/*acons(aadt("CharRange",[],dataSyntax()),[aint(alabel="begin"),aint(alabel="end")],[],alabel="range")*/
    public final io.usethesource.vallang.type.Type Symbol_conditional_Symbol_set_Condition;	/*acons(aadt("Symbol",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="symbol"),aset(aadt("Condition",[],dataSyntax()),alabel="conditions")],[],alabel="conditional")*/
    public final io.usethesource.vallang.type.Type $T52;	/*alist(aadt("Symbol",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type Attr_bracket_;	/*acons(aadt("Attr",[],dataSyntax()),[],[],alabel="bracket")*/
    public final io.usethesource.vallang.type.Type $T13;	/*abool()*/
    public final io.usethesource.vallang.type.Type $T28;	/*aset(aadt("Production",[],dataSyntax()),alabel="alternatives")*/
    public final io.usethesource.vallang.type.Type Production_associativity_Symbol_Associativity_set_Production;	/*acons(aadt("Production",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="def"),aadt("Associativity",[],dataSyntax(),alabel="assoc"),aset(aadt("Production",[],dataSyntax()),alabel="alternatives")],[],alabel="associativity")*/
    public final io.usethesource.vallang.type.Type $T18;	/*aset(aadt("Production",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type $T27;	/*aset(aadt("Attr",[],dataSyntax()),alabel="attributes")*/
    public final io.usethesource.vallang.type.Type $T10;	/*areified(aparameter("U",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type TreeSearchResult_1_treeFound_;	/*acons(aadt("TreeSearchResult",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],dataSyntax()),[aparameter("T",aadt("Tree",[],dataSyntax()),closed=false,alabel="tree")],[],alabel="treeFound")*/
    public final io.usethesource.vallang.type.Type Condition_begin_of_line_;	/*acons(aadt("Condition",[],dataSyntax()),[],[],alabel="begin-of-line")*/
    public final io.usethesource.vallang.type.Type Production_regular_Symbol;	/*acons(aadt("Production",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="def")],[],alabel="regular")*/
    public final io.usethesource.vallang.type.Type Condition_at_column_int;	/*acons(aadt("Condition",[],dataSyntax()),[aint(alabel="column")],[],alabel="at-column")*/
    public final io.usethesource.vallang.type.Type $T7;	/*alist(aadt("Production",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type ADT_Message;	/*aadt("Message",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T22;	/*aset(aadt("Symbol",[],dataSyntax()),alabel="alternatives")*/
    public final io.usethesource.vallang.type.Type TreeSearchResult_1_treeNotFound_;	/*acons(aadt("TreeSearchResult",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],dataSyntax()),[],[],alabel="treeNotFound")*/
    public final io.usethesource.vallang.type.Type $T23;	/*alist(aadt("Symbol",[],dataSyntax()),alabel="symbols")*/
    public final io.usethesource.vallang.type.Type Production_prod_Symbol_list_Symbol_set_Attr;	/*acons(aadt("Production",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="def"),alist(aadt("Symbol",[],dataSyntax()),alabel="symbols"),aset(aadt("Attr",[],dataSyntax()),alabel="attributes")],[],alabel="prod")*/
    public final io.usethesource.vallang.type.Type Symbol_opt_Symbol;	/*acons(aadt("Symbol",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="symbol")],[],alabel="opt")*/
    public final io.usethesource.vallang.type.Type Associativity_left_;	/*acons(aadt("Associativity",[],dataSyntax()),[],[],alabel="left")*/
    public final io.usethesource.vallang.type.Type Symbol_alt_set_Symbol;	/*acons(aadt("Symbol",[],dataSyntax()),[aset(aadt("Symbol",[],dataSyntax()),alabel="alternatives")],[],alabel="alt")*/
    public final io.usethesource.vallang.type.Type Symbol_char_class_list_CharRange;	/*acons(aadt("Symbol",[],dataSyntax()),[alist(aadt("CharRange",[],dataSyntax()),alabel="ranges")],[],alabel="char-class")*/
    public final io.usethesource.vallang.type.Type ADT_RuntimeException;	/*aadt("RuntimeException",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T4;	/*alist(aparameter("T",avalue(),closed=false,alabel="h"))*/
    public final io.usethesource.vallang.type.Type Tree_amb_set_Tree;	/*acons(aadt("Tree",[],dataSyntax()),[aset(aadt("Tree",[],dataSyntax()),alabel="alternatives")],[],alabel="amb")*/
    public final io.usethesource.vallang.type.Type Symbol_seq_list_Symbol;	/*acons(aadt("Symbol",[],dataSyntax()),[alist(aadt("Symbol",[],dataSyntax()),alabel="symbols")],[],alabel="seq")*/
    public final io.usethesource.vallang.type.Type $T1;	/*aset(aparameter("T",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type Condition_except_str;	/*acons(aadt("Condition",[],dataSyntax()),[astr(alabel="label")],[],alabel="except")*/
    public final io.usethesource.vallang.type.Type Symbol_layouts_str;	/*acons(aadt("Symbol",[],dataSyntax()),[astr(alabel="name")],[],alabel="layouts")*/
    public final io.usethesource.vallang.type.Type Symbol_empty_;	/*acons(aadt("Symbol",[],dataSyntax()),[],[],alabel="empty")*/
    public final io.usethesource.vallang.type.Type $T55;	/*aset(aadt("Tree",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type $T51;	/*afunc(aparameter("U",avalue(),closed=true),[avalue(alabel="input"),aloc(alabel="origin")],[])*/
    public final io.usethesource.vallang.type.Type Production_error_Symbol_Production_int;	/*acons(aadt("Production",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="def"),aadt("Production",[],dataSyntax(),alabel="prod"),aint(alabel="dot")],[],alabel="error")*/
    public final io.usethesource.vallang.type.Type RuntimeException_ParseErrorRecovery_RuntimeException_loc;	/*acons(aadt("RuntimeException",[],dataSyntax()),[aadt("RuntimeException",[],dataSyntax(),alabel="trigger"),aloc(alabel="src")],[],alabel="ParseErrorRecovery")*/
    public final io.usethesource.vallang.type.Type Symbol_parameterized_sort_str_list_Symbol;	/*acons(aadt("Symbol",[],dataSyntax()),[astr(alabel="name"),alist(aadt("Symbol",[],dataSyntax()),alabel="parameters")],[],alabel="parameterized-sort")*/
    public final io.usethesource.vallang.type.Type Associativity_right_;	/*acons(aadt("Associativity",[],dataSyntax()),[],[],alabel="right")*/
    public final io.usethesource.vallang.type.Type Production_priority_Symbol_list_Production;	/*acons(aadt("Production",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="def"),alist(aadt("Production",[],dataSyntax()),alabel="choices")],[],alabel="priority")*/
    public final io.usethesource.vallang.type.Type ADT_Exception;	/*aadt("Exception",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type Symbol_iter_seps_Symbol_list_Symbol;	/*acons(aadt("Symbol",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="symbol"),alist(aadt("Symbol",[],dataSyntax()),alabel="separators")],[],alabel="iter-seps")*/
    public final io.usethesource.vallang.type.Type Condition_follow_Symbol;	/*acons(aadt("Condition",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="symbol")],[],alabel="follow")*/
    public final io.usethesource.vallang.type.Type Production_skipped_Symbol;	/*acons(aadt("Production",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="def")],[],alabel="skipped")*/
    public final io.usethesource.vallang.type.Type $T44;	/*afunc(aparameter("T",avalue(),closed=true),[avalue(alabel="input"),aloc(alabel="origin")],[])*/
    public final io.usethesource.vallang.type.Type Condition_precede_Symbol;	/*acons(aadt("Condition",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="symbol")],[],alabel="precede")*/
    public final io.usethesource.vallang.type.Type Symbol_iter_star_Symbol;	/*acons(aadt("Symbol",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="symbol")],[],alabel="iter-star")*/
    public final io.usethesource.vallang.type.Type $T14;	/*areified(aparameter("T",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type $T54;	/*\achar-class([arange(10,10)])*/

    public $ParseTree(RascalExecutionContext rex){
        this(rex, null);
    }
    
    public $ParseTree(RascalExecutionContext rex, Object extended){
       super(rex);
       this.$me = extended == null ? this : ($ParseTree_$I)extended;
       ModuleStore mstore = rex.getModuleStore();
       mstore.put(rascal.$ParseTree.class, this);
       
       mstore.importModule(rascal.$Set.class, rex, rascal.$Set::new);
       mstore.importModule(rascal.$IO.class, rex, rascal.$IO::new);
       mstore.importModule(rascal.$Exception.class, rex, rascal.$Exception::new);
       mstore.importModule(rascal.analysis.diff.edits.$FileSystemChanges.class, rex, rascal.analysis.diff.edits.$FileSystemChanges::new);
       mstore.importModule(rascal.$Map.class, rex, rascal.$Map::new);
       mstore.importModule(rascal.$Node.class, rex, rascal.$Node::new); 
       
       M_Set = mstore.getModule(rascal.$Set.class);
       M_IO = mstore.getModule(rascal.$IO.class);
       M_Exception = mstore.getModule(rascal.$Exception.class);
       M_analysis_diff_edits_FileSystemChanges = mstore.getModule(rascal.analysis.diff.edits.$FileSystemChanges.class);
       M_Map = mstore.getModule(rascal.$Map.class);
       M_Node = mstore.getModule(rascal.$Node.class); 
       
       M_Message = mstore.extendModule(rascal.$Message.class, rex, rascal.$Message::new, $me);
       M_Type = mstore.extendModule(rascal.$Type.class, rex, rascal.$Type::new, $me);
       M_List = mstore.extendModule(rascal.$List.class, rex, rascal.$List::new, $me);
                          
       
       $TS.importStore(M_Set.$TS);
       $TS.importStore(M_IO.$TS);
       $TS.importStore(M_Message.$TS);
       $TS.importStore(M_Exception.$TS);
       $TS.importStore(M_Type.$TS);
       $TS.importStore(M_analysis_diff_edits_FileSystemChanges.$TS);
       $TS.importStore(M_Node.$TS);
       $TS.importStore(M_Map.$TS);
       $TS.importStore(M_List.$TS);
       
       $Prelude = $initLibrary("org.rascalmpl.library.Prelude"); 
    
       $constants = readBinaryConstantsFile(this.getClass(), "rascal/$ParseTree.constants", 12, "ff199a7869cc91932ea9cfb5a790dcf9");
       ADT_Symbol = $adt("Symbol");
       ADT_Tree = $adt("Tree");
       ADT_Condition = $adt("Condition");
       ADT_Production = $adt("Production");
       ADT_Associativity = $adt("Associativity");
       ADT_Attr = $adt("Attr");
       ADT_FileSystemChange = $adt("FileSystemChange");
       ADT_CharRange = $adt("CharRange");
       ADT_IOCapability = $adt("IOCapability");
       ADT_Message = $adt("Message");
       ADT_RuntimeException = $adt("RuntimeException");
       ADT_Exception = $adt("Exception");
       $T24 = $TF.integerType();
       $T2 = $TF.valueType();
       $T11 = $TF.parameterType("U", $T2);
       $T38 = $TF.stringType();
       $T41 = $TF.integerType();
       $T26 = $TF.integerType();
       $T5 = $TF.parameterType("T", $T2);
       $T37 = $TF.stringType();
       $T20 = $TF.voidType();
       $T32 = $TF.stringType();
       $T25 = $TF.stringType();
       $T39 = $TF.sourceLocationType();
       $T3 = $TF.parameterType("T", $T2);
       $T46 = $TF.valueType();
       $T42 = $TF.integerType();
       $T40 = $TF.integerType();
       $T36 = $TF.integerType();
       $T17 = $TF.stringType();
       $T47 = $TF.sourceLocationType();
       $T53 = $TF.integerType();
       $T45 = $TF.parameterType("T", $T2);
       $T9 = $TF.parameterType("T", $T2);
       $T49 = $TF.parameterType("U", $T2);
       $T12 = $TF.sourceLocationType();
       $T16 = $TF.parameterType("T", ADT_Tree);
       $T15 = $RTF.reifiedType($T16);
       $T34 = $TF.listType(ADT_Symbol);
       $T0 = $RTF.reifiedType(ADT_Tree);
       ADT_TreeSearchResult_Tree = $parameterizedAdt("TreeSearchResult", new Type[] { ADT_Tree });
       $T8 = $TF.listType($T9);
       $T50 = $RTF.reifiedType($T11);
       $T48 = $TF.functionType($T49, $TF.tupleType($T50, "nonterminal", $T46, "input", $T47, "origin"), $TF.tupleEmpty());
       $T31 = $TF.listType(ADT_Production);
       $T30 = $TF.parameterType("T", ADT_Tree);
       $T43 = $TF.listType(ADT_Tree);
       $T29 = $TF.setType(ADT_Condition);
       ADT_TreeSearchResult_void = $parameterizedAdt("TreeSearchResult", new Type[] { $T20 });
       $T6 = $TF.listType($T3);
       $T33 = $TF.listType(ADT_Symbol);
       $T35 = $TF.setType(ADT_Tree);
       $T21 = $TF.listType(ADT_CharRange);
       $T19 = $TF.parameterType("T", ADT_Tree);
       ADT_TreeSearchResult_1 = $parameterizedAdt("TreeSearchResult", new Type[] { $T19 });
       $T52 = $TF.listType(ADT_Symbol);
       $T13 = $TF.boolType();
       $T28 = $TF.setType(ADT_Production);
       $T18 = $TF.setType(ADT_Production);
       $T27 = $TF.setType(ADT_Attr);
       $T10 = $RTF.reifiedType($T11);
       $T7 = $TF.listType(ADT_Production);
       $T22 = $TF.setType(ADT_Symbol);
       $T23 = $TF.listType(ADT_Symbol);
       $T4 = $TF.listType($T5);
       $T1 = $TF.setType($T3);
       $T55 = $TF.setType(ADT_Tree);
       $T51 = $TF.functionType($T49, $TF.tupleType($T46, "input", $T47, "origin"), $TF.tupleEmpty());
       $T44 = $TF.functionType($T45, $TF.tupleType($T46, "input", $T47, "origin"), $TF.tupleEmpty());
       $T14 = $RTF.reifiedType($T3);
       $T54 = $TF.valueType();
       Symbol_keywords_str = $TF.constructor($TS, ADT_Symbol, "keywords", $TF.stringType(), "name");
       Tree_cycle_Symbol_int = $TF.constructor($TS, ADT_Tree, "cycle", M_Type.ADT_Symbol, "symbol", $TF.integerType(), "cycleLength");
       Symbol_iter_star_seps_Symbol_list_Symbol = $TF.constructor($TS, ADT_Symbol, "iter-star-seps", M_Type.ADT_Symbol, "symbol", $TF.listType(ADT_Symbol), "separators");
       TreeSearchResult_Tree_treeFound_Tree = $TF.constructor($TS, ADT_TreeSearchResult_Tree, "treeFound", ADT_Tree, "tree");
       Symbol_cilit_str = $TF.constructor($TS, ADT_Symbol, "cilit", $TF.stringType(), "string");
       Condition_end_of_line_ = $TF.constructor($TS, ADT_Condition, "end-of-line");
       Symbol_lex_str = $TF.constructor($TS, ADT_Symbol, "lex", $TF.stringType(), "name");
       Symbol_iter_Symbol = $TF.constructor($TS, ADT_Symbol, "iter", M_Type.ADT_Symbol, "symbol");
       Symbol_parameterized_lex_str_list_Symbol = $TF.constructor($TS, ADT_Symbol, "parameterized-lex", $TF.stringType(), "name", $TF.listType(ADT_Symbol), "parameters");
       Attr_assoc_Associativity = $TF.constructor($TS, ADT_Attr, "assoc", ADT_Associativity, "assoc");
       Production_reference_Symbol_str = $TF.constructor($TS, ADT_Production, "reference", M_Type.ADT_Symbol, "def", $TF.stringType(), "cons");
       Associativity_assoc_ = $TF.constructor($TS, ADT_Associativity, "assoc");
       Tree_appl_Production_list_Tree = $TF.constructor($TS, ADT_Tree, "appl", M_Type.ADT_Production, "prod", $TF.listType(ADT_Tree), "args");
       Associativity_non_assoc_ = $TF.constructor($TS, ADT_Associativity, "non-assoc");
       Symbol_sort_str = $TF.constructor($TS, ADT_Symbol, "sort", $TF.stringType(), "name");
       Condition_not_follow_Symbol = $TF.constructor($TS, ADT_Condition, "not-follow", M_Type.ADT_Symbol, "symbol");
       Symbol_start_Symbol = $TF.constructor($TS, ADT_Symbol, "start", M_Type.ADT_Symbol, "symbol");
       Tree_char_int = $TF.constructor($TS, ADT_Tree, "char", $TF.integerType(), "character");
       Symbol_lit_str = $TF.constructor($TS, ADT_Symbol, "lit", $TF.stringType(), "string");
       Condition_not_precede_Symbol = $TF.constructor($TS, ADT_Condition, "not-precede", M_Type.ADT_Symbol, "symbol");
       Condition_delete_Symbol = $TF.constructor($TS, ADT_Condition, "delete", M_Type.ADT_Symbol, "symbol");
       CharRange_range_int_int = $TF.constructor($TS, ADT_CharRange, "range", $TF.integerType(), "begin", $TF.integerType(), "end");
       Symbol_conditional_Symbol_set_Condition = $TF.constructor($TS, ADT_Symbol, "conditional", M_Type.ADT_Symbol, "symbol", $TF.setType(ADT_Condition), "conditions");
       Attr_bracket_ = $TF.constructor($TS, ADT_Attr, "bracket");
       Production_associativity_Symbol_Associativity_set_Production = $TF.constructor($TS, ADT_Production, "associativity", M_Type.ADT_Symbol, "def", ADT_Associativity, "assoc", $TF.setType(ADT_Production), "alternatives");
       TreeSearchResult_1_treeFound_ = $TF.constructor($TS, ADT_TreeSearchResult_1, "treeFound", $TF.parameterType("T", ADT_Tree), "tree");
       Condition_begin_of_line_ = $TF.constructor($TS, ADT_Condition, "begin-of-line");
       Production_regular_Symbol = $TF.constructor($TS, ADT_Production, "regular", M_Type.ADT_Symbol, "def");
       Condition_at_column_int = $TF.constructor($TS, ADT_Condition, "at-column", $TF.integerType(), "column");
       TreeSearchResult_1_treeNotFound_ = $TF.constructor($TS, ADT_TreeSearchResult_1, "treeNotFound");
       Production_prod_Symbol_list_Symbol_set_Attr = $TF.constructor($TS, ADT_Production, "prod", M_Type.ADT_Symbol, "def", $TF.listType(ADT_Symbol), "symbols", $TF.setType(ADT_Attr), "attributes");
       Symbol_opt_Symbol = $TF.constructor($TS, ADT_Symbol, "opt", M_Type.ADT_Symbol, "symbol");
       Associativity_left_ = $TF.constructor($TS, ADT_Associativity, "left");
       Symbol_alt_set_Symbol = $TF.constructor($TS, ADT_Symbol, "alt", $TF.setType(ADT_Symbol), "alternatives");
       Symbol_char_class_list_CharRange = $TF.constructor($TS, ADT_Symbol, "char-class", $TF.listType(ADT_CharRange), "ranges");
       Tree_amb_set_Tree = $TF.constructor($TS, ADT_Tree, "amb", $TF.setType(ADT_Tree), "alternatives");
       Symbol_seq_list_Symbol = $TF.constructor($TS, ADT_Symbol, "seq", $TF.listType(ADT_Symbol), "symbols");
       Condition_except_str = $TF.constructor($TS, ADT_Condition, "except", $TF.stringType(), "label");
       Symbol_layouts_str = $TF.constructor($TS, ADT_Symbol, "layouts", $TF.stringType(), "name");
       Symbol_empty_ = $TF.constructor($TS, ADT_Symbol, "empty");
       Production_error_Symbol_Production_int = $TF.constructor($TS, ADT_Production, "error", M_Type.ADT_Symbol, "def", M_Type.ADT_Production, "prod", $TF.integerType(), "dot");
       RuntimeException_ParseErrorRecovery_RuntimeException_loc = $TF.constructor($TS, ADT_RuntimeException, "ParseErrorRecovery", M_Exception.ADT_RuntimeException, "trigger", $TF.sourceLocationType(), "src");
       Symbol_parameterized_sort_str_list_Symbol = $TF.constructor($TS, ADT_Symbol, "parameterized-sort", $TF.stringType(), "name", $TF.listType(ADT_Symbol), "parameters");
       Associativity_right_ = $TF.constructor($TS, ADT_Associativity, "right");
       Production_priority_Symbol_list_Production = $TF.constructor($TS, ADT_Production, "priority", M_Type.ADT_Symbol, "def", $TF.listType(ADT_Production), "choices");
       Symbol_iter_seps_Symbol_list_Symbol = $TF.constructor($TS, ADT_Symbol, "iter-seps", M_Type.ADT_Symbol, "symbol", $TF.listType(ADT_Symbol), "separators");
       Condition_follow_Symbol = $TF.constructor($TS, ADT_Condition, "follow", M_Type.ADT_Symbol, "symbol");
       Production_skipped_Symbol = $TF.constructor($TS, ADT_Production, "skipped", M_Type.ADT_Symbol, "def");
       Condition_precede_Symbol = $TF.constructor($TS, ADT_Condition, "precede", M_Type.ADT_Symbol, "symbol");
       Symbol_iter_star_Symbol = $TF.constructor($TS, ADT_Symbol, "iter-star", M_Type.ADT_Symbol, "symbol");
    
       
       $kwpDefaults_parse$6f6b93176be80747 = Util.kwpMap("allowAmbiguity", ((IBool)$constants.get(2)/*false*/), "maxAmbDepth", ((IInteger)$constants.get(3)/*2*/), "allowRecovery", ((IBool)$constants.get(2)/*false*/), "maxRecoveryAttempts", ((IInteger)$constants.get(4)/*30*/), "maxRecoveryTokens", ((IInteger)$constants.get(5)/*3*/), "hasSideEffects", ((IBool)$constants.get(2)/*false*/), "filters", ((ISet)$constants.get(6)/*{}*/));
       $kwpDefaults_parse$66e93821e413f32f = Util.kwpMap("allowAmbiguity", ((IBool)$constants.get(2)/*false*/), "maxAmbDepth", ((IInteger)$constants.get(3)/*2*/), "allowRecovery", ((IBool)$constants.get(2)/*false*/), "maxRecoveryAttempts", ((IInteger)$constants.get(4)/*30*/), "maxRecoveryTokens", ((IInteger)$constants.get(5)/*3*/), "hasSideEffects", ((IBool)$constants.get(2)/*false*/), "filters", ((ISet)$constants.get(6)/*{}*/));
       $kwpDefaults_parse$47fb5ed5d88ced9a = Util.kwpMap("allowAmbiguity", ((IBool)$constants.get(2)/*false*/), "maxAmbDepth", ((IInteger)$constants.get(3)/*2*/), "allowRecovery", ((IBool)$constants.get(2)/*false*/), "maxRecoveryAttempts", ((IInteger)$constants.get(4)/*30*/), "maxRecoveryTokens", ((IInteger)$constants.get(5)/*3*/), "hasSideEffects", ((IBool)$constants.get(2)/*false*/), "filters", ((ISet)$constants.get(6)/*{}*/));
       $kwpDefaults_parser$6ca25a388c8ab884 = Util.kwpMap("allowAmbiguity", ((IBool)$constants.get(2)/*false*/), "maxAmbDepth", ((IInteger)$constants.get(3)/*2*/), "allowRecovery", ((IBool)$constants.get(2)/*false*/), "maxRecoveryAttempts", ((IInteger)$constants.get(4)/*30*/), "maxRecoveryTokens", ((IInteger)$constants.get(5)/*3*/), "hasSideEffects", ((IBool)$constants.get(2)/*false*/), "filters", ((ISet)$constants.get(6)/*{}*/));
       $kwpDefaults_firstAmbiguityFinder$ce3bf029110f9986 = Util.kwpMap("hasSideEffects", ((IBool)$constants.get(2)/*false*/), "filters", ((ISet)$constants.get(6)/*{}*/));
       $kwpDefaults_parsers$a57d129a731dc0ad = Util.kwpMap("allowAmbiguity", ((IBool)$constants.get(2)/*false*/), "maxAmbDepth", ((IInteger)$constants.get(3)/*2*/), "allowRecovery", ((IBool)$constants.get(2)/*false*/), "maxRecoveryAttempts", ((IInteger)$constants.get(4)/*30*/), "maxRecoveryTokens", ((IInteger)$constants.get(5)/*3*/), "hasSideEffects", ((IBool)$constants.get(2)/*false*/), "filters", ((ISet)$constants.get(6)/*{}*/));
       $kwpDefaults_firstAmbiguityFinders$0d5a93ee0e899388 = Util.kwpMap("hasSideEffects", ((IBool)$constants.get(2)/*false*/), "filters", ((ISet)$constants.get(6)/*{}*/));
       $kwpDefaults_loadParsers$d8c91830dd2332d3 = Util.kwpMap("allowAmbiguity", ((IBool)$constants.get(2)/*false*/), "maxAmbDepth", ((IInteger)$constants.get(3)/*2*/), "allowRecovery", ((IBool)$constants.get(2)/*false*/), "maxRecoveryAttempts", ((IInteger)$constants.get(4)/*30*/), "maxRecoveryTokens", ((IInteger)$constants.get(5)/*3*/), "hasSideEffects", ((IBool)$constants.get(2)/*false*/), "filters", ((ISet)$constants.get(6)/*{}*/));
       $kwpDefaults_loadParser$a512631cb177aade = Util.kwpMap("allowAmbiguity", ((IBool)$constants.get(2)/*false*/), "maxAmbDepth", ((IInteger)$constants.get(3)/*2*/), "allowRecovery", ((IBool)$constants.get(2)/*false*/), "maxRecoveryAttempts", ((IInteger)$constants.get(4)/*30*/), "maxRecoveryTokens", ((IInteger)$constants.get(5)/*3*/), "hasSideEffects", ((IBool)$constants.get(2)/*false*/), "filters", ((ISet)$constants.get(6)/*{}*/));
    
    }
    public IBool sameType(IValue $P0, IValue $P1){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       switch(Fingerprint.getFingerprint($P0)){
       	
       case 1643638592:
       		if($isSubtypeOf($P0Type, M_Type.ADT_Symbol) && $isSubtypeOf($P1Type, M_Type.ADT_Symbol)){
       		  $result = (IBool)sameType$b2131ce047a25220((IConstructor) $P0, (IConstructor) $P1);
       		  if($result != null) return $result;
       		}
       		break;	
       case -2144737184:
       		if($isSubtypeOf($P0Type, M_Type.ADT_Symbol) && $isSubtypeOf($P1Type, M_Type.ADT_Symbol)){
       		  $result = (IBool)sameType$eac00f42fd751061((IConstructor) $P0, (IConstructor) $P1);
       		  if($result != null) return $result;
       		}
       		break;
       }
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol) && $isSubtypeOf($P1Type, M_Type.ADT_Symbol)){
         $result = (IBool)sameType$e14a99b94618e205((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
         $result = (IBool)sameType$74e4ba65f635b551((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
         $result = (IBool)sameType$73bb9be231adc5f2((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
         $result = (IBool)sameType$0bc781858a8a2455((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
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
    public IInteger size(IValue $P0){ // Generated by Resolver
       return (IInteger) M_List.size($P0);
    }
    public IMap toMap(IValue $P0){ // Generated by Resolver
       return (IMap) M_List.toMap($P0);
    }
    public IConstructor choice(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IConstructor) M_Type.choice($P0, $P1);
    }
    public IList mapper(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.mapper($P0, $P1);
    }
    public IList reverse(IValue $P0){ // Generated by Resolver
       return (IList) M_List.reverse($P0);
    }
    public TypedFunctionInstance2<IValue, IValue, IValue> firstAmbiguityFinder(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       TypedFunctionInstance2<IValue, IValue, IValue> $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (TypedFunctionInstance2<IValue, IValue, IValue>)firstAmbiguityFinder$ce3bf029110f9986((IConstructor) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IBool isEmpty(IValue $P0){ // Generated by Resolver
       return (IBool) M_List.isEmpty($P0);
    }
    public IList remove(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.remove($P0, $P1);
    }
    public IValue max(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T4)){
         $result = (IValue)M_List.max$9542dff773662ba8((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T6)){
         $result = (IValue)M_List.max$a65b4f1e9d6ce28f((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T1)){
         $result = (IValue)M_Set.max$187b88bd7e3f0c95((ISet) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IConstructor priority(IValue $P0, IValue $P1){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol) && $isSubtypeOf($P1Type,$T7)){
         $result = (IConstructor)priority$032fe876853ebfb4((IConstructor) $P0, (IList) $P1);
         if($result != null) return $result;
         return $RVF.constructor(Production_priority_Symbol_list_Production, new IValue[]{(IConstructor) $P0, (IList) $P1});
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IValue getFirstFrom(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T8)){
         $result = (IValue)M_List.getFirstFrom$de7747ba8ecf5d2d((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T6)){
         $result = (IValue)M_List.getFirstFrom$52641577be663f10((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T1)){
         $result = (IValue)M_Set.getFirstFrom$2bf5bbe557d5c3ba((ISet) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IMap distribution(IValue $P0){ // Generated by Resolver
       return (IMap) M_List.distribution($P0);
    }
    public TypedFunctionInstance2<IValue, IValue, IValue> loadParser(IValue $P0, IValue $P1, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       TypedFunctionInstance2<IValue, IValue, IValue> $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T10) && $isSubtypeOf($P1Type,$T12)){
         $result = (TypedFunctionInstance2<IValue, IValue, IValue>)loadParser$a512631cb177aade((IConstructor) $P0, (ISourceLocation) $P1, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IString printSymbol(IValue $P0, IValue $P1){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol) && $isSubtypeOf($P1Type,$T13)){
         $result = (IString)printSymbol$4640d5b37e63b3ac((IConstructor) $P0, (IBool) $P1);
         if($result != null) return $result;
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
    public IString toString(IValue $P0){ // Generated by Resolver
       return (IString) M_List.toString($P0);
    }
    public IValue reducer(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       return (IValue) M_List.reducer($P0, $P1, $P2);
    }
    public IConstructor lrel(IValue $P0){ // Generated by Resolver
       return (IConstructor) M_Type.lrel($P0);
    }
    public ISet permutations(IValue $P0){ // Generated by Resolver
       return (ISet) M_List.permutations($P0);
    }
    public TypedFunctionInstance3<IValue, IValue, IValue, IValue> loadParsers(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       TypedFunctionInstance3<IValue, IValue, IValue, IValue> $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T12)){
         $result = (TypedFunctionInstance3<IValue, IValue, IValue, IValue>)loadParsers$d8c91830dd2332d3((ISourceLocation) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
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
    public ITree reposition_rec(IValue $P0, IValue $P1, ValueRef<IInteger> curColumn_4, ValueRef<IInteger> curLine_3, ValueRef<IInteger> curOffset_2, ValueRef<ISourceLocation> file, ValueRef<IBool> markAmb, ValueRef<IBool> markChar, ValueRef<IBool> markCycle, ValueRef<IBool> markLayout, ValueRef<IBool> markLexical, ValueRef<IBool> markLit, ValueRef<IBool> markRegular, ValueRef<IBool> markStart, ValueRef<IBool> markSubLayout, ValueRef<IBool> markSubLexical, ValueRef<IBool> markSubLit, ValueRef<IBool> markSyntax){ // Generated by Resolver
       ITree $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       switch(Fingerprint.getFingerprint($P0)){
       	
       case 1522110048:
       		if($isSubtypeOf($P0Type, ADT_Tree) && $isSubtypeOf($P1Type,$T13)){
       		  $result = (ITree)rec$274f633284bc5c83((ITree) $P0, (IBool) $P1, curColumn_4, curLine_3, curOffset_2, file, markCycle);
       		  if($result != null) return $result;
       		}
       		break;	
       case 48015024:
       		if($isSubtypeOf($P0Type, ADT_Tree) && $isSubtypeOf($P1Type,$T13)){
       		  $result = (ITree)rec$d5e2ece302996ca6((ITree) $P0, (IBool) $P1, curColumn_4, curLine_3, curOffset_2, file, markAmb, markChar, markCycle, markLayout, markLexical, markLit, markRegular, markStart, markSubLayout, markSubLexical, markSubLit, markSyntax);
       		  if($result != null) return $result;
       		}
       		break;	
       case 24418992:
       		if($isSubtypeOf($P0Type, ADT_Tree) && $isSubtypeOf($P1Type,$T13)){
       		  $result = (ITree)rec$5bce1aab543e2438((ITree) $P0, (IBool) $P1, curColumn_4, curLine_3, curOffset_2, file, markChar);
       		  if($result != null) return $result;
       		}
       		break;	
       case 773552:
       		if($isSubtypeOf($P0Type, ADT_Tree) && $isSubtypeOf($P1Type,$T13)){
       		  $result = (ITree)rec$836612a609510466((ITree) $P0, (IBool) $P1, curColumn_4, curLine_3, curOffset_2, file, markAmb, markChar, markCycle, markLayout, markLexical, markLit, markRegular, markStart, markSubLayout, markSubLexical, markSubLit, markSyntax);
       		  if($result != null) return $result;
       		}
       		break;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IValue implode(IValue $P0, IValue $P1){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T14) && $isSubtypeOf($P1Type, ADT_Tree)){
         $result = (IValue)implode$cb791704be7a3ddd((IConstructor) $P0, (ITree) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public TypedFunctionInstance3<IValue, IValue, IValue, IValue> firstAmbiguityFinders(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       TypedFunctionInstance3<IValue, IValue, IValue, IValue> $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (TypedFunctionInstance3<IValue, IValue, IValue, IValue>)firstAmbiguityFinders$0d5a93ee0e899388((IConstructor) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
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
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T15) && $isSubtypeOf($P1Type,$T12) && $isSubtypeOf($P2Type, ADT_Tree)){
         $result = (IConstructor)treeAt$25490092eb82378f((IConstructor) $P0, (ISourceLocation) $P1, (ITree) $P2);
         if($result != null) return $result;
         $result = (IConstructor)treeAt$613659a183983e0a((IConstructor) $P0, (ISourceLocation) $P1, (ITree) $P2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IMap toMapUnique(IValue $P0){ // Generated by Resolver
       return (IMap) M_List.toMapUnique($P0);
    }
    public IList index(IValue $P0){ // Generated by Resolver
       return (IList) M_List.index($P0);
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
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T12)){
         try { storeParsers$fc97d9cdf0ed0c14((IConstructor) $P0, (ISourceLocation) $P1); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IInteger lastIndexOf(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IInteger) M_List.lastIndexOf($P0, $P1);
    }
    public ITree parse(IValue $P0, IValue $P1, IValue $P2, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       ITree $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T15) && $isSubtypeOf($P1Type,$T17) && $isSubtypeOf($P2Type,$T12)){
         $result = (ITree)parse$66e93821e413f32f((IConstructor) $P0, (IString) $P1, (ISourceLocation) $P2, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public ITree parse(IValue $P0, IValue $P1, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       ITree $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T15) && $isSubtypeOf($P1Type,$T17)){
         $result = (ITree)parse$6f6b93176be80747((IConstructor) $P0, (IString) $P1, $kwpActuals);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T15) && $isSubtypeOf($P1Type,$T12)){
         $result = (ITree)parse$47fb5ed5d88ced9a((IConstructor) $P0, (ISourceLocation) $P1, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public TypedFunctionInstance3<IValue, IValue, IValue, IValue> parsers(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       TypedFunctionInstance3<IValue, IValue, IValue, IValue> $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T14)){
         $result = (TypedFunctionInstance3<IValue, IValue, IValue, IValue>)parsers$a57d129a731dc0ad((IConstructor) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
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
    public IBool reposition_doSub(IValue $P0, ValueRef<IBool> markSubLayout, ValueRef<IBool> markSubLexical, ValueRef<IBool> markSubLit){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_Type.ADT_Production)){
         $result = (IBool)doSub$206f4d604bde2e88((IConstructor) $P0, markSubLexical);
         if($result != null) return $result;
         $result = (IBool)doSub$5a451dcbafa938cc((IConstructor) $P0, markSubLayout);
         if($result != null) return $result;
         $result = (IBool)doSub$56078ffcb99be2e4((IConstructor) $P0, markSubLit);
         if($result != null) return $result;
         $result = (IBool)doSub$346131bbdfe29203((IConstructor) $P0, markSubLexical);
         if($result != null) return $result;
         $result = (IBool)doSub$98793c1e9ac4de9d((IConstructor) $P0, markSubLayout);
         if($result != null) return $result;
         $result = (IBool)doSub$f8ed88e317c4c9a5((IConstructor) $P0, markSubLit);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type, M_Type.ADT_Production)){
         $result = (IBool)doSub$8bcc33a4aa91187e((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString itoString(IValue $P0){ // Generated by Resolver
       return (IString) M_List.itoString($P0);
    }
    public IValue last(IValue $P0){ // Generated by Resolver
       return (IValue) M_List.last($P0);
    }
    public ITree reposition_mergeRec(IValue $P0, IValue $P1, ValueRef<IInteger> curColumn_4, ValueRef<IInteger> curLine_3, ValueRef<IInteger> curOffset_2, ValueRef<ISourceLocation> file, ValueRef<IBool> markAmb, ValueRef<IBool> markChar, ValueRef<IBool> markCycle, ValueRef<IBool> markLayout, ValueRef<IBool> markLexical, ValueRef<IBool> markLit, ValueRef<IBool> markRegular, ValueRef<IBool> markStart, ValueRef<IBool> markSubLayout, ValueRef<IBool> markSubLexical, ValueRef<IBool> markSubLit, ValueRef<IBool> markSyntax){ // Generated by Resolver
       ITree $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type, ADT_Tree) && $isSubtypeOf($P1Type,$T13)){
         $result = (ITree)mergeRec$fc149d142e21c7b1((ITree) $P0, (IBool) $P1, curColumn_4, curLine_3, curOffset_2, file, markAmb, markChar, markCycle, markLayout, markLexical, markLit, markRegular, markStart, markSubLayout, markSubLexical, markSubLit, markSyntax);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
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
    public IConstructor rel(IValue $P0){ // Generated by Resolver
       return (IConstructor) M_Type.rel($P0);
    }
    public IBool isNonTerminalType(IValue $P0){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       switch(Fingerprint.getFingerprint($P0)){
       	
       case 1444258592:
       		if($isSubtypeOf($P0Type, M_Type.ADT_Symbol)){
       		  $result = (IBool)isNonTerminalType$656450ba40f23a28((IConstructor) $P0);
       		  if($result != null) return $result;
       		}
       		break;	
       case -109773488:
       		if($isSubtypeOf($P0Type, M_Type.ADT_Symbol)){
       		  $result = (IBool)isNonTerminalType$45d4cc2cb0ff3af9((IConstructor) $P0);
       		  if($result != null) return $result;
       		}
       		break;	
       case 878060304:
       		if($isSubtypeOf($P0Type, M_Type.ADT_Symbol)){
       		  $result = (IBool)isNonTerminalType$df049ee1472d1bda((IConstructor) $P0);
       		  if($result != null) return $result;
       		}
       		break;	
       case 856312:
       		if($isSubtypeOf($P0Type, M_Type.ADT_Symbol)){
       		  $result = (IBool)isNonTerminalType$0fb30df2fa348234((IConstructor) $P0);
       		  if($result != null) return $result;
       		}
       		break;	
       case 1154855088:
       		if($isSubtypeOf($P0Type, M_Type.ADT_Symbol)){
       		  $result = (IBool)isNonTerminalType$cf5a3d721600a98a((IConstructor) $P0);
       		  if($result != null) return $result;
       		}
       		break;	
       case 28290288:
       		if($isSubtypeOf($P0Type, M_Type.ADT_Symbol)){
       		  $result = (IBool)isNonTerminalType$bf497eedd90e4e59((IConstructor) $P0);
       		  if($result != null) return $result;
       		}
       		break;	
       case -333228984:
       		if($isSubtypeOf($P0Type, M_Type.ADT_Symbol)){
       		  $result = (IBool)isNonTerminalType$7ae83fd269ffb98b((IConstructor) $P0);
       		  if($result != null) return $result;
       		}
       		break;
       }
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol)){
         $result = (IBool)isNonTerminalType$81cc73368ad674dd((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue typeCast(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IValue) M_Type.typeCast($P0, $P1);
    }
    public IValue lub(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IValue) M_Type.lub($P0, $P1);
    }
    public IList shuffle(IValue $P0){ // Generated by Resolver
       return (IList) M_List.shuffle($P0);
    }
    public IList shuffle(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.shuffle($P0, $P1);
    }
    public IBool reposition_doAnno(IValue $P0, ValueRef<IBool> markLayout, ValueRef<IBool> markLexical, ValueRef<IBool> markLit, ValueRef<IBool> markRegular, ValueRef<IBool> markStart, ValueRef<IBool> markSyntax){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       switch(Fingerprint.getFingerprint($P0)){
       	
       case 101776608:
       		if($isSubtypeOf($P0Type, M_Type.ADT_Production)){
       		  $result = (IBool)doAnno$476fc1647b312203((IConstructor) $P0, markRegular);
       		  if($result != null) return $result;
       		}
       		break;	
       case 110389984:
       		if($isSubtypeOf($P0Type, M_Type.ADT_Production)){
       		  $result = (IBool)doAnno$1e2eae821115acf1((IConstructor) $P0, markLexical);
       		  if($result != null) return $result;
       		  $result = (IBool)doAnno$fe98bceb7a03583c((IConstructor) $P0, markLexical);
       		  if($result != null) return $result;
       		  $result = (IBool)doAnno$f5003b357501379a((IConstructor) $P0, markLexical);
       		  if($result != null) return $result;
       		  $result = (IBool)doAnno$333eeadea6c84ade((IConstructor) $P0, markLexical);
       		  if($result != null) return $result;
       		  $result = (IBool)doAnno$1bc5c5bdcb047ca9((IConstructor) $P0, markLayout);
       		  if($result != null) return $result;
       		  $result = (IBool)doAnno$443b8e5707168a9d((IConstructor) $P0, markLayout);
       		  if($result != null) return $result;
       		  $result = (IBool)doAnno$8a161d5223a6d4a7((IConstructor) $P0, markSyntax);
       		  if($result != null) return $result;
       		  $result = (IBool)doAnno$45962f815c073f09((IConstructor) $P0, markSyntax);
       		  if($result != null) return $result;
       		  $result = (IBool)doAnno$62935e01a02b3325((IConstructor) $P0, markSyntax);
       		  if($result != null) return $result;
       		  $result = (IBool)doAnno$6b93dbd776bc6aff((IConstructor) $P0, markSyntax);
       		  if($result != null) return $result;
       		  $result = (IBool)doAnno$9657233827fab781((IConstructor) $P0, markLit);
       		  if($result != null) return $result;
       		  $result = (IBool)doAnno$bf6dede8df2ded6b((IConstructor) $P0, markLit);
       		  if($result != null) return $result;
       		  $result = (IBool)doAnno$26d7595b979b9ffa((IConstructor) $P0, markStart);
       		  if($result != null) return $result;
       		}
       		break;
       }
       if($isSubtypeOf($P0Type, M_Type.ADT_Production)){
         $result = (IBool)doAnno$55bf5ee1cfeaac04((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
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
         $result = (IBool)subtype$3580db8bffd2c66d((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol) && $isSubtypeOf($P1Type, M_Type.ADT_Symbol)){
         $result = (IBool)M_Type.subtype$5812ee03e14f807b((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T14) && $isSubtypeOf($P1Type,$T10)){
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
       if($isSubtypeOf($P0Type, M_Type.ADT_Symbol) && $isSubtypeOf($P1Type, ADT_Associativity) && $isSubtypeOf($P2Type,$T18)){
         $result = (IConstructor)associativity$1d00327eefbb3803((IConstructor) $P0, (IConstructor) $P1, (ISet) $P2);
         if($result != null) return $result;
         $result = (IConstructor)associativity$feae421831fcd92c((IConstructor) $P0, (IConstructor) $P1, (ISet) $P2);
         if($result != null) return $result;
         $result = (IConstructor)associativity$5296642432c60eb8((IConstructor) $P0, (IConstructor) $P1, (ISet) $P2);
         if($result != null) return $result;
         return $RVF.constructor(Production_associativity_Symbol_Associativity_set_Production, new IValue[]{(IConstructor) $P0, (IConstructor) $P1, (ISet) $P2});
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IValue getOneFrom(IValue $P0){ // Generated by Resolver
       return (IValue) M_List.getOneFrom($P0);
    }
    public IString unparse(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, ADT_Tree)){
         $result = (IString)unparse$9c9aeddb45ad8087((ITree) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
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
    public ITree reposition(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       ITree $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T16)){
         $result = (ITree)reposition$b1b98e1a1cdc40fb((ITree) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
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
       ITree $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T12)){
         $result = (ITree)firstAmbiguity$854d650a0f8429db((IConstructor) $P0, (ISourceLocation) $P1);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T17)){
         $result = (ITree)firstAmbiguity$bed8155840e4e01f((IConstructor) $P0, (IString) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public ISet toRel(IValue $P0){ // Generated by Resolver
       return (ISet) M_List.toRel($P0);
    }
    public IValue sort(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T6)){
         $result = (IValue)M_List.sort$fa0b19c35a18e804((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T17)){
         return $RVF.constructor(Symbol_sort_str, new IValue[]{(IString) $P0});
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList sort(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.sort($P0, $P1);
    }
    public TypedFunctionInstance2<IValue, IValue, IValue> parser(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       TypedFunctionInstance2<IValue, IValue, IValue> $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T14)){
         $result = (TypedFunctionInstance2<IValue, IValue, IValue>)parser$6ca25a388c8ab884((IConstructor) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList dup(IValue $P0){ // Generated by Resolver
       return (IList) M_List.dup($P0);
    }
    public IList group(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.group($P0, $P1);
    }
    public ITree reposition_rec_washCC(IValue $P0){ // Generated by Resolver
       ITree $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, ADT_Tree)){
         $result = (ITree)washCC$fff1e88c6ce3820d((ITree) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString write(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       return (IString) M_Message.write($P0, $kwpActuals);
    }

    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(12298,63,<316,0>,<316,63>) 
    public IBool subtype$3580db8bffd2c66d(IConstructor $0, IConstructor $1){ 
        
        
        if($has_type_and_arity($0, Symbol_sort_str, 1)){
           IValue $arg0_2 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_2.getType(), $T2)){
              if($has_type_and_arity($1, M_Type.Symbol_adt_str_list_Symbol, 2)){
                 IValue $arg0_1 = (IValue)($aadt_subscript_int(((IConstructor)$1),0));
                 if($isComparable($arg0_1.getType(), $T17)){
                    if(((IString)$constants.get(0)/*"Tree"*/).equals($arg0_1)){
                       IValue $arg1_0 = (IValue)($aadt_subscript_int(((IConstructor)$1),1));
                       if($isComparable($arg1_0.getType(), $T2)){
                          return ((IBool)$constants.get(1)/*true*/);
                       
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(13059,167,<339,0>,<341,22>) 
    public IConstructor priority$032fe876853ebfb4(IConstructor s_0, IList $1){ 
        
        
        /*muExists*/priority: 
            do {
                final IList $subject3 = ((IList)$1);
                int $subject3_cursor = 0;
                if($isSubtypeOf($subject3.getType(),$T7)){
                   final int $subject3_len = (int)((IList)($subject3)).length();
                   if($subject3_len >= 1){
                      final int $a_18_start = (int)$subject3_cursor;
                      priority_LIST_MVARa:
                      
                      for(int $a_18_len = 0; $a_18_len <= $subject3_len - $a_18_start - 1; $a_18_len += 1){
                         IList a_1 = ((IList)($subject3.sublist($a_18_start, $a_18_len)));
                         $subject3_cursor = $a_18_start + $a_18_len;
                         final IConstructor $subject5 = ((IConstructor)($alist_subscript_int(((IList)($subject3)),$subject3_cursor)));
                         if($has_type_and_arity($subject5, Production_priority_Symbol_list_Production, 2)){
                            IValue $arg0_7 = (IValue)($aadt_subscript_int(((IConstructor)($subject5)),0));
                            if($isComparable($arg0_7.getType(), M_Type.ADT_Symbol)){
                               IValue $arg1_6 = (IValue)($aadt_subscript_int(((IConstructor)($subject5)),1));
                               if($isComparable($arg1_6.getType(), $T7)){
                                  if(true){
                                     IList b_2 = null;
                                     $subject3_cursor += 1;
                                     final int $c_34_start = (int)$subject3_cursor;
                                     priority_LIST_MVARa_CONS_priority_MVARc:
                                     
                                     for(int $c_34_len = 0; $c_34_len <= $subject3_len - $c_34_start - 0; $c_34_len += 1){
                                        IList c_3 = ((IList)($subject3.sublist($c_34_start, $c_34_len)));
                                        $subject3_cursor = $c_34_start + $c_34_len;
                                        if($subject3_cursor == $subject3_len){
                                           return ((IConstructor)(priority(((IConstructor)s_0), ((IList)($alist_add_alist(((IList)($alist_add_alist(((IList)a_1),((IList)($arg1_6))))),((IList)c_3)))))));
                                        
                                        } else {
                                           continue priority_LIST_MVARa_CONS_priority_MVARc;/*list match1*/
                                        }
                                     }
                                     continue priority_LIST_MVARa;/*computeFail*/
                                  
                                  } else {
                                     continue priority_LIST_MVARa;/*computeFail*/
                                  }
                               } else {
                                  continue priority_LIST_MVARa;/*computeFail*/
                               }
                            } else {
                               continue priority_LIST_MVARa;/*computeFail*/
                            }
                         } else {
                            continue priority_LIST_MVARa;/*computeFail*/
                         }
                      }
                      return null;
                   
                   } else {
                      return null;
                   }
                } else {
                   return null;
                }
            } while(false);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(13235,391,<344,0>,<351,30>) 
    public IConstructor associativity$1d00327eefbb3803(IConstructor s_0, IConstructor as_1, ISet $2){ 
        
        
        /*muExists*/associativity: 
            do {
                ISet $subject9 = (ISet)($2);
                associativity_SET_MVARa:
                for(IValue $elem17_for : new SubSetGenerator(((ISet)($subject9)))){
                    ISet $elem17 = (ISet) $elem17_for;
                    ISet a_2 = ((ISet)($elem17));
                    final ISet $subject11 = ((ISet)(((ISet)($subject9)).subtract(((ISet)($elem17)))));
                    associativity_SET_MVARa_CONS_choice$_DFLT_SET_ELM14:
                    for(IValue $elem13_for : ((ISet)($subject11))){
                        IConstructor $elem13 = (IConstructor) $elem13_for;
                        if($has_type_and_arity($elem13, M_Type.Production_choice_Symbol_set_Production, 2)){
                           IValue $arg0_16 = (IValue)($aadt_subscript_int(((IConstructor)($elem13)),0));
                           if($isComparable($arg0_16.getType(), M_Type.ADT_Symbol)){
                              if(true){
                                 IConstructor t_3 = null;
                                 IValue $arg1_15 = (IValue)($aadt_subscript_int(((IConstructor)($elem13)),1));
                                 if($isComparable($arg1_15.getType(), $T18)){
                                    if(true){
                                       ISet b_4 = null;
                                       final ISet $subject12 = ((ISet)(((ISet)($subject11)).delete(((IConstructor)($elem13)))));
                                       if(((ISet)($subject12)).size() == 0){
                                          return ((IConstructor)(associativity(((IConstructor)s_0), ((IConstructor)as_1), ((ISet)($aset_add_aset(((ISet)a_2),((ISet)($arg1_15))))))));
                                       
                                       } else {
                                          continue associativity_SET_MVARa_CONS_choice$_DFLT_SET_ELM14;/*redirected associativity_SET_MVARa_CONS_choice to associativity_SET_MVARa_CONS_choice$_DFLT_SET_ELM14; set pat3*/
                                       }
                                    } else {
                                       continue associativity_SET_MVARa_CONS_choice$_DFLT_SET_ELM14;/*default set elem*/
                                    }
                                 } else {
                                    continue associativity_SET_MVARa_CONS_choice$_DFLT_SET_ELM14;/*default set elem*/
                                 }
                              } else {
                                 continue associativity_SET_MVARa_CONS_choice$_DFLT_SET_ELM14;/*default set elem*/
                              }
                           } else {
                              continue associativity_SET_MVARa_CONS_choice$_DFLT_SET_ELM14;/*default set elem*/
                           }
                        } else {
                           continue associativity_SET_MVARa_CONS_choice$_DFLT_SET_ELM14;/*default set elem*/
                        }
                    }
                    continue associativity_SET_MVARa;/*set pat4*/
                                
                }
                return null;
                            
            } while(false);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(13643,175,<353,0>,<354,39>) 
    public IConstructor associativity$feae421831fcd92c(IConstructor rhs_0, IConstructor a_1, ISet $2){ 
        
        
        /*muExists*/associativity: 
            do {
                ISet $subject18 = (ISet)($2);
                associativity_SET_CONS_associativity$_DFLT_SET_ELM24:
                for(IValue $elem23_for : ((ISet)($subject18))){
                    IConstructor $elem23 = (IConstructor) $elem23_for;
                    if($has_type_and_arity($elem23, Production_associativity_Symbol_Associativity_set_Production, 3)){
                       IValue $arg0_27 = (IValue)($aadt_subscript_int(((IConstructor)($elem23)),0));
                       if($isComparable($arg0_27.getType(), M_Type.ADT_Symbol)){
                          if((rhs_0 != null)){
                             if(rhs_0.match($arg0_27)){
                                IValue $arg1_26 = (IValue)($aadt_subscript_int(((IConstructor)($elem23)),1));
                                if($isComparable($arg1_26.getType(), ADT_Associativity)){
                                   if(true){
                                      IConstructor b_2 = null;
                                      IValue $arg2_25 = (IValue)($aadt_subscript_int(((IConstructor)($elem23)),2));
                                      if($isComparable($arg2_25.getType(), $T18)){
                                         if(true){
                                            ISet alts_3 = null;
                                            final ISet $subject20 = ((ISet)(((ISet)($subject18)).delete(((IConstructor)($elem23)))));
                                            associativity_SET_CONS_associativity_MVARrest:
                                            for(IValue $elem22_for : new SubSetGenerator(((ISet)($subject20)))){
                                                ISet $elem22 = (ISet) $elem22_for;
                                                ISet rest_4 = ((ISet)($elem22));
                                                final ISet $subject21 = ((ISet)(((ISet)($subject20)).subtract(((ISet)($elem22)))));
                                                if(((ISet)($subject21)).size() == 0){
                                                   return ((IConstructor)(associativity(((IConstructor)($arg0_27)), ((IConstructor)a_1), ((ISet)($aset_add_aset(((ISet)rest_4),((ISet)($arg2_25))))))));
                                                
                                                } else {
                                                   continue associativity_SET_CONS_associativity_MVARrest;/*set pat3*/
                                                }
                                            }
                                            continue associativity_SET_CONS_associativity$_DFLT_SET_ELM24;/*redirected associativity_SET_CONS_associativity to associativity_SET_CONS_associativity$_DFLT_SET_ELM24; set pat4*/
                                                        
                                         } else {
                                            continue associativity_SET_CONS_associativity$_DFLT_SET_ELM24;/*default set elem*/
                                         }
                                      } else {
                                         continue associativity_SET_CONS_associativity$_DFLT_SET_ELM24;/*default set elem*/
                                      }
                                   } else {
                                      continue associativity_SET_CONS_associativity$_DFLT_SET_ELM24;/*default set elem*/
                                   }
                                } else {
                                   continue associativity_SET_CONS_associativity$_DFLT_SET_ELM24;/*default set elem*/
                                }
                             } else {
                                continue associativity_SET_CONS_associativity$_DFLT_SET_ELM24;/*default set elem*/
                             }
                          } else {
                             rhs_0 = ((IConstructor)($arg0_27));
                             IValue $arg1_26 = (IValue)($aadt_subscript_int(((IConstructor)($elem23)),1));
                             if($isComparable($arg1_26.getType(), ADT_Associativity)){
                                if(true){
                                   IConstructor b_2 = null;
                                   IValue $arg2_25 = (IValue)($aadt_subscript_int(((IConstructor)($elem23)),2));
                                   if($isComparable($arg2_25.getType(), $T18)){
                                      if(true){
                                         ISet alts_3 = null;
                                         final ISet $subject20 = ((ISet)(((ISet)($subject18)).delete(((IConstructor)($elem23)))));
                                         associativity_SET_CONS_associativity_MVARrest:
                                         for(IValue $elem22_for : new SubSetGenerator(((ISet)($subject20)))){
                                             ISet $elem22 = (ISet) $elem22_for;
                                             ISet rest_4 = ((ISet)($elem22));
                                             final ISet $subject21 = ((ISet)(((ISet)($subject20)).subtract(((ISet)($elem22)))));
                                             if(((ISet)($subject21)).size() == 0){
                                                return ((IConstructor)(associativity(((IConstructor)($arg0_27)), ((IConstructor)a_1), ((ISet)($aset_add_aset(((ISet)rest_4),((ISet)($arg2_25))))))));
                                             
                                             } else {
                                                continue associativity_SET_CONS_associativity_MVARrest;/*set pat3*/
                                             }
                                         }
                                         continue associativity_SET_CONS_associativity$_DFLT_SET_ELM24;/*redirected associativity_SET_CONS_associativity to associativity_SET_CONS_associativity$_DFLT_SET_ELM24; set pat4*/
                                                     
                                      } else {
                                         continue associativity_SET_CONS_associativity$_DFLT_SET_ELM24;/*default set elem*/
                                      }
                                   } else {
                                      continue associativity_SET_CONS_associativity$_DFLT_SET_ELM24;/*default set elem*/
                                   }
                                } else {
                                   continue associativity_SET_CONS_associativity$_DFLT_SET_ELM24;/*default set elem*/
                                }
                             } else {
                                continue associativity_SET_CONS_associativity$_DFLT_SET_ELM24;/*default set elem*/
                             }
                          }
                       } else {
                          continue associativity_SET_CONS_associativity$_DFLT_SET_ELM24;/*default set elem*/
                       }
                    } else {
                       continue associativity_SET_CONS_associativity$_DFLT_SET_ELM24;/*default set elem*/
                    }
                }
                return null;
                            
            } while(false);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(13882,147,<356,0>,<357,35>) 
    public IConstructor associativity$5296642432c60eb8(IConstructor s_0, IConstructor as_1, ISet $2){ 
        
        
        /*muExists*/associativity: 
            do {
                ISet $subject29 = (ISet)($2);
                associativity_SET_MVARa:
                for(IValue $elem37_for : new SubSetGenerator(((ISet)($subject29)))){
                    ISet $elem37 = (ISet) $elem37_for;
                    ISet a_2 = ((ISet)($elem37));
                    final ISet $subject31 = ((ISet)(((ISet)($subject29)).subtract(((ISet)($elem37)))));
                    associativity_SET_MVARa_CONS_priority$_DFLT_SET_ELM34:
                    for(IValue $elem33_for : ((ISet)($subject31))){
                        IConstructor $elem33 = (IConstructor) $elem33_for;
                        if($has_type_and_arity($elem33, Production_priority_Symbol_list_Production, 2)){
                           IValue $arg0_36 = (IValue)($aadt_subscript_int(((IConstructor)($elem33)),0));
                           if($isComparable($arg0_36.getType(), M_Type.ADT_Symbol)){
                              if(true){
                                 IConstructor t_3 = null;
                                 IValue $arg1_35 = (IValue)($aadt_subscript_int(((IConstructor)($elem33)),1));
                                 if($isComparable($arg1_35.getType(), $T7)){
                                    if(true){
                                       IList b_4 = null;
                                       final ISet $subject32 = ((ISet)(((ISet)($subject31)).delete(((IConstructor)($elem33)))));
                                       if(((ISet)($subject32)).size() == 0){
                                          final ISetWriter $writer28 = (ISetWriter)$RVF.setWriter();
                                          ;
                                          $setwriter_splice($writer28,a_2);
                                          $setwriter_splice($writer28,$arg1_35);
                                          return ((IConstructor)(associativity(((IConstructor)s_0), ((IConstructor)as_1), ((ISet)($writer28.done())))));
                                       
                                       } else {
                                          continue associativity_SET_MVARa_CONS_priority$_DFLT_SET_ELM34;/*redirected associativity_SET_MVARa_CONS_priority to associativity_SET_MVARa_CONS_priority$_DFLT_SET_ELM34; set pat3*/
                                       }
                                    } else {
                                       continue associativity_SET_MVARa_CONS_priority$_DFLT_SET_ELM34;/*default set elem*/
                                    }
                                 } else {
                                    continue associativity_SET_MVARa_CONS_priority$_DFLT_SET_ELM34;/*default set elem*/
                                 }
                              } else {
                                 continue associativity_SET_MVARa_CONS_priority$_DFLT_SET_ELM34;/*default set elem*/
                              }
                           } else {
                              continue associativity_SET_MVARa_CONS_priority$_DFLT_SET_ELM34;/*default set elem*/
                           }
                        } else {
                           continue associativity_SET_MVARa_CONS_priority$_DFLT_SET_ELM34;/*default set elem*/
                        }
                    }
                    continue associativity_SET_MVARa;/*set pat4*/
                                
                }
                return null;
                            
            } while(false);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(18159,5462,<407,0>,<482,251>) 
    public ITree parse$6f6b93176be80747(IConstructor begin_0, IString input_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_parse$6f6b93176be80747;
    
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T15.match(begin_0.getType(), $typeBindings)){
           final ITree $result38 = ((ITree)(((TypedFunctionInstance2<IValue, IValue, IValue>)$me.parser(((IConstructor)begin_0), Util.kwpMap("allowAmbiguity", ((IBool) ($kwpActuals.containsKey("allowAmbiguity") ? $kwpActuals.get("allowAmbiguity") : $kwpDefaults.get("allowAmbiguity"))), "maxAmbDepth", ((IInteger) ($kwpActuals.containsKey("maxAmbDepth") ? $kwpActuals.get("maxAmbDepth") : $kwpDefaults.get("maxAmbDepth"))), "allowRecovery", ((IBool) ($kwpActuals.containsKey("allowRecovery") ? $kwpActuals.get("allowRecovery") : $kwpDefaults.get("allowRecovery"))), "maxRecoveryAttempts", ((IInteger) ($kwpActuals.containsKey("maxRecoveryAttempts") ? $kwpActuals.get("maxRecoveryAttempts") : $kwpDefaults.get("maxRecoveryAttempts"))), "maxRecoveryTokens", ((IInteger) ($kwpActuals.containsKey("maxRecoveryTokens") ? $kwpActuals.get("maxRecoveryTokens") : $kwpDefaults.get("maxRecoveryTokens"))), "hasSideEffects", ((IBool) ($kwpActuals.containsKey("hasSideEffects") ? $kwpActuals.get("hasSideEffects") : $kwpDefaults.get("hasSideEffects"))), "filters", ((ISet) ($kwpActuals.containsKey("filters") ? $kwpActuals.get("filters") : $kwpDefaults.get("filters")))))).typedCall(((IValue)input_1), ((ISourceLocation)($create_aloc(((IString)$constants.get(7)/*"unknown:///"*/)))))));
           if($T19.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result38.getType(),$T19)){
              return ((ITree)($result38));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(23625,485,<484,0>,<485,244>) 
    public ITree parse$66e93821e413f32f(IConstructor begin_0, IString input_1, ISourceLocation origin_2, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_parse$66e93821e413f32f;
    
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T15.match(begin_0.getType(), $typeBindings)){
           final ITree $result39 = ((ITree)(((TypedFunctionInstance2<IValue, IValue, IValue>)$me.parser(((IConstructor)begin_0), Util.kwpMap("allowAmbiguity", ((IBool) ($kwpActuals.containsKey("allowAmbiguity") ? $kwpActuals.get("allowAmbiguity") : $kwpDefaults.get("allowAmbiguity"))), "maxAmbDepth", ((IInteger) ($kwpActuals.containsKey("maxAmbDepth") ? $kwpActuals.get("maxAmbDepth") : $kwpDefaults.get("maxAmbDepth"))), "allowRecovery", ((IBool) ($kwpActuals.containsKey("allowRecovery") ? $kwpActuals.get("allowRecovery") : $kwpDefaults.get("allowRecovery"))), "maxRecoveryAttempts", ((IInteger) ($kwpActuals.containsKey("maxRecoveryAttempts") ? $kwpActuals.get("maxRecoveryAttempts") : $kwpDefaults.get("maxRecoveryAttempts"))), "maxRecoveryTokens", ((IInteger) ($kwpActuals.containsKey("maxRecoveryTokens") ? $kwpActuals.get("maxRecoveryTokens") : $kwpDefaults.get("maxRecoveryTokens"))), "hasSideEffects", ((IBool) ($kwpActuals.containsKey("hasSideEffects") ? $kwpActuals.get("hasSideEffects") : $kwpDefaults.get("hasSideEffects"))), "filters", ((ISet) ($kwpActuals.containsKey("filters") ? $kwpActuals.get("filters") : $kwpDefaults.get("filters")))))).typedCall(((IValue)input_1), ((ISourceLocation)origin_2))));
           if($T19.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result39.getType(),$T19)){
              return ((ITree)($result39));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(24116,472,<487,0>,<488,243>) 
    public ITree parse$47fb5ed5d88ced9a(IConstructor begin_0, ISourceLocation input_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_parse$47fb5ed5d88ced9a;
    
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T15.match(begin_0.getType(), $typeBindings)){
           final ITree $result40 = ((ITree)(((TypedFunctionInstance2<IValue, IValue, IValue>)$me.parser(((IConstructor)begin_0), Util.kwpMap("allowAmbiguity", ((IBool) ($kwpActuals.containsKey("allowAmbiguity") ? $kwpActuals.get("allowAmbiguity") : $kwpDefaults.get("allowAmbiguity"))), "maxAmbDepth", ((IInteger) ($kwpActuals.containsKey("maxAmbDepth") ? $kwpActuals.get("maxAmbDepth") : $kwpDefaults.get("maxAmbDepth"))), "allowRecovery", ((IBool) ($kwpActuals.containsKey("allowRecovery") ? $kwpActuals.get("allowRecovery") : $kwpDefaults.get("allowRecovery"))), "maxRecoveryAttempts", ((IInteger) ($kwpActuals.containsKey("maxRecoveryAttempts") ? $kwpActuals.get("maxRecoveryAttempts") : $kwpDefaults.get("maxRecoveryAttempts"))), "maxRecoveryTokens", ((IInteger) ($kwpActuals.containsKey("maxRecoveryTokens") ? $kwpActuals.get("maxRecoveryTokens") : $kwpDefaults.get("maxRecoveryTokens"))), "hasSideEffects", ((IBool) ($kwpActuals.containsKey("hasSideEffects") ? $kwpActuals.get("hasSideEffects") : $kwpDefaults.get("hasSideEffects"))), "filters", ((ISet) ($kwpActuals.containsKey("filters") ? $kwpActuals.get("filters") : $kwpDefaults.get("filters")))))).typedCall(((IValue)input_1), ((ISourceLocation)input_1))));
           if($T19.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result40.getType(),$T19)){
              return ((ITree)($result40));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(24594,3134,<491,0>,<522,239>) 
    public TypedFunctionInstance2<IValue, IValue, IValue> parser$6ca25a388c8ab884(IConstructor grammar_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_parser$6ca25a388c8ab884;
    
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T14.match(grammar_0.getType(), $typeBindings)){
           final TypedFunctionInstance2<IValue, IValue, IValue> $result41 = ((TypedFunctionInstance2<IValue, IValue, IValue>)((TypedFunctionInstance2<IValue, IValue, IValue>)$Prelude.parser(grammar_0, (IBool)($kwpActuals.containsKey("allowAmbiguity") ? $kwpActuals.get("allowAmbiguity") : $kwpDefaults.get("allowAmbiguity")), (IInteger)($kwpActuals.containsKey("maxAmbDepth") ? $kwpActuals.get("maxAmbDepth") : $kwpDefaults.get("maxAmbDepth")), (IBool)($kwpActuals.containsKey("allowRecovery") ? $kwpActuals.get("allowRecovery") : $kwpDefaults.get("allowRecovery")), (IInteger)($kwpActuals.containsKey("maxRecoveryAttempts") ? $kwpActuals.get("maxRecoveryAttempts") : $kwpDefaults.get("maxRecoveryAttempts")), (IInteger)($kwpActuals.containsKey("maxRecoveryTokens") ? $kwpActuals.get("maxRecoveryTokens") : $kwpDefaults.get("maxRecoveryTokens")), (IBool)($kwpActuals.containsKey("hasSideEffects") ? $kwpActuals.get("hasSideEffects") : $kwpDefaults.get("hasSideEffects")), (ISet)($kwpActuals.containsKey("filters") ? $kwpActuals.get("filters") : $kwpDefaults.get("filters")))));
           if($T44.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result41.getType(),$T44)){
              return ((TypedFunctionInstance2<IValue, IValue, IValue>)($result41));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(27733,869,<524,0>,<535,132>) 
    public TypedFunctionInstance2<IValue, IValue, IValue> firstAmbiguityFinder$ce3bf029110f9986(IConstructor grammar_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_firstAmbiguityFinder$ce3bf029110f9986;
    
        return ((TypedFunctionInstance2<IValue, IValue, IValue>)((TypedFunctionInstance2<IValue, IValue, IValue>)$Prelude.firstAmbiguityFinder(grammar_0, (IBool)($kwpActuals.containsKey("hasSideEffects") ? $kwpActuals.get("hasSideEffects") : $kwpDefaults.get("hasSideEffects")), (ISet)($kwpActuals.containsKey("filters") ? $kwpActuals.get("filters") : $kwpDefaults.get("filters")))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(28607,705,<537,0>,<543,263>) 
    public TypedFunctionInstance3<IValue, IValue, IValue, IValue> parsers$a57d129a731dc0ad(IConstructor grammar_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_parsers$a57d129a731dc0ad;
    
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T14.match(grammar_0.getType(), $typeBindings)){
           final TypedFunctionInstance3<IValue, IValue, IValue, IValue> $result42 = ((TypedFunctionInstance3<IValue, IValue, IValue, IValue>)((TypedFunctionInstance3<IValue, IValue, IValue, IValue>)$Prelude.parsers(grammar_0, (IBool)($kwpActuals.containsKey("allowAmbiguity") ? $kwpActuals.get("allowAmbiguity") : $kwpDefaults.get("allowAmbiguity")), (IInteger)($kwpActuals.containsKey("maxAmbDepth") ? $kwpActuals.get("maxAmbDepth") : $kwpDefaults.get("maxAmbDepth")), (IBool)($kwpActuals.containsKey("allowRecovery") ? $kwpActuals.get("allowRecovery") : $kwpDefaults.get("allowRecovery")), (IInteger)($kwpActuals.containsKey("maxRecoveryAttempts") ? $kwpActuals.get("maxRecoveryAttempts") : $kwpDefaults.get("maxRecoveryAttempts")), (IInteger)($kwpActuals.containsKey("maxRecoveryTokens") ? $kwpActuals.get("maxRecoveryTokens") : $kwpDefaults.get("maxRecoveryTokens")), (IBool)($kwpActuals.containsKey("hasSideEffects") ? $kwpActuals.get("hasSideEffects") : $kwpDefaults.get("hasSideEffects")), (ISet)($kwpActuals.containsKey("filters") ? $kwpActuals.get("filters") : $kwpDefaults.get("filters")))));
           if($T48.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result42.getType(),$T48)){
              return ((TypedFunctionInstance3<IValue, IValue, IValue, IValue>)($result42));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(29317,895,<545,0>,<556,158>) 
    public TypedFunctionInstance3<IValue, IValue, IValue, IValue> firstAmbiguityFinders$0d5a93ee0e899388(IConstructor grammar_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_firstAmbiguityFinders$0d5a93ee0e899388;
    
        return ((TypedFunctionInstance3<IValue, IValue, IValue, IValue>)((TypedFunctionInstance3<IValue, IValue, IValue, IValue>)$Prelude.firstAmbiguityFinders(grammar_0, (IBool)($kwpActuals.containsKey("hasSideEffects") ? $kwpActuals.get("hasSideEffects") : $kwpDefaults.get("hasSideEffects")), (ISet)($kwpActuals.containsKey("filters") ? $kwpActuals.get("filters") : $kwpDefaults.get("filters")))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(30217,626,<558,0>,<567,54>) 
    public ITree firstAmbiguity$bed8155840e4e01f(IConstructor begin_0, IString input_1){ 
        
        
        return ((ITree)(((TypedFunctionInstance2<IValue, IValue, IValue>)$me.firstAmbiguityFinder(((IConstructor)begin_0), Util.kwpMap())).typedCall(((IValue)input_1), ((ISourceLocation)($create_aloc(((IString)$constants.get(7)/*"unknown:///"*/)))))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(30847,96,<569,0>,<570,46>) 
    public ITree firstAmbiguity$854d650a0f8429db(IConstructor begin_0, ISourceLocation input_1){ 
        
        
        return ((ITree)(((TypedFunctionInstance2<IValue, IValue, IValue>)$me.firstAmbiguityFinder(((IConstructor)begin_0), Util.kwpMap())).typedCall(((IValue)input_1), ((ISourceLocation)input_1))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(30947,1097,<572,0>,<593,61>) 
    public void storeParsers$fc97d9cdf0ed0c14(IConstructor grammar_0, ISourceLocation saveLocation_1){ 
        
        
        $Prelude.storeParsers(grammar_0, saveLocation_1); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(32048,1633,<595,0>,<634,266>) 
    public TypedFunctionInstance3<IValue, IValue, IValue, IValue> loadParsers$d8c91830dd2332d3(ISourceLocation savedParsers_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_loadParsers$d8c91830dd2332d3;
    
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        final TypedFunctionInstance3<IValue, IValue, IValue, IValue> $result43 = ((TypedFunctionInstance3<IValue, IValue, IValue, IValue>)((TypedFunctionInstance3<IValue, IValue, IValue, IValue>)$Prelude.loadParsers(savedParsers_0, (IBool)($kwpActuals.containsKey("allowAmbiguity") ? $kwpActuals.get("allowAmbiguity") : $kwpDefaults.get("allowAmbiguity")), (IInteger)($kwpActuals.containsKey("maxAmbDepth") ? $kwpActuals.get("maxAmbDepth") : $kwpDefaults.get("maxAmbDepth")), (IBool)($kwpActuals.containsKey("allowRecovery") ? $kwpActuals.get("allowRecovery") : $kwpDefaults.get("allowRecovery")), (IInteger)($kwpActuals.containsKey("maxRecoveryAttempts") ? $kwpActuals.get("maxRecoveryAttempts") : $kwpDefaults.get("maxRecoveryAttempts")), (IInteger)($kwpActuals.containsKey("maxRecoveryTokens") ? $kwpActuals.get("maxRecoveryTokens") : $kwpDefaults.get("maxRecoveryTokens")), (IBool)($kwpActuals.containsKey("hasSideEffects") ? $kwpActuals.get("hasSideEffects") : $kwpDefaults.get("hasSideEffects")), (ISet)($kwpActuals.containsKey("filters") ? $kwpActuals.get("filters") : $kwpDefaults.get("filters")))));
        if($T48.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result43.getType(),$T48)){
           return ((TypedFunctionInstance3<IValue, IValue, IValue, IValue>)($result43));
        
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(33685,561,<636,0>,<642,265>) 
    public TypedFunctionInstance2<IValue, IValue, IValue> loadParser$a512631cb177aade(IConstructor nonterminal_0, ISourceLocation savedParsers_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_loadParser$a512631cb177aade;
    
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T50.match(nonterminal_0.getType(), $typeBindings)){
           final TypedFunctionInstance2<IValue, IValue, IValue> $result44 = ((TypedFunctionInstance2<IValue, IValue, IValue>)((TypedFunctionInstance2<IValue, IValue, IValue>)$Prelude.loadParser(nonterminal_0, savedParsers_1, (IBool)($kwpActuals.containsKey("allowAmbiguity") ? $kwpActuals.get("allowAmbiguity") : $kwpDefaults.get("allowAmbiguity")), (IInteger)($kwpActuals.containsKey("maxAmbDepth") ? $kwpActuals.get("maxAmbDepth") : $kwpDefaults.get("maxAmbDepth")), (IBool)($kwpActuals.containsKey("allowRecovery") ? $kwpActuals.get("allowRecovery") : $kwpDefaults.get("allowRecovery")), (IInteger)($kwpActuals.containsKey("maxRecoveryAttempts") ? $kwpActuals.get("maxRecoveryAttempts") : $kwpDefaults.get("maxRecoveryAttempts")), (IInteger)($kwpActuals.containsKey("maxRecoveryTokens") ? $kwpActuals.get("maxRecoveryTokens") : $kwpDefaults.get("maxRecoveryTokens")), (IBool)($kwpActuals.containsKey("hasSideEffects") ? $kwpActuals.get("hasSideEffects") : $kwpDefaults.get("hasSideEffects")), (ISet)($kwpActuals.containsKey("filters") ? $kwpActuals.get("filters") : $kwpDefaults.get("filters")))));
           if($T51.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result44.getType(),$T51)){
              return ((TypedFunctionInstance2<IValue, IValue, IValue>)($result44));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(34250,600,<644,0>,<663,34>) 
    public IString unparse$9c9aeddb45ad8087(ITree tree_0){ 
        
        
        final Template $template45 = (Template)new Template($RVF, "");
        $template45.addVal(tree_0);
        return ((IString)($template45.close()));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(34854,93,<665,0>,<666,50>) 
    public IString printSymbol$4640d5b37e63b3ac(IConstructor sym_0, IBool withLayout_1){ 
        
        
        return ((IString)((IString)$Prelude.printSymbol(sym_0, withLayout_1)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(34951,5073,<668,0>,<788,53>) 
    public IValue implode$cb791704be7a3ddd(IConstructor t_0, ITree tree_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T14.match(t_0.getType(), $typeBindings)){
           final IValue $result46 = ((IValue)((IValue)$Prelude.implode(t_0, tree_1)));
           if($T45.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result46.getType(),$T45)){
              return ((IValue)($result46));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(40154,487,<793,0>,<805,1>) 
    public IConstructor treeAt$25490092eb82378f(IConstructor t_0, ISourceLocation l_1, ITree a_2){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T15.match(t_0.getType(), $typeBindings)){
           if(true){
              if(true){
                 if($has_type_and_arity(a_2, Tree_appl_Production_list_Tree, 2)){
                    IValue $arg0_53 = (IValue)($aadt_subscript_int(((ITree)a_2),0));
                    if($isComparable($arg0_53.getType(), $T2)){
                       IValue $arg1_52 = (IValue)($aadt_subscript_int(((ITree)a_2),1));
                       if($isComparable($arg1_52.getType(), $T2)){
                          if($is_defined_value($guarded_aadt_get_field(((ITree)a_2),  "src"))){
                             final ISourceLocation $subject_val50 = ((ISourceLocation)($getkw_Tree_src(((ITree)a_2))));
                             ISourceLocation al_3 = null;
                             if((((IBool)($aint_lessequal_aint(((IInteger)(((IInteger)($aloc_get_field(((ISourceLocation)($subject_val50)), "offset"))))),((IInteger)(((IInteger)($aloc_get_field(((ISourceLocation)l_1), "offset"))))))))).getValue()){
                               if((((IBool)($aint_less_aint(((IInteger)($aint_add_aint(((IInteger)(((IInteger)($aloc_get_field(((ISourceLocation)($subject_val50)), "offset"))))),((IInteger)(((IInteger)($aloc_get_field(((ISourceLocation)($subject_val50)), "length")))))))),((IInteger)($aint_add_aint(((IInteger)(((IInteger)($aloc_get_field(((ISourceLocation)l_1), "offset"))))),((IInteger)(((IInteger)($aloc_get_field(((ISourceLocation)l_1), "length"))))))))).not()))).getValue()){
                                 /*muExists*/FOR1: 
                                     do {
                                         FOR1_GEN40435:
                                         for(IValue $elem49_for : ((IList)(((IList)($aadt_get_field(((IConstructor)a_2), "args")))))){
                                             ITree $elem49 = (ITree) $elem49_for;
                                             ITree arg_4 = null;
                                             final IConstructor $subject_val47 = ((IConstructor)(treeAt(((IConstructor)t_0), ((ISourceLocation)l_1), ((ITree)($elem49)))));
                                             if($has_type_and_arity($subject_val47, TreeSearchResult_1_treeFound_, 1)){
                                                IValue $arg0_48 = (IValue)($aadt_subscript_int(((IConstructor)($subject_val47)),0));
                                                if($isComparable($arg0_48.getType(), ADT_Tree)){
                                                   if($isSubtypeOf($arg0_48.getType(),ADT_Tree.instantiate($typeBindings))){
                                                      IConstructor r_5 = ((IConstructor)($subject_val47));
                                                      final IConstructor $result51 = ((IConstructor)r_5);
                                                      if(ADT_TreeSearchResult_1.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result51.getType(),ADT_TreeSearchResult_1)){
                                                         return ((IConstructor)($result51));
                                                      
                                                      } else {
                                                         return null;
                                                      }
                                                   } else {
                                                      continue FOR1_GEN40435;
                                                   }
                                                } else {
                                                   continue FOR1_GEN40435;
                                                }
                                             } else {
                                                continue FOR1_GEN40435;
                                             }
                                         }
                                         continue FOR1;
                                                     
                                     } while(false);
                                 /* void:  muCon([]) */if($isSubtypeOf(a_2.getType(),ADT_Tree.instantiate($typeBindings))){
                                    ITree tree_6 = null;
                                    final IConstructor $result51 = ((IConstructor)($RVF.constructor(TreeSearchResult_Tree_treeFound_Tree, new IValue[]{((ITree)a_2)})));
                                    if(ADT_TreeSearchResult_1.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result51.getType(),ADT_TreeSearchResult_1)){
                                       return ((IConstructor)($result51));
                                    
                                    } else {
                                       return null;
                                    }
                                 }
                               
                               }
                             
                             }
                          
                          }
                          final IConstructor $result51 = ((IConstructor)($RVF.constructor(TreeSearchResult_1_treeNotFound_, new IValue[]{})));
                          if(ADT_TreeSearchResult_1.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result51.getType(),ADT_TreeSearchResult_1)){
                             return ((IConstructor)($result51));
                          
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(40645,95,<807,0>,<807,95>) 
    public IConstructor treeAt$613659a183983e0a(IConstructor t_0, ISourceLocation l_1, ITree root_2){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T15.match(t_0.getType(), $typeBindings)){
           final IConstructor $result54 = ((IConstructor)($RVF.constructor(TreeSearchResult_1_treeNotFound_, new IValue[]{})));
           if(ADT_TreeSearchResult_1.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result54.getType(),ADT_TreeSearchResult_1)){
              return ((IConstructor)($result54));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(40744,58,<809,0>,<809,58>) 
    public IBool sameType$b2131ce047a25220(IConstructor $0, IConstructor t_1){ 
        
        
        if($has_type_and_arity($0, M_Type.Symbol_label_str_Symbol, 2)){
           IValue $arg0_56 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_56.getType(), $T2)){
              IValue $arg1_55 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
              if($isComparable($arg1_55.getType(), M_Type.ADT_Symbol)){
                 IConstructor s_0 = null;
                 return ((IBool)(sameType(((IConstructor)($arg1_55)), ((IConstructor)t_1))));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(40804,58,<810,0>,<810,58>) 
    public IBool sameType$e14a99b94618e205(IConstructor s_0, IConstructor $1){ 
        
        
        if($has_type_and_arity($1, M_Type.Symbol_label_str_Symbol, 2)){
           IValue $arg0_58 = (IValue)($aadt_subscript_int(((IConstructor)$1),0));
           if($isComparable($arg0_58.getType(), $T2)){
              IValue $arg1_57 = (IValue)($aadt_subscript_int(((IConstructor)$1),1));
              if($isComparable($arg1_57.getType(), M_Type.ADT_Symbol)){
                 IConstructor t_1 = null;
                 return ((IBool)(sameType(((IConstructor)s_0), ((IConstructor)($arg1_57)))));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(40864,64,<811,0>,<811,64>) 
    public IBool sameType$74e4ba65f635b551(IConstructor s_0, IConstructor $1){ 
        
        
        if($has_type_and_arity($1, Symbol_conditional_Symbol_set_Condition, 2)){
           IValue $arg0_60 = (IValue)($aadt_subscript_int(((IConstructor)$1),0));
           if($isComparable($arg0_60.getType(), M_Type.ADT_Symbol)){
              IConstructor t_1 = null;
              IValue $arg1_59 = (IValue)($aadt_subscript_int(((IConstructor)$1),1));
              if($isComparable($arg1_59.getType(), $T2)){
                 return ((IBool)(sameType(((IConstructor)s_0), ((IConstructor)($arg0_60)))));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(40930,65,<812,0>,<812,65>) 
    public IBool sameType$eac00f42fd751061(IConstructor $0, IConstructor t_1){ 
        
        
        if($has_type_and_arity($0, Symbol_conditional_Symbol_set_Condition, 2)){
           IValue $arg0_62 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_62.getType(), M_Type.ADT_Symbol)){
              IConstructor s_0 = null;
              IValue $arg1_61 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
              if($isComparable($arg1_61.getType(), $T2)){
                 return ((IBool)(sameType(((IConstructor)($arg0_62)), ((IConstructor)t_1))));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(40997,34,<813,0>,<813,34>) 
    public IBool sameType$73bb9be231adc5f2(IConstructor s_0, IConstructor s){ 
        
        
        if((s_0 != null)){
           if(s_0.match(s)){
              return ((IBool)$constants.get(1)/*true*/);
           
           } else {
              return null;
           }
        } else {
           s_0 = ((IConstructor)s);
           return ((IBool)$constants.get(1)/*true*/);
        
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(41033,50,<814,0>,<814,50>) 
    public IBool sameType$0bc781858a8a2455(IConstructor s_0, IConstructor t_1){ 
        
        
        return ((IBool)$constants.get(2)/*false*/);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(41087,116,<816,0>,<817,52>) 
    public IBool isNonTerminalType$bf497eedd90e4e59(IConstructor $0){ 
        
        
        if($has_type_and_arity($0, Symbol_sort_str, 1)){
           IValue $arg0_63 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_63.getType(), $T17)){
              return ((IBool)$constants.get(1)/*true*/);
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(41205,51,<818,0>,<818,51>) 
    public IBool isNonTerminalType$0fb30df2fa348234(IConstructor $0){ 
        
        
        if($has_type_and_arity($0, Symbol_lex_str, 1)){
           IValue $arg0_64 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_64.getType(), $T17)){
              return ((IBool)$constants.get(1)/*true*/);
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(41258,55,<819,0>,<819,55>) 
    public IBool isNonTerminalType$7ae83fd269ffb98b(IConstructor $0){ 
        
        
        if($has_type_and_arity($0, Symbol_layouts_str, 1)){
           IValue $arg0_65 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_65.getType(), $T17)){
              return ((IBool)$constants.get(1)/*true*/);
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(41315,56,<820,0>,<820,56>) 
    public IBool isNonTerminalType$45d4cc2cb0ff3af9(IConstructor $0){ 
        
        
        if($has_type_and_arity($0, Symbol_keywords_str, 1)){
           IValue $arg0_66 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_66.getType(), $T17)){
              return ((IBool)$constants.get(1)/*true*/);
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(41373,82,<821,0>,<821,82>) 
    public IBool isNonTerminalType$656450ba40f23a28(IConstructor $0){ 
        
        
        if($has_type_and_arity($0, Symbol_parameterized_sort_str_list_Symbol, 2)){
           IValue $arg0_68 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_68.getType(), $T17)){
              IValue $arg1_67 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
              if($isComparable($arg1_67.getType(), $T52)){
                 return ((IBool)$constants.get(1)/*true*/);
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(41457,81,<822,0>,<822,81>) 
    public IBool isNonTerminalType$cf5a3d721600a98a(IConstructor $0){ 
        
        
        if($has_type_and_arity($0, Symbol_parameterized_lex_str_list_Symbol, 2)){
           IValue $arg0_70 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_70.getType(), $T17)){
              IValue $arg1_69 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
              if($isComparable($arg1_69.getType(), $T52)){
                 return ((IBool)$constants.get(1)/*true*/);
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(41540,72,<823,0>,<823,72>) 
    public IBool isNonTerminalType$df049ee1472d1bda(IConstructor $0){ 
        
        
        if($has_type_and_arity($0, Symbol_start_Symbol, 1)){
           IValue $arg0_71 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_71.getType(), M_Type.ADT_Symbol)){
              IConstructor s_0 = null;
              return ((IBool)(isNonTerminalType(((IConstructor)($arg0_71)))));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(41614,49,<824,0>,<824,49>) 
    public IBool isNonTerminalType$81cc73368ad674dd(IConstructor s_0){ 
        
        
        return ((IBool)$constants.get(2)/*false*/);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(45574,121,<894,4>,<895,60>) 
    public IBool doAnno$55bf5ee1cfeaac04(IConstructor $__0){ 
        
        
        return ((IBool)$constants.get(2)/*false*/);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(45701,62,<896,4>,<896,66>) 
    public IBool doAnno$1e2eae821115acf1(IConstructor $0, ValueRef<IBool> markLexical){ 
        
        
        if($has_type_and_arity($0, Production_prod_Symbol_list_Symbol_set_Attr, 3)){
           IValue $arg0_74 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_74.getType(), M_Type.ADT_Symbol)){
              if($has_type_and_arity($arg0_74, Symbol_lex_str, 1)){
                 IValue $arg0_75 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_74)),0));
                 if($isComparable($arg0_75.getType(), $T2)){
                    IValue $arg1_73 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
                    if($isComparable($arg1_73.getType(), $T2)){
                       IValue $arg2_72 = (IValue)($aadt_subscript_int(((IConstructor)$0),2));
                       if($isComparable($arg2_72.getType(), $T2)){
                          return ((IBool)(((IBool) markLexical.getValue())));
                       
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(45769,62,<897,4>,<897,66>) 
    public IBool doAnno$fe98bceb7a03583c(IConstructor $0, ValueRef<IBool> markLexical){ 
        
        
        if($has_type_and_arity($0, Production_prod_Symbol_list_Symbol_set_Attr, 3)){
           IValue $arg0_78 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_78.getType(), M_Type.ADT_Symbol)){
              if($has_type_and_arity($arg0_78, M_Type.Symbol_label_str_Symbol, 2)){
                 IValue $arg0_81 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_78)),0));
                 if($isComparable($arg0_81.getType(), $T2)){
                    IValue $arg1_79 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_78)),1));
                    if($isComparable($arg1_79.getType(), M_Type.ADT_Symbol)){
                       if($has_type_and_arity($arg1_79, Symbol_lex_str, 1)){
                          IValue $arg0_80 = (IValue)($aadt_subscript_int(((IConstructor)($arg1_79)),0));
                          if($isComparable($arg0_80.getType(), $T2)){
                             IValue $arg1_77 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
                             if($isComparable($arg1_77.getType(), $T2)){
                                IValue $arg2_76 = (IValue)($aadt_subscript_int(((IConstructor)$0),2));
                                if($isComparable($arg2_76.getType(), $T2)){
                                   return ((IBool)(((IBool) markLexical.getValue())));
                                
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
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(45837,75,<898,4>,<898,79>) 
    public IBool doAnno$f5003b357501379a(IConstructor $0, ValueRef<IBool> markLexical){ 
        
        
        if($has_type_and_arity($0, Production_prod_Symbol_list_Symbol_set_Attr, 3)){
           IValue $arg0_84 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_84.getType(), M_Type.ADT_Symbol)){
              if($has_type_and_arity($arg0_84, Symbol_parameterized_lex_str_list_Symbol, 2)){
                 IValue $arg0_86 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_84)),0));
                 if($isComparable($arg0_86.getType(), $T2)){
                    IValue $arg1_85 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_84)),1));
                    if($isComparable($arg1_85.getType(), $T2)){
                       IValue $arg1_83 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
                       if($isComparable($arg1_83.getType(), $T2)){
                          IValue $arg2_82 = (IValue)($aadt_subscript_int(((IConstructor)$0),2));
                          if($isComparable($arg2_82.getType(), $T2)){
                             return ((IBool)(((IBool) markLexical.getValue())));
                          
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(45918,75,<899,4>,<899,79>) 
    public IBool doAnno$333eeadea6c84ade(IConstructor $0, ValueRef<IBool> markLexical){ 
        
        
        if($has_type_and_arity($0, Production_prod_Symbol_list_Symbol_set_Attr, 3)){
           IValue $arg0_89 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_89.getType(), M_Type.ADT_Symbol)){
              if($has_type_and_arity($arg0_89, M_Type.Symbol_label_str_Symbol, 2)){
                 IValue $arg0_93 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_89)),0));
                 if($isComparable($arg0_93.getType(), $T2)){
                    IValue $arg1_90 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_89)),1));
                    if($isComparable($arg1_90.getType(), M_Type.ADT_Symbol)){
                       if($has_type_and_arity($arg1_90, Symbol_parameterized_lex_str_list_Symbol, 2)){
                          IValue $arg0_92 = (IValue)($aadt_subscript_int(((IConstructor)($arg1_90)),0));
                          if($isComparable($arg0_92.getType(), $T2)){
                             IValue $arg1_91 = (IValue)($aadt_subscript_int(((IConstructor)($arg1_90)),1));
                             if($isComparable($arg1_91.getType(), $T2)){
                                IValue $arg1_88 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
                                if($isComparable($arg1_88.getType(), $T2)){
                                   IValue $arg2_87 = (IValue)($aadt_subscript_int(((IConstructor)$0),2));
                                   if($isComparable($arg2_87.getType(), $T2)){
                                      return ((IBool)(((IBool) markLexical.getValue())));
                                   
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
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(45999,61,<900,4>,<900,65>) 
    public IBool doAnno$1bc5c5bdcb047ca9(IConstructor $0, ValueRef<IBool> markLayout){ 
        
        
        if($has_type_and_arity($0, Production_prod_Symbol_list_Symbol_set_Attr, 3)){
           IValue $arg0_96 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_96.getType(), M_Type.ADT_Symbol)){
              if($has_type_and_arity($arg0_96, Symbol_layouts_str, 1)){
                 IValue $arg0_97 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_96)),0));
                 if($isComparable($arg0_97.getType(), $T2)){
                    IValue $arg1_95 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
                    if($isComparable($arg1_95.getType(), $T2)){
                       IValue $arg2_94 = (IValue)($aadt_subscript_int(((IConstructor)$0),2));
                       if($isComparable($arg2_94.getType(), $T2)){
                          return ((IBool)(((IBool) markLayout.getValue())));
                       
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(46066,61,<901,4>,<901,65>) 
    public IBool doAnno$443b8e5707168a9d(IConstructor $0, ValueRef<IBool> markLayout){ 
        
        
        if($has_type_and_arity($0, Production_prod_Symbol_list_Symbol_set_Attr, 3)){
           IValue $arg0_100 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_100.getType(), M_Type.ADT_Symbol)){
              if($has_type_and_arity($arg0_100, M_Type.Symbol_label_str_Symbol, 2)){
                 IValue $arg0_103 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_100)),0));
                 if($isComparable($arg0_103.getType(), $T2)){
                    IValue $arg1_101 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_100)),1));
                    if($isComparable($arg1_101.getType(), M_Type.ADT_Symbol)){
                       if($has_type_and_arity($arg1_101, Symbol_layouts_str, 1)){
                          IValue $arg0_102 = (IValue)($aadt_subscript_int(((IConstructor)($arg1_101)),0));
                          if($isComparable($arg0_102.getType(), $T2)){
                             IValue $arg1_99 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
                             if($isComparable($arg1_99.getType(), $T2)){
                                IValue $arg2_98 = (IValue)($aadt_subscript_int(((IConstructor)$0),2));
                                if($isComparable($arg2_98.getType(), $T2)){
                                   return ((IBool)(((IBool) markLayout.getValue())));
                                
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
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(46133,61,<902,4>,<902,65>) 
    public IBool doAnno$8a161d5223a6d4a7(IConstructor $0, ValueRef<IBool> markSyntax){ 
        
        
        if($has_type_and_arity($0, Production_prod_Symbol_list_Symbol_set_Attr, 3)){
           IValue $arg0_106 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_106.getType(), M_Type.ADT_Symbol)){
              if($has_type_and_arity($arg0_106, Symbol_sort_str, 1)){
                 IValue $arg0_107 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_106)),0));
                 if($isComparable($arg0_107.getType(), $T2)){
                    IValue $arg1_105 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
                    if($isComparable($arg1_105.getType(), $T2)){
                       IValue $arg2_104 = (IValue)($aadt_subscript_int(((IConstructor)$0),2));
                       if($isComparable($arg2_104.getType(), $T2)){
                          return ((IBool)(((IBool) markSyntax.getValue())));
                       
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(46200,61,<903,4>,<903,65>) 
    public IBool doAnno$45962f815c073f09(IConstructor $0, ValueRef<IBool> markSyntax){ 
        
        
        if($has_type_and_arity($0, Production_prod_Symbol_list_Symbol_set_Attr, 3)){
           IValue $arg0_110 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_110.getType(), M_Type.ADT_Symbol)){
              if($has_type_and_arity($arg0_110, M_Type.Symbol_label_str_Symbol, 2)){
                 IValue $arg0_113 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_110)),0));
                 if($isComparable($arg0_113.getType(), $T2)){
                    IValue $arg1_111 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_110)),1));
                    if($isComparable($arg1_111.getType(), M_Type.ADT_Symbol)){
                       if($has_type_and_arity($arg1_111, Symbol_sort_str, 1)){
                          IValue $arg0_112 = (IValue)($aadt_subscript_int(((IConstructor)($arg1_111)),0));
                          if($isComparable($arg0_112.getType(), $T2)){
                             IValue $arg1_109 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
                             if($isComparable($arg1_109.getType(), $T2)){
                                IValue $arg2_108 = (IValue)($aadt_subscript_int(((IConstructor)$0),2));
                                if($isComparable($arg2_108.getType(), $T2)){
                                   return ((IBool)(((IBool) markSyntax.getValue())));
                                
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
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(46267,75,<904,4>,<904,79>) 
    public IBool doAnno$62935e01a02b3325(IConstructor $0, ValueRef<IBool> markSyntax){ 
        
        
        if($has_type_and_arity($0, Production_prod_Symbol_list_Symbol_set_Attr, 3)){
           IValue $arg0_116 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_116.getType(), M_Type.ADT_Symbol)){
              if($has_type_and_arity($arg0_116, Symbol_parameterized_sort_str_list_Symbol, 2)){
                 IValue $arg0_118 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_116)),0));
                 if($isComparable($arg0_118.getType(), $T2)){
                    IValue $arg1_117 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_116)),1));
                    if($isComparable($arg1_117.getType(), $T2)){
                       IValue $arg1_115 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
                       if($isComparable($arg1_115.getType(), $T2)){
                          IValue $arg2_114 = (IValue)($aadt_subscript_int(((IConstructor)$0),2));
                          if($isComparable($arg2_114.getType(), $T2)){
                             return ((IBool)(((IBool) markSyntax.getValue())));
                          
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(46348,75,<905,4>,<905,79>) 
    public IBool doAnno$6b93dbd776bc6aff(IConstructor $0, ValueRef<IBool> markSyntax){ 
        
        
        if($has_type_and_arity($0, Production_prod_Symbol_list_Symbol_set_Attr, 3)){
           IValue $arg0_121 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_121.getType(), M_Type.ADT_Symbol)){
              if($has_type_and_arity($arg0_121, M_Type.Symbol_label_str_Symbol, 2)){
                 IValue $arg0_125 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_121)),0));
                 if($isComparable($arg0_125.getType(), $T2)){
                    IValue $arg1_122 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_121)),1));
                    if($isComparable($arg1_122.getType(), M_Type.ADT_Symbol)){
                       if($has_type_and_arity($arg1_122, Symbol_parameterized_sort_str_list_Symbol, 2)){
                          IValue $arg0_124 = (IValue)($aadt_subscript_int(((IConstructor)($arg1_122)),0));
                          if($isComparable($arg0_124.getType(), $T2)){
                             IValue $arg1_123 = (IValue)($aadt_subscript_int(((IConstructor)($arg1_122)),1));
                             if($isComparable($arg1_123.getType(), $T2)){
                                IValue $arg1_120 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
                                if($isComparable($arg1_120.getType(), $T2)){
                                   IValue $arg2_119 = (IValue)($aadt_subscript_int(((IConstructor)$0),2));
                                   if($isComparable($arg2_119.getType(), $T2)){
                                      return ((IBool)(((IBool) markSyntax.getValue())));
                                   
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
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(46429,62,<906,4>,<906,66>) 
    public IBool doAnno$476fc1647b312203(IConstructor $0, ValueRef<IBool> markRegular){ 
        
        
        if($has_type_and_arity($0, Production_regular_Symbol, 1)){
           IValue $arg0_126 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_126.getType(), $T2)){
              return ((IBool)(((IBool) markRegular.getValue())));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(46497,58,<907,4>,<907,62>) 
    public IBool doAnno$9657233827fab781(IConstructor $0, ValueRef<IBool> markLit){ 
        
        
        if($has_type_and_arity($0, Production_prod_Symbol_list_Symbol_set_Attr, 3)){
           IValue $arg0_129 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_129.getType(), M_Type.ADT_Symbol)){
              if($has_type_and_arity($arg0_129, Symbol_lit_str, 1)){
                 IValue $arg0_130 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_129)),0));
                 if($isComparable($arg0_130.getType(), $T2)){
                    IValue $arg1_128 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
                    if($isComparable($arg1_128.getType(), $T2)){
                       IValue $arg2_127 = (IValue)($aadt_subscript_int(((IConstructor)$0),2));
                       if($isComparable($arg2_127.getType(), $T2)){
                          return ((IBool)(((IBool) markLit.getValue())));
                       
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(46561,58,<908,4>,<908,62>) 
    public IBool doAnno$bf6dede8df2ded6b(IConstructor $0, ValueRef<IBool> markLit){ 
        
        
        if($has_type_and_arity($0, Production_prod_Symbol_list_Symbol_set_Attr, 3)){
           IValue $arg0_133 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_133.getType(), M_Type.ADT_Symbol)){
              if($has_type_and_arity($arg0_133, Symbol_cilit_str, 1)){
                 IValue $arg0_134 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_133)),0));
                 if($isComparable($arg0_134.getType(), $T2)){
                    IValue $arg1_132 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
                    if($isComparable($arg1_132.getType(), $T2)){
                       IValue $arg2_131 = (IValue)($aadt_subscript_int(((IConstructor)$0),2));
                       if($isComparable($arg2_131.getType(), $T2)){
                          return ((IBool)(((IBool) markLit.getValue())));
                       
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(46625,60,<909,4>,<909,64>) 
    public IBool doAnno$26d7595b979b9ffa(IConstructor $0, ValueRef<IBool> markStart){ 
        
        
        if($has_type_and_arity($0, Production_prod_Symbol_list_Symbol_set_Attr, 3)){
           IValue $arg0_137 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_137.getType(), M_Type.ADT_Symbol)){
              if($has_type_and_arity($arg0_137, Symbol_start_Symbol, 1)){
                 IValue $arg0_138 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_137)),0));
                 if($isComparable($arg0_138.getType(), $T2)){
                    IValue $arg1_136 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
                    if($isComparable($arg1_136.getType(), $T2)){
                       IValue $arg2_135 = (IValue)($aadt_subscript_int(((IConstructor)$0),2));
                       if($isComparable($arg2_135.getType(), $T2)){
                          return ((IBool)(((IBool) markStart.getValue())));
                       
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(46693,136,<911,4>,<912,58>) 
    public IBool doSub$8bcc33a4aa91187e(IConstructor $__0){ 
        
        
        return ((IBool)$constants.get(1)/*true*/);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(46835,65,<913,4>,<913,69>) 
    public IBool doSub$206f4d604bde2e88(IConstructor $0, ValueRef<IBool> markSubLexical){ 
        
        
        if($has_type_and_arity($0, Production_prod_Symbol_list_Symbol_set_Attr, 3)){
           IValue $arg0_141 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_141.getType(), M_Type.ADT_Symbol)){
              if($has_type_and_arity($arg0_141, Symbol_lex_str, 1)){
                 IValue $arg0_142 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_141)),0));
                 if($isComparable($arg0_142.getType(), $T2)){
                    IValue $arg1_140 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
                    if($isComparable($arg1_140.getType(), $T2)){
                       IValue $arg2_139 = (IValue)($aadt_subscript_int(((IConstructor)$0),2));
                       if($isComparable($arg2_139.getType(), $T2)){
                          return ((IBool)(((IBool) markSubLexical.getValue())));
                       
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(46906,65,<914,4>,<914,69>) 
    public IBool doSub$346131bbdfe29203(IConstructor $0, ValueRef<IBool> markSubLexical){ 
        
        
        if($has_type_and_arity($0, Production_prod_Symbol_list_Symbol_set_Attr, 3)){
           IValue $arg0_145 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_145.getType(), M_Type.ADT_Symbol)){
              if($has_type_and_arity($arg0_145, M_Type.Symbol_label_str_Symbol, 2)){
                 IValue $arg0_148 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_145)),0));
                 if($isComparable($arg0_148.getType(), $T2)){
                    IValue $arg1_146 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_145)),1));
                    if($isComparable($arg1_146.getType(), M_Type.ADT_Symbol)){
                       if($has_type_and_arity($arg1_146, Symbol_lex_str, 1)){
                          IValue $arg0_147 = (IValue)($aadt_subscript_int(((IConstructor)($arg1_146)),0));
                          if($isComparable($arg0_147.getType(), $T2)){
                             IValue $arg1_144 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
                             if($isComparable($arg1_144.getType(), $T2)){
                                IValue $arg2_143 = (IValue)($aadt_subscript_int(((IConstructor)$0),2));
                                if($isComparable($arg2_143.getType(), $T2)){
                                   return ((IBool)(((IBool) markSubLexical.getValue())));
                                
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
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(46977,64,<915,4>,<915,68>) 
    public IBool doSub$5a451dcbafa938cc(IConstructor $0, ValueRef<IBool> markSubLayout){ 
        
        
        if($has_type_and_arity($0, Production_prod_Symbol_list_Symbol_set_Attr, 3)){
           IValue $arg0_151 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_151.getType(), M_Type.ADT_Symbol)){
              if($has_type_and_arity($arg0_151, Symbol_layouts_str, 1)){
                 IValue $arg0_152 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_151)),0));
                 if($isComparable($arg0_152.getType(), $T2)){
                    IValue $arg1_150 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
                    if($isComparable($arg1_150.getType(), $T2)){
                       IValue $arg2_149 = (IValue)($aadt_subscript_int(((IConstructor)$0),2));
                       if($isComparable($arg2_149.getType(), $T2)){
                          return ((IBool)(((IBool) markSubLayout.getValue())));
                       
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(47047,64,<916,4>,<916,68>) 
    public IBool doSub$98793c1e9ac4de9d(IConstructor $0, ValueRef<IBool> markSubLayout){ 
        
        
        if($has_type_and_arity($0, Production_prod_Symbol_list_Symbol_set_Attr, 3)){
           IValue $arg0_155 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_155.getType(), M_Type.ADT_Symbol)){
              if($has_type_and_arity($arg0_155, M_Type.Symbol_label_str_Symbol, 2)){
                 IValue $arg0_158 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_155)),0));
                 if($isComparable($arg0_158.getType(), $T2)){
                    IValue $arg1_156 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_155)),1));
                    if($isComparable($arg1_156.getType(), M_Type.ADT_Symbol)){
                       if($has_type_and_arity($arg1_156, Symbol_layouts_str, 1)){
                          IValue $arg0_157 = (IValue)($aadt_subscript_int(((IConstructor)($arg1_156)),0));
                          if($isComparable($arg0_157.getType(), $T2)){
                             IValue $arg1_154 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
                             if($isComparable($arg1_154.getType(), $T2)){
                                IValue $arg2_153 = (IValue)($aadt_subscript_int(((IConstructor)$0),2));
                                if($isComparable($arg2_153.getType(), $T2)){
                                   return ((IBool)(((IBool) markSubLayout.getValue())));
                                
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
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(47117,61,<917,4>,<917,65>) 
    public IBool doSub$56078ffcb99be2e4(IConstructor $0, ValueRef<IBool> markSubLit){ 
        
        
        if($has_type_and_arity($0, Production_prod_Symbol_list_Symbol_set_Attr, 3)){
           IValue $arg0_161 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_161.getType(), M_Type.ADT_Symbol)){
              if($has_type_and_arity($arg0_161, Symbol_lit_str, 1)){
                 IValue $arg0_162 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_161)),0));
                 if($isComparable($arg0_162.getType(), $T2)){
                    IValue $arg1_160 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
                    if($isComparable($arg1_160.getType(), $T2)){
                       IValue $arg2_159 = (IValue)($aadt_subscript_int(((IConstructor)$0),2));
                       if($isComparable($arg2_159.getType(), $T2)){
                          return ((IBool)(((IBool) markSubLit.getValue())));
                       
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(47184,61,<918,4>,<918,65>) 
    public IBool doSub$f8ed88e317c4c9a5(IConstructor $0, ValueRef<IBool> markSubLit){ 
        
        
        if($has_type_and_arity($0, Production_prod_Symbol_list_Symbol_set_Attr, 3)){
           IValue $arg0_165 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_165.getType(), M_Type.ADT_Symbol)){
              if($has_type_and_arity($arg0_165, Symbol_cilit_str, 1)){
                 IValue $arg0_166 = (IValue)($aadt_subscript_int(((IConstructor)($arg0_165)),0));
                 if($isComparable($arg0_166.getType(), $T2)){
                    IValue $arg1_164 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
                    if($isComparable($arg1_164.getType(), $T2)){
                       IValue $arg2_163 = (IValue)($aadt_subscript_int(((IConstructor)$0),2));
                       if($isComparable($arg2_163.getType(), $T2)){
                          return ((IBool)(((IBool) markSubLit.getValue())));
                       
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(47659,24,<936,6>,<936,30>) 
    public ITree washCC$fff1e88c6ce3820d(ITree x_0){ 
        
        
        return ((ITree)x_0);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(47340,584,<921,4>,<942,5>) 
    public ITree rec$5bce1aab543e2438(ITree t_0, IBool _sub_1, ValueRef<IInteger> curColumn_4, ValueRef<IInteger> curLine_3, ValueRef<IInteger> curOffset_2, ValueRef<ISourceLocation> file, ValueRef<IBool> markChar){ 
        
        
        if($has_type_and_arity(t_0, Tree_char_int, 1)){
           IValue $arg0_169 = (IValue)($aadt_subscript_int(((ITree)t_0),0));
           if($isComparable($arg0_169.getType(), $T53)){
              IInteger ch_1 = ((IInteger)($arg0_169));
              IInteger beginOffset_2 = curOffset_2.getValue();
              IInteger beginLine_3 = curLine_3.getValue();
              IInteger beginColumn_4 = curColumn_4.getValue();
              curOffset_2.setValue(((IInteger)($aint_add_aint(curOffset_2.getValue(),((IInteger)$constants.get(8)/*1*/)))));
              curColumn_4.setValue(((IInteger)($aint_add_aint(curColumn_4.getValue(),((IInteger)$constants.get(8)/*1*/)))));
              final ITree $switchVal167 = ((ITree)t_0);
              boolean noCaseMatched_$switchVal167 = true;
              SWITCH3: switch(Fingerprint.getConcreteFingerprint($switchVal167)){
              
                  case 0:
                      if(noCaseMatched_$switchVal167){
                          noCaseMatched_$switchVal167 = false;
                          
                      }
                      
              
                  default: if($isSubtypeOf($switchVal167.getType(),$T54)){
                              /*muExists*/CASE_0_0: 
                                  do {
                                      curLine_3.setValue(((IInteger)($aint_add_aint(curLine_3.getValue(),((IInteger)$constants.get(8)/*1*/)))));
                                      curColumn_4.setValue(((IInteger)$constants.get(9)/*0*/));
                                      break SWITCH3;// succeedSwitch
                                  } while(false);
                           
                           }
              
              }
              
                         /*muExists*/$RET168: 
                  do {
                      if((((IBool)(((IBool) markChar.getValue())))).getValue()){
                         return ((ITree)(((ITree)($aadt_field_update("src", $create_aloc_with_offset_and_begin_end(((ISourceLocation)(((ISourceLocation) file.getValue()))), ((IInteger)(((IInteger)beginOffset_2))), ((IInteger)(((IInteger)$constants.get(8)/*1*/))), ((ITuple)($RVF.tuple(((IInteger)beginLine_3), ((IInteger)beginColumn_4)))), ((ITuple)($RVF.tuple(curLine_3.getValue(), ((IInteger)(M_List.max(((IList)($RVF.list(curColumn_4.getValue(), $aint_add_aint(((IInteger)beginColumn_4),((IInteger)$constants.get(8)/*1*/)))))))))))), ((ITree)(reposition_rec_washCC(((ITree)($RVF.constructor(Tree_char_int, new IValue[]{((IInteger)($arg0_169))}, Util.kwpMap())))))))))));
                      
                      }
              
                  } while(false);
              return ((ITree)(reposition_rec_washCC(((ITree)($RVF.constructor(Tree_char_int, new IValue[]{((IInteger)($arg0_169))}, Util.kwpMap()))))));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(47961,177,<945,4>,<948,7>) 
    public ITree rec$274f633284bc5c83(ITree $0, IBool _sub_1, ValueRef<IInteger> curColumn_4, ValueRef<IInteger> curLine_3, ValueRef<IInteger> curOffset_2, ValueRef<ISourceLocation> file, ValueRef<IBool> markCycle){ 
        
        
        if($has_type_and_arity($0, Tree_cycle_Symbol_int, 2)){
           IValue $arg0_172 = (IValue)($aadt_subscript_int(((ITree)$0),0));
           if($isComparable($arg0_172.getType(), M_Type.ADT_Symbol)){
              IConstructor s_0 = null;
              IValue $arg1_171 = (IValue)($aadt_subscript_int(((ITree)$0),1));
              if($isComparable($arg1_171.getType(), $T53)){
                 IInteger up_1 = null;
                 if((((IBool)(((IBool) markCycle.getValue())))).getValue()){
                    return ((ITree)(((ITree)($aadt_field_update("src", $create_aloc_with_offset_and_begin_end(((ISourceLocation)(((ISourceLocation) file.getValue()))), ((IInteger)(curOffset_2.getValue())), ((IInteger)(((IInteger)$constants.get(9)/*0*/))), ((ITuple)($RVF.tuple(curLine_3.getValue(), curColumn_4.getValue()))), ((ITuple)($RVF.tuple(curLine_3.getValue(), curColumn_4.getValue())))), ((ITree)($RVF.constructor(Tree_cycle_Symbol_int, new IValue[]{((IConstructor)($arg0_172)), ((IInteger)($arg1_171))}, Util.kwpMap()))))))));
                 
                 } else {
                    return ((ITree)($RVF.constructor(Tree_cycle_Symbol_int, new IValue[]{((IConstructor)($arg0_172)), ((IInteger)($arg1_171))}, Util.kwpMap())));
                 
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(48360,508,<952,4>,<964,5>) 
    public ITree rec$d5e2ece302996ca6(ITree $0, IBool sub_2, ValueRef<IInteger> curColumn_4, ValueRef<IInteger> curLine_3, ValueRef<IInteger> curOffset_2, ValueRef<ISourceLocation> file, ValueRef<IBool> markAmb, ValueRef<IBool> markChar, ValueRef<IBool> markCycle, ValueRef<IBool> markLayout, ValueRef<IBool> markLexical, ValueRef<IBool> markLit, ValueRef<IBool> markRegular, ValueRef<IBool> markStart, ValueRef<IBool> markSubLayout, ValueRef<IBool> markSubLexical, ValueRef<IBool> markSubLit, ValueRef<IBool> markSyntax){ 
        
        
        if($has_type_and_arity($0, Tree_appl_Production_list_Tree, 2)){
           IValue $arg0_179 = (IValue)($aadt_subscript_int(((ITree)$0),0));
           if($isComparable($arg0_179.getType(), M_Type.ADT_Production)){
              IConstructor prod_0 = ((IConstructor)($arg0_179));
              IValue $arg1_178 = (IValue)($aadt_subscript_int(((ITree)$0),1));
              if($isComparable($arg1_178.getType(), $T43)){
                 IList args_1 = ((IList)($arg1_178));
                 IInteger beginOffset_3 = curOffset_2.getValue();
                 IInteger beginLine_4 = curLine_3.getValue();
                 IInteger beginColumn_5 = curColumn_4.getValue();
                 final IListWriter $listwriter173 = (IListWriter)$RVF.listWriter();
                 $LCOMP174_GEN48642:
                 for(IValue $elem176_for : ((IList)($arg1_178))){
                     ITree $elem176 = (ITree) $elem176_for;
                     ITree a_7 = ((ITree)($elem176));
                     $listwriter173.append(reposition_mergeRec(((ITree)a_7), ((IBool)(((((IBool)sub_2)).getValue() ? reposition_doSub(((IConstructor)($arg0_179)), markSubLayout, markSubLexical, markSubLit) : ((IBool)$constants.get(2)/*false*/)))), curColumn_4, curLine_3, curOffset_2, file, markAmb, markChar, markCycle, markLayout, markLexical, markLit, markRegular, markStart, markSubLayout, markSubLexical, markSubLit, markSyntax));
                 
                 }
                 
                             IList newArgs_6 = ((IList)($listwriter173.done()));
                 /*muExists*/$RET177: 
                     do {
                         if((((IBool)sub_2)).getValue()){
                            if((((IBool)(reposition_doAnno(((IConstructor)($arg0_179)), markLayout, markLexical, markLit, markRegular, markStart, markSyntax)))).getValue()){
                              return ((ITree)(((ITree)($aadt_field_update("src", $create_aloc_with_offset_and_begin_end(((ISourceLocation)(((ISourceLocation) file.getValue()))), ((IInteger)(((IInteger)beginOffset_3))), ((IInteger)(((IInteger) curOffset_2.getValue().subtract(((IInteger)beginOffset_3))))), ((ITuple)($RVF.tuple(((IInteger)beginLine_4), ((IInteger)beginColumn_5)))), ((ITuple)($RVF.tuple(curLine_3.getValue(), curColumn_4.getValue())))), ((ITree)($RVF.constructor(Tree_appl_Production_list_Tree, new IValue[]{((IConstructor)($arg0_179)), ((IList)newArgs_6)}, Util.kwpMap()))))))));
                            
                            }
                         
                         }
                 
                     } while(false);
                 return ((ITree)($RVF.constructor(Tree_appl_Production_list_Tree, new IValue[]{((IConstructor)($arg0_179)), ((IList)newArgs_6)}, Util.kwpMap())));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(48981,367,<967,4>,<975,5>) 
    public ITree rec$836612a609510466(ITree $0, IBool sub_1, ValueRef<IInteger> curColumn_4, ValueRef<IInteger> curLine_3, ValueRef<IInteger> curOffset_2, ValueRef<ISourceLocation> file, ValueRef<IBool> markAmb, ValueRef<IBool> markChar, ValueRef<IBool> markCycle, ValueRef<IBool> markLayout, ValueRef<IBool> markLexical, ValueRef<IBool> markLit, ValueRef<IBool> markRegular, ValueRef<IBool> markStart, ValueRef<IBool> markSubLayout, ValueRef<IBool> markSubLexical, ValueRef<IBool> markSubLit, ValueRef<IBool> markSyntax){ 
        
        
        if($has_type_and_arity($0, Tree_amb_set_Tree, 1)){
           IValue $arg0_184 = (IValue)($aadt_subscript_int(((ITree)$0),0));
           if($isComparable($arg0_184.getType(), $T55)){
              ISet alts_0 = ((ISet)($arg0_184));
              final ISetWriter $setwriter180 = (ISetWriter)$RVF.setWriter();
              ;
              $SCOMP181_GEN49060:
              for(IValue $elem182_for : ((ISet)($arg0_184))){
                  ITree $elem182 = (ITree) $elem182_for;
                  ITree a_3 = ((ITree)($elem182));
                  $setwriter180.insert(reposition_mergeRec(((ITree)a_3), ((IBool)sub_1), curColumn_4, curLine_3, curOffset_2, file, markAmb, markChar, markCycle, markLayout, markLexical, markLit, markRegular, markStart, markSubLayout, markSubLexical, markSubLit, markSyntax));
              
              }
              
                          ISet newAlts_2 = ((ISet)($setwriter180.done()));
              ITree x_4 = ((ITree)(M_Set.getFirstFrom(((ISet)newAlts_2))));
              /*muExists*/$RET183: 
                  do {
                      if((((IBool)(((IBool) markAmb.getValue())))).getValue()){
                         if($is_defined_value($guarded_aadt_get_field(((ITree)x_4),  "src"))){
                           return ((ITree)(((ITree)($aadt_field_update("src", $getkw_Tree_src(((ITree)x_4)), ((ITree)($RVF.constructor(Tree_amb_set_Tree, new IValue[]{((ISet)newAlts_2)}, Util.kwpMap()))))))));
                         
                         }
                      
                      }
              
                  } while(false);
              return ((ITree)($RVF.constructor(Tree_amb_set_Tree, new IValue[]{((ISet)newAlts_2)}, Util.kwpMap())));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(49356,405,<977,4>,<984,5>) 
    public ITree mergeRec$fc149d142e21c7b1(ITree t_0, IBool sub_1, ValueRef<IInteger> curColumn_4, ValueRef<IInteger> curLine_3, ValueRef<IInteger> curOffset_2, ValueRef<ISourceLocation> file, ValueRef<IBool> markAmb, ValueRef<IBool> markChar, ValueRef<IBool> markCycle, ValueRef<IBool> markLayout, ValueRef<IBool> markLexical, ValueRef<IBool> markLit, ValueRef<IBool> markRegular, ValueRef<IBool> markStart, ValueRef<IBool> markSubLayout, ValueRef<IBool> markSubLexical, ValueRef<IBool> markSubLit, ValueRef<IBool> markSyntax){ 
        
        
        IMap oldParams_2 = ((IMap)(M_Node.getKeywordParameters(((INode)t_0))));
        t_0 = ((ITree)(reposition_rec(((ITree)t_0), ((IBool)sub_1), curColumn_4, curLine_3, curOffset_2, file, markAmb, markChar, markCycle, markLayout, markLexical, markLit, markRegular, markStart, markSubLayout, markSubLexical, markSubLit, markSyntax)));
        IMap newParams_3 = ((IMap)(M_Node.getKeywordParameters(((INode)t_0))));
        IMap mergedParams_4 = ((IMap)($amap_add_amap(((IMap)(((IMap)oldParams_2).remove(((IMap)($buildMap(((IString)$constants.get(10)/*"src"*/), ((ISourceLocation)($create_aloc(((IString)$constants.get(7)/*"unknown:///"*/)))))))))),((IMap)newParams_3))));
        return ((ITree)(M_Node.setKeywordParameters(((INode)t_0), ((IMap)mergedParams_4))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/ParseTree.rsc|(41704,8184,<828,0>,<988,1>) 
    public ITree reposition$b1b98e1a1cdc40fb(ITree tree_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = Util.kwpMap();
        ISourceLocation $kwpDefault_file = ((ISourceLocation)(((ISourceLocation)($aloc_get_field(((ISourceLocation)($getkw_Tree_src(((ITree)tree_0)))), "top")))));
        $kwpDefaults.put("file", $kwpDefault_file);IBool $kwpDefault_markStart = ((IBool)$constants.get(1)/*true*/);
        $kwpDefaults.put("markStart", $kwpDefault_markStart);IBool $kwpDefault_markSyntax = ((IBool)$constants.get(1)/*true*/);
        $kwpDefaults.put("markSyntax", $kwpDefault_markSyntax);IBool $kwpDefault_markLexical = ((IBool)$constants.get(1)/*true*/);
        $kwpDefaults.put("markLexical", $kwpDefault_markLexical);IBool $kwpDefault_markSubLexical = ((IBool)$constants.get(1)/*true*/);
        $kwpDefaults.put("markSubLexical", $kwpDefault_markSubLexical);IBool $kwpDefault_markRegular = ((IBool)$constants.get(1)/*true*/);
        $kwpDefaults.put("markRegular", $kwpDefault_markRegular);IBool $kwpDefault_markLayout = ((IBool)$constants.get(1)/*true*/);
        $kwpDefaults.put("markLayout", $kwpDefault_markLayout);IBool $kwpDefault_markSubLayout = ((IBool)$constants.get(1)/*true*/);
        $kwpDefaults.put("markSubLayout", $kwpDefault_markSubLayout);IBool $kwpDefault_markLit = ((IBool)$constants.get(2)/*false*/);
        $kwpDefaults.put("markLit", $kwpDefault_markLit);IBool $kwpDefault_markSubLit = ((IBool)$constants.get(2)/*false*/);
        $kwpDefaults.put("markSubLit", $kwpDefault_markSubLit);IBool $kwpDefault_markAmb = ((IBool)$constants.get(2)/*false*/);
        $kwpDefaults.put("markAmb", $kwpDefault_markAmb);IBool $kwpDefault_markCycle = ((IBool)$constants.get(2)/*false*/);
        $kwpDefaults.put("markCycle", $kwpDefault_markCycle);IBool $kwpDefault_markChar = ((IBool)$constants.get(2)/*false*/);
        $kwpDefaults.put("markChar", $kwpDefault_markChar);
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T30.match(tree_0.getType(), $typeBindings)){
           final ValueRef<IInteger> curOffset_2 = new ValueRef<IInteger>("curOffset", ((IInteger)$constants.get(9)/*0*/));
           final ValueRef<IInteger> curLine_3 = new ValueRef<IInteger>("curLine", ((IInteger)$constants.get(8)/*1*/));
           final ValueRef<IInteger> curColumn_4 = new ValueRef<IInteger>("curColumn", ((IInteger)$constants.get(9)/*0*/));
           final ITree $result185 = ((ITree)(reposition_mergeRec(((ITree)tree_0), ((IBool)$constants.get(1)/*true*/), curColumn_4, curLine_3, curOffset_2, new ValueRef<ISourceLocation>("file", ((ISourceLocation) ($kwpActuals.containsKey("file") ? $kwpActuals.get("file") : $kwpDefaults.get("file")))), new ValueRef<IBool>("markAmb", ((IBool) ($kwpActuals.containsKey("markAmb") ? $kwpActuals.get("markAmb") : $kwpDefaults.get("markAmb")))), new ValueRef<IBool>("markChar", ((IBool) ($kwpActuals.containsKey("markChar") ? $kwpActuals.get("markChar") : $kwpDefaults.get("markChar")))), new ValueRef<IBool>("markCycle", ((IBool) ($kwpActuals.containsKey("markCycle") ? $kwpActuals.get("markCycle") : $kwpDefaults.get("markCycle")))), new ValueRef<IBool>("markLayout", ((IBool) ($kwpActuals.containsKey("markLayout") ? $kwpActuals.get("markLayout") : $kwpDefaults.get("markLayout")))), new ValueRef<IBool>("markLexical", ((IBool) ($kwpActuals.containsKey("markLexical") ? $kwpActuals.get("markLexical") : $kwpDefaults.get("markLexical")))), new ValueRef<IBool>("markLit", ((IBool) ($kwpActuals.containsKey("markLit") ? $kwpActuals.get("markLit") : $kwpDefaults.get("markLit")))), new ValueRef<IBool>("markRegular", ((IBool) ($kwpActuals.containsKey("markRegular") ? $kwpActuals.get("markRegular") : $kwpDefaults.get("markRegular")))), new ValueRef<IBool>("markStart", ((IBool) ($kwpActuals.containsKey("markStart") ? $kwpActuals.get("markStart") : $kwpDefaults.get("markStart")))), new ValueRef<IBool>("markSubLayout", ((IBool) ($kwpActuals.containsKey("markSubLayout") ? $kwpActuals.get("markSubLayout") : $kwpDefaults.get("markSubLayout")))), new ValueRef<IBool>("markSubLexical", ((IBool) ($kwpActuals.containsKey("markSubLexical") ? $kwpActuals.get("markSubLexical") : $kwpDefaults.get("markSubLexical")))), new ValueRef<IBool>("markSubLit", ((IBool) ($kwpActuals.containsKey("markSubLit") ? $kwpActuals.get("markSubLit") : $kwpDefaults.get("markSubLit")))), new ValueRef<IBool>("markSyntax", ((IBool) ($kwpActuals.containsKey("markSyntax") ? $kwpActuals.get("markSyntax") : $kwpDefaults.get("markSyntax")))))));
           if($T19.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result185.getType(),$T19)){
              return ((ITree)($result185));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |rascal+module:///ParseTree| 
    public ISourceLocation $getkw_Tree_parseError(ITree $getkw_Tree_parseError){ 
        
        
        if($getkw_Tree_parseError.asWithKeywordParameters().hasParameter("parseError")){
           return ((ISourceLocation)(((ISourceLocation)$getkw_Tree_parseError.asWithKeywordParameters().getParameter("parseError"))));
        
        } else {
           return ((ISourceLocation)($create_aloc_with_offset_and_begin_end(((ISourceLocation)($create_aloc(((IString)$constants.get(7)/*"unknown:///"*/)))), ((IInteger)(((IInteger)$constants.get(9)/*0*/))), ((IInteger)(((IInteger)$constants.get(9)/*0*/))), ((ITuple)$constants.get(11)/*<0,0>*/), ((ITuple)$constants.get(11)/*<0,0>*/))));
        
        }
    }
    
    // Source: |rascal+module:///ParseTree| 
    public ISourceLocation $getkw_Tree_src(ITree $getkw_Tree_src){ 
        
        
        if($getkw_Tree_src.asWithKeywordParameters().hasParameter("src")){
           return ((ISourceLocation)(((ISourceLocation)$getkw_Tree_src.asWithKeywordParameters().getParameter("src"))));
        
        } else {
           return ((ISourceLocation)($create_aloc(((IString)$constants.get(7)/*"unknown:///"*/))));
        
        }
    }
    

    public static void main(String[] args) {
      throw new RuntimeException("No function `main` found in Rascal module `ParseTree`");
    }
}