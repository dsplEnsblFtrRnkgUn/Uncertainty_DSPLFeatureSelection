package SmartHome;
public class Main extends org.abs_models.backend.java.lib.runtime.ABSObject {
    public static void main(java.lang.String[] args) throws Exception {
        org.abs_models.backend.java.lib.runtime.StartUp.startup(args,Main.class);
    }
    public java.lang.String getClassName() { return "Main"; }
    public java.util.List<java.lang.String> getFieldNames() { return java.util.Collections.EMPTY_LIST; }
    public Main(org.abs_models.backend.java.lib.runtime.COG cog) { super(cog); }
    public org.abs_models.backend.java.lib.types.ABSUnit run() {
         {
            SmartHome.Runtime_Product_i improved_product = SmartHome.Runtime_ProductImpl_c.__ABS_createNewCOG(this, null, (ABS.DC.DeploymentComponent_i)(__ABS_getRuntime().getCurrentCOG().getDC()));

            if (org.abs_models.backend.java.lib.runtime.ABSRuntime.checkForNull(improved_product).__ABS_isSameCOG()) improved_product.run(); else improved_product.async_run().get();
        }
        return org.abs_models.backend.java.lib.types.ABSUnit.UNIT;
    }
}
