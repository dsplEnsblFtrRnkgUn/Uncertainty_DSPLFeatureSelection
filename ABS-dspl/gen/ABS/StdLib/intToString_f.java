package ABS.StdLib;
// abs/lang/abslang.abs:525:0: 
public final class intToString_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private intToString_f() { }
    public static org.abs_models.backend.java.lib.types.ABSString apply(org.abs_models.backend.java.lib.types.ABSInteger n) {
        return (org.abs_models.backend.java.lib.runtime.ABSBuiltInFunctions.toString(n));
    }
}
