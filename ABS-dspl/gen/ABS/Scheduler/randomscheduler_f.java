package ABS.Scheduler;
// abs/lang/abslang.abs:736:0: 
public final class randomscheduler_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private randomscheduler_f() { }
    public static org.abs_models.backend.java.lib.types.ABSProcess apply(ABS.StdLib.List<org.abs_models.backend.java.lib.types.ABSProcess> queue) {
        return (ABS.StdLib.nth_f.apply(queue, org.abs_models.backend.java.lib.runtime.ABSBuiltInFunctions.random(ABS.StdLib.length_f.apply(queue))));
    }
}
