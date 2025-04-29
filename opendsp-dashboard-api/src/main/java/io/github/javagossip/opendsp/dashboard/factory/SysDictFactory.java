package io.github.javagossip.opendsp.dashboard.factory;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Preconditions;

import io.github.javagossip.opendsp.dashboard.dto.DictItemDto;
import io.github.javagossip.opendsp.dashboard.dto.DictTypeDto;
import io.github.javagossip.opendsp.model.SysDict;

public final class SysDictFactory {

    private SysDictFactory() {
    }

    public static SysDict withDictTypeDto(DictTypeDto dictTypeDto) {
        Preconditions.checkArgument(StringUtils.isNotBlank(dictTypeDto.getName()), "字典类型不能为空");
        Preconditions.checkArgument(StringUtils.isNotBlank(dictTypeDto.getValue()), "字典value不能为空");

        SysDict sysDict = new SysDict();
        sysDict.setDictType(dictTypeDto.getName());
        sysDict.setDictValue(dictTypeDto.getValue());
        sysDict.setEntryType(1);
        return sysDict;
    }

    public static SysDict withDictItemDto(DictItemDto dict) {
        Preconditions.checkArgument(StringUtils.isNotBlank(dict.getDictType()), "字典类型不能为空");
        Preconditions.checkArgument(StringUtils.isNotBlank(dict.getName()), "字典key不能为空");
        Preconditions.checkArgument(StringUtils.isNotBlank(dict.getValue()), "字典value不能为空");

        SysDict sysDict = new SysDict();
        sysDict.setDictValue(dict.getValue());
        sysDict.setEntryType(2);
        sysDict.setDictType(dict.getDictType());
        sysDict.setDictName(dict.getName());
        sysDict.setParentValue(dict.getParentValue());
        return sysDict;
    }
}
