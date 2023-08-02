package ABS.JUnit;
// abs/lang/abslang.abs:1396:0: 
public final class writeTestsuite_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private writeTestsuite_f() { }
    public static org.abs_models.backend.java.lib.types.ABSString apply(ABS.JUnit.Testsuite ts) {
        return (ABS.JUnit.writeWithHeader_f.apply(org.abs_models.backend.java.lib.types.ABSBool.TRUE, ts));
    }
}
