package ABS.Meta;
// abs/lang/abslang.abs:1303:0: 
public interface ProductLine_i extends org.abs_models.backend.java.lib.types.ABSInterface, ABS.StdLib.Object_i {
    // abs/lang/abslang.abs:1304:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<ABS.Meta.Product_i> async_getCurrentProduct();
    // abs/lang/abslang.abs:1304:4: 
    public  ABS.Meta.Product_i getCurrentProduct();
    // abs/lang/abslang.abs:1305:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<ABS.Meta.Product_i> async_getProduct(org.abs_models.backend.java.lib.types.ABSString s);
    // abs/lang/abslang.abs:1305:4: 
    public  ABS.Meta.Product_i getProduct(org.abs_models.backend.java.lib.types.ABSString s);
    // abs/lang/abslang.abs:1306:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_addProduct(ABS.Meta.Product_i p);
    // abs/lang/abslang.abs:1306:4: 
    public  org.abs_models.backend.java.lib.types.ABSUnit addProduct(ABS.Meta.Product_i p);
    // abs/lang/abslang.abs:1307:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_removeProduct(ABS.Meta.Product_i p);
    // abs/lang/abslang.abs:1307:4: 
    public  org.abs_models.backend.java.lib.types.ABSUnit removeProduct(ABS.Meta.Product_i p);
    boolean __ABS_isSameCOG();
}
