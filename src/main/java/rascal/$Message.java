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
public class $Message 
    extends
        org.rascalmpl.runtime.$RascalModule
    implements 
    	rascal.$Message_$I {

    private final $Message_$I $me;
    private final IList $constants;
    
    
    public final rascal.$IO M_IO;
    public final rascal.analysis.diff.edits.$FileSystemChanges M_analysis_diff_edits_FileSystemChanges;

    
    final org.rascalmpl.library.Messages $Messages; // TODO: asBaseClassName will generate name collisions if there are more of the same name in different packages

    
    public final io.usethesource.vallang.type.Type $T3;	/*avalue()*/
    public final io.usethesource.vallang.type.Type $T2;	/*aloc(alabel="at")*/
    public final io.usethesource.vallang.type.Type $T1;	/*astr(alabel="msg")*/
    public final io.usethesource.vallang.type.Type ADT_Message;	/*aadt("Message",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type ADT_IOCapability;	/*aadt("IOCapability",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type $T5;	/*abool()*/
    public final io.usethesource.vallang.type.Type $T6;	/*abool(alabel="_")*/
    public final io.usethesource.vallang.type.Type $T4;	/*atuple(atypeList([abool(),abool(alabel="_"),abool(),abool(alabel="_")]))*/
    public final io.usethesource.vallang.type.Type ADT_FileSystemChange;	/*aadt("FileSystemChange",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type Message_warning_str_loc;	/*acons(aadt("Message",[],dataSyntax()),[astr(alabel="msg"),aloc(alabel="at")],[],alabel="warning")*/
    public final io.usethesource.vallang.type.Type Message_info_str_loc;	/*acons(aadt("Message",[],dataSyntax()),[astr(alabel="msg"),aloc(alabel="at")],[],alabel="info")*/
    public final io.usethesource.vallang.type.Type $T0;	/*alist(aadt("Message",[],dataSyntax()))*/
    public final io.usethesource.vallang.type.Type ADT_RuntimeException;	/*aadt("RuntimeException",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type Message_error_str_loc;	/*acons(aadt("Message",[],dataSyntax()),[astr(alabel="msg"),aloc(alabel="at")],[],alabel="error")*/
    public final io.usethesource.vallang.type.Type $T7;	/*atuple(atypeList([abool(alabel="_"),abool(),abool(alabel="_"),abool()]))*/

    public $Message(RascalExecutionContext rex){
        this(rex, null);
    }
    
    public $Message(RascalExecutionContext rex, Object extended){
       super(rex);
       this.$me = extended == null ? this : ($Message_$I)extended;
       ModuleStore mstore = rex.getModuleStore();
       mstore.put(rascal.$Message.class, this);
       
       mstore.importModule(rascal.$IO.class, rex, rascal.$IO::new);
       mstore.importModule(rascal.analysis.diff.edits.$FileSystemChanges.class, rex, rascal.analysis.diff.edits.$FileSystemChanges::new); 
       
       M_IO = mstore.getModule(rascal.$IO.class);
       M_analysis_diff_edits_FileSystemChanges = mstore.getModule(rascal.analysis.diff.edits.$FileSystemChanges.class); 
       
                          
       
       $TS.importStore(M_IO.$TS);
       $TS.importStore(M_analysis_diff_edits_FileSystemChanges.$TS);
       
       $Messages = $initLibrary("org.rascalmpl.library.Messages"); 
    
       $constants = readBinaryConstantsFile(this.getClass(), "rascal/$Message.constants", 9, "29bb65c6fbd68c62bbe3d98e0b6e70e1");
       ADT_Message = $adt("Message");
       ADT_IOCapability = $adt("IOCapability");
       ADT_FileSystemChange = $adt("FileSystemChange");
       ADT_RuntimeException = $adt("RuntimeException");
       $T3 = $TF.valueType();
       $T2 = $TF.sourceLocationType();
       $T1 = $TF.stringType();
       $T5 = $TF.boolType();
       $T6 = $TF.boolType();
       $T4 = $TF.tupleType($T5, $T6, $T5, $T6);
       $T0 = $TF.listType(ADT_Message);
       $T7 = $TF.tupleType($T6, $T5, $T6, $T5);
       Message_warning_str_loc = $TF.constructor($TS, ADT_Message, "warning", $TF.stringType(), "msg", $TF.sourceLocationType(), "at");
       Message_info_str_loc = $TF.constructor($TS, ADT_Message, "info", $TF.stringType(), "msg", $TF.sourceLocationType(), "at");
       Message_error_str_loc = $TF.constructor($TS, ADT_Message, "error", $TF.stringType(), "msg", $TF.sourceLocationType(), "at");
    
       
       
    }
    public void println(IValue $P0){ // Generated by Resolver
        M_IO.println($P0);
    }
    public void println(){ // Generated by Resolver
        M_IO.println();
    }
    public IInteger mainMessageHandler(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       IInteger $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IInteger)mainMessageHandler$bc55bffd6e324904((IList) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }
    public IString write(IValue $P0, java.util.Map<java.lang.String,IValue> $kwpActuals){ // Generated by Resolver
       IString $result = null;
       Type $P0Type = $P0.getType();
       if($isSubtypeOf($P0Type,$T0)){
         $result = (IString)write$59cb5b3469c2bfc7((IList) $P0, $kwpActuals);
         if($result != null) return $result;
       }
       
       throw RuntimeExceptionFactory.callFailed($RVF.list($P0));
    }

    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Message.rsc|(2385,217,<51,0>,<53,70>) 
    public IString write$59cb5b3469c2bfc7(IList messages_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = Util.kwpMap();
        ISourceLocation $kwpDefault_projectRoot = ((ISourceLocation)($create_aloc(((IString)$constants.get(0)/*"unknown:///"*/))));
        $kwpDefaults.put("projectRoot", $kwpDefault_projectRoot);
        return ((IString)((IString)$Messages.write(messages_0, (ISourceLocation)($kwpActuals.containsKey("projectRoot") ? $kwpActuals.get("projectRoot") : $kwpDefaults.get("projectRoot")))));
    
    }
    
    // Source: |file:///C:/Users/Rodin/workspace/rascal/src/org/rascalmpl/library/Message.rsc|(2606,2278,<55,0>,<111,1>) 
    public IInteger mainMessageHandler$bc55bffd6e324904(IList messages_0, java.util.Map<java.lang.String,IValue> $kwpActuals){ 
        
        java.util.Map<java.lang.String,IValue> $kwpDefaults = Util.kwpMap();
        ISourceLocation $kwpDefault_projectRoot = ((ISourceLocation)($create_aloc(((IString)$constants.get(0)/*"unknown:///"*/))));
        $kwpDefaults.put("projectRoot", $kwpDefault_projectRoot);IBool $kwpDefault_errorsAsWarnings = ((IBool)$constants.get(1)/*false*/);
        $kwpDefaults.put("errorsAsWarnings", $kwpDefault_errorsAsWarnings);IBool $kwpDefault_warningsAsErrors = ((IBool)$constants.get(1)/*false*/);
        $kwpDefaults.put("warningsAsErrors", $kwpDefault_warningsAsErrors);
        IInteger FAILURE_2 = ((IInteger)$constants.get(2)/*1*/);
        IInteger SUCCESS_3 = ((IInteger)$constants.get(3)/*0*/);
        if((((IBool)(((IBool) ($kwpActuals.containsKey("errorsAsWarnings") ? $kwpActuals.get("errorsAsWarnings") : $kwpDefaults.get("errorsAsWarnings")))))).getValue()){
           if((((IBool)(((IBool) ($kwpActuals.containsKey("warningsAsErrors") ? $kwpActuals.get("warningsAsErrors") : $kwpDefaults.get("warningsAsErrors")))))).getValue()){
              M_IO.println(((IString)$constants.get(4)/*"[ERROR] the error handler is confused because both errorsAsWarnings and warningsAsErrors are set to  ..."*/));
              return ((IInteger)FAILURE_2);
           
           }
        
        }
        M_IO.println(((IValue)($me.write(((IList)messages_0), Util.kwpMap("projectRoot", ((ISourceLocation) ($kwpActuals.containsKey("projectRoot") ? $kwpActuals.get("projectRoot") : $kwpDefaults.get("projectRoot"))))))));
        IBool hasErrors_4 = ((IBool)$constants.get(1)/*false*/);
        IBool hasWarnings_5 = ((IBool)hasErrors_4);
        if((((IBool)($equal(((IList)messages_0),((IList)$constants.get(5)/*[]*/)).not()))).getValue()){
           IBool $done0 = (IBool)(((IBool)$constants.get(1)/*false*/));
           /*muExists*/$ANY1_GEN4244_CONS_error: 
               do {
                   $ANY1_GEN4244:
                   for(IValue $elem2_for : ((IList)messages_0)){
                       IConstructor $elem2 = (IConstructor) $elem2_for;
                       if($has_type_and_arity($elem2, Message_error_str_loc, 2)){
                          IValue $arg0_4 = (IValue)($aadt_subscript_int(((IConstructor)($elem2)),0));
                          if($isComparable($arg0_4.getType(), $T3)){
                             IValue $arg1_3 = (IValue)($aadt_subscript_int(((IConstructor)($elem2)),1));
                             if($isComparable($arg1_3.getType(), $T3)){
                                $done0 = ((IBool)$constants.get(6)/*true*/);
                                break $ANY1_GEN4244_CONS_error; // muSucceed
                             } else {
                                continue $ANY1_GEN4244;
                             }
                          } else {
                             continue $ANY1_GEN4244;
                          }
                       } else {
                          continue $ANY1_GEN4244;
                       }
                   }
                   
                               
               } while(false);
           hasErrors_4 = ((IBool)($done0));
           IBool $done5 = (IBool)(((IBool)$constants.get(1)/*false*/));
           /*muExists*/$ANY6_GEN4295_CONS_warning: 
               do {
                   $ANY6_GEN4295:
                   for(IValue $elem7_for : ((IList)messages_0)){
                       IConstructor $elem7 = (IConstructor) $elem7_for;
                       if($has_type_and_arity($elem7, Message_warning_str_loc, 2)){
                          IValue $arg0_9 = (IValue)($aadt_subscript_int(((IConstructor)($elem7)),0));
                          if($isComparable($arg0_9.getType(), $T3)){
                             IValue $arg1_8 = (IValue)($aadt_subscript_int(((IConstructor)($elem7)),1));
                             if($isComparable($arg1_8.getType(), $T3)){
                                $done5 = ((IBool)$constants.get(6)/*true*/);
                                break $ANY6_GEN4295_CONS_warning; // muSucceed
                             } else {
                                continue $ANY6_GEN4295;
                             }
                          } else {
                             continue $ANY6_GEN4295;
                          }
                       } else {
                          continue $ANY6_GEN4295;
                       }
                   }
                   
                               
               } while(false);
           hasWarnings_5 = ((IBool)($done5));
        
        }
        final ITuple $switchVal10 = ((ITuple)($RVF.tuple(((IBool)hasErrors_4), ((IBool)hasWarnings_5), ((IBool)(((IBool) ($kwpActuals.containsKey("errorsAsWarnings") ? $kwpActuals.get("errorsAsWarnings") : $kwpDefaults.get("errorsAsWarnings"))))), ((IBool)(((IBool) ($kwpActuals.containsKey("warningsAsErrors") ? $kwpActuals.get("warningsAsErrors") : $kwpDefaults.get("warningsAsErrors"))))))));
        boolean noCaseMatched_$switchVal10 = true;
        SWITCH2: switch(Fingerprint.getFingerprint($switchVal10)){
        
            case -1503530496:
                if(noCaseMatched_$switchVal10){
                    noCaseMatched_$switchVal10 = false;
                    if($isSubtypeOf($switchVal10.getType(),$T4)){
                       /*muExists*/CASE_1503530496_0: 
                           do {
                               final ITuple $tuple_subject12 = ((ITuple)($switchVal10));
                               if($tuple_subject12 instanceof ITuple && ((ITuple)$tuple_subject12).arity() == 4){
                                  /*muExists*/CASE_1503530496_0_TUPLE: 
                                      do {
                                          if(((IBool)$constants.get(6)/*true*/).equals($atuple_subscript_int(((ITuple)($tuple_subject12)),0))){
                                             if(((IBool)$constants.get(1)/*false*/).equals($atuple_subscript_int(((ITuple)($tuple_subject12)),2))){
                                                return ((IInteger)FAILURE_2);
                                             
                                             } else {
                                                continue CASE_1503530496_0_TUPLE;/*computeFail*/
                                             }
                                          }
                                  
                                      } while(false);
                               
                               }
                       
                           } while(false);
                    
                    }
                    if($isSubtypeOf($switchVal10.getType(),$T4)){
                       /*muExists*/CASE_1503530496_1: 
                           do {
                               final ITuple $tuple_subject13 = ((ITuple)($switchVal10));
                               if($tuple_subject13 instanceof ITuple && ((ITuple)$tuple_subject13).arity() == 4){
                                  /*muExists*/CASE_1503530496_1_TUPLE: 
                                      do {
                                          if(((IBool)$constants.get(6)/*true*/).equals($atuple_subscript_int(((ITuple)($tuple_subject13)),0))){
                                             if(((IBool)$constants.get(6)/*true*/).equals($atuple_subscript_int(((ITuple)($tuple_subject13)),2))){
                                                M_IO.println(((IString)$constants.get(7)/*"[INFO] errors have been de-escalated to warnings."*/));
                                                return ((IInteger)SUCCESS_3);
                                             
                                             } else {
                                                continue CASE_1503530496_1_TUPLE;/*computeFail*/
                                             }
                                          }
                                  
                                      } while(false);
                               
                               }
                       
                           } while(false);
                    
                    }
                    if($isSubtypeOf($switchVal10.getType(),$T7)){
                       /*muExists*/CASE_1503530496_2: 
                           do {
                               final ITuple $tuple_subject14 = ((ITuple)($switchVal10));
                               if($tuple_subject14 instanceof ITuple && ((ITuple)$tuple_subject14).arity() == 4){
                                  /*muExists*/CASE_1503530496_2_TUPLE: 
                                      do {
                                          if(((IBool)$constants.get(6)/*true*/).equals($atuple_subscript_int(((ITuple)($tuple_subject14)),1))){
                                             if(((IBool)$constants.get(6)/*true*/).equals($atuple_subscript_int(((ITuple)($tuple_subject14)),3))){
                                                M_IO.println(((IString)$constants.get(8)/*"[INFO] warnings have been escalated to errors"*/));
                                                return ((IInteger)FAILURE_2);
                                             
                                             } else {
                                                continue CASE_1503530496_2_TUPLE;/*computeFail*/
                                             }
                                          } else {
                                             continue CASE_1503530496_2_TUPLE;/*computeFail*/
                                          }
                                      } while(false);
                               
                               }
                       
                           } while(false);
                    
                    }
                    if($isSubtypeOf($switchVal10.getType(),$T7)){
                       /*muExists*/CASE_1503530496_3: 
                           do {
                               final ITuple $tuple_subject15 = ((ITuple)($switchVal10));
                               if($tuple_subject15 instanceof ITuple && ((ITuple)$tuple_subject15).arity() == 4){
                                  /*muExists*/CASE_1503530496_3_TUPLE: 
                                      do {
                                          if(((IBool)$constants.get(1)/*false*/).equals($atuple_subscript_int(((ITuple)($tuple_subject15)),1))){
                                             if(((IBool)$constants.get(1)/*false*/).equals($atuple_subscript_int(((ITuple)($tuple_subject15)),3))){
                                                return ((IInteger)SUCCESS_3);
                                             
                                             } else {
                                                continue CASE_1503530496_3_TUPLE;/*computeFail*/
                                             }
                                          } else {
                                             continue CASE_1503530496_3_TUPLE;/*computeFail*/
                                          }
                                      } while(false);
                               
                               }
                       
                           } while(false);
                    
                    }
        
                }
                
        
            default: /*muExists*/$RET11: 
                         do {
                             if((((IBool)hasErrors_4)).getValue()){
                                return ((IInteger)FAILURE_2);
                             
                             }
                     
                         } while(false);
                     return ((IInteger)SUCCESS_3);
        
        }
        
                   
    }
    
    // Source: |rascal+module:///Message| 
    public IList $getkw_Message_causes(IConstructor $getkw_Message_causes){ 
        
        
        if($getkw_Message_causes.asWithKeywordParameters().hasParameter("causes")){
           return ((IList)(((IList)$getkw_Message_causes.asWithKeywordParameters().getParameter("causes"))));
        
        } else {
           return ((IList)$constants.get(5)/*[]*/);
        
        }
    }
    

    public static void main(String[] args) {
      throw new RuntimeException("No function `main` found in Rascal module `Message`");
    }
}