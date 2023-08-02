package ABS.DC;
// abs/lang/abslang.abs:790:0: 
public interface DeploymentComponent_i extends org.abs_models.backend.java.lib.types.ABSInterface, ABS.StdLib.Object_i {
    // abs/lang/abslang.abs:793:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSRational> async_load(ABS.DC.Resourcetype rtype, org.abs_models.backend.java.lib.types.ABSInteger periods);
    // abs/lang/abslang.abs:793:4: 
    public  org.abs_models.backend.java.lib.types.ABSRational load(ABS.DC.Resourcetype rtype, org.abs_models.backend.java.lib.types.ABSInteger periods);
    // abs/lang/abslang.abs:795:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<ABS.DC.InfRat> async_total(ABS.DC.Resourcetype rtype);
    // abs/lang/abslang.abs:795:4: 
    public  ABS.DC.InfRat total(ABS.DC.Resourcetype rtype);
    // abs/lang/abslang.abs:798:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSRational> async_transfer(ABS.DC.DeploymentComponent_i target, org.abs_models.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype);
    // abs/lang/abslang.abs:798:4: 
    public  org.abs_models.backend.java.lib.types.ABSRational transfer(ABS.DC.DeploymentComponent_i target, org.abs_models.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype);
    // abs/lang/abslang.abs:802:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSRational> async_decrementResources(org.abs_models.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype);
    // abs/lang/abslang.abs:802:4: 
    public  org.abs_models.backend.java.lib.types.ABSRational decrementResources(org.abs_models.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype);
    // abs/lang/abslang.abs:806:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSRational> async_incrementResources(org.abs_models.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype);
    // abs/lang/abslang.abs:806:4: 
    public  org.abs_models.backend.java.lib.types.ABSRational incrementResources(org.abs_models.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype);
    // abs/lang/abslang.abs:808:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSString> async_getName();
    // abs/lang/abslang.abs:808:4: 
    public  org.abs_models.backend.java.lib.types.ABSString getName();
    // abs/lang/abslang.abs:810:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<ABS.DC.CloudProvider_i> async_getProvider();
    // abs/lang/abslang.abs:810:4: 
    public  ABS.DC.CloudProvider_i getProvider();
    // abs/lang/abslang.abs:811:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<ABS.StdLib.Time> async_getCreationTime();
    // abs/lang/abslang.abs:811:4: 
    public  ABS.StdLib.Time getCreationTime();
    // abs/lang/abslang.abs:812:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSRational> async_getStartupDuration();
    // abs/lang/abslang.abs:812:4: 
    public  org.abs_models.backend.java.lib.types.ABSRational getStartupDuration();
    // abs/lang/abslang.abs:813:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSRational> async_getShutdownDuration();
    // abs/lang/abslang.abs:813:4: 
    public  org.abs_models.backend.java.lib.types.ABSRational getShutdownDuration();
    // abs/lang/abslang.abs:814:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSInteger> async_getPaymentInterval();
    // abs/lang/abslang.abs:814:4: 
    public  org.abs_models.backend.java.lib.types.ABSInteger getPaymentInterval();
    // abs/lang/abslang.abs:815:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSRational> async_getCostPerInterval();
    // abs/lang/abslang.abs:815:4: 
    public  org.abs_models.backend.java.lib.types.ABSRational getCostPerInterval();
    // abs/lang/abslang.abs:816:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSRational> async_getAccumulatedCost();
    // abs/lang/abslang.abs:816:4: 
    public  org.abs_models.backend.java.lib.types.ABSRational getAccumulatedCost();
    // abs/lang/abslang.abs:817:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSRational> async_getNumberOfCores();
    // abs/lang/abslang.abs:817:4: 
    public  org.abs_models.backend.java.lib.types.ABSRational getNumberOfCores();
    // abs/lang/abslang.abs:820:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSBool> async_acquire();
    // abs/lang/abslang.abs:820:4: 
    public  org.abs_models.backend.java.lib.types.ABSBool acquire();
    // abs/lang/abslang.abs:821:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSBool> async_release();
    // abs/lang/abslang.abs:821:4: 
    public  org.abs_models.backend.java.lib.types.ABSBool release();
    // abs/lang/abslang.abs:824:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSBool> async_shutdown();
    // abs/lang/abslang.abs:824:4: 
    public  org.abs_models.backend.java.lib.types.ABSBool shutdown();
    boolean __ABS_isSameCOG();
}
