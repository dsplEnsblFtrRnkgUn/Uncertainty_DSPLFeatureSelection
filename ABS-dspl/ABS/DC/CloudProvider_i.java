package ABS.DC;
// abs/lang/abslang.abs:831:0: 
public interface CloudProvider_i extends org.abs_models.backend.java.lib.types.ABSInterface, ABS.StdLib.Object_i {
    // abs/lang/abslang.abs:835:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<ABS.DC.DeploymentComponent_i> async_prelaunchInstance(ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> d);
    // abs/lang/abslang.abs:835:4: 
    public  ABS.DC.DeploymentComponent_i prelaunchInstance(ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> d);
    // abs/lang/abslang.abs:836:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<ABS.DC.DeploymentComponent_i> async_launchInstance(ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> description);
    // abs/lang/abslang.abs:836:4: 
    public  ABS.DC.DeploymentComponent_i launchInstance(ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> description);
    // abs/lang/abslang.abs:839:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSBool> async_acquireInstance(ABS.DC.DeploymentComponent_i instance);
    // abs/lang/abslang.abs:839:4: 
    public  org.abs_models.backend.java.lib.types.ABSBool acquireInstance(ABS.DC.DeploymentComponent_i instance);
    // abs/lang/abslang.abs:840:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSBool> async_releaseInstance(ABS.DC.DeploymentComponent_i instance);
    // abs/lang/abslang.abs:840:4: 
    public  org.abs_models.backend.java.lib.types.ABSBool releaseInstance(ABS.DC.DeploymentComponent_i instance);
    // abs/lang/abslang.abs:841:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSBool> async_shutdownInstance(ABS.DC.DeploymentComponent_i instance);
    // abs/lang/abslang.abs:841:4: 
    public  org.abs_models.backend.java.lib.types.ABSBool shutdownInstance(ABS.DC.DeploymentComponent_i instance);
    // abs/lang/abslang.abs:843:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSRational> async_getAccumulatedCost();
    // abs/lang/abslang.abs:843:4: 
    public  org.abs_models.backend.java.lib.types.ABSRational getAccumulatedCost();
    // abs/lang/abslang.abs:844:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_shutdown();
    // abs/lang/abslang.abs:844:4: 
    public  org.abs_models.backend.java.lib.types.ABSUnit shutdown();
    // abs/lang/abslang.abs:851:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_setInstanceDescriptions(ABS.StdLib.Map<org.abs_models.backend.java.lib.types.ABSString,ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational>> instanceDescriptions);
    // abs/lang/abslang.abs:851:4: 
    public  org.abs_models.backend.java.lib.types.ABSUnit setInstanceDescriptions(ABS.StdLib.Map<org.abs_models.backend.java.lib.types.ABSString,ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational>> instanceDescriptions);
    // abs/lang/abslang.abs:852:2: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_addInstanceDescription(ABS.StdLib.Pair<org.abs_models.backend.java.lib.types.ABSString,ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational>> instanceDescription);
    // abs/lang/abslang.abs:852:2: 
    public  org.abs_models.backend.java.lib.types.ABSUnit addInstanceDescription(ABS.StdLib.Pair<org.abs_models.backend.java.lib.types.ABSString,ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational>> instanceDescription);
    // abs/lang/abslang.abs:853:2: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_removeInstanceDescription(org.abs_models.backend.java.lib.types.ABSString instanceDescriptionName);
    // abs/lang/abslang.abs:853:2: 
    public  org.abs_models.backend.java.lib.types.ABSUnit removeInstanceDescription(org.abs_models.backend.java.lib.types.ABSString instanceDescriptionName);
    // abs/lang/abslang.abs:854:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<ABS.StdLib.Map<org.abs_models.backend.java.lib.types.ABSString,ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational>>> async_getInstanceDescriptions();
    // abs/lang/abslang.abs:854:4: 
    public  ABS.StdLib.Map<org.abs_models.backend.java.lib.types.ABSString,ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational>> getInstanceDescriptions();
    // abs/lang/abslang.abs:855:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<ABS.DC.DeploymentComponent_i> async_prelaunchInstanceNamed(org.abs_models.backend.java.lib.types.ABSString instancename);
    // abs/lang/abslang.abs:855:4: 
    public  ABS.DC.DeploymentComponent_i prelaunchInstanceNamed(org.abs_models.backend.java.lib.types.ABSString instancename);
    // abs/lang/abslang.abs:856:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<ABS.DC.DeploymentComponent_i> async_launchInstanceNamed(org.abs_models.backend.java.lib.types.ABSString instancename);
    // abs/lang/abslang.abs:856:4: 
    public  ABS.DC.DeploymentComponent_i launchInstanceNamed(org.abs_models.backend.java.lib.types.ABSString instancename);
    boolean __ABS_isSameCOG();
}
