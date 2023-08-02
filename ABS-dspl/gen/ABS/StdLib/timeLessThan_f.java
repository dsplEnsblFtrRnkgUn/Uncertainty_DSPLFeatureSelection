package ABS.StdLib;
// abs/lang/abslang.abs:566:0: 
public final class timeLessThan_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private timeLessThan_f() { }
    public static org.abs_models.backend.java.lib.types.ABSBool apply(ABS.StdLib.Time t1, ABS.StdLib.Time t2) {
        return (org.abs_models.backend.java.lib.expr.BinOp.lt(ABS.StdLib.timeValue_f.apply(t1),ABS.StdLib.timeValue_f.apply(t2)));
    }
}
