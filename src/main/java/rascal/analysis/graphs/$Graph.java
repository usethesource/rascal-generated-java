package rascal.analysis.graphs;
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
public class $Graph 
    extends
        org.rascalmpl.runtime.$RascalModule
    implements 
    	rascal.analysis.graphs.$Graph_$I {

    private final $Graph_$I $me;
    private final IList $constants;
    
    
    public final rascal.$Set M_Set;
    public final rascal.util.$Math M_util_Math;
    public final rascal.$Relation M_Relation;
    public final rascal.$List M_List;

    
    final org.rascalmpl.library.Prelude $Prelude; // TODO: asBaseClassName will generate name collisions if there are more of the same name in different packages

    
    public final io.usethesource.vallang.type.Type $T1;	/*avalue()*/
    public final io.usethesource.vallang.type.Type $T8;	/*aparameter("T",avalue(),closed=false,alabel="h")*/
    public final io.usethesource.vallang.type.Type $T15;	/*aparameter("T",avalue(),closed=true,alabel="from")*/
    public final io.usethesource.vallang.type.Type $T10;	/*aparameter("T",avalue(),closed=true)*/
    public final io.usethesource.vallang.type.Type $T6;	/*aparameter("T",avalue(),closed=false,alabel="to")*/
    public final io.usethesource.vallang.type.Type $T5;	/*aparameter("T",avalue(),closed=false,alabel="from")*/
    public final io.usethesource.vallang.type.Type $T2;	/*aparameter("T",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type $T16;	/*aparameter("T",avalue(),closed=true,alabel="to")*/
    public final io.usethesource.vallang.type.Type $T9;	/*alist(aparameter("T",avalue(),closed=true))*/
    public final io.usethesource.vallang.type.Type ADT_RuntimeException;	/*aadt("RuntimeException",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T7;	/*alist(aparameter("T",avalue(),closed=false,alabel="h"))*/
    public final io.usethesource.vallang.type.Type $T12;	/*aset(aparameter("T",avalue(),closed=true))*/
    public final io.usethesource.vallang.type.Type $T11;	/*aset(aset(aparameter("T",avalue(),closed=true)))*/
    public final io.usethesource.vallang.type.Type $T3;	/*aset(aparameter("T",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type $T0;	/*alist(aparameter("T",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type $T13;	/*atuple(atypeList([aset(aset(aparameter("T",avalue(),closed=true))),alist(aparameter("T",avalue(),closed=true))]))*/
    public final io.usethesource.vallang.type.Type $T4;	/*arel(atypeList([aparameter("T",avalue(),closed=false,alabel="from"),aparameter("T",avalue(),closed=false,alabel="to")]))*/
    public final io.usethesource.vallang.type.Type $T14;	/*arel(atypeList([aparameter("T",avalue(),closed=true,alabel="from"),aparameter("T",avalue(),closed=true,alabel="to")]))*/

    public $Graph(RascalExecutionContext rex){
        this(rex, null);
    }
    
    public $Graph(RascalExecutionContext rex, Object extended){
       super(rex);
       this.$me = extended == null ? this : ($Graph_$I)extended;
       ModuleStore mstore = rex.getModuleStore();
       mstore.put(rascal.analysis.graphs.$Graph.class, this);
       
       mstore.importModule(rascal.$Set.class, rex, rascal.$Set::new);
       mstore.importModule(rascal.util.$Math.class, rex, rascal.util.$Math::new);
       mstore.importModule(rascal.$Relation.class, rex, rascal.$Relation::new);
       mstore.importModule(rascal.$List.class, rex, rascal.$List::new); 
       
       M_Set = mstore.getModule(rascal.$Set.class);
       M_util_Math = mstore.getModule(rascal.util.$Math.class);
       M_Relation = mstore.getModule(rascal.$Relation.class);
       M_List = mstore.getModule(rascal.$List.class); 
       
                          
       
       $TS.importStore(M_Set.$TS);
       $TS.importStore(M_util_Math.$TS);
       $TS.importStore(M_Relation.$TS);
       $TS.importStore(M_List.$TS);
       
       $Prelude = $initLibrary("org.rascalmpl.library.Prelude"); 
    
       $constants = readBinaryConstantsFile(this.getClass(), "rascal/analysis/graphs/$Graph.constants", 5, "8654b3e6af643cffa02a4a3c7954f751");
       ADT_RuntimeException = $adt("RuntimeException");
       $T1 = $TF.valueType();
       $T8 = $TF.parameterType("T", $T1);
       $T15 = $TF.parameterType("T", $T1);
       $T10 = $TF.parameterType("T", $T1);
       $T6 = $TF.parameterType("T", $T1);
       $T5 = $TF.parameterType("T", $T1);
       $T2 = $TF.parameterType("T", $T1);
       $T16 = $TF.parameterType("T", $T1);
       $T9 = $TF.listType($T10);
       $T7 = $TF.listType($T8);
       $T12 = $TF.setType($T10);
       $T11 = $TF.setType($T12);
       $T3 = $TF.setType($T2);
       $T0 = $TF.listType($T2);
       $T13 = $TF.tupleType($T11, $T9);
       $T4 = $TF.setType($TF.tupleType($T5, $T6));
       $T14 = $TF.setType($TF.tupleType($T15, $T16));
    
       
       
    }
    public IValue head(IValue $P0){ // Generated by Resolver
       return (IValue) M_List.head($P0);
    }
    public ISet carrierX(IValue $P0, IValue $P1){ // Generated by Resolver
       return (ISet) M_Relation.carrierX($P0, $P1);
    }
    public IInteger size(IValue $P0){ // Generated by Resolver
       IInteger $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IInteger)M_List.size$811ff6e419f455d9((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T3)){
         $result = (IInteger)M_Set.size$38d40110541faa91((ISet) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue max(IValue $P0){ // Generated by Resolver
       return (IValue) M_List.max($P0);
    }
    public ISet domain(IValue $P0){ // Generated by Resolver
       return (ISet) M_Relation.domain($P0);
    }
    public ISet reachX(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T4) && $isSubtypeOf($P1Type,$T3) && $isSubtypeOf($P2Type,$T3)){
         $result = (ISet)reachX$a9fb64139ba3e308((ISet) $P0, (ISet) $P1, (ISet) $P2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IList shortestPathPair(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T4) && $isSubtypeOf($P1Type,$T2) && $isSubtypeOf($P2Type,$T2)){
         $result = (IList)shortestPathPair$50b0dd0872ec0c76((ISet) $P0, (IValue) $P1, (IValue) $P2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public ISet predecessors(IValue $P0, IValue $P1){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T4) && $isSubtypeOf($P1Type,$T2)){
         $result = (ISet)predecessors$b1228ed80c41760a((ISet) $P0, (IValue) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public ISet bottom(IValue $P0){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T4)){
         $result = (ISet)bottom$dc7508f35c24d968((ISet) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public ISet successors(IValue $P0, IValue $P1){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T4) && $isSubtypeOf($P1Type,$T2)){
         $result = (ISet)successors$7f7d01b3d9169058((ISet) $P0, (IValue) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public ISet transitiveReduction(IValue $P0){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T4)){
         $result = (ISet)transitiveReduction$a5c8d5536b5f8d29((ISet) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList order(IValue $P0){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T4)){
         $result = (IList)order$ccdc9b46fd59ff2b((ISet) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList tail(IValue $P0){ // Generated by Resolver
       return (IList) M_List.tail($P0);
    }
    public ITuple headTail(IValue $P0){ // Generated by Resolver
       return (ITuple) M_List.headTail($P0);
    }
    public ISet transitiveEdges(IValue $P0){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T4)){
         $result = (ISet)transitiveEdges$8897b7010c277282((ISet) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue min(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T7)){
         $result = (IValue)M_List.min$c23fb8d51ed1eb26((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IValue)M_List.min$e28c8bb4309a1fa8((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T3)){
         $result = (IValue)M_Set.min$6f2bdb54a7debae2((ISet) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public INumber min(IValue $P0, IValue $P1){ // Generated by Resolver
       return (INumber) M_util_Math.min($P0, $P1);
    }
    public ISet reach(IValue $P0, IValue $P1){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T4) && $isSubtypeOf($P1Type,$T3)){
         $result = (ISet)reach$a58bcbf76b7f9bdc((ISet) $P0, (ISet) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public void stronglyConnectedComponentsAndTopSort_strongConnect(IValue $P0, ValueRef<ISet> components_6, ValueRef<ISet> g_0, ValueRef<IInteger> index_1, ValueRef<IMap> indexOf_3, ValueRef<IMap> low_2, ValueRef<ISet> onStack_4, ValueRef<IList> stack_5, ValueRef<IList> topsort_7){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T2)){
         try { strongConnect$6c9f8d528e47ddb4((IValue) $P0, components_6, g_0, index_1, indexOf_3, low_2, onStack_4, stack_5, topsort_7); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public ISet top(IValue $P0){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T4)){
         $result = (ISet)top$7e8918501e3a78c3((ISet) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public ISet invert(IValue $P0){ // Generated by Resolver
       return (ISet) M_Relation.invert($P0);
    }
    public ITuple stronglyConnectedComponentsAndTopSort(IValue $P0){ // Generated by Resolver
       ITuple $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T4)){
         $result = (ITuple)stronglyConnectedComponentsAndTopSort$506703de736e152f((ISet) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public ISet carrier(IValue $P0){ // Generated by Resolver
       return (ISet) M_Relation.carrier($P0);
    }
    public ISet carrierR(IValue $P0, IValue $P1){ // Generated by Resolver
       return (ISet) M_Relation.carrierR($P0, $P1);
    }
    public IValue getOneFrom(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IValue)M_List.getOneFrom$9f31447a835de72c((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T3)){
         $result = (IValue)M_Set.getOneFrom$c805fd3ee8d4530c((ISet) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public ISet stronglyConnectedComponents(IValue $P0){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T4)){
         $result = (ISet)stronglyConnectedComponents$88d45af34584ff60((ISet) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public ISet range(IValue $P0){ // Generated by Resolver
       return (ISet) M_Relation.range($P0);
    }
    public ISet reachR(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T4) && $isSubtypeOf($P1Type,$T3) && $isSubtypeOf($P2Type,$T3)){
         $result = (ISet)reachR$a40e693c87f341b0((ISet) $P0, (ISet) $P1, (ISet) $P2);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public ISet connectedComponents(IValue $P0){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T4)){
         $result = (ISet)connectedComponents$a2bd90214163852a((ISet) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }

    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/analysis/graphs/Graph.rsc|(1025,295,<30,0>,<40,1>) 
    public IList order$ccdc9b46fd59ff2b(ISet g_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T4.match(g_0.getType(), $typeBindings)){
           ITuple $TMP0 = (ITuple)($me.stronglyConnectedComponentsAndTopSort(((ISet)g_0)));
           ISet components_1 = ((ISet)($atuple_subscript_int(((ITuple)($TMP0)),0)));
           IList topsort_2 = ((IList)($atuple_subscript_int(((ITuple)($TMP0)),1)));
           final IList $result1 = ((IList)topsort_2);
           if($T9.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result1.getType(),$T9)){
              return ((IList)($result1));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/analysis/graphs/Graph.rsc|(1326,389,<43,0>,<53,1>) 
    public ISet stronglyConnectedComponents$88d45af34584ff60(ISet g_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T4.match(g_0.getType(), $typeBindings)){
           ITuple $TMP2 = (ITuple)($me.stronglyConnectedComponentsAndTopSort(((ISet)g_0)));
           ISet components_1 = ((ISet)($atuple_subscript_int(((ITuple)($TMP2)),0)));
           IList topsort_2 = ((IList)($atuple_subscript_int(((ITuple)($TMP2)),1)));
           final ISet $result3 = ((ISet)components_1);
           if($T11.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result3.getType(),$T11)){
              return ((ISet)($result3));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/analysis/graphs/Graph.rsc|(2758,1250,<73,4>,<107,5>) 
    public void strongConnect$6c9f8d528e47ddb4(IValue v_0, ValueRef<ISet> components_6, ValueRef<ISet> g_0, ValueRef<IInteger> index_1, ValueRef<IMap> indexOf_3, ValueRef<IMap> low_2, ValueRef<ISet> onStack_4, ValueRef<IList> stack_5, ValueRef<IList> topsort_7){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T2.match(v_0.getType(), $typeBindings)){
           if(true){
              indexOf_3.setValue(((IMap)($amap_update(v_0,index_1.getValue(), ((IMap)(indexOf_3.getValue()))))));
              low_2.setValue(((IMap)($amap_update(v_0,index_1.getValue(), ((IMap)(low_2.getValue()))))));
              index_1.setValue(((IInteger)($aint_add_aint(index_1.getValue(),((IInteger)$constants.get(0)/*1*/)))));
              stack_5.setValue(((IList)(M_List.push(((IValue)v_0), stack_5.getValue()))));
              ISet $aux_1 = ((ISet)($RVF.set(((IValue)v_0))));
              onStack_4.setValue($aset_add_aset(onStack_4.getValue(),$aux_1));
              /*muExists*/FOR0: 
                  do {
                      FOR0_GEN3044:
                      for(IValue $elem4_for : ((ISet)($me.successors(g_0.getValue(), ((IValue)v_0))))){
                          IValue $elem4 = (IValue) $elem4_for;
                          if($isSubtypeOf($elem4.getType(),$T10.instantiate($typeBindings))){
                             IValue w_1 = ((IValue)($elem4));
                             if($is_defined_value($guarded_map_subscript(indexOf_3.getValue(),((IValue)w_1)))){
                                if((((IBool)($RVF.bool(onStack_4.getValue().contains(((IValue)w_1)))))).getValue()){
                                   low_2.setValue(((IMap)($amap_update(v_0,M_util_Math.min(((INumber)($amap_subscript(low_2.getValue(),((IValue)v_0)))), ((INumber)($amap_subscript(indexOf_3.getValue(),((IValue)w_1))))), ((IMap)(low_2.getValue()))))));
                                
                                }
                             
                             } else {
                                stronglyConnectedComponentsAndTopSort_strongConnect(((IValue)w_1), components_6, g_0, index_1, indexOf_3, low_2, onStack_4, stack_5, topsort_7);
                                low_2.setValue(((IMap)($amap_update(v_0,M_util_Math.min(((INumber)($amap_subscript(low_2.getValue(),((IValue)v_0)))), ((INumber)($amap_subscript(low_2.getValue(),((IValue)w_1))))), ((IMap)(low_2.getValue()))))));
                             
                             }
                          } else {
                             continue FOR0_GEN3044;
                          }
                      }
                      continue FOR0;
                                  
                  } while(false);
              /* void:  muCon([]) */if((((IBool)($equal(((IInteger)($amap_subscript(low_2.getValue(),((IValue)v_0)))), ((IInteger)($amap_subscript(indexOf_3.getValue(),((IValue)v_0)))))))).getValue()){
                 ISet scc_2 = ((ISet)$constants.get(1)/*{}*/);
                 IValue w_3 = ((IValue)v_0);
                 DO4:
                     do{
                         ITuple $TMP5 = (ITuple)(M_List.pop(stack_5.getValue()));
                         w_3 = ((IValue)($atuple_subscript_int(((ITuple)($TMP5)),0)));
                         stack_5.setValue(((IList)($atuple_subscript_int(((ITuple)($TMP5)),1))));
                         ISet $aux_2 = ((ISet)($RVF.set(((IValue)w_3))));
                         onStack_4.setValue(onStack_4.getValue().subtract($aux_2));
                         scc_2 = ((ISet)($aset_add_aset(((ISet)scc_2),((ISet)($RVF.set(((IValue)w_3)))))));
                         topsort_7.setValue(((IList)($alist_add_alist(((IList)($RVF.list(((IValue)w_3)))),topsort_7.getValue()))));
                 
                     } while((((IBool)($equal(((IValue)w_3),((IValue)v_0)).not()))).getValue());
                 /* void:  muCon([]) */ISet $aux_3 = ((ISet)($RVF.set(((ISet)scc_2))));
                 components_6.setValue($aset_add_aset(components_6.getValue(),$aux_3));
              
              }
              return;
           
           } else {
              throw $failReturnFromVoidException;
           }
        } else {
           throw $failReturnFromVoidException;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/analysis/graphs/Graph.rsc|(1719,2442,<55,0>,<116,1>) 
    public ITuple stronglyConnectedComponentsAndTopSort$506703de736e152f(ISet $aux_g_0){ 
        ValueRef<ISet> g_0 = new ValueRef<ISet>("g_0", $aux_g_0);
    
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T4.match(g_0.getValue().getType(), $typeBindings)){
           if(true){
              final ValueRef<IInteger> index_1 = new ValueRef<IInteger>("index", ((IInteger)$constants.get(2)/*0*/));
              final ValueRef<IMap> low_2 = new ValueRef<IMap>("low", ((IMap)$constants.get(3)/*()*/));
              final ValueRef<IMap> indexOf_3 = new ValueRef<IMap>("indexOf", ((IMap)$constants.get(3)/*()*/));
              final ValueRef<ISet> onStack_4 = new ValueRef<ISet>("onStack", ((ISet)$constants.get(1)/*{}*/));
              final ValueRef<IList> stack_5 = new ValueRef<IList>("stack", ((IList)$constants.get(4)/*[]*/));
              final ValueRef<ISet> components_6 = new ValueRef<ISet>("components", ((ISet)$constants.get(1)/*{}*/));
              final ValueRef<IList> topsort_7 = new ValueRef<IList>("topsort", ((IList)$constants.get(4)/*[]*/));
              /*muExists*/FOR5: 
                  do {
                      FOR5_GEN4024:
                      for(IValue $elem6_for : ((ISet)(M_Relation.carrier(g_0.getValue())))){
                          IValue $elem6 = (IValue) $elem6_for;
                          IValue v_11 = ((IValue)($elem6));
                          if($is_defined_value($guarded_map_subscript(indexOf_3.getValue(),((IValue)v_11)))){
                             
                          } else {
                             stronglyConnectedComponentsAndTopSort_strongConnect(((IValue)v_11), components_6, g_0, index_1, indexOf_3, low_2, onStack_4, stack_5, topsort_7);
                          
                          }
                      }
                      continue FOR5;
                                  
                  } while(false);
              /* void:  muCon([]) */final ITuple $result7 = ((ITuple)($RVF.tuple(components_6.getValue(), topsort_7.getValue())));
              if($T13.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result7.getType(),$T13)){
                 return ((ITuple)($result7));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/analysis/graphs/Graph.rsc|(4167,353,<119,0>,<132,1>) 
    public ISet bottom$dc7508f35c24d968(ISet G_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T4.match(G_0.getType(), $typeBindings)){
           final ISet $result8 = ((ISet)(((ISet)(M_Relation.range(((ISet)G_0)))).subtract(((ISet)(M_Relation.domain(((ISet)G_0)))))));
           if($T12.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result8.getType(),$T12)){
              return ((ISet)($result8));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/analysis/graphs/Graph.rsc|(4526,366,<135,0>,<149,1>) 
    public ISet predecessors$b1228ed80c41760a(ISet G_0, IValue From_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T4.match(G_0.getType(), $typeBindings)){
           if($T2.match(From_1.getType(), $typeBindings)){
              final ISet $result9 = ((ISet)($arel_subscript1_noset(((ISet)(M_Relation.invert(((ISet)G_0)))),((IValue)From_1))));
              if($T12.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result9.getType(),$T12)){
                 return ((ISet)($result9));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/analysis/graphs/Graph.rsc|(4898,369,<152,0>,<168,1>) 
    public ISet reach$a58bcbf76b7f9bdc(ISet G_0, ISet Start_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T4.match(G_0.getType(), $typeBindings)){
           if($T3.match(Start_1.getType(), $typeBindings)){
              ISet R_2 = ((ISet)Start_1);
              ISet $new_3 = ((ISet)R_2);
              /*muExists*/WHILE7_BT: 
                  do {
                      WHILE7:
                          while((((IBool)($equal(((ISet)$new_3),((ISet)$constants.get(1)/*{}*/)).not()))).getValue()){
                              $new_3 = ((ISet)(((ISet)($arel2_subscript1_aset(((ISet)G_0),((ISet)$new_3)))).subtract(((ISet)R_2))));
                              R_2 = ((ISet)($aset_add_aset(((ISet)R_2),((ISet)$new_3))));
                      
                          }
              
                  } while(false);
              /* void:  muCon([]) */final ISet $result10 = ((ISet)R_2);
              if($T12.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result10.getType(),$T12)){
                 return ((ISet)($result10));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/analysis/graphs/Graph.rsc|(5273,513,<171,0>,<185,1>) 
    public ISet reachR$a40e693c87f341b0(ISet G_0, ISet Start_1, ISet Restr_2){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T4.match(G_0.getType(), $typeBindings)){
           if($T3.match(Start_1.getType(), $typeBindings)){
              if($T3.match(Restr_2.getType(), $typeBindings)){
                 final ISet $result11 = ((ISet)($arel2_subscript1_aset(((ISet)(((ISet)(M_Relation.carrierR(((ISet)G_0), ((ISet)Restr_2)))).asRelation().closure())),((ISet)Start_1))));
                 if($T12.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result11.getType(),$T12)){
                    return ((ISet)($result11));
                 
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/analysis/graphs/Graph.rsc|(5792,479,<188,0>,<202,1>) 
    public ISet reachX$a9fb64139ba3e308(ISet G_0, ISet Start_1, ISet Excl_2){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T4.match(G_0.getType(), $typeBindings)){
           if($T3.match(Start_1.getType(), $typeBindings)){
              if($T3.match(Excl_2.getType(), $typeBindings)){
                 final ISet $result12 = ((ISet)($arel2_subscript1_aset(((ISet)(((ISet)(M_Relation.carrierX(((ISet)G_0), ((ISet)Excl_2)))).asRelation().closure())),((ISet)Start_1))));
                 if($T12.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result12.getType(),$T12)){
                    return ((ISet)($result12));
                 
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/analysis/graphs/Graph.rsc|(6277,264,<205,0>,<210,67>) 
    public IList shortestPathPair$50b0dd0872ec0c76(ISet G_0, IValue From_1, IValue To_2){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T4.match(G_0.getType(), $typeBindings)){
           if($T2.match(From_1.getType(), $typeBindings)){
              if($T2.match(To_2.getType(), $typeBindings)){
                 final IList $result13 = ((IList)((IList)$Prelude.shortestPathPair(G_0, From_1, To_2)));
                 if($T9.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result13.getType(),$T9)){
                    return ((IList)($result13));
                 
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/analysis/graphs/Graph.rsc|(6547,327,<213,0>,<226,1>) 
    public ISet successors$7f7d01b3d9169058(ISet G_0, IValue From_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T4.match(G_0.getType(), $typeBindings)){
           if($T2.match(From_1.getType(), $typeBindings)){
              final ISet $result14 = ((ISet)($arel_subscript1_noset(((ISet)G_0),((IValue)From_1))));
              if($T12.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result14.getType(),$T12)){
                 return ((ISet)($result14));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/analysis/graphs/Graph.rsc|(6880,349,<229,0>,<242,1>) 
    public ISet top$7e8918501e3a78c3(ISet G_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T4.match(G_0.getType(), $typeBindings)){
           final ISet $result15 = ((ISet)(((ISet)(M_Relation.domain(((ISet)G_0)))).subtract(((ISet)(M_Relation.range(((ISet)G_0)))))));
           if($T12.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result15.getType(),$T12)){
              return ((ISet)($result15));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/analysis/graphs/Graph.rsc|(7235,847,<245,0>,<270,1>) 
    public ISet connectedComponents$a2bd90214163852a(ISet G_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T4.match(G_0.getType(), $typeBindings)){
           ISet components_1 = ((ISet)$constants.get(1)/*{}*/);
           ISet undirected_2 = ((ISet)($aset_add_aset(((ISet)G_0),((ISet)(M_Relation.invert(((ISet)G_0)))))));
           ISet todo_3 = ((ISet)(M_Relation.domain(((ISet)undirected_2))));
           /*muExists*/WHILE8_BT: 
               do {
                   WHILE8:
                       while((((IBool)($aint_lessequal_aint(((IInteger)(M_Set.size(((ISet)todo_3)))),((IInteger)$constants.get(2)/*0*/)).not()))).getValue()){
                           ISet component_4 = ((ISet)($me.reach(((ISet)undirected_2), ((ISet)($RVF.set(((IValue)(M_Set.getOneFrom(((ISet)todo_3))))))))));
                           components_1 = ((ISet)($aset_add_aset(((ISet)components_1),((ISet)($RVF.set(((ISet)component_4)))))));
                           todo_3 = ((ISet)(((ISet)todo_3).subtract(((ISet)component_4))));
                   
                       }
           
               } while(false);
           /* void:  muCon([]) */final ISet $result16 = ((ISet)components_1);
           if($T11.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result16.getType(),$T11)){
              return ((ISet)($result16));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/analysis/graphs/Graph.rsc|(8086,964,<272,0>,<291,58>) 
    public ISet transitiveReduction$a5c8d5536b5f8d29(ISet g_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T4.match(g_0.getType(), $typeBindings)){
           final ISet $result17 = ((ISet)(((ISet)g_0).subtract(((ISet)(((ISet)g_0).asRelation().compose(((ISet)(((ISet)g_0).asRelation().closure())).asRelation()))))));
           if($T14.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result17.getType(),$T14)){
              return ((ISet)($result17));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/analysis/graphs/Graph.rsc|(9054,147,<293,0>,<294,48>) 
    public ISet transitiveEdges$8897b7010c277282(ISet g_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T4.match(g_0.getType(), $typeBindings)){
           final ISet $result18 = ((ISet)(((ISet)g_0).asRelation().compose(((ISet)(((ISet)g_0).asRelation().closure())).asRelation())));
           if($T14.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result18.getType(),$T14)){
              return ((ISet)($result18));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    

    public static void main(String[] args) {
      throw new RuntimeException("No function `main` found in Rascal module `analysis::graphs::Graph`");
    }
}