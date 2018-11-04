package com.goblinworker.hightool.app;

class AppInstance {
    private static final AppInstance ourInstance = new AppInstance();

    static AppInstance getInstance() {
        return ourInstance;
    }

    private AppInstance() {
    }
}
