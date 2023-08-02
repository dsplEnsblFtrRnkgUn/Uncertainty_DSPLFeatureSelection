package SmartHome;
// reconf05.abs:10:0: 
public final class Runtime_ProductImpl_c extends org.abs_models.backend.java.lib.runtime.ABSObject implements org.abs_models.backend.java.lib.types.ABSClass, SmartHome.Runtime_Product_i, SmartHome.Reconfiguration_i, SmartHome.StateUpdate_i {
    private static final java.lang.String[] __fieldNames = new java.lang.String[] {  };
    public final java.util.List<java.lang.String> getFieldNames() { return java.util.Arrays.asList(__fieldNames); }
    public Runtime_ProductImpl_c() {
        getCOG().objectCreated(this);
    }
    protected final void __ABS_init() {
        getCOG().objectInitialized(this);
    }
    protected final org.abs_models.backend.java.lib.types.ABSValue getFieldValue(java.lang.String __ABS_fieldName) throws java.lang.NoSuchFieldException {
        return super.getFieldValue(__ABS_fieldName);
    }
    public final java.lang.String getClassName() { return "Runtime_ProductImpl"; }
    public static final <T extends Runtime_ProductImpl_c> T createNewCOG() { return (T)Runtime_ProductImpl_c.__ABS_createNewCOG(null, null, null); }
    public static final <T extends Runtime_ProductImpl_c> T __ABS_createNewCOG(org.abs_models.backend.java.lib.runtime.ABSObject __ABS_source, org.abs_models.backend.java.scheduling.UserSchedulingStrategy Strategy, ABS.DC.DeploymentComponent_i DC) {
        final org.abs_models.backend.java.lib.runtime.ABSRuntime __ABS_runtime = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime();
        final org.abs_models.backend.java.lib.runtime.COG __ABS_cog = Strategy == null ? __ABS_runtime.createCOG(Runtime_ProductImpl_c.class, DC) : __ABS_runtime.createCOG(Runtime_ProductImpl_c.class, DC, Strategy);
        final org.abs_models.backend.java.lib.runtime.ABSThread __ABS_thread = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentThread();
        final org.abs_models.backend.java.lib.runtime.COG __ABS_oldCOG = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentCOG();
        final org.abs_models.backend.java.lib.runtime.Task __ABS_sendingTask = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentTask();
        __ABS_thread.setCOG(__ABS_cog);
        try {
            Runtime_ProductImpl_c __ABS_result = new Runtime_ProductImpl_c();
            ;
            __ABS_runtime.cogCreated(__ABS_result);
            __ABS_cog.getScheduler().addTask(new org.abs_models.backend.java.lib.runtime.Task(new org.abs_models.backend.java.lib.runtime.ABSInitObjectCall(__ABS_sendingTask,__ABS_source,__ABS_result)));
            __ABS_runtime.asyncCall(new org.abs_models.backend.java.lib.runtime.ABSRunMethodCall(__ABS_sendingTask,__ABS_source,__ABS_result));
            return (T)__ABS_result;
        } finally {
            __ABS_thread.setCOG(__ABS_oldCOG);
        }
    }
    public static final <T extends Runtime_ProductImpl_c> T createNewObject() { return (T)Runtime_ProductImpl_c.__ABS_createNewObject(null); }
    public static final <T extends Runtime_ProductImpl_c> T __ABS_createNewObject(org.abs_models.backend.java.lib.runtime.ABSObject __ABS_source) {
        Runtime_ProductImpl_c __ABS_result = new Runtime_ProductImpl_c();
        __ABS_result.__ABS_init();
        final org.abs_models.backend.java.lib.runtime.Task __ABS_sendingTask = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentTask();
        org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.ABSRunMethodCall(__ABS_sendingTask,__ABS_source,__ABS_result));
        return (T)__ABS_result;
    }
    // reconf05.abs:12:9: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_run() {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<SmartHome.Runtime_ProductImpl_c>(
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
                    return "run";
                }
                public Object call() {
                    return target.run();
                }
            }.init())
        ;
    }
    // reconf05.abs:12:9: 
    public final org.abs_models.backend.java.lib.types.ABSUnit run() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "run");
        }
         {
            ABS.Meta.Product_i currentP = null;

            ABS.Meta.Product_i targetP = null;

            org.abs_models.backend.java.lib.runtime.ABSBuiltInFunctions.println(org.abs_models.backend.java.lib.types.ABSString.fromString("Begining of process!"));
            ABS.Meta.Runtime_i rt = ABS.Meta.Runtime_c.__ABS_createNewCOG(this, null, (ABS.DC.DeploymentComponent_i)(__ABS_getRuntime().getCurrentCOG().getDC()));

            ABS.Meta.ProductLine_i pl = org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(rt).__ABS_isSameCOG() ? rt.getProductLine() : rt.async_getProductLine().get();

            currentP = org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(pl).__ABS_isSameCOG() ? pl.getCurrentProduct() : pl.async_getCurrentProduct().get();
            ABS.Meta.Product_i first = org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(pl).__ABS_isSameCOG() ? pl.getProduct(org.abs_models.backend.java.lib.types.ABSString.fromString("StoreHouse")) : pl.async_getProduct(org.abs_models.backend.java.lib.types.ABSString.fromString("StoreHouse")).get();

            ABS.Meta.Product_i secomd = org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(pl).__ABS_isSameCOG() ? pl.getProduct(org.abs_models.backend.java.lib.types.ABSString.fromString("ResidentalHouse")) : pl.async_getProduct(org.abs_models.backend.java.lib.types.ABSString.fromString("ResidentalHouse")).get();

            org.abs_models.backend.java.lib.types.ABSString st = org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(currentP).__ABS_isSameCOG() ? currentP.getName() : currentP.async_getName().get();

            if (org.abs_models.backend.java.lib.expr.BinOp.eq(st,org.abs_models.backend.java.lib.types.ABSString.fromString("StoreHouse")).toBoolean()) {
                 {
                    targetP = org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(pl).__ABS_isSameCOG() ? pl.getProduct(org.abs_models.backend.java.lib.types.ABSString.fromString("ResidentalHouse")) : pl.async_getProduct(org.abs_models.backend.java.lib.types.ABSString.fromString("ResidentalHouse")).get();
                    setCurrentProduct(targetP);
                    SmartHome.StateUpdate_i upd = getStateUpdate();

                    setStateUpdate(upd);
                }
            }
            return org.abs_models.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // reconf05.abs:29:9: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_setCurrentProduct(ABS.Meta.Product_i p) {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<SmartHome.Runtime_ProductImpl_c>(
            this,
            org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            org.abs_models.backend.java.lib.types.ABSBool.FALSE) {
                ABS.Meta.Product_i arg0;
                public java.util.List<org.abs_models.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new org.abs_models.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public org.abs_models.backend.java.lib.runtime.AsyncCall<?> init(ABS.Meta.Product_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "setCurrentProduct";
                }
                public Object call() {
                    return target.setCurrentProduct(arg0
                    );
                }
            }.init(p))
        ;
    }
    // reconf05.abs:29:9: 
    public final org.abs_models.backend.java.lib.types.ABSUnit setCurrentProduct(ABS.Meta.Product_i p) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setCurrentProduct");
            __ABS_currentTask.setLocalVariable("p",p);
        }
         {
            setCurrentProduct(p);
            return org.abs_models.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // reconf05.abs:30:9: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_setStateUpdate(SmartHome.StateUpdate_i u) {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<SmartHome.Runtime_ProductImpl_c>(
            this,
            org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            org.abs_models.backend.java.lib.types.ABSBool.FALSE) {
                SmartHome.StateUpdate_i arg0;
                public java.util.List<org.abs_models.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new org.abs_models.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public org.abs_models.backend.java.lib.runtime.AsyncCall<?> init(SmartHome.StateUpdate_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "setStateUpdate";
                }
                public Object call() {
                    return target.setStateUpdate(arg0
                    );
                }
            }.init(u))
        ;
    }
    // reconf05.abs:30:9: 
    public final org.abs_models.backend.java.lib.types.ABSUnit setStateUpdate(SmartHome.StateUpdate_i u) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setStateUpdate");
            __ABS_currentTask.setLocalVariable("u",u);
        }
         {
            setStateUpdate(u);
            return org.abs_models.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // reconf05.abs:31:11: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSString> async_getName() {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<SmartHome.Runtime_ProductImpl_c>(
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
                    return "getName";
                }
                public Object call() {
                    return target.getName();
                }
            }.init())
        ;
    }
    // reconf05.abs:31:11: 
    public final org.abs_models.backend.java.lib.types.ABSString getName() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getName");
        }
         {
            org.abs_models.backend.java.lib.types.ABSString getname = org.abs_models.backend.java.lib.types.ABSString.fromString("");

            ABS.Meta.Product_i currentP = null;

            ABS.Meta.Runtime_i rt = ABS.Meta.Runtime_c.__ABS_createNewCOG(this, null, (ABS.DC.DeploymentComponent_i)(__ABS_getRuntime().getCurrentCOG().getDC()));

            ABS.Meta.ProductLine_i pl = org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(rt).__ABS_isSameCOG() ? rt.getProductLine() : rt.async_getProductLine().get();

            currentP = org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(pl).__ABS_isSameCOG() ? pl.getCurrentProduct() : pl.async_getCurrentProduct().get();
            return org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(currentP).__ABS_isSameCOG() ? currentP.getName() : currentP.async_getName().get();
        }
    }
    // reconf05.abs:37:16: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<SmartHome.StateUpdate_i> async_getStateUpdate() {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<SmartHome.Runtime_ProductImpl_c>(
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
                    return "getStateUpdate";
                }
                public Object call() {
                    return target.getStateUpdate();
                }
            }.init())
        ;
    }
    // reconf05.abs:37:16: 
    public final SmartHome.StateUpdate_i getStateUpdate() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getStateUpdate");
        }
         {
            SmartHome.StateUpdate_i update = getStateUpdate();

            setStateUpdate(update);
            return update;
        }
    }
}
