package io.github.javagossip.opendsp.dashboard.dto;

import io.github.javagossip.opendsp.dashboard.service.SysDictService.DictType;
import io.github.javagossip.opendsp.model.SysDict;
import lombok.Data;

@Data
public class RegionDto {

    private Integer regionCode;
    private String regionName;

    public static RegionDto of(SysDict sysDict) {
        if (sysDict == null) {
            throw new IllegalArgumentException("sysDict cannot be null");
        }

        if (!DictType.REGION.getType().equals(sysDict.getDictType())) {
            throw new IllegalArgumentException("sysDict.dictType must be " + DictType.REGION.getType());
        }

        if (sysDict.getDictValue() == null || sysDict.getDictName() == null) {
            throw new IllegalArgumentException("sysDict.dictKey and sysDict.dictValue must not be null");
        }

        RegionDto regionDto = new RegionDto();
        regionDto.setRegionCode(Integer.valueOf(sysDict.getDictValue()));
        regionDto.setRegionName(sysDict.getDictValue());
        return regionDto;
    }
}
