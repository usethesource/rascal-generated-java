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
public class $IO 
    extends
        org.rascalmpl.runtime.$RascalModule
    implements 
    	rascal.$IO_$I,
    	rascal.analysis.diff.edits.$FileSystemChanges_$I {

    private final $IO_$I $me;
    private final IList $constants;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_iprint$6e87095d51043046;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_iprintln$dfefef213e1cd4d7;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_readBase64$bbcbb0e0cb84a675;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_readBase32$bfd3d876717f93f7;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_remove$f3e9c3cdb434abbb;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_rename$596b83322915c1bb;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_toBase64$6ed1894002370d80;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_copy$c8ad913de321c64b;
    final java.util.Map<java.lang.String,IValue> $kwpDefaults_move$4b7487806f53e503;

    
    public final rascal.$Exception M_Exception;
    public final rascal.analysis.diff.edits.$FileSystemChanges M_analysis_diff_edits_FileSystemChanges;

    
    final org.rascalmpl.library.Prelude $Prelude; // TODO: asBaseClassName will generate name collisions if there are more of the same name in different packages

    
    public IString DEFAULT_CHARSET;
    public final io.usethesource.vallang.type.Type $T18;	/*aloc(alabel="singleton")*/
    public final io.usethesource.vallang.type.Type $T1;	/*avalue()*/
    public final io.usethesource.vallang.type.Type $T3;	/*astr()*/
    public final io.usethesource.vallang.type.Type $T0;	/*aloc()*/
    public final io.usethesource.vallang.type.Type $T9;	/*avoid()*/
    public final io.usethesource.vallang.type.Type $T14;	/*aloc(alabel="logical")*/
    public final io.usethesource.vallang.type.Type $T11;	/*aint()*/
    public final io.usethesource.vallang.type.Type $T19;	/*aparameter("T",avalue(),closed=true)*/
    public final io.usethesource.vallang.type.Type $T6;	/*aparameter("T",avalue(),closed=false)*/
    public final io.usethesource.vallang.type.Type $T15;	/*aloc(alabel="physical")*/
    public final io.usethesource.vallang.type.Type $T2;	/*adatetime()*/
    public final io.usethesource.vallang.type.Type $T17;	/*aset(aloc(alabel="singleton"))*/
    public final io.usethesource.vallang.type.Type $T10;	/*alist(aint())*/
    public final io.usethesource.vallang.type.Type ADT_IOCapability;	/*aadt("IOCapability",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type IOCapability_writing_;	/*acons(aadt("IOCapability",[],dataSyntax()),[],[],alabel="writing")*/
    public final io.usethesource.vallang.type.Type $T5;	/*alist(avalue())*/
    public final io.usethesource.vallang.type.Type $T13;	/*amap(aloc(alabel="logical"),aloc(alabel="physical"))*/
    public final io.usethesource.vallang.type.Type $T4;	/*alist(astr())*/
    public final io.usethesource.vallang.type.Type IOCapability_watching_;	/*acons(aadt("IOCapability",[],dataSyntax()),[],[],alabel="watching")*/
    public final io.usethesource.vallang.type.Type ADT_RuntimeException;	/*aadt("RuntimeException",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type IOCapability_reading_;	/*acons(aadt("IOCapability",[],dataSyntax()),[],[],alabel="reading")*/
    public final io.usethesource.vallang.type.Type $T12;	/*alist(aloc())*/
    public final io.usethesource.vallang.type.Type $T16;	/*aset(avoid())*/
    public final io.usethesource.vallang.type.Type ADT_FileSystemChange;	/*aadt("FileSystemChange",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T7;	/*abool()*/
    public final io.usethesource.vallang.type.Type IOCapability_classloading_;	/*acons(aadt("IOCapability",[],dataSyntax()),[],[],alabel="classloading")*/
    public final io.usethesource.vallang.type.Type IOCapability_resolving_;	/*acons(aadt("IOCapability",[],dataSyntax()),[],[],alabel="resolving")*/
    public final io.usethesource.vallang.type.Type $T8;	/*afunc(avoid(),[aadt("FileSystemChange",[],dataSyntax(),alabel="event")],[])*/

    public $IO(RascalExecutionContext rex){
        this(rex, null);
    }
    
    public $IO(RascalExecutionContext rex, Object extended){
       super(rex);
       this.$me = extended == null ? this : ($IO_$I)extended;
       ModuleStore mstore = rex.getModuleStore();
       mstore.put(rascal.$IO.class, this);
       
       mstore.importModule(rascal.$Exception.class, rex, rascal.$Exception::new); 
       
       M_Exception = mstore.getModule(rascal.$Exception.class); 
       
       M_analysis_diff_edits_FileSystemChanges = mstore.extendModule(rascal.analysis.diff.edits.$FileSystemChanges.class, rex, rascal.analysis.diff.edits.$FileSystemChanges::new, $me);
                          
       
       $TS.importStore(M_Exception.$TS);
       $TS.importStore(M_analysis_diff_edits_FileSystemChanges.$TS);
       
       $Prelude = $initLibrary("org.rascalmpl.library.Prelude"); 
    
       $constants = readBinaryConstantsFile(this.getClass(), "rascal/$IO.constants", 6, "f4ee18b8e7f7c5632a4110e0b791c5aa");
       ADT_IOCapability = $adt("IOCapability");
       ADT_RuntimeException = $adt("RuntimeException");
       ADT_FileSystemChange = $adt("FileSystemChange");
       $T18 = $TF.sourceLocationType();
       $T1 = $TF.valueType();
       $T3 = $TF.stringType();
       $T0 = $TF.sourceLocationType();
       $T9 = $TF.voidType();
       $T14 = $TF.sourceLocationType();
       $T11 = $TF.integerType();
       $T19 = $TF.parameterType("T", $T1);
       $T6 = $TF.parameterType("T", $T1);
       $T15 = $TF.sourceLocationType();
       $T2 = $TF.dateTimeType();
       $T17 = $TF.setType($T18);
       $T10 = $TF.listType($T11);
       $T5 = $TF.listType($T1);
       $T13 = $TF.mapType($T14, "logical", $T15, "physical");
       $T4 = $TF.listType($T3);
       $T12 = $TF.listType($T0);
       $T16 = $TF.setType($T9);
       $T7 = $TF.boolType();
       $T8 = $TF.functionType($T9, $TF.tupleType(ADT_FileSystemChange, "event"), $TF.tupleEmpty());
       IOCapability_writing_ = $TF.constructor($TS, ADT_IOCapability, "writing");
       IOCapability_watching_ = $TF.constructor($TS, ADT_IOCapability, "watching");
       IOCapability_reading_ = $TF.constructor($TS, ADT_IOCapability, "reading");
       IOCapability_classloading_ = $TF.constructor($TS, ADT_IOCapability, "classloading");
       IOCapability_resolving_ = $TF.constructor($TS, ADT_IOCapability, "resolving");
    
       DEFAULT_CHARSET = ((IString)$constants.get(5)/*"UTF-8"*/);
    
       $kwpDefaults_iprint$6e87095d51043046 = Util.kwpMap("lineLimit", ((IInteger)$constants.get(4)/*1000*/));
       $kwpDefaults_iprintln$dfefef213e1cd4d7 = Util.kwpMap("lineLimit", ((IInteger)$constants.get(4)/*1000*/));
       $kwpDefaults_readBase64$bbcbb0e0cb84a675 = Util.kwpMap("includePadding", ((IBool)$constants.get(3)/*true*/));
       $kwpDefaults_readBase32$bfd3d876717f93f7 = Util.kwpMap("includePadding", ((IBool)$constants.get(3)/*true*/));
       $kwpDefaults_remove$f3e9c3cdb434abbb = Util.kwpMap("recursive", ((IBool)$constants.get(3)/*true*/));
       $kwpDefaults_rename$596b83322915c1bb = Util.kwpMap("overwrite", ((IBool)$constants.get(2)/*false*/));
       $kwpDefaults_toBase64$6ed1894002370d80 = Util.kwpMap("includePadding", ((IBool)$constants.get(3)/*true*/));
       $kwpDefaults_copy$c8ad913de321c64b = Util.kwpMap("recursive", ((IBool)$constants.get(2)/*false*/), "overwrite", ((IBool)$constants.get(3)/*true*/));
       $kwpDefaults_move$4b7487806f53e503 = Util.kwpMap("overwrite", ((IBool)$constants.get(3)/*true*/));
    
    }
    public IBool isDirectory(IValue $P0){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IBool)isDirectory$35109388a96709c3((ISourceLocation) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public ISet charsets(){ // Generated by Resolver
       ISet $result = null;
       $result = (ISet)charsets$197e6ba4d83948c6();
       if($result != null) return $result;
       throw RuntimeExceptionFactory.callFailed($RVF.list());
    }
    public IBool isReadable(IValue $P0){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IBool)isReadable$7cc189a1cc6dd272((ISourceLocation) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public void rprintln(IValue $P0){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T1)){
         try { rprintln$6fe0b5a3150f68b8((IValue) $P0); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public void rename(IValue $P0, IValue $P1, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0)){
         try { rename$596b83322915c1bb((ISourceLocation) $P0, (ISourceLocation) $P1, $kwpActuals); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public void setLastModified(IValue $P0, IValue $P1){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T2)){
         try { setLastModified$4b03e96db4c52f61((ISourceLocation) $P0, (IDateTime) $P1); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public ISourceLocation resolveLocation(IValue $P0){ // Generated by Resolver
       ISourceLocation $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (ISourceLocation)resolveLocation$5b6b781abe97b80c((ISourceLocation) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public void unregisterLocations(IValue $P0, IValue $P1){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T3) && $isSubtypeOf($P1Type,$T3)){
         try { unregisterLocations$b6109d0c3e87a1da((IString) $P0, (IString) $P1); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public void remove(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         try { remove$f3e9c3cdb434abbb((ISourceLocation) $P0, $kwpActuals); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public ISourceLocation getResource(IValue $P0){ // Generated by Resolver
       ISourceLocation $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T3)){
         $result = (ISourceLocation)getResource$358beb4e09da2410((IString) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public void writeFileLines(IValue $P0, IValue $P1, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T4)){
         try { writeFileLines$f4d66a752c178bab((ISourceLocation) $P0, (IList) $P1, $kwpActuals); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public void iprint(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T1)){
         try { iprint$6e87095d51043046((IValue) $P0, $kwpActuals); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString readBase64(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IString)readBase64$bbcbb0e0cb84a675((ISourceLocation) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public void iprintln(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T1)){
         try { iprintln$dfefef213e1cd4d7((IValue) $P0, $kwpActuals); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IBool isFile(IValue $P0){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IBool)isFile$2b9f67956e084b6f((ISourceLocation) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public ISet canEncode(IValue $P0){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T3)){
         $result = (ISet)canEncode$9adc86f4153873c6((IString) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString readBase32(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IString)readBase32$bfd3d876717f93f7((ISourceLocation) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue created(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IValue)created$3d1edef4b5212b12((ISourceLocation) $P0);
         if($result != null) return $result;
         return $RVF.constructor(M_analysis_diff_edits_FileSystemChanges.FileSystemChange_created_loc, new IValue[]{(ISourceLocation) $P0});
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString md5HashFile(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IString)md5HashFile$2b789ee8a7988799((ISourceLocation) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString readFileEnc(IValue $P0, IValue $P1){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T3)){
         $result = (IString)readFileEnc$0a0391938962d2fe((ISourceLocation) $P0, (IString) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public void appendToFileEnc(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T3) && $isSubtypeOf($P2Type,$T5)){
         try { appendToFileEnc$227b83a24d3268e8((ISourceLocation) $P0, (IString) $P1, (IList) $P2); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IBool isWritable(IValue $P0){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IBool)isWritable$210848172a62a959((ISourceLocation) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString toBase64(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IString)toBase64$6ed1894002370d80((ISourceLocation) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public ISet findResources(IValue $P0){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (ISet)findResources$a24ed17f597f876e((ISourceLocation) $P0);
         if($result != null) return $result;
       }
       if($isSubtypeOf($P0Type,$T3)){
         $result = (ISet)findResources$17812ec73ad1029f((IString) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString md5Hash(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T1)){
         $result = (IString)md5Hash$e5be1fcbb08afdd2((IValue) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList readFileLines(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IList)readFileLines$c1c3979bf4fa810a((ISourceLocation) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IBool bprintln(IValue $P0){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T1)){
         $result = (IBool)bprintln$561c36099354dc52((IValue) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public void print(IValue $P0){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T1)){
         try { print$782605bfacb4c8e0((IValue) $P0); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList readFileLinesEnc(IValue $P0, IValue $P1){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T3)){
         $result = (IList)readFileLinesEnc$09b62b0492eae39f((ISourceLocation) $P0, (IString) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public void uudecode(IValue $P0, IValue $P1){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T3)){
         try { uudecode$9284499cf884a9e6((ISourceLocation) $P0, (IString) $P1); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public void writeBase64(IValue $P0, IValue $P1){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T3)){
         try { writeBase64$351de5fadfe9f3c1((ISourceLocation) $P0, (IString) $P1); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IValue printlnExp(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T6)){
         $result = (IValue)printlnExp$e33054ccce4f887d((IValue) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue printlnExp(IValue $P0, IValue $P1){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T3) && $isSubtypeOf($P1Type,$T6)){
         $result = (IValue)printlnExp$f0ef782f0a117e4d((IString) $P0, (IValue) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public void watch(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T7) && $isSubtypeOf($P2Type,$T8)){
         try { watch$342e848e77af30f2((ISourceLocation) $P0, (IBool) $P1, (TypedFunctionInstance1<IValue, IValue>) $P2); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public void writeBase32(IValue $P0, IValue $P1){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T3)){
         try { writeBase32$ca238a6b9e6ba1c5((ISourceLocation) $P0, (IString) $P1); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public void mkDirectory(IValue $P0){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         try { mkDirectory$41e5bf7e9d13b714((ISourceLocation) $P0); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public ISourceLocation arbLoc(){ // Generated by Resolver
       ISourceLocation $result = null;
       $result = (ISourceLocation)arbLoc$d9f4932f47bb880e();
       if($result != null) return $result;
       throw RuntimeExceptionFactory.callFailed($RVF.list());
    }
    public void println(IValue $P0){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T1)){
         try { println$496cad7ff0a57b59((IValue) $P0); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public void println(){ // Generated by Resolver
       try { println$bf1b8bdf5973f9bd(); return; } catch (FailReturnFromVoidException e){};
       
       throw RuntimeExceptionFactory.callFailed($RVF.list());
    }
    public IString iprintToString(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T1)){
         $result = (IString)iprintToString$5e15fe15b5000cdc((IValue) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public void writeFileBytes(IValue $P0, IValue $P1){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T10)){
         try { writeFileBytes$7e8d578f34c29d84((ISourceLocation) $P0, (IList) $P1); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IValue printExp(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T6)){
         $result = (IValue)printExp$cf8e382364be7f54((IValue) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue printExp(IValue $P0, IValue $P1){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T3) && $isSubtypeOf($P1Type,$T6)){
         $result = (IValue)printExp$baf1274ee9dcfc0c((IString) $P0, (IValue) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public void appendToFile(IValue $P0, IValue $P1, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T5)){
         try { appendToFile$05e88b53e32a2f32((ISourceLocation) $P0, (IList) $P1, $kwpActuals); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public void copyFile(IValue $P0, IValue $P1){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0)){
         try { copyFile$5b0f13fa68c4f72a((ISourceLocation) $P0, (ISourceLocation) $P1); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public void move(IValue $P0, IValue $P1, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0)){
         try { move$4b7487806f53e503((ISourceLocation) $P0, (ISourceLocation) $P1, $kwpActuals); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IString readFile(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IString)readFile$d9e09760e88dab86((ISourceLocation) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IList listEntries(IValue $P0){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IList)listEntries$cf92e8f75ea16808((ISourceLocation) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public void copy(IValue $P0, IValue $P1, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0)){
         try { copy$c8ad913de321c64b((ISourceLocation) $P0, (ISourceLocation) $P1, $kwpActuals); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IString uuencode(IValue $P0){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IString)uuencode$bf20c97d36c42065((ISourceLocation) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public void unwatch(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T7) && $isSubtypeOf($P2Type,$T8)){
         try { unwatch$31b1f81cf32b7171((ISourceLocation) $P0, (IBool) $P1, (TypedFunctionInstance1<IValue, IValue>) $P2); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IString createLink(IValue $P0, IValue $P1){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T3) && $isSubtypeOf($P1Type,$T3)){
         $result = (IString)createLink$46f1832cffd16447((IString) $P0, (IString) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public ISet capabilities(IValue $P0){ // Generated by Resolver
       ISet $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (ISet)capabilities$03398c61b87482be((ISourceLocation) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue iprintlnExp(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T6)){
         $result = (IValue)iprintlnExp$2b05e1bd5969aff6((IValue) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public void copyDirectory(IValue $P0, IValue $P1){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T0)){
         try { copyDirectory$dee7d92e7a9d2f6e((ISourceLocation) $P0, (ISourceLocation) $P1); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public ISourceLocation find(IValue $P0, IValue $P1){ // Generated by Resolver
       ISourceLocation $result = null;
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T3) && $isSubtypeOf($P1Type,$T12)){
         $result = (ISourceLocation)find$ea5b04adaf019e31((IString) $P0, (IList) $P1);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public IList readFileBytes(IValue $P0){ // Generated by Resolver
       IList $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IList)readFileBytes$3d807b37d7e16d05((ISourceLocation) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IValue iprintExp(IValue $P0){ // Generated by Resolver
       IValue $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T6)){
         $result = (IValue)iprintExp$8b959d89247e456e((IValue) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public void rprint(IValue $P0){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T1)){
         try { rprint$df01a347846127ce((IValue) $P0); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public void writeFile(IValue $P0, IValue $P1, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T5)){
         try { writeFile$ac4b43a62a790674((ISourceLocation) $P0, (IList) $P1, $kwpActuals); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public void iprintToFile(IValue $P0, IValue $P1, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T1)){
         try { iprintToFile$46bdf147164e3f03((ISourceLocation) $P0, (IValue) $P1, $kwpActuals); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1));
    }
    public void registerLocations(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T3) && $isSubtypeOf($P1Type,$T3) && $isSubtypeOf($P2Type,$T13)){
         try { registerLocations$bd5d1a26706258d2((IString) $P0, (IString) $P1, (IMap) $P2); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public IBool exists(IValue $P0){ // Generated by Resolver
       IBool $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IBool)exists$4cfa6f1210131208((ISourceLocation) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public void writeFileEnc(IValue $P0, IValue $P1, IValue $P2){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       Type $P1Type = $P1.getType();
       Type $P2Type = $P2.getType();
       if($isSubtypeOf($P0Type,$T0) && $isSubtypeOf($P1Type,$T3) && $isSubtypeOf($P2Type,$T5)){
         try { writeFileEnc$0fd46faba5b0f2e1((ISourceLocation) $P0, (IString) $P1, (IList) $P2); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0, $P1, $P2));
    }
    public void touch(IValue $P0){ // Generated by Resolver
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         try { touch$73cf89a841d16625((ISourceLocation) $P0); return; } catch (FailReturnFromVoidException e){};
       
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IDateTime lastModified(IValue $P0){ // Generated by Resolver
       IDateTime $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IDateTime)lastModified$067ecccab4096a42((ISourceLocation) $P0);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }

    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(905,1307,<26,0>,<47,89>) 
    public void registerLocations$bd5d1a26706258d2(IString scheme_0, IString authority_1, IMap m_2){ 
        
        
        $Prelude.registerLocations(scheme_0, authority_1, m_2); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(2216,250,<49,0>,<54,57>) 
    public void unregisterLocations$b6109d0c3e87a1da(IString scheme_0, IString authority_1){ 
        
        
        $Prelude.unregisterLocations(scheme_0, authority_1); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(2470,75,<56,0>,<57,32>) 
    public ISourceLocation resolveLocation$5b6b781abe97b80c(ISourceLocation l_0){ 
        
        
        return ((ISourceLocation)((ISourceLocation)$Prelude.resolveLocation(l_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(2549,3386,<59,0>,<101,42>) 
    public ISet findResources$17812ec73ad1029f(IString fileName_0){ 
        
        
        return ((ISet)((ISet)$Prelude.findResources(fileName_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(5937,91,<102,0>,<102,91>) 
    public ISet findResources$a24ed17f597f876e(ISourceLocation path_0){ 
        
        
        if((((IBool)($equal(((IString)(((IString)($aloc_get_field(((ISourceLocation)path_0), "scheme"))))), ((IString)$constants.get(0)/*"relative"*/))))).getValue()){
           return ((ISet)($me.findResources(((IString)(((IString)($aloc_get_field(((ISourceLocation)path_0), "path"))))))));
        
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(6032,1186,<104,0>,<132,1>) 
    public ISourceLocation getResource$358beb4e09da2410(IString fileName_0){ 
        
        
        ISet result_1 = ((ISet)($me.findResources(((IString)fileName_0))));
        final ISet $switchVal0 = ((ISet)result_1);
        boolean noCaseMatched_$switchVal0 = true;
        SWITCH0: switch(Fingerprint.getFingerprint($switchVal0)){
        
            case 113762:
                if(noCaseMatched_$switchVal0){
                    noCaseMatched_$switchVal0 = false;
                    if($isSubtypeOf($switchVal0.getType(),$T16)){
                       /*muExists*/CASE_113762_0: 
                           do {
                               if($switchVal0.equals(((ISet)$constants.get(1)/*{}*/))){
                                  final Template $template2 = (Template)new Template($RVF, "");
                                  $template2.addStr(((IString)fileName_0).getValue());
                                  $template2.addStr(" not found");
                                  throw new Throw($RVF.constructor(M_Exception.RuntimeException_IO_str, new IValue[]{((IString)($template2.close()))}));
                               }
                       
                           } while(false);
                    
                    }
                    if($isSubtypeOf($switchVal0.getType(),$T17)){
                       /*muExists*/CASE_113762_1: 
                           do {
                               ISet $subject3 = (ISet)($switchVal0);
                               if(((ISet)($subject3)).size() >= 1){
                                  CASE_113762_1_SET_VARsingleton:
                                  for(IValue $elem6_for : ((ISet)($subject3))){
                                      ISourceLocation $elem6 = (ISourceLocation) $elem6_for;
                                      ISourceLocation singleton_2 = ((ISourceLocation)($elem6));
                                      final ISet $subject5 = ((ISet)(((ISet)($subject3)).delete(((ISourceLocation)singleton_2))));
                                      if(((ISet)($subject5)).size() == 0){
                                         return ((ISourceLocation)singleton_2);
                                      
                                      } else {
                                         continue CASE_113762_1_SET_VARsingleton;/*set pat3*/
                                      }
                                  }
                                  
                                              
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            default: final Template $template1 = (Template)new Template($RVF, "");
                     $template1.addStr(((IString)fileName_0).getValue());
                     $template1.addStr(" found more than once: ");
                     $template1.beginIndent("                       ");
                     $template1.addVal(result_1);
                     $template1.endIndent("                       ");
                      
                     throw new Throw($RVF.constructor(M_Exception.RuntimeException_IO_str, new IValue[]{((IString)($template1.close()))}));
        }
        
                   
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(7223,905,<134,0>,<152,24>) 
    public void appendToFile$05e88b53e32a2f32(ISourceLocation file_0, IList V_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = Util.kwpMap();
        IString $kwpDefault_charset = ((IString)DEFAULT_CHARSET);
        $kwpDefaults.put("charset", $kwpDefault_charset);IBool $kwpDefault_inferCharset = $RVF.bool(!$kwpActuals.containsKey("charset"));
        $kwpDefaults.put("inferCharset", $kwpDefault_inferCharset);
        $Prelude.appendToFile(file_0, V_1, (IString)($kwpActuals.containsKey("charset") ? $kwpActuals.get("charset") : $kwpDefaults.get("charset")), (IBool)($kwpActuals.containsKey("inferCharset") ? $kwpActuals.get("inferCharset") : $kwpDefaults.get("inferCharset"))); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(8132,697,<154,0>,<169,63>) 
    public void appendToFileEnc$227b83a24d3268e8(ISourceLocation file_0, IString charset_1, IList V_2){ 
        
        
        $me.appendToFile(((ISourceLocation)file_0), V_2, Util.kwpMap("charset", charset_1, "inferCharset", ((IBool)$constants.get(2)/*false*/))); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(8833,125,<171,0>,<173,32>) 
    public ISet charsets$197e6ba4d83948c6(){ 
        
        
        return ((ISet)((ISet)$Prelude.charsets()));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(8962,178,<175,0>,<177,44>) 
    public ISet canEncode$9adc86f4153873c6(IString charset_0){ 
        
        
        return ((ISet)((ISet)$Prelude.canEncode(charset_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(9144,433,<179,0>,<194,1>) 
    public IBool bprintln$561c36099354dc52(IValue arg_0){ 
        
        
        $me.println(((IValue)arg_0));
        return ((IBool)$constants.get(3)/*true*/);
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(9581,423,<196,0>,<211,34>) 
    public IBool exists$4cfa6f1210131208(ISourceLocation file_0){ 
        
        
        return ((IBool)((IBool)$Prelude.exists(file_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(10010,447,<214,0>,<229,1>) 
    public ISourceLocation find$ea5b04adaf019e31(IString name_0, IList path_1){ 
        
        
        /*muExists*/IF1: 
            do {
                IF1_GEN10330:
                for(IValue $elem9_for : ((IList)path_1)){
                    ISourceLocation $elem9 = (ISourceLocation) $elem9_for;
                    ISourceLocation dir_2 = ((ISourceLocation)($elem9));
                    final Template $template7 = (Template)new Template($RVF, "/");
                    $template7.beginIndent(" ");
                    $template7.addStr(((IString)name_0).getValue());
                    $template7.endIndent(" ");
                    final ISourceLocation $subject_val8 = ((ISourceLocation)($aloc_add_astr(((ISourceLocation)dir_2),((IString)($template7.close())))));
                    ISourceLocation f_3 = ((ISourceLocation)($subject_val8));
                    if((((IBool)($me.exists(((ISourceLocation)f_3))))).getValue()){
                       return ((ISourceLocation)f_3);
                    
                    } else {
                       continue IF1_GEN10330;
                    }
                }
                
                            
            } while(false);
        final ISetWriter $setwriter10 = (ISetWriter)$RVF.setWriter();
        ;
        $SCOMP11_GEN10440:
        for(IValue $elem13_for : ((IList)path_1)){
            ISourceLocation $elem13 = (ISourceLocation) $elem13_for;
            ISourceLocation dir_4 = null;
            final Template $template12 = (Template)new Template($RVF, "/");
            $template12.beginIndent(" ");
            $template12.addStr(((IString)name_0).getValue());
            $template12.endIndent(" ");
            $setwriter10.insert($aloc_add_astr(((ISourceLocation)($elem13)),((IString)($template12.close()))));
        
        }
        
                    throw new Throw($RVF.constructor(M_Exception.RuntimeException_PathNotFound_set_loc, new IValue[]{((ISet)($setwriter10.done()))}));
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(10461,210,<231,0>,<236,39>) 
    public IBool isDirectory$35109388a96709c3(ISourceLocation file_0){ 
        
        
        return ((IBool)((IBool)$Prelude.isDirectory(file_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(10675,567,<238,0>,<253,57>) 
    public void iprint$6e87095d51043046(IValue arg_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_iprint$6e87095d51043046;
    
        $Prelude.iprint(arg_0, (IInteger)($kwpActuals.containsKey("lineLimit") ? $kwpActuals.get("lineLimit") : $kwpDefaults.get("lineLimit"))); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(11247,570,<255,0>,<268,80>) 
    public void iprintToFile$46bdf147164e3f03(ISourceLocation file_0, IValue arg_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = Util.kwpMap();
        IString $kwpDefault_charset = ((IString)DEFAULT_CHARSET);
        $kwpDefaults.put("charset", $kwpDefault_charset);
        $Prelude.iprintToFile(file_0, arg_1, (IString)($kwpActuals.containsKey("charset") ? $kwpActuals.get("charset") : $kwpDefaults.get("charset"))); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(11822,85,<270,0>,<271,42>) 
    public IString iprintToString$5e15fe15b5000cdc(IValue arg_0){ 
        
        
        return ((IString)((IString)$Prelude.iprintToString(arg_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(11913,337,<274,0>,<287,1>) 
    public IValue iprintExp$8b959d89247e456e(IValue v_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T6.match(v_0.getType(), $typeBindings)){
           $me.iprint(((IValue)v_0), Util.kwpMap());
           final IValue $result14 = ((IValue)v_0);
           if($T19.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result14.getType(),$T19)){
              return ((IValue)($result14));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(12256,371,<290,0>,<303,1>) 
    public IValue iprintlnExp$2b05e1bd5969aff6(IValue v_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T6.match(v_0.getType(), $typeBindings)){
           $me.iprintln(((IValue)v_0), Util.kwpMap());
           final IValue $result15 = ((IValue)v_0);
           if($T19.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result15.getType(),$T19)){
              return ((IValue)($result15));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(12635,781,<307,0>,<325,59>) 
    public void iprintln$dfefef213e1cd4d7(IValue arg_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_iprintln$dfefef213e1cd4d7;
    
        $Prelude.iprintln(arg_0, (IInteger)($kwpActuals.containsKey("lineLimit") ? $kwpActuals.get("lineLimit") : $kwpDefaults.get("lineLimit"))); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(13423,231,<328,0>,<333,34>) 
    public IBool isFile$2b9f67956e084b6f(ISourceLocation file_0){ 
        
        
        return ((IBool)((IBool)$Prelude.isFile(file_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(13658,456,<335,0>,<344,58>) 
    public IBool isReadable$7cc189a1cc6dd272(ISourceLocation file_0){ 
        
        
        return ((IBool)((IBool)$Prelude.isReadable(file_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(14118,488,<346,0>,<355,58>) 
    public IBool isWritable$210848172a62a959(ISourceLocation file_0){ 
        
        
        return ((IBool)((IBool)$Prelude.isWritable(file_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(14616,437,<360,0>,<374,44>) 
    public IDateTime lastModified$067ecccab4096a42(ISourceLocation file_0){ 
        
        
        return ((IDateTime)((IDateTime)$Prelude.lastModified(file_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(15059,417,<377,0>,<391,39>) 
    public IDateTime created$3d1edef4b5212b12(ISourceLocation file_0){ 
        
        
        return ((IDateTime)((IDateTime)$Prelude.created(file_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(15484,169,<395,0>,<397,26>) 
    public void touch$73cf89a841d16625(ISourceLocation file_0){ 
        
        
        $Prelude.touch(file_0); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(15659,164,<400,0>,<402,56>) 
    public void setLastModified$4b03e96db4c52f61(ISourceLocation file_0, IDateTime timestamp_1){ 
        
        
        $Prelude.setLastModified(file_0, timestamp_1); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(15829,373,<405,0>,<419,44>) 
    public IList listEntries$cf92e8f75ea16808(ISourceLocation file_0){ 
        
        
        return ((IList)((IList)$Prelude.listEntries(file_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(16210,201,<423,0>,<429,24>) 
    public void mkDirectory$41e5bf7e9d13b714(ISourceLocation file_0){ 
        
        
        $Prelude.mkDirectory(file_0); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(16417,620,<432,0>,<450,34>) 
    public void print$782605bfacb4c8e0(IValue arg_0){ 
        
        
        $Prelude.print(arg_0); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(17043,228,<453,0>,<464,1>) 
    public IValue printExp$cf8e382364be7f54(IValue v_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T6.match(v_0.getType(), $typeBindings)){
           final Template $template16 = (Template)new Template($RVF, "");
           $template16.addVal(v_0);
           $me.print(((IValue)($template16.close())));
           final IValue $result17 = ((IValue)v_0);
           if($T19.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result17.getType(),$T19)){
              return ((IValue)($result17));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(17275,71,<466,0>,<469,1>) 
    public IValue printExp$baf1274ee9dcfc0c(IString msg_0, IValue v_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T6.match(v_1.getType(), $typeBindings)){
           final Template $template18 = (Template)new Template($RVF, "");
           $template18.addStr(((IString)msg_0).getValue());
           ;$template18.addVal(v_1);
           $me.print(((IValue)($template18.close())));
           final IValue $result19 = ((IValue)v_1);
           if($T19.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result19.getType(),$T19)){
              return ((IValue)($result19));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(17352,797,<472,0>,<503,36>) 
    public void println$496cad7ff0a57b59(IValue arg_0){ 
        
        
        $Prelude.println(arg_0); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(18153,70,<505,0>,<506,27>) 
    public void println$bf1b8bdf5973f9bd(){ 
        
        
        $Prelude.println(); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(18229,396,<509,0>,<522,1>) 
    public IValue printlnExp$e33054ccce4f887d(IValue v_0){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T6.match(v_0.getType(), $typeBindings)){
           final Template $template20 = (Template)new Template($RVF, "");
           $template20.addVal(v_0);
           $me.println(((IValue)($template20.close())));
           final IValue $result21 = ((IValue)v_0);
           if($T19.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result21.getType(),$T19)){
              return ((IValue)($result21));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(18629,75,<524,0>,<527,1>) 
    public IValue printlnExp$f0ef782f0a117e4d(IString msg_0, IValue v_1){ 
        
        
        HashMap<io.usethesource.vallang.type.Type,io.usethesource.vallang.type.Type> $typeBindings = new HashMap<>();
        if($T6.match(v_1.getType(), $typeBindings)){
           final Template $template22 = (Template)new Template($RVF, "");
           $template22.addStr(((IString)msg_0).getValue());
           ;$template22.addVal(v_1);
           $me.println(((IValue)($template22.close())));
           final IValue $result23 = ((IValue)v_1);
           if($T19.instantiate($typeBindings) != $TF.voidType() && $isSubtypeOf($result23.getType(),$T19)){
              return ((IValue)($result23));
           
           } else {
              return null;
           }
        } else {
           return null;
        }
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(18710,209,<530,0>,<535,35>) 
    public void rprint$df01a347846127ce(IValue arg_0){ 
        
        
        $Prelude.rprint(arg_0); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(18931,231,<539,0>,<544,37>) 
    public void rprintln$6fe0b5a3150f68b8(IValue arg_0){ 
        
        
        $Prelude.rprintln(arg_0); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(19168,1689,<547,0>,<576,24>) 
    public IString readFile$d9e09760e88dab86(ISourceLocation file_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = Util.kwpMap();
        IString $kwpDefault_charset = ((IString)DEFAULT_CHARSET);
        $kwpDefaults.put("charset", $kwpDefault_charset);IBool $kwpDefault_inferCharset = $RVF.bool(!$kwpActuals.containsKey("charset"));
        $kwpDefaults.put("inferCharset", $kwpDefault_inferCharset);
        return ((IString)((IString)$Prelude.readFile(file_0, (IString)($kwpActuals.containsKey("charset") ? $kwpActuals.get("charset") : $kwpDefaults.get("charset")), (IBool)($kwpActuals.containsKey("inferCharset") ? $kwpActuals.get("inferCharset") : $kwpDefaults.get("inferCharset")))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(20861,448,<578,0>,<587,56>) 
    public IString readFileEnc$0a0391938962d2fe(ISourceLocation file_0, IString charset_1){ 
        
        
        return ((IString)($me.readFile(((ISourceLocation)file_0), Util.kwpMap("inferCharset", ((IBool)$constants.get(2)/*false*/), "charset", charset_1))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(21313,232,<589,0>,<594,24>) 
    public IString readBase64$bbcbb0e0cb84a675(ISourceLocation file_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_readBase64$bbcbb0e0cb84a675;
    
        return ((IString)((IString)$Prelude.readBase64(file_0, (IBool)($kwpActuals.containsKey("includePadding") ? $kwpActuals.get("includePadding") : $kwpDefaults.get("includePadding")))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(21549,91,<596,0>,<599,49>) 
    public IString uuencode$bf20c97d36c42065(ISourceLocation file_0){ 
        
        
        return ((IString)($me.readBase64(((ISourceLocation)file_0), Util.kwpMap())));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(21644,224,<601,0>,<606,24>) 
    public void writeBase64$351de5fadfe9f3c1(ISourceLocation file_0, IString content_1){ 
        
        
        $Prelude.writeBase64(file_0, content_1); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(21872,116,<608,0>,<611,73>) 
    public void uudecode$9284499cf884a9e6(ISourceLocation file_0, IString content_1){ 
        
        
        $me.writeBase64(((ISourceLocation)file_0), ((IString)content_1)); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(21992,232,<613,0>,<618,24>) 
    public IString readBase32$bfd3d876717f93f7(ISourceLocation file_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_readBase32$bfd3d876717f93f7;
    
        return ((IString)((IString)$Prelude.readBase32(file_0, (IBool)($kwpActuals.containsKey("includePadding") ? $kwpActuals.get("includePadding") : $kwpDefaults.get("includePadding")))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(22228,224,<620,0>,<625,24>) 
    public void writeBase32$ca238a6b9e6ba1c5(ISourceLocation file_0, IString content_1){ 
        
        
        $Prelude.writeBase32(file_0, content_1); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(22456,188,<627,0>,<630,24>) 
    public IList readFileBytes$3d807b37d7e16d05(ISourceLocation file_0){ 
        
        
        return ((IList)((IList)$Prelude.readFileBytes(file_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(22652,796,<634,0>,<649,24>) 
    public IList readFileLines$c1c3979bf4fa810a(ISourceLocation file_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = Util.kwpMap();
        IString $kwpDefault_charset = ((IString)DEFAULT_CHARSET);
        $kwpDefaults.put("charset", $kwpDefault_charset);
        return ((IList)((IList)$Prelude.readFileLines(file_0, (IString)($kwpActuals.containsKey("charset") ? $kwpActuals.get("charset") : $kwpDefaults.get("charset")))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(23452,498,<651,0>,<662,1>) 
    public void writeFileLines$f4d66a752c178bab(ISourceLocation file_0, IList lines_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = Util.kwpMap();
        IString $kwpDefault_charset = ((IString)DEFAULT_CHARSET);
        $kwpDefaults.put("charset", $kwpDefault_charset);
        final Template $template24 = (Template)new Template($RVF, "");
        /*muExists*/LAB2: 
            do {
                LAB2_GEN23857:
                for(IValue $elem25_for : ((IList)lines_1)){
                    IString $elem25 = (IString) $elem25_for;
                    IString line_3 = null;
                    ;$template24.addStr(((IString)($elem25)).getValue());
                    $template24.addStr("\r\n");
                
                }
                continue LAB2;
                            
            } while(false);
        $me.writeFile(((ISourceLocation)file_0), $RVF.list($template24.close()), Util.kwpMap("charset", ((IString) ($kwpActuals.containsKey("charset") ? $kwpActuals.get("charset") : $kwpDefaults.get("charset")))));
        return;
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(23954,437,<664,0>,<674,41>) 
    public IList readFileLinesEnc$09b62b0492eae39f(ISourceLocation file_0, IString charset_1){ 
        
        
        return ((IList)($me.readFileLines(((ISourceLocation)file_0), Util.kwpMap("charset", charset_1))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(24397,148,<677,0>,<679,65>) 
    public void remove$f3e9c3cdb434abbb(ISourceLocation file_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_remove$f3e9c3cdb434abbb;
    
        $Prelude.remove(file_0, (IBool)($kwpActuals.containsKey("recursive") ? $kwpActuals.get("recursive") : $kwpDefaults.get("recursive"))); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(24549,589,<681,0>,<692,74>) 
    public void rename$596b83322915c1bb(ISourceLocation from_0, ISourceLocation $to_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_rename$596b83322915c1bb;
    
        $Prelude.rename(from_0, $to_1, (IBool)($kwpActuals.containsKey("overwrite") ? $kwpActuals.get("overwrite") : $kwpDefaults.get("overwrite"))); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(25142,613,<694,0>,<707,24>) 
    public void writeFile$ac4b43a62a790674(ISourceLocation file_0, IList V_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = Util.kwpMap();
        IString $kwpDefault_charset = ((IString)DEFAULT_CHARSET);
        $kwpDefaults.put("charset", $kwpDefault_charset);
        $Prelude.writeFile(file_0, V_1, (IString)($kwpActuals.containsKey("charset") ? $kwpActuals.get("charset") : $kwpDefaults.get("charset"))); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(25759,172,<709,0>,<712,24>) 
    public void writeFileBytes$7e8d578f34c29d84(ISourceLocation file_0, IList bytes_1){ 
        
        
        $Prelude.writeFileBytes(file_0, bytes_1); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(25937,621,<715,0>,<730,40>) 
    public void writeFileEnc$0fd46faba5b0f2e1(ISourceLocation file_0, IString charset_1, IList V_2){ 
        
        
        $me.writeFile(((ISourceLocation)file_0), V_2, Util.kwpMap("charset", charset_1)); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(26564,238,<733,0>,<740,24>) 
    public IString md5HashFile$2b789ee8a7988799(ISourceLocation file_0){ 
        
        
        return ((IString)((IString)$Prelude.md5HashFile(file_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(26806,76,<742,0>,<743,33>) 
    public IString md5Hash$e5be1fcbb08afdd2(IValue v_0){ 
        
        
        return ((IString)((IString)$Prelude.md5Hash(v_0)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(26886,93,<745,0>,<746,50>) 
    public IString createLink$46f1832cffd16447(IString title_0, IString target_1){ 
        
        
        return ((IString)((IString)$Prelude.createLink(title_0, target_1)));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(26985,173,<749,0>,<754,24>) 
    public IString toBase64$6ed1894002370d80(ISourceLocation file_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_toBase64$6ed1894002370d80;
    
        return ((IString)((IString)$Prelude.toBase64(file_0, (IBool)($kwpActuals.containsKey("includePadding") ? $kwpActuals.get("includePadding") : $kwpDefaults.get("includePadding")))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(27162,135,<756,0>,<757,92>) 
    public void copy$c8ad913de321c64b(ISourceLocation source_0, ISourceLocation target_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_copy$c8ad913de321c64b;
    
        $Prelude.copy(source_0, target_1, (IBool)($kwpActuals.containsKey("recursive") ? $kwpActuals.get("recursive") : $kwpDefaults.get("recursive")), (IBool)($kwpActuals.containsKey("overwrite") ? $kwpActuals.get("overwrite") : $kwpDefaults.get("overwrite"))); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(27301,150,<759,0>,<764,1>) 
    public void copyFile$5b0f13fa68c4f72a(ISourceLocation source_0, ISourceLocation target_1){ 
        
        
        $me.copy(((ISourceLocation)source_0), ((ISourceLocation)target_1), Util.kwpMap("recursive", ((IBool)$constants.get(2)/*false*/), "overwrite", ((IBool)$constants.get(3)/*true*/)));
        return;
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(27455,154,<766,0>,<771,1>) 
    public void copyDirectory$dee7d92e7a9d2f6e(ISourceLocation source_0, ISourceLocation target_1){ 
        
        
        $me.copy(((ISourceLocation)source_0), ((ISourceLocation)target_1), Util.kwpMap("recursive", ((IBool)$constants.get(3)/*true*/), "overwrite", ((IBool)$constants.get(3)/*true*/)));
        return;
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(27613,152,<773,0>,<775,70>) 
    public void move$4b7487806f53e503(ISourceLocation source_0, ISourceLocation target_1, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = $kwpDefaults_move$4b7487806f53e503;
    
        $Prelude.move(source_0, target_1, (IBool)($kwpActuals.containsKey("overwrite") ? $kwpActuals.get("overwrite") : $kwpDefaults.get("overwrite"))); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(27769,61,<777,0>,<778,18>) 
    public ISourceLocation arbLoc$d9f4932f47bb880e(){ 
        
        
        return ((ISourceLocation)((ISourceLocation)$Prelude.arbLoc()));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(27834,123,<780,0>,<781,80>) 
    public void watch$342e848e77af30f2(ISourceLocation src_0, IBool recursive_1, TypedFunctionInstance1<IValue, IValue> watcher_2){ 
        
        
        $Prelude.watch(src_0, recursive_1, watcher_2); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(27961,125,<783,0>,<784,82>) 
    public void unwatch$31b1f81cf32b7171(ISourceLocation src_0, IBool recursive_1, TypedFunctionInstance1<IValue, IValue> watcher_2){ 
        
        
        $Prelude.unwatch(src_0, recursive_1, watcher_2); 
        return;
        
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/IO.rsc|(29570,152,<821,0>,<823,50>) 
    public ISet capabilities$03398c61b87482be(ISourceLocation location_0){ 
        
        
        return ((ISet)((ISet)$Prelude.capabilities(location_0)));
    
    }
    

    public static void main(String[] args) {
      throw new RuntimeException("No function `main` found in Rascal module `IO`");
    }
}