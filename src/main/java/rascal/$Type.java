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
public class $Type 
    extends
        org.rascalmpl.runtime.$RascalModule
    implements 
    	rascal.$Type_$I {

    private final $Type_$I $me;
    private final IList $constants;
    
    

    
    final org.rascalmpl.library.Type $Type; // TODO: asBaseClassName will generate name collisions if there are more of the same name in different packages

    
    public final io.usethesource.vallang.type.Type $T12;	/*avalue(alabel="tag")*/
    public final io.usethesource.vallang.type.Type $T14;	/*astr(alabel="name")*/
    public final io.usethesource.vallang.type.Type $T1;	/*avalue()*/
    public final io.usethesource.vallang.type.Type $T6;	/*astr()*/
    public final io.usethesource.vallang.type.Type $T10;	/*aparameter("U",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type $T2;	/*aparameter("T",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type $T21;	/*aparameter("T",avalue(),closed=true)*/
    public final io.usethesource.vallang.type.Type ADT_Symbol;	/*aadt("Symbol",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Attr;	/*aadt("Attr",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T19;	/*aset(aadt("Attr",[],dataSyntax()),alabel="attributes")*/
    public final io.usethesource.vallang.type.Type ADT_Production;	/*aadt("Production",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T3;	/*aset(aadt("Production",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type Symbol_label_str_Symbol;	/*acons(aadt("Symbol",[],dataSyntax()),[astr(alabel="name"),aadt("Symbol",[],dataSyntax(),alabel="symbol")],[],alabel="label")*/
    public final io.usethesource.vallang.type.Type $T15;	/*alist(aadt("Symbol",[],dataSyntax()),alabel="parameters")*/
    public final io.usethesource.vallang.type.Type Symbol_adt_str_list_Symbol;	/*acons(aadt("Symbol",[],dataSyntax()),[astr(alabel="name"),alist(aadt("Symbol",[],dataSyntax()),alabel="parameters")],[],alabel="adt")*/
    public final io.usethesource.vallang.type.Type ADT_Exception;	/*aadt("Exception",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T9;	/*areified(aparameter("U",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type Symbol_rat_;	/*acons(aadt("Symbol",[],dataSyntax()),[],[],alabel="rat")*/
    public final io.usethesource.vallang.type.Type $T13;	/*aset(aadt("Production",[],dataSyntax()),alabel="alternatives")*/
    public final io.usethesource.vallang.type.Type Production_choice_Symbol_set_Production;	/*acons(aadt("Production",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="def"),aset(aadt("Production",[],dataSyntax()),alabel="alternatives")],[],alabel="choice")*/
    public final io.usethesource.vallang.type.Type $T11;	/*aset(aadt("Symbol",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type $T17;	/*alist(aadt("Symbol",[],dataSyntax()),alabel="kwTypes")*/
    public final io.usethesource.vallang.type.Type Symbol_set_Symbol;	/*acons(aadt("Symbol",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="symbol")],[],alabel="set")*/
    public final io.usethesource.vallang.type.Type $T18;	/*alist(aadt("Symbol",[],dataSyntax()),alabel="symbols")*/
    public final io.usethesource.vallang.type.Type Symbol_tuple_list_Symbol;	/*acons(aadt("Symbol",[],dataSyntax()),[alist(aadt("Symbol",[],dataSyntax()),alabel="symbols")],[],alabel="tuple")*/
    public final io.usethesource.vallang.type.Type $T7;	/*alist(avalue())*/
    public final io.usethesource.vallang.type.Type Symbol_real_;	/*acons(aadt("Symbol",[],dataSyntax()),[],[],alabel="real")*/
    public final io.usethesource.vallang.type.Type Symbol_void_;	/*acons(aadt("Symbol",[],dataSyntax()),[],[],alabel="void")*/
    public final io.usethesource.vallang.type.Type Symbol_bool_;	/*acons(aadt("Symbol",[],dataSyntax()),[],[],alabel="bool")*/
    public final io.usethesource.vallang.type.Type Symbol_node_;	/*acons(aadt("Symbol",[],dataSyntax()),[],[],alabel="node")*/
    public final io.usethesource.vallang.type.Type Symbol_func_Symbol_list_Symbol_list_Symbol;	/*acons(aadt("Symbol",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="ret"),alist(aadt("Symbol",[],dataSyntax()),alabel="parameters"),alist(aadt("Symbol",[],dataSyntax()),alabel="kwTypes")],[],alabel="func")*/
    public final io.usethesource.vallang.type.Type Symbol_loc_;	/*acons(aadt("Symbol",[],dataSyntax()),[],[],alabel="loc")*/
    public final io.usethesource.vallang.type.Type Production_cons_Symbol_list_Symbol_list_Symbol_set_Attr;	/*acons(aadt("Production",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="def"),alist(aadt("Symbol",[],dataSyntax()),alabel="symbols"),alist(aadt("Symbol",[],dataSyntax()),alabel="kwTypes"),aset(aadt("Attr",[],dataSyntax()),alabel="attributes")],[],alabel="cons")*/
    public final io.usethesource.vallang.type.Type $T8;	/*amap(astr(),avalue())*/
    public final io.usethesource.vallang.type.Type Symbol_alias_str_list_Symbol_Symbol;	/*acons(aadt("Symbol",[],dataSyntax()),[astr(alabel="name"),alist(aadt("Symbol",[],dataSyntax()),alabel="parameters"),aadt("Symbol",[],dataSyntax(),alabel="aliased")],[],alabel="alias")*/
    public final io.usethesource.vallang.type.Type $T16;	/*areified(avalue(),alabel="to")*/
    public final io.usethesource.vallang.type.Type Exception_typeCastException_Symbol_reified_value;	/*acons(aadt("Exception",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="from"),areified(avalue(),alabel="to")],[],alabel="typeCastException")*/
    public final io.usethesource.vallang.type.Type Symbol_reified_Symbol;	/*acons(aadt("Symbol",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="symbol")],[],alabel="reified")*/
    public final io.usethesource.vallang.type.Type Symbol_map_Symbol_Symbol;	/*acons(aadt("Symbol",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="from"),aadt("Symbol",[],dataSyntax(),alabel="to")],[],alabel="map")*/
    public final io.usethesource.vallang.type.Type $T20;	/*abool()*/
    public final io.usethesource.vallang.type.Type Symbol_cons_Symbol_str_list_Symbol;	/*acons(aadt("Symbol",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="adt"),astr(alabel="name"),alist(aadt("Symbol",[],dataSyntax()),alabel="parameters")],[],alabel="cons")*/
    public final io.usethesource.vallang.type.Type $T5;	/*areified(avalue())*/
    public final io.usethesource.vallang.type.Type $T0;	/*areified(aparameter("T",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type Symbol_str_;	/*acons(aadt("Symbol",[],dataSyntax()),[],[],alabel="str")*/
    public final io.usethesource.vallang.type.Type Symbol_list_Symbol;	/*acons(aadt("Symbol",[],dataSyntax()),[aadt("Symbol",[],dataSyntax(),alabel="symbol")],[],alabel="list")*/
    public final io.usethesource.vallang.type.Type Symbol_int_;	/*acons(aadt("Symbol",[],dataSyntax()),[],[],alabel="int")*/
    public final io.usethesource.vallang.type.Type Symbol_parameter_str_Symbol;	/*acons(aadt("Symbol",[],dataSyntax()),[astr(alabel="name"),aadt("Symbol",[],dataSyntax(),alabel="bound")],[],alabel="parameter")*/
    public final io.usethesource.vallang.type.Type Symbol_datetime_;	/*acons(aadt("Symbol",[],dataSyntax()),[],[],alabel="datetime")*/
    public final io.usethesource.vallang.type.Type Attr_tag_value;	/*acons(aadt("Attr",[],dataSyntax()),[avalue(alabel="tag")],[],alabel="tag")*/
    public final io.usethesource.vallang.type.Type Production_composition_Production_Production;	/*acons(aadt("Production",[],dataSyntax()),[aadt("Production",[],dataSyntax(),alabel="lhs"),aadt("Production",[],dataSyntax(),alabel="rhs")],[],alabel="composition")*/
    public final io.usethesource.vallang.type.Type Symbol_num_;	/*acons(aadt("Symbol",[],dataSyntax()),[],[],alabel="num")*/
    public final io.usethesource.vallang.type.Type $T4;	/*alist(aadt("Symbol",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type Symbol_value_;	/*acons(aadt("Symbol",[],dataSyntax()),[],[],alabel="value")*/

    public $Type(RascalExecutionContext rex){
        this(rex, null);
    }
    
    public $Type(RascalExecutionContext rex, Object extended){
       super(rex);
       this.$me = extended == null ? this : ($Type_$I)extended;
       ModuleStore mstore = rex.getModuleStore();
       mstore.put(rascal.$Type.class, this);
        
        
       
                          
       
       
       $Type = $initLibrary("org.rascalmpl.library.Type"); 
    
       $constants = readBinaryConstantsFile(this.getClass(), "rascal/$Type.constants", 6, "541e9e85a02d501ae443c42c2f283415");
       ADT_Symbol = $adt("Symbol");
       ADT_Attr = $adt("Attr");
       ADT_Production = $adt("Production");
       ADT_Exception = $adt("Exception");
       $T12 = $TF.valueType();
       $T14 = $TF.stringType();
       $T1 = $TF.valueType();
       $T6 = $TF.stringType();
       $T10 = $TF.parameterType("U", $T1);
       $T2 = $TF.parameterType("T", $T1);
       $T21 = $TF.parameterType("T", $T1);
       $T19 = $TF.setType(ADT_Attr);
       $T3 = $TF.setType(ADT_Production);
       $T15 = $TF.listType(ADT_Symbol);
       $T9 = $RTF.reifiedType($T10);
       $T13 = $TF.setType(ADT_Production);
       $T11 = $TF.setType(ADT_Symbol);
       $T17 = $TF.listType(ADT_Symbol);
       $T18 = $TF.listType(ADT_Symbol);
       $T7 = $TF.listType($T1);
       $T8 = $TF.mapType($T6,$T1);
       $T16 = $RTF.reifiedType($T1);
       $T20 = $TF.boolType();
       $T5 = $RTF.reifiedType($T1);
       $T0 = $RTF.reifiedType($T2);
       $T4 = $TF.listType(ADT_Symbol);
       Symbol_label_str_Symbol = $TF.constructor($TS, ADT_Symbol, "label", $TF.stringType(), "name", ADT_Symbol, "symbol");
       Symbol_adt_str_list_Symbol = $TF.constructor($TS, ADT_Symbol, "adt", $TF.stringType(), "name", $TF.listType(ADT_Symbol), "parameters");
       Symbol_rat_ = $TF.constructor($TS, ADT_Symbol, "rat");
       Production_choice_Symbol_set_Production = $TF.constructor($TS, ADT_Production, "choice", ADT_Symbol, "def", $TF.setType(ADT_Production), "alternatives");
       Symbol_set_Symbol = $TF.constructor($TS, ADT_Symbol, "set", ADT_Symbol, "symbol");
       Symbol_tuple_list_Symbol = $TF.constructor($TS, ADT_Symbol, "tuple", $TF.listType(ADT_Symbol), "symbols");
       Symbol_real_ = $TF.constructor($TS, ADT_Symbol, "real");
       Symbol_void_ = $TF.constructor($TS, ADT_Symbol, "void");
       Symbol_bool_ = $TF.constructor($TS, ADT_Symbol, "bool");
       Symbol_node_ = $TF.constructor($TS, ADT_Symbol, "node");
       Symbol_func_Symbol_list_Symbol_list_Symbol = $TF.constructor($TS, ADT_Symbol, "func", ADT_Symbol, "ret", $TF.listType(ADT_Symbol), "parameters", $TF.listType(ADT_Symbol), "kwTypes");
       Symbol_loc_ = $TF.constructor($TS, ADT_Symbol, "loc");
       Production_cons_Symbol_list_Symbol_list_Symbol_set_Attr = $TF.constructor($TS, ADT_Production, "cons", ADT_Symbol, "def", $TF.listType(ADT_Symbol), "symbols", $TF.listType(ADT_Symbol), "kwTypes", $TF.setType(ADT_Attr), "attributes");
       Symbol_alias_str_list_Symbol_Symbol = $TF.constructor($TS, ADT_Symbol, "alias", $TF.stringType(), "name", $TF.listType(ADT_Symbol), "parameters", ADT_Symbol, "aliased");
       Exception_typeCastException_Symbol_reified_value = $TF.constructor($TS, ADT_Exception, "typeCastException", ADT_Symbol, "from", $RTF.reifiedType($T1), "to");
       Symbol_reified_Symbol = $TF.constructor($TS, ADT_Symbol, "reified", ADT_Symbol, "symbol");
       Symbol_map_Symbol_Symbol = $TF.constructor($TS, ADT_Symbol, "map", ADT_Symbol, "from", ADT_Symbol, "to");
       Symbol_cons_Symbol_str_list_Symbol = $TF.constructor($TS, ADT_Symbol, "cons", ADT_Symbol, "adt", $TF.stringType(), "name", $TF.listType(ADT_Symbol), "parameters");
       Symbol_str_ = $TF.constructor($TS, ADT_Symbol, "str");
       Symbol_list_Symbol = $TF.constructor($TS, ADT_Symbol, "list", ADT_Symbol, "symbol");
       Symbol_int_ = $TF.constructor($TS, ADT_Symbol, "int");
       Symbol_parameter_str_Symbol = $TF.constructor($TS, ADT_Symbol, "parameter", $TF.stringType(), "name", ADT_Symbol, "bound");
       Symbol_datetime_ = $TF.constructor($TS, ADT_Symbol, "datetime");
       Attr_tag_value = $TF.constructor($TS, ADT_Attr, "tag", $TF.valueType(), "tag");
       Production_composition_Production_Production = $TF.constructor($TS, ADT_Production, "composition", ADT_Production, "lhs", ADT_Production, "rhs");
       Symbol_num_ = $TF.constructor($TS, ADT_Symbol, "num");
       Symbol_value_ = $TF.constructor($TS, ADT_Symbol, "value");
    
       
       
    }
    public IValue glb(IValue $P0, IValue $P1){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type, ADT_Symbol) && $isSubtypeOf($P1Type, ADT_Symbol)){
         $result = (IValue)glb$2a18714af2d802c3((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0)){
         $result = (IValue)glb$59b6cf650e824d48((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IConstructor choice(IValue $P0, IValue $P1){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type, ADT_Symbol) && $isSubtypeOf($P1Type,$T3)){
         $result = (IConstructor)choice$a4f82780e053873f((IConstructor) $P0, (ISet) $P1);
         if($result != null) return $result;
         return $RVF.constructor(Production_choice_Symbol_set_Production, new IValue[]{(IConstructor) $P0, (ISet) $P1});
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IConstructor var_func(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type, ADT_Symbol) && $isSubtypeOf($P1Type,$T4) && $isSubtypeOf($P2Type, ADT_Symbol)){
         $result = (IConstructor)var_func$c4917a6070ead7b1((IConstructor) $P0, (IList) $P1, (IConstructor) $P2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IBool equivalent(IValue $P0, IValue $P1){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type, ADT_Symbol) && $isSubtypeOf($P1Type, ADT_Symbol)){
         $result = (IBool)equivalent$b80578aefd7b95cc((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T5) && $isSubtypeOf($P1Type,$T5)){
         $result = (IBool)equivalent$c2f21e5fd630ae06((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IBool eq(IValue $P0, IValue $P1){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T1) && $isSubtypeOf($P1Type,$T1)){
         $result = (IBool)eq$c460bb024efedd31((IValue) $P0, (IValue) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IConstructor lrel(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T4)){
         $result = (IConstructor)lrel$5ab7a6db5c86d26c((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue make(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T6) && $isSubtypeOf($P2Type,$T7)){
         $result = (IValue)make$5630723622c41bf7((IConstructor) $P0, (IString) $P1, (IList) $P2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IValue make(IValue $P0, IValue $P1, IValue $P2, IValue $P3){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       Type $P3Type = $P3.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T6) && $isSubtypeOf($P2Type,$T7) && $isSubtypeOf($P3Type,$T8)){
         $result = (IValue)make$a322b1df90ccf185((IConstructor) $P0, (IString) $P1, (IList) $P2, (IMap) $P3);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2, $P3));
    }
    public IConstructor typeOf(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T1)){
         $result = (IConstructor)typeOf$73e3c5c239ab1c0f((IValue) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IBool intersects(IValue $P0, IValue $P1){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type, ADT_Symbol) && $isSubtypeOf($P1Type, ADT_Symbol)){
         $result = (IBool)intersects$ab7308944d4aff6a((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T9)){
         $result = (IBool)intersects$68785f7cb12167dc((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IConstructor rel(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T4)){
         $result = (IConstructor)rel$f715ab9f6fdcb5d7((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue typeCast(IValue $P0, IValue $P1){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T1)){
         $result = (IValue)typeCast$5707bb642f46dc34((IConstructor) $P0, (IValue) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IConstructor overloaded(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T11)){
         $result = (IConstructor)overloaded$91abbfdab41c82f3((ISet) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue lub(IValue $P0, IValue $P1){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type, ADT_Symbol) && $isSubtypeOf($P1Type, ADT_Symbol)){
         $result = (IValue)lub$857c550d07505336((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0)){
         $result = (IValue)lub$5bcadce7aab8b825((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IBool comparable(IValue $P0, IValue $P1){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type, ADT_Symbol) && $isSubtypeOf($P1Type, ADT_Symbol)){
         $result = (IBool)comparable$e54bb0a2ed07a3e3((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T5) && $isSubtypeOf($P1Type,$T5)){
         $result = (IBool)comparable$61fb3f8fd5c9405c((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IBool subtype(IValue $P0, IValue $P1){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type, ADT_Symbol) && $isSubtypeOf($P1Type, ADT_Symbol)){
         $result = (IBool)subtype$5812ee03e14f807b((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T9)){
         $result = (IBool)subtype$5251fdf562c874a7((IConstructor) $P0, (IConstructor) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }

    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Type.rsc|(5105,127,<107,0>,<109,29>) 
    public IConstructor rel$f715ab9f6fdcb5d7(IList symbols_0){ 
        
        
        return ((IConstructor)($RVF.constructor(Symbol_set_Symbol, new IValue[]{((IConstructor)($RVF.constructor(Symbol_tuple_list_Symbol, new IValue[]{((IList)symbols_0)})))})));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Type.rsc|(5236,131,<111,0>,<113,30>) 
    public IConstructor lrel$5ab7a6db5c86d26c(IList symbols_0){ 
        
        
        return ((IConstructor)($RVF.constructor(Symbol_list_Symbol, new IValue[]{((IConstructor)($RVF.constructor(Symbol_tuple_list_Symbol, new IValue[]{((IList)symbols_0)})))})));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Type.rsc|(5373,322,<116,0>,<121,57>) 
    public IConstructor overloaded$91abbfdab41c82f3(ISet alternatives_0){ 
        
        
        IConstructor $reducer1 = (IConstructor)(((IConstructor)$constants.get(0)/*void()*/));
        $REDUCER0_GEN5669:
        for(IValue $elem2_for : ((ISet)alternatives_0)){
            IConstructor $elem2 = (IConstructor) $elem2_for;
            IConstructor a_2 = null;
            $reducer1 = ((IConstructor)(lub(((IValue)($reducer1)), ((IValue)($elem2)))));
        
        }
        
                    return ((IConstructor)($reducer1));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Type.rsc|(6580,218,<146,0>,<148,50>) 
    public IConstructor var_func$c4917a6070ead7b1(IConstructor ret_0, IList parameters_1, IConstructor varArg_2){ 
        
        
        return ((IConstructor)($RVF.constructor(Symbol_func_Symbol_list_Symbol_list_Symbol, new IValue[]{((IConstructor)ret_0), ((IList)($alist_add_elm(((IList)parameters_1),((IConstructor)($RVF.constructor(Symbol_list_Symbol, new IValue[]{((IConstructor)varArg_2)})))))), ((IList)$constants.get(1)/*[]*/)})));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Type.rsc|(6802,1228,<150,0>,<185,1>) 
    public IConstructor choice$a4f82780e053873f(IConstructor s_0, ISet choices_1){ 
        
        
        /*muExists*/IF3: 
            do {
                IBool $done6 = (IBool)(((IBool)$constants.get(2)/*true*/));
                /*muExists*/$ANY7_GEN7297_CONS_choice: 
                    do {
                        $ANY7_GEN7297:
                        for(IValue $elem8_for : ((ISet)choices_1)){
                            IConstructor $elem8 = (IConstructor) $elem8_for;
                            if($has_type_and_arity($elem8, Production_choice_Symbol_set_Production, 2)){
                               IValue $arg0_10 = (IValue)($aadt_subscript_int(((IConstructor)($elem8)),0));
                               if($isComparable($arg0_10.getType(), ADT_Symbol)){
                                  IValue $arg1_9 = (IValue)($aadt_subscript_int(((IConstructor)($elem8)),1));
                                  if($isComparable($arg1_9.getType(), $T3)){
                                     $done6 = ((IBool)$constants.get(3)/*false*/);
                                     break $ANY7_GEN7297_CONS_choice; // muSucceed
                                  } else {
                                     continue $ANY7_GEN7297;
                                  }
                               } else {
                                  continue $ANY7_GEN7297;
                               }
                            } else {
                               continue $ANY7_GEN7297;
                            }
                        }
                        
                                    
                    } while(false);
                if((((IBool)($done6))).getValue()){
                  return null;
                }
        
            } while(false);
        IBool changed_2 = ((IBool)$constants.get(3)/*false*/);
        ISet new_choices_3 = ((ISet)$constants.get(4)/*{}*/);
        /*muExists*/FOR0: 
            do {
                FOR0_GEN7681:
                for(IValue $elem5_for : ((ISet)choices_1)){
                    IConstructor $elem5 = (IConstructor) $elem5_for;
                    IConstructor ch_4 = null;
                    if($has_type_and_arity($elem5, Production_choice_Symbol_set_Production, 2)){
                       IValue $arg0_4 = (IValue)($aadt_subscript_int(((IConstructor)($elem5)),0));
                       if($isComparable($arg0_4.getType(), ADT_Symbol)){
                          IValue $arg1_3 = (IValue)($aadt_subscript_int(((IConstructor)($elem5)),1));
                          if($isComparable($arg1_3.getType(), $T3)){
                             ISet b_5 = null;
                             changed_2 = ((IBool)$constants.get(2)/*true*/);
                             new_choices_3 = ((ISet)($aset_add_aset(((ISet)new_choices_3),((ISet)($arg1_3)))));
                          
                          } else {
                             new_choices_3 = ((ISet)($aset_add_elm(((ISet)new_choices_3),((IConstructor)($elem5)))));
                          
                          }
                       } else {
                          new_choices_3 = ((ISet)($aset_add_elm(((ISet)new_choices_3),((IConstructor)($elem5)))));
                       
                       }
                    } else {
                       new_choices_3 = ((ISet)($aset_add_elm(((ISet)new_choices_3),((IConstructor)($elem5)))));
                    
                    }
                }
                continue FOR0;
                            
            } while(false);
        /* void:  muCon([]) */if((((IBool)changed_2)).getValue()){
           return ((IConstructor)(choice(((IConstructor)s_0), ((ISet)new_choices_3))));
        
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Type.rsc|(8038,1258,<188,0>,<214,67>) 
    public IBool subtype$5251fdf562c874a7(IConstructor t_0, IConstructor u_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(t_0.getType(), $typeBindings)){
           if($T9.match(u_1.getType(), $typeBindings)){
              final IBool $result11 = ((IBool)(subtype(((IValue)(((IConstructor)($areified_get_field(t_0, "symbol"))))), ((IValue)(((IConstructor)($areified_get_field(u_1, "symbol"))))))));
              if($T20.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result11.getType(),$T20)){
                 return ((IBool)($result11));
              
              } else {
                 return ((IBool)$constants.get(3)/*false*/);
              
              }
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Type.rsc|(9300,175,<216,0>,<218,38>) 
    public IBool subtype$5812ee03e14f807b(IConstructor s_0, IConstructor t_1){ 
        
        
        return ((IBool)((IBool)$Type.subtype(s_0, t_1)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Type.rsc|(9479,893,<220,0>,<232,41>) 
    public IBool intersects$ab7308944d4aff6a(IConstructor s_0, IConstructor t_1){ 
        
        
        return ((IBool)((IBool)$Type.intersects(s_0, t_1)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Type.rsc|(10376,79,<234,0>,<235,38>) 
    public IBool intersects$68785f7cb12167dc(IConstructor t_0, IConstructor u_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(t_0.getType(), $typeBindings)){
           if($T9.match(u_1.getType(), $typeBindings)){
              final IBool $result12 = ((IBool)(intersects(((IValue)(((IConstructor)($areified_get_field(t_0, "symbol"))))), ((IValue)(((IConstructor)($areified_get_field(u_1, "symbol"))))))));
              if($T20.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result12.getType(),$T20)){
                 return ((IBool)($result12));
              
              } else {
                 return ((IBool)$constants.get(3)/*false*/);
              
              }
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Type.rsc|(10459,165,<237,0>,<238,67>) 
    public IBool comparable$e54bb0a2ed07a3e3(IConstructor s_0, IConstructor t_1){ 
        
        
        if((((IBool)(subtype(((IValue)s_0), ((IValue)t_1))))).getValue()){
           return ((IBool)$constants.get(2)/*true*/);
        
        } else {
           return ((IBool)(subtype(((IValue)t_1), ((IValue)s_0))));
        
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Type.rsc|(10629,79,<240,0>,<240,79>) 
    public IBool comparable$61fb3f8fd5c9405c(IConstructor s_0, IConstructor t_1){ 
        
        
        return ((IBool)(comparable(((IValue)(((IConstructor)($areified_get_field(s_0, "symbol"))))), ((IValue)(((IConstructor)($areified_get_field(t_1, "symbol"))))))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Type.rsc|(10712,157,<242,0>,<243,67>) 
    public IBool equivalent$b80578aefd7b95cc(IConstructor s_0, IConstructor t_1){ 
        
        
        if((((IBool)(subtype(((IValue)s_0), ((IValue)t_1))))).getValue()){
           return ((IBool)(subtype(((IValue)t_1), ((IValue)s_0))));
        
        } else {
           return ((IBool)$constants.get(3)/*false*/);
        
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Type.rsc|(10873,79,<245,0>,<245,79>) 
    public IBool equivalent$c2f21e5fd630ae06(IConstructor s_0, IConstructor t_1){ 
        
        
        return ((IBool)(equivalent(((IValue)(((IConstructor)($areified_get_field(s_0, "symbol"))))), ((IValue)(((IConstructor)($areified_get_field(t_1, "symbol"))))))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Type.rsc|(10956,569,<247,0>,<263,31>) 
    public IBool eq$c460bb024efedd31(IValue x_0, IValue y_1){ 
        
        
        return ((IBool)((IBool)$Type.eq(x_0, y_1)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Type.rsc|(11529,491,<265,0>,<278,38>) 
    public IConstructor lub$857c550d07505336(IConstructor s1_0, IConstructor s2_1){ 
        
        
        return ((IConstructor)((IConstructor)$Type.lub(s1_0, s2_1)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Type.rsc|(12024,82,<280,0>,<281,41>) 
    public IConstructor lub$5bcadce7aab8b825(IConstructor t_0, IConstructor u_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(t_0.getType(), $typeBindings)){
           if($T0.match(u_1.getType(), $typeBindings)){
              final IConstructor $result15 = ((IConstructor)($reifiedAType((IConstructor) lub(((IValue)(((IConstructor)($areified_get_field(t_0, "symbol"))))), ((IValue)(((IConstructor)($areified_get_field(u_1, "symbol")))))), ((IMap)$constants.get(5)/*()*/))));
              if($T5.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result15.getType(),$T5)){
                 return ((IConstructor)($result15));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Type.rsc|(12110,512,<283,0>,<296,38>) 
    public IConstructor glb$2a18714af2d802c3(IConstructor s1_0, IConstructor s2_1){ 
        
        
        return ((IConstructor)((IConstructor)$Type.glb(s1_0, s2_1)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Type.rsc|(12626,82,<298,0>,<299,41>) 
    public IConstructor glb$59b6cf650e824d48(IConstructor t_0, IConstructor u_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(t_0.getType(), $typeBindings)){
           if($T0.match(u_1.getType(), $typeBindings)){
              final IConstructor $result16 = ((IConstructor)($reifiedAType((IConstructor) glb(((IValue)(((IConstructor)($areified_get_field(t_0, "symbol"))))), ((IValue)(((IConstructor)($areified_get_field(u_1, "symbol")))))), ((IMap)$constants.get(5)/*()*/))));
              if($T5.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result16.getType(),$T5)){
                 return ((IConstructor)($result16));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Type.rsc|(12780,126,<303,0>,<309,1>) 
    public IValue typeCast$5707bb642f46dc34(IConstructor typ_0, IValue v_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(typ_0.getType(), $typeBindings)){
           if($isSubtypeOf(v_1.getType(),$T21.instantiate($typeBindings))){
              IValue x_2 = null;
              final IValue $result17 = ((IValue)v_1);
              if($T21.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result17.getType(),$T21)){
                 return ((IValue)($result17));
              
              } else {
                 return null;
              }
           }
           throw new Throw($RVF.constructor(Exception_typeCastException_Symbol_reified_value, new IValue[]{((IConstructor)($me.typeOf(((IValue)v_1)))), ((IConstructor)typ_0)}));
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Type.rsc|(12910,500,<311,0>,<318,55>) 
    public IValue make$5630723622c41bf7(IConstructor typ_0, IString name_1, IList args_2){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(typ_0.getType(), $typeBindings)){
           final IValue $result18 = ((IValue)((IValue)$Type.make(typ_0, name_1, args_2)));
           if($T21.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result18.getType(),$T21)){
              return ((IValue)($result18));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Type.rsc|(13415,123,<320,0>,<321,83>) 
    public IValue make$a322b1df90ccf185(IConstructor typ_0, IString name_1, IList args_2, IMap keywordArgs_3){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(typ_0.getType(), $typeBindings)){
           final IValue $result19 = ((IValue)((IValue)$Type.make(typ_0, name_1, args_2, keywordArgs_3)));
           if($T21.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result19.getType(),$T21)){
              return ((IValue)($result19));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Type.rsc|(13543,702,<323,0>,<346,28>) 
    public IConstructor typeOf$73e3c5c239ab1c0f(IValue v_0){ 
        
        
        return ((IConstructor)((IConstructor)$Type.typeOf(v_0)));
    
    }
    

    public static void main(String[] args) {
      throw new RuntimeException("No function `main` found in Rascal module `Type`");
    }
}