package rascal.analysis.grammars;
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
public class $Dependency 
    extends
        org.rascalmpl.runtime.$RascalModule
    implements 
    	rascal.analysis.grammars.$Dependency_$I {

    private final $Dependency_$I $me;
    private final IList $constants;
    
    
    public final rascal.$ParseTree M_ParseTree;
    public final rascal.analysis.graphs.$Graph M_analysis_graphs_Graph;
    public final rascal.$Type M_Type;
    public final rascal.$List M_List;
    public final rascal.$Grammar M_Grammar;
    public final rascal.$Message M_Message;

    
    
    public final io.usethesource.vallang.type.Type $T1;	/*avoid()*/
    public final io.usethesource.vallang.type.Type $T3;	/*avalue()*/
    public final io.usethesource.vallang.type.Type ADT_IOCapability;	/*aadt("IOCapability",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Tree;	/*aadt("Tree",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Item;	/*aadt("Item",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_GrammarModule;	/*aadt("GrammarModule",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Associativity;	/*aadt("Associativity",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_GrammarDefinition;	/*aadt("GrammarDefinition",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Condition;	/*aadt("Condition",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TreeSearchResult_void;	/*aadt("TreeSearchResult",[avoid()],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_FileSystemChange;	/*aadt("FileSystemChange",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_CharRange;	/*aadt("CharRange",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_RuntimeException;	/*aadt("RuntimeException",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TreeSearchResult_Tree;	/*aadt("TreeSearchResult",[aadt("Tree",[],dataSyntax())],dataSyntax())*/
    public final io.usethesource.vallang.type.Type TreeSearchResult_Tree_treeFound_Tree;	/*acons(aadt("TreeSearchResult",[aadt("Tree",[],dataSyntax())],dataSyntax()),[aadt("Tree",[],dataSyntax(),alabel="tree")],[],alabel="treeFound")*/
    public final io.usethesource.vallang.type.Type $T0;	/*aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)*/
    public final io.usethesource.vallang.type.Type ADT_Exception;	/*aadt("Exception",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Symbol;	/*aadt("Symbol",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T2;	/*alist(aadt("Symbol",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type ADT_Message;	/*aadt("Message",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Grammar;	/*aadt("Grammar",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_TreeSearchResult_1;	/*aadt("TreeSearchResult",[aparameter("T",aadt("Tree",[],dataSyntax()),closed=true)],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Production;	/*aadt("Production",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_Attr;	/*aadt("Attr",[],dataSyntax())*/

    public $Dependency(RascalExecutionContext rex){
        this(rex, null);
    }
    
    public $Dependency(RascalExecutionContext rex, Object extended){
       super(rex);
       this.$me = extended == null ? this : ($Dependency_$I)extended;
       ModuleStore mstore = rex.getModuleStore();
       mstore.put(rascal.analysis.grammars.$Dependency.class, this);
       
       mstore.importModule(rascal.$ParseTree.class, rex, rascal.$ParseTree::new);
       mstore.importModule(rascal.analysis.graphs.$Graph.class, rex, rascal.analysis.graphs.$Graph::new);
       mstore.importModule(rascal.$Type.class, rex, rascal.$Type::new);
       mstore.importModule(rascal.$List.class, rex, rascal.$List::new);
       mstore.importModule(rascal.$Grammar.class, rex, rascal.$Grammar::new);
       mstore.importModule(rascal.$Message.class, rex, rascal.$Message::new); 
       
       M_ParseTree = mstore.getModule(rascal.$ParseTree.class);
       M_analysis_graphs_Graph = mstore.getModule(rascal.analysis.graphs.$Graph.class);
       M_Type = mstore.getModule(rascal.$Type.class);
       M_List = mstore.getModule(rascal.$List.class);
       M_Grammar = mstore.getModule(rascal.$Grammar.class);
       M_Message = mstore.getModule(rascal.$Message.class); 
       
                          
       
       $TS.importStore(M_ParseTree.$TS);
       $TS.importStore(M_analysis_graphs_Graph.$TS);
       $TS.importStore(M_Type.$TS);
       $TS.importStore(M_List.$TS);
       $TS.importStore(M_Grammar.$TS);
       $TS.importStore(M_Message.$TS);
       
       $constants = readBinaryConstantsFile(this.getClass(), "rascal/analysis/grammars/$Dependency.constants", 3, "2d6609f5b74a13fd7dd7606ef7eded19");
       ADT_IOCapability = $adt("IOCapability");
       ADT_Tree = $adt("Tree");
       ADT_Item = $adt("Item");
       ADT_GrammarModule = $adt("GrammarModule");
       ADT_Associativity = $adt("Associativity");
       ADT_GrammarDefinition = $adt("GrammarDefinition");
       ADT_Condition = $adt("Condition");
       ADT_FileSystemChange = $adt("FileSystemChange");
       ADT_CharRange = $adt("CharRange");
       ADT_RuntimeException = $adt("RuntimeException");
       ADT_Exception = $adt("Exception");
       ADT_Symbol = $adt("Symbol");
       ADT_Message = $adt("Message");
       ADT_Grammar = $adt("Grammar");
       ADT_Production = $adt("Production");
       ADT_Attr = $adt("Attr");
       $T1 = $TF.voidType();
       $T3 = $TF.valueType();
       ADT_TreeSearchResult_void = $parameterizedAdt("TreeSearchResult", new Type[] { $T1 });
       ADT_TreeSearchResult_Tree = $parameterizedAdt("TreeSearchResult", new Type[] { ADT_Tree });
       $T0 = $TF.parameterType("T", ADT_Tree);
       $T2 = $TF.listType(ADT_Symbol);
       ADT_TreeSearchResult_1 = $parameterizedAdt("TreeSearchResult", new Type[] { $T0 });
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
    public ISet symbolDependencies(IValue $P0){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_Grammar.ADT_GrammarDefinition)){
         $result = (ISet)symbolDependencies$b51af689c447818e((IConstructor) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type, M_Grammar.ADT_Grammar)){
         $result = (ISet)symbolDependencies$53483ac66296deef((IConstructor) $P0);
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
    public IBool equivalent(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IBool) M_Type.equivalent($P0, $P1);
    }
    public IList tail(IValue $P0){ // Generated by Resolver
       return (IList) M_List.tail($P0);
    }
    public IConstructor treeAt(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       return (IConstructor) M_ParseTree.treeAt($P0, $P1, $P2);
    }
    public IConstructor delabel(IValue $P0){ // Generated by Resolver
       IConstructor $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol)){
         $result = (IConstructor)delabel$5a9bba95ab5046a6((IConstructor) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type, M_ParseTree.ADT_Symbol)){
         $result = (IConstructor)delabel$510121567f021859((IConstructor) $P0);
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
    public IConstructor associativity(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       return (IConstructor) M_ParseTree.associativity($P0, $P1, $P2);
    }
    public IValue glb(IValue $P0, IValue $P1){ // Generated by Resolver
       return (IValue) M_Type.glb($P0, $P1);
    }

    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/analysis/grammars/Dependency.rsc|(462,406,<15,0>,<19,221>) 
    public ISet symbolDependencies$53483ac66296deef(IConstructor g_0){ 
        
        
        final ISetWriter $setwriter0 = (ISetWriter)$RVF.setWriter();
        ;
        /*muExists*/$SCOMP1: 
            do {
                $SCOMP1_DESC663:
                for(IValue $elem8 : new DescendantMatchIterator(g_0, 
                    new DescendantDescriptorAlwaysTrue($RVF.bool(false)))){
                    if($isComparable($elem8.getType(), M_ParseTree.ADT_Production)){
                       if($has_type_and_arity($elem8, M_ParseTree.Production_prod_Symbol_list_Symbol_set_Attr, 3)){
                          IValue $arg0_14 = (IValue)($subscript_int(((IValue)($elem8)),0));
                          if($isComparable($arg0_14.getType(), M_ParseTree.ADT_Symbol)){
                             if(true){
                                IConstructor s_1 = null;
                                IValue $arg1_10 = (IValue)($subscript_int(((IValue)($elem8)),1));
                                if($isComparable($arg1_10.getType(), $T2)){
                                   final IList $subject11 = ((IList)($arg1_10));
                                   int $subject11_cursor = 0;
                                   if($isSubtypeOf($subject11.getType(),$T2)){
                                      final int $subject11_len = (int)((IList)($subject11)).length();
                                      if($subject11_len >= 1){
                                         final int $__113_start = (int)$subject11_cursor;
                                         $SCOMP1_DESC663_CONS_prod_LIST_MVAR$_2:
                                         
                                         for(int $__113_len = 0; $__113_len <= $subject11_len - $__113_start - 1; $__113_len += 1){
                                            $subject11_cursor = $__113_start + $__113_len;
                                            if($subject11_cursor < $subject11_len){
                                               IConstructor elem_2 = ((IConstructor)($alist_subscript_int(((IList)($subject11)),$subject11_cursor)));
                                               $subject11_cursor += 1;
                                               final int $__112_start = (int)$subject11_cursor;
                                               final int $__112_len = (int)$subject11_len - $__112_start - 0;
                                               $subject11_cursor = $__112_start + $__112_len;
                                               /*muExists*/$SCOMP1_DESC663_CONS_prod_LIST_MVAR$_2_VARelem_MVAR$_3: 
                                                   do {
                                                       if($subject11_cursor == $subject11_len){
                                                          IValue $arg2_9 = (IValue)($subscript_int(((IValue)($elem8)),2));
                                                          if($isComparable($arg2_9.getType(), $T3)){
                                                             final IConstructor $subject_val7 = ((IConstructor)(delabel(((IConstructor)($arg0_14)))));
                                                             if(true){
                                                                IConstructor from_3 = null;
                                                                $SCOMP1_DESC734:
                                                                for(IValue $elem6 : new DescendantMatchIterator(elem_2, 
                                                                    new DescendantDescriptor(new io.usethesource.vallang.type.Type[]{$TF.listType(ADT_Symbol), M_Type.ADT_Exception, $TF.setType(ADT_Symbol), $TF.setType(ADT_Condition), M_ParseTree.ADT_Tree, M_ParseTree.ADT_TreeSearchResult_1, M_ParseTree.ADT_Condition, M_ParseTree.ADT_Production, M_ParseTree.ADT_Symbol, M_Grammar.ADT_Grammar, M_ParseTree.ADT_CharRange, M_Grammar.ADT_Item, M_Grammar.ADT_GrammarModule, $TF.listType(ADT_CharRange), M_Grammar.ADT_GrammarDefinition}, 
                                                                                             new io.usethesource.vallang.IConstructor[]{}, 
                                                                                             $RVF.bool(false)))){
                                                                    if($isComparable($elem6.getType(), M_ParseTree.ADT_Symbol)){
                                                                       if($isSubtypeOf($elem6.getType(),M_ParseTree.ADT_Symbol)){
                                                                          IConstructor $to_4 = null;
                                                                          if($is(((IConstructor)($elem6)),((IString)$constants.get(0)/*"sort"*/))){
                                                                            if($is(((IConstructor)($subject_val7)),((IString)$constants.get(0)/*"sort"*/))){
                                                                              $setwriter0.insert($RVF.tuple(((IConstructor)($subject_val7)), ((IConstructor)($elem6))));
                                                                            
                                                                            } else {
                                                                              if($is(((IConstructor)($subject_val7)),((IString)$constants.get(1)/*"lex"*/))){
                                                                                $setwriter0.insert($RVF.tuple(((IConstructor)($subject_val7)), ((IConstructor)($elem6))));
                                                                              
                                                                              } else {
                                                                                if($is(((IConstructor)($subject_val7)),((IString)$constants.get(2)/*"parameterized-sort"*/))){
                                                                                  $setwriter0.insert($RVF.tuple(((IConstructor)($subject_val7)), ((IConstructor)($elem6))));
                                                                                
                                                                                } else {
                                                                                  continue $SCOMP1_DESC734;
                                                                                }
                                                                              
                                                                              }
                                                                            
                                                                            }
                                                                          
                                                                          } else {
                                                                            if($is(((IConstructor)($elem6)),((IString)$constants.get(1)/*"lex"*/))){
                                                                              if($is(((IConstructor)($subject_val7)),((IString)$constants.get(0)/*"sort"*/))){
                                                                                $setwriter0.insert($RVF.tuple(((IConstructor)($subject_val7)), ((IConstructor)($elem6))));
                                                                              
                                                                              } else {
                                                                                if($is(((IConstructor)($subject_val7)),((IString)$constants.get(1)/*"lex"*/))){
                                                                                  $setwriter0.insert($RVF.tuple(((IConstructor)($subject_val7)), ((IConstructor)($elem6))));
                                                                                
                                                                                } else {
                                                                                  if($is(((IConstructor)($subject_val7)),((IString)$constants.get(2)/*"parameterized-sort"*/))){
                                                                                    $setwriter0.insert($RVF.tuple(((IConstructor)($subject_val7)), ((IConstructor)($elem6))));
                                                                                  
                                                                                  } else {
                                                                                    continue $SCOMP1_DESC734;
                                                                                  }
                                                                                
                                                                                }
                                                                              
                                                                              }
                                                                            
                                                                            } else {
                                                                              if($is(((IConstructor)($elem6)),((IString)$constants.get(2)/*"parameterized-sort"*/))){
                                                                                if($is(((IConstructor)($subject_val7)),((IString)$constants.get(0)/*"sort"*/))){
                                                                                  $setwriter0.insert($RVF.tuple(((IConstructor)($subject_val7)), ((IConstructor)($elem6))));
                                                                                
                                                                                } else {
                                                                                  if($is(((IConstructor)($subject_val7)),((IString)$constants.get(1)/*"lex"*/))){
                                                                                    $setwriter0.insert($RVF.tuple(((IConstructor)($subject_val7)), ((IConstructor)($elem6))));
                                                                                  
                                                                                  } else {
                                                                                    if($is(((IConstructor)($subject_val7)),((IString)$constants.get(2)/*"parameterized-sort"*/))){
                                                                                      $setwriter0.insert($RVF.tuple(((IConstructor)($subject_val7)), ((IConstructor)($elem6))));
                                                                                    
                                                                                    } else {
                                                                                      continue $SCOMP1_DESC734;
                                                                                    }
                                                                                  
                                                                                  }
                                                                                
                                                                                }
                                                                              
                                                                              } else {
                                                                                continue $SCOMP1_DESC734;
                                                                              }
                                                                            
                                                                            }
                                                                          
                                                                          }
                                                                       
                                                                       } else {
                                                                          continue $SCOMP1_DESC734;
                                                                       }
                                                                    } else {
                                                                       continue $SCOMP1_DESC734;
                                                                    }
                                                                }
                                                                continue $SCOMP1_DESC663;
                                                                             
                                                             } else {
                                                                continue $SCOMP1_DESC663;
                                                             }
                                                          } else {
                                                             continue $SCOMP1_DESC663_CONS_prod_LIST_MVAR$_2_VARelem_MVAR$_3;/*computeFail*/
                                                          }
                                                       } else {
                                                          continue $SCOMP1_DESC663_CONS_prod_LIST_MVAR$_2_VARelem_MVAR$_3;/*list match1*/
                                                       }
                                                   } while(false);
                                               continue $SCOMP1_DESC663_CONS_prod_LIST_MVAR$_2;/*computeFail*/
                                            } else {
                                               continue $SCOMP1_DESC663_CONS_prod_LIST_MVAR$_2;/*computeFail*/
                                            }
                                         }
                                         continue $SCOMP1_DESC663;
                                      
                                      } else {
                                         continue $SCOMP1_DESC663;
                                      }
                                   } else {
                                      continue $SCOMP1_DESC663;
                                   }
                                } else {
                                   continue $SCOMP1_DESC663;
                                }
                             } else {
                                continue $SCOMP1_DESC663;
                             }
                          } else {
                             continue $SCOMP1_DESC663;
                          }
                       } else {
                          continue $SCOMP1_DESC663;
                       }
                    } else {
                       continue $SCOMP1_DESC663;
                    }
                }
                
                             
            } while(false);
        return ((ISet)($setwriter0.done()));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/analysis/grammars/Dependency.rsc|(872,122,<21,0>,<22,65>) 
    public ISet symbolDependencies$b51af689c447818e(IConstructor d_0){ 
        
        
        final ISetWriter $setwriter15 = (ISetWriter)$RVF.setWriter();
        ;
        $SCOMP16_GEN977:
        for(IValue $elem17_for : ((IMap)(((IMap)($aadt_get_field(((IConstructor)d_0), "modules")))))){
            IString $elem17 = (IString) $elem17_for;
            IString m_1 = ((IString)($elem17));
            $setwriter_splice($setwriter15,$me.symbolDependencies(((IConstructor)(((IConstructor)($aadt_get_field(((IConstructor)($amap_subscript(((IMap)(((IMap)($aadt_get_field(((IConstructor)d_0), "modules"))))),((IString)m_1)))), "grammar")))))));
        
        }
        
                    return ((ISet)($setwriter15.done()));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/analysis/grammars/Dependency.rsc|(998,47,<24,0>,<24,47>) 
    public IConstructor delabel$5a9bba95ab5046a6(IConstructor $0){ 
        
        
        if($has_type_and_arity($0, M_Type.Symbol_label_str_Symbol, 2)){
           IValue $arg0_19 = (IValue)($aadt_subscript_int(((IConstructor)$0),0));
           if($isComparable($arg0_19.getType(), $T3)){
              IValue $arg1_18 = (IValue)($aadt_subscript_int(((IConstructor)$0),1));
              if($isComparable($arg1_18.getType(), M_ParseTree.ADT_Symbol)){
                 IConstructor t_0 = null;
                 return ((IConstructor)($arg1_18));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/analysis/grammars/Dependency.rsc|(1047,45,<25,0>,<25,45>) 
    public IConstructor delabel$510121567f021859(IConstructor x_0){ 
        
        
        return ((IConstructor)x_0);
    
    }
    

    public static void main(String[] args) {
      throw new RuntimeException("No function `main` found in Rascal module `analysis::grammars::Dependency`");
    }
}