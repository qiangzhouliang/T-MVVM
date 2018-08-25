package com.code.mvvm.core.data.pojo.material;

import com.code.mvvm.core.data.pojo.BaseVo;

import java.io.Serializable;
import java.util.List;

public class MaterialTypeVo extends BaseVo implements Serializable
{

    public DataEntity data;

    public static class DataEntity implements Serializable
    {
        public String totalnum;

        public List<TypeListEntity> typelist;
    }

    public static class TypeListEntity implements Serializable
    {
        public String subid;

        public String name;

    }
}
