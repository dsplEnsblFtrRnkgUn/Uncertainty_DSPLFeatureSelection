package ABS.StdLib;
// abs/lang/abslang.abs:200:0: 
public final class set_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private set_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue>ABS.StdLib.Set<A> apply(ABS.StdLib.List<A> l) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public ABS.StdLib.Set<A> of(final ABS.StdLib.List<A> l, final ABS.StdLib.List<A> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.List_Nil.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.StdLib.Set<A> execute() { return new ABS.StdLib.Set_EmptySet<>(); }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.List_Cons.class,new org.abs_models.backend.java.lib.expr.PatternVariable("x"),new org.abs_models.backend.java.lib.expr.PatternVariable("xs")).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public ABS.StdLib.Set<A> execute(final A x, final ABS.StdLib.List<A> xs) { return ABS.StdLib.insertElement_f.apply(ABS.StdLib.set_f.apply(xs), x); }
                }.execute((A) __ABS_binding1.getBinding(0),(ABS.StdLib.List<A>) __ABS_binding1.getBinding(1));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:201:4:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(l, l));
    }
}
