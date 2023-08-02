package ABS.StdLib;
// abs/lang/abslang.abs:233:0: 
public final class elements_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private elements_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue>ABS.StdLib.List<A> apply(ABS.StdLib.Set<A> xs) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public ABS.StdLib.List<A> of(final ABS.StdLib.Set<A> xs, final ABS.StdLib.Set<A> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Set_EmptySet.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.StdLib.List<A> execute() { return new ABS.StdLib.List_Nil<>(); }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Set_Insert.class,new org.abs_models.backend.java.lib.expr.PatternVariable("s"),new org.abs_models.backend.java.lib.expr.PatternVariable("ss")).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public ABS.StdLib.List<A> execute(final A s, final ABS.StdLib.Set<A> ss) { return new ABS.StdLib.List_Cons<>(s, ABS.StdLib.elements_f.apply(ss)); }
                }.execute((A) __ABS_binding1.getBinding(0),(ABS.StdLib.Set<A>) __ABS_binding1.getBinding(1));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:234:2:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(xs, xs));
    }
}
