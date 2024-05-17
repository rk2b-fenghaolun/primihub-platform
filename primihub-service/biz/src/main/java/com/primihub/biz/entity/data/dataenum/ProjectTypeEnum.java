package com.primihub.biz.entity.data.dataenum;

import java.util.HashMap;
import java.util.Map;

public enum ProjectTypeEnum {
    MPC("MPC", "多方安全计算"),
    VFL("VFL", "纵向联邦"),
    HFL("HFL", "横向联邦"),
    ;
    private String type;
    private String name;
    public static Map<String, ProjectTypeEnum> TASK_TYPE_MAP = new HashMap() {
        {
            for (ProjectTypeEnum e : ProjectTypeEnum.values()) {
                put(e.type, e);
            }
        }
    };

    ProjectTypeEnum(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
