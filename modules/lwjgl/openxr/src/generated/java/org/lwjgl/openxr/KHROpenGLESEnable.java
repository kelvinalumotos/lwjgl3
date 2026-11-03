/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHROpenGLESEnable {

    public static final int XR_KHR_opengl_es_enable_SPEC_VERSION = 8;

    public static final String XR_KHR_OPENGL_ES_ENABLE_EXTENSION_NAME = "XR_KHR_opengl_es_enable";

    public static final int
        XR_TYPE_GRAPHICS_BINDING_OPENGL_ES_ANDROID_KHR = 1000024001,
        XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR          = 1000024002,
        XR_TYPE_GRAPHICS_REQUIREMENTS_OPENGL_ES_KHR    = 1000024003;

    protected KHROpenGLESEnable() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetOpenGLESGraphicsRequirementsKHR ] ---

    /** {@code XrResult xrGetOpenGLESGraphicsRequirementsKHR(XrInstance instance, XrSystemId systemId, XrGraphicsRequirementsOpenGLESKHR * graphicsRequirements)} */
    public static int nxrGetOpenGLESGraphicsRequirementsKHR(XrInstance instance, long systemId, long graphicsRequirements) {
        long __functionAddress = instance.getCapabilities().xrGetOpenGLESGraphicsRequirementsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(instance.address(), systemId, graphicsRequirements, __functionAddress);
    }

    /** {@code XrResult xrGetOpenGLESGraphicsRequirementsKHR(XrInstance instance, XrSystemId systemId, XrGraphicsRequirementsOpenGLESKHR * graphicsRequirements)} */
    @NativeType("XrResult")
    public static int xrGetOpenGLESGraphicsRequirementsKHR(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrGraphicsRequirementsOpenGLESKHR *") XrGraphicsRequirementsOpenGLESKHR graphicsRequirements) {
        return nxrGetOpenGLESGraphicsRequirementsKHR(instance, systemId, graphicsRequirements.address());
    }

}