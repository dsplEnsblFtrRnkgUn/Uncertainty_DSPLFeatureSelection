package ABS.StdLib;
// abs/lang/abslang.abs:219:0: 
public final class emptySet_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private emptySet_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue>org.abs_models.backend.java.lib.types.ABSBool apply(ABS.StdLib.Set<A> xs) {
        return (org.abs_models.backend.java.lib.expr.BinOp.eq(xs,new ABS.StdLib.Set_EmptySet<>()));
    }
}
