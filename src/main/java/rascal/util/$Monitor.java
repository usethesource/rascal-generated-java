package rascal.util;
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
public class $Monitor 
    extends
        org.rascalmpl.runtime.$RascalModule
    implements 
    	rascal.util.$Monitor_$I {

    private final $Monitor_$I $me;
    private final IList $constants;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_jobStart$391bff73270a3797;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_jobStep$229b537fd1f96189;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_jobEnd$b02fd72c95ed074c;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_jobTodo$62d7606ec889f5ad;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_job$8d47f40ea41212c4;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_voidJob$35e4cd91c8dca54a;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_job$7c26d6f339538772;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_voidJob$665a52bc5ce8cd59;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_job$1a8a7dc548fc4ded;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_voidJob$566fc09caab4c67e;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_job$52bede2b80e6a285;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_voidJob$3586c0fb13efb709;

    
    public final rascal.$Set M_Set;
    public final rascal.$IO M_IO;
    public final rascal.$Exception M_Exception;
    public final rascal.util.$Math M_util_Math;
    public final rascal.analysis.diff.edits.$FileSystemChanges M_analysis_diff_edits_FileSystemChanges;
    public final rascal.$List M_List;

    
    final org.rascalmpl.library.util.Monitor $Monitor; // TODO: asBaseClassName will generate name collisions if there are more of the same name in different packages

    
    public final io.usethesource.vallang.type.Type $T4;	/*astr()*/
    public final io.usethesource.vallang.type.Type $T1;	/*avalue()*/
    public final io.usethesource.vallang.type.Type $T28;	/*aparameter("T",avalue(),closed=false,alabel="w")*/
    public final io.usethesource.vallang.type.Type $T26;	/*aparameter("U",avalue(),closed=true)*/
    public final io.usethesource.vallang.type.Type $T8;	/*aint(alabel="worked")*/
    public final io.usethesource.vallang.type.Type $T6;	/*avoid()*/
    public final io.usethesource.vallang.type.Type $T20;	/*aparameter("T",avalue(),closed=true)*/
    public final io.usethesource.vallang.type.Type $T17;	/*aparameter("U",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type $T2;	/*aparameter("T",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type $T14;	/*astr(alabel="message")*/
    public final io.usethesource.vallang.type.Type $T23;	/*aloc()*/
    public final io.usethesource.vallang.type.Type $T32;	/*aint(alabel="_")*/
    public final io.usethesource.vallang.type.Type $T3;	/*aset(aparameter("T",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type $T33;	/*afunc(avoid(),[aint(alabel="_")],[],alabel="_")*/
    public final io.usethesource.vallang.type.Type $T12;	/*afunc(avoid(),[],[],alabel="step")*/
    public final io.usethesource.vallang.type.Type $T19;	/*afunc(aparameter("T",avalue(),closed=true),[afunc(avoid(),[],[],alabel="step")],[])*/
    public final io.usethesource.vallang.type.Type $T24;	/*afunc(avoid(),[astr(alabel="message"),aint(alabel="worked")],[],returnsViaAllPath=false)*/
    public final io.usethesource.vallang.type.Type $T10;	/*afunc(avoid(),[],[])*/
    public final io.usethesource.vallang.type.Type ADT_RuntimeException;	/*aadt("RuntimeException",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T15;	/*afunc(avoid(),[astr(alabel="message"),aint(alabel="worked")],[],alabel="step")*/
    public final io.usethesource.vallang.type.Type $T30;	/*afunc(avoid(),[afunc(avoid(),[astr(alabel="message"),aint(alabel="worked")],[],alabel="step")],[],returnsViaAllPath=false)*/
    public final io.usethesource.vallang.type.Type $T0;	/*alist(aparameter("T",avalue(),closed=false))*/
    public final io.usethesource.vallang.type.Type $T27;	/*afunc(astr(),[aparameter("T",avalue(),closed=false,alabel="w")],[],returnsViaAllPath=true)*/
    public final io.usethesource.vallang.type.Type $T21;	/*afunc(aparameter("T",avalue(),closed=false),[afunc(avoid(),[astr(alabel="message"),aint(alabel="worked")],[],alabel="step")],[])*/
    public final io.usethesource.vallang.type.Type $T9;	/*afunc(avoid(),[aint(alabel="worked")],[],alabel="step")*/
    public final io.usethesource.vallang.type.Type $T22;	/*afunc(aparameter("T",avalue(),closed=false),[afunc(avoid(),[aint(alabel="worked")],[],alabel="step")],[])*/
    public final io.usethesource.vallang.type.Type $T5;	/*afunc(avoid(),[aparameter("T",avalue(),closed=false)],[])*/
    public final io.usethesource.vallang.type.Type $T34;	/*afunc(avoid(),[aint(alabel="worked")],[],returnsViaAllPath=false)*/
    public final io.usethesource.vallang.type.Type $T16;	/*afunc(aparameter("U",avalue(),closed=false),[aparameter("T",avalue(),closed=false)],[])*/
    public final io.usethesource.vallang.type.Type $T35;	/*afunc(avoid(),[],[],returnsViaAllPath=false)*/
    public final io.usethesource.vallang.type.Type ADT_FileSystemChange;	/*aadt("FileSystemChange",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_IOCapability;	/*aadt("IOCapability",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T7;	/*afunc(avoid(),[afunc(avoid(),[aint(alabel="worked")],[],alabel="step")],[])*/
    public final io.usethesource.vallang.type.Type $T13;	/*afunc(avoid(),[afunc(avoid(),[astr(alabel="message"),aint(alabel="worked")],[],alabel="step")],[])*/
    public final io.usethesource.vallang.type.Type $T25;	/*alist(aparameter("U",avalue(),closed=true))*/
    public final io.usethesource.vallang.type.Type $T29;	/*afunc(alist(aparameter("U",avalue(),closed=true)),[afunc(avoid(),[astr(alabel="message"),aint(alabel="worked")],[],alabel="step")],[],returnsViaAllPath=true)*/
    public final io.usethesource.vallang.type.Type $T11;	/*afunc(avoid(),[afunc(avoid(),[],[],alabel="step")],[])*/
    public final io.usethesource.vallang.type.Type $T18;	/*afunc(aparameter("T",avalue(),closed=false),[],[])*/
    public final io.usethesource.vallang.type.Type $T31;	/*afunc(avoid(),[afunc(avoid(),[aint(alabel="_")],[],alabel="_")],[])*/

    public $Monitor(RascalExecutionContext rex){
        this(rex, null);
    }
    
    public $Monitor(RascalExecutionContext rex, Object extended){
       super(rex);
       this.$me = extended == null ? this : ($Monitor_$I)extended;
       ModuleStore mstore = rex.getModuleStore();
       mstore.put(rascal.util.$Monitor.class, this);
       
       mstore.importModule(rascal.$Set.class, rex, rascal.$Set::new);
       mstore.importModule(rascal.$IO.class, rex, rascal.$IO::new);
       mstore.importModule(rascal.$Exception.class, rex, rascal.$Exception::new);
       mstore.importModule(rascal.util.$Math.class, rex, rascal.util.$Math::new);
       mstore.importModule(rascal.analysis.diff.edits.$FileSystemChanges.class, rex, rascal.analysis.diff.edits.$FileSystemChanges::new);
       mstore.importModule(rascal.$List.class, rex, rascal.$List::new); 
       
       M_Set = mstore.getModule(rascal.$Set.class);
       M_IO = mstore.getModule(rascal.$IO.class);
       M_Exception = mstore.getModule(rascal.$Exception.class);
       M_util_Math = mstore.getModule(rascal.util.$Math.class);
       M_analysis_diff_edits_FileSystemChanges = mstore.getModule(rascal.analysis.diff.edits.$FileSystemChanges.class);
       M_List = mstore.getModule(rascal.$List.class); 
       
                          
       
       $TS.importStore(M_Set.$TS);
       $TS.importStore(M_IO.$TS);
       $TS.importStore(M_Exception.$TS);
       $TS.importStore(M_util_Math.$TS);
       $TS.importStore(M_analysis_diff_edits_FileSystemChanges.$TS);
       $TS.importStore(M_List.$TS);
       
       $Monitor = $initLibrary("org.rascalmpl.library.util.Monitor"); 
    
       $constants = readBinaryConstantsFile(this.getClass(), "rascal/util/$Monitor.constants", 34, "cd7804e00b0eef1fd4990d029a00b953");
       ADT_RuntimeException = $adt("RuntimeException");
       ADT_FileSystemChange = $adt("FileSystemChange");
       ADT_IOCapability = $adt("IOCapability");
       $T4 = $TF.stringType();
       $T1 = $TF.valueType();
       $T28 = $TF.parameterType("T", $T1);
       $T26 = $TF.parameterType("U", $T1);
       $T8 = $TF.integerType();
       $T6 = $TF.voidType();
       $T20 = $TF.parameterType("T", $T1);
       $T17 = $TF.parameterType("U", $T1);
       $T2 = $TF.parameterType("T", $T1);
       $T14 = $TF.stringType();
       $T23 = $TF.sourceLocationType();
       $T32 = $TF.integerType();
       $T3 = $TF.setType($T2);
       $T33 = $TF.functionType($T6, $TF.tupleType($T32, "_"), $TF.tupleEmpty());
       $T12 = $TF.functionType($T6, $TF.tupleEmpty(), $TF.tupleEmpty());
       $T19 = $TF.functionType($T20, $TF.tupleType($T12, "step"), $TF.tupleEmpty());
       $T24 = $TF.functionType($T6, $TF.tupleType($T14, "message", $T8, "worked"), $TF.tupleEmpty());
       $T10 = $TF.functionType($T6, $TF.tupleEmpty(), $TF.tupleEmpty());
       $T15 = $TF.functionType($T6, $TF.tupleType($T14, "message", $T8, "worked"), $TF.tupleEmpty());
       $T30 = $TF.functionType($T6, $TF.tupleType($T15, "step"), $TF.tupleEmpty());
       $T0 = $TF.listType($T2);
       $T27 = $TF.functionType($T4, $TF.tupleType($T28, "w"), $TF.tupleEmpty());
       $T21 = $TF.functionType($T2, $TF.tupleType($T15, "step"), $TF.tupleEmpty());
       $T9 = $TF.functionType($T6, $TF.tupleType($T8, "worked"), $TF.tupleEmpty());
       $T22 = $TF.functionType($T2, $TF.tupleType($T9, "step"), $TF.tupleEmpty());
       $T5 = $TF.functionType($T6, $TF.tupleType($T2), $TF.tupleEmpty());
       $T34 = $TF.functionType($T6, $TF.tupleType($T8, "worked"), $TF.tupleEmpty());
       $T16 = $TF.functionType($T17, $TF.tupleType($T2), $TF.tupleEmpty());
       $T35 = $TF.functionType($T6, $TF.tupleEmpty(), $TF.tupleEmpty());
       $T7 = $TF.functionType($T6, $TF.tupleType($T9, "step"), $TF.tupleEmpty());
       $T13 = $TF.functionType($T6, $TF.tupleType($T15, "step"), $TF.tupleEmpty());
       $T25 = $TF.listType($T26);
       $T29 = $TF.functionType($T25, $TF.tupleType($T15, "step"), $TF.tupleEmpty());
       $T11 = $TF.functionType($T6, $TF.tupleType($T12, "step"), $TF.tupleEmpty());
       $T18 = $TF.functionType($T2, $TF.tupleEmpty(), $TF.tupleEmpty());
       $T31 = $TF.functionType($T6, $TF.tupleType($T33, "_"), $TF.tupleEmpty());
    
       
       $kwpDefaults_jobStart$391bff73270a3797 = Util.kwpMap("work", ((IInteger)$constants.get(0)/*1*/), "totalWork", ((IInteger)$constants.get(1)/*100*/));
       $kwpDefaults_jobStep$229b537fd1f96189 = Util.kwpMap("work", ((IInteger)$constants.get(0)/*1*/));
       $kwpDefaults_jobEnd$b02fd72c95ed074c = Util.kwpMap("success", ((IBool)$constants.get(2)/*true*/));
       $kwpDefaults_jobTodo$62d7606ec889f5ad = Util.kwpMap("work", ((IInteger)$constants.get(0)/*1*/));
       $kwpDefaults_job$8d47f40ea41212c4 = Util.kwpMap("totalWork", ((IInteger)$constants.get(1)/*100*/));
       $kwpDefaults_voidJob$35e4cd91c8dca54a = Util.kwpMap("totalWork", ((IInteger)$constants.get(1)/*100*/));
       $kwpDefaults_job$7c26d6f339538772 = Util.kwpMap("totalWork", ((IInteger)$constants.get(0)/*1*/));
       $kwpDefaults_voidJob$665a52bc5ce8cd59 = Util.kwpMap("totalWork", ((IInteger)$constants.get(0)/*1*/));
       $kwpDefaults_job$1a8a7dc548fc4ded = Util.kwpMap("totalWork", ((IInteger)$constants.get(0)/*1*/));
       $kwpDefaults_voidJob$566fc09caab4c67e = Util.kwpMap("totalWork", ((IInteger)$constants.get(0)/*1*/));
       $kwpDefaults_job$52bede2b80e6a285 = Util.kwpMap("totalWork", ((IInteger)$constants.get(0)/*1*/));
       $kwpDefaults_voidJob$3586c0fb13efb709 = Util.kwpMap("totalWork", ((IInteger)$constants.get(0)/*1*/));
    
    }
    public IValue head(IValue $P0){ // Generated by Resolver
       return (IValue) M_List.head($P0);
    }
    public IBool horseRaceTest(){ // Generated by Resolver
       IBool $result = null;
       $result = (IBool)horseRaceTest$7b7675f6d9fc5698();
       if($result != null) return $result;
       throw RuntimeExceptionFactory.callFailed($RVF.list());
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
    public IBool unfinishedLinesAtTheEndTest(){ // Generated by Resolver
       IBool $result = null;
       $result = (IBool)unfinishedLinesAtTheEndTest$addd78bcfcb11051();
       if($result != null) return $result;
       throw RuntimeExceptionFactory.callFailed($RVF.list());
    }
    public void jobTodo(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T4)){
         try { jobTodo$62d7606ec889f5ad((IString) $P0, $kwpActuals); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue max(IValue $P0){ // Generated by Resolver
       return (IValue) M_List.max($P0);
    }
    public void loopVoidJob(IValue $P0, IValue $P1, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T5)){
         try { loopVoidJob$e770bf51a3db14b6((IList) $P0, (TypedFunctionInstance1<IValue, IValue>) $P1, $kwpActuals); return; } catch (FailReturnFromVoidException e){};
       
       }
       if($isSubtypeOf($P0Type,$T3) && $isSubtypeOf($P1Type,$T5)){
         try { loopVoidJob$9e76a1e1434724f1((ISet) $P0, (TypedFunctionInstance1<IValue, IValue>) $P1, $kwpActuals); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public void jobStart(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T4)){
         try { jobStart$391bff73270a3797((IString) $P0, $kwpActuals); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IBool printLongUnfinishedLine(){ // Generated by Resolver
       IBool $result = null;
       $result = (IBool)printLongUnfinishedLine$81b393cf508ee9cd();
       if($result != null) return $result;
       throw RuntimeExceptionFactory.callFailed($RVF.list());
    }
    public void jobStep(IValue $P0, IValue $P1, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T4) && $isSubtypeOf($P1Type,$T4)){
         try { jobStep$229b537fd1f96189((IString) $P0, (IString) $P1, $kwpActuals); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public void voidJob(IValue $P0, IValue $P1, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T4) && $isSubtypeOf($P1Type,$T7)){
         try { voidJob$665a52bc5ce8cd59((IString) $P0, (TypedFunctionInstance1<IValue, IValue>) $P1, $kwpActuals); return; } catch (FailReturnFromVoidException e){};
       
       }
       if($isSubtypeOf($P0Type,$T4) && $isSubtypeOf($P1Type,$T10)){
         try { voidJob$3586c0fb13efb709((IString) $P0, (TypedFunctionInstance0<IValue>) $P1, $kwpActuals); return; } catch (FailReturnFromVoidException e){};
       
       }
       if($isSubtypeOf($P0Type,$T4) && $isSubtypeOf($P1Type,$T11)){
         try { voidJob$566fc09caab4c67e((IString) $P0, (TypedFunctionInstance1<IValue, IValue>) $P1, $kwpActuals); return; } catch (FailReturnFromVoidException e){};
       
       }
       if($isSubtypeOf($P0Type,$T4) && $isSubtypeOf($P1Type,$T13)){
         try { voidJob$35e4cd91c8dca54a((IString) $P0, (TypedFunctionInstance1<IValue, IValue>) $P1, $kwpActuals); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public void jobIsCancelled(IValue $P0){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T4)){
         try { jobIsCancelled$702bed97b6beb9fd((IString) $P0); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public void println(IValue $P0){ // Generated by Resolver
        M_IO.println($P0);
    }
    public void println(){ // Generated by Resolver
        M_IO.println();
    }
    public IList tail(IValue $P0){ // Generated by Resolver
       return (IList) M_List.tail($P0);
    }
    public ITuple headTail(IValue $P0){ // Generated by Resolver
       return (ITuple) M_List.headTail($P0);
    }
    public IBool unfinishedInputTest(){ // Generated by Resolver
       IBool $result = null;
       $result = (IBool)unfinishedInputTest$af9ffa4d1a19da59();
       if($result != null) return $result;
       throw RuntimeExceptionFactory.callFailed($RVF.list());
    }
    public IBool simpleAsyncPrintTest(){ // Generated by Resolver
       IBool $result = null;
       $result = (IBool)simpleAsyncPrintTest$b3a03e0a02d8b960();
       if($result != null) return $result;
       throw RuntimeExceptionFactory.callFailed($RVF.list());
    }
    public IList loopJob(IValue $P0, IValue $P1, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T3) && $isSubtypeOf($P1Type,$T16)){
         $result = (IList)loopJob$5380b6ab6513cb66((ISet) $P0, (TypedFunctionInstance1<IValue, IValue>) $P1, $kwpActuals);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T16)){
         $result = (IList)loopJob$0c1479f0dbb233a3((IList) $P0, (TypedFunctionInstance1<IValue, IValue>) $P1, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IValue job(IValue $P0, IValue $P1, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T4) && $isSubtypeOf($P1Type,$T18)){
         $result = (IValue)job$52bede2b80e6a285((IString) $P0, (TypedFunctionInstance0<IValue>) $P1, $kwpActuals);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T4) && $isSubtypeOf($P1Type,$T19)){
         $result = (IValue)job$1a8a7dc548fc4ded((IString) $P0, (TypedFunctionInstance1<IValue, IValue>) $P1, $kwpActuals);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T4) && $isSubtypeOf($P1Type,$T21)){
         $result = (IValue)job$8d47f40ea41212c4((IString) $P0, (TypedFunctionInstance1<IValue, IValue>) $P1, $kwpActuals);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T4) && $isSubtypeOf($P1Type,$T22)){
         $result = (IValue)job$7c26d6f339538772((IString) $P0, (TypedFunctionInstance1<IValue, IValue>) $P1, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IInteger jobEnd(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       IInteger $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T4)){
         $result = (IInteger)jobEnd$b02fd72c95ed074c((IString) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IInteger arbInt(IValue $P0){ // Generated by Resolver
       return (IInteger) M_util_Math.arbInt($P0);
    }
    public IInteger arbInt(){ // Generated by Resolver
       return (IInteger) M_util_Math.arbInt();
    }
    public void jobWarning(IValue $P0, IValue $P1){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T14) && $isSubtypeOf($P1Type,$T23)){
         try { jobWarning$6cc669a0b4b2531b((IString) $P0, (ISourceLocation) $P1); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }

    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(522,1453,<20,0>,<43,61>) 
    public void jobStart$391bff73270a3797(IString label_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_jobStart$391bff73270a3797;
    
        $Monitor.jobStart(label_0, (IInteger)($kwpActuals.containsKey("work") ? $kwpActuals.get("work") : $kwpDefaults.get("work")), (IInteger)($kwpActuals.containsKey("totalWork") ? $kwpActuals.get("totalWork") : $kwpDefaults.get("totalWork"))); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(1979,202,<45,0>,<47,56>) 
    public void jobStep$229b537fd1f96189(IString label_0, IString message_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_jobStep$229b537fd1f96189;
    
        $Monitor.jobStep(label_0, message_1, (IInteger)($kwpActuals.containsKey("work") ? $kwpActuals.get("work") : $kwpDefaults.get("work"))); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(2185,128,<49,0>,<51,46>) 
    public IInteger jobEnd$b02fd72c95ed074c(IString label_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_jobEnd$b02fd72c95ed074c;
    
        return ((IInteger)((IInteger)$Monitor.jobEnd(label_0, (IBool)($kwpActuals.containsKey("success") ? $kwpActuals.get("success") : $kwpDefaults.get("success")))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(2317,151,<53,0>,<55,41>) 
    public void jobTodo$62d7606ec889f5ad(IString label_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_jobTodo$62d7606ec889f5ad;
    
        $Monitor.jobTodo(label_0, (IInteger)($kwpActuals.containsKey("work") ? $kwpActuals.get("work") : $kwpDefaults.get("work"))); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(2472,161,<57,0>,<59,36>) 
    public void jobIsCancelled$702bed97b6beb9fd(IString label_0){ 
        
        
        $Monitor.jobIsCancelled(label_0); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(2637,169,<61,0>,<63,43>) 
    public void jobWarning$6cc669a0b4b2531b(IString message_0, ISourceLocation src_1){ 
        
        
        $Monitor.jobWarning(message_0, src_1); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(3553,85,<80,17>,<82,5>) 
    public void $CLOSURE_0(IString message_0, IInteger worked_1, ValueRef<IString> label_0){ 
        
        
        $me.jobStep(label_0.getValue(), ((IString)message_0), Util.kwpMap("work", worked_1));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(2810,1029,<65,0>,<91,1>) 
    public IValue job$8d47f40ea41212c4(IString $aux_label_0, TypedFunctionInstance1<IValue, IValue> block_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        ValueRef<IString> label_0 = new ValueRef<IString>("label_0", $aux_label_0);
    
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_job$8d47f40ea41212c4;
    
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T21.match(block_1.getType(), $typeBindings)){
           try {
                $me.jobStart(label_0.getValue(), Util.kwpMap("totalWork", ((IInteger) ($kwpActuals.containsKey("totalWork") ? $kwpActuals.get("totalWork") : $kwpDefaults.get("totalWork")))));
                final IValue $result1 = ((IValue)(((TypedFunctionInstance1<IValue, IValue>)block_1).typedCall(new TypedFunctionInstance2<IValue,IValue,IValue>(($_0, $_1) -> { $CLOSURE_0((IString)$_0, (IInteger)$_1, label_0);return null; }, $T24))));
                if($T20.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result1.getType(),$T20)){
                   return ((IValue)($result1));
                
                } else {
                   return null;
                }
           } catch (Throw $thrown0_as_exception) {
                IValue $thrown0 = $thrown0_as_exception.getException();
               
                if($isSubtypeOf($thrown0.getType(),$T4)){
                   if($thrown0.equals(((IString)$constants.get(3)/*"Never caught"*/))){
                      throw new Throw(((IString)$constants.get(3)/*"Never caught"*/));
                   } else {
                      throw $thrown0_as_exception;
                   }
                } else {
                   throw $thrown0_as_exception;
                }
            }
           finally { 
               $me.jobEnd(label_0.getValue(), Util.kwpMap());} 
                      
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(4055,85,<97,10>,<99,5>) 
    public void $CLOSURE_1(IString message_0, IInteger worked_1, ValueRef<IString> label_0){ 
        
        
        $me.jobStep(label_0.getValue(), ((IString)message_0), Util.kwpMap("work", worked_1));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(3843,498,<93,0>,<108,1>) 
    public void voidJob$35e4cd91c8dca54a(IString $aux_label_0, TypedFunctionInstance1<IValue, IValue> block_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        ValueRef<IString> label_0 = new ValueRef<IString>("label_0", $aux_label_0);
    
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_voidJob$35e4cd91c8dca54a;
    
        try {
             $me.jobStart(label_0.getValue(), Util.kwpMap("totalWork", ((IInteger) ($kwpActuals.containsKey("totalWork") ? $kwpActuals.get("totalWork") : $kwpDefaults.get("totalWork")))));
             ((TypedFunctionInstance1<IValue, IValue>)block_1).typedCall(new TypedFunctionInstance2<IValue,IValue,IValue>(($_0, $_1) -> { $CLOSURE_1((IString)$_0, (IInteger)$_1, label_0);return null; }, $T24));
        
        } catch (Throw $thrown2_as_exception) {
             IValue $thrown2 = $thrown2_as_exception.getException();
            
             if($isSubtypeOf($thrown2.getType(),$T4)){
                if($thrown2.equals(((IString)$constants.get(3)/*"Never caught"*/))){
                   throw new Throw(((IString)$constants.get(3)/*"Never caught"*/));
                } else {
                   throw $thrown2_as_exception;
                }
             } else {
                throw $thrown2_as_exception;
             }
         }
        finally { 
            $me.jobEnd(label_0.getValue(), Util.kwpMap());} 
                   return;
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(4537,27,<111,86>,<111,113>) 
    public IString $CLOSURE_2(IValue w_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T2.match(w_0.getType(), $typeBindings)){
           final Template $template3 = (Template)new Template($RVF, "");
           $template3.addVal(w_0);
           final IString $result4 = ((IString)($template3.close()));
           if($T4.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result4.getType(),$T4)){
              return ((IString)($result4));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(4589,150,<112,20>,<117,3>) 
    public IList $CLOSURE_3(TypedFunctionInstance2<IValue, IValue, IValue> step_0, ValueRef<TypedFunctionInstance1<IValue, IValue>> consumer_1, ValueRef<IList> work_0, ValueRef<TypedFunctionInstance1<IValue, IValue>> stepLabel){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if(true){
           final IListWriter listwriter_FOR2 = (IListWriter)$RVF.listWriter();
           /*muExists*/FOR2: 
               do {
                   FOR2_GEN4655:
                   for(IValue $elem5_for : work_0.getValue()){
                       IValue $elem5 = (IValue) $elem5_for;
                       ((TypedFunctionInstance2<IValue, IValue, IValue>)step_0).typedCall(((IString)(((TypedFunctionInstance1<IValue, IValue>)((TypedFunctionInstance1<IValue, IValue>) stepLabel.getValue())).typedCall(((IValue)w_3)))), ((IInteger)$constants.get(0)/*1*/));
                       listwriter_FOR2.append(((TypedFunctionInstance1<IValue, IValue>)consumer_1.getValue()).typedCall(((IValue)w_3)));
                   
                   }
                   continue FOR2;
                               
               } while(false);
           final IList $result6 = ((IList)(listwriter_FOR2.done()));
           if($T25.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result6.getType(),$T25)){
              return ((IList)($result6));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(4345,421,<110,0>,<118,1>) 
    public IList loopJob$0c1479f0dbb233a3(IList $aux_work_0, TypedFunctionInstance1<IValue, IValue> $aux_consumer_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        ValueRef<IList> work_0 = new ValueRef<IList>("work_0", $aux_work_0);
        ValueRef<TypedFunctionInstance1<IValue, IValue>> consumer_1 = new ValueRef<TypedFunctionInstance1<IValue, IValue>>("consumer_1", $aux_consumer_1);
    
        java.util.Map<java.lang.String,IValue> $kwpDefaults = Util.kwpMap();
        IString $kwpDefault_label = ((IString)$constants.get(4)/*""*/);
        $kwpDefaults.put("label", $kwpDefault_label);TypedFunctionInstance1<IValue, IValue> $kwpDefault_stepLabel = new TypedFunctionInstance1<IValue,IValue>(($_0) -> { return $CLOSURE_2((IValue)$_0); }, $T27);
        $kwpDefaults.put("stepLabel", $kwpDefault_stepLabel);
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(work_0.getValue().getType(), $typeBindings)){
           if($T16.match(consumer_1.getValue().getType(), $typeBindings)){
              final IList $result7 = ((IList)($me.job(((IString)(((IString) ($kwpActuals.containsKey("label") ? $kwpActuals.get("label") : $kwpDefaults.get("label"))))), new TypedFunctionInstance1<IValue,IValue>(($_0) -> { return $CLOSURE_3((TypedFunctionInstance2<IValue, IValue, IValue>)$_0, consumer_1, work_0, new ValueRef<TypedFunctionInstance1<IValue, IValue>>("stepLabel", ((TypedFunctionInstance1<IValue, IValue>) ($kwpActuals.containsKey("stepLabel") ? $kwpActuals.get("stepLabel") : $kwpDefaults.get("stepLabel"))))); }, $T29), Util.kwpMap("totalWork", M_List.size(work_0.getValue())))));
              if($T25.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result7.getType(),$T25)){
                 return ((IList)($result7));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(4961,27,<121,88>,<121,115>) 
    public IString $CLOSURE_4(IValue w_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T28.match(w_0.getType(), $typeBindings)){
           final Template $template8 = (Template)new Template($RVF, "");
           $template8.addVal(w_0);
           final IString $result9 = ((IString)($template8.close()));
           if($T4.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result9.getType(),$T4)){
              return ((IString)($result9));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(5010,132,<122,17>,<127,3>) 
    public void $CLOSURE_5(TypedFunctionInstance2<IValue, IValue, IValue> step_0, ValueRef<TypedFunctionInstance1<IValue, IValue>> consumer_1, ValueRef<IList> work_0, ValueRef<TypedFunctionInstance1<IValue, IValue>> stepLabel){ 
        
        
        /*muExists*/FOR3: 
            do {
                FOR3_GEN5065:
                for(IValue $elem10_for : work_0.getValue()){
                    IValue $elem10 = (IValue) $elem10_for;
                    IValue w_3 = null;
                    ((TypedFunctionInstance2<IValue, IValue, IValue>)step_0).typedCall(((IString)(((TypedFunctionInstance1<IValue, IValue>)((TypedFunctionInstance1<IValue, IValue>) stepLabel.getValue())).typedCall(((IValue)($elem10))))), ((IInteger)$constants.get(0)/*1*/));
                    ((TypedFunctionInstance1<IValue, IValue>)consumer_1.getValue()).typedCall(((IValue)($elem10)));
                
                }
                continue FOR3;
                            
            } while(false);
        /* void:  muCon([]) */
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(4770,399,<120,0>,<128,1>) 
    public void loopVoidJob$e770bf51a3db14b6(IList $aux_work_0, TypedFunctionInstance1<IValue, IValue> $aux_consumer_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        ValueRef<IList> work_0 = new ValueRef<IList>("work_0", $aux_work_0);
        ValueRef<TypedFunctionInstance1<IValue, IValue>> consumer_1 = new ValueRef<TypedFunctionInstance1<IValue, IValue>>("consumer_1", $aux_consumer_1);
    
        java.util.Map<java.lang.String,IValue> $kwpDefaults = Util.kwpMap();
        IString $kwpDefault_label = ((IString)$constants.get(4)/*""*/);
        $kwpDefaults.put("label", $kwpDefault_label);TypedFunctionInstance1<IValue, IValue> $kwpDefault_stepLabel = new TypedFunctionInstance1<IValue,IValue>(($_0) -> { return $CLOSURE_4((IValue)$_0); }, $T27);
        $kwpDefaults.put("stepLabel", $kwpDefault_stepLabel);
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T0.match(work_0.getValue().getType(), $typeBindings)){
           if($T5.match(consumer_1.getValue().getType(), $typeBindings)){
              $me.voidJob(((IString)(((IString) ($kwpActuals.containsKey("label") ? $kwpActuals.get("label") : $kwpDefaults.get("label"))))), new TypedFunctionInstance1<IValue,IValue>(($_0) -> { $CLOSURE_5((TypedFunctionInstance2<IValue, IValue, IValue>)$_0, consumer_1, work_0, new ValueRef<TypedFunctionInstance1<IValue, IValue>>("stepLabel", ((TypedFunctionInstance1<IValue, IValue>) ($kwpActuals.containsKey("stepLabel") ? $kwpActuals.get("stepLabel") : $kwpDefaults.get("stepLabel")))));return null; }, $T30), Util.kwpMap("totalWork", M_List.size(work_0.getValue())));
              return;
           
           } else {
              throw $failReturnFromVoidException;
           }
        } else {
           throw $failReturnFromVoidException;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(5364,27,<131,85>,<131,112>) 
    public IString $CLOSURE_6(IValue w_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T28.match(w_0.getType(), $typeBindings)){
           final Template $template11 = (Template)new Template($RVF, "");
           $template11.addVal(w_0);
           final IString $result12 = ((IString)($template11.close()));
           if($T4.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result12.getType(),$T4)){
              return ((IString)($result12));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(5416,150,<132,20>,<137,3>) 
    public IList $CLOSURE_7(TypedFunctionInstance2<IValue, IValue, IValue> step_0, ValueRef<TypedFunctionInstance1<IValue, IValue>> consumer_1, ValueRef<ISet> work_0, ValueRef<TypedFunctionInstance1<IValue, IValue>> stepLabel){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if(true){
           final IListWriter listwriter_FOR4 = (IListWriter)$RVF.listWriter();
           /*muExists*/FOR4: 
               do {
                   FOR4_GEN5482:
                   for(IValue $elem13_for : work_0.getValue()){
                       IValue $elem13 = (IValue) $elem13_for;
                       ((TypedFunctionInstance2<IValue, IValue, IValue>)step_0).typedCall(((IString)(((TypedFunctionInstance1<IValue, IValue>)((TypedFunctionInstance1<IValue, IValue>) stepLabel.getValue())).typedCall(((IValue)w_1)))), ((IInteger)$constants.get(0)/*1*/));
                       listwriter_FOR4.append(((TypedFunctionInstance1<IValue, IValue>)consumer_1.getValue()).typedCall(((IValue)w_1)));
                   
                   }
                   continue FOR4;
                               
               } while(false);
           final IList $result14 = ((IList)(listwriter_FOR4.done()));
           if($T25.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result14.getType(),$T25)){
              return ((IList)($result14));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(5173,420,<130,0>,<138,1>) 
    public IList loopJob$5380b6ab6513cb66(ISet $aux_work_0, TypedFunctionInstance1<IValue, IValue> $aux_consumer_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        ValueRef<ISet> work_0 = new ValueRef<ISet>("work_0", $aux_work_0);
        ValueRef<TypedFunctionInstance1<IValue, IValue>> consumer_1 = new ValueRef<TypedFunctionInstance1<IValue, IValue>>("consumer_1", $aux_consumer_1);
    
        java.util.Map<java.lang.String,IValue> $kwpDefaults = Util.kwpMap();
        IString $kwpDefault_label = ((IString)$constants.get(4)/*""*/);
        $kwpDefaults.put("label", $kwpDefault_label);TypedFunctionInstance1<IValue, IValue> $kwpDefault_stepLabel = new TypedFunctionInstance1<IValue,IValue>(($_0) -> { return $CLOSURE_6((IValue)$_0); }, $T27);
        $kwpDefaults.put("stepLabel", $kwpDefault_stepLabel);
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T3.match(work_0.getValue().getType(), $typeBindings)){
           if($T16.match(consumer_1.getValue().getType(), $typeBindings)){
              final IList $result15 = ((IList)($me.job(((IString)(((IString) ($kwpActuals.containsKey("label") ? $kwpActuals.get("label") : $kwpDefaults.get("label"))))), new TypedFunctionInstance1<IValue,IValue>(($_0) -> { return $CLOSURE_7((TypedFunctionInstance2<IValue, IValue, IValue>)$_0, consumer_1, work_0, new ValueRef<TypedFunctionInstance1<IValue, IValue>>("stepLabel", ((TypedFunctionInstance1<IValue, IValue>) ($kwpActuals.containsKey("stepLabel") ? $kwpActuals.get("stepLabel") : $kwpDefaults.get("stepLabel"))))); }, $T29), Util.kwpMap("totalWork", M_Set.size(work_0.getValue())))));
              if($T25.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result15.getType(),$T25)){
                 return ((IList)($result15));
              
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
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(5787,27,<141,87>,<141,114>) 
    public IString $CLOSURE_8(IValue w_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T28.match(w_0.getType(), $typeBindings)){
           final Template $template16 = (Template)new Template($RVF, "");
           $template16.addVal(w_0);
           final IString $result17 = ((IString)($template16.close()));
           if($T4.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result17.getType(),$T4)){
              return ((IString)($result17));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(5836,132,<142,17>,<147,3>) 
    public void $CLOSURE_9(TypedFunctionInstance2<IValue, IValue, IValue> step_0, ValueRef<TypedFunctionInstance1<IValue, IValue>> consumer_1, ValueRef<ISet> work_0, ValueRef<TypedFunctionInstance1<IValue, IValue>> stepLabel){ 
        
        
        /*muExists*/FOR5: 
            do {
                FOR5_GEN5891:
                for(IValue $elem18_for : work_0.getValue()){
                    IValue $elem18 = (IValue) $elem18_for;
                    IValue w_1 = null;
                    ((TypedFunctionInstance2<IValue, IValue, IValue>)step_0).typedCall(((IString)(((TypedFunctionInstance1<IValue, IValue>)((TypedFunctionInstance1<IValue, IValue>) stepLabel.getValue())).typedCall(((IValue)($elem18))))), ((IInteger)$constants.get(0)/*1*/));
                    ((TypedFunctionInstance1<IValue, IValue>)consumer_1.getValue()).typedCall(((IValue)($elem18)));
                
                }
                continue FOR5;
                            
            } while(false);
        /* void:  muCon([]) */
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(5597,398,<140,0>,<148,1>) 
    public void loopVoidJob$9e76a1e1434724f1(ISet $aux_work_0, TypedFunctionInstance1<IValue, IValue> $aux_consumer_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        ValueRef<ISet> work_0 = new ValueRef<ISet>("work_0", $aux_work_0);
        ValueRef<TypedFunctionInstance1<IValue, IValue>> consumer_1 = new ValueRef<TypedFunctionInstance1<IValue, IValue>>("consumer_1", $aux_consumer_1);
    
        java.util.Map<java.lang.String,IValue> $kwpDefaults = Util.kwpMap();
        IString $kwpDefault_label = ((IString)$constants.get(4)/*""*/);
        $kwpDefaults.put("label", $kwpDefault_label);TypedFunctionInstance1<IValue, IValue> $kwpDefault_stepLabel = new TypedFunctionInstance1<IValue,IValue>(($_0) -> { return $CLOSURE_8((IValue)$_0); }, $T27);
        $kwpDefaults.put("stepLabel", $kwpDefault_stepLabel);
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T3.match(work_0.getValue().getType(), $typeBindings)){
           if($T5.match(consumer_1.getValue().getType(), $typeBindings)){
              $me.voidJob(((IString)(((IString) ($kwpActuals.containsKey("label") ? $kwpActuals.get("label") : $kwpDefaults.get("label"))))), new TypedFunctionInstance1<IValue,IValue>(($_0) -> { $CLOSURE_9((TypedFunctionInstance2<IValue, IValue, IValue>)$_0, consumer_1, work_0, new ValueRef<TypedFunctionInstance1<IValue, IValue>>("stepLabel", ((TypedFunctionInstance1<IValue, IValue>) ($kwpActuals.containsKey("stepLabel") ? $kwpActuals.get("stepLabel") : $kwpDefaults.get("stepLabel")))));return null; }, $T30), Util.kwpMap("totalWork", M_Set.size(work_0.getValue())));
              return;
           
           } else {
              throw $failReturnFromVoidException;
           }
        } else {
           throw $failReturnFromVoidException;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(6914,70,<169,17>,<171,5>) 
    public void $CLOSURE_10(IInteger worked_0, ValueRef<IString> label_0){ 
        
        
        $me.jobStep(label_0.getValue(), label_0.getValue(), Util.kwpMap("work", worked_0));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(5999,1186,<150,0>,<180,1>) 
    public IValue job$7c26d6f339538772(IString $aux_label_0, TypedFunctionInstance1<IValue, IValue> block_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        ValueRef<IString> label_0 = new ValueRef<IString>("label_0", $aux_label_0);
    
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_job$7c26d6f339538772;
    
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T22.match(block_1.getType(), $typeBindings)){
           if($isSubtypeOf(block_1.getType(),$T31.instantiate($typeBindings))){
              throw new Throw($RVF.constructor(M_Exception.RuntimeException_IllegalArgument_value_str, new IValue[]{((IValue)block_1), ((IString)$constants.get(5)/*"`block` argument can not be used by job because it returns `void` and `job` must return something."*/)}));
           }
           try {
                $me.jobStart(label_0.getValue(), Util.kwpMap("totalWork", ((IInteger) ($kwpActuals.containsKey("totalWork") ? $kwpActuals.get("totalWork") : $kwpDefaults.get("totalWork")))));
                final IValue $result20 = ((IValue)(((TypedFunctionInstance1<IValue, IValue>)block_1).typedCall(new TypedFunctionInstance1<IValue,IValue>(($_0) -> { $CLOSURE_10((IInteger)$_0, label_0);return null; }, $T34))));
                if($T20.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result20.getType(),$T20)){
                   return ((IValue)($result20));
                
                } else {
                   return null;
                }
           } catch (Throw $thrown19_as_exception) {
                IValue $thrown19 = $thrown19_as_exception.getException();
               
                if($isSubtypeOf($thrown19.getType(),$T4)){
                   if($thrown19.equals(((IString)$constants.get(3)/*"Never caught"*/))){
                      throw new Throw(((IString)$constants.get(3)/*"Never caught"*/));
                   } else {
                      throw $thrown19_as_exception;
                   }
                } else {
                   throw $thrown19_as_exception;
                }
            }
           finally { 
               $me.jobEnd(label_0.getValue(), Util.kwpMap());} 
                      
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(7386,70,<186,10>,<188,5>) 
    public void $CLOSURE_11(IInteger worked_0, ValueRef<IString> label_0){ 
        
        
        $me.jobStep(label_0.getValue(), label_0.getValue(), Util.kwpMap("work", worked_0));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(7189,468,<182,0>,<197,1>) 
    public void voidJob$665a52bc5ce8cd59(IString $aux_label_0, TypedFunctionInstance1<IValue, IValue> block_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        ValueRef<IString> label_0 = new ValueRef<IString>("label_0", $aux_label_0);
    
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_voidJob$665a52bc5ce8cd59;
    
        try {
             $me.jobStart(label_0.getValue(), Util.kwpMap("totalWork", ((IInteger) ($kwpActuals.containsKey("totalWork") ? $kwpActuals.get("totalWork") : $kwpDefaults.get("totalWork")))));
             ((TypedFunctionInstance1<IValue, IValue>)block_1).typedCall(new TypedFunctionInstance1<IValue,IValue>(($_0) -> { $CLOSURE_11((IInteger)$_0, label_0);return null; }, $T34));
        
        } catch (Throw $thrown21_as_exception) {
             IValue $thrown21 = $thrown21_as_exception.getException();
            
             if($isSubtypeOf($thrown21.getType(),$T4)){
                if($thrown21.equals(((IString)$constants.get(3)/*"Never caught"*/))){
                   throw new Throw(((IString)$constants.get(3)/*"Never caught"*/));
                } else {
                   throw $thrown21_as_exception;
                }
             } else {
                throw $thrown21_as_exception;
             }
         }
        finally { 
            $me.jobEnd(label_0.getValue(), Util.kwpMap());} 
                   return;
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(8369,54,<215,17>,<217,5>) 
    public void $CLOSURE_12(ValueRef<IString> label_0){ 
        
        
        $me.jobStep(label_0.getValue(), label_0.getValue(), Util.kwpMap("work", ((IInteger)$constants.get(0)/*1*/)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(7663,961,<200,0>,<226,1>) 
    public IValue job$1a8a7dc548fc4ded(IString $aux_label_0, TypedFunctionInstance1<IValue, IValue> block_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        ValueRef<IString> label_0 = new ValueRef<IString>("label_0", $aux_label_0);
    
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_job$1a8a7dc548fc4ded;
    
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T19.match(block_1.getType(), $typeBindings)){
           try {
                $me.jobStart(label_0.getValue(), Util.kwpMap("totalWork", ((IInteger) ($kwpActuals.containsKey("totalWork") ? $kwpActuals.get("totalWork") : $kwpDefaults.get("totalWork")))));
                final IValue $result23 = ((IValue)(((TypedFunctionInstance1<IValue, IValue>)block_1).typedCall(new TypedFunctionInstance0<IValue>(() -> { $CLOSURE_12(label_0);return null; }, $T35))));
                if($T20.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result23.getType(),$T20)){
                   return ((IValue)($result23));
                
                } else {
                   return null;
                }
           } catch (Throw $thrown22_as_exception) {
                IValue $thrown22 = $thrown22_as_exception.getException();
               
                if($isSubtypeOf($thrown22.getType(),$T4)){
                   if($thrown22.equals(((IString)$constants.get(3)/*"Never caught"*/))){
                      throw new Throw(((IString)$constants.get(3)/*"Never caught"*/));
                   } else {
                      throw $thrown22_as_exception;
                   }
                } else {
                   throw $thrown22_as_exception;
                }
            }
           finally { 
               $me.jobEnd(label_0.getValue(), Util.kwpMap());} 
                      
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(8815,54,<232,10>,<234,5>) 
    public void $CLOSURE_13(ValueRef<IString> label_0){ 
        
        
        $me.jobStep(label_0.getValue(), label_0.getValue(), Util.kwpMap("work", ((IInteger)$constants.get(0)/*1*/)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(8628,442,<228,0>,<243,1>) 
    public void voidJob$566fc09caab4c67e(IString $aux_label_0, TypedFunctionInstance1<IValue, IValue> block_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        ValueRef<IString> label_0 = new ValueRef<IString>("label_0", $aux_label_0);
    
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_voidJob$566fc09caab4c67e;
    
        try {
             $me.jobStart(label_0.getValue(), Util.kwpMap("totalWork", ((IInteger) ($kwpActuals.containsKey("totalWork") ? $kwpActuals.get("totalWork") : $kwpDefaults.get("totalWork")))));
             ((TypedFunctionInstance1<IValue, IValue>)block_1).typedCall(new TypedFunctionInstance0<IValue>(() -> { $CLOSURE_13(label_0);return null; }, $T35));
        
        } catch (Throw $thrown24_as_exception) {
             IValue $thrown24 = $thrown24_as_exception.getException();
            
             if($isSubtypeOf($thrown24.getType(),$T4)){
                if($thrown24.equals(((IString)$constants.get(3)/*"Never caught"*/))){
                   throw new Throw(((IString)$constants.get(3)/*"Never caught"*/));
                } else {
                   throw $thrown24_as_exception;
                }
             } else {
                throw $thrown24_as_exception;
             }
         }
        finally { 
            $me.jobEnd(label_0.getValue(), Util.kwpMap());} 
                   return;
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(9076,593,<246,0>,<263,1>) 
    public IValue job$52bede2b80e6a285(IString label_0, TypedFunctionInstance0<IValue> block_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_job$52bede2b80e6a285;
    
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T18.match(block_1.getType(), $typeBindings)){
           try {
                $me.jobStart(((IString)label_0), Util.kwpMap("totalWork", ((IInteger) ($kwpActuals.containsKey("totalWork") ? $kwpActuals.get("totalWork") : $kwpDefaults.get("totalWork")))));
                final IValue $result26 = ((IValue)(((TypedFunctionInstance0<IValue>)block_1).typedCall()));
                if($T20.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result26.getType(),$T20)){
                   return ((IValue)($result26));
                
                } else {
                   return null;
                }
           } catch (Throw $thrown25_as_exception) {
                IValue $thrown25 = $thrown25_as_exception.getException();
               
                if($isSubtypeOf($thrown25.getType(),$T4)){
                   if($thrown25.equals(((IString)$constants.get(3)/*"Never caught"*/))){
                      throw new Throw(((IString)$constants.get(3)/*"Never caught"*/));
                   } else {
                      throw $thrown25_as_exception;
                   }
                } else {
                   throw $thrown25_as_exception;
                }
            }
           finally { 
               $me.jobEnd(((IString)label_0), Util.kwpMap());} 
                      
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(9673,376,<265,0>,<278,1>) 
    public void voidJob$3586c0fb13efb709(IString label_0, TypedFunctionInstance0<IValue> block_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_voidJob$3586c0fb13efb709;
    
        try {
             $me.jobStart(((IString)label_0), Util.kwpMap("totalWork", ((IInteger) ($kwpActuals.containsKey("totalWork") ? $kwpActuals.get("totalWork") : $kwpDefaults.get("totalWork")))));
             ((TypedFunctionInstance0<IValue>)block_1).typedCall();
        
        } catch (Throw $thrown27_as_exception) {
             IValue $thrown27 = $thrown27_as_exception.getException();
            
             if($isSubtypeOf($thrown27.getType(),$T4)){
                if($thrown27.equals(((IString)$constants.get(3)/*"Never caught"*/))){
                   throw new Throw(((IString)$constants.get(3)/*"Never caught"*/));
                } else {
                   throw $thrown27_as_exception;
                }
             } else {
                throw $thrown27_as_exception;
             }
         }
        finally { 
            $me.jobEnd(((IString)label_0), Util.kwpMap());} 
                   return;
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(10053,852,<280,0>,<308,1>) 
    public IBool horseRaceTest$7b7675f6d9fc5698(){ 
        
        
        IInteger distance_0 = ((IInteger)$constants.get(6)/*3000000*/);
        IInteger stride_1 = ((IInteger)$constants.get(7)/*50*/);
        IInteger horses_2 = ((IInteger)$constants.get(8)/*5*/);
        final IListWriter $listwriter28 = (IListWriter)$RVF.listWriter();
        final IInteger $lst2 = ((IInteger)horses_2);
        final boolean $dir3 = ((IInteger)$constants.get(9)/*0*/).less($lst2).getValue();
        
        $LCOMP29_GEN10270:
        for(IInteger $elem30 = ((IInteger)$constants.get(9)/*0*/); $dir3 ? $aint_less_aint($elem30,$lst2).getValue() 
                                  : $aint_lessequal_aint($elem30,$lst2).not().getValue(); $elem30 = $aint_add_aint($elem30,$dir3 ? ((IInteger)$constants.get(0)/*1*/) : ((IInteger)$constants.get(10)/*-1*/))){
            $listwriter28.append(M_util_Math.arbInt(((IInteger)($aint_divide_aint(((IInteger)($aint_product_aint(((IInteger)stride_1),((IInteger)$constants.get(11)/*15*/)))),((IInteger)$constants.get(1)/*100*/))))));
        }
        
        IList handicaps_3 = ((IList)($listwriter28.done()));
        final IListWriter $listwriter31 = (IListWriter)$RVF.listWriter();
        final IInteger $lst7 = ((IInteger)horses_2);
        final boolean $dir8 = ((IInteger)$constants.get(9)/*0*/).less($lst7).getValue();
        
        $LCOMP32_GEN10349:
        for(IInteger $elem34 = ((IInteger)$constants.get(9)/*0*/); $dir8 ? $aint_less_aint($elem34,$lst7).getValue() 
                                  : $aint_lessequal_aint($elem34,$lst7).not().getValue(); $elem34 = $aint_add_aint($elem34,$dir8 ? ((IInteger)$constants.get(0)/*1*/) : ((IInteger)$constants.get(10)/*-1*/))){
            IInteger h_5 = null;
            final Template $template33 = (Template)new Template($RVF, "Horse ");
            $template33.beginIndent("      ");
            $template33.addVal($elem34);
            $template33.endIndent("      ");
            $template33.addStr(" (handicap is ");
            $template33.beginIndent("              ");
            $template33.addVal($alist_subscript_int(((IList)handicaps_3),((IInteger)($elem34)).intValue()));
            $template33.endIndent("              ");
            $template33.addStr(")");
            $listwriter31.append($template33.close());
        }
        
        IList labels_4 = ((IList)($listwriter31.done()));
        final IListWriter $listwriter35 = (IListWriter)$RVF.listWriter();
        final IInteger $lst12 = ((IInteger)horses_2);
        final boolean $dir13 = ((IInteger)$constants.get(9)/*0*/).less($lst12).getValue();
        
        $LCOMP36_GEN10416:
        for(IInteger $elem37 = ((IInteger)$constants.get(9)/*0*/); $dir13 ? $aint_less_aint($elem37,$lst12).getValue() 
                                  : $aint_lessequal_aint($elem37,$lst12).not().getValue(); $elem37 = $aint_add_aint($elem37,$dir13 ? ((IInteger)$constants.get(0)/*1*/) : ((IInteger)$constants.get(10)/*-1*/))){
            $listwriter35.append(((IInteger)$constants.get(9)/*0*/));
        }
        
        IList progress_6 = ((IList)($listwriter35.done()));
        /*muExists*/FOR13: 
            do {
                final IInteger $lst17 = ((IInteger)horses_2);
                final boolean $dir18 = ((IInteger)$constants.get(9)/*0*/).less($lst17).getValue();
                
                FOR13_GEN10446:
                for(IInteger $elem38 = ((IInteger)$constants.get(9)/*0*/); $dir18 ? $aint_less_aint($elem38,$lst17).getValue() 
                                          : $aint_lessequal_aint($elem38,$lst17).not().getValue(); $elem38 = $aint_add_aint($elem38,$dir18 ? ((IInteger)$constants.get(0)/*1*/) : ((IInteger)$constants.get(10)/*-1*/))){
                    IInteger h_7 = ((IInteger)($elem38));
                    $me.jobStart(((IString)($alist_subscript_int(((IList)labels_4),((IInteger)h_7).intValue()))), Util.kwpMap("totalWork", distance_0));
                }
                continue FOR13;
        
            } while(false);
        /* void:  muCon([]) *//*muExists*/race_BT: 
            do {
                race:
                    while(true){
                        /*muExists*/FOR14: 
                            do {
                                final IInteger $lst22 = ((IInteger)horses_2);
                                final boolean $dir23 = ((IInteger)$constants.get(9)/*0*/).less($lst22).getValue();
                                
                                FOR14_GEN10548:
                                for(IInteger $elem40 = ((IInteger)$constants.get(9)/*0*/); $dir23 ? $aint_less_aint($elem40,$lst22).getValue() 
                                                          : $aint_lessequal_aint($elem40,$lst22).not().getValue(); $elem40 = $aint_add_aint($elem40,$dir23 ? ((IInteger)$constants.get(0)/*1*/) : ((IInteger)$constants.get(10)/*-1*/))){
                                    IInteger h_8 = ((IInteger)($elem40));
                                    IInteger advance_9 = ((IInteger)(M_util_Math.arbInt(((IInteger)(((IInteger) ((IInteger)stride_1).subtract(((IInteger)($alist_subscript_int(((IList)handicaps_3),((IInteger)h_8).intValue()))))))))));
                                    progress_6 = ((IList)($alist_update(((IInteger)h_8).intValue(),$aint_add_aint(((IInteger)($alist_subscript_int(((IList)progress_6),((IInteger)h_8).intValue()))),((IInteger)advance_9)),((IList)(progress_6)))));
                                    final Template $template39 = (Template)new Template($RVF, "Pacing horse ");
                                    $template39.beginIndent("             ");
                                    $template39.addVal(h_8);
                                    $template39.endIndent("             ");
                                    $template39.addStr(" with ");
                                    $template39.beginIndent("      ");
                                    $template39.addVal(advance_9);
                                    $template39.endIndent("      ");
                                    $template39.addStr("...");
                                    $me.jobStep(((IString)($alist_subscript_int(((IList)labels_4),((IInteger)h_8).intValue()))), ((IString)($template39.close())), Util.kwpMap("work", advance_9));
                                    if((((IBool)($aint_less_aint(((IInteger)($alist_subscript_int(((IList)progress_6),((IInteger)h_8).intValue()))),((IInteger)distance_0)).not()))).getValue()){
                                       break race; // muBreak
                                    
                                    }
                                }
                                continue FOR14;
                        
                            } while(false);
                        /* void:  muCon([]) */
                    }
        
            } while(false);
        /* void:  muCon([]) *//*muExists*/FOR16: 
            do {
                final IInteger $lst27 = ((IInteger)horses_2);
                final boolean $dir28 = ((IInteger)$constants.get(9)/*0*/).less($lst27).getValue();
                
                FOR16_GEN10838:
                for(IInteger $elem41 = ((IInteger)$constants.get(9)/*0*/); $dir28 ? $aint_less_aint($elem41,$lst27).getValue() 
                                          : $aint_lessequal_aint($elem41,$lst27).not().getValue(); $elem41 = $aint_add_aint($elem41,$dir28 ? ((IInteger)$constants.get(0)/*1*/) : ((IInteger)$constants.get(10)/*-1*/))){
                    IInteger h_10 = ((IInteger)($elem41));
                    $me.jobEnd(((IString)($alist_subscript_int(((IList)labels_4),((IInteger)h_10).intValue()))), Util.kwpMap());
                }
                continue FOR16;
        
            } while(false);
        /* void:  muCon([]) */return ((IBool)$constants.get(2)/*true*/);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(10909,283,<310,0>,<321,1>) 
    public IBool simpleAsyncPrintTest$b3a03e0a02d8b960(){ 
        
        
        $me.jobStart(((IString)$constants.get(12)/*"job"*/), Util.kwpMap("totalWork", ((IInteger)$constants.get(13)/*3*/)));
        M_IO.println(((IString)$constants.get(14)/*"a"*/));
        $me.jobStep(((IString)$constants.get(12)/*"job"*/), ((IString)$constants.get(15)/*"step 1"*/), Util.kwpMap("work", ((IInteger)$constants.get(0)/*1*/)));
        M_IO.println(((IString)$constants.get(16)/*"b"*/));
        $me.jobStep(((IString)$constants.get(12)/*"job"*/), ((IString)$constants.get(17)/*"step 2"*/), Util.kwpMap("work", ((IInteger)$constants.get(0)/*1*/)));
        M_IO.println(((IString)$constants.get(18)/*"c"*/));
        $me.jobStep(((IString)$constants.get(12)/*"job"*/), ((IString)$constants.get(19)/*"step 3"*/), Util.kwpMap("work", ((IInteger)$constants.get(0)/*1*/)));
        M_IO.println(((IString)$constants.get(20)/*"d"*/));
        $me.jobEnd(((IString)$constants.get(12)/*"job"*/), Util.kwpMap());
        return ((IBool)$constants.get(2)/*true*/);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(11196,331,<323,0>,<335,1>) 
    public IBool unfinishedInputTest$af9ffa4d1a19da59(){ 
        
        
        $me.jobStart(((IString)$constants.get(12)/*"job"*/), Util.kwpMap("totalWork", ((IInteger)$constants.get(21)/*26*/)));
        /*muExists*/FOR17: 
            do {
                final IString $subject_val43 = ((IString)$constants.get(22)/*"abcdefghijklmnopqrstuwvxyz"*/);
                final Matcher $matcher44 = (Matcher)$regExpCompile("([a-z])", ((IString)($subject_val43)).getValue());
                boolean $found45 = true;
                
                    while($found45){
                        $found45 = $matcher44.find();
                        if($found45){
                           IString l_0 = ((IString)($RVF.string($matcher44.group(1))));
                           M_IO.print(((IValue)l_0));
                           final Template $template42 = (Template)new Template($RVF, "letter ");
                           $template42.beginIndent("       ");
                           $template42.addStr(((IString)l_0).getValue());
                           $template42.endIndent("       ");
                           $me.jobStep(((IString)$constants.get(12)/*"job"*/), ((IString)($template42.close())), Util.kwpMap("work", ((IInteger)$constants.get(0)/*1*/)));
                           if((((IBool)($equal(((IInteger)(M_util_Math.arbInt(((IInteger)$constants.get(23)/*10*/)))), ((IInteger)$constants.get(9)/*0*/))))).getValue()){
                              M_IO.println();
                           
                           }
                        
                        } else {
                           continue FOR17;
                        }
                    }
        
            } while(false);
        /* void:  muCon([]) */$me.jobEnd(((IString)$constants.get(12)/*"job"*/), Util.kwpMap());
        return ((IBool)$constants.get(2)/*true*/);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(11531,269,<337,0>,<347,1>) 
    public IBool unfinishedLinesAtTheEndTest$addd78bcfcb11051(){ 
        
        
        $me.jobStart(((IString)$constants.get(12)/*"job"*/), Util.kwpMap("totalWork", ((IInteger)$constants.get(13)/*3*/)));
        M_IO.print(((IString)$constants.get(24)/*"ab
        c"*/));
        $me.jobStep(((IString)$constants.get(12)/*"job"*/), ((IString)$constants.get(25)/*"1.5"*/), Util.kwpMap("work", ((IInteger)$constants.get(0)/*1*/)));
        M_IO.print(((IString)$constants.get(26)/*"d
        e"*/));
        $me.jobStep(((IString)$constants.get(12)/*"job"*/), ((IString)$constants.get(27)/*"2.5"*/), Util.kwpMap("work", ((IInteger)$constants.get(0)/*1*/)));
        M_IO.print(((IString)$constants.get(28)/*"f
        gh
        "*/));
        $me.jobStep(((IString)$constants.get(12)/*"job"*/), ((IString)$constants.get(29)/*"3"*/), Util.kwpMap("work", ((IInteger)$constants.get(0)/*1*/)));
        $me.jobEnd(((IString)$constants.get(12)/*"job"*/), Util.kwpMap());
        return ((IBool)$constants.get(2)/*true*/);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/util/Monitor.rsc|(11828,300,<350,0>,<358,1>) 
    public IBool printLongUnfinishedLine$81b393cf508ee9cd(){ 
        
        
        $me.jobStart(((IString)$constants.get(12)/*"job"*/), Util.kwpMap("totalWork", ((IInteger)$constants.get(0)/*1*/)));
        IString $reducer47 = (IString)(((IString)$constants.get(4)/*""*/));
        
        $REDUCER46_GEN11950:
        for(IInteger $elem48 = ((IInteger)$constants.get(9)/*0*/); $aint_less_aint($elem48,((IInteger)$constants.get(30)/*1000000*/)).getValue(); $elem48 = $aint_add_aint($elem48,((IInteger)$constants.get(0)/*1*/))){
            $reducer47 = ((IString)($astr_add_astr(((IString)($reducer47)),((IString)$constants.get(31)/*"ab"*/))));
        }
        
        IString singleString_0 = ((IString)(M_IO.iprintToString(((IValue)($reducer47)))));
        M_IO.println(((IValue)singleString_0));
        $me.jobStep(((IString)$constants.get(12)/*"job"*/), ((IString)$constants.get(32)/*"prog"*/), Util.kwpMap("work", ((IInteger)$constants.get(0)/*1*/)));
        M_IO.println(((IString)$constants.get(33)/*"Done"*/));
        $me.jobEnd(((IString)$constants.get(12)/*"job"*/), Util.kwpMap());
        return ((IBool)$constants.get(2)/*true*/);
    
    }
    

    public static void main(String[] args) {
      throw new RuntimeException("No function `main` found in Rascal module `util::Monitor`");
    }
}