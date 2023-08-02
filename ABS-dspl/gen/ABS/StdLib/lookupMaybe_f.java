package ABS.StdLib;
// abs/lang/abslang.abs:481:0: 
public final class lookupMaybe_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private lookupMaybe_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue,B extends org.abs_models.backend.java.lib.types.ABSValue>ABS.StdLib.Maybe<B> apply(ABS.StdLib.Map<A,B> ms, A k) {
        return (ABS.StdLib.lookup_f.apply(ms, k));
    }
}
