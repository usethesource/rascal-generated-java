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
public class $String 
    extends
        org.rascalmpl.runtime.$RascalModule
    implements 
    	rascal.$Exception_$I,
    	rascal.$String_$I {

    private final $String_$I $me;
    private final IList $constants;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_indent$aa6595c10ef14e07;

    
    public final rascal.$Message M_Message;
    public final rascal.$Exception M_Exception;
    public final rascal.$ParseTree M_ParseTree;
    public final rascal.$Type M_Type;
    public final rascal.$List M_List;

    
    final org.rascalmpl.library.Prelude $Prelude; // TODO: asBaseClassName will generate name collisions if there are more of the same name in different packages

    
    public IString DEFAULT_CHARSET;
    public final io.usethesource.vallang.type.Type $T2;	/*avalue()*/
    public final io.usethesource.vallang.type.Type $T5;	/*aint()*/
    public final io.usethesource.vallang.type.Type $T9;	/*aloc()*/
    public final io.usethesource.vallang.type.Type $T12;	/*avoid()*/
    public final io.usethesource.vallang.type.Type $T13;	/*aparameter("CharClass",avalue(),closed=true)*/
    public final io.usethesource.vallang.type.Type $T0;	/*astr()*/
    public final io.usethesource.vallang.type.Type $T16;	/*aloc(alabel="a")*/
    public final io.usethesource.vallang.type.Type $T17;	/*aloc(alabel="b")*/
    public final io.usethesource.vallang.type.Type $T7;	/*aparameter("CharClass",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type $T3;	/*aparameter("T",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type ADT_IOCapability;	/*aadt("IOCapability",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T15;	/*abool()*/
    public final io.usethesource.vallang.type.Type ADT_Tree;	/*aadt("Tree",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TreeSearchResult_Tree;	/*aadt("TreeSearchResult",[aadt("Tree",[],dataSyntax())],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RuntimeException;	/*aadt("RuntimeException",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T8;	/*alist(aint())*/
    public final io.usethesource.vallang.type.Type ADT_Symbol;	/*aadt("Symbol",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Condition;	/*aadt("Condition",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TreeSearchResult_void;	/*aadt("TreeSearchResult",[avoid()],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FileSystemChange;	/*aadt("FileSystemChange",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T1;	/*alist(aparameter("T",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type $T11;	/*aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)*/
    public final io.usethesource.vallang.type.Type ADT_TreeSearchResult_1;	/*aadt("TreeSearchResult",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Attr;	/*aadt("Attr",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Production;	/*aadt("Production",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type TreeSearchResult_Tree_treeFound_Tree;	/*acons(aadt("TreeSearchResult",[aadt("Tree",[],dataSyntax())],dataSyntax()),[aadt("Tree",[],dataSyntax(),alabel="tree")],[],alabel="treeFound")*/
    public final io.usethesource.vallang.type.Type $T6;	/*areified(aparameter("CharClass",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type ADT_Associativity;	/*aadt("Associativity",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T14;	/*afunc(abool(),[aloc(alabel="a"),aloc(alabel="b")],[],returnsViaAllPath=true)*/
    public final io.usethesource.vallang.type.Type $T4;	/*amap(astr(),astr())*/
    public final io.usethesource.vallang.type.Type ADT_Message;	/*aadt("Message",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T10;	/*amap(aloc(),astr())*/
    public final io.usethesource.vallang.type.Type ADT_Exception;	/*aadt("Exception",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_CharRange;	/*aadt("CharRange",[],dataSyntax())*/

    public $String(RascalExecutionContext rex){
        this(rex, null);
    }
    
    public $String(RascalExecutionContext rex, Object extended){
       super(rex);
       this.$me = extended == null ? this : ($String_$I)extended;
       ModuleStore mstore = rex.getModuleStore();
       mstore.put(rascal.$String.class, this);
       
       mstore.importModule(rascal.$Message.class, rex, rascal.$Message::new);
       mstore.importModule(rascal.$ParseTree.class, rex, rascal.$ParseTree::new);
       mstore.importModule(rascal.$Type.class, rex, rascal.$Type::new);
       mstore.importModule(rascal.$List.class, rex, rascal.$List::new); 
       
       M_Message = mstore.getModule(rascal.$Message.class);
       M_ParseTree = mstore.getModule(rascal.$ParseTree.class);
       M_Type = mstore.getModule(rascal.$Type.class);
       M_List = mstore.getModule(rascal.$List.class); 
       
       M_Exception = mstore.extendModule(rascal.$Exception.class, rex, rascal.$Exception::new, $me);
                          
       
       $TS.importStore(M_Message.$TS);
       $TS.importStore(M_Exception.$TS);
       $TS.importStore(M_ParseTree.$TS);
       $TS.importStore(M_Type.$TS);
       $TS.importStore(M_List.$TS);
       
       $Prelude = $initLibrary("org.rascalmpl.library.Prelude"); 
    
       $constants = readBinaryConstantsFile(this.getClass(), "rascal/$String.constants", 18, "588e3a34f98ee2173c2dfb8073cf7453");
       ADT_IOCapability = $adt("IOCapability");
       ADT_Tree = $adt("Tree");
       ADT_RuntimeException = $adt("RuntimeException");
       ADT_Symbol = $adt("Symbol");
       ADT_Condition = $adt("Condition");
       ADT_FileSystemChange = $adt("FileSystemChange");
       ADT_Attr = $adt("Attr");
       ADT_Production = $adt("Production");
       ADT_Associativity = $adt("Associativity");
       ADT_Message = $adt("Message");
       ADT_Exception = $adt("Exception");
       ADT_CharRange = $adt("CharRange");
       $T2 = $TF.valueType();
       $T5 = $TF.integerType();
       $T9 = $TF.sourceLocationType();
       $T12 = $TF.voidType();
       $T13 = $TF.parameterType("CharClass", $T2);
       $T0 = $TF.stringType();
       $T16 = $TF.sourceLocationType();
       $T17 = $TF.sourceLocationType();
       $T7 = $TF.parameterType("CharClass", $T2);
       $T3 = $TF.parameterType("T", $T2);
       $T15 = $TF.boolType();
       ADT_TreeSearchResult_Tree = $parameterizedAdt("TreeSearchResult", new Type[] { ADT_Tree });
       $T8 = $TF.listType($T5);
       ADT_TreeSearchResult_void = $parameterizedAdt("TreeSearchResult", new Type[] { $T12 });
       $T1 = $TF.listType($T3);
       $T11 = $TF.parameterType("T", ADT_Tree);
       ADT_TreeSearchResult_1 = $parameterizedAdt("TreeSearchResult", new Type[] { $T11 });
       $T6 = $RTF.reifiedType($T7);
       $T14 = $TF.functionType($T15, $TF.tupleType($T16, "a", $T17, "b"), $TF.tupleEmpty());
       $T4 = $TF.mapType($T0,$T0);
       $T10 = $TF.mapType($T9,$T0);
       TreeSearchResult_Tree_treeFound_Tree = $TF.constructor($TS, ADT_TreeSearchResult_Tree, "treeFound", M_ParseTree.ADT_Tree, "tree");
    
       DEFAULT_CHARSET = ((IString)$constants.get(17)/*"UTF-8"*/);
    
       $kwpDefaults_indent$aa6595c10ef14e07 = Util.kwpMap("indentFirstLine", ((IBool)$constants.get(16)/*false*/));
    
    }
    public IBool isEmpty(IValue $P0){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IBool)isEmpty$c8b32c2fb32648d3((IString) $P0);
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
    public IInteger size(IValue $P0){ // Generated by Resolver
       IInteger $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T1)){
         $result = (IInteger)M_List.size$811ff6e419f455d9((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IInteger)size$1d28105b03d03294((IString) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString escape(IValue $P0, IValue $P1){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T4)){
         $result = (IString)escape$40186d5c03f23517((IString) $P0, (IMap) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IConstructor choice(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IConstructor) M_Type.choice($P0, $P1);
    }
    public IString removeWhitespace(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IString)removeWhitespace$0b9997f5a179260e((IString) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString trim(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IString)trim$886b1f284016d8e7((IString) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString deescape(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IString)deescape$a228c34b31540130((IString) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString arbString(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T5)){
         $result = (IString)arbString$030cc3bedaefe184((IInteger) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString squeeze(IValue $P0, IValue $P1){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0)){
         $result = (IString)squeeze$26efc64f8be26d84((IString) $P0, (IString) $P1);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T6)){
         $result = (IString)squeeze$47c84bd053297355((IString) $P0, (IConstructor) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IString reverse(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IString)reverse$b071b5c94654378e((IString) $P0);
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
    public IString uncapitalize(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IString)uncapitalize$4550db2211fb3ab7((IString) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString stringChar(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T5)){
         $result = (IString)stringChar$fa4a369e95efe399((IInteger) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString left(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T5) && $isSubtypeOf($P2Type,$T0)){
         $result = (IString)left$2803cc1f56e63a9a((IString) $P0, (IInteger) $P1, (IString) $P2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IString left(IValue $P0, IValue $P1){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T5)){
         $result = (IString)left$347471385979c271((IString) $P0, (IInteger) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IList findAll(IValue $P0, IValue $P1){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0)){
         $result = (IList)findAll$e45a94c42cb47b4f((IString) $P0, (IString) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IInteger charAt(IValue $P0, IValue $P1){ // Generated by Resolver
       IInteger $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T5)){
         $result = (IInteger)charAt$76bc78472313b181((IString) $P0, (IInteger) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IString wrap(IValue $P0, IValue $P1){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T5)){
         $result = (IString)wrap$ada69a3de2fdae29((IString) $P0, (IInteger) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IString replaceLast(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0) && $isSubtypeOf($P2Type,$T0)){
         $result = (IString)replaceLast$2fb27d6e270b6bf1((IString) $P0, (IString) $P1, (IString) $P2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IBool equivalent(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IBool) M_Type.equivalent($P0, $P1);
    }
    public IString toBase64(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IString)toBase64$6fec5c5ff2fc5293((IString) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString toBase32(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IString)toBase32$40a8f4ee61bf737a((IString) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString indent(IValue $P0, IValue $P1, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0)){
         $result = (IString)indent$aa6595c10ef14e07((IString) $P0, (IString) $P1, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IString stringChars(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T8)){
         $result = (IString)stringChars$ba6ec53397d26d23((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString capitalize(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IString)capitalize$df09f3a91db3ee82((IString) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString replaceAll(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0) && $isSubtypeOf($P2Type,$T0)){
         $result = (IString)replaceAll$074d0bc75f28c903((IString) $P0, (IString) $P1, (IString) $P2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IInteger findLast(IValue $P0, IValue $P1){ // Generated by Resolver
       IInteger $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0)){
         $result = (IInteger)findLast$a22f40b0cc4aac9a((IString) $P0, (IString) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IList tail(IValue $P0){ // Generated by Resolver
       return (IList) M_List.tail($P0);
    }
    public ISourceLocation toLocation(IValue $P0){ // Generated by Resolver
       ISourceLocation $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (ISourceLocation)toLocation$4c81a2fde84f5d1c((IString) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString substitute_subst1(IValue $P0, IValue $P1, IValue $P2, ValueRef<IInteger> shift_2){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T9) && $isSubtypeOf($P2Type,$T0)){
         $result = (IString)subst1$3569213557ac366f((IString) $P0, (ISourceLocation) $P1, (IString) $P2, shift_2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public ITuple headTail(IValue $P0){ // Generated by Resolver
       return (ITuple) M_List.headTail($P0);
    }
    public IString substring(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T5) && $isSubtypeOf($P2Type,$T5)){
         $result = (IString)substring$1aa1c9331c9a704e((IString) $P0, (IInteger) $P1, (IInteger) $P2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IString substring(IValue $P0, IValue $P1){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T5)){
         $result = (IString)substring$0514f84f672f5ce7((IString) $P0, (IInteger) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IConstructor treeAt(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       return (IConstructor) M_ParseTree.treeAt($P0, $P1, $P2);
    }
    public IBool intersects(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IBool) M_Type.intersects($P0, $P1);
    }
    public IInteger toInt(IValue $P0){ // Generated by Resolver
       IInteger $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IInteger)toInt$12822748921e4771((IString) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IInteger toInt(IValue $P0, IValue $P1){ // Generated by Resolver
       IInteger $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T5)){
         $result = (IInteger)toInt$0590f9f382094f07((IString) $P0, (IInteger) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IString center(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T5) && $isSubtypeOf($P2Type,$T0)){
         $result = (IString)center$52f67e2d92391924((IString) $P0, (IInteger) $P1, (IString) $P2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IString center(IValue $P0, IValue $P1){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T5)){
         $result = (IString)center$aa984aa3c2c92d39((IString) $P0, (IInteger) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IString toLowerCase(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IString)toLowerCase$d291613c66227e6b((IString) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IInteger findFirst(IValue $P0, IValue $P1){ // Generated by Resolver
       IInteger $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0)){
         $result = (IInteger)findFirst$62cf7a4c873a58dc((IString) $P0, (IString) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IBool startsWith(IValue $P0, IValue $P1){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0)){
         $result = (IBool)startsWith$5601f7b0b13d80ab((IString) $P0, (IString) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IBool isValidCharacter(IValue $P0){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T5)){
         $result = (IBool)isValidCharacter$dfb82771160e144d((IInteger) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString toUpperCase(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IString)toUpperCase$b0212041c94274d3((IString) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString format(IValue $P0, IValue $P1, IValue $P2, IValue $P3){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       Type $P3Type = $P3.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0) && $isSubtypeOf($P2Type,$T5) && $isSubtypeOf($P3Type,$T0)){
         $result = (IString)format$ebcb1f2b92e6836c((IString) $P0, (IString) $P1, (IInteger) $P2, (IString) $P3);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2, $P3));
    }
    public IBool isNonTerminalType(IValue $P0){ // Generated by Resolver
       return (IBool) M_ParseTree.isNonTerminalType($P0);
    }
    public IString fromBase64(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IString)fromBase64$54ca46d2377b8260((IString) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IReal toReal(IValue $P0){ // Generated by Resolver
       IReal $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IReal)toReal$d69aecf51b4dea24((IString) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue lub(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IValue) M_Type.lub($P0, $P1);
    }
    public IBool rexpMatch(IValue $P0, IValue $P1){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0)){
         $result = (IBool)rexpMatch$695f05359dd8afb7((IString) $P0, (IString) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IString substitute(IValue $P0, IValue $P1){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T10)){
         $result = (IString)substitute$d8e63821278a2b4f((IString) $P0, (IMap) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IBool comparable(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IBool) M_Type.comparable($P0, $P1);
    }
    public IString fromBase32(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IString)fromBase32$d164f4476491de42((IString) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IBool subtype(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IBool) M_Type.subtype($P0, $P1);
    }
    public IConstructor associativity(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       return (IConstructor) M_ParseTree.associativity($P0, $P1, $P2);
    }
    public IList split(IValue $P0, IValue $P1){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0)){
         $result = (IList)split$2b7006a7930a5f01((IString) $P0, (IString) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IString replaceFirst(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0) && $isSubtypeOf($P2Type,$T0)){
         $result = (IString)replaceFirst$d0eb08d6bfea63c8((IString) $P0, (IString) $P1, (IString) $P2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IString right(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T5) && $isSubtypeOf($P2Type,$T0)){
         $result = (IString)right$a19b45a28c08042a((IString) $P0, (IInteger) $P1, (IString) $P2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IString right(IValue $P0, IValue $P1){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T5)){
         $result = (IString)right$1c5a07e3f4f4e757((IString) $P0, (IInteger) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IValue glb(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IValue) M_Type.glb($P0, $P1);
    }
    public IList chars(IValue $P0){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IList)chars$9e9ad8afcac271f7((IString) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IBool endsWith(IValue $P0, IValue $P1){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0)){
         $result = (IBool)endsWith$f3ad7f74941063ad((IString) $P0, (IString) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IValue sort(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T1)){
         $result = (IValue)M_List.sort$fa0b19c35a18e804((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T0)){
         return $RVF.constructor(M_ParseTree.Symbol_sort_str, new IValue[]{(IString) $P0});
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList sort(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IList) M_List.sort($P0, $P1);
    }
    public IBool contains(IValue $P0, IValue $P1){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0)){
         $result = (IBool)contains$e4589381d64ada78((IString) $P0, (IString) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }

    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(920,378,<28,0>,<44,1>) 
    public IString center$aa984aa3c2c92d39(IString s_0, IInteger n_1){ 
        
        
        return ((IString)($me.format(((IString)s_0), ((IString)$constants.get(0)/*"center"*/), ((IInteger)n_1), ((IString)$constants.get(1)/*" "*/))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(1302,85,<46,0>,<49,1>) 
    public IString center$52f67e2d92391924(IString s_0, IInteger n_1, IString pad_2){ 
        
        
        return ((IString)($me.format(((IString)s_0), ((IString)$constants.get(0)/*"center"*/), ((IInteger)n_1), ((IString)pad_2))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(1393,446,<52,0>,<65,61>) 
    public IInteger charAt$76bc78472313b181(IString s_0, IInteger i_1){ 
        
        
        return ((IInteger)((IInteger)$Prelude.charAt(s_0, i_1)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(1845,380,<68,0>,<80,67>) 
    public IList chars$9e9ad8afcac271f7(IString s_0){ 
        
        
        final IListWriter $listwriter0 = (IListWriter)$RVF.listWriter();
        final IInteger $lst2 = ((IInteger)($me.size(((IString)s_0))));
        final boolean $dir3 = ((IInteger)$constants.get(2)/*0*/).less($lst2).getValue();
        
        $LCOMP1_GEN2206:
        for(IInteger $elem2 = ((IInteger)$constants.get(2)/*0*/); $dir3 ? $aint_less_aint($elem2,$lst2).getValue() 
                                  : $aint_lessequal_aint($elem2,$lst2).not().getValue(); $elem2 = $aint_add_aint($elem2,$dir3 ? ((IInteger)$constants.get(3)/*1*/) : ((IInteger)$constants.get(4)/*-1*/))){
            IInteger i_1 = ((IInteger)($elem2));
            $listwriter0.append($me.charAt(((IString)s_0), ((IInteger)i_1)));
        }
        
        return ((IList)($listwriter0.done()));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(2231,360,<83,0>,<95,47>) 
    public IBool contains$e4589381d64ada78(IString input_0, IString find_1){ 
        
        
        return ((IBool)((IBool)$Prelude.contains(input_0, find_1)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(2597,649,<98,0>,<111,1>) 
    public IString deescape$a228c34b31540130(IString s_0){ 
        
        
        try {
            IString res_1 = ((IString)($TRAVERSE.traverse(DIRECTION.BottomUp, PROGRESS.Continuing, FIXEDPOINT.No, REBUILD.Yes, 
                 new DescendantDescriptor(new io.usethesource.vallang.type.Type[]{$TF.stringType()}, 
                                          new io.usethesource.vallang.IConstructor[]{}, 
                                          $RVF.bool(false)),
                 s_0,
                 (IVisitFunction) (IValue $VISIT0_subject, TraversalState $traversalState) -> {
                     VISIT0:switch(Fingerprint.getFingerprint($VISIT0_subject)){
                     
                         case 0:
                             
                     
                         default: 
                             if($isSubtypeOf($VISIT0_subject.getType(),$T0)){
                                /*muExists*/CASE_0_0: 
                                    do {
                                        final Matcher $matcher4 = (Matcher)$regExpCompile("^\\\\([\" \' \\< \\> \\\\])", ((IString)($VISIT0_subject)).getValue());
                                        boolean $found5 = true;
                                        
                                            while($found5){
                                                $found5 = $matcher4.find();
                                                if($found5){
                                                   IString c_2 = ((IString)($RVF.string($matcher4.group(1))));
                                                   $traversalState.setBegin($matcher4.start());
                                                   $traversalState.setEnd($matcher4.end());
                                                   IString $replacement3 = (IString)(c_2);
                                                   if($isSubtypeOf($replacement3.getType(),$VISIT0_subject.getType())){
                                                      $traversalState.setMatchedAndChanged(true, true);
                                                      return $replacement3;
                                                   
                                                   } else {
                                                      break VISIT0;// switch
                                                   
                                                   }
                                                }
                                        
                                            }
                                
                                    } while(false);
                             
                             }
                             if($isSubtypeOf($VISIT0_subject.getType(),$T0)){
                                /*muExists*/CASE_0_1: 
                                    do {
                                        final Matcher $matcher7 = (Matcher)$regExpCompile("^\\\\t", ((IString)($VISIT0_subject)).getValue());
                                        boolean $found8 = true;
                                        
                                            while($found8){
                                                $found8 = $matcher7.find();
                                                if($found8){
                                                   $traversalState.setBegin($matcher7.start());
                                                   $traversalState.setEnd($matcher7.end());
                                                   IString $replacement6 = (IString)(((IString)$constants.get(5)/*"	"*/));
                                                   if($isSubtypeOf($replacement6.getType(),$VISIT0_subject.getType())){
                                                      $traversalState.setMatchedAndChanged(true, true);
                                                      return $replacement6;
                                                   
                                                   } else {
                                                      break VISIT0;// switch
                                                   
                                                   }
                                                }
                                        
                                            }
                                
                                    } while(false);
                             
                             }
                             if($isSubtypeOf($VISIT0_subject.getType(),$T0)){
                                /*muExists*/CASE_0_2: 
                                    do {
                                        final Matcher $matcher10 = (Matcher)$regExpCompile("^\\\\n", ((IString)($VISIT0_subject)).getValue());
                                        boolean $found11 = true;
                                        
                                            while($found11){
                                                $found11 = $matcher10.find();
                                                if($found11){
                                                   $traversalState.setBegin($matcher10.start());
                                                   $traversalState.setEnd($matcher10.end());
                                                   IString $replacement9 = (IString)(((IString)$constants.get(6)/*"
                                                   "*/));
                                                   if($isSubtypeOf($replacement9.getType(),$VISIT0_subject.getType())){
                                                      $traversalState.setMatchedAndChanged(true, true);
                                                      return $replacement9;
                                                   
                                                   } else {
                                                      break VISIT0;// switch
                                                   
                                                   }
                                                }
                                        
                                            }
                                
                                    } while(false);
                             
                             }
                             if($isSubtypeOf($VISIT0_subject.getType(),$T0)){
                                /*muExists*/CASE_0_3: 
                                    do {
                                        final Matcher $matcher13 = (Matcher)$regExpCompile("^\\\\f", ((IString)($VISIT0_subject)).getValue());
                                        boolean $found14 = true;
                                        
                                            while($found14){
                                                $found14 = $matcher13.find();
                                                if($found14){
                                                   $traversalState.setBegin($matcher13.start());
                                                   $traversalState.setEnd($matcher13.end());
                                                   IString $replacement12 = (IString)(((IString)$constants.get(7)/*""*/));
                                                   if($isSubtypeOf($replacement12.getType(),$VISIT0_subject.getType())){
                                                      $traversalState.setMatchedAndChanged(true, true);
                                                      return $replacement12;
                                                   
                                                   } else {
                                                      break VISIT0;// switch
                                                   
                                                   }
                                                }
                                        
                                            }
                                
                                    } while(false);
                             
                             }
                             if($isSubtypeOf($VISIT0_subject.getType(),$T0)){
                                /*muExists*/CASE_0_4: 
                                    do {
                                        final Matcher $matcher16 = (Matcher)$regExpCompile("^\\\\b", ((IString)($VISIT0_subject)).getValue());
                                        boolean $found17 = true;
                                        
                                            while($found17){
                                                $found17 = $matcher16.find();
                                                if($found17){
                                                   $traversalState.setBegin($matcher16.start());
                                                   $traversalState.setEnd($matcher16.end());
                                                   IString $replacement15 = (IString)(((IString)$constants.get(8)/*""*/));
                                                   if($isSubtypeOf($replacement15.getType(),$VISIT0_subject.getType())){
                                                      $traversalState.setMatchedAndChanged(true, true);
                                                      return $replacement15;
                                                   
                                                   } else {
                                                      break VISIT0;// switch
                                                   
                                                   }
                                                }
                                        
                                            }
                                
                                    } while(false);
                             
                             }
                             if($isSubtypeOf($VISIT0_subject.getType(),$T0)){
                                /*muExists*/CASE_0_5: 
                                    do {
                                        final Matcher $matcher20 = (Matcher)$regExpCompile("^\\\\u([0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F])", ((IString)($VISIT0_subject)).getValue());
                                        boolean $found21 = true;
                                        
                                            while($found21){
                                                $found21 = $matcher20.find();
                                                if($found21){
                                                   IString hex_3 = ((IString)($RVF.string($matcher20.group(1))));
                                                   $traversalState.setBegin($matcher20.start());
                                                   $traversalState.setEnd($matcher20.end());
                                                   final Template $template19 = (Template)new Template($RVF, "0x");
                                                   $template19.beginIndent("  ");
                                                   $template19.addStr(((IString)hex_3).getValue());
                                                   $template19.endIndent("  ");
                                                   IString $replacement18 = (IString)($me.stringChar(((IInteger)($me.toInt(((IString)($template19.close())))))));
                                                   if($isSubtypeOf($replacement18.getType(),$VISIT0_subject.getType())){
                                                      $traversalState.setMatchedAndChanged(true, true);
                                                      return $replacement18;
                                                   
                                                   } else {
                                                      break VISIT0;// switch
                                                   
                                                   }
                                                }
                                        
                                            }
                                
                                    } while(false);
                             
                             }
                             if($isSubtypeOf($VISIT0_subject.getType(),$T0)){
                                /*muExists*/CASE_0_6: 
                                    do {
                                        final Matcher $matcher24 = (Matcher)$regExpCompile("^\\\\U([0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F])", ((IString)($VISIT0_subject)).getValue());
                                        boolean $found25 = true;
                                        
                                            while($found25){
                                                $found25 = $matcher24.find();
                                                if($found25){
                                                   IString hex_4 = ((IString)($RVF.string($matcher24.group(1))));
                                                   $traversalState.setBegin($matcher24.start());
                                                   $traversalState.setEnd($matcher24.end());
                                                   final Template $template23 = (Template)new Template($RVF, "0x");
                                                   $template23.beginIndent("  ");
                                                   $template23.addStr(((IString)hex_4).getValue());
                                                   $template23.endIndent("  ");
                                                   IString $replacement22 = (IString)($me.stringChar(((IInteger)($me.toInt(((IString)($template23.close())))))));
                                                   if($isSubtypeOf($replacement22.getType(),$VISIT0_subject.getType())){
                                                      $traversalState.setMatchedAndChanged(true, true);
                                                      return $replacement22;
                                                   
                                                   } else {
                                                      break VISIT0;// switch
                                                   
                                                   }
                                                }
                                        
                                            }
                                
                                    } while(false);
                             
                             }
                             if($isSubtypeOf($VISIT0_subject.getType(),$T0)){
                                /*muExists*/CASE_0_7: 
                                    do {
                                        final Matcher $matcher28 = (Matcher)$regExpCompile("^\\\\a([0-7][0-9a-fA-F])", ((IString)($VISIT0_subject)).getValue());
                                        boolean $found29 = true;
                                        
                                            while($found29){
                                                $found29 = $matcher28.find();
                                                if($found29){
                                                   IString hex_5 = ((IString)($RVF.string($matcher28.group(1))));
                                                   $traversalState.setBegin($matcher28.start());
                                                   $traversalState.setEnd($matcher28.end());
                                                   final Template $template27 = (Template)new Template($RVF, "0x");
                                                   $template27.beginIndent("  ");
                                                   $template27.addStr(((IString)hex_5).getValue());
                                                   $template27.endIndent("  ");
                                                   IString $replacement26 = (IString)($me.stringChar(((IInteger)($me.toInt(((IString)($template27.close())))))));
                                                   if($isSubtypeOf($replacement26.getType(),$VISIT0_subject.getType())){
                                                      $traversalState.setMatchedAndChanged(true, true);
                                                      return $replacement26;
                                                   
                                                   } else {
                                                      break VISIT0;// switch
                                                   
                                                   }
                                                }
                                        
                                            }
                                
                                    } while(false);
                             
                             }
            
                     }
                     return $VISIT0_subject;
                 })));
            return ((IString)res_1);
        
        } catch (ReturnFromTraversalException e) {
            return (IString) e.getValue();
        }
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(3252,327,<114,0>,<125,51>) 
    public IBool endsWith$f3ad7f74941063ad(IString subject_0, IString suffix_1){ 
        
        
        return ((IBool)((IBool)$Prelude.endsWith(subject_0, suffix_1)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(3585,478,<128,0>,<143,58>) 
    public IString escape$40186d5c03f23517(IString subject_0, IMap mapping_1){ 
        
        
        return ((IString)((IString)$Prelude.escape(subject_0, mapping_1)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(4071,501,<147,0>,<163,53>) 
    public IList findAll$e45a94c42cb47b4f(IString subject_0, IString find_1){ 
        
        
        return ((IList)((IList)$Prelude.findAll(subject_0, find_1)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(4578,517,<166,0>,<182,49>) 
    public IInteger findFirst$62cf7a4c873a58dc(IString subject_0, IString find_1){ 
        
        
        return ((IInteger)((IInteger)$Prelude.findFirst(subject_0, find_1)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(5101,512,<185,0>,<201,48>) 
    public IInteger findLast$a22f40b0cc4aac9a(IString subject_0, IString find_1){ 
        
        
        return ((IInteger)((IInteger)$Prelude.findLast(subject_0, find_1)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(5619,262,<204,0>,<216,32>) 
    public IBool isEmpty$c8b32c2fb32648d3(IString s_0){ 
        
        
        return ((IBool)((IBool)$Prelude.isEmpty(s_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(5887,287,<219,0>,<231,33>) 
    public IString arbString$030cc3bedaefe184(IInteger n_0){ 
        
        
        return ((IString)((IString)$Prelude.arbString(n_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(6180,381,<234,0>,<249,1>) 
    public IString left$347471385979c271(IString s_0, IInteger n_1){ 
        
        
        return ((IString)($me.format(((IString)s_0), ((IString)$constants.get(9)/*"left"*/), ((IInteger)n_1), ((IString)$constants.get(1)/*" "*/))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(6565,81,<251,0>,<254,1>) 
    public IString left$2803cc1f56e63a9a(IString s_0, IInteger n_1, IString pad_2){ 
        
        
        return ((IString)($me.format(((IString)s_0), ((IString)$constants.get(9)/*"left"*/), ((IInteger)n_1), ((IString)pad_2))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(6652,390,<257,0>,<269,46>) 
    public IString removeWhitespace$0b9997f5a179260e(IString subject_0){ 
        
        
        return ((IString)((IString)$Prelude.removeWhitespace(subject_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(7048,633,<272,0>,<289,67>) 
    public IString replaceAll$074d0bc75f28c903(IString subject_0, IString find_1, IString replacement_2){ 
        
        
        return ((IString)((IString)$Prelude.replaceAll(subject_0, find_1, replacement_2)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(7687,654,<292,0>,<309,69>) 
    public IString replaceFirst$d0eb08d6bfea63c8(IString subject_0, IString find_1, IString replacement_2){ 
        
        
        return ((IString)((IString)$Prelude.replaceFirst(subject_0, find_1, replacement_2)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(8347,650,<312,0>,<329,68>) 
    public IString replaceLast$2fb27d6e270b6bf1(IString subject_0, IString find_1, IString replacement_2){ 
        
        
        return ((IString)((IString)$Prelude.replaceLast(subject_0, find_1, replacement_2)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(9003,296,<332,0>,<343,31>) 
    public IString reverse$b071b5c94654378e(IString s_0){ 
        
        
        return ((IString)((IString)$Prelude.reverse(s_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(9307,557,<347,0>,<371,1>) 
    public IString right$1c5a07e3f4f4e757(IString s_0, IInteger n_1){ 
        
        
        return ((IString)($me.format(((IString)s_0), ((IString)$constants.get(10)/*"right"*/), ((IInteger)n_1), ((IString)$constants.get(1)/*" "*/))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(9868,83,<373,0>,<376,1>) 
    public IString right$a19b45a28c08042a(IString s_0, IInteger n_1, IString pad_2){ 
        
        
        return ((IString)($me.format(((IString)s_0), ((IString)$constants.get(10)/*"right"*/), ((IInteger)n_1), ((IString)pad_2))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(9959,273,<380,0>,<392,28>) 
    public IInteger size$1d28105b03d03294(IString s_0){ 
        
        
        return ((IInteger)((IInteger)$Prelude.size(s_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(10238,332,<395,0>,<406,53>) 
    public IBool startsWith$5601f7b0b13d80ab(IString subject_0, IString prefix_1){ 
        
        
        return ((IBool)((IBool)$Prelude.startsWith(subject_0, prefix_1)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(10578,155,<410,0>,<412,60>) 
    public IString stringChar$fa4a369e95efe399(IInteger $char_0){ 
        
        
        return ((IString)((IString)$Prelude.stringChar($char_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(10739,172,<415,0>,<417,68>) 
    public IString stringChars$ba6ec53397d26d23(IList chars_0){ 
        
        
        return ((IString)((IString)$Prelude.stringChars(chars_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(10917,161,<420,0>,<422,42>) 
    public IBool isValidCharacter$dfb82771160e144d(IInteger ch_0){ 
        
        
        return ((IBool)((IBool)$Prelude.isValidCharacter(ch_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(11084,434,<425,0>,<438,44>) 
    public IString substring$0514f84f672f5ce7(IString s_0, IInteger begin_1){ 
        
        
        return ((IString)((IString)$Prelude.substring(s_0, begin_1)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(11522,96,<440,0>,<441,53>) 
    public IString substring$1aa1c9331c9a704e(IString s_0, IInteger begin_1, IInteger end_2){ 
        
        
        return ((IString)((IString)$Prelude.substring(s_0, begin_1, end_2)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(11626,476,<445,0>,<465,52>) 
    public IInteger toInt$12822748921e4771(IString s_0){ 
        
        
        return ((IInteger)((IInteger)$Prelude.toInt(s_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(12106,102,<467,0>,<468,59>) 
    public IInteger toInt$0590f9f382094f07(IString s_0, IInteger r_1){ 
        
        
        return ((IInteger)((IInteger)$Prelude.toInt(s_0, r_1)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(12214,322,<471,0>,<482,35>) 
    public IString toLowerCase$d291613c66227e6b(IString s_0){ 
        
        
        return ((IString)((IString)$Prelude.toLowerCase(s_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(12544,333,<486,0>,<499,31>) 
    public IReal toReal$d69aecf51b4dea24(IString s_0){ 
        
        
        return ((IReal)((IReal)$Prelude.toReal(s_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(12883,327,<502,0>,<515,35>) 
    public IString toUpperCase$b0212041c94274d3(IString s_0){ 
        
        
        return ((IString)((IString)$Prelude.toUpperCase(s_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(13216,224,<518,0>,<527,28>) 
    public IString trim$886b1f284016d8e7(IString s_0){ 
        
        
        return ((IString)((IString)$Prelude.trim(s_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(13446,675,<530,0>,<546,46>) 
    public IString squeeze$26efc64f8be26d84(IString src_0, IString charSet_1){ 
        
        
        return ((IString)((IString)$Prelude.squeeze(src_0, charSet_1)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(14125,1250,<548,0>,<579,2>) 
    public IString squeeze$47c84bd053297355(IString src_0, IConstructor $__1){ 
        
        
        try {
            HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
            if($T6.match($__1.getType(), $typeBindings)){
               final IString $result34 = ((IString)($TRAVERSE.traverse(DIRECTION.BottomUp, PROGRESS.Continuing, FIXEDPOINT.No, REBUILD.Yes, 
                    new DescendantDescriptor(new io.usethesource.vallang.type.Type[]{$TF.stringType()}, 
                                             new io.usethesource.vallang.IConstructor[]{}, 
                                             $RVF.bool(false)),
                    src_0,
                    (IVisitFunction) (IValue $VISIT9_subject, TraversalState $traversalState) -> {
                        VISIT9:switch(Fingerprint.getFingerprint($VISIT9_subject)){
                        
                            case 0:
                                
                        
                            default: 
                                if($isSubtypeOf($VISIT9_subject.getType(),$T0)){
                                   /*muExists*/CASE_0_0: 
                                       do {
                                           final Matcher $matcher32 = (Matcher)$regExpCompile("(.)\\1+", ((IString)($VISIT9_subject)).getValue());
                                           boolean $found33 = true;
                                           
                                               while($found33){
                                                   $found33 = $matcher32.find();
                                                   if($found33){
                                                      IString c_1 = ((IString)($RVF.string($matcher32.group(1))));
                                                      $traversalState.setBegin($matcher32.start());
                                                      $traversalState.setEnd($matcher32.end());
                                                      final ITree $subject_val31 = ((ITree)($RVF.constructor(M_ParseTree.Tree_char_int, new IValue[]{((IInteger)($me.charAt(((IString)c_1), ((IInteger)$constants.get(2)/*0*/))))}, Util.kwpMap())));
                                                      if($isSubtypeOf($subject_val31.getType(),$T13.instantiate($typeBindings))){
                                                         IString $replacement30 = (IString)(c_1);
                                                         if($isSubtypeOf($replacement30.getType(),$VISIT9_subject.getType())){
                                                            $traversalState.setMatchedAndChanged(true, true);
                                                            return $replacement30;
                                                         
                                                         } else {
                                                            break VISIT9;// switch
                                                         
                                                         }
                                                      }
                                                   
                                                   }
                                           
                                               }
                                   
                                       } while(false);
                                
                                }
               
                        }
                        return $VISIT9_subject;
                    })));
               if($T0.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result34.getType(),$T0)){
                  return ((IString)($result34));
               
               } else {
                  return null;
               }
            } else {
               return null;
            }
        } catch (ReturnFromTraversalException e) {
            return (IString) e.getValue();
        }
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(15381,169,<582,0>,<584,46>) 
    public IList split$2b7006a7930a5f01(IString sep_0, IString src_1){ 
        
        
        return ((IList)((IList)$Prelude.split(sep_0, src_1)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(15554,79,<586,0>,<587,36>) 
    public IString capitalize$df09f3a91db3ee82(IString src_0){ 
        
        
        return ((IString)((IString)$Prelude.capitalize(src_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(15637,81,<589,0>,<590,38>) 
    public IString uncapitalize$4550db2211fb3ab7(IString src_0){ 
        
        
        return ((IString)((IString)$Prelude.uncapitalize(src_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(15722,401,<592,0>,<598,89>) 
    public IString toBase64$6fec5c5ff2fc5293(IString src_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = Util.kwpMap();
        IString $kwpDefault_charset = ((IString)DEFAULT_CHARSET);
        $kwpDefaults.put("charset", $kwpDefault_charset);IBool $kwpDefault_includePadding = ((IBool)$constants.get(11)/*true*/);
        $kwpDefaults.put("includePadding", $kwpDefault_includePadding);
        return ((IString)((IString)$Prelude.toBase64(src_0, (IString)($kwpActuals.containsKey("charset") ? $kwpActuals.get("charset") : $kwpDefaults.get("charset")), (IBool)($kwpActuals.containsKey("includePadding") ? $kwpActuals.get("includePadding") : $kwpDefaults.get("includePadding")))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(16127,384,<600,0>,<606,65>) 
    public IString fromBase64$54ca46d2377b8260(IString src_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = Util.kwpMap();
        IString $kwpDefault_charset = ((IString)DEFAULT_CHARSET);
        $kwpDefaults.put("charset", $kwpDefault_charset);
        return ((IString)((IString)$Prelude.fromBase64(src_0, (IString)($kwpActuals.containsKey("charset") ? $kwpActuals.get("charset") : $kwpDefaults.get("charset")))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(16515,401,<608,0>,<614,89>) 
    public IString toBase32$40a8f4ee61bf737a(IString src_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = Util.kwpMap();
        IString $kwpDefault_charset = ((IString)DEFAULT_CHARSET);
        $kwpDefaults.put("charset", $kwpDefault_charset);IBool $kwpDefault_includePadding = ((IBool)$constants.get(11)/*true*/);
        $kwpDefaults.put("includePadding", $kwpDefault_includePadding);
        return ((IString)((IString)$Prelude.toBase32(src_0, (IString)($kwpActuals.containsKey("charset") ? $kwpActuals.get("charset") : $kwpDefaults.get("charset")), (IBool)($kwpActuals.containsKey("includePadding") ? $kwpActuals.get("includePadding") : $kwpDefaults.get("includePadding")))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(16920,384,<616,0>,<622,65>) 
    public IString fromBase32$d164f4476491de42(IString src_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = Util.kwpMap();
        IString $kwpDefault_charset = ((IString)DEFAULT_CHARSET);
        $kwpDefaults.put("charset", $kwpDefault_charset);
        return ((IString)((IString)$Prelude.fromBase32(src_0, (IString)($kwpActuals.containsKey("charset") ? $kwpActuals.get("charset") : $kwpDefaults.get("charset")))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(17310,274,<625,0>,<630,46>) 
    public IString wrap$ada69a3de2fdae29(IString src_0, IInteger wrapLength_1){ 
        
        
        return ((IString)((IString)$Prelude.wrap(src_0, wrapLength_1)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(17756,99,<637,0>,<638,56>) 
    public IString format$ebcb1f2b92e6836c(IString s_0, IString dir_1, IInteger n_2, IString pad_3){ 
        
        
        return ((IString)((IString)$Prelude.format(s_0, dir_1, n_2, pad_3)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(17861,213,<641,0>,<646,42>) 
    public IBool rexpMatch$695f05359dd8afb7(IString s_0, IString re_1){ 
        
        
        return ((IBool)((IBool)$Prelude.rexpMatch(s_0, re_1)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(18080,535,<649,0>,<662,96>) 
    public ISourceLocation toLocation$4c81a2fde84f5d1c(IString s_0){ 
        
        
        final Matcher $matcher36 = (Matcher)$regExpCompile("(.*)\\://(.*)", ((IString)s_0).getValue());
        boolean $found37 = true;
        
            while($found37){
                $found37 = $matcher36.find();
                if($found37){
                   IString car_1 = ((IString)($RVF.string($matcher36.group(1))));
                   IString cdr_2 = ((IString)($RVF.string($matcher36.group(2))));
                   return ((ISourceLocation)($create_aloc(((IString)($astr_add_astr(((IString)($astr_add_astr(((IString)$constants.get(12)/*""*/),$astr_add_astr(((IString)car_1),((IString)$constants.get(13)/*"://"*/))))),((IString)($astr_add_astr(((IString)$constants.get(12)/*""*/),$astr_add_astr(((IString)cdr_2),((IString)$constants.get(12)/*""*/)))))))))));
                
                } else {
                   return ((ISourceLocation)($create_aloc(((IString)($astr_add_astr(((IString)$constants.get(14)/*"cwd://"*/),((IString)($astr_add_astr(((IString)$constants.get(15)/*"/"*/),$astr_add_astr(((IString)s_0),((IString)$constants.get(12)/*""*/)))))))))));
                
                }
            }
        return null;
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(19396,202,<681,4>,<686,5>) 
    public IString subst1$3569213557ac366f(IString src_0, ISourceLocation x_1, IString y_2, ValueRef<IInteger> shift_2){ 
        
        
        IInteger delta_3 = ((IInteger)(((IInteger) ((IInteger)($me.size(((IString)y_2)))).subtract(((IInteger)(((IInteger)($aloc_get_field(((ISourceLocation)x_1), "length")))))))));
        src_0 = ((IString)($astr_add_astr(((IString)($astr_add_astr(((IString)($astr_slice(((IString)(src_0)), 0, null, ((IInteger)($aint_add_aint(((IInteger)(((IInteger)($aloc_get_field(((ISourceLocation)x_1), "offset"))))),shift_2.getValue()))).intValue()))),((IString)y_2)))),((IString)($astr_slice(((IString)(src_0)), ((IInteger)($aint_add_aint(((IInteger)($aint_add_aint(((IInteger)(((IInteger)($aloc_get_field(((ISourceLocation)x_1), "offset"))))),((IInteger)(((IInteger)($aloc_get_field(((ISourceLocation)x_1), "length")))))))),shift_2.getValue()))).intValue(), null, null))))));
        IInteger $aux_1 = ((IInteger)delta_3);
        shift_2.setValue($aint_add_aint(shift_2.getValue(),$aux_1));
        return ((IString)src_0);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(19633,50,<687,33>,<687,83>) 
    public IBool $CLOSURE_0(ISourceLocation a_0, ISourceLocation b_1){ 
        
        
        return ((IBool)($aint_less_aint(((IInteger)(((IInteger)($aloc_get_field(((ISourceLocation)a_0), "offset"))))),((IInteger)(((IInteger)($aloc_get_field(((ISourceLocation)b_1), "offset"))))))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(18621,1123,<665,0>,<689,1>) 
    public IString substitute$d8e63821278a2b4f(IString src_0, IMap s_1){ 
        
        
        final ValueRef<IInteger> shift_2 = new ValueRef<IInteger>("shift", ((IInteger)$constants.get(2)/*0*/));
        final IListWriter $listwriter38 = (IListWriter)$RVF.listWriter();
        $LCOMP39_GEN19623:
        for(IValue $elem40_for : ((IMap)s_1)){
            ISourceLocation $elem40 = (ISourceLocation) $elem40_for;
            ISourceLocation k_4 = null;
            $listwriter38.append($elem40);
        
        }
        
                    IList order_3 = ((IList)(M_List.sort(((IList)($listwriter38.done())), new TypedFunctionInstance2<IValue,IValue,IValue>(($_0, $_1) -> { return $CLOSURE_0((ISourceLocation)$_0, (ISourceLocation)$_1); }, $T14))));
        IString $reducer42 = (IString)(src_0);
        $REDUCER41_GEN19728:
        for(IValue $elem43_for : ((IList)order_3)){
            ISourceLocation $elem43 = (ISourceLocation) $elem43_for;
            ISourceLocation x_6 = ((ISourceLocation)($elem43));
            $reducer42 = ((IString)(substitute_subst1(((IString)($reducer42)), ((ISourceLocation)x_6), ((IString)($amap_subscript(((IMap)s_1),((ISourceLocation)x_6)))), shift_2)));
        
        }
        
                    return ((IString)($reducer42));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/String.rsc|(19748,938,<691,0>,<709,74>) 
    public IString indent$aa6595c10ef14e07(IString indentation_0, IString content_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_indent$aa6595c10ef14e07;
    
        return ((IString)((IString)$Prelude.indent(indentation_0, content_1, (IBool)($kwpActuals.containsKey("indentFirstLine") ? $kwpActuals.get("indentFirstLine") : $kwpDefaults.get("indentFirstLine")))));
    
    }
    

    public static void main(String[] args) {
      throw new RuntimeException("No function `main` found in Rascal module `String`");
    }
}