package ABS.DC;
// abs/lang/abslang.abs:786:0: 
public final class averageDivsN_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private averageDivsN_f() { }
    public static org.abs_models.backend.java.lib.types.ABSRational apply(ABS.StdLib.List<org.abs_models.backend.java.lib.types.ABSRational> consumeds, ABS.StdLib.List<org.abs_models.backend.java.lib.types.ABSRational> totals, org.abs_models.backend.java.lib.types.ABSInteger length) {
        return (new org.abs_models.backend.java.lib.expr.Let() { public org.abs_models.backend.java.lib.types.ABSRational in(final ABS.StdLib.List<org.abs_models.backend.java.lib.types.ABSRational> totals, final ABS.StdLib.List<org.abs_models.backend.java.lib.types.ABSRational> consumeds, final org.abs_models.backend.java.lib.types.ABSInteger mins) { return org.abs_models.backend.java.lib.expr.BinOp.eq(mins,org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L)).toBoolean() ? org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L) : ABS.DC.sumDivsN_f.apply(consumeds, totals, mins).divide(mins); }}.in(totals, consumeds, ABS.StdLib.min_f.apply(length, ABS.StdLib.min_f.apply(ABS.StdLib.length_f.apply(consumeds), ABS.StdLib.length_f.apply(totals)))));
    }
}
