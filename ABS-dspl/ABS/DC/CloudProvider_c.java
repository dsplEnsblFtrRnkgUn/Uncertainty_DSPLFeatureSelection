package ABS.DC;
// abs/lang/abslang.abs:864:0: 
public final class CloudProvider_c extends org.abs_models.backend.java.lib.runtime.ABSObject implements org.abs_models.backend.java.lib.types.ABSClass, ABS.DC.CloudProviderForDeploymentComponent_i {
    private static final java.lang.String[] __fieldNames = new java.lang.String[] { "name", "instanceDescriptions", "launchedInstances", "acquiredInstances", "killedInstances", "nextInstanceId", "accumulatedCostOfKilledDCs" };
    public final java.util.List<java.lang.String> getFieldNames() { return java.util.Arrays.asList(__fieldNames); }
    private org.abs_models.backend.java.lib.types.ABSString name;
    // abs/lang/abslang.abs:868:4: 
    private ABS.StdLib.Map<org.abs_models.backend.java.lib.types.ABSString,ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational>> instanceDescriptions;
    // abs/lang/abslang.abs:871:4: 
    private ABS.StdLib.Set<ABS.DC.DeploymentComponent_i> launchedInstances;
    // abs/lang/abslang.abs:873:4: 
    private ABS.StdLib.Set<ABS.DC.DeploymentComponent_i> acquiredInstances;
    // abs/lang/abslang.abs:874:4: 
    private ABS.StdLib.Set<ABS.DC.DeploymentComponent_i> killedInstances;
    // abs/lang/abslang.abs:875:4: 
    private org.abs_models.backend.java.lib.types.ABSInteger nextInstanceId;
    // abs/lang/abslang.abs:876:4: 
    private org.abs_models.backend.java.lib.types.ABSRational accumulatedCostOfKilledDCs;
    public CloudProvider_c(org.abs_models.backend.java.lib.types.ABSString name) {
        this.name = name;
        getCOG().objectCreated(this);
    }
    protected final void __ABS_init() {
        this.instanceDescriptions = ABS.StdLib.map_f.apply(new ABS.StdLib.List_Nil<>());
        this.launchedInstances = ABS.StdLib.set_f.apply(new ABS.StdLib.List_Nil<>());
        this.acquiredInstances = ABS.StdLib.set_f.apply(new ABS.StdLib.List_Nil<>());
        this.killedInstances = ABS.StdLib.set_f.apply(new ABS.StdLib.List_Nil<>());
        this.nextInstanceId = org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L);
        this.accumulatedCostOfKilledDCs = org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L);
        getCOG().objectInitialized(this);
    }
    protected final org.abs_models.backend.java.lib.types.ABSValue getFieldValue(java.lang.String __ABS_fieldName) throws java.lang.NoSuchFieldException {
        if ("name".equals(__ABS_fieldName)) return name;
        if ("instanceDescriptions".equals(__ABS_fieldName)) return instanceDescriptions;
        if ("launchedInstances".equals(__ABS_fieldName)) return launchedInstances;
        if ("acquiredInstances".equals(__ABS_fieldName)) return acquiredInstances;
        if ("killedInstances".equals(__ABS_fieldName)) return killedInstances;
        if ("nextInstanceId".equals(__ABS_fieldName)) return nextInstanceId;
        if ("accumulatedCostOfKilledDCs".equals(__ABS_fieldName)) return accumulatedCostOfKilledDCs;
        return super.getFieldValue(__ABS_fieldName);
    }
    public final java.lang.String getClassName() { return "CloudProvider"; }
    public static final <T extends CloudProvider_c> T createNewCOG(org.abs_models.backend.java.lib.types.ABSString name) { return (T)CloudProvider_c.__ABS_createNewCOG(null, null, null, name); }
    public static final <T extends CloudProvider_c> T __ABS_createNewCOG(org.abs_models.backend.java.lib.runtime.ABSObject __ABS_source, org.abs_models.backend.java.scheduling.UserSchedulingStrategy Strategy, ABS.DC.DeploymentComponent_i DC, org.abs_models.backend.java.lib.types.ABSString name) {
        final org.abs_models.backend.java.lib.runtime.ABSRuntime __ABS_runtime = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime();
        final org.abs_models.backend.java.lib.runtime.COG __ABS_cog = Strategy == null ? __ABS_runtime.createCOG(CloudProvider_c.class, DC) : __ABS_runtime.createCOG(CloudProvider_c.class, DC, Strategy);
        final org.abs_models.backend.java.lib.runtime.ABSThread __ABS_thread = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentThread();
        final org.abs_models.backend.java.lib.runtime.COG __ABS_oldCOG = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentCOG();
        final org.abs_models.backend.java.lib.runtime.Task __ABS_sendingTask = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentTask();
        __ABS_thread.setCOG(__ABS_cog);
        try {
            CloudProvider_c __ABS_result = new CloudProvider_c(name);
            ;
            __ABS_runtime.cogCreated(__ABS_result);
            __ABS_cog.getScheduler().addTask(new org.abs_models.backend.java.lib.runtime.Task(new org.abs_models.backend.java.lib.runtime.ABSInitObjectCall(__ABS_sendingTask,__ABS_source,__ABS_result)));
            return (T)__ABS_result;
        } finally {
            __ABS_thread.setCOG(__ABS_oldCOG);
        }
    }
    public static final <T extends CloudProvider_c> T createNewObject(org.abs_models.backend.java.lib.types.ABSString name) { return (T)CloudProvider_c.__ABS_createNewObject(null, name); }
    public static final <T extends CloudProvider_c> T __ABS_createNewObject(org.abs_models.backend.java.lib.runtime.ABSObject __ABS_source, org.abs_models.backend.java.lib.types.ABSString name) {
        CloudProvider_c __ABS_result = new CloudProvider_c(name);
        __ABS_result.__ABS_init();
        return (T)__ABS_result;
    }
    // abs/lang/abslang.abs:878:18: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_shutdown() {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.CloudProvider_c>(
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
                    return "shutdown";
                }
                public Object call() {
                    return target.shutdown();
                }
            }.init())
        ;
    }
    // abs/lang/abslang.abs:878:18: 
    public final org.abs_models.backend.java.lib.types.ABSUnit shutdown() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "shutdown");
        }
         {
            ;
            return org.abs_models.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // abs/lang/abslang.abs:883:34: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<ABS.DC.DeploymentComponent_i> async_createInstance(org.abs_models.backend.java.lib.types.ABSString instancename, ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> d) {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.CloudProvider_c>(
            this,
            org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            org.abs_models.backend.java.lib.types.ABSBool.FALSE) {
                org.abs_models.backend.java.lib.types.ABSString arg0;
                ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> arg1;
                public java.util.List<org.abs_models.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new org.abs_models.backend.java.lib.types.ABSValue[] {
                        arg0,arg1});
                }
                public org.abs_models.backend.java.lib.runtime.AsyncCall<?> init(org.abs_models.backend.java.lib.types.ABSString _arg0,ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> _arg1) {
                    arg0 = _arg0;
                    arg1 = _arg1;
                    return this;
                }
                public java.lang.String methodName() {
                    return "createInstance";
                }
                public Object call() {
                    return target.createInstance(arg0
                    ,arg1
                    );
                }
            }.init(instancename, d))
        ;
    }
    // abs/lang/abslang.abs:883:34: 
    public final ABS.DC.DeploymentComponent_i createInstance(org.abs_models.backend.java.lib.types.ABSString instancename, ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> d) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "createInstance");
            __ABS_currentTask.setLocalVariable("instancename",instancename);
            __ABS_currentTask.setLocalVariable("d",d);
        }
         {
            org.abs_models.backend.java.lib.types.ABSBool mightNeedToStartAccounting = ABS.StdLib.emptySet_f.apply(CloudProvider_c.this.launchedInstances);

            ABS.DC.DeploymentComponentForCloudProvider_i result = ABS.DC.DeploymentComponent_c.__ABS_createNewCOG(this, null, (ABS.DC.DeploymentComponent_i)(__ABS_getRuntime().getCurrentCOG().getDC()), instancename.add(org.abs_models.backend.java.lib.types.ABSString.fromString("-")).add(org.abs_models.backend.java.lib.runtime.ABSBuiltInFunctions.toString(CloudProvider_c.this.nextInstanceId)), d);

            org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponentForCloudProvider_i>(
                this,
                org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(result),
                new ABS.StdLib.Duration_InfDuration(),
                new ABS.StdLib.Duration_InfDuration(),
                org.abs_models.backend.java.lib.types.ABSBool.FALSE) {
                    ABS.DC.CloudProviderForDeploymentComponent_i arg0;
                    public java.util.List<org.abs_models.backend.java.lib.types.ABSValue> getArgs() {
                        return java.util.Arrays.asList(new org.abs_models.backend.java.lib.types.ABSValue[] {
                            arg0});
                    }
                    public org.abs_models.backend.java.lib.runtime.AsyncCall<?> init(ABS.DC.CloudProviderForDeploymentComponent_i _arg0) {
                        arg0 = _arg0;
                        return this;
                    }
                    public java.lang.String methodName() {
                        return "setProvider";
                    }
                    public Object call() {
                        return target.setProvider(arg0
                        );
                    }
                }.init(this))
            ;
            CloudProvider_c.this.nextInstanceId = CloudProvider_c.this.nextInstanceId.add(org.abs_models.backend.java.lib.types.ABSInteger.fromLong(1L));
            ABS.DC.DeploymentComponent_i nullWorkAround = result;

            CloudProvider_c.this.launchedInstances = ABS.StdLib.insertElement_f.apply(CloudProvider_c.this.launchedInstances, nullWorkAround);
            return result;
        }
    }
    // abs/lang/abslang.abs:896:34: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<ABS.DC.DeploymentComponent_i> async_prelaunchInstance(ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> d) {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.CloudProvider_c>(
            this,
            org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            org.abs_models.backend.java.lib.types.ABSBool.FALSE) {
                ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> arg0;
                public java.util.List<org.abs_models.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new org.abs_models.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public org.abs_models.backend.java.lib.runtime.AsyncCall<?> init(ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "prelaunchInstance";
                }
                public Object call() {
                    return target.prelaunchInstance(arg0
                    );
                }
            }.init(d))
        ;
    }
    // abs/lang/abslang.abs:896:34: 
    public final ABS.DC.DeploymentComponent_i prelaunchInstance(ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> d) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "prelaunchInstance");
            __ABS_currentTask.setLocalVariable("d",d);
        }
         {
            ABS.DC.DeploymentComponent_i result = createInstance(CloudProvider_c.this.name, d);

            org.abs_models.backend.java.lib.runtime.ABSFut tmp1255024717 = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_i>(
                this,
                org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(result),
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
                        return "getStartupDuration";
                    }
                    public Object call() {
                        return target.getStartupDuration();
                    }
                }.init())
            ;

            org.abs_models.backend.java.lib.runtime.ABSRuntime.await(new org.abs_models.backend.java.lib.runtime.ABSFutureGuard(tmp1255024717));
            org.abs_models.backend.java.lib.types.ABSRational startup_duration = (org.abs_models.backend.java.lib.types.ABSRational)tmp1255024717.get();

            org.abs_models.backend.java.lib.runtime.ABSRuntime.await(new org.abs_models.backend.java.lib.runtime.ABSExpGuard() { public org.abs_models.backend.java.lib.types.ABSBool evaluateExp() { return org.abs_models.backend.java.lib.types.ABSBool.TRUE; }});
            return result;
        }
    }
    // abs/lang/abslang.abs:903:35: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<ABS.DC.DeploymentComponent_i> async_prelaunchInstanceNamed(org.abs_models.backend.java.lib.types.ABSString instancename) {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.CloudProvider_c>(
            this,
            org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            org.abs_models.backend.java.lib.types.ABSBool.FALSE) {
                org.abs_models.backend.java.lib.types.ABSString arg0;
                public java.util.List<org.abs_models.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new org.abs_models.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public org.abs_models.backend.java.lib.runtime.AsyncCall<?> init(org.abs_models.backend.java.lib.types.ABSString _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "prelaunchInstanceNamed";
                }
                public Object call() {
                    return target.prelaunchInstanceNamed(arg0
                    );
                }
            }.init(instancename))
        ;
    }
    // abs/lang/abslang.abs:903:35: 
    public final ABS.DC.DeploymentComponent_i prelaunchInstanceNamed(org.abs_models.backend.java.lib.types.ABSString instancename) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "prelaunchInstanceNamed");
            __ABS_currentTask.setLocalVariable("instancename",instancename);
        }
         {
            ABS.StdLib.Maybe<ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational>> mconfig = ABS.StdLib.lookup_f.apply(CloudProvider_c.this.instanceDescriptions, instancename);

            ABS.DC.DeploymentComponent_i dc = null;

            if (ABS.StdLib.isJust_f.apply(mconfig).toBoolean()) {
                 {
                    ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> config = ABS.StdLib.fromJust_f.apply(mconfig);

                    dc = createInstance(CloudProvider_c.this.name.add(org.abs_models.backend.java.lib.types.ABSString.fromString("-")).add(instancename), config);
                }
            }
            org.abs_models.backend.java.lib.runtime.ABSFut tmp1692317071 = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_i>(
                this,
                org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(dc),
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
                        return "getStartupDuration";
                    }
                    public Object call() {
                        return target.getStartupDuration();
                    }
                }.init())
            ;

            org.abs_models.backend.java.lib.runtime.ABSRuntime.await(new org.abs_models.backend.java.lib.runtime.ABSFutureGuard(tmp1692317071));
            org.abs_models.backend.java.lib.types.ABSRational startup_duration = (org.abs_models.backend.java.lib.types.ABSRational)tmp1692317071.get();

            org.abs_models.backend.java.lib.runtime.ABSRuntime.await(new org.abs_models.backend.java.lib.runtime.ABSExpGuard() { public org.abs_models.backend.java.lib.types.ABSBool evaluateExp() { return org.abs_models.backend.java.lib.types.ABSBool.TRUE; }});
            return dc;
        }
    }
    // abs/lang/abslang.abs:915:34: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<ABS.DC.DeploymentComponent_i> async_launchInstance(ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> d) {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.CloudProvider_c>(
            this,
            org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            org.abs_models.backend.java.lib.types.ABSBool.FALSE) {
                ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> arg0;
                public java.util.List<org.abs_models.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new org.abs_models.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public org.abs_models.backend.java.lib.runtime.AsyncCall<?> init(ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "launchInstance";
                }
                public Object call() {
                    return target.launchInstance(arg0
                    );
                }
            }.init(d))
        ;
    }
    // abs/lang/abslang.abs:915:34: 
    public final ABS.DC.DeploymentComponent_i launchInstance(ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> d) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "launchInstance");
            __ABS_currentTask.setLocalVariable("d",d);
        }
         {
            ABS.DC.DeploymentComponent_i result = prelaunchInstance(d);

            CloudProvider_c.this.acquiredInstances = ABS.StdLib.insertElement_f.apply(CloudProvider_c.this.acquiredInstances, result);
            return result;
        }
    }
    // abs/lang/abslang.abs:921:35: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<ABS.DC.DeploymentComponent_i> async_launchInstanceNamed(org.abs_models.backend.java.lib.types.ABSString instancename) {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.CloudProvider_c>(
            this,
            org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            org.abs_models.backend.java.lib.types.ABSBool.FALSE) {
                org.abs_models.backend.java.lib.types.ABSString arg0;
                public java.util.List<org.abs_models.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new org.abs_models.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public org.abs_models.backend.java.lib.runtime.AsyncCall<?> init(org.abs_models.backend.java.lib.types.ABSString _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "launchInstanceNamed";
                }
                public Object call() {
                    return target.launchInstanceNamed(arg0
                    );
                }
            }.init(instancename))
        ;
    }
    // abs/lang/abslang.abs:921:35: 
    public final ABS.DC.DeploymentComponent_i launchInstanceNamed(org.abs_models.backend.java.lib.types.ABSString instancename) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "launchInstanceNamed");
            __ABS_currentTask.setLocalVariable("instancename",instancename);
        }
         {
            ABS.DC.DeploymentComponent_i result = prelaunchInstanceNamed(instancename);

            if (org.abs_models.backend.java.lib.expr.BinOp.notEq(result,null).toBoolean()) {
                 {
                    ABS.DC.DeploymentComponent_i nullableWorkAround = result;

                    CloudProvider_c.this.acquiredInstances = ABS.StdLib.insertElement_f.apply(CloudProvider_c.this.acquiredInstances, nullableWorkAround);
                }
            }
            return result;
        }
    }
    // abs/lang/abslang.abs:930:9: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSBool> async_acquireInstance(ABS.DC.DeploymentComponent_i instance) {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.CloudProvider_c>(
            this,
            org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            org.abs_models.backend.java.lib.types.ABSBool.FALSE) {
                ABS.DC.DeploymentComponent_i arg0;
                public java.util.List<org.abs_models.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new org.abs_models.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public org.abs_models.backend.java.lib.runtime.AsyncCall<?> init(ABS.DC.DeploymentComponent_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "acquireInstance";
                }
                public Object call() {
                    return target.acquireInstance(arg0
                    );
                }
            }.init(instance))
        ;
    }
    // abs/lang/abslang.abs:930:9: 
    public final org.abs_models.backend.java.lib.types.ABSBool acquireInstance(ABS.DC.DeploymentComponent_i instance) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "acquireInstance");
            __ABS_currentTask.setLocalVariable("instance",instance);
        }
         {
            org.abs_models.backend.java.lib.types.ABSBool result = org.abs_models.backend.java.lib.types.ABSBool.TRUE;

            org.abs_models.backend.java.lib.runtime.ABSFut tmp723310524 = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_i>(
                this,
                org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(instance),
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
                        return "getProvider";
                    }
                    public Object call() {
                        return target.getProvider();
                    }
                }.init())
            ;

            org.abs_models.backend.java.lib.runtime.ABSRuntime.await(new org.abs_models.backend.java.lib.runtime.ABSFutureGuard(tmp723310524));
            ABS.DC.CloudProvider_i cp = (ABS.DC.CloudProvider_i)tmp723310524.get();

            ABS.DC.DeploymentComponent_i nullableWorkAround = instance;

            if (org.abs_models.backend.java.lib.expr.BinOp.notEq(cp,this).toBoolean()) {
                 {
                    result = org.abs_models.backend.java.lib.types.ABSBool.FALSE;
                }
            }
            else {
                 {
                    if (ABS.StdLib.contains_f.apply(CloudProvider_c.this.acquiredInstances, nullableWorkAround).or(ABS.StdLib.contains_f.apply(CloudProvider_c.this.killedInstances, nullableWorkAround)).toBoolean()) {
                         {
                            result = org.abs_models.backend.java.lib.types.ABSBool.FALSE;
                        }
                    }
                    else {
                         {
                            CloudProvider_c.this.acquiredInstances = ABS.StdLib.insertElement_f.apply(CloudProvider_c.this.acquiredInstances, nullableWorkAround);
                        }
                    }
                }
            }
            return result;
        }
    }
    // abs/lang/abslang.abs:945:9: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSBool> async_releaseInstance(ABS.DC.DeploymentComponent_i instance) {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.CloudProvider_c>(
            this,
            org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            org.abs_models.backend.java.lib.types.ABSBool.FALSE) {
                ABS.DC.DeploymentComponent_i arg0;
                public java.util.List<org.abs_models.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new org.abs_models.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public org.abs_models.backend.java.lib.runtime.AsyncCall<?> init(ABS.DC.DeploymentComponent_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "releaseInstance";
                }
                public Object call() {
                    return target.releaseInstance(arg0
                    );
                }
            }.init(instance))
        ;
    }
    // abs/lang/abslang.abs:945:9: 
    public final org.abs_models.backend.java.lib.types.ABSBool releaseInstance(ABS.DC.DeploymentComponent_i instance) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "releaseInstance");
            __ABS_currentTask.setLocalVariable("instance",instance);
        }
         {
            if (ABS.StdLib.contains_f.apply(CloudProvider_c.this.acquiredInstances, instance).toBoolean()) {
                 {
                    CloudProvider_c.this.acquiredInstances = ABS.StdLib.remove_f.apply(CloudProvider_c.this.acquiredInstances, instance);
                }
            }
            return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
        }
    }
    // abs/lang/abslang.abs:956:9: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSBool> async_shutdownInstance(ABS.DC.DeploymentComponent_i instance) {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.CloudProvider_c>(
            this,
            org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            org.abs_models.backend.java.lib.types.ABSBool.FALSE) {
                ABS.DC.DeploymentComponent_i arg0;
                public java.util.List<org.abs_models.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new org.abs_models.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public org.abs_models.backend.java.lib.runtime.AsyncCall<?> init(ABS.DC.DeploymentComponent_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "shutdownInstance";
                }
                public Object call() {
                    return target.shutdownInstance(arg0
                    );
                }
            }.init(instance))
        ;
    }
    // abs/lang/abslang.abs:956:9: 
    public final org.abs_models.backend.java.lib.types.ABSBool shutdownInstance(ABS.DC.DeploymentComponent_i instance) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "shutdownInstance");
            __ABS_currentTask.setLocalVariable("instance",instance);
        }
         {
            org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_i>(
                this,
                org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(instance),
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
                        return "shutdown";
                    }
                    public Object call() {
                        return target.shutdown();
                    }
                }.init())
            ;
            return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
        }
    }
    // abs/lang/abslang.abs:961:9: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_internalShutdownInstance(ABS.DC.DeploymentComponentForCloudProvider_i instance) {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.CloudProvider_c>(
            this,
            org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            org.abs_models.backend.java.lib.types.ABSBool.FALSE) {
                ABS.DC.DeploymentComponentForCloudProvider_i arg0;
                public java.util.List<org.abs_models.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new org.abs_models.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public org.abs_models.backend.java.lib.runtime.AsyncCall<?> init(ABS.DC.DeploymentComponentForCloudProvider_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "internalShutdownInstance";
                }
                public Object call() {
                    return target.internalShutdownInstance(arg0
                    );
                }
            }.init(instance))
        ;
    }
    // abs/lang/abslang.abs:961:9: 
    public final org.abs_models.backend.java.lib.types.ABSUnit internalShutdownInstance(ABS.DC.DeploymentComponentForCloudProvider_i instance) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "internalShutdownInstance");
            __ABS_currentTask.setLocalVariable("instance",instance);
        }
         {
            ABS.DC.DeploymentComponent_i nullWorkAround = instance;

            CloudProvider_c.this.acquiredInstances = ABS.StdLib.remove_f.apply(CloudProvider_c.this.acquiredInstances, nullWorkAround);
            CloudProvider_c.this.killedInstances = ABS.StdLib.insertElement_f.apply(CloudProvider_c.this.killedInstances, nullWorkAround);
            org.abs_models.backend.java.lib.runtime.ABSFut tmp859279938 = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponentForCloudProvider_i>(
                this,
                org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(instance),
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
                        return "getShutdownDuration";
                    }
                    public Object call() {
                        return target.getShutdownDuration();
                    }
                }.init())
            ;

            org.abs_models.backend.java.lib.runtime.ABSRuntime.await(new org.abs_models.backend.java.lib.runtime.ABSFutureGuard(tmp859279938));
            org.abs_models.backend.java.lib.types.ABSRational shutdown_duration = (org.abs_models.backend.java.lib.types.ABSRational)tmp859279938.get();

            org.abs_models.backend.java.lib.runtime.ABSRuntime.await(new org.abs_models.backend.java.lib.runtime.ABSExpGuard() { public org.abs_models.backend.java.lib.types.ABSBool evaluateExp() { return org.abs_models.backend.java.lib.types.ABSBool.TRUE; }});
            CloudProvider_c.this.launchedInstances = ABS.StdLib.remove_f.apply(CloudProvider_c.this.launchedInstances, nullWorkAround);
            org.abs_models.backend.java.lib.runtime.ABSFut tmp775093282 = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponentForCloudProvider_i>(
                this,
                org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(instance),
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
                        return "getAccumulatedCost";
                    }
                    public Object call() {
                        return target.getAccumulatedCost();
                    }
                }.init())
            ;

            org.abs_models.backend.java.lib.runtime.ABSRuntime.await(new org.abs_models.backend.java.lib.runtime.ABSFutureGuard(tmp775093282));
            org.abs_models.backend.java.lib.types.ABSRational cost = (org.abs_models.backend.java.lib.types.ABSRational)tmp775093282.get();

            CloudProvider_c.this.accumulatedCostOfKilledDCs = CloudProvider_c.this.accumulatedCostOfKilledDCs.add(cost);
            return org.abs_models.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // abs/lang/abslang.abs:980:8: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSRational> async_getAccumulatedCost() {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.CloudProvider_c>(
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
                    return "getAccumulatedCost";
                }
                public Object call() {
                    return target.getAccumulatedCost();
                }
            }.init())
        ;
    }
    // abs/lang/abslang.abs:980:8: 
    public final org.abs_models.backend.java.lib.types.ABSRational getAccumulatedCost() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getAccumulatedCost");
        }
         {
            org.abs_models.backend.java.lib.types.ABSRational result = org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L);

            ABS.StdLib.Time t = ABS.StdLib.now_f.apply();

             {
                ABS.StdLib.List<ABS.DC.DeploymentComponent_i> tmp1930842682 = ABS.StdLib.elements_f.apply(CloudProvider_c.this.launchedInstances);

                while (ABS.StdLib.isEmpty_f.apply(tmp1930842682).negate().toBoolean()) {
                    ABS.DC.DeploymentComponent_i dc = ABS.StdLib.head_f.apply(tmp1930842682);

                    tmp1930842682 = ABS.StdLib.tail_f.apply(tmp1930842682);
                     {
                        org.abs_models.backend.java.lib.runtime.ABSFut tmp1062295206 = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_i>(
                            this,
                            org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(dc),
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
                                    return "getAccumulatedCost";
                                }
                                public Object call() {
                                    return target.getAccumulatedCost();
                                }
                            }.init())
                        ;

                        org.abs_models.backend.java.lib.runtime.ABSRuntime.await(new org.abs_models.backend.java.lib.runtime.ABSFutureGuard(tmp1062295206));
                        org.abs_models.backend.java.lib.types.ABSRational cost = (org.abs_models.backend.java.lib.types.ABSRational)tmp1062295206.get();

                        result = result.add(cost);
                    }
                }
            }
            return result.add(CloudProvider_c.this.accumulatedCostOfKilledDCs);
        }
    }
    // abs/lang/abslang.abs:991:18: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_setInstanceDescriptions(ABS.StdLib.Map<org.abs_models.backend.java.lib.types.ABSString,ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational>> instanceDescriptions) {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.CloudProvider_c>(
            this,
            org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            org.abs_models.backend.java.lib.types.ABSBool.FALSE) {
                ABS.StdLib.Map<org.abs_models.backend.java.lib.types.ABSString,ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational>> arg0;
                public java.util.List<org.abs_models.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new org.abs_models.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public org.abs_models.backend.java.lib.runtime.AsyncCall<?> init(ABS.StdLib.Map<org.abs_models.backend.java.lib.types.ABSString,ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational>> _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "setInstanceDescriptions";
                }
                public Object call() {
                    return target.setInstanceDescriptions(arg0
                    );
                }
            }.init(instanceDescriptions))
        ;
    }
    // abs/lang/abslang.abs:991:18: 
    public final org.abs_models.backend.java.lib.types.ABSUnit setInstanceDescriptions(ABS.StdLib.Map<org.abs_models.backend.java.lib.types.ABSString,ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational>> instanceDescriptions) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setInstanceDescriptions");
            __ABS_currentTask.setLocalVariable("instanceDescriptions",instanceDescriptions);
        }
         {
            CloudProvider_c.this.instanceDescriptions = instanceDescriptions;
            return org.abs_models.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // abs/lang/abslang.abs:996:18: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_addInstanceDescription(ABS.StdLib.Pair<org.abs_models.backend.java.lib.types.ABSString,ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational>> instanceDescription) {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.CloudProvider_c>(
            this,
            org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            org.abs_models.backend.java.lib.types.ABSBool.FALSE) {
                ABS.StdLib.Pair<org.abs_models.backend.java.lib.types.ABSString,ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational>> arg0;
                public java.util.List<org.abs_models.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new org.abs_models.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public org.abs_models.backend.java.lib.runtime.AsyncCall<?> init(ABS.StdLib.Pair<org.abs_models.backend.java.lib.types.ABSString,ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational>> _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "addInstanceDescription";
                }
                public Object call() {
                    return target.addInstanceDescription(arg0
                    );
                }
            }.init(instanceDescription))
        ;
    }
    // abs/lang/abslang.abs:996:18: 
    public final org.abs_models.backend.java.lib.types.ABSUnit addInstanceDescription(ABS.StdLib.Pair<org.abs_models.backend.java.lib.types.ABSString,ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational>> instanceDescription) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "addInstanceDescription");
            __ABS_currentTask.setLocalVariable("instanceDescription",instanceDescription);
        }
         {
            CloudProvider_c.this.instanceDescriptions = ABS.StdLib.insert_f.apply(CloudProvider_c.this.instanceDescriptions, instanceDescription);
            return org.abs_models.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // abs/lang/abslang.abs:1001:18: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_removeInstanceDescription(org.abs_models.backend.java.lib.types.ABSString instanceDescriptionName) {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.CloudProvider_c>(
            this,
            org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            org.abs_models.backend.java.lib.types.ABSBool.FALSE) {
                org.abs_models.backend.java.lib.types.ABSString arg0;
                public java.util.List<org.abs_models.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new org.abs_models.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public org.abs_models.backend.java.lib.runtime.AsyncCall<?> init(org.abs_models.backend.java.lib.types.ABSString _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "removeInstanceDescription";
                }
                public Object call() {
                    return target.removeInstanceDescription(arg0
                    );
                }
            }.init(instanceDescriptionName))
        ;
    }
    // abs/lang/abslang.abs:1001:18: 
    public final org.abs_models.backend.java.lib.types.ABSUnit removeInstanceDescription(org.abs_models.backend.java.lib.types.ABSString instanceDescriptionName) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "removeInstanceDescription");
            __ABS_currentTask.setLocalVariable("instanceDescriptionName",instanceDescriptionName);
        }
         {
            CloudProvider_c.this.instanceDescriptions = ABS.StdLib.removeKey_f.apply(CloudProvider_c.this.instanceDescriptions, instanceDescriptionName);
            return org.abs_models.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // abs/lang/abslang.abs:1005:49: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<ABS.StdLib.Map<org.abs_models.backend.java.lib.types.ABSString,ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational>>> async_getInstanceDescriptions() {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.CloudProvider_c>(
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
                    return "getInstanceDescriptions";
                }
                public Object call() {
                    return target.getInstanceDescriptions();
                }
            }.init())
        ;
    }
    // abs/lang/abslang.abs:1005:49: 
    public final ABS.StdLib.Map<org.abs_models.backend.java.lib.types.ABSString,ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational>> getInstanceDescriptions() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getInstanceDescriptions");
        }
         {
            return CloudProvider_c.this.instanceDescriptions;
        }
    }
}
