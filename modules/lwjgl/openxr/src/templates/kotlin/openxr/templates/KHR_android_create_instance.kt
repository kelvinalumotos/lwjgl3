/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_android_create_instance = "KHRAndroidCreateInstance".nativeClassXR("KHR_android_create_instance", type = "instance", postfix = "KHR") {
    IntConstant(
        "KHR_android_create_instance_SPEC_VERSION".."3"
    )

    StringConstant(
        "KHR_ANDROID_CREATE_INSTANCE_EXTENSION_NAME".."XR_KHR_android_create_instance"
    )

    EnumConstant(
        "TYPE_INSTANCE_CREATE_INFO_ANDROID_KHR".."1000008000"
    )
}
