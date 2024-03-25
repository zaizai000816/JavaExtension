import static org.mockito.Mockito.*;
import org.sosy_lab.sv_benchmarks.Verifier;

public class ValidationHarness {
    public static void main ( String [] args ) {
        mockStatic(Verifier.class);
        
        // The statement is inserted here
        when(Verifier.nondetInt()).thenReturn(-5);            
        
	    Main.main(new String[0]);
    }
}
