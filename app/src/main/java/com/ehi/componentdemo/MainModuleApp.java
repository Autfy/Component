package com.ehi.componentdemo;

import android.content.Context;
import android.support.annotation.NonNull;

import com.ehi.base.ComponentEnum;
import com.ehi.component.anno.EHiModuleApp;
import com.ehi.component.application.IComponentApplication;
import com.ehi.component.impl.EHiUiRouter;

@EHiModuleApp()
public class MainModuleApp implements IComponentApplication {

    @Override
    public void onCreate(@NonNull Context app) {
        EHiUiRouter.register(ComponentEnum.App.getModuleName());
    }

    @Override
    public void onDestory() {
        EHiUiRouter.unregister(ComponentEnum.App.getModuleName());
    }

}
