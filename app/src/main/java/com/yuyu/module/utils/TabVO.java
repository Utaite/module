package com.yuyu.module.utils;

import android.app.Fragment;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class TabVO {

    private final Fragment fragment;
    private final String title;

}
