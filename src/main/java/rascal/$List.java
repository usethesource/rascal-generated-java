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
public class $List 
    extends
        org.rascalmpl.runtime.$RascalModule
    implements 
    	rascal.$List_$I {

    private final $List_$I $me;
    private final IList $constants;
    
    
    public final rascal.$Exception M_Exception;
    public final rascal.$Map M_Map;

    
    final org.rascalmpl.library.Prelude $Prelude; // TODO: asBaseClassName will generate name collisions if there are more of the same name in different packages

    
    public final io.usethesource.vallang.type.Type $T24;	/*anum()*/
    public final io.usethesource.vallang.type.Type $T1;	/*avalue()*/
    public final io.usethesource.vallang.type.Type $T2;	/*aparameter("T",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type $T25;	/*aparameter("T",anum(),closed=false,alabel="hd")*/
    public final io.usethesource.vallang.type.Type $T37;	/*aparameter("T",avalue(),closed=false,alabel="t")*/
    public final io.usethesource.vallang.type.Type $T12;	/*aparameter("A",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type $T13;	/*aparameter("B",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type $T15;	/*aparameter("U",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type $T76;	/*aparameter("T",avalue(),closed=true,alabel="third")*/
    public final io.usethesource.vallang.type.Type $T39;	/*aparameter("T",avalue(),closed=false,alabel="b")*/
    public final io.usethesource.vallang.type.Type $T65;	/*aparameter("V",avalue(),closed=true)*/
    public final io.usethesource.vallang.type.Type $T71;	/*aint(alabel="index")*/
    public final io.usethesource.vallang.type.Type $T10;	/*aparameter("T",avalue(),closed=false,alabel="h")*/
    public final io.usethesource.vallang.type.Type $T17;	/*aparameter("T",avalue(),closed=false,alabel="f")*/
    public final io.usethesource.vallang.type.Type $T27;	/*aparameter("T",anum(),closed=false)*/
    public final io.usethesource.vallang.type.Type $T68;	/*aparameter("T",avalue(),closed=true,alabel="first")*/
    public final io.usethesource.vallang.type.Type $T55;	/*aparameter("T",anum(),closed=true)*/
    public final io.usethesource.vallang.type.Type $T42;	/*aint(alabel="occurs")*/
    public final io.usethesource.vallang.type.Type $T72;	/*aparameter("T",avalue(),closed=true,alabel="elem")*/
    public final io.usethesource.vallang.type.Type $T4;	/*aparameter("K",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type $T5;	/*aparameter("V",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type $T21;	/*aparameter("T",avalue(),closed=false,alabel="a")*/
    public final io.usethesource.vallang.type.Type $T69;	/*aparameter("U",avalue(),closed=true,alabel="second")*/
    public final io.usethesource.vallang.type.Type $T74;	/*aparameter("V",avalue(),closed=true,alabel="third")*/
    public final io.usethesource.vallang.type.Type $T41;	/*aparameter("T",avalue(),closed=false,alabel="element")*/
    public final io.usethesource.vallang.type.Type $T45;	/*aparameter("T",avalue(),closed=true,alabel="element")*/
    public final io.usethesource.vallang.type.Type $T7;	/*astr()*/
    public final io.usethesource.vallang.type.Type $T58;	/*aparameter("B",avalue(),closed=true)*/
    public final io.usethesource.vallang.type.Type $T30;	/*aparameter("T",avalue(),closed=true)*/
    public final io.usethesource.vallang.type.Type $T6;	/*aint()*/
    public final io.usethesource.vallang.type.Type $T57;	/*aparameter("A",avalue(),closed=true)*/
    public final io.usethesource.vallang.type.Type $T49;	/*aparameter("U",avalue(),closed=true)*/
    public final io.usethesource.vallang.type.Type $T32;	/*aparameter("T",avalue(),closed=false,alabel="_")*/
    public final io.usethesource.vallang.type.Type $T75;	/*alrel(atypeList([aparameter("T",avalue(),closed=true,alabel="first"),aparameter("U",avalue(),closed=true,alabel="second"),aparameter("T",avalue(),closed=true,alabel="third")]))*/
    public final io.usethesource.vallang.type.Type $T18;	/*aset(aparameter("T",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type $T34;	/*alist(aparameter("V",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type $T16;	/*alist(aparameter("T",avalue(),closed=false,alabel="f"))*/
    public final io.usethesource.vallang.type.Type $T43;	/*alist(aparameter("T",avalue(),closed=true))*/
    public final io.usethesource.vallang.type.Type $T9;	/*alist(aparameter("T",avalue(),closed=false,alabel="h"))*/
    public final io.usethesource.vallang.type.Type $T31;	/*alist(aparameter("T",avalue(),closed=false,alabel="_"))*/
    public final io.usethesource.vallang.type.Type $T8;	/*alist(avalue())*/
    public final io.usethesource.vallang.type.Type $T11;	/*alrel(atypeList([aparameter("A",avalue(),closed=false),aparameter("B",avalue(),closed=false)]))*/
    public final io.usethesource.vallang.type.Type $T20;	/*abool()*/
    public final io.usethesource.vallang.type.Type $T38;	/*afunc(abool(),[aparameter("T",avalue(),closed=false,alabel="a"),aparameter("T",avalue(),closed=false,alabel="b")],[])*/
    public final io.usethesource.vallang.type.Type $T33;	/*alist(aparameter("U",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type $T67;	/*alrel(atypeList([aparameter("T",avalue(),closed=true,alabel="first"),aparameter("U",avalue(),closed=true,alabel="second")]))*/
    public final io.usethesource.vallang.type.Type $T22;	/*alrel(atypeList([aparameter("T",avalue(),closed=false),aparameter("U",avalue(),closed=false)]))*/
    public final io.usethesource.vallang.type.Type $T3;	/*amap(aparameter("K",avalue(),closed=false),aparameter("V",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type $T0;	/*alist(aparameter("T",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type $T52;	/*atuple(atypeList([alist(aparameter("T",avalue(),closed=true)),alist(aparameter("T",avalue(),closed=true))]))*/
    public final io.usethesource.vallang.type.Type $T40;	/*amap(aparameter("T",avalue(),closed=false,alabel="element"),aint(alabel="occurs"))*/
    public final io.usethesource.vallang.type.Type $T36;	/*alist(aparameter("T",avalue(),closed=false,alabel="t"))*/
    public final io.usethesource.vallang.type.Type $T26;	/*alist(aparameter("T",anum(),closed=false))*/
    public final io.usethesource.vallang.type.Type $T47;	/*alist(aint())*/
    public final io.usethesource.vallang.type.Type $T59;	/*alist(aparameter("B",avalue(),closed=true))*/
    public final io.usethesource.vallang.type.Type $T51;	/*afunc(abool(),[aparameter("T",avalue(),closed=false,alabel="a"),aparameter("T",avalue(),closed=false,alabel="b")],[],returnsViaAllPath=true)*/
    public final io.usethesource.vallang.type.Type $T48;	/*alist(aparameter("U",avalue(),closed=true))*/
    public final io.usethesource.vallang.type.Type $T70;	/*alrel(atypeList([aint(alabel="index"),aparameter("T",avalue(),closed=true,alabel="elem")]))*/
    public final io.usethesource.vallang.type.Type $T66;	/*alist(aparameter("V",avalue(),closed=true))*/
    public final io.usethesource.vallang.type.Type $T62;	/*aset(aparameter("T",avalue(),closed=true))*/
    public final io.usethesource.vallang.type.Type $T56;	/*amap(aparameter("A",avalue(),closed=true),alist(aparameter("B",avalue(),closed=true)))*/
    public final io.usethesource.vallang.type.Type $T60;	/*amap(aparameter("A",avalue(),closed=true),aparameter("B",avalue(),closed=true))*/
    public final io.usethesource.vallang.type.Type $T19;	/*afunc(abool(),[aparameter("T",avalue(),closed=false,alabel="a")],[])*/
    public final io.usethesource.vallang.type.Type $T14;	/*afunc(aparameter("U",avalue(),closed=false),[aparameter("T",avalue(),closed=false)],[])*/
    public final io.usethesource.vallang.type.Type $T54;	/*alist(alist(aparameter("T",avalue(),closed=true)))*/
    public final io.usethesource.vallang.type.Type $T29;	/*afunc(aparameter("T",avalue(),closed=true),[aparameter("T",avalue(),closed=false),aparameter("T",avalue(),closed=false)],[])*/
    public final io.usethesource.vallang.type.Type $T61;	/*arel(atypeList([aparameter("T",avalue(),closed=true),aparameter("T",avalue(),closed=true)]))*/
    public final io.usethesource.vallang.type.Type $T50;	/*aset(alist(aparameter("T",avalue(),closed=true)))*/
    public final io.usethesource.vallang.type.Type $T63;	/*atuple(atypeList([alist(aparameter("T",avalue(),closed=true)),alist(aparameter("U",avalue(),closed=true))]))*/
    public final io.usethesource.vallang.type.Type ADT_RuntimeException;	/*aadt("RuntimeException",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T28;	/*alrel(atypeList([aparameter("T",avalue(),closed=false),aparameter("U",avalue(),closed=false),aparameter("V",avalue(),closed=false)]))*/
    public final io.usethesource.vallang.type.Type $T53;	/*afunc(abool(),[aparameter("T",avalue(),closed=false,alabel="a")],[],returnsViaAllPath=true)*/
    public final io.usethesource.vallang.type.Type $T64;	/*atuple(atypeList([alist(aparameter("T",avalue(),closed=true)),alist(aparameter("U",avalue(),closed=true)),alist(aparameter("V",avalue(),closed=true))]))*/
    public final io.usethesource.vallang.type.Type $T35;	/*alist(alist(aparameter("T",avalue(),closed=false)))*/
    public final io.usethesource.vallang.type.Type $T46;	/*atuple(atypeList([aparameter("T",avalue(),closed=true),alist(aparameter("T",avalue(),closed=true))]))*/
    public final io.usethesource.vallang.type.Type $T44;	/*amap(aparameter("T",avalue(),closed=true,alabel="element"),aint(alabel="occurs"))*/
    public final io.usethesource.vallang.type.Type $T23;	/*alist(aparameter("T",anum(),closed=false,alabel="hd"))*/
    public final io.usethesource.vallang.type.Type $T73;	/*alrel(atypeList([aparameter("T",avalue(),closed=true,alabel="first"),aparameter("U",avalue(),closed=true,alabel="second"),aparameter("V",avalue(),closed=true,alabel="third")]))*/

    public $List(RascalExecutionContext rex){
        this(rex, null);
    }
    
    public $List(RascalExecutionContext rex, Object extended){
       super(rex);
       this.$me = extended == null ? this : ($List_$I)extended;
       ModuleStore mstore = rex.getModuleStore();
       mstore.put(rascal.$List.class, this);
       
       mstore.importModule(rascal.$Exception.class, rex, rascal.$Exception::new);
       mstore.importModule(rascal.$Map.class, rex, rascal.$Map::new); 
       
       M_Exception = mstore.getModule(rascal.$Exception.class);
       M_Map = mstore.getModule(rascal.$Map.class); 
       
                          
       
       $TS.importStore(M_Exception.$TS);
       $TS.importStore(M_Map.$TS);
       
       $Prelude = $initLibrary("org.rascalmpl.library.Prelude"); 
    
       $constants = readBinaryConstantsFile(this.getClass(), "rascal/$List.constants", 11, "ec2d05959de6a65091904c172c026df2");
       ADT_RuntimeException = $adt("RuntimeException");
       $T24 = $TF.numberType();
       $T1 = $TF.valueType();
       $T2 = $TF.parameterType("T", $T1);
       $T25 = $TF.parameterType("T", $T24);
       $T37 = $TF.parameterType("T", $T1);
       $T12 = $TF.parameterType("A", $T1);
       $T13 = $TF.parameterType("B", $T1);
       $T15 = $TF.parameterType("U", $T1);
       $T76 = $TF.parameterType("T", $T1);
       $T39 = $TF.parameterType("T", $T1);
       $T65 = $TF.parameterType("V", $T1);
       $T71 = $TF.integerType();
       $T10 = $TF.parameterType("T", $T1);
       $T17 = $TF.parameterType("T", $T1);
       $T27 = $TF.parameterType("T", $T24);
       $T68 = $TF.parameterType("T", $T1);
       $T55 = $TF.parameterType("T", $T24);
       $T42 = $TF.integerType();
       $T72 = $TF.parameterType("T", $T1);
       $T4 = $TF.parameterType("K", $T1);
       $T5 = $TF.parameterType("V", $T1);
       $T21 = $TF.parameterType("T", $T1);
       $T69 = $TF.parameterType("U", $T1);
       $T74 = $TF.parameterType("V", $T1);
       $T41 = $TF.parameterType("T", $T1);
       $T45 = $TF.parameterType("T", $T1);
       $T7 = $TF.stringType();
       $T58 = $TF.parameterType("B", $T1);
       $T30 = $TF.parameterType("T", $T1);
       $T6 = $TF.integerType();
       $T57 = $TF.parameterType("A", $T1);
       $T49 = $TF.parameterType("U", $T1);
       $T32 = $TF.parameterType("T", $T1);
       $T75 = $TF.listType($TF.tupleType($T68, $T69, $T76));
       $T18 = $TF.setType($T2);
       $T34 = $TF.listType($T5);
       $T16 = $TF.listType($T17);
       $T43 = $TF.listType($T30);
       $T9 = $TF.listType($T10);
       $T31 = $TF.listType($T32);
       $T8 = $TF.listType($T1);
       $T11 = $TF.listType($TF.tupleType($T12, $T13));
       $T20 = $TF.boolType();
       $T38 = $TF.functionType($T20, $TF.tupleType($T21, "a", $T39, "b"), $TF.tupleEmpty());
       $T33 = $TF.listType($T15);
       $T67 = $TF.listType($TF.tupleType($T68, $T69));
       $T22 = $TF.listType($TF.tupleType($T2, $T15));
       $T3 = $TF.mapType($T4,$T5);
       $T0 = $TF.listType($T2);
       $T52 = $TF.tupleType($T43, $T43);
       $T40 = $TF.mapType($T41, "element", $T42, "occurs");
       $T36 = $TF.listType($T37);
       $T26 = $TF.listType($T27);
       $T47 = $TF.listType($T6);
       $T59 = $TF.listType($T58);
       $T51 = $TF.functionType($T20, $TF.tupleType($T21, "a", $T39, "b"), $TF.tupleEmpty());
       $T48 = $TF.listType($T49);
       $T70 = $TF.listType($TF.tupleType($T71, $T72));
       $T66 = $TF.listType($T65);
       $T62 = $TF.setType($T30);
       $T56 = $TF.mapType($T57,$T59);
       $T60 = $TF.mapType($T57,$T58);
       $T19 = $TF.functionType($T20, $TF.tupleType($T21, "a"), $TF.tupleEmpty());
       $T14 = $TF.functionType($T15, $TF.tupleType($T2), $TF.tupleEmpty());
       $T54 = $TF.listType($T43);
       $T29 = $TF.functionType($T30, $TF.tupleType($T2, $T2), $TF.tupleEmpty());
       $T61 = $TF.setType($TF.tupleType($T30, $T30));
       $T50 = $TF.setType($T43);
       $T63 = $TF.tupleType($T43, $T48);
       $T28 = $TF.listType($TF.tupleType($T2, $T15, $T5));
       $T53 = $TF.functionType($T20, $TF.tupleType($T21, "a"), $TF.tupleEmpty());
       $T64 = $TF.tupleType($T43, $T48, $T66);
       $T35 = $TF.listType($T0);
       $T46 = $TF.tupleType($T30, $T43);
       $T44 = $TF.mapType($T45, "element", $T42, "occurs");
       $T23 = $TF.listType($T25);
       $T73 = $TF.listType($TF.tupleType($T68, $T69, $T74));
    
       
       
    }
    public IBool isEmpty(IValue $P0){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IBool)isEmpty$3708d66822aa111a((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T3)){
         $result = (IBool)M_Map.isEmpty$a24a92e9fab0a069((IMap) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue last(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IValue)last$9ac3d0212382d094((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList shuffle(IValue $P0){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IList)shuffle$30274c0d2631d638((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList shuffle(IValue $P0, IValue $P1){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T6)){
         $result = (IList)shuffle$c82b8ec516b86b6f((IList) $P0, (IInteger) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IString intercalate(IValue $P0, IValue $P1){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T7) && $isSubtypeOf($P1Type,$T8)){
         $result = (IString)intercalate$d1ca4248619bead5((IString) $P0, (IList) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IValue head(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T9)){
         $result = (IValue)head$9a1565ea96e50b88((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IValue)head$87e8fb1a25bc63f1((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList head(IValue $P0, IValue $P1){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T6)){
         $result = (IList)head$7dfae1d3745d7d65((IList) $P0, (IInteger) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IInteger size(IValue $P0){ // Generated by Resolver
       IInteger $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IInteger)size$811ff6e419f455d9((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T3)){
         $result = (IInteger)M_Map.size$37f80aadf49ad435((IMap) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IMap toMap(IValue $P0){ // Generated by Resolver
       IMap $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T11)){
         $result = (IMap)toMap$5edc6ed092abb52e((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList mapper(IValue $P0, IValue $P1){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T14)){
         $result = (IList)mapper$81fa089c3ccda4f7((IList) $P0, (TypedFunctionInstance1<IValue, IValue>) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IList reverse(IValue $P0){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IList)reverse$f869e80411fd5479((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList remove(IValue $P0, IValue $P1){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T6)){
         $result = (IList)remove$aafffcf3c9309d96((IList) $P0, (IInteger) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IValue max(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T9)){
         $result = (IValue)max$9542dff773662ba8((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IValue)max$a65b4f1e9d6ce28f((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IMap distribution(IValue $P0){ // Generated by Resolver
       IMap $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IMap)distribution$d6b74dcbba95e885((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue getFirstFrom(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T16)){
         $result = (IValue)getFirstFrom$de7747ba8ecf5d2d((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IValue)getFirstFrom$52641577be663f10((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public ISet toSet(IValue $P0){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (ISet)toSet$8be251e84a40f0a6((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IBool isSorted(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IBool)isSorted$c5ea501b54b4455d((IList) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList take(IValue $P0, IValue $P1){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T6) && $isSubtypeOf($P1Type,$T0)){
         $result = (IList)take$a6af73252a54deda((IInteger) $P0, (IList) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IList zipi(IValue $P0){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IList)zipi$cae1e21146aaa24d((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T18)){
         $result = (IList)zipi$4854310b56fabc67((ISet) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public ITuple takeOneFrom(IValue $P0){ // Generated by Resolver
       ITuple $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (ITuple)takeOneFrom$c52f3e30bbbc1271((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IInteger indexOf(IValue $P0, IValue $P1){ // Generated by Resolver
       IInteger $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T2)){
         $result = (IInteger)indexOf$608361fb33aa9217((IList) $P0, (IValue) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IList takeWhile(IValue $P0, IValue $P1){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T19)){
         $result = (IList)takeWhile$77843fe1b1f32286((IList) $P0, (TypedFunctionInstance1<IValue, IValue>) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public ITuple unzip2(IValue $P0){ // Generated by Resolver
       ITuple $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T22)){
         $result = (ITuple)unzip2$9bbb8718fecb84f2((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList delete(IValue $P0, IValue $P1){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T6)){
         $result = (IList)delete$1670b5cba82eacb1((IList) $P0, (IInteger) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public INumber sum(IValue $P0){ // Generated by Resolver
       INumber $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T23)){
         $result = (INumber)sum$59dbbfdf3f3e8245((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T26)){
         $result = (INumber)sum$c2873c33b4fb6ee7((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public ITuple unzip3(IValue $P0){ // Generated by Resolver
       ITuple $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T28)){
         $result = (ITuple)unzip3$d376d93c0401d00a((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList insertAt(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T6) && $isSubtypeOf($P2Type,$T2)){
         $result = (IList)insertAt$baad348d13c6bf8a((IList) $P0, (IInteger) $P1, (IValue) $P2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IString toString(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IString)toString$83c4cca13eaf692b((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue reducer(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T29) && $isSubtypeOf($P2Type,$T2)){
         $result = (IValue)reducer$2ceaa4ffe514acfc((IList) $P0, (TypedFunctionInstance2<IValue, IValue, IValue>) $P1, (IValue) $P2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public ISet permutations(IValue $P0){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (ISet)permutations$f29f8fcb02c23e0e((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList drop(IValue $P0, IValue $P1){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T6) && $isSubtypeOf($P1Type,$T0)){
         $result = (IList)drop$9dc361ec0f485f6b((IInteger) $P0, (IList) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IValue elementAt(IValue $P0, IValue $P1){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T6)){
         $result = (IValue)elementAt$6b74f609c48b0b0a((IList) $P0, (IInteger) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public ITuple headTail(IValue $P0){ // Generated by Resolver
       ITuple $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T9)){
         $result = (ITuple)headTail$0117af68d5f5d287((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T0)){
         $result = (ITuple)headTail$2900a5bdaa720793((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList upTill(IValue $P0){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T6)){
         $result = (IList)upTill$bc783e9ad62ed3d1((IInteger) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList tail(IValue $P0){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T31)){
         $result = (IList)tail$93ed13792d756b09((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IList)tail$c67bc8cf2c42391e((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList tail(IValue $P0, IValue $P1){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T6)){
         $result = (IList)tail$3960c3b97b108528((IList) $P0, (IInteger) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public ITuple pop(IValue $P0){ // Generated by Resolver
       ITuple $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (ITuple)pop$4363849a74e9527e((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList zip2(IValue $P0, IValue $P1){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T33)){
         $result = (IList)zip2$205b91f8857e010b((IList) $P0, (IList) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IList zip2(IValue $P0, IValue $P1, IValue $P2, IValue $P3){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       Type $P3Type = $P3.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T2) && $isSubtypeOf($P2Type,$T33) && $isSubtypeOf($P3Type,$T15)){
         $result = (IList)zip2$db6f5d9d0017d934((IList) $P0, (IValue) $P1, (IList) $P2, (IValue) $P3);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2, $P3));
    }
    public IMap toMapUnique(IValue $P0){ // Generated by Resolver
       IMap $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T11)){
         $result = (IMap)toMapUnique$8f526334e10e63c0((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList index(IValue $P0){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IList)index$f006059c1d37534f((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList slice(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T6) && $isSubtypeOf($P2Type,$T6)){
         $result = (IList)slice$c3aabb87409c7918((IList) $P0, (IInteger) $P1, (IInteger) $P2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IValue min(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T9)){
         $result = (IValue)min$c23fb8d51ed1eb26((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IValue)min$e28c8bb4309a1fa8((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList prefix(IValue $P0){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IList)prefix$59a0a240af4ad5d8((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList zip3(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T33) && $isSubtypeOf($P2Type,$T34)){
         $result = (IList)zip3$137353bc59ba6245((IList) $P0, (IList) $P1, (IList) $P2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IList zip3(IValue $P0, IValue $P1, IValue $P2, IValue $P3, IValue $P4, IValue $P5){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       Type $P3Type = $P3.getType();
       Type $P4Type = $P4.getType();
       Type $P5Type = $P5.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T2) && $isSubtypeOf($P2Type,$T33) && $isSubtypeOf($P3Type,$T15) && $isSubtypeOf($P4Type,$T34) && $isSubtypeOf($P5Type,$T5)){
         $result = (IList)zip3$ca94a0b311d1db9f((IList) $P0, (IValue) $P1, (IList) $P2, (IValue) $P3, (IList) $P4, (IValue) $P5);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2, $P3, $P4, $P5));
    }
    public IInteger lastIndexOf(IValue $P0, IValue $P1){ // Generated by Resolver
       IInteger $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T2)){
         $result = (IInteger)lastIndexOf$a867c00e69b27bf4((IList) $P0, (IValue) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IList concat(IValue $P0){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T35)){
         $result = (IList)concat$82337f7bc8d6f630((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue top(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T36)){
         $result = (IValue)top$1f6275c8538af543((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString itoString(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IString)itoString$a409429dd777074c((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList intersperse(IValue $P0, IValue $P1){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T2) && $isSubtypeOf($P1Type,$T0)){
         $result = (IList)intersperse$b193bef12aa9c203((IValue) $P0, (IList) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IList merge(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0) && $isSubtypeOf($P2Type,$T38)){
         $result = (IList)merge$64cff63c6a2c35ea((IList) $P0, (IList) $P1, (TypedFunctionInstance2<IValue, IValue, IValue>) $P2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IList merge(IValue $P0, IValue $P1){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0)){
         $result = (IList)merge$766be902c133739c((IList) $P0, (IList) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IValue getOneFrom(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IValue)getOneFrom$9f31447a835de72c((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IMap removeFromBag(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       IMap $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T40) && $isSubtypeOf($P1Type,$T2) && $isSubtypeOf($P2Type,$T6)){
         $result = (IMap)removeFromBag$9863b50c4dd8fc38((IMap) $P0, (IValue) $P1, (IInteger) $P2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IMap removeFromBag(IValue $P0, IValue $P1){ // Generated by Resolver
       IMap $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T40) && $isSubtypeOf($P1Type,$T2)){
         $result = (IMap)removeFromBag$ac8c320f7c241406((IMap) $P0, (IValue) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public ITuple split(IValue $P0){ // Generated by Resolver
       ITuple $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (ITuple)split$9e25259188753c78((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList push(IValue $P0, IValue $P1){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T2) && $isSubtypeOf($P1Type,$T0)){
         $result = (IList)push$81b052cf87c2fff9((IValue) $P0, (IList) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public ISet permutationsBag(IValue $P0){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T40)){
         $result = (ISet)permutationsBag$de98b23277e5c92b((IMap) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList mix(IValue $P0, IValue $P1){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0)){
         $result = (IList)mix$c619c4d7cd9b432e((IList) $P0, (IList) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public ISet toRel(IValue $P0){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (ISet)toRel$5140186369371220((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList sort(IValue $P0){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IList)sort$fa0b19c35a18e804((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList sort(IValue $P0, IValue $P1){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T38)){
         $result = (IList)sort$3510e1cc7fe6c8ba((IList) $P0, (TypedFunctionInstance2<IValue, IValue, IValue>) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IList dup(IValue $P0){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IList)dup$149bf66e3d1f8803((IList) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList group(IValue $P0, IValue $P1){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T38)){
         $result = (IList)group$fe1596515cea5bde((IList) $P0, (TypedFunctionInstance2<IValue, IValue, IValue>) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }

    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(702,261,<23,0>,<35,31>) 
    public IList concat$82337f7bc8d6f630(IList xxs_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T35.match(xxs_0.getType(), $typeBindings)){
           if(true){
              final IListWriter $listwriter0 = (IListWriter)$RVF.listWriter();
              $LCOMP1_GEN943:
              for(IValue $elem2_for : ((IList)xxs_0)){
                  IList $elem2 = (IList) $elem2_for;
                  if($isSubtypeOf($elem2.getType(),$T43.instantiate($typeBindings))){
                     IList xs_1 = null;
                     $listwriter_splice($listwriter0,$elem2);
                  
                  } else {
                     continue $LCOMP1_GEN943;
                  }
              }
              
                          final IList $result3 = ((IList)($listwriter0.done()));
              if($T43.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result3.getType(),$T43)){
                 return ((IList)($result3));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(969,445,<38,0>,<51,42>) 
    public IList delete$1670b5cba82eacb1(IList lst_0, IInteger n_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           final IList $result4 = ((IList)((IList)$Prelude.delete(lst_0, n_1)));
           if($T43.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result4.getType(),$T43)){
              return ((IList)($result4));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(1420,386,<54,0>,<68,1>) 
    public IMap distribution$d6b74dcbba95e885(IList lst_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           if(true){
              IMap res_1 = ((IMap)$constants.get(0)/*()*/);
              /*muExists*/FOR0: 
                  do {
                      FOR0_GEN1739:
                      for(IValue $elem5_for : ((IList)lst_0)){
                          IValue $elem5 = (IValue) $elem5_for;
                          IValue e_2 = null;
                          GuardedIValue guarded1 = $guarded_map_subscript(((IMap)res_1),((IValue)($elem5)));
                          res_1 = ((IMap)($amap_update($elem5,$aint_add_aint(((IInteger)(($is_defined_value(guarded1) ? ((IInteger)$get_defined_value(guarded1)) : ((IInteger)$constants.get(1)/*0*/)))),((IInteger)$constants.get(2)/*1*/)), ((IMap)(((IMap)res_1))))));
                      
                      }
                      continue FOR0;
                                  
                  } while(false);
              /* void:  muCon([]) */final IMap $result6 = ((IMap)res_1);
              if($T44.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result6.getType(),$T44)){
                 return ((IMap)($result6));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(1814,451,<72,0>,<86,41>) 
    public IList drop$9dc361ec0f485f6b(IInteger n_0, IList lst_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_1.getType(), $typeBindings)){
           final IList $result7 = ((IList)((IList)$Prelude.drop(n_0, lst_1)));
           if($T43.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result7.getType(),$T43)){
              return ((IList)($result7));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(2269,259,<88,0>,<96,54>) 
    public IList dup$149bf66e3d1f8803(IList lst_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           if(true){
              IList $reducer9 = (IList)(((IList)$constants.get(3)/*[]*/));
              $REDUCER8_GEN2514:
              for(IValue $elem11_for : ((IList)lst_0)){
                  IValue $elem11 = (IValue) $elem11_for;
                  if($isSubtypeOf($elem11.getType(),$T30.instantiate($typeBindings))){
                     IValue ix_2 = null;
                     if((((IBool)($RVF.bool(((IList)($reducer9)).contains(((IValue)($elem11))))))).getValue()){
                        $reducer9 = ((IList)($reducer9));
                     
                     } else {
                        $reducer9 = ((IList)($alist_add_alist(((IList)($reducer9)),((IList)($RVF.list(((IValue)($elem11))))))));
                     
                     }
                  } else {
                     continue $REDUCER8_GEN2514;
                  }
              }
              
                          final IList $result12 = ((IList)($reducer9));
              if($T43.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result12.getType(),$T43)){
                 return ((IList)($result12));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(2532,385,<98,0>,<109,43>) 
    public IValue elementAt$6b74f609c48b0b0a(IList lst_0, IInteger index_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           final IValue $result13 = ((IValue)((IValue)$Prelude.elementAt(lst_0, index_1)));
           if($T30.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result13.getType(),$T30)){
              return ((IValue)($result13));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(2924,467,<112,0>,<125,33>) 
    public IValue getOneFrom$9f31447a835de72c(IList lst_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           final IValue $result14 = ((IValue)((IValue)$Prelude.getOneFrom(lst_0)));
           if($T30.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result14.getType(),$T30)){
              return ((IValue)($result14));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(3397,227,<128,0>,<132,35>) 
    public IValue getFirstFrom$de7747ba8ecf5d2d(IList $0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        /*muExists*/getFirstFrom: 
            do {
                if($T16.match($0.getType(), $typeBindings)){
                   final IList $subject18 = ((IList)$0);
                   int $subject18_cursor = 0;
                   if($isSubtypeOf($subject18.getType(),$T16)){
                      final int $subject18_len = (int)((IList)($subject18)).length();
                      if($subject18_len >= 1){
                         if($subject18_cursor < $subject18_len){
                            IValue f_0 = ((IValue)($alist_subscript_int(((IList)($subject18)),$subject18_cursor)));
                            $subject18_cursor += 1;
                            final int $__119_start = (int)$subject18_cursor;
                            final int $__119_len = (int)$subject18_len - $__119_start - 0;
                            $subject18_cursor = $__119_start + $__119_len;
                            /*muExists*/getFirstFrom_LIST_VARf_MVAR$_16: 
                                do {
                                    if($subject18_cursor == $subject18_len){
                                       final IValue $result17 = ((IValue)f_0);
                                       if($T30.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result17.getType(),$T30)){
                                          return ((IValue)($result17));
                                       
                                       } else {
                                          return null;
                                       }
                                    } else {
                                       continue getFirstFrom_LIST_VARf_MVAR$_16;/*list match1*/
                                    }
                                } while(false);
                            return null;
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
            } while(false);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(3626,54,<133,0>,<133,54>) 
    public IValue getFirstFrom$52641577be663f10(IList $__0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        /*muExists*/getFirstFrom: 
            do {
                if($T0.match($__0.getType(), $typeBindings)){
                   if($__0.equals(((IList)$constants.get(3)/*[]*/))){
                      throw new Throw($RVF.constructor(M_Exception.RuntimeException_EmptyList_, new IValue[]{}));
                   } else {
                      return null;
                   }
                } else {
                   return null;
                }
            } while(false);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(3686,907,<136,0>,<166,27>) 
    public IValue head$9a1565ea96e50b88(IList $0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        /*muExists*/head: 
            do {
                if($T9.match($0.getType(), $typeBindings)){
                   final IList $subject23 = ((IList)$0);
                   int $subject23_cursor = 0;
                   if($isSubtypeOf($subject23.getType(),$T9)){
                      final int $subject23_len = (int)((IList)($subject23)).length();
                      if($subject23_len >= 1){
                         if($subject23_cursor < $subject23_len){
                            IValue h_0 = ((IValue)($alist_subscript_int(((IList)($subject23)),$subject23_cursor)));
                            $subject23_cursor += 1;
                            final int $__124_start = (int)$subject23_cursor;
                            final int $__124_len = (int)$subject23_len - $__124_start - 0;
                            $subject23_cursor = $__124_start + $__124_len;
                            /*muExists*/head_LIST_VARh_MVAR$_21: 
                                do {
                                    if($subject23_cursor == $subject23_len){
                                       final IValue $result22 = ((IValue)h_0);
                                       if($T30.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result22.getType(),$T30)){
                                          return ((IValue)($result22));
                                       
                                       } else {
                                          return null;
                                       }
                                    } else {
                                       continue head_LIST_VARh_MVAR$_21;/*list match1*/
                                    }
                                } while(false);
                            return null;
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
            } while(false);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(4596,45,<167,0>,<167,45>) 
    public IValue head$87e8fb1a25bc63f1(IList $__0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        /*muExists*/head: 
            do {
                if($T0.match($__0.getType(), $typeBindings)){
                   if($__0.equals(((IList)$constants.get(3)/*[]*/))){
                      throw new Throw($RVF.constructor(M_Exception.RuntimeException_EmptyList_, new IValue[]{}));
                   } else {
                      return null;
                   }
                } else {
                   return null;
                }
            } while(false);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(4684,107,<170,0>,<171,64>) 
    public IList head$7dfae1d3745d7d65(IList lst_0, IInteger n_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           final IList $result25 = ((IList)((IList)$Prelude.head(lst_0, n_1)));
           if($T43.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result25.getType(),$T43)){
              return ((IList)($result25));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(4799,309,<175,0>,<187,53>) 
    public ITuple headTail$0117af68d5f5d287(IList $0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        /*muExists*/headTail: 
            do {
                if($T9.match($0.getType(), $typeBindings)){
                   final IList $subject27 = ((IList)$0);
                   int $subject27_cursor = 0;
                   if($isSubtypeOf($subject27.getType(),$T9)){
                      final int $subject27_len = (int)((IList)($subject27)).length();
                      if($subject27_len >= 1){
                         if($subject27_cursor < $subject27_len){
                            IValue h_0 = ((IValue)($alist_subscript_int(((IList)($subject27)),$subject27_cursor)));
                            $subject27_cursor += 1;
                            final int $t_128_start = (int)$subject27_cursor;
                            headTail_LIST_VARh_MVARt:
                            
                            for(int $t_128_len = 0; $t_128_len <= $subject27_len - $t_128_start - 0; $t_128_len += 1){
                               IList t_1 = ((IList)($subject27.sublist($t_128_start, $t_128_len)));
                               $subject27_cursor = $t_128_start + $t_128_len;
                               if($subject27_cursor == $subject27_len){
                                  final ITuple $result26 = ((ITuple)($RVF.tuple(((IValue)h_0), ((IList)t_1))));
                                  if($T46.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result26.getType(),$T46)){
                                     return ((ITuple)($result26));
                                  
                                  } else {
                                     return null;
                                  }
                               } else {
                                  continue headTail_LIST_VARh_MVARt;/*list match1*/
                               }
                            }
                            return null;
                         
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
            } while(false);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(5111,66,<188,0>,<188,66>) 
    public ITuple headTail$2900a5bdaa720793(IList $__0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        /*muExists*/headTail: 
            do {
                if($T0.match($__0.getType(), $typeBindings)){
                   if($__0.equals(((IList)$constants.get(3)/*[]*/))){
                      throw new Throw($RVF.constructor(M_Exception.RuntimeException_EmptyList_, new IValue[]{}));
                   } else {
                      return null;
                   }
                } else {
                   return null;
                }
            } while(false);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(5183,368,<191,0>,<205,50>) 
    public IList index$f006059c1d37534f(IList lst_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           final IList $result29 = ((IList)($me.upTill(((IInteger)($me.size(((IList)lst_0)))))));
           if($T47.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result29.getType(),$T47)){
              return ((IList)($result29));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(5559,537,<209,0>,<228,1>) 
    public IInteger indexOf$608361fb33aa9217(IList lst_0, IValue elt_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           if(true){
              if($T2.match(elt_1.getType(), $typeBindings)){
                 if(true){
                    /*muExists*/FOR2: 
                        do {
                            final IInteger $lst2 = ((IInteger)($me.size(((IList)lst_0))));
                            final boolean $dir3 = ((IInteger)$constants.get(1)/*0*/).less($lst2).getValue();
                            
                            FOR2_GEN6019:
                            for(IInteger $elem30 = ((IInteger)$constants.get(1)/*0*/); $dir3 ? $aint_less_aint($elem30,$lst2).getValue() 
                                                      : $aint_lessequal_aint($elem30,$lst2).not().getValue(); $elem30 = $aint_add_aint($elem30,$dir3 ? ((IInteger)$constants.get(2)/*1*/) : ((IInteger)$constants.get(4)/*-1*/))){
                                if($isSubtypeOf($elem30.getType(),$T6.instantiate($typeBindings))){
                                   IInteger i_2 = null;
                                   if((((IBool)($equal(((IValue)($alist_subscript_int(((IList)lst_0),((IInteger)($elem30)).intValue()))), ((IValue)elt_1))))).getValue()){
                                      final IInteger $result31 = ((IInteger)($elem30));
                                      if($T6.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result31.getType(),$T6)){
                                         return ((IInteger)($result31));
                                      
                                      } else {
                                         return null;
                                      }
                                   }
                                
                                } else {
                                   continue FOR2_GEN6019;
                                }}
                            continue FOR2;
                    
                        } while(false);
                    /* void:  muCon([]) */final IInteger $result31 = ((IInteger)$constants.get(4)/*-1*/);
                    if($T6.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result31.getType(),$T6)){
                       return ((IInteger)($result31));
                    
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(6102,565,<231,0>,<247,76>) 
    public IList insertAt$baad348d13c6bf8a(IList lst_0, IInteger n_1, IValue elm_2){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           if($T2.match(elm_2.getType(), $typeBindings)){
              final IList $result32 = ((IList)((IList)$Prelude.insertAt(lst_0, n_1, elm_2)));
              if($T43.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result32.getType(),$T43)){
                 return ((IList)($result32));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(6673,377,<250,0>,<261,58>) 
    public IString intercalate$d1ca4248619bead5(IString sep_0, IList l_1){ 
        
        
        final Template $template33 = (Template)new Template($RVF, "");
        /*muExists*/LAB4: 
            do {
                LAB4_GEN7000:
                for(IValue $elem35_for : ((IList)($me.index(((IList)l_1))))){
                    IInteger $elem35 = (IInteger) $elem35_for;
                    IInteger i_2 = null;
                    ;$template33.addStr(((IString)(((((IBool)($equal(((IInteger)($elem35)), ((IInteger)$constants.get(1)/*0*/))))).getValue() ? ((IString)$constants.get(5)/*""*/) : sep_0))).getValue());
                    ;$template33.addVal($alist_subscript_int(((IList)l_1),((IInteger)($elem35)).intValue()));
                
                }
                continue LAB4;
                            
            } while(false);
        return ((IString)($template33.close()));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(7054,293,<263,0>,<274,30>) 
    public IList intersperse$b193bef12aa9c203(IValue sep_0, IList xs_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T2.match(sep_0.getType(), $typeBindings)){
           if(true){
              if($T0.match(xs_1.getType(), $typeBindings)){
                 if(true){
                    final IListWriter $listwriter36 = (IListWriter)$RVF.listWriter();
                    $LCOMP37_GEN7329:
                    for(IValue $elem38_for : ((IList)xs_1)){
                        IValue $elem38 = (IValue) $elem38_for;
                        if($isSubtypeOf($elem38.getType(),$T30.instantiate($typeBindings))){
                           IValue x_2 = null;
                           $listwriter36.append($elem38);
                           $listwriter36.append(sep_0);
                        
                        } else {
                           continue $LCOMP37_GEN7329;
                        }
                    }
                    
                                final IList $result39 = ((IList)($alist_slice(((IList)($listwriter36.done())), null, null, -1)));
                    if($T43.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result39.getType(),$T43)){
                       return ((IList)($result39));
                    
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(7351,281,<276,0>,<288,32>) 
    public IBool isEmpty$3708d66822aa111a(IList lst_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           final IBool $result40 = ((IBool)((IBool)$Prelude.isEmpty(lst_0)));
           if($T20.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result40.getType(),$T20)){
              return ((IBool)($result40));
           
           } else {
              return ((IBool)$constants.get(6)/*false*/);
           
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(7638,402,<291,0>,<305,44>) 
    public IValue last$9ac3d0212382d094(IList lst_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           final IValue $result41 = ((IValue)((IValue)$Prelude.last(lst_0)));
           if($T30.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result41.getType(),$T30)){
              return ((IValue)($result41));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(8044,442,<307,0>,<324,1>) 
    public IInteger lastIndexOf$a867c00e69b27bf4(IList lst_0, IValue elt_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           if(true){
              if($T2.match(elt_1.getType(), $typeBindings)){
                 if(true){
                    /*muExists*/FOR5: 
                        do {
                            FOR5_GEN8408:
                            for(IValue $elem42_for : ((IList)($me.reverse(((IList)($me.index(((IList)lst_0)))))))){
                                IInteger $elem42 = (IInteger) $elem42_for;
                                IInteger i_2 = null;
                                if((((IBool)($equal(((IValue)($alist_subscript_int(((IList)lst_0),((IInteger)($elem42)).intValue()))), ((IValue)elt_1))))).getValue()){
                                   final IInteger $result43 = ((IInteger)($elem42));
                                   if($T6.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result43.getType(),$T6)){
                                      return ((IInteger)($result43));
                                   
                                   } else {
                                      return null;
                                   }
                                }
                            
                            }
                            continue FOR5;
                                        
                        } while(false);
                    /* void:  muCon([]) */final IInteger $result43 = ((IInteger)$constants.get(4)/*-1*/);
                    if($T6.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result43.getType(),$T6)){
                       return ((IInteger)($result43));
                    
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(8492,362,<327,0>,<338,71>) 
    public IList mapper$81fa089c3ccda4f7(IList lst_0, TypedFunctionInstance1<IValue, IValue> fn_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           if(true){
              if($T14.match(fn_1.getType(), $typeBindings)){
                 if(true){
                    final IListWriter $listwriter44 = (IListWriter)$RVF.listWriter();
                    $LCOMP45_GEN8839:
                    for(IValue $elem46_for : ((IList)lst_0)){
                        IValue $elem46 = (IValue) $elem46_for;
                        if($isSubtypeOf($elem46.getType(),$T30.instantiate($typeBindings))){
                           IValue elm_2 = null;
                           $listwriter44.append(((TypedFunctionInstance1<IValue, IValue>)fn_1).typedCall(((IValue)($elem46))));
                        
                        } else {
                           continue $LCOMP45_GEN8839;
                        }
                    }
                    
                                final IList $result47 = ((IList)($listwriter44.done()));
                    if($T48.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result47.getType(),$T48)){
                       return ((IList)($result47));
                    
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(8860,227,<341,0>,<349,55>) 
    public IValue max$9542dff773662ba8(IList $0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        /*muExists*/max: 
            do {
                if($T9.match($0.getType(), $typeBindings)){
                   final IList $subject53 = ((IList)$0);
                   int $subject53_cursor = 0;
                   if($isSubtypeOf($subject53.getType(),$T9)){
                      final int $subject53_len = (int)((IList)($subject53)).length();
                      if($subject53_len >= 1){
                         if($subject53_cursor < $subject53_len){
                            IValue h_0 = ((IValue)($alist_subscript_int(((IList)($subject53)),$subject53_cursor)));
                            $subject53_cursor += 1;
                            final int $t_154_start = (int)$subject53_cursor;
                            max_LIST_VARh_MVARt:
                            
                            for(int $t_154_len = 0; $t_154_len <= $subject53_len - $t_154_start - 0; $t_154_len += 1){
                               IList t_1 = ((IList)($subject53.sublist($t_154_start, $t_154_len)));
                               $subject53_cursor = $t_154_start + $t_154_len;
                               if($subject53_cursor == $subject53_len){
                                  IValue $reducer49 = (IValue)(h_0);
                                  $REDUCER48_GEN9079:
                                  for(IValue $elem51_for : ((IList)t_1)){
                                      IValue $elem51 = (IValue) $elem51_for;
                                      IValue e_3 = null;
                                      if((((IBool)($lessequal(((IValue)($elem51)),((IValue)($reducer49))).not()))).getValue()){
                                         $reducer49 = ((IValue)($elem51));
                                      
                                      } else {
                                         $reducer49 = ((IValue)($reducer49));
                                      
                                      }
                                  }
                                  
                                              final IValue $result52 = ((IValue)($reducer49));
                                  if($T30.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result52.getType(),$T30)){
                                     return ((IValue)($result52));
                                  
                                  } else {
                                     return null;
                                  }
                               } else {
                                  continue max_LIST_VARh_MVARt;/*list match1*/
                               }
                            }
                            return null;
                         
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
            } while(false);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(9089,44,<350,0>,<350,44>) 
    public IValue max$a65b4f1e9d6ce28f(IList $__0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        /*muExists*/max: 
            do {
                if($T0.match($__0.getType(), $typeBindings)){
                   if($__0.equals(((IList)$constants.get(3)/*[]*/))){
                      throw new Throw($RVF.constructor(M_Exception.RuntimeException_EmptyList_, new IValue[]{}));
                   } else {
                      return null;
                   }
                } else {
                   return null;
                }
            } while(false);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(9140,1025,<353,0>,<381,1>) 
    public IList merge$766be902c133739c(IList left_0, IList right_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(left_0.getType(), $typeBindings)){
           if($T0.match(right_1.getType(), $typeBindings)){
              final IListWriter listwriter_WHILE7 = (IListWriter)$RVF.listWriter();
              /*muExists*/WHILE7_BT: 
                  do {
                      WHILE7:
                          while((((IBool)((((IBool)($me.isEmpty(((IList)left_0))))).not()))).getValue()){
                              if((((IBool)((((IBool)($me.isEmpty(((IList)right_1))))).not()))).getValue()){
                                if((((IBool)($lessequal(((IValue)(head(((IList)left_0)))),((IValue)(head(((IList)right_1)))))))).getValue()){
                                   listwriter_WHILE7.append(head(((IList)left_0)));
                                   left_0 = ((IList)(tail(((IList)left_0))));
                                
                                } else {
                                   listwriter_WHILE7.append(head(((IList)right_1)));
                                   right_1 = ((IList)(tail(((IList)right_1))));
                                
                                }
                              } else {
                                break WHILE7; // muBreak
                              
                              }
                      
                          }
              
                  } while(false);
              IList res_2 = ((IList)(listwriter_WHILE7.done()));
              final IList $result55 = ((IList)($alist_add_alist(((IList)($alist_add_alist(((IList)res_2),((IList)left_0)))),((IList)right_1))));
              if($T43.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result55.getType(),$T43)){
                 return ((IList)($result55));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(10169,342,<383,0>,<394,1>) 
    public IList merge$64cff63c6a2c35ea(IList left_0, IList right_1, TypedFunctionInstance2<IValue, IValue, IValue> lessOrEqual_2){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(left_0.getType(), $typeBindings)){
           if($T0.match(right_1.getType(), $typeBindings)){
              if($T38.match(lessOrEqual_2.getType(), $typeBindings)){
                 final IListWriter listwriter_WHILE9 = (IListWriter)$RVF.listWriter();
                 /*muExists*/WHILE9_BT: 
                     do {
                         WHILE9:
                             while((((IBool)((((IBool)($me.isEmpty(((IList)left_0))))).not()))).getValue()){
                                 if((((IBool)((((IBool)($me.isEmpty(((IList)right_1))))).not()))).getValue()){
                                   if((((IBool)(((TypedFunctionInstance2<IValue, IValue, IValue>)lessOrEqual_2).typedCall(((IValue)(head(((IList)left_0)))), ((IValue)(head(((IList)right_1)))))))).getValue()){
                                      listwriter_WHILE9.append(head(((IList)left_0)));
                                      left_0 = ((IList)(tail(((IList)left_0))));
                                   
                                   } else {
                                      listwriter_WHILE9.append(head(((IList)right_1)));
                                      right_1 = ((IList)(tail(((IList)right_1))));
                                   
                                   }
                                 } else {
                                   break WHILE9; // muBreak
                                 
                                 }
                         
                             }
                 
                     } while(false);
                 IList res_3 = ((IList)(listwriter_WHILE9.done()));
                 final IList $result56 = ((IList)($alist_add_alist(((IList)($alist_add_alist(((IList)res_3),((IList)left_0)))),((IList)right_1))));
                 if($T43.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result56.getType(),$T43)){
                    return ((IList)($result56));
                 
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(10517,228,<397,0>,<405,55>) 
    public IValue min$c23fb8d51ed1eb26(IList $0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        /*muExists*/min: 
            do {
                if($T9.match($0.getType(), $typeBindings)){
                   final IList $subject62 = ((IList)$0);
                   int $subject62_cursor = 0;
                   if($isSubtypeOf($subject62.getType(),$T9)){
                      final int $subject62_len = (int)((IList)($subject62)).length();
                      if($subject62_len >= 1){
                         if($subject62_cursor < $subject62_len){
                            IValue h_0 = ((IValue)($alist_subscript_int(((IList)($subject62)),$subject62_cursor)));
                            $subject62_cursor += 1;
                            final int $t_163_start = (int)$subject62_cursor;
                            min_LIST_VARh_MVARt:
                            
                            for(int $t_163_len = 0; $t_163_len <= $subject62_len - $t_163_start - 0; $t_163_len += 1){
                               IList t_1 = ((IList)($subject62.sublist($t_163_start, $t_163_len)));
                               $subject62_cursor = $t_163_start + $t_163_len;
                               if($subject62_cursor == $subject62_len){
                                  IValue $reducer58 = (IValue)(h_0);
                                  $REDUCER57_GEN10737:
                                  for(IValue $elem60_for : ((IList)t_1)){
                                      IValue $elem60 = (IValue) $elem60_for;
                                      IValue e_3 = null;
                                      if((((IBool)($less(((IValue)($elem60)),((IValue)($reducer58)))))).getValue()){
                                         $reducer58 = ((IValue)($elem60));
                                      
                                      } else {
                                         $reducer58 = ((IValue)($reducer58));
                                      
                                      }
                                  }
                                  
                                              final IValue $result61 = ((IValue)($reducer58));
                                  if($T30.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result61.getType(),$T30)){
                                     return ((IValue)($result61));
                                  
                                  } else {
                                     return null;
                                  }
                               } else {
                                  continue min_LIST_VARh_MVARt;/*list match1*/
                               }
                            }
                            return null;
                         
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
            } while(false);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(10747,45,<406,0>,<406,45>) 
    public IValue min$e28c8bb4309a1fa8(IList $__0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        /*muExists*/min: 
            do {
                if($T0.match($__0.getType(), $typeBindings)){
                   if($__0.equals(((IList)$constants.get(3)/*[]*/))){
                      throw new Throw($RVF.constructor(M_Exception.RuntimeException_EmptyList_, new IValue[]{}));
                   } else {
                      return null;
                   }
                } else {
                   return null;
                }
            } while(false);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(10798,658,<409,0>,<428,1>) 
    public IList mix$c619c4d7cd9b432e(IList l_0, IList r_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(l_0.getType(), $typeBindings)){
           if($T0.match(r_1.getType(), $typeBindings)){
              IInteger sizeL_2 = ((IInteger)($me.size(((IList)l_0))));
              IInteger sizeR_3 = ((IInteger)($me.size(((IList)r_1))));
              IInteger minSize_4 = null;
              if((((IBool)($aint_less_aint(((IInteger)sizeL_2),((IInteger)sizeR_3))))).getValue()){
                 minSize_4 = ((IInteger)sizeL_2);
              
              } else {
                 minSize_4 = ((IInteger)sizeR_3);
              
              }final IListWriter $listwriter65 = (IListWriter)$RVF.listWriter();
              final IInteger $lst7 = ((IInteger)minSize_4);
              final boolean $dir8 = ((IInteger)$constants.get(1)/*0*/).less($lst7).getValue();
              
              $LCOMP66_GEN11400:
              for(IInteger $elem67 = ((IInteger)$constants.get(1)/*0*/); $dir8 ? $aint_less_aint($elem67,$lst7).getValue() 
                                        : $aint_lessequal_aint($elem67,$lst7).not().getValue(); $elem67 = $aint_add_aint($elem67,$dir8 ? ((IInteger)$constants.get(2)/*1*/) : ((IInteger)$constants.get(4)/*-1*/))){
                  IInteger i_5 = null;
                  $listwriter65.append($alist_subscript_int(((IList)l_0),((IInteger)($elem67)).intValue()));
                  $listwriter65.append($alist_subscript_int(((IList)r_1),((IInteger)($elem67)).intValue()));
              }
              
              final IList $result68 = ((IList)($alist_add_alist(((IList)($alist_add_alist(((IList)($listwriter65.done())),((IList)($me.drop(((IInteger)sizeR_3), ((IList)l_0))))))),((IList)($me.drop(((IInteger)sizeL_2), ((IList)r_1)))))));
              if($T43.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result68.getType(),$T43)){
                 return ((IList)($result68));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(11460,203,<430,0>,<438,36>) 
    public ISet permutations$f29f8fcb02c23e0e(IList lst_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           final ISet $result69 = ((ISet)($me.permutationsBag(((IMap)($me.distribution(((IList)lst_0)))))));
           if($T50.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result69.getType(),$T50)){
              return ((ISet)($result69));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(11667,175,<440,0>,<443,74>) 
    public ISet permutationsBag$de98b23277e5c92b(IMap b_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T40.match(b_0.getType(), $typeBindings)){
           if(true){
              if((((IBool)(M_Map.isEmpty(((IMap)b_0))))).getValue()){
                 final ISet $result75 = ((ISet)$constants.get(7)/*{[]}*/);
                 if($T50.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result75.getType(),$T50)){
                    return ((ISet)($result75));
                 
                 } else {
                    return null;
                 }
              } else {
                 final ISetWriter $setwriter71 = (ISetWriter)$RVF.setWriter();
                 ;
                 $SCOMP72_GEN11789:
                 for(IValue $elem74_for : ((IMap)b_0)){
                     IValue $elem74 = (IValue) $elem74_for;
                     IValue e_1 = ((IValue)($elem74));
                     $SCOMP72_GEN11789_GEN11797:
                     for(IValue $elem73_for : ((ISet)($me.permutationsBag(((IMap)($me.removeFromBag(((IMap)b_0), ((IValue)e_1)))))))){
                         IList $elem73 = (IList) $elem73_for;
                         IList rest_2 = null;
                         $setwriter71.insert($alist_add_alist(((IList)($RVF.list(((IValue)e_1)))),((IList)($elem73))));
                     
                     }
                     continue $SCOMP72_GEN11789;
                                 
                 }
                 
                             final ISet $result75 = ((ISet)($setwriter71.done()));
                 if($T50.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result75.getType(),$T50)){
                    return ((ISet)($result75));
                 
                 } else {
                    return null;
                 }
              }
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(11848,355,<446,0>,<459,54>) 
    public ITuple pop$4363849a74e9527e(IList lst_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           final ITuple $result76 = ((ITuple)(headTail(((IList)lst_0))));
           if($T46.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result76.getType(),$T46)){
              return ((ITuple)($result76));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(12209,269,<462,0>,<472,36>) 
    public IList prefix$59a0a240af4ad5d8(IList lst_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           final IList $result77 = ((IList)((IList)$Prelude.prefix(lst_0)));
           if($T43.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result77.getType(),$T43)){
              return ((IList)($result77));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(12484,289,<475,0>,<486,52>) 
    public IList push$81b052cf87c2fff9(IValue elem_0, IList lst_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T2.match(elem_0.getType(), $typeBindings)){
           if($T0.match(lst_1.getType(), $typeBindings)){
              final IList $result78 = ((IList)($alist_add_alist(((IList)($RVF.list(((IValue)elem_0)))),((IList)lst_1))));
              if($T43.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result78.getType(),$T43)){
                 return ((IList)($result78));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(12779,736,<489,0>,<510,38>) 
    public IValue reducer$2ceaa4ffe514acfc(IList lst_0, TypedFunctionInstance2<IValue, IValue, IValue> fn_1, IValue unit_2){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           if($T29.match(fn_1.getType(), $typeBindings)){
              if($T2.match(unit_2.getType(), $typeBindings)){
                 IValue $reducer80 = (IValue)(unit_2);
                 $REDUCER79_GEN13503:
                 for(IValue $elem81_for : ((IList)lst_0)){
                     IValue $elem81 = (IValue) $elem81_for;
                     IValue elm_4 = null;
                     $reducer80 = ((IValue)(((TypedFunctionInstance2<IValue, IValue, IValue>)fn_1).typedCall(((IValue)($reducer80)), ((IValue)($elem81)))));
                 
                 }
                 
                             final IValue $result82 = ((IValue)($reducer80));
                 if($T30.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result82.getType(),$T30)){
                    return ((IValue)($result82));
                 
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(13519,103,<512,0>,<513,53>) 
    public IList remove$aafffcf3c9309d96(IList lst_0, IInteger indexToDelete_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           if(true){
              if(true){
                 final IListWriter $listwriter83 = (IListWriter)$RVF.listWriter();
                 $LCOMP84_GEN13584:
                 for(IValue $elem85_for : ((IList)($me.index(((IList)lst_0))))){
                     IInteger $elem85 = (IInteger) $elem85_for;
                     IInteger i_2 = null;
                     if((((IBool)($equal(((IInteger)($elem85)),((IInteger)indexToDelete_1)).not()))).getValue()){
                       $listwriter83.append($alist_subscript_int(((IList)lst_0),((IInteger)($elem85)).intValue()));
                     
                     } else {
                       continue $LCOMP84_GEN13584;
                     }
                 
                 }
                 
                             final IList $result86 = ((IList)($listwriter83.done()));
                 if($T43.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result86.getType(),$T43)){
                    return ((IList)($result86));
                 
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(13626,116,<515,0>,<516,26>) 
    public IMap removeFromBag$ac8c320f7c241406(IMap b_0, IValue el_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T40.match(b_0.getType(), $typeBindings)){
           if($T2.match(el_1.getType(), $typeBindings)){
              final IMap $result87 = ((IMap)($me.removeFromBag(((IMap)b_0), ((IValue)el_1), ((IInteger)$constants.get(2)/*1*/))));
              if($T44.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result87.getType(),$T44)){
                 return ((IMap)($result87));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(13746,176,<518,0>,<519,78>) 
    public IMap removeFromBag$9863b50c4dd8fc38(IMap b_0, IValue el_1, IInteger nr_2){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T40.match(b_0.getType(), $typeBindings)){
           if($T2.match(el_1.getType(), $typeBindings)){
              if($is_defined_value($guarded_map_subscript(((IMap)b_0),((IValue)el_1)))){
                 if((((IBool)($aint_lessequal_aint(((IInteger)($amap_subscript(((IMap)b_0),((IValue)el_1)))),((IInteger)nr_2))))).getValue()){
                    final IMap $result90 = ((IMap)(((IMap)b_0).remove(((IMap)($buildMap(((IValue)el_1), ((IInteger)($amap_subscript(((IMap)b_0),((IValue)el_1))))))))));
                    if($T44.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result90.getType(),$T44)){
                       return ((IMap)($result90));
                    
                    } else {
                       return null;
                    }
                 } else {
                    final IMap $result90 = ((IMap)($amap_add_amap(((IMap)b_0),((IMap)($buildMap(((IValue)el_1), ((IInteger)(((IInteger) ((IInteger)($amap_subscript(((IMap)b_0),((IValue)el_1)))).subtract(((IInteger)nr_2)))))))))));
                    if($T44.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result90.getType(),$T44)){
                       return ((IMap)($result90));
                    
                    } else {
                       return null;
                    }
                 }
              } else {
                 final IMap $result90 = ((IMap)b_0);
                 if($T44.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result90.getType(),$T44)){
                    return ((IMap)($result90));
                 
                 } else {
                    return null;
                 }
              }
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(13929,307,<522,0>,<534,36>) 
    public IList reverse$f869e80411fd5479(IList lst_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           final IList $result91 = ((IList)((IList)$Prelude.reverse(lst_0)));
           if($T43.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result91.getType(),$T43)){
              return ((IList)($result91));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(14242,245,<537,0>,<546,28>) 
    public IInteger size$811ff6e419f455d9(IList lst_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           final IInteger $result92 = ((IInteger)((IInteger)$Prelude.size(lst_0)));
           if($T6.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result92.getType(),$T6)){
              return ((IInteger)($result92));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(14493,701,<549,0>,<572,54>) 
    public IList slice$c3aabb87409c7918(IList lst_0, IInteger begin_1, IInteger len_2){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           final IList $result93 = ((IList)((IList)$Prelude.slice(lst_0, begin_1, len_2)));
           if($T43.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result93.getType(),$T43)){
              return ((IList)($result93));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(15742,35,<593,11>,<593,46>) 
    public IBool $CLOSURE_0(IValue a_0, IValue b_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T21.match(a_0.getType(), $typeBindings)){
           if($T39.match(b_1.getType(), $typeBindings)){
              final IBool $result94 = ((IBool)($less(((IValue)a_0),((IValue)b_1))));
              if($T20.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result94.getType(),$T20)){
                 return ((IBool)($result94));
              
              } else {
                 return ((IBool)$constants.get(6)/*false*/);
              
              }
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(15200,580,<575,0>,<593,49>) 
    public IList sort$fa0b19c35a18e804(IList lst_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           final IList $result95 = ((IList)($me.sort(((IList)lst_0), new TypedFunctionInstance2<IValue,IValue,IValue>(($_0, $_1) -> { return $CLOSURE_0((IValue)$_0, (IValue)$_1); }, $T51))));
           if($T43.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result95.getType(),$T43)){
              return ((IList)($result95));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(15785,99,<595,0>,<596,56>) 
    public IList sort$3510e1cc7fe6c8ba(IList l_0, TypedFunctionInstance2<IValue, IValue, IValue> less_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(l_0.getType(), $typeBindings)){
           if($T38.match(less_1.getType(), $typeBindings)){
              final IList $result96 = ((IList)((IList)$Prelude.sort(l_0, less_1)));
              if($T43.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result96.getType(),$T43)){
                 return ((IList)($result96));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(16281,35,<606,51>,<606,86>) 
    public IBool $CLOSURE_1(IValue a_0, IValue b_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T21.match(a_0.getType(), $typeBindings)){
           if($T39.match(b_1.getType(), $typeBindings)){
              final IBool $result97 = ((IBool)($less(((IValue)a_0),((IValue)b_1))));
              if($T20.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result97.getType(),$T20)){
                 return ((IBool)($result97));
              
              } else {
                 return ((IBool)$constants.get(6)/*false*/);
              
              }
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(15890,476,<599,0>,<607,47>) 
    public IBool isSorted$c5ea501b54b4455d(IList l_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = Util.kwpMap();
        TypedFunctionInstance2<IValue, IValue, IValue> $kwpDefault_less = new TypedFunctionInstance2<IValue,IValue,IValue>(($_0, $_1) -> { return $CLOSURE_1((IValue)$_0, (IValue)$_1); }, $T51);
        $kwpDefaults.put("less", $kwpDefault_less);
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(l_0.getType(), $typeBindings)){
           if(true){
              IBool $done98 = (IBool)(((IBool)$constants.get(8)/*true*/));
              /*muExists*/$ANY99: 
                  do {
                      final IList $subject102 = ((IList)l_0);
                      int $subject102_cursor = 0;
                      if($isSubtypeOf($subject102.getType(),$T0)){
                         final int $subject102_len = (int)((IList)($subject102)).length();
                         if($subject102_len >= 2){
                            final int $__1104_start = (int)$subject102_cursor;
                            $ANY99_LIST_MVAR$_100:
                            
                            for(int $__1104_len = 0; $__1104_len <= $subject102_len - $__1104_start - 2; $__1104_len += 1){
                               $subject102_cursor = $__1104_start + $__1104_len;
                               if($subject102_cursor < $subject102_len){
                                  IValue a_2 = ((IValue)($alist_subscript_int(((IList)($subject102)),$subject102_cursor)));
                                  $subject102_cursor += 1;
                                  if($subject102_cursor < $subject102_len){
                                     IValue b_3 = ((IValue)($alist_subscript_int(((IList)($subject102)),$subject102_cursor)));
                                     $subject102_cursor += 1;
                                     final int $__1103_start = (int)$subject102_cursor;
                                     final int $__1103_len = (int)$subject102_len - $__1103_start - 0;
                                     $subject102_cursor = $__1103_start + $__1103_len;
                                     /*muExists*/$ANY99_LIST_MVAR$_100_VARa_VARb_MVAR$_101: 
                                         do {
                                             if($subject102_cursor == $subject102_len){
                                                if((((IBool)(((TypedFunctionInstance2<IValue, IValue, IValue>)((TypedFunctionInstance2<IValue, IValue, IValue>) ($kwpActuals.containsKey("less") ? $kwpActuals.get("less") : $kwpDefaults.get("less")))).typedCall(((IValue)b_3), ((IValue)a_2))))).getValue()){
                                                   $done98 = ((IBool)$constants.get(6)/*false*/);
                                                   break $ANY99; // muSucceed
                                                } else {
                                                   continue $ANY99;/*not any*/
                                                }
                                             } else {
                                                continue $ANY99_LIST_MVAR$_100_VARa_VARb_MVAR$_101;/*list match1*/
                                             }
                                         } while(false);
                                     continue $ANY99_LIST_MVAR$_100;/*computeFail*/
                                  } else {
                                     continue $ANY99_LIST_MVAR$_100;/*computeFail*/
                                  }
                               } else {
                                  continue $ANY99_LIST_MVAR$_100;/*computeFail*/
                               }
                            }
                            
                         
                         }
                      
                      }
              
                  } while(false);
              final IBool $result105 = ((IBool)($done98));
              if($T20.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result105.getType(),$T20)){
                 return ((IBool)($result105));
              
              } else {
                 return ((IBool)$constants.get(6)/*false*/);
              
              }
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(16372,288,<610,0>,<622,34>) 
    public IList shuffle$30274c0d2631d638(IList l_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(l_0.getType(), $typeBindings)){
           final IList $result106 = ((IList)((IList)$Prelude.shuffle(l_0)));
           if($T43.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result106.getType(),$T43)){
              return ((IList)($result106));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(16666,388,<625,0>,<639,44>) 
    public IList shuffle$c82b8ec516b86b6f(IList l_0, IInteger seed_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(l_0.getType(), $typeBindings)){
           final IList $result107 = ((IList)((IList)$Prelude.shuffle(l_0, seed_1)));
           if($T43.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result107.getType(),$T43)){
              return ((IList)($result107));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(17060,271,<642,0>,<653,1>) 
    public ITuple split$9e25259188753c78(IList l_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(l_0.getType(), $typeBindings)){
           IInteger half_1 = ((IInteger)($aint_divide_aint(((IInteger)($me.size(((IList)l_0)))),((IInteger)$constants.get(9)/*2*/))));
           final ITuple $result108 = ((ITuple)($RVF.tuple(((IList)($me.take(((IInteger)half_1), ((IList)l_0)))), ((IList)($me.drop(((IInteger)half_1), ((IList)l_0)))))));
           if($T52.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result108.getType(),$T52)){
              return ((ITuple)($result108));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(17985,38,<671,32>,<671,70>) 
    public IBool $CLOSURE_2(IValue a_0, ValueRef<IValue> hd_3, ValueRef<TypedFunctionInstance2<IValue, IValue, IValue>> similar_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T21.match(a_0.getType(), $typeBindings)){
           final IBool $result110 = ((IBool)(((TypedFunctionInstance2<IValue, IValue, IValue>)similar_1.getValue()).typedCall(((IValue)a_0), hd_3.getValue())));
           if($T20.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result110.getType(),$T20)){
              return ((IBool)($result110));
           
           } else {
              return ((IBool)$constants.get(6)/*false*/);
           
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(17335,774,<655,0>,<677,1>) 
    public IList group$fe1596515cea5bde(IList input_0, TypedFunctionInstance2<IValue, IValue, IValue> $aux_similar_1){ 
        ValueRef<TypedFunctionInstance2<IValue, IValue, IValue>> similar_1 = new ValueRef<TypedFunctionInstance2<IValue, IValue, IValue>>("similar_1", $aux_similar_1);
    
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(input_0.getType(), $typeBindings)){
           if(true){
              if($T38.match(similar_1.getValue().getType(), $typeBindings)){
                 if(true){
                    final IListWriter listwriter_WHILE11 = (IListWriter)$RVF.listWriter();
                    WHILE11:
                    //WHILE11_BT:
                        while(true){
                        WHILE11_BT: 
                           do {
                             final IList $subject111 = ((IList)input_0);
                             int $subject111_cursor = 0;
                             if($isSubtypeOf($subject111.getType(),$T0)){
                                final int $subject111_len = (int)((IList)($subject111)).length();
                                if($subject111_len >= 1){
                                   if($subject111_cursor < $subject111_len){
                                      final ValueRef<IValue> hd_3 = new ValueRef<IValue>("hd", ((IValue)($alist_subscript_int(((IList)($subject111)),$subject111_cursor))));
                                      $subject111_cursor += 1;
                                      final int $tl_4112_start = (int)$subject111_cursor;
                                      WHILE11_BT_LIST_VARhd_MVARtl:
                                      
                                      for(int $tl_4112_len = 0; $tl_4112_len <= $subject111_len - $tl_4112_start - 0; $tl_4112_len += 1){
                                         IList tl_4 = ((IList)($subject111.sublist($tl_4112_start, $tl_4112_len)));
                                         $subject111_cursor = $tl_4112_start + $tl_4112_len;
                                         if($subject111_cursor == $subject111_len){
                                            final IListWriter $writer109 = (IListWriter)$RVF.listWriter();
                                            $writer109.append(hd_3.getValue());
                                            $listwriter_splice($writer109,$me.takeWhile(((IList)tl_4), new TypedFunctionInstance1<IValue,IValue>(($_0) -> { return $CLOSURE_2((IValue)$_0, hd_3, similar_1); }, $T53)));
                                            IList sim_5 = ((IList)($writer109.done()));
                                            listwriter_WHILE11.append(sim_5);
                                            input_0 = ((IList)($me.drop(((IInteger)($me.size(((IList)sim_5)))), ((IList)input_0))));
                                            continue WHILE11;
                                         
                                         } else {
                                            continue WHILE11_BT_LIST_VARhd_MVARtl;/*list match1*/
                                         }
                                      }
                                      break WHILE11; // muBreak
                                      
                                   
                                   } else {
                                      break WHILE11; // muBreak
                                   
                                   }
                                } else {
                                   break WHILE11; // muBreak
                                
                                }
                             } else {
                                break WHILE11; // muBreak
                             
                             }
                              //break WHILE11; //muWhileDo
                           } while(false);
                    
                        }
                    IList lres_2 = ((IList)(listwriter_WHILE11.done()));
                    final IList $result113 = ((IList)lres_2);
                    if($T54.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result113.getType(),$T54)){
                       return ((IList)($result113));
                    
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(18113,209,<679,0>,<687,76>) 
    public INumber sum$59dbbfdf3f3e8245(IList $0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        /*muExists*/sum: 
            do {
                if($T23.match($0.getType(), $typeBindings)){
                   final IList $subject118 = ((IList)$0);
                   int $subject118_cursor = 0;
                   if($isSubtypeOf($subject118.getType(),$T23)){
                      final int $subject118_len = (int)((IList)($subject118)).length();
                      if($subject118_len >= 1){
                         if($subject118_cursor < $subject118_len){
                            INumber hd_0 = ((INumber)($alist_subscript_int(((IList)($subject118)),$subject118_cursor)));
                            $subject118_cursor += 1;
                            final int $tl_1119_start = (int)$subject118_cursor;
                            sum_LIST_VARhd_MVARtl:
                            
                            for(int $tl_1119_len = 0; $tl_1119_len <= $subject118_len - $tl_1119_start - 0; $tl_1119_len += 1){
                               IList tl_1 = ((IList)($subject118.sublist($tl_1119_start, $tl_1119_len)));
                               $subject118_cursor = $tl_1119_start + $tl_1119_len;
                               if($subject118_cursor == $subject118_len){
                                  INumber $reducer115 = (INumber)(hd_0);
                                  $REDUCER114_GEN18313:
                                  for(IValue $elem116_for : ((IList)tl_1)){
                                      INumber $elem116 = (INumber) $elem116_for;
                                      INumber i_3 = null;
                                      $reducer115 = ((INumber)($anum_add_anum(((INumber)($reducer115)),((INumber)($elem116)))));
                                  
                                  }
                                  
                                              final INumber $result117 = ((INumber)($reducer115));
                                  if($T55.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result117.getType(),$T55)){
                                     return ((INumber)($result117));
                                  
                                  } else {
                                     return null;
                                  }
                               } else {
                                  continue sum_LIST_VARhd_MVARtl;/*list match1*/
                               }
                            }
                            return null;
                         
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
            } while(false);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(18324,53,<688,0>,<688,53>) 
    public INumber sum$c2873c33b4fb6ee7(IList $__0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        /*muExists*/sum: 
            do {
                if($T26.match($__0.getType(), $typeBindings)){
                   if($__0.equals(((IList)$constants.get(3)/*[]*/))){
                      throw new Throw($RVF.constructor(M_Exception.RuntimeException_EmptyList_, new IValue[]{}));
                   } else {
                      return null;
                   }
                } else {
                   return null;
                }
            } while(false);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(18383,582,<691,0>,<715,33>) 
    public IList tail$93ed13792d756b09(IList $0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        /*muExists*/tail: 
            do {
                if($T31.match($0.getType(), $typeBindings)){
                   final IList $subject123 = ((IList)$0);
                   int $subject123_cursor = 0;
                   if($isSubtypeOf($subject123.getType(),$T31)){
                      final int $subject123_len = (int)((IList)($subject123)).length();
                      if($subject123_len >= 1){
                         if($subject123_cursor < $subject123_len){
                            $subject123_cursor += 1;
                            final int $t_0124_start = (int)$subject123_cursor;
                            tail_LIST_VAR$_121_MVARt:
                            
                            for(int $t_0124_len = 0; $t_0124_len <= $subject123_len - $t_0124_start - 0; $t_0124_len += 1){
                               IList t_0 = ((IList)($subject123.sublist($t_0124_start, $t_0124_len)));
                               $subject123_cursor = $t_0124_start + $t_0124_len;
                               if($subject123_cursor == $subject123_len){
                                  final IList $result122 = ((IList)t_0);
                                  if($T43.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result122.getType(),$T43)){
                                     return ((IList)($result122));
                                  
                                  } else {
                                     return null;
                                  }
                               } else {
                                  continue tail_LIST_VAR$_121_MVARt;/*list match1*/
                               }
                            }
                            return null;
                         
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
            } while(false);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(18967,51,<716,0>,<716,51>) 
    public IList tail$c67bc8cf2c42391e(IList $__0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        /*muExists*/tail: 
            do {
                if($T0.match($__0.getType(), $typeBindings)){
                   if($__0.equals(((IList)$constants.get(3)/*[]*/))){
                      throw new Throw($RVF.constructor(M_Exception.RuntimeException_EmptyList_, new IValue[]{}));
                   } else {
                      return null;
                   }
                } else {
                   return null;
                }
            } while(false);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(19023,109,<718,0>,<719,66>) 
    public IList tail$3960c3b97b108528(IList lst_0, IInteger len_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           final IList $result125 = ((IList)((IList)$Prelude.tail(lst_0, len_1)));
           if($T43.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result125.getType(),$T43)){
              return ((IList)($result125));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(19138,462,<722,0>,<736,40>) 
    public IList take$a6af73252a54deda(IInteger n_0, IList lst_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_1.getType(), $typeBindings)){
           final IList $result126 = ((IList)((IList)$Prelude.take(n_0, lst_1)));
           if($T43.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result126.getType(),$T43)){
              return ((IList)($result126));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(19606,772,<739,0>,<761,51>) 
    public ITuple takeOneFrom$c52f3e30bbbc1271(IList lst_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           final ITuple $result127 = ((ITuple)((ITuple)$Prelude.takeOneFrom(lst_0)));
           if($T46.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result127.getType(),$T46)){
              return ((ITuple)($result127));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(20384,355,<764,0>,<778,1>) 
    public IList takeWhile$77843fe1b1f32286(IList lst_0, TypedFunctionInstance1<IValue, IValue> take_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           if($T19.match(take_1.getType(), $typeBindings)){
              IInteger i_2 = ((IInteger)$constants.get(1)/*0*/);
              final IListWriter listwriter_WHILE12 = (IListWriter)$RVF.listWriter();
              /*muExists*/WHILE12_BT: 
                  do {
                      WHILE12:
                          while((((IBool)($aint_less_aint(((IInteger)i_2),((IInteger)($me.size(((IList)lst_0)))))))).getValue()){
                              if((((IBool)(((TypedFunctionInstance1<IValue, IValue>)take_1).typedCall(((IValue)($alist_subscript_int(((IList)lst_0),((IInteger)i_2).intValue()))))))).getValue()){
                                listwriter_WHILE12.append($alist_subscript_int(((IList)lst_0),((IInteger)i_2).intValue()));
                                i_2 = ((IInteger)($aint_add_aint(((IInteger)i_2),((IInteger)$constants.get(2)/*1*/))));
                              
                              } else {
                                break WHILE12; // muBreak
                              
                              }
                      
                          }
              
                  } while(false);
              final IList $result128 = ((IList)(listwriter_WHILE12.done()));
              if($T43.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result128.getType(),$T43)){
                 return ((IList)($result128));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(20745,785,<781,0>,<798,72>) 
    public IMap toMap$5edc6ed092abb52e(IList lst_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T11.match(lst_0.getType(), $typeBindings)){
           final IMap $result129 = ((IMap)((IMap)$Prelude.toMap(lst_0)));
           if($T56.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result129.getType(),$T56)){
              return ((IMap)($result129));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(21536,649,<801,0>,<820,72>) 
    public IMap toMapUnique$8f526334e10e63c0(IList lst_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T11.match(lst_0.getType(), $typeBindings)){
           final IMap $result130 = ((IMap)((IMap)$Prelude.toMapUnique(lst_0)));
           if($T60.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result130.getType(),$T60)){
              return ((IMap)($result130));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(22191,292,<823,0>,<835,26>) 
    public IValue top$1f6275c8538af543(IList $0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        /*muExists*/top: 
            do {
                if($T36.match($0.getType(), $typeBindings)){
                   final IList $subject134 = ((IList)$0);
                   int $subject134_cursor = 0;
                   if($isSubtypeOf($subject134.getType(),$T36)){
                      final int $subject134_len = (int)((IList)($subject134)).length();
                      if($subject134_len >= 1){
                         if($subject134_cursor < $subject134_len){
                            IValue t_0 = ((IValue)($alist_subscript_int(((IList)($subject134)),$subject134_cursor)));
                            $subject134_cursor += 1;
                            final int $__1135_start = (int)$subject134_cursor;
                            final int $__1135_len = (int)$subject134_len - $__1135_start - 0;
                            $subject134_cursor = $__1135_start + $__1135_len;
                            /*muExists*/top_LIST_VARt_MVAR$_132: 
                                do {
                                    if($subject134_cursor == $subject134_len){
                                       final IValue $result133 = ((IValue)t_0);
                                       if($T30.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result133.getType(),$T30)){
                                          return ((IValue)($result133));
                                       
                                       } else {
                                          return null;
                                       }
                                    } else {
                                       continue top_LIST_VARt_MVAR$_132;/*list match1*/
                                    }
                                } while(false);
                            return null;
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
            } while(false);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(22489,453,<838,0>,<852,1>) 
    public ISet toRel$5140186369371220(IList lst_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           if(true){
              final ISetWriter $setwriter136 = (ISetWriter)$RVF.setWriter();
              ;
              /*muExists*/$SCOMP137: 
                  do {
                      final IList $subject140 = ((IList)lst_0);
                      int $subject140_cursor = 0;
                      if($isSubtypeOf($subject140.getType(),$T0)){
                         final int $subject140_len = (int)((IList)($subject140)).length();
                         if($subject140_len >= 2){
                            final int $__1142_start = (int)$subject140_cursor;
                            $SCOMP137_LIST_MVAR$_138:
                            
                            for(int $__1142_len = 0; $__1142_len <= $subject140_len - $__1142_start - 2; $__1142_len += 1){
                               $subject140_cursor = $__1142_start + $__1142_len;
                               if($subject140_cursor < $subject140_len){
                                  IValue from_1 = ((IValue)($alist_subscript_int(((IList)($subject140)),$subject140_cursor)));
                                  $subject140_cursor += 1;
                                  if($subject140_cursor < $subject140_len){
                                     IValue $to_2 = ((IValue)($alist_subscript_int(((IList)($subject140)),$subject140_cursor)));
                                     $subject140_cursor += 1;
                                     final int $__1141_start = (int)$subject140_cursor;
                                     final int $__1141_len = (int)$subject140_len - $__1141_start - 0;
                                     $subject140_cursor = $__1141_start + $__1141_len;
                                     /*muExists*/$SCOMP137_LIST_MVAR$_138_VARfrom_VARto_MVAR$_139: 
                                         do {
                                             if($subject140_cursor == $subject140_len){
                                                $setwriter136.insert($RVF.tuple(((IValue)from_1), ((IValue)$to_2)));
                                             
                                             } else {
                                                continue $SCOMP137_LIST_MVAR$_138_VARfrom_VARto_MVAR$_139;/*list match1*/
                                             }
                                         } while(false);
                                     continue $SCOMP137_LIST_MVAR$_138;/*computeFail*/
                                  } else {
                                     continue $SCOMP137_LIST_MVAR$_138;/*computeFail*/
                                  }
                               } else {
                                  continue $SCOMP137_LIST_MVAR$_138;/*computeFail*/
                               }
                            }
                            
                         
                         }
                      
                      }
              
                  } while(false);
              final ISet $result143 = ((ISet)($setwriter136.done()));
              if($T61.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result143.getType(),$T61)){
                 return ((ISet)($result143));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(22948,391,<855,0>,<873,33>) 
    public ISet toSet$8be251e84a40f0a6(IList lst_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           final ISet $result144 = ((ISet)((ISet)$Prelude.toSet(lst_0)));
           if($T62.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result144.getType(),$T62)){
              return ((ISet)($result144));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(23345,287,<876,0>,<888,32>) 
    public IString toString$83c4cca13eaf692b(IList lst_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           final IString $result145 = ((IString)((IString)$Prelude.toString(lst_0)));
           if($T7.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result145.getType(),$T7)){
              return ((IString)($result145));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(23640,309,<892,0>,<904,33>) 
    public IString itoString$a409429dd777074c(IList lst_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(lst_0.getType(), $typeBindings)){
           final IString $result146 = ((IString)((IString)$Prelude.itoString(lst_0)));
           if($T7.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result146.getType(),$T7)){
              return ((IString)($result146));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(23957,374,<908,0>,<920,42>) 
    public ITuple unzip2$9bbb8718fecb84f2(IList lst_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T22.match(lst_0.getType(), $typeBindings)){
           if(true){
              final IListWriter $listwriter147 = (IListWriter)$RVF.listWriter();
              $LCOMP148_GEN24296:
              for(IValue $elem149_for : ((IList)lst_0)){
                  IValue $elem149 = (IValue) $elem149_for;
                  final IValue $tuple_subject150 = ((IValue)($elem149));
                  if($tuple_subject150 instanceof ITuple && ((ITuple)$tuple_subject150).arity() == 2){
                     /*muExists*/$LCOMP148_GEN24296_TUPLE: 
                         do {
                             IValue t_1 = null;
                             $listwriter147.append($subscript_int(((IValue)($tuple_subject150)),0));
                     
                         } while(false);
                  
                  } else {
                     continue $LCOMP148_GEN24296;
                  }
              }
              
                          final IListWriter $listwriter151 = (IListWriter)$RVF.listWriter();
              $LCOMP152_GEN24316:
              for(IValue $elem153_for : ((IList)lst_0)){
                  IValue $elem153 = (IValue) $elem153_for;
                  final IValue $tuple_subject154 = ((IValue)($elem153));
                  if($tuple_subject154 instanceof ITuple && ((ITuple)$tuple_subject154).arity() == 2){
                     /*muExists*/$LCOMP152_GEN24316_TUPLE: 
                         do {
                             IValue u_2 = null;
                             $listwriter151.append($subscript_int(((IValue)($tuple_subject154)),1));
                     
                         } while(false);
                  
                  } else {
                     continue $LCOMP152_GEN24316;
                  }
              }
              
                          final ITuple $result155 = ((ITuple)($RVF.tuple(((IList)($listwriter147.done())), ((IList)($listwriter151.done())))));
              if($T63.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result155.getType(),$T63)){
                 return ((ITuple)($result155));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(24386,132,<923,0>,<924,68>) 
    public ITuple unzip3$d376d93c0401d00a(IList lst_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T28.match(lst_0.getType(), $typeBindings)){
           if(true){
              final IListWriter $listwriter156 = (IListWriter)$RVF.listWriter();
              $LCOMP157_GEN24457:
              for(IValue $elem158_for : ((IList)lst_0)){
                  IValue $elem158 = (IValue) $elem158_for;
                  final IValue $tuple_subject159 = ((IValue)($elem158));
                  if($tuple_subject159 instanceof ITuple && ((ITuple)$tuple_subject159).arity() == 3){
                     /*muExists*/$LCOMP157_GEN24457_TUPLE: 
                         do {
                             IValue t_1 = null;
                             $listwriter156.append($subscript_int(((IValue)($tuple_subject159)),0));
                     
                         } while(false);
                  
                  } else {
                     continue $LCOMP157_GEN24457;
                  }
              }
              
                          final IListWriter $listwriter160 = (IListWriter)$RVF.listWriter();
              $LCOMP161_GEN24479:
              for(IValue $elem162_for : ((IList)lst_0)){
                  IValue $elem162 = (IValue) $elem162_for;
                  final IValue $tuple_subject163 = ((IValue)($elem162));
                  if($tuple_subject163 instanceof ITuple && ((ITuple)$tuple_subject163).arity() == 3){
                     /*muExists*/$LCOMP161_GEN24479_TUPLE: 
                         do {
                             IValue u_2 = null;
                             $listwriter160.append($subscript_int(((IValue)($tuple_subject163)),1));
                     
                         } while(false);
                  
                  } else {
                     continue $LCOMP161_GEN24479;
                  }
              }
              
                          final IListWriter $listwriter164 = (IListWriter)$RVF.listWriter();
              $LCOMP165_GEN24501:
              for(IValue $elem166_for : ((IList)lst_0)){
                  IValue $elem166 = (IValue) $elem166_for;
                  final IValue $tuple_subject167 = ((IValue)($elem166));
                  if($tuple_subject167 instanceof ITuple && ((ITuple)$tuple_subject167).arity() == 3){
                     /*muExists*/$LCOMP165_GEN24501_TUPLE: 
                         do {
                             IValue w_3 = null;
                             $listwriter164.append($subscript_int(((IValue)($tuple_subject167)),2));
                     
                         } while(false);
                  
                  } else {
                     continue $LCOMP165_GEN24501;
                  }
              }
              
                          final ITuple $result168 = ((ITuple)($RVF.tuple(((IList)($listwriter156.done())), ((IList)($listwriter160.done())), ((IList)($listwriter164.done())))));
              if($T64.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result168.getType(),$T64)){
                 return ((ITuple)($result168));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(24524,309,<927,0>,<938,29>) 
    public IList upTill$bc783e9ad62ed3d1(IInteger n_0){ 
        
        
        return ((IList)((IList)$Prelude.upTill(n_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(24839,465,<941,0>,<956,1>) 
    public IList zip2$205b91f8857e010b(IList a_0, IList b_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(a_0.getType(), $typeBindings)){
           if($T33.match(b_1.getType(), $typeBindings)){
              if((((IBool)($equal(((IInteger)($me.size(((IList)a_0)))),((IInteger)($me.size(((IList)b_1))))).not()))).getValue()){
                 throw new Throw($RVF.constructor(M_Exception.RuntimeException_IllegalArgument_value_str, new IValue[]{((IValue)($RVF.tuple(((IInteger)($me.size(((IList)a_0)))), ((IInteger)($me.size(((IList)b_1))))))), ((IString)$constants.get(10)/*"List size mismatch"*/)}));
              }
              final IListWriter $listwriter169 = (IListWriter)$RVF.listWriter();
              $LCOMP170_GEN25286:
              for(IValue $elem171_for : ((IList)($me.index(((IList)a_0))))){
                  IInteger $elem171 = (IInteger) $elem171_for;
                  IInteger i_2 = null;
                  $listwriter169.append($RVF.tuple(((IValue)($alist_subscript_int(((IList)a_0),((IInteger)($elem171)).intValue()))), ((IValue)($alist_subscript_int(((IList)b_1),((IInteger)($elem171)).intValue())))));
              
              }
              
                          final IList $result172 = ((IList)($listwriter169.done()));
              if($T67.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result172.getType(),$T67)){
                 return ((IList)($result172));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(25308,367,<958,0>,<966,1>) 
    public IList zip2$db6f5d9d0017d934(IList a_0, IValue defA_1, IList b_2, IValue defB_3){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(a_0.getType(), $typeBindings)){
           if($T2.match(defA_1.getType(), $typeBindings)){
              if($T33.match(b_2.getType(), $typeBindings)){
                 if($T15.match(defB_3.getType(), $typeBindings)){
                    final IListWriter $listwriter173 = (IListWriter)$RVF.listWriter();
                    final IInteger $lst12 = ((IInteger)(max(((IList)($RVF.list(((IInteger)$constants.get(1)/*0*/), ((IInteger) ((IInteger)($me.size(((IList)b_2)))).subtract(((IInteger)($me.size(((IList)a_0))))))))))));
                    final boolean $dir13 = ((IInteger)$constants.get(1)/*0*/).less($lst12).getValue();
                    
                    $LCOMP174_GEN25481:
                    for(IInteger $elem175 = ((IInteger)$constants.get(1)/*0*/); $dir13 ? $aint_less_aint($elem175,$lst12).getValue() 
                                              : $aint_lessequal_aint($elem175,$lst12).not().getValue(); $elem175 = $aint_add_aint($elem175,$dir13 ? ((IInteger)$constants.get(2)/*1*/) : ((IInteger)$constants.get(4)/*-1*/))){
                        $listwriter173.append(defA_1);
                    }
                    
                    IList tmpA_4 = ((IList)($alist_add_alist(((IList)a_0),((IList)($listwriter173.done())))));
                    final IListWriter $listwriter176 = (IListWriter)$RVF.listWriter();
                    final IInteger $lst17 = ((IInteger)(max(((IList)($RVF.list(((IInteger)$constants.get(1)/*0*/), ((IInteger) ((IInteger)($me.size(((IList)a_0)))).subtract(((IInteger)($me.size(((IList)b_2))))))))))));
                    final boolean $dir18 = ((IInteger)$constants.get(1)/*0*/).less($lst17).getValue();
                    
                    $LCOMP177_GEN25543:
                    for(IInteger $elem178 = ((IInteger)$constants.get(1)/*0*/); $dir18 ? $aint_less_aint($elem178,$lst17).getValue() 
                                              : $aint_lessequal_aint($elem178,$lst17).not().getValue(); $elem178 = $aint_add_aint($elem178,$dir18 ? ((IInteger)$constants.get(2)/*1*/) : ((IInteger)$constants.get(4)/*-1*/))){
                        $listwriter176.append(defB_3);
                    }
                    
                    IList tmpB_5 = ((IList)($alist_add_alist(((IList)b_2),((IList)($listwriter176.done())))));
                    if((((IBool)($equal(((IInteger)($me.size(((IList)tmpA_4)))), ((IInteger)($me.size(((IList)tmpB_5)))))))).getValue()){
                       /* void:  muCon(true) */
                    } else {
                       $assert_fails(((IString)$constants.get(5)/*""*/));
                    }final IListWriter $listwriter179 = (IListWriter)$RVF.listWriter();
                    $LCOMP180_GEN25654:
                    for(IValue $elem181_for : ((IList)($me.index(((IList)tmpA_4))))){
                        IInteger $elem181 = (IInteger) $elem181_for;
                        IInteger i_6 = null;
                        $listwriter179.append($RVF.tuple(((IValue)($alist_subscript_int(((IList)tmpA_4),((IInteger)($elem181)).intValue()))), ((IValue)($alist_subscript_int(((IList)tmpB_5),((IInteger)($elem181)).intValue())))));
                    
                    }
                    
                                final IList $result182 = ((IList)($listwriter179.done()));
                    if($T67.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result182.getType(),$T67)){
                       return ((IList)($result182));
                    
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(25679,224,<968,0>,<975,1>) 
    public IList zipi$cae1e21146aaa24d(IList a_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(a_0.getType(), $typeBindings)){
           if(true){
              IInteger i_1 = ((IInteger)$constants.get(1)/*0*/);
              final IListWriter listwriter_FOR14 = (IListWriter)$RVF.listWriter();
              /*muExists*/FOR14: 
                  do {
                      FOR14_GEN25850:
                      for(IValue $elem183_for : ((IList)a_0)){
                          IValue $elem183 = (IValue) $elem183_for;
                          if($isSubtypeOf($elem183.getType(),$T30.instantiate($typeBindings))){
                             IValue e_2 = null;
                             listwriter_FOR14.append($RVF.tuple(((IInteger)i_1), ((IValue)($elem183))));
                             i_1 = ((IInteger)($aint_add_aint(((IInteger)i_1),((IInteger)$constants.get(2)/*1*/))));
                          
                          } else {
                             continue FOR14_GEN25850;
                          }
                      }
                      continue FOR14;
                                  
                  } while(false);
              final IList $result184 = ((IList)(listwriter_FOR14.done()));
              if($T70.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result184.getType(),$T70)){
                 return ((IList)($result184));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(25907,363,<977,0>,<988,1>) 
    public IList zipi$4854310b56fabc67(ISet a_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T18.match(a_0.getType(), $typeBindings)){
           if(true){
              IInteger i_1 = ((IInteger)$constants.get(1)/*0*/);
              final IListWriter listwriter_FOR15 = (IListWriter)$RVF.listWriter();
              /*muExists*/FOR15: 
                  do {
                      FOR15_GEN26217:
                      for(IValue $elem185_for : ((ISet)a_0)){
                          IValue $elem185 = (IValue) $elem185_for;
                          if($isSubtypeOf($elem185.getType(),$T30.instantiate($typeBindings))){
                             IValue e_2 = null;
                             listwriter_FOR15.append($RVF.tuple(((IInteger)i_1), ((IValue)($elem185))));
                             i_1 = ((IInteger)($aint_add_aint(((IInteger)i_1),((IInteger)$constants.get(2)/*1*/))));
                          
                          } else {
                             continue FOR15_GEN26217;
                          }
                      }
                      continue FOR15;
                                  
                  } while(false);
              final IList $result186 = ((IList)(listwriter_FOR15.done()));
              if($T70.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result186.getType(),$T70)){
                 return ((IList)($result186));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(26274,320,<990,0>,<995,1>) 
    public IList zip3$137353bc59ba6245(IList a_0, IList b_1, IList c_2){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(a_0.getType(), $typeBindings)){
           if($T33.match(b_1.getType(), $typeBindings)){
              if($T34.match(c_2.getType(), $typeBindings)){
                 if((((IBool)($equal(((IInteger)($me.size(((IList)a_0)))),((IInteger)($me.size(((IList)b_1))))).not()))).getValue()){
                    throw new Throw($RVF.constructor(M_Exception.RuntimeException_IllegalArgument_value_str, new IValue[]{((IValue)($RVF.tuple(((IInteger)($me.size(((IList)a_0)))), ((IInteger)($me.size(((IList)b_1)))), ((IInteger)($me.size(((IList)c_2))))))), ((IString)$constants.get(10)/*"List size mismatch"*/)}));
                 } else {
                    if((((IBool)($equal(((IInteger)($me.size(((IList)a_0)))),((IInteger)($me.size(((IList)c_2))))).not()))).getValue()){
                       throw new Throw($RVF.constructor(M_Exception.RuntimeException_IllegalArgument_value_str, new IValue[]{((IValue)($RVF.tuple(((IInteger)($me.size(((IList)a_0)))), ((IInteger)($me.size(((IList)b_1)))), ((IInteger)($me.size(((IList)c_2))))))), ((IString)$constants.get(10)/*"List size mismatch"*/)}));
                    }
                 
                 }final IListWriter $listwriter187 = (IListWriter)$RVF.listWriter();
                 $LCOMP188_GEN26576:
                 for(IValue $elem189_for : ((IList)($me.index(((IList)a_0))))){
                     IInteger $elem189 = (IInteger) $elem189_for;
                     IInteger i_3 = null;
                     $listwriter187.append($RVF.tuple(((IValue)($alist_subscript_int(((IList)a_0),((IInteger)($elem189)).intValue()))), ((IValue)($alist_subscript_int(((IList)b_1),((IInteger)($elem189)).intValue()))), ((IValue)($alist_subscript_int(((IList)c_2),((IInteger)($elem189)).intValue())))));
                 
                 }
                 
                             final IList $result190 = ((IList)($listwriter187.done()));
                 if($T73.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result190.getType(),$T73)){
                    return ((IList)($result190));
                 
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/List.rsc|(26598,518,<997,0>,<1008,1>) 
    public IList zip3$ca94a0b311d1db9f(IList a_0, IValue defA_1, IList b_2, IValue defB_3, IList c_4, IValue defC_5){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(a_0.getType(), $typeBindings)){
           if($T2.match(defA_1.getType(), $typeBindings)){
              if($T33.match(b_2.getType(), $typeBindings)){
                 if($T15.match(defB_3.getType(), $typeBindings)){
                    if($T34.match(c_4.getType(), $typeBindings)){
                       if($T5.match(defC_5.getType(), $typeBindings)){
                          IInteger longest_6 = ((IInteger)(max(((IList)($RVF.list(((IInteger)($me.size(((IList)a_0)))), $me.size(((IList)b_2)), $me.size(((IList)c_4))))))));
                          final IListWriter $listwriter191 = (IListWriter)$RVF.listWriter();
                          final IInteger $lst22 = ((IInteger)(((IInteger) ((IInteger)longest_6).subtract(((IInteger)($me.size(((IList)a_0))))))));
                          final boolean $dir23 = ((IInteger)$constants.get(1)/*0*/).less($lst22).getValue();
                          
                          $LCOMP192_GEN26853:
                          for(IInteger $elem193 = ((IInteger)$constants.get(1)/*0*/); $dir23 ? $aint_less_aint($elem193,$lst22).getValue() 
                                                    : $aint_lessequal_aint($elem193,$lst22).not().getValue(); $elem193 = $aint_add_aint($elem193,$dir23 ? ((IInteger)$constants.get(2)/*1*/) : ((IInteger)$constants.get(4)/*-1*/))){
                              $listwriter191.append(defA_1);
                          }
                          
                          IList tmpA_7 = ((IList)($alist_add_alist(((IList)a_0),((IList)($listwriter191.done())))));
                          final IListWriter $listwriter194 = (IListWriter)$RVF.listWriter();
                          final IInteger $lst27 = ((IInteger)(((IInteger) ((IInteger)longest_6).subtract(((IInteger)($me.size(((IList)b_2))))))));
                          final boolean $dir28 = ((IInteger)$constants.get(1)/*0*/).less($lst27).getValue();
                          
                          $LCOMP195_GEN26905:
                          for(IInteger $elem196 = ((IInteger)$constants.get(1)/*0*/); $dir28 ? $aint_less_aint($elem196,$lst27).getValue() 
                                                    : $aint_lessequal_aint($elem196,$lst27).not().getValue(); $elem196 = $aint_add_aint($elem196,$dir28 ? ((IInteger)$constants.get(2)/*1*/) : ((IInteger)$constants.get(4)/*-1*/))){
                              $listwriter194.append(defB_3);
                          }
                          
                          IList tmpB_8 = ((IList)($alist_add_alist(((IList)b_2),((IList)($listwriter194.done())))));
                          final IListWriter $listwriter197 = (IListWriter)$RVF.listWriter();
                          final IInteger $lst32 = ((IInteger)(((IInteger) ((IInteger)longest_6).subtract(((IInteger)($me.size(((IList)c_4))))))));
                          final boolean $dir33 = ((IInteger)$constants.get(1)/*0*/).less($lst32).getValue();
                          
                          $LCOMP198_GEN26957:
                          for(IInteger $elem199 = ((IInteger)$constants.get(1)/*0*/); $dir33 ? $aint_less_aint($elem199,$lst32).getValue() 
                                                    : $aint_lessequal_aint($elem199,$lst32).not().getValue(); $elem199 = $aint_add_aint($elem199,$dir33 ? ((IInteger)$constants.get(2)/*1*/) : ((IInteger)$constants.get(4)/*-1*/))){
                              $listwriter197.append(defC_5);
                          }
                          
                          IList tmpC_9 = ((IList)($alist_add_alist(((IList)c_4),((IList)($listwriter197.done())))));
                          if((((IBool)($equal(((IInteger)($me.size(((IList)tmpA_7)))), ((IInteger)($me.size(((IList)tmpB_8)))))))).getValue()){
                             if((((IBool)($equal(((IInteger)($me.size(((IList)tmpB_8)))), ((IInteger)($me.size(((IList)tmpC_9)))))))).getValue()){
                                /* void:  muCon(true) */
                             } else {
                                $assert_fails(((IString)$constants.get(5)/*""*/));
                             }
                          } else {
                             $assert_fails(((IString)$constants.get(5)/*""*/));
                          }final IListWriter $listwriter201 = (IListWriter)$RVF.listWriter();
                          $LCOMP202_GEN27095:
                          for(IValue $elem203_for : ((IList)($me.index(((IList)tmpA_7))))){
                              IInteger $elem203 = (IInteger) $elem203_for;
                              IInteger i_10 = null;
                              $listwriter201.append($RVF.tuple(((IValue)($alist_subscript_int(((IList)tmpA_7),((IInteger)($elem203)).intValue()))), ((IValue)($alist_subscript_int(((IList)tmpB_8),((IInteger)($elem203)).intValue()))), ((IValue)($alist_subscript_int(((IList)tmpC_9),((IInteger)($elem203)).intValue())))));
                          
                          }
                          
                                      final IList $result204 = ((IList)($listwriter201.done()));
                          if($T75.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result204.getType(),$T75)){
                             return ((IList)($result204));
                          
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
    

    public static void main(String[] args) {
      throw new RuntimeException("No function `main` found in Rascal module `List`");
    }
}