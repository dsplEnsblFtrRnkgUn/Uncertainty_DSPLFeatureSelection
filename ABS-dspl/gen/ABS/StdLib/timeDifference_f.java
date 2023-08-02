package ABS.StdLib;
// abs/lang/abslang.abs:564:0: 
public final class timeDifference_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private timeDifference_f() { }
    public static org.abs_models.backend.java.lib.types.ABSRational apply(ABS.StdLib.Time t1, ABS.StdLib.Time t2) {
        return (ABS.StdLib.abs___f.apply(ABS.StdLib.timeValue_f.apply(t2).subtract(ABS.StdLib.timeValue_f.apply(t1))));
    }
}
