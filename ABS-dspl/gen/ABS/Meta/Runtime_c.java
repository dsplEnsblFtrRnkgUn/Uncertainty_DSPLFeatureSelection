package ABS.Meta;
// abs/lang/abslang.abs:1263:0: 
public final class Runtime_c extends org.abs_models.backend.java.lib.runtime.ABSObject implements org.abs_models.backend.java.lib.types.ABSClass, ABS.Meta.Runtime_i {
    private static final java.lang.String[] __fieldNames = new java.lang.String[] {  };
    public final java.util.List<java.lang.String> getFieldNames() { return java.util.Arrays.asList(__fieldNames); }
    public Runtime_c() {
        getCOG().objectCreated(this);
    }
    protected final void __ABS_init() {
        getCOG().objectInitialized(this);
    }
    protected final org.abs_models.backend.java.lib.types.ABSValue getFieldValue(java.lang.String __ABS_fieldName) throws java.lang.NoSuchFieldException {
        return super.getFieldValue(__ABS_fieldName);
    }
    public final java.lang.String getClassName() { return "Runtime"; }
    public static final <T extends Runtime_c> T createNewCOG() { return (T)Runtime_c.__ABS_createNewCOG(null, null, null); }
    public static final <T extends Runtime_c> T __ABS_createNewCOG(org.abs_models.backend.java.lib.runtime.ABSObject __ABS_source, org.abs_models.backend.java.scheduling.UserSchedulingStrategy Strategy, ABS.DC.DeploymentComponent_i DC) {
        final org.abs_models.backend.java.lib.runtime.ABSRuntime __ABS_runtime = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime();
        final org.abs_models.backend.java.lib.runtime.COG __ABS_cog = Strategy == null ? __ABS_runtime.createCOG(Runtime_c.class, DC) : __ABS_runtime.createCOG(Runtime_c.class, DC, Strategy);
        final org.abs_models.backend.java.lib.runtime.ABSThread __ABS_thread = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentThread();
        final org.abs_models.backend.java.lib.runtime.COG __ABS_oldCOG = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentCOG();
        final org.abs_models.backend.java.lib.runtime.Task __ABS_sendingTask = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentTask();
        __ABS_thread.setCOG(__ABS_cog);
        try {
            Runtime_c __ABS_result = new Runtime_c();
            ;
            __ABS_runtime.cogCreated(__ABS_result);
            __ABS_cog.getScheduler().addTask(new org.abs_models.backend.java.lib.runtime.Task(new org.abs_models.backend.java.lib.runtime.ABSInitObjectCall(__ABS_sendingTask,__ABS_source,__ABS_result)));
            return (T)__ABS_result;
        } finally {
            __ABS_thread.setCOG(__ABS_oldCOG);
        }
    }
    public static final <T extends Runtime_c> T createNewObject() { return (T)Runtime_c.__ABS_createNewObject(null); }
    public static final <T extends Runtime_c> T __ABS_createNewObject(org.abs_models.backend.java.lib.runtime.ABSObject __ABS_source) {
        Runtime_c __ABS_result = new Runtime_c();
        __ABS_result.__ABS_init();
        return (T)__ABS_result;
    }
    // abs/lang/abslang.abs:1264:27: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<ABS.Meta.ProductLine_i> async_getProductLine() {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.Meta.Runtime_c>(
            this,
            org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            org.abs_models.backend.java.lib.types.ABSBool.FALSE) {
                public java.util.List<org.abs_models.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new org.abs_models.backend.java.lib.types.ABSValue[] {
                    });
                }
                public org.abs_models.backend.java.lib.runtime.AsyncCall<?> init() {
                    return this;
                }
                public java.lang.String methodName() {
                    return "getProductLine";
                }
                public Object call() {
                    return target.getProductLine();
                }
            }.init())
        ;
    }
    // abs/lang/abslang.abs:1264:27: 
    public final ABS.Meta.ProductLine_i getProductLine() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getProductLine");
        }
         {
            return ((ABS.Meta.ProductLine_i)org.abs_models.backend.java.lib.runtime.ABSBuiltInFunctions.getProductLine());
        }
    }
}
