package rascal.analysis.diff.edits;
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
public class $FileSystemChanges 
    extends
        org.rascalmpl.runtime.$RascalModule
    implements 
    	rascal.analysis.diff.edits.$FileSystemChanges_$I {

    private final $FileSystemChanges_$I $me;
    private final IList $constants;
    
    

    
    
    public final io.usethesource.vallang.type.Type $T2;	/*aloc(alabel="to")*/
    public final io.usethesource.vallang.type.Type $T0;	/*aloc(alabel="file")*/
    public final io.usethesource.vallang.type.Type $T1;	/*aloc(alabel="from")*/
    public final io.usethesource.vallang.type.Type ADT_FileSystemChange;	/*aadt("FileSystemChange",[],dataSyntax())*/
    public final io.usethesource.vallang.type.Type FileSystemChange_removed_loc;	/*acons(aadt("FileSystemChange",[],dataSyntax()),[aloc(alabel="file")],[],alabel="removed")*/
    public final io.usethesource.vallang.type.Type FileSystemChange_created_loc;	/*acons(aadt("FileSystemChange",[],dataSyntax()),[aloc(alabel="file")],[],alabel="created")*/
    public final io.usethesource.vallang.type.Type FileSystemChange_renamed_loc_loc;	/*acons(aadt("FileSystemChange",[],dataSyntax()),[aloc(alabel="from"),aloc(alabel="to")],[],alabel="renamed")*/
    public final io.usethesource.vallang.type.Type FileSystemChange_changed_loc;	/*acons(aadt("FileSystemChange",[],dataSyntax()),[aloc(alabel="file")],[],alabel="changed")*/

    public $FileSystemChanges(RascalExecutionContext rex){
        this(rex, null);
    }
    
    public $FileSystemChanges(RascalExecutionContext rex, Object extended){
       super(rex);
       this.$me = extended == null ? this : ($FileSystemChanges_$I)extended;
       ModuleStore mstore = rex.getModuleStore();
       mstore.put(rascal.analysis.diff.edits.$FileSystemChanges.class, this);
        
        
       
                          
       
       
       $constants = readBinaryConstantsFile(this.getClass(), "rascal/analysis/diff/edits/$FileSystemChanges.constants", 0, "d751713988987e9331980363e24189ce");
       ADT_FileSystemChange = $adt("FileSystemChange");
       $T2 = $TF.sourceLocationType();
       $T0 = $TF.sourceLocationType();
       $T1 = $TF.sourceLocationType();
       FileSystemChange_removed_loc = $TF.constructor($TS, ADT_FileSystemChange, "removed", $TF.sourceLocationType(), "file");
       FileSystemChange_created_loc = $TF.constructor($TS, ADT_FileSystemChange, "created", $TF.sourceLocationType(), "file");
       FileSystemChange_renamed_loc_loc = $TF.constructor($TS, ADT_FileSystemChange, "renamed", $TF.sourceLocationType(), "from", $TF.sourceLocationType(), "to");
       FileSystemChange_changed_loc = $TF.constructor($TS, ADT_FileSystemChange, "changed", $TF.sourceLocationType(), "file");
    
       
       
    }
    
    
    public static void main(String[] args) {
      throw new RuntimeException("No function `main` found in Rascal module `analysis::diff::edits::FileSystemChanges`");
    }
}