package rascal.util;
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
class $MonitorTests extends org.rascalmpl.runtime.$RascalModule {
    $Monitor $me;
    final GenerateActuals generator = new GenerateActuals(5, 5, 10);

    public $MonitorTests(){
        super(new RascalExecutionContext(new InputStreamReader(System.in), new PrintWriter(System.out), new PrintWriter(System.err), null, null, rascal.util.$Monitor.class));
        ModuleStore store = $rex.getModuleStore();
        store.importModule($Monitor.class, this.$rex, $Monitor::new);   
        $me = store.getModule($Monitor.class); 
        $testSetup($Monitor.class);                    
    }
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        @Test
        void horseRaceTest$7b7675f6d9fc5698(){
           assertTrue(((IBool)$me.horseRaceTest()).getValue());
        }
    
        @Test
        void simpleAsyncPrintTest$b3a03e0a02d8b960(){
           assertTrue(((IBool)$me.simpleAsyncPrintTest()).getValue());
        }
    
        @Test
        void unfinishedInputTest$af9ffa4d1a19da59(){
           assertTrue(((IBool)$me.unfinishedInputTest()).getValue());
        }
    
        @Test
        void unfinishedLinesAtTheEndTest$addd78bcfcb11051(){
           assertTrue(((IBool)$me.unfinishedLinesAtTheEndTest()).getValue());
        }
    
        @Test
        void printLongUnfinishedLine$81b393cf508ee9cd(){
           assertTrue(((IBool)$me.printLongUnfinishedLine()).getValue());
        }
    

}
