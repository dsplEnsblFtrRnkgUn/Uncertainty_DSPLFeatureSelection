package ABS.StdLib;
// abs/lang/abslang.abs:183:30: 
public final class snd_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private snd_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue,B extends org.abs_models.backend.java.lib.types.ABSValue>B apply(ABS.StdLib.Pair<A,B> data) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public B of(final ABS.StdLib.Pair<A,B> data, final ABS.StdLib.Pair<A,B> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Pair_Pair.class,new org.abs_models.backend.java.lib.expr.AnyPattern(),new org.abs_models.backend.java.lib.expr.PatternVariable("res")).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public B execute(final B res) { return res; }
                }.execute((B) __ABS_binding0.getBinding(0));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:183:30:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(data, data));
    }
}
