package rascal.lang.rascal.format;
import java.util.*;
import java.util.stream.Stream;
import io.usethesource.vallang.*;
import io.usethesource.vallang.type.*;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import org.junit.jupiter.api.Test;
import org.junit.Ignore;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.rascalmpl.runtime.utils.*;
import org.rascalmpl.runtime.*;
import org.rascalmpl.exceptions.Throw;
import org.rascalmpl.exceptions.RuntimeExceptionFactory;
import org.rascalmpl.values.RascalValueFactory;
import org.rascalmpl.values.parsetrees.ITree;

@SuppressWarnings("unused")
class $GrammarTests extends org.rascalmpl.runtime.$RascalModule {
    $Grammar $me;
    final GenerateActuals generator = new GenerateActuals(5, 5, 10);

    public $GrammarTests(){
        super(new RascalExecutionContext(new InputStreamReader(System.in), new PrintWriter(System.out), new PrintWriter(System.err), null, null, rascal.lang.rascal.format.$Grammar.class));
        ModuleStore store = $rex.getModuleStore();
        store.importModule($Grammar.class, this.$rex, $Grammar::new);   
        $me = store.getModule($Grammar.class); 
        $testSetup($Grammar.class);                    
    }
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        @Test
        void noAttrs$139c6199ae2382e0(){
           assertTrue(((IBool)$me.noAttrs()).getValue());
        }
    
        @Test
        void AttrsAndCons$e7dcc0de93fa24cb(){
           assertTrue(((IBool)$me.AttrsAndCons()).getValue());
        }
    
        @Test
        void CC$738640bf4bab8091(){
           assertTrue(((IBool)$me.CC()).getValue());
        }
    
        @Test
        void Prio$b36d918435c16507(){
           assertTrue(((IBool)$me.Prio()).getValue());
        }
    
        
        
        
        
        
        

}
