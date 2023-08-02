package ABS.StdLib;
// abs/lang/abslang.abs:292:0: 
public final class isSubset_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private isSubset_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue>org.abs_models.backend.java.lib.types.ABSBool apply(ABS.StdLib.Set<A> maybe_subset, ABS.StdLib.Set<A> set) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public org.abs_models.backend.java.lib.types.ABSBool of(final ABS.StdLib.Set<A> set, final ABS.StdLib.Set<A> maybe_subset, final ABS.StdLib.Set<A> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Set_EmptySet.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSBool execute() { return org.abs_models.backend.java.lib.types.ABSBool.TRUE; }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Set_Insert.class,new org.abs_models.backend.java.lib.expr.PatternVariable("elem"),new org.abs_models.backend.java.lib.expr.PatternVariable("rest")).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSBool execute(final A elem, final ABS.StdLib.Set<A> rest) { return ABS.StdLib.contains_f.apply(set, elem).and(ABS.StdLib.isSubset_f.apply(rest, set)); }
                }.execute((A) __ABS_binding1.getBinding(0),(ABS.StdLib.Set<A>) __ABS_binding1.getBinding(1));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:293:4:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(set, maybe_subset, maybe_subset));
    }
}
