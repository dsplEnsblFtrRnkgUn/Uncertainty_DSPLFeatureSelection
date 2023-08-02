package ABS.StdLib;
// abs/lang/abslang.abs:487:0: 
public final class lookupUnsafe_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private lookupUnsafe_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue,B extends org.abs_models.backend.java.lib.types.ABSValue>B apply(ABS.StdLib.Map<A,B> ms, A k) {
        return (ABS.StdLib.fromJust_f.apply(ABS.StdLib.lookup_f.apply(ms, k)));
    }
}
