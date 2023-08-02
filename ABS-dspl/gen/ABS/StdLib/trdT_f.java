package ABS.StdLib;
// abs/lang/abslang.abs:185:46: 
public final class trdT_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private trdT_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue,B extends org.abs_models.backend.java.lib.types.ABSValue,C extends org.abs_models.backend.java.lib.types.ABSValue>C apply(ABS.StdLib.Triple<A,B,C> data) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public C of(final ABS.StdLib.Triple<A,B,C> data, final ABS.StdLib.Triple<A,B,C> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Triple_Triple.class,new org.abs_models.backend.java.lib.expr.AnyPattern(),new org.abs_models.backend.java.lib.expr.AnyPattern(),new org.abs_models.backend.java.lib.expr.PatternVariable("res")).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public C execute(final C res) { return res; }
                }.execute((C) __ABS_binding0.getBinding(0));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:185:46:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(data, data));
    }
}
