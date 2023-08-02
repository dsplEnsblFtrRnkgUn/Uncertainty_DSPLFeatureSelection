package ABS.StdLib;
// abs/lang/abslang.abs:342:0: 
public final class hasNext_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private hasNext_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue>org.abs_models.backend.java.lib.types.ABSBool apply(ABS.StdLib.Set<A> s) {
        return (ABS.StdLib.emptySet_f.apply(s).negate());
    }
}
