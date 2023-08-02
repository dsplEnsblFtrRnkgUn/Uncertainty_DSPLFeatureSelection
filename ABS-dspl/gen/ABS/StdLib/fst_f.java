package ABS.StdLib;
// abs/lang/abslang.abs:183:23: 
public final class fst_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private fst_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue,B extends org.abs_models.backend.java.lib.types.ABSValue>A apply(ABS.StdLib.Pair<A,B> data) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public A of(final ABS.StdLib.Pair<A,B> data, final ABS.StdLib.Pair<A,B> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Pair_Pair.class,new org.abs_models.backend.java.lib.expr.PatternVariable("res"),new org.abs_models.backend.java.lib.expr.AnyPattern()).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public A execute(final A res) { return res; }
                }.execute((A) __ABS_binding0.getBinding(0));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:183:23:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(data, data));
    }
}
