package Strings;

import org.junit.Assert;
import org.junit.Test;

public class RotationCheckTest {

    @Test
    public void testIsRotation_True() {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";
        boolean result = RotationCheck.isRotation(str1, str2);
        Assert.assertTrue(result);
    }

    @Test
    public void testIsRotation_False() {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "JavaJ2eeStrutsHibernateXYZ";

        boolean result = RotationCheck.isRotation(str1, str2);

        Assert.assertFalse(result);

    }

    @Test
    public void testIsRotation_EmptyStrings() {
        String str1 = "";
        String str2 = "";

        boolean result = RotationCheck.isRotation(str1, str2);

        Assert.assertFalse(result);
    }

    @Test
    public void testIsRotation_NullStrings() {
        String str1 = null;
        String str2 = null;

        RotationCheck.isRotation(str1, str2);
        boolean result = false;

        Assert.assertFalse(result);
    }

    @Test
    public void testIsRotation_DifferentLength() {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "HibernateJavaJ2eeStrutss";

        boolean result = RotationCheck.isRotation(str1, str2);

        Assert.assertFalse(result);
    }


    @Test
    public void testIsRotation_PartialRotation() {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsJavaJ2eeHibernate";

        boolean result = RotationCheck.isRotation(str1, str2);

        Assert.assertFalse(result);
    }
}