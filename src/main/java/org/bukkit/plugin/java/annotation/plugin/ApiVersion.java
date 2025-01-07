package org.bukkit.plugin.java.annotation.plugin;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation specifies the api version of the plugin.
 * <br>
 * Pre-1.13 plugins do not need to use this annotation.
 * <br>
 * 1.13, 1.14, 1.15, 1.16, 1.17, 1.18, 1.19 and 1.20 are the available versions.
 * <br>
 * This doesn't include the minor version until 1.20.5. From 1.20.5 and onward,
 * a minor version is supported.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target( ElementType.TYPE )
public @interface ApiVersion {

    String value();
}
