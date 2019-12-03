package com.ytempest.gradlerepository;

/**
 * @author heqidu
 * @since 2019/12/3
 */
public class PhoneCreator {
    public static PhoneBean createPhone() {
        return new PhoneBean(BuildConfig.FLAVOR_phone, "This is from " + BuildConfig.FLAVOR);
    }
}
