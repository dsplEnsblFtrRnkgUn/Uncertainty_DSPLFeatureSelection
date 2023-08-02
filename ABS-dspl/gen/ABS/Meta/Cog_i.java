package ABS.Meta;
// abs/lang/abslang.abs:1283:0: 
public interface Cog_i extends org.abs_models.backend.java.lib.types.ABSInterface, ABS.StdLib.Object_i {
    // abs/lang/abslang.abs:1284:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_setScheduler(ABS.Meta.ProcessScheduler_i sched);
    // abs/lang/abslang.abs:1284:4: 
    public  org.abs_models.backend.java.lib.types.ABSUnit setScheduler(ABS.Meta.ProcessScheduler_i sched);
    // abs/lang/abslang.abs:1285:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_info();
    // abs/lang/abslang.abs:1285:4: 
    public  org.abs_models.backend.java.lib.types.ABSUnit info();
    boolean __ABS_isSameCOG();
}
