package ABS.StdLib;
// abs/lang/abslang.abs:95:0: 
public final class min_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private min_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue>A apply(A a, A b) {
        return (org.abs_models.backend.java.lib.expr.BinOp.lt(a,b).toBoolean() ? a : b);
    }
}
