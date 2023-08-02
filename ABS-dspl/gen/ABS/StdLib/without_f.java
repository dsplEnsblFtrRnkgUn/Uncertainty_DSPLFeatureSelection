package ABS.StdLib;
// abs/lang/abslang.abs:381:0: 
public final class without_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private without_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue>ABS.StdLib.List<A> apply(ABS.StdLib.List<A> list, A a) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public ABS.StdLib.List<A> of(final A a, final ABS.StdLib.List<A> list, final ABS.StdLib.List<A> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.List_Nil.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.StdLib.List<A> execute() { return new ABS.StdLib.List_Nil<>(); }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.List_Cons.class,new org.abs_models.backend.java.lib.expr.PatternValue(a),new org.abs_models.backend.java.lib.expr.PatternVariable("tail")).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public ABS.StdLib.List<A> execute(final ABS.StdLib.List<A> tail) { return ABS.StdLib.without_f.apply(tail, a); }
                }.execute((ABS.StdLib.List<A>) __ABS_binding1.getBinding(0));
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding2 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.List_Cons.class,new org.abs_models.backend.java.lib.expr.PatternVariable("x"),new org.abs_models.backend.java.lib.expr.PatternVariable("tail")).match(__ABS_value);
                if (__ABS_binding2 != null) return new Object() {
                    public ABS.StdLib.List<A> execute(final A x, final ABS.StdLib.List<A> tail) { return new ABS.StdLib.List_Cons<>(x, ABS.StdLib.without_f.apply(tail, a)); }
                }.execute((A) __ABS_binding2.getBinding(0),(ABS.StdLib.List<A>) __ABS_binding2.getBinding(1));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:382:2:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(a, list, list));
    }
}
