package ABS.DC;
// abs/lang/abslang.abs:1013:0: 
public final class DeploymentComponent_c extends org.abs_models.backend.java.lib.runtime.ABSObject implements org.abs_models.backend.java.lib.types.ABSClass, ABS.DC.DeploymentComponentForCloudProvider_i {
    private static final java.lang.String[] __fieldNames = new java.lang.String[] { "description", "initconfig", "cpuhistory", "cpuhistorytotal", "bwhistory", "bwhistorytotal", "memoryhistory", "memoryhistorytotal", "cpuconsumed", "bwconsumed", "memoryconsumed", "creationTime", "shutdownTime", "initialized", "is_shutdown", "cpu", "cpunext", "bw", "bwnext", "memory", "memorynext", "paymentInterval", "costPerInterval", "startupDuration", "shutdownDuration", "numberOfCores", "cloudprovider" };
    public final java.util.List<java.lang.String> getFieldNames() { return java.util.Arrays.asList(__fieldNames); }
    private org.abs_models.backend.java.lib.types.ABSString description;
    private ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> initconfig;
    // abs/lang/abslang.abs:1023:4: 
    private ABS.StdLib.List<org.abs_models.backend.java.lib.types.ABSRational> cpuhistory;
    // abs/lang/abslang.abs:1024:4: 
    private ABS.StdLib.List<org.abs_models.backend.java.lib.types.ABSRational> cpuhistorytotal;
    // abs/lang/abslang.abs:1025:4: 
    private ABS.StdLib.List<org.abs_models.backend.java.lib.types.ABSRational> bwhistory;
    // abs/lang/abslang.abs:1026:4: 
    private ABS.StdLib.List<org.abs_models.backend.java.lib.types.ABSRational> bwhistorytotal;
    // abs/lang/abslang.abs:1027:4: 
    private ABS.StdLib.List<org.abs_models.backend.java.lib.types.ABSRational> memoryhistory;
    // abs/lang/abslang.abs:1028:4: 
    private ABS.StdLib.List<org.abs_models.backend.java.lib.types.ABSRational> memoryhistorytotal;
    // abs/lang/abslang.abs:1034:4: 
    private org.abs_models.backend.java.lib.types.ABSRational cpuconsumed;
    // abs/lang/abslang.abs:1035:4: 
    private org.abs_models.backend.java.lib.types.ABSRational bwconsumed;
    // abs/lang/abslang.abs:1036:4: 
    private org.abs_models.backend.java.lib.types.ABSRational memoryconsumed;
    // abs/lang/abslang.abs:1040:4: 
    private ABS.StdLib.Time creationTime;
    // abs/lang/abslang.abs:1041:4: 
    private ABS.StdLib.Maybe<ABS.StdLib.Time> shutdownTime;
    // abs/lang/abslang.abs:1045:4: 
    private org.abs_models.backend.java.lib.types.ABSBool initialized;
    // abs/lang/abslang.abs:1048:4: 
    private org.abs_models.backend.java.lib.types.ABSBool is_shutdown;
    // abs/lang/abslang.abs:1050:4: 
    private ABS.DC.InfRat cpu;
    // abs/lang/abslang.abs:1052:4: 
    private ABS.DC.InfRat cpunext;
    // abs/lang/abslang.abs:1053:4: 
    private ABS.DC.InfRat bw;
    // abs/lang/abslang.abs:1055:4: 
    private ABS.DC.InfRat bwnext;
    // abs/lang/abslang.abs:1056:4: 
    private ABS.DC.InfRat memory;
    // abs/lang/abslang.abs:1058:4: 
    private ABS.DC.InfRat memorynext;
    // abs/lang/abslang.abs:1059:4: 
    private org.abs_models.backend.java.lib.types.ABSInteger paymentInterval;
    // abs/lang/abslang.abs:1062:4: 
    private org.abs_models.backend.java.lib.types.ABSRational costPerInterval;
    // abs/lang/abslang.abs:1063:4: 
    private org.abs_models.backend.java.lib.types.ABSRational startupDuration;
    // abs/lang/abslang.abs:1064:4: 
    private org.abs_models.backend.java.lib.types.ABSRational shutdownDuration;
    // abs/lang/abslang.abs:1065:4: 
    private org.abs_models.backend.java.lib.types.ABSRational numberOfCores;
    // abs/lang/abslang.abs:1067:4: 
    private ABS.DC.CloudProviderForDeploymentComponent_i cloudprovider;
    public DeploymentComponent_c(org.abs_models.backend.java.lib.types.ABSString description, ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> initconfig) {
        this.description = description;
        this.initconfig = initconfig;
        getCOG().objectCreated(this);
    }
    protected final void __ABS_init() {
        this.cpuhistory = new ABS.StdLib.List_Nil<>();
        this.cpuhistorytotal = new ABS.StdLib.List_Nil<>();
        this.bwhistory = new ABS.StdLib.List_Nil<>();
        this.bwhistorytotal = new ABS.StdLib.List_Nil<>();
        this.memoryhistory = new ABS.StdLib.List_Nil<>();
        this.memoryhistorytotal = new ABS.StdLib.List_Nil<>();
        this.cpuconsumed = org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L);
        this.bwconsumed = org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L);
        this.memoryconsumed = org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L);
        this.creationTime = ABS.StdLib.now_f.apply();
        this.shutdownTime = new ABS.StdLib.Maybe_Nothing<>();
        this.initialized = org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        this.is_shutdown = org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        this.cpu = new org.abs_models.backend.java.lib.expr.Case() {
            public ABS.DC.InfRat of(final ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> initconfig, final ABS.StdLib.Maybe<org.abs_models.backend.java.lib.types.ABSRational> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Maybe_Nothing.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.DC.InfRat execute() { return new ABS.DC.InfRat_InfRat(); }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Maybe_Just.class,new org.abs_models.backend.java.lib.expr.PatternVariable("v")).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public ABS.DC.InfRat execute(final org.abs_models.backend.java.lib.types.ABSRational v) { return new ABS.DC.InfRat_Fin(v); }
                }.execute((org.abs_models.backend.java.lib.types.ABSRational) __ABS_binding1.getBinding(0));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:1050:17:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(initconfig, ABS.StdLib.lookup_f.apply(DeploymentComponent_c.this.initconfig, new ABS.DC.Resourcetype_Speed()));
        this.cpunext = DeploymentComponent_c.this.cpu;
        this.bw = new org.abs_models.backend.java.lib.expr.Case() {
            public ABS.DC.InfRat of(final ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> initconfig, final ABS.StdLib.Maybe<org.abs_models.backend.java.lib.types.ABSRational> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Maybe_Nothing.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.DC.InfRat execute() { return new ABS.DC.InfRat_InfRat(); }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Maybe_Just.class,new org.abs_models.backend.java.lib.expr.PatternVariable("v")).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public ABS.DC.InfRat execute(final org.abs_models.backend.java.lib.types.ABSRational v) { return new ABS.DC.InfRat_Fin(v); }
                }.execute((org.abs_models.backend.java.lib.types.ABSRational) __ABS_binding1.getBinding(0));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:1053:16:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(initconfig, ABS.StdLib.lookup_f.apply(DeploymentComponent_c.this.initconfig, new ABS.DC.Resourcetype_Bandwidth()));
        this.bwnext = DeploymentComponent_c.this.bw;
        this.memory = new org.abs_models.backend.java.lib.expr.Case() {
            public ABS.DC.InfRat of(final ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> initconfig, final ABS.StdLib.Maybe<org.abs_models.backend.java.lib.types.ABSRational> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Maybe_Nothing.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.DC.InfRat execute() { return new ABS.DC.InfRat_InfRat(); }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Maybe_Just.class,new org.abs_models.backend.java.lib.expr.PatternVariable("m")).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public ABS.DC.InfRat execute(final org.abs_models.backend.java.lib.types.ABSRational m) { return new ABS.DC.InfRat_Fin(m); }
                }.execute((org.abs_models.backend.java.lib.types.ABSRational) __ABS_binding1.getBinding(0));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:1056:20:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(initconfig, ABS.StdLib.lookup_f.apply(DeploymentComponent_c.this.initconfig, new ABS.DC.Resourcetype_Memory()));
        this.memorynext = DeploymentComponent_c.this.memory;
        this.paymentInterval = new org.abs_models.backend.java.lib.expr.Case() {
            public org.abs_models.backend.java.lib.types.ABSInteger of(final ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> initconfig, final ABS.StdLib.Maybe<org.abs_models.backend.java.lib.types.ABSRational> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Maybe_Nothing.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSInteger execute() { return org.abs_models.backend.java.lib.types.ABSInteger.fromLong(1L); }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Maybe_Just.class,new org.abs_models.backend.java.lib.expr.PatternVariable("n")).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSInteger execute(final org.abs_models.backend.java.lib.types.ABSRational n) { return org.abs_models.backend.java.lib.runtime.ABSBuiltInFunctions.truncate(n); }
                }.execute((org.abs_models.backend.java.lib.types.ABSRational) __ABS_binding1.getBinding(0));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:1060:8:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(initconfig, ABS.StdLib.lookup_f.apply(DeploymentComponent_c.this.initconfig, new ABS.DC.Resourcetype_PaymentInterval()));
        this.costPerInterval = ABS.StdLib.lookupDefault_f.apply(DeploymentComponent_c.this.initconfig, new ABS.DC.Resourcetype_CostPerInterval(), org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L).divide(org.abs_models.backend.java.lib.types.ABSInteger.fromLong(1L)));
        this.startupDuration = ABS.StdLib.lookupDefault_f.apply(DeploymentComponent_c.this.initconfig, new ABS.DC.Resourcetype_Startupduration(), org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L).divide(org.abs_models.backend.java.lib.types.ABSInteger.fromLong(1L)));
        this.shutdownDuration = ABS.StdLib.lookupDefault_f.apply(DeploymentComponent_c.this.initconfig, new ABS.DC.Resourcetype_Shutdownduration(), org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L).divide(org.abs_models.backend.java.lib.types.ABSInteger.fromLong(1L)));
        this.numberOfCores = ABS.StdLib.lookupDefault_f.apply(DeploymentComponent_c.this.initconfig, new ABS.DC.Resourcetype_Cores(), org.abs_models.backend.java.lib.types.ABSInteger.fromLong(1L).divide(org.abs_models.backend.java.lib.types.ABSInteger.fromLong(1L)));
        this.cloudprovider = null;
         {
            DeploymentComponent_c.this.initialized = org.abs_models.backend.java.lib.types.ABSBool.TRUE;
        }
        getCOG().objectInitialized(this);
    }
    protected final org.abs_models.backend.java.lib.types.ABSValue getFieldValue(java.lang.String __ABS_fieldName) throws java.lang.NoSuchFieldException {
        if ("description".equals(__ABS_fieldName)) return description;
        if ("initconfig".equals(__ABS_fieldName)) return initconfig;
        if ("cpuhistory".equals(__ABS_fieldName)) return cpuhistory;
        if ("cpuhistorytotal".equals(__ABS_fieldName)) return cpuhistorytotal;
        if ("bwhistory".equals(__ABS_fieldName)) return bwhistory;
        if ("bwhistorytotal".equals(__ABS_fieldName)) return bwhistorytotal;
        if ("memoryhistory".equals(__ABS_fieldName)) return memoryhistory;
        if ("memoryhistorytotal".equals(__ABS_fieldName)) return memoryhistorytotal;
        if ("cpuconsumed".equals(__ABS_fieldName)) return cpuconsumed;
        if ("bwconsumed".equals(__ABS_fieldName)) return bwconsumed;
        if ("memoryconsumed".equals(__ABS_fieldName)) return memoryconsumed;
        if ("creationTime".equals(__ABS_fieldName)) return creationTime;
        if ("shutdownTime".equals(__ABS_fieldName)) return shutdownTime;
        if ("initialized".equals(__ABS_fieldName)) return initialized;
        if ("is_shutdown".equals(__ABS_fieldName)) return is_shutdown;
        if ("cpu".equals(__ABS_fieldName)) return cpu;
        if ("cpunext".equals(__ABS_fieldName)) return cpunext;
        if ("bw".equals(__ABS_fieldName)) return bw;
        if ("bwnext".equals(__ABS_fieldName)) return bwnext;
        if ("memory".equals(__ABS_fieldName)) return memory;
        if ("memorynext".equals(__ABS_fieldName)) return memorynext;
        if ("paymentInterval".equals(__ABS_fieldName)) return paymentInterval;
        if ("costPerInterval".equals(__ABS_fieldName)) return costPerInterval;
        if ("startupDuration".equals(__ABS_fieldName)) return startupDuration;
        if ("shutdownDuration".equals(__ABS_fieldName)) return shutdownDuration;
        if ("numberOfCores".equals(__ABS_fieldName)) return numberOfCores;
        if ("cloudprovider".equals(__ABS_fieldName)) return cloudprovider;
        return super.getFieldValue(__ABS_fieldName);
    }
    public final java.lang.String getClassName() { return "DeploymentComponent"; }
    public static final <T extends DeploymentComponent_c> T createNewCOG(org.abs_models.backend.java.lib.types.ABSString description, ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> initconfig) { return (T)DeploymentComponent_c.__ABS_createNewCOG(null, null, null, description, initconfig); }
    public static final <T extends DeploymentComponent_c> T __ABS_createNewCOG(org.abs_models.backend.java.lib.runtime.ABSObject __ABS_source, org.abs_models.backend.java.scheduling.UserSchedulingStrategy Strategy, ABS.DC.DeploymentComponent_i DC, org.abs_models.backend.java.lib.types.ABSString description, ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> initconfig) {
        final org.abs_models.backend.java.lib.runtime.ABSRuntime __ABS_runtime = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime();
        final org.abs_models.backend.java.lib.runtime.COG __ABS_cog = Strategy == null ? __ABS_runtime.createCOG(DeploymentComponent_c.class, DC) : __ABS_runtime.createCOG(DeploymentComponent_c.class, DC, Strategy);
        final org.abs_models.backend.java.lib.runtime.ABSThread __ABS_thread = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentThread();
        final org.abs_models.backend.java.lib.runtime.COG __ABS_oldCOG = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentCOG();
        final org.abs_models.backend.java.lib.runtime.Task __ABS_sendingTask = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentTask();
        __ABS_thread.setCOG(__ABS_cog);
        try {
            DeploymentComponent_c __ABS_result = new DeploymentComponent_c(description, initconfig);
            ;
            __ABS_runtime.cogCreated(__ABS_result);
            __ABS_cog.getScheduler().addTask(new org.abs_models.backend.java.lib.runtime.Task(new org.abs_models.backend.java.lib.runtime.ABSInitObjectCall(__ABS_sendingTask,__ABS_source,__ABS_result)));
            return (T)__ABS_result;
        } finally {
            __ABS_thread.setCOG(__ABS_oldCOG);
        }
    }
    public static final <T extends DeploymentComponent_c> T createNewObject(org.abs_models.backend.java.lib.types.ABSString description, ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> initconfig) { return (T)DeploymentComponent_c.__ABS_createNewObject(null, description, initconfig); }
    public static final <T extends DeploymentComponent_c> T __ABS_createNewObject(org.abs_models.backend.java.lib.runtime.ABSObject __ABS_source, org.abs_models.backend.java.lib.types.ABSString description, ABS.StdLib.Map<ABS.DC.Resourcetype,org.abs_models.backend.java.lib.types.ABSRational> initconfig) {
        DeploymentComponent_c __ABS_result = new DeploymentComponent_c(description, initconfig);
        __ABS_result.__ABS_init();
        return (T)__ABS_result;
    }
    // abs/lang/abslang.abs:1071:27: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSRational> async_load(ABS.DC.Resourcetype rtype, org.abs_models.backend.java.lib.types.ABSInteger periods) {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
            this,
            org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            org.abs_models.backend.java.lib.types.ABSBool.FALSE) {
                ABS.DC.Resourcetype arg0;
                org.abs_models.backend.java.lib.types.ABSInteger arg1;
                public java.util.List<org.abs_models.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new org.abs_models.backend.java.lib.types.ABSValue[] {
                        arg0,arg1});
                }
                public org.abs_models.backend.java.lib.runtime.AsyncCall<?> init(ABS.DC.Resourcetype _arg0,org.abs_models.backend.java.lib.types.ABSInteger _arg1) {
                    arg0 = _arg0;
                    arg1 = _arg1;
                    return this;
                }
                public java.lang.String methodName() {
                    return "load";
                }
                public Object call() {
                    return target.load(arg0
                    ,arg1
                    .truncate());
                }
            }.init(rtype, periods))
        ;
    }
    // abs/lang/abslang.abs:1071:27: 
    public final org.abs_models.backend.java.lib.types.ABSRational load(ABS.DC.Resourcetype rtype, org.abs_models.backend.java.lib.types.ABSInteger periods) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "load");
            __ABS_currentTask.setLocalVariable("rtype",rtype);
            __ABS_currentTask.setLocalVariable("periods",periods);
        }
         {
            org.abs_models.backend.java.lib.types.ABSRational result = org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L);

            do {
                final ABS.DC.Resourcetype __ABS_value2131465140 = rtype;
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding618480889 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.DC.Resourcetype_Speed.class).match(__ABS_value2131465140);
                if (__ABS_binding618480889 != null) {
                     {
                        if (org.abs_models.backend.java.lib.expr.BinOp.notEq(DeploymentComponent_c.this.cpu,new ABS.DC.InfRat_InfRat()).toBoolean()) {
                             {
                                result = ABS.DC.averageDivsN_f.apply(DeploymentComponent_c.this.cpuhistory, DeploymentComponent_c.this.cpuhistorytotal, periods);
                            }
                        }
                    }
                    continue;
                }
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding214774813 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.DC.Resourcetype_Bandwidth.class).match(__ABS_value2131465140);
                if (__ABS_binding214774813 != null) {
                     {
                        if (org.abs_models.backend.java.lib.expr.BinOp.notEq(DeploymentComponent_c.this.bw,new ABS.DC.InfRat_InfRat()).toBoolean()) {
                             {
                                result = ABS.DC.averageDivsN_f.apply(DeploymentComponent_c.this.bwhistory, DeploymentComponent_c.this.bwhistorytotal, periods);
                            }
                        }
                    }
                    continue;
                }
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1327478824 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.DC.Resourcetype_Memory.class).match(__ABS_value2131465140);
                if (__ABS_binding1327478824 != null) {
                     {
                        if (org.abs_models.backend.java.lib.expr.BinOp.notEq(DeploymentComponent_c.this.memory,new ABS.DC.InfRat_InfRat()).toBoolean()) {
                             {
                                result = ABS.DC.averageDivsN_f.apply(DeploymentComponent_c.this.memoryhistory, DeploymentComponent_c.this.memoryhistorytotal, periods);
                            }
                        }
                    }
                    continue;
                }
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1860564101 = new org.abs_models.backend.java.lib.expr.AnyPattern().match(__ABS_value2131465140);
                if (__ABS_binding1860564101 != null) {
                     {
                    }
                    throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:1073:8:  value " + __ABS_value2131465140 + " did not match any pattern.");
                }
            } while(false);
            return result;
        }
    }
    // abs/lang/abslang.abs:1092:30: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<ABS.DC.InfRat> async_total(ABS.DC.Resourcetype rtype) {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
            this,
            org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            org.abs_models.backend.java.lib.types.ABSBool.FALSE) {
                ABS.DC.Resourcetype arg0;
                public java.util.List<org.abs_models.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new org.abs_models.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public org.abs_models.backend.java.lib.runtime.AsyncCall<?> init(ABS.DC.Resourcetype _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "total";
                }
                public Object call() {
                    return target.total(arg0
                    );
                }
            }.init(rtype))
        ;
    }
    // abs/lang/abslang.abs:1092:30: 
    public final ABS.DC.InfRat total(ABS.DC.Resourcetype rtype) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "total");
            __ABS_currentTask.setLocalVariable("rtype",rtype);
        }
         {
            ABS.DC.InfRat result = new ABS.DC.InfRat_InfRat();

            do {
                final ABS.DC.Resourcetype __ABS_value829985002 = rtype;
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding550608684 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.DC.Resourcetype_Speed.class).match(__ABS_value829985002);
                if (__ABS_binding550608684 != null) {
                     {
                        result = DeploymentComponent_c.this.cpu;
                    }
                    continue;
                }
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1163471607 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.DC.Resourcetype_Bandwidth.class).match(__ABS_value829985002);
                if (__ABS_binding1163471607 != null) {
                     {
                        result = DeploymentComponent_c.this.bw;
                    }
                    continue;
                }
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding2008355980 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.DC.Resourcetype_Memory.class).match(__ABS_value829985002);
                if (__ABS_binding2008355980 != null) {
                     {
                        result = DeploymentComponent_c.this.memory;
                    }
                    continue;
                }
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding909481763 = new org.abs_models.backend.java.lib.expr.AnyPattern().match(__ABS_value829985002);
                if (__ABS_binding909481763 != null) {
                     {
                    }
                    throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:1094:8:  value " + __ABS_value829985002 + " did not match any pattern.");
                }
            } while(false);
            return result;
        }
    }
    // abs/lang/abslang.abs:1105:17: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSRational> async_transfer(ABS.DC.DeploymentComponent_i target, org.abs_models.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype) {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
            this,
            org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            org.abs_models.backend.java.lib.types.ABSBool.FALSE) {
                ABS.DC.DeploymentComponent_i arg0;
                org.abs_models.backend.java.lib.types.ABSRational arg1;
                ABS.DC.Resourcetype arg2;
                public java.util.List<org.abs_models.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new org.abs_models.backend.java.lib.types.ABSValue[] {
                        arg0,arg1,arg2});
                }
                public org.abs_models.backend.java.lib.runtime.AsyncCall<?> init(ABS.DC.DeploymentComponent_i _arg0,org.abs_models.backend.java.lib.types.ABSRational _arg1,ABS.DC.Resourcetype _arg2) {
                    arg0 = _arg0;
                    arg1 = _arg1;
                    arg2 = _arg2;
                    return this;
                }
                public java.lang.String methodName() {
                    return "transfer";
                }
                public Object call() {
                    return target.transfer(arg0
                    ,arg1
                    ,arg2
                    );
                }
            }.init(target, amount, rtype))
        ;
    }
    // abs/lang/abslang.abs:1105:17: 
    public final org.abs_models.backend.java.lib.types.ABSRational transfer(ABS.DC.DeploymentComponent_i target, org.abs_models.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "transfer");
            __ABS_currentTask.setLocalVariable("target",target);
            __ABS_currentTask.setLocalVariable("amount",amount);
            __ABS_currentTask.setLocalVariable("rtype",rtype);
        }
         {
            amount = decrementResources(amount, rtype);
            org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_i>(
                this,
                org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(target),
                new ABS.StdLib.Duration_InfDuration(),
                new ABS.StdLib.Duration_InfDuration(),
                org.abs_models.backend.java.lib.types.ABSBool.FALSE) {
                    org.abs_models.backend.java.lib.types.ABSRational arg0;
                    ABS.DC.Resourcetype arg1;
                    public java.util.List<org.abs_models.backend.java.lib.types.ABSValue> getArgs() {
                        return java.util.Arrays.asList(new org.abs_models.backend.java.lib.types.ABSValue[] {
                            arg0,arg1});
                    }
                    public org.abs_models.backend.java.lib.runtime.AsyncCall<?> init(org.abs_models.backend.java.lib.types.ABSRational _arg0,ABS.DC.Resourcetype _arg1) {
                        arg0 = _arg0;
                        arg1 = _arg1;
                        return this;
                    }
                    public java.lang.String methodName() {
                        return "incrementResources";
                    }
                    public Object call() {
                        return target.incrementResources(arg0
                        ,arg1
                        );
                    }
                }.init(amount, rtype))
            ;
            return amount;
        }
    }
    // abs/lang/abslang.abs:1111:17: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSRational> async_decrementResources(org.abs_models.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype) {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
            this,
            org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            org.abs_models.backend.java.lib.types.ABSBool.FALSE) {
                org.abs_models.backend.java.lib.types.ABSRational arg0;
                ABS.DC.Resourcetype arg1;
                public java.util.List<org.abs_models.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new org.abs_models.backend.java.lib.types.ABSValue[] {
                        arg0,arg1});
                }
                public org.abs_models.backend.java.lib.runtime.AsyncCall<?> init(org.abs_models.backend.java.lib.types.ABSRational _arg0,ABS.DC.Resourcetype _arg1) {
                    arg0 = _arg0;
                    arg1 = _arg1;
                    return this;
                }
                public java.lang.String methodName() {
                    return "decrementResources";
                }
                public Object call() {
                    return target.decrementResources(arg0
                    ,arg1
                    );
                }
            }.init(amount, rtype))
        ;
    }
    // abs/lang/abslang.abs:1111:17: 
    public final org.abs_models.backend.java.lib.types.ABSRational decrementResources(org.abs_models.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "decrementResources");
            __ABS_currentTask.setLocalVariable("amount",amount);
            __ABS_currentTask.setLocalVariable("rtype",rtype);
        }
         {
            do {
                final ABS.DC.Resourcetype __ABS_value1000419469 = rtype;
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding447825462 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.DC.Resourcetype_Speed.class).match(__ABS_value1000419469);
                if (__ABS_binding447825462 != null) {
                     {
                        if (org.abs_models.backend.java.lib.expr.BinOp.notEq(DeploymentComponent_c.this.cpunext,new ABS.DC.InfRat_InfRat()).toBoolean()) {
                             {
                                amount = ABS.StdLib.min_f.apply(amount, ABS.DC.finvalue_f.apply(DeploymentComponent_c.this.cpunext));
                                DeploymentComponent_c.this.cpunext = new ABS.DC.InfRat_Fin(ABS.DC.finvalue_f.apply(DeploymentComponent_c.this.cpunext).subtract(amount));
                            }
                        }
                    }
                    continue;
                }
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding380881157 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.DC.Resourcetype_Bandwidth.class).match(__ABS_value1000419469);
                if (__ABS_binding380881157 != null) {
                     {
                        if (org.abs_models.backend.java.lib.expr.BinOp.notEq(DeploymentComponent_c.this.bwnext,new ABS.DC.InfRat_InfRat()).toBoolean()) {
                             {
                                amount = ABS.StdLib.min_f.apply(amount, ABS.DC.finvalue_f.apply(DeploymentComponent_c.this.bwnext));
                                DeploymentComponent_c.this.bwnext = new ABS.DC.InfRat_Fin(ABS.DC.finvalue_f.apply(DeploymentComponent_c.this.bwnext).subtract(amount));
                            }
                        }
                    }
                    continue;
                }
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1241366059 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.DC.Resourcetype_Memory.class).match(__ABS_value1000419469);
                if (__ABS_binding1241366059 != null) {
                     {
                        if (org.abs_models.backend.java.lib.expr.BinOp.notEq(DeploymentComponent_c.this.memorynext,new ABS.DC.InfRat_InfRat()).toBoolean()) {
                             {
                                amount = ABS.StdLib.min_f.apply(amount, ABS.DC.finvalue_f.apply(DeploymentComponent_c.this.memorynext));
                                DeploymentComponent_c.this.memorynext = new ABS.DC.InfRat_Fin(ABS.DC.finvalue_f.apply(DeploymentComponent_c.this.memorynext).subtract(amount));
                            }
                        }
                    }
                    continue;
                }
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1407952056 = new org.abs_models.backend.java.lib.expr.AnyPattern().match(__ABS_value1000419469);
                if (__ABS_binding1407952056 != null) {
                     {
                    }
                    throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:1112:8:  value " + __ABS_value1000419469 + " did not match any pattern.");
                }
            } while(false);
            return amount;
        }
    }
    // abs/lang/abslang.abs:1128:17: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSRational> async_incrementResources(org.abs_models.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype) {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
            this,
            org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            org.abs_models.backend.java.lib.types.ABSBool.FALSE) {
                org.abs_models.backend.java.lib.types.ABSRational arg0;
                ABS.DC.Resourcetype arg1;
                public java.util.List<org.abs_models.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new org.abs_models.backend.java.lib.types.ABSValue[] {
                        arg0,arg1});
                }
                public org.abs_models.backend.java.lib.runtime.AsyncCall<?> init(org.abs_models.backend.java.lib.types.ABSRational _arg0,ABS.DC.Resourcetype _arg1) {
                    arg0 = _arg0;
                    arg1 = _arg1;
                    return this;
                }
                public java.lang.String methodName() {
                    return "incrementResources";
                }
                public Object call() {
                    return target.incrementResources(arg0
                    ,arg1
                    );
                }
            }.init(amount, rtype))
        ;
    }
    // abs/lang/abslang.abs:1128:17: 
    public final org.abs_models.backend.java.lib.types.ABSRational incrementResources(org.abs_models.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "incrementResources");
            __ABS_currentTask.setLocalVariable("amount",amount);
            __ABS_currentTask.setLocalVariable("rtype",rtype);
        }
         {
            do {
                final ABS.DC.Resourcetype __ABS_value399683701 = rtype;
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1132189701 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.DC.Resourcetype_Speed.class).match(__ABS_value399683701);
                if (__ABS_binding1132189701 != null) {
                     {
                        if (org.abs_models.backend.java.lib.expr.BinOp.notEq(DeploymentComponent_c.this.cpunext,new ABS.DC.InfRat_InfRat()).toBoolean()) {
                             {
                                DeploymentComponent_c.this.cpunext = new ABS.DC.InfRat_Fin(ABS.DC.finvalue_f.apply(DeploymentComponent_c.this.cpunext).add(amount));
                            }
                        }
                    }
                    continue;
                }
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1267255950 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.DC.Resourcetype_Bandwidth.class).match(__ABS_value399683701);
                if (__ABS_binding1267255950 != null) {
                     {
                        if (org.abs_models.backend.java.lib.expr.BinOp.notEq(DeploymentComponent_c.this.bwnext,new ABS.DC.InfRat_InfRat()).toBoolean()) {
                             {
                                DeploymentComponent_c.this.bwnext = new ABS.DC.InfRat_Fin(ABS.DC.finvalue_f.apply(DeploymentComponent_c.this.bwnext).add(amount));
                            }
                        }
                    }
                    continue;
                }
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1872767282 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.DC.Resourcetype_Memory.class).match(__ABS_value399683701);
                if (__ABS_binding1872767282 != null) {
                     {
                        if (org.abs_models.backend.java.lib.expr.BinOp.notEq(DeploymentComponent_c.this.memorynext,new ABS.DC.InfRat_InfRat()).toBoolean()) {
                             {
                                DeploymentComponent_c.this.memorynext = new ABS.DC.InfRat_Fin(ABS.DC.finvalue_f.apply(DeploymentComponent_c.this.memorynext).add(amount));
                            }
                        }
                    }
                    continue;
                }
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1633717786 = new org.abs_models.backend.java.lib.expr.AnyPattern().match(__ABS_value399683701);
                if (__ABS_binding1633717786 != null) {
                     {
                    }
                    throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:1129:8:  value " + __ABS_value399683701 + " did not match any pattern.");
                }
            } while(false);
            return amount;
        }
    }
    // abs/lang/abslang.abs:1144:18: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_setProvider(ABS.DC.CloudProviderForDeploymentComponent_i provider) {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
            this,
            org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
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
            }.init(provider))
        ;
    }
    // abs/lang/abslang.abs:1144:18: 
    public final org.abs_models.backend.java.lib.types.ABSUnit setProvider(ABS.DC.CloudProviderForDeploymentComponent_i provider) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setProvider");
            __ABS_currentTask.setLocalVariable("provider",provider);
        }
         {
            DeploymentComponent_c.this.cloudprovider = provider;
            return org.abs_models.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // abs/lang/abslang.abs:1147:42: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<ABS.DC.DeploymentComponent_i> async_convertToDC() {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
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
                    return "convertToDC";
                }
                public Object call() {
                    return target.convertToDC();
                }
            }.init())
        ;
    }
    // abs/lang/abslang.abs:1147:42: 
    public final ABS.DC.DeploymentComponent_i convertToDC() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "convertToDC");
        }
         {
            return this;
        }
    }
    // abs/lang/abslang.abs:1149:47: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<ABS.DC.CloudProvider_i> async_getProvider() {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
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
                    return "getProvider";
                }
                public Object call() {
                    return target.getProvider();
                }
            }.init())
        ;
    }
    // abs/lang/abslang.abs:1149:47: 
    public final ABS.DC.CloudProvider_i getProvider() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getProvider");
        }
         {
            return DeploymentComponent_c.this.cloudprovider;
        }
    }
    // abs/lang/abslang.abs:1150:20: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSBool> async_acquire() {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
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
                    return "acquire";
                }
                public Object call() {
                    return target.acquire();
                }
            }.init())
        ;
    }
    // abs/lang/abslang.abs:1150:20: 
    public final org.abs_models.backend.java.lib.types.ABSBool acquire() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "acquire");
        }
         {
            org.abs_models.backend.java.lib.types.ABSBool result = org.abs_models.backend.java.lib.types.ABSBool.TRUE;

            if (org.abs_models.backend.java.lib.expr.BinOp.notEq(DeploymentComponent_c.this.cloudprovider,null).toBoolean()) {
                 {
                    org.abs_models.backend.java.lib.runtime.ABSFut tmp1925044167 = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.CloudProviderForDeploymentComponent_i>(
                        this,
                        org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(DeploymentComponent_c.this.cloudprovider),
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
                        }.init(this))
                    ;

                    org.abs_models.backend.java.lib.runtime.ABSRuntime.await(new org.abs_models.backend.java.lib.runtime.ABSFutureGuard(tmp1925044167));
                    result = (org.abs_models.backend.java.lib.types.ABSBool)tmp1925044167.get();
                }
            }
            return result;
        }
    }
    // abs/lang/abslang.abs:1157:20: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSBool> async_release() {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
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
                    return "release";
                }
                public Object call() {
                    return target.release();
                }
            }.init())
        ;
    }
    // abs/lang/abslang.abs:1157:20: 
    public final org.abs_models.backend.java.lib.types.ABSBool release() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "release");
        }
         {
            org.abs_models.backend.java.lib.types.ABSBool result = org.abs_models.backend.java.lib.types.ABSBool.TRUE;

            if (org.abs_models.backend.java.lib.expr.BinOp.notEq(DeploymentComponent_c.this.cloudprovider,null).toBoolean()) {
                 {
                    org.abs_models.backend.java.lib.runtime.ABSFut tmp2098720336 = org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.CloudProviderForDeploymentComponent_i>(
                        this,
                        org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(DeploymentComponent_c.this.cloudprovider),
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
                        }.init(this))
                    ;

                    org.abs_models.backend.java.lib.runtime.ABSRuntime.await(new org.abs_models.backend.java.lib.runtime.ABSFutureGuard(tmp2098720336));
                    result = (org.abs_models.backend.java.lib.types.ABSBool)tmp2098720336.get();
                }
            }
            return result;
        }
    }
    // abs/lang/abslang.abs:1165:9: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSBool> async_shutdown() {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
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
    // abs/lang/abslang.abs:1165:9: 
    public final org.abs_models.backend.java.lib.types.ABSBool shutdown() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "shutdown");
        }
         {
            if (DeploymentComponent_c.this.is_shutdown.negate().toBoolean()) {
                 {
                    DeploymentComponent_c.this.is_shutdown = org.abs_models.backend.java.lib.types.ABSBool.TRUE;
                    DeploymentComponent_c.this.shutdownTime = new ABS.StdLib.Maybe_Just<>(ABS.StdLib.now_f.apply());
                    if (org.abs_models.backend.java.lib.expr.BinOp.notEq(DeploymentComponent_c.this.cloudprovider,null).toBoolean()) {
                         {
                            org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.CloudProviderForDeploymentComponent_i>(
                                this,
                                org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(DeploymentComponent_c.this.cloudprovider),
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
                                }.init(this))
                            ;
                        }
                    }
                }
            }
            return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
        }
    }
    // abs/lang/abslang.abs:1176:30: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSString> async_getName() {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
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
    // abs/lang/abslang.abs:1176:30: 
    public final org.abs_models.backend.java.lib.types.ABSString getName() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getName");
        }
         {
            return DeploymentComponent_c.this.description;
        }
    }
    // abs/lang/abslang.abs:1177:28: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<ABS.StdLib.Time> async_getCreationTime() {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
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
                    return "getCreationTime";
                }
                public Object call() {
                    return target.getCreationTime();
                }
            }.init())
        ;
    }
    // abs/lang/abslang.abs:1177:28: 
    public final ABS.StdLib.Time getCreationTime() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getCreationTime");
        }
         {
            return DeploymentComponent_c.this.creationTime;
        }
    }
    // abs/lang/abslang.abs:1178:27: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSRational> async_getStartupDuration() {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
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
                    return "getStartupDuration";
                }
                public Object call() {
                    return target.getStartupDuration();
                }
            }.init())
        ;
    }
    // abs/lang/abslang.abs:1178:27: 
    public final org.abs_models.backend.java.lib.types.ABSRational getStartupDuration() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getStartupDuration");
        }
         {
            return DeploymentComponent_c.this.startupDuration;
        }
    }
    // abs/lang/abslang.abs:1179:27: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSRational> async_getShutdownDuration() {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
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
                    return "getShutdownDuration";
                }
                public Object call() {
                    return target.getShutdownDuration();
                }
            }.init())
        ;
    }
    // abs/lang/abslang.abs:1179:27: 
    public final org.abs_models.backend.java.lib.types.ABSRational getShutdownDuration() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getShutdownDuration");
        }
         {
            return DeploymentComponent_c.this.shutdownDuration;
        }
    }
    // abs/lang/abslang.abs:1180:27: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSInteger> async_getPaymentInterval() {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
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
                    return "getPaymentInterval";
                }
                public Object call() {
                    return target.getPaymentInterval();
                }
            }.init())
        ;
    }
    // abs/lang/abslang.abs:1180:27: 
    public final org.abs_models.backend.java.lib.types.ABSInteger getPaymentInterval() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getPaymentInterval");
        }
         {
            return DeploymentComponent_c.this.paymentInterval;
        }
    }
    // abs/lang/abslang.abs:1181:27: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSRational> async_getCostPerInterval() {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
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
                    return "getCostPerInterval";
                }
                public Object call() {
                    return target.getCostPerInterval();
                }
            }.init())
        ;
    }
    // abs/lang/abslang.abs:1181:27: 
    public final org.abs_models.backend.java.lib.types.ABSRational getCostPerInterval() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getCostPerInterval");
        }
         {
            return DeploymentComponent_c.this.costPerInterval;
        }
    }
    // abs/lang/abslang.abs:1183:27: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSRational> async_getAccumulatedCost() {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
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
    // abs/lang/abslang.abs:1183:27: 
    public final org.abs_models.backend.java.lib.types.ABSRational getAccumulatedCost() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getAccumulatedCost");
        }
         {
            org.abs_models.backend.java.lib.types.ABSRational result = org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L);

            if (org.abs_models.backend.java.lib.expr.BinOp.gt(DeploymentComponent_c.this.costPerInterval,org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L)).and(org.abs_models.backend.java.lib.expr.BinOp.gt(DeploymentComponent_c.this.paymentInterval,org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L))).toBoolean()) {
                 {
                    org.abs_models.backend.java.lib.types.ABSInteger nIntervals = org.abs_models.backend.java.lib.runtime.ABSBuiltInFunctions.truncate(org.abs_models.backend.java.lib.runtime.ABSBuiltInFunctions.truncate(ABS.StdLib.timeDifference_f.apply(DeploymentComponent_c.this.creationTime, ABS.StdLib.now_f.apply())).divide(DeploymentComponent_c.this.paymentInterval));

                    result = nIntervals.multiply(DeploymentComponent_c.this.costPerInterval);
                }
            }
            return result;
        }
    }
    // abs/lang/abslang.abs:1192:27: 
    public final org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSRational> async_getNumberOfCores() {
        return (org.abs_models.backend.java.lib.runtime.ABSFut)org.abs_models.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new org.abs_models.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
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
                    return "getNumberOfCores";
                }
                public Object call() {
                    return target.getNumberOfCores();
                }
            }.init())
        ;
    }
    // abs/lang/abslang.abs:1192:27: 
    public final org.abs_models.backend.java.lib.types.ABSRational getNumberOfCores() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            org.abs_models.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getNumberOfCores");
        }
         {
            return DeploymentComponent_c.this.numberOfCores;
        }
    }
}
