package ABS.JUnit;
// abs/lang/abslang.abs:1366:0: 
public final class render_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private render_f() { }
    public static org.abs_models.backend.java.lib.types.ABSString apply(ABS.JUnit.Testcase tc) {
        return (new org.abs_models.backend.java.lib.expr.Let() { public org.abs_models.backend.java.lib.types.ABSString in(final ABS.JUnit.Testcase tc, final org.abs_models.backend.java.lib.types.ABSString res) { return new org.abs_models.backend.java.lib.expr.Case() {
            public org.abs_models.backend.java.lib.types.ABSString of(final org.abs_models.backend.java.lib.types.ABSString res, final ABS.JUnit.Testcase tc, final ABS.JUnit.Result __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.JUnit.Result_Passed.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSString execute() { return res; }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.JUnit.Result_Skipped.class).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSString execute() { return res.add(org.abs_models.backend.java.lib.types.ABSString.fromString("<skipped />\n")); }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding2 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.JUnit.Result_Error.class,new org.abs_models.backend.java.lib.expr.PatternVariable("msg")).match(__ABS_value);
                if (__ABS_binding2 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSString execute(final org.abs_models.backend.java.lib.types.ABSString msg) { return res.add(org.abs_models.backend.java.lib.types.ABSString.fromString("<error message=\"")).add(msg).add(org.abs_models.backend.java.lib.types.ABSString.fromString("\" />\n")); }
                }.execute((org.abs_models.backend.java.lib.types.ABSString) __ABS_binding2.getBinding(0));
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding3 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.JUnit.Result_Failure.class,new org.abs_models.backend.java.lib.expr.PatternVariable("msg")).match(__ABS_value);
                if (__ABS_binding3 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSString execute(final org.abs_models.backend.java.lib.types.ABSString msg) { return res.add(org.abs_models.backend.java.lib.types.ABSString.fromString("<failure message=\"")).add(msg).add(org.abs_models.backend.java.lib.types.ABSString.fromString("\" />\n")); }
                }.execute((org.abs_models.backend.java.lib.types.ABSString) __ABS_binding3.getBinding(0));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:1368:2:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(res, tc, ABS.JUnit.result_f.apply(tc)).add(new org.abs_models.backend.java.lib.expr.Case() {
            public org.abs_models.backend.java.lib.types.ABSString of(final ABS.JUnit.Testcase tc, final ABS.StdLib.Maybe<org.abs_models.backend.java.lib.types.ABSString> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Maybe_Nothing.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSString execute() { return org.abs_models.backend.java.lib.types.ABSString.fromString(""); }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Maybe_Just.class,new org.abs_models.backend.java.lib.expr.PatternVariable("msg")).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSString execute(final org.abs_models.backend.java.lib.types.ABSString msg) { return org.abs_models.backend.java.lib.types.ABSString.fromString("<system-out>\n").add(msg).add(org.abs_models.backend.java.lib.types.ABSString.fromString("\n</system-out>\n")); }
                }.execute((org.abs_models.backend.java.lib.types.ABSString) __ABS_binding1.getBinding(0));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:1375:2:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(tc, ABS.JUnit.stdout_f.apply(tc))).add(new org.abs_models.backend.java.lib.expr.Case() {
            public org.abs_models.backend.java.lib.types.ABSString of(final ABS.JUnit.Testcase tc, final ABS.StdLib.Maybe<org.abs_models.backend.java.lib.types.ABSString> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Maybe_Nothing.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSString execute() { return org.abs_models.backend.java.lib.types.ABSString.fromString(""); }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Maybe_Just.class,new org.abs_models.backend.java.lib.expr.PatternVariable("msg")).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSString execute(final org.abs_models.backend.java.lib.types.ABSString msg) { return org.abs_models.backend.java.lib.types.ABSString.fromString("<system-err>\n").add(msg).add(org.abs_models.backend.java.lib.types.ABSString.fromString("\n</system-err>\n")); }
                }.execute((org.abs_models.backend.java.lib.types.ABSString) __ABS_binding1.getBinding(0));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:1379:2:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(tc, ABS.JUnit.stderr_f.apply(tc))).add(org.abs_models.backend.java.lib.types.ABSString.fromString("</testcase>\n")); }}.in(tc, org.abs_models.backend.java.lib.types.ABSString.fromString("<testcase name=\"").add(ABS.JUnit.tcname_f.apply(tc)).add(org.abs_models.backend.java.lib.types.ABSString.fromString("\" classname=\"")).add(ABS.JUnit.tcclassname_f.apply(tc)).add(org.abs_models.backend.java.lib.types.ABSString.fromString("\">\n"))));
    }
}
