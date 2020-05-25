
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getFreakyVersion(){
        return SystemProperties.get("org.freaky.version.display","");
    }
}