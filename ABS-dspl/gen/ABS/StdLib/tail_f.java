package ABS.StdLib;
// abs/lang/abslang.abs:351:34: 
public final class tail_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private tail_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue>ABS.StdLib.List<A> apply(ABS.StdLib.List<A> data) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public ABS.StdLib.List<A> of(final ABS.StdLib.List<A> data, final ABS.StdLib.List<A> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.List_Cons.class,new org.abs_models.backend.java.lib.expr.AnyPattern(),new org.abs_models.backend.java.lib.expr.PatternVariable("res")).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.StdLib.List<A> execute(final ABS.StdLib.List<A> res) { return res; }
                }.execute((ABS.StdLib.List<A>) __ABS_binding0.getBinding(0));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:351:34:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(data, data));
    }
}
