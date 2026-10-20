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
public class $Parameters 
    extends
        org.rascalmpl.runtime.$RascalModule
    implements 
    	rascal.lang.rascal.grammar.definition.$Parameters_$I {

    private final $Parameters_$I $me;
    private final IList $constants;
    
    
    public final rascal.$Set M_Set;
    public final rascal.$ParseTree M_ParseTree;
    public final rascal.$Type M_Type;
    public final rascal.$List M_List;
    public final rascal.$Grammar M_Grammar;
    public final rascal.$Message M_Message;

    
    
    public final io.usethesource.vallang.type.Type $T1;	/*avalue()*/
    public final io.usethesource.vallang.type.Type $T6;	/*avoid()*/
    public final io.usethesource.vallang.type.Type $T2;	/*aparameter("T",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type ADT_Tree;	/*aadt("Tree",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_IOCapability;	/*aadt("IOCapability",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_GrammarModule;	/*aadt("GrammarModule",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RuntimeException;	/*aadt("RuntimeException",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T3;	/*aset(aparameter("T",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type ADT_Condition;	/*aadt("Condition",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FileSystemChange;	/*aadt("FileSystemChange",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_GrammarDefinition;	/*aadt("GrammarDefinition",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T0;	/*alist(aparameter("T",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type ADT_Item;	/*aadt("Item",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Associativity;	/*aadt("Associativity",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T5;	/*aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)*/
    public final io.usethesource.vallang.type.Type ADT_TreeSearchResult_1;	/*aadt("TreeSearchResult",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Attr;	/*aadt("Attr",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Symbol;	/*aadt("Symbol",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TreeSearchResult_Tree;	/*aadt("TreeSearchResult",[aadt("Tree",[],dataSyntax())],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Production;	/*aadt("Production",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T4;	/*aset(aadt("Production",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type ADT_CharRange;	/*aadt("CharRange",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TreeSearchResult_void;	/*aadt("TreeSearchResult",[avoid()],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Message;	/*aadt("Message",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type TreeSearchResult_Tree_treeFound_Tree;	/*acons(aadt("TreeSearchResult",[aadt("Tree",[],dataSyntax())],dataSyntax()),[aadt("Tree",[],dataSyntax(),alabel="tree")],[],alabel="treeFound")*/
    public final io.usethesource.vallang.type.Type ADT_Exception;	/*aadt("Exception",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Grammar;	/*aadt("Grammar",[],dataSyntax())*/

    public $Parameters(RascalExecutionContext rex){
        this(rex, null);
    }
    
    public $Parameters(RascalExecutionContext rex, Object extended){
       super(rex);
       this.$me = extended == null ? this : ($Parameters_$I)extended;
       ModuleStore mstore = rex.getModuleStore();
       mstore.put(rascal.lang.rascal.grammar.definition.$Parameters.class, this);
       
       mstore.importModule(rascal.$Set.class, rex, rascal.$Set::new);
       mstore.importModule(rascal.$ParseTree.class, rex, rascal.$ParseTree::new);
       mstore.importModule(rascal.$Type.class, rex, rascal.$Type::new);
       mstore.importModule(rascal.$List.class, rex, rascal.$List::new);
       mstore.importModule(rascal.$Grammar.class, rex, rascal.$Grammar::new);
       mstore.importModule(rascal.$Message.class, rex, rascal.$Message::new); 
       
       M_Set = mstore.getModule(rascal.$Set.class);
       M_ParseTree = mstore.getModule(rascal.$ParseTree.class);
       M_Type = mstore.getModule(rascal.$Type.class);
       M_List = mstore.getModule(rascal.$List.class);
       M_Grammar = mstore.getModule(rascal.$Grammar.class);
       M_Message = mstore.getModule(rascal.$Message.class); 
       
                          
       
       $TS.importStore(M_Set.$TS);
       $TS.importStore(M_ParseTree.$TS);
       $TS.importStore(M_Type.$TS);
       $TS.importStore(M_List.$TS);
       $TS.importStore(M_Grammar.$TS);
       $TS.importStore(M_Message.$TS);
       
       $constants = readBinaryConstantsFile(this.getClass(), "rascal/lang/rascal/grammar/definition/$Parameters.constants", 3, "f29fa42e0a6e8f26df0b155f045fe2af");
       ADT_Tree = $adt("Tree");
       ADT_IOCapability = $adt("IOCapability");
       ADT_GrammarModule = $adt("GrammarModule");
       ADT_RuntimeException = $adt("RuntimeException");
       ADT_Condition = $adt("Condition");
       ADT_FileSystemChange = $adt("FileSystemChange");
       ADT_GrammarDefinition = $adt("GrammarDefinition");
       ADT_Item = $adt("Item");
       ADT_Associativity = $adt("Associativity");
       ADT_Attr = $adt("Attr");
       ADT_Symbol = $adt("Symbol");
       ADT_Production = $adt("Production");
       ADT_CharRange = $adt("CharRange");
       ADT_Message = $adt("Message");
       ADT_Exception = $adt("Exception");
       ADT_Grammar = $adt("Grammar");
       $T1 = $TF.valueType();
       $T6 = $TF.voidType();
       $T2 = $TF.parameterType("T", $T1);
       $T3 = $TF.setType($T2);
       $T0 = $TF.listType($T2);
       $T5 = $TF.parameterType("T", ADT_Tree);
       ADT_TreeSearchResult_1 = $parameterizedAdt("TreeSearchResult", new Type[] { $T5 });
       ADT_TreeSearchResult_Tree = $parameterizedAdt("TreeSearchResult", new Type[] { ADT_Tree });
       $T4 = $TF.setType(ADT_Production);
       ADT_TreeSearchResult_void = $parameterizedAdt("TreeSearchResult", new Type[] { $T6 });
       TreeSearchResult_Tree_treeFound_Tree = $TF.constructor($TS, ADT_TreeSearchResult_Tree, "treeFound", M_ParseTree.ADT_Tree, "tree");
    
       
       
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
    public IConstructor grammar(IValue $P0){ // Generated by Resolver
       return (IConstructor) M_Grammar.grammar($P0);
    }
    public IConstructor grammar(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IConstructor) M_Grammar.grammar($P0, $P1);
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
    public IValue index(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IValue)M_List.index$f006059c1d37534f((IList) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T3)){
         $result = (IValue)M_Set.index$8a5f4e126881ec51((ISet) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IConstructor delabel(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol)){
         $result = (IConstructor)delabel$4407a419963aaf93((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
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
    public ISet expand(IValue $P0){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T4)){
         $result = (ISet)expand$a468906ed9235912((ISet) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IConstructor associativity(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       return (IConstructor) M_ParseTree.associativity($P0, $P1, $P2);
    }
    public IConstructor expandParameterizedSymbols(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_Grammar.ADT_Grammar)){
         $result = (IConstructor)expandParameterizedSymbols$3ac31e458c761b05((IConstructor) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue glb(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IValue) M_Type.glb($P0, $P1);
    }

    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Parameters.rsc|(609,125,<18,0>,<20,1>) 
    public IConstructor expandParameterizedSymbols$3ac31e458c761b05(IConstructor g_0){ 
        
        
        final ISetWriter $setwriter0 = (ISetWriter)$RVF.setWriter();
        ;
        $SCOMP1_GEN714:
        for(IValue $elem2_for : ((IMap)(((IMap)($aadt_get_field(((IConstructor)g_0), "rules")))))){
            IConstructor $elem2 = (IConstructor) $elem2_for;
            IConstructor nt_1 = null;
            $setwriter0.insert($amap_subscript(((IMap)(((IMap)($aadt_get_field(((IConstructor)g_0), "rules"))))),((IConstructor)($elem2))));
        
        }
        
                    return ((IConstructor)(M_Grammar.grammar(((ISet)(((ISet)($aadt_get_field(((IConstructor)g_0), "starts"))))), ((ISet)($me.expand(((ISet)($setwriter0.done()))))))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Parameters.rsc|(739,74,<22,0>,<24,1>) 
    public IConstructor delabel$4407a419963aaf93(IConstructor l_0){ 
        
        
        /*muExists*/$RET3: 
            do {
                if($has_type_and_arity(l_0, M_Type.Symbol_label_str_Symbol, 2)){
                   IValue $arg0_5 = (IValue)($aadt_subscript_int(((IConstructor)l_0),0));
                   if($isComparable($arg0_5.getType(), $T1)){
                      IValue $arg1_4 = (IValue)($aadt_subscript_int(((IConstructor)l_0),1));
                      if($isComparable($arg1_4.getType(), M_ParseTree.ADT_Symbol)){
                         IConstructor m_1 = null;
                         return ((IConstructor)($arg1_4));
                      
                      }
                   
                   }
                
                }
        
            } while(false);
        return ((IConstructor)l_0);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/lang/rascal/grammar/definition/Parameters.rsc|(817,1413,<26,0>,<58,1>) 
    public ISet expand$a468906ed9235912(ISet prods_0){ 
        
        
        try {
            final ISetWriter $setwriter6 = (ISetWriter)$RVF.setWriter();
            ;
            $SCOMP7_GEN937:
            for(IValue $elem9_for : ((ISet)prods_0)){
                IConstructor $elem9 = (IConstructor) $elem9_for;
                IConstructor p_2 = ((IConstructor)($elem9));
                final IConstructor $subject_val8 = ((IConstructor)($me.delabel(((IConstructor)(((IConstructor)($aadt_get_field(((IConstructor)p_2), "def"))))))));
                if(true){
                   IConstructor s_3 = null;
                   if($is(((IConstructor)($subject_val8)),((IString)$constants.get(0)/*"parameterized-sort"*/))){
                     $setwriter6.insert(p_2);
                   
                   } else {
                     if($is(((IConstructor)($subject_val8)),((IString)$constants.get(1)/*"parameterized-lex"*/))){
                       $setwriter6.insert(p_2);
                     
                     } else {
                       continue $SCOMP7_GEN937;
                     }
                   
                   }
                
                } else {
                   continue $SCOMP7_GEN937;
                }
            }
            
                        ISet defs_1 = ((ISet)($setwriter6.done()));
            ISet result_4 = ((ISet)(((ISet)prods_0).subtract(((ISet)defs_1))));
            final ISetWriter $setwriter10 = (ISetWriter)$RVF.setWriter();
            ;
            $SCOMP11_GEN1161:
            for(IValue $elem12_for : ((ISet)result_4)){
                IConstructor $elem12 = (IConstructor) $elem12_for;
                $SCOMP11_GEN1161_DESC1161:
                for(IValue $elem13 : new DescendantMatchIterator($elem12, 
                    new DescendantDescriptorAlwaysTrue($RVF.bool(false)))){
                    if($isComparable($elem13.getType(), M_ParseTree.ADT_Symbol)){
                       if($isSubtypeOf($elem13.getType(),M_ParseTree.ADT_Symbol)){
                          IConstructor s_6 = null;
                          if($is(((IConstructor)($elem13)),((IString)$constants.get(0)/*"parameterized-sort"*/))){
                            $setwriter10.insert($elem13);
                          
                          } else {
                            if($is(((IConstructor)($elem13)),((IString)$constants.get(1)/*"parameterized-lex"*/))){
                              $setwriter10.insert($elem13);
                            
                            } else {
                              continue $SCOMP11_GEN1161_DESC1161;
                            }
                          
                          }
                       
                       } else {
                          continue $SCOMP11_GEN1161_DESC1161;
                       }
                    } else {
                       continue $SCOMP11_GEN1161_DESC1161;
                    }
                }
                continue $SCOMP11_GEN1161;
                             
            }
            
                        ISet $uses_5 = ((ISet)($setwriter10.done()));
            ISet instantiated_7 = ((ISet)$constants.get(2)/*{}*/);
            /*muExists*/WHILE0_BT: 
                do {
                    WHILE0:
                        while((((IBool)($equal(((ISet)$uses_5),((ISet)$constants.get(2)/*{}*/)).not()))).getValue()){
                            ISet instances_8 = ((ISet)$constants.get(2)/*{}*/);
                            /*muExists*/FOR1: 
                                do {
                                    FOR1_GEN1553:
                                    for(IValue $elem22_for : ((ISet)$uses_5)){
                                        IConstructor $elem22 = (IConstructor) $elem22_for;
                                        IConstructor u_9 = ((IConstructor)($elem22));
                                        FOR1_GEN1553_GEN1564:
                                        for(IValue $elem21_for : ((ISet)defs_1)){
                                            IConstructor $elem21 = (IConstructor) $elem21_for;
                                            IConstructor def_10 = ((IConstructor)($elem21));
                                            if((((IBool)($equal(((IString)(((IString)($aadt_get_field(((IConstructor)(((IConstructor)($aadt_get_field(((IConstructor)def_10), "def"))))), "name"))))), ((IString)(((IString)($aadt_get_field(((IConstructor)u_9), "name"))))))))).getValue()){
                                              IString name_11 = ((IString)(((IString)($aadt_get_field(((IConstructor)u_9), "name")))));
                                              IList actuals_12 = ((IList)(((IList)($aadt_get_field(((IConstructor)u_9), "parameters")))));
                                              IList formals_13 = ((IList)(((IList)($aadt_get_field(((IConstructor)(((IConstructor)($aadt_get_field(((IConstructor)def_10), "def"))))), "parameters")))));
                                              instantiated_7 = ((ISet)($aset_add_aset(((ISet)instantiated_7),((ISet)($RVF.set(((IConstructor)u_9)))))));
                                              final IMapWriter $mapwriter14 = (IMapWriter)$RVF.mapWriter();
                                              $MCOMP15_GEN1767:
                                              for(IValue $elem16_for : ((IList)(((IList)(M_List.index(((IList)actuals_12)))).intersect(((IList)(M_List.index(((IList)formals_13)))))))){
                                                  IInteger $elem16 = (IInteger) $elem16_for;
                                                  IInteger i_15 = null;
                                                  $mapwriter14.insert($RVF.tuple($alist_subscript_int(((IList)formals_13),((IInteger)($elem16)).intValue()), $alist_subscript_int(((IList)actuals_12),((IInteger)($elem16)).intValue())));
                                              
                                              }
                                              
                                                          final ValueRef<IMap> substs_14 = new ValueRef<IMap>("substs", ((IMap)($mapwriter14.done())));
                                              final ISetWriter $writer17 = (ISetWriter)$RVF.setWriter();
                                              ;
                                              $setwriter_splice($writer17,instances_8);
                                              $writer17.insert($TRAVERSE.traverse(DIRECTION.BottomUp, PROGRESS.Continuing, FIXEDPOINT.No, REBUILD.Yes, 
                                                   new DescendantDescriptorAlwaysTrue($RVF.bool(false)),
                                                   def_10,
                                                   (IVisitFunction) (IValue $VISIT2_subject, TraversalState $traversalState) -> {
                                                       VISIT2:switch(Fingerprint.getFingerprint($VISIT2_subject)){
                                                       
                                                           case 1206598288:
                                                               if($isSubtypeOf($VISIT2_subject.getType(),M_ParseTree.ADT_Symbol)){
                                                                  /*muExists*/CASE_1206598288_0: 
                                                                      do {
                                                                          if($has_type_and_arity($VISIT2_subject, M_Type.Symbol_parameter_str_Symbol, 2)){
                                                                             IValue $arg0_20 = (IValue)($aadt_subscript_int(((IConstructor)($VISIT2_subject)),0));
                                                                             if($isComparable($arg0_20.getType(), $T1)){
                                                                                IValue $arg1_19 = (IValue)($aadt_subscript_int(((IConstructor)($VISIT2_subject)),1));
                                                                                if($isComparable($arg1_19.getType(), $T1)){
                                                                                   IConstructor par_16 = ((IConstructor)($VISIT2_subject));
                                                                                   GuardedIValue guarded3 = $guarded_map_subscript(substs_14.getValue(),((IConstructor)par_16));
                                                                                   IConstructor $replacement18 = null;
                                                                                   if($is_defined_value(guarded3)){
                                                                                      $replacement18 = ((IConstructor)(((IConstructor)$get_defined_value(guarded3))));
                                                                                   
                                                                                   } else {
                                                                                      $replacement18 = ((IConstructor)par_16);
                                                                                   
                                                                                   }if($isSubtypeOf($replacement18.getType(),$VISIT2_subject.getType())){
                                                                                      $traversalState.setMatchedAndChanged(true, true);
                                                                                      return $replacement18;
                                                                                   
                                                                                   } else {
                                                                                      break VISIT2;// switch
                                                                                   
                                                                                   }
                                                                                }
                                                                             
                                                                             }
                                                                          
                                                                          }
                                                                  
                                                                      } while(false);
                                                               
                                                               }
                                              
                                                       
                                                       
                                                       }
                                                       return $VISIT2_subject;
                                                   }));
                                              instances_8 = ((ISet)($writer17.done()));
                                            
                                            } else {
                                              continue FOR1_GEN1553_GEN1564;
                                            }
                                        
                                        }
                                        continue FOR1_GEN1553;
                                                    
                                    }
                                    continue FOR1;
                                                
                                } while(false);
                            /* void:  muCon([]) */final ISetWriter $setwriter23 = (ISetWriter)$RVF.setWriter();
                            ;
                            /*muExists*/$SCOMP24_GEN2075_DESC2075: 
                                do {
                                    
                                } while(false);
                            $uses_5 = ((ISet)($setwriter23.done()));
                            result_4 = ((ISet)($aset_add_aset(((ISet)result_4),((ISet)instances_8))));
                    
                        }
            
                } while(false);
            /* void:  muCon([]) */return ((ISet)result_4);
        
        } catch (ReturnFromTraversalException e) {
            return (ISet) e.getValue();
        }
    
    }
    

    public static void main(String[] args) {
      throw new RuntimeException("No function `main` found in Rascal module `lang::rascal::grammar::definition::Parameters`");
    }
}