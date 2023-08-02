package ABS.DC;
// abs/lang/abslang.abs:781:0: 
public final class sumDivsN_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private sumDivsN_f() { }
    public static org.abs_models.backend.java.lib.types.ABSRational apply(ABS.StdLib.List<org.abs_models.backend.java.lib.types.ABSRational> consumeds, ABS.StdLib.List<org.abs_models.backend.java.lib.types.ABSRational> totals, org.abs_models.backend.java.lib.types.ABSInteger n) {
        return (org.abs_models.backend.java.lib.expr.BinOp.eq(n,org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L)).or(ABS.StdLib.isEmpty_f.apply(consumeds)).or(ABS.StdLib.isEmpty_f.apply(totals)).toBoolean() ? org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L) : ABS.StdLib.head_f.apply(consumeds).multiply(org.abs_models.backend.java.lib.types.ABSInteger.fromLong(100L)).divide(ABS.StdLib.head_f.apply(totals)).add(ABS.DC.sumDivsN_f.apply(ABS.StdLib.tail_f.apply(consumeds), ABS.StdLib.tail_f.apply(totals), n.subtract(org.abs_models.backend.java.lib.types.ABSInteger.fromLong(1L)))));
    }
}
