package ABS.DC;
// abs/lang/abslang.abs:859:0: 
public interface CloudProviderForDeploymentComponent_i extends org.abs_models.backend.java.lib.types.ABSInterface, ABS.DC.CloudProvider_i {
    // abs/lang/abslang.abs:860:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_internalShutdownInstance(ABS.DC.DeploymentComponentForCloudProvider_i instance);
    // abs/lang/abslang.abs:860:4: 
    public  org.abs_models.backend.java.lib.types.ABSUnit internalShutdownInstance(ABS.DC.DeploymentComponentForCloudProvider_i instance);
    boolean __ABS_isSameCOG();
}
