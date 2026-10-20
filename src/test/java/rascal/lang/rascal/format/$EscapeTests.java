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
class $EscapeTests extends org.rascalmpl.runtime.$RascalModule {
    $Escape $me;
    final GenerateActuals generator = new GenerateActuals(5, 5, 10);

    public $EscapeTests(){
        super(new RascalExecutionContext(new InputStreamReader(System.in), new PrintWriter(System.out), new PrintWriter(System.err), null, null, rascal.lang.rascal.format.$Escape.class));
        ModuleStore store = $rex.getModuleStore();
        store.importModule($Escape.class, this.$rex, $Escape::new);   
        $me = store.getModule($Escape.class); 
        $testSetup($Escape.class);                    
    }
    
        
        
        @Test
        void testA$0d9df24a36105704(){
           assertTrue(((IBool)$me.testA()).getValue());
        }
    
        @Test
        void testNl$bc210044f2c965c0(){
           assertTrue(((IBool)$me.testNl()).getValue());
        }
    
        @Test
        void testQuote$cdf2d08b1f3ceb6a(){
           assertTrue(((IBool)$me.testQuote()).getValue());
        }
    
        @Test
        void testEOF$251eb3d4fb483d67(){
           assertTrue(((IBool)$me.testEOF()).getValue());
        }
    
        @Test
        void testHex$b07e24ea98bb5775(){
           assertTrue(((IBool)$me.testHex()).getValue());
        }
    
        
        
        

}
