package ABS.JUnit;
// abs/lang/abslang.abs:1398:0: 
public final class writeWithHeader_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private writeWithHeader_f() { }
    public static org.abs_models.backend.java.lib.types.ABSString apply(org.abs_models.backend.java.lib.types.ABSBool withHeader, ABS.JUnit.Testsuite ts) {
        return (withHeader.toBoolean() ? org.abs_models.backend.java.lib.types.ABSString.fromString("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n") : org.abs_models.backend.java.lib.types.ABSString.fromString("<testsuite name=\"").add(ABS.JUnit.name_f.apply(ts)).add(org.abs_models.backend.java.lib.types.ABSString.fromString("\" tests=\"")).add(org.abs_models.backend.java.lib.runtime.ABSBuiltInFunctions.toString(ABS.StdLib.length_f.apply(ABS.JUnit.tcs_f.apply(ts)))).add(org.abs_models.backend.java.lib.types.ABSString.fromString("\">\n")).add(ABS.JUnit.iterate_f.apply(ABS.JUnit.tcs_f.apply(ts))).add(org.abs_models.backend.java.lib.types.ABSString.fromString("</testsuite>\n")));
    }
}
