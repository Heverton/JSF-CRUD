package br.com.thiaguten.jsf.util;

import java.util.ResourceBundle;

public class AppInfo {

    private static final ResourceBundle BUNDLE = ResourceUtils.getResource("appinfo");

    public ResourceBundle getBundle() {
        return BUNDLE;
    }

}
