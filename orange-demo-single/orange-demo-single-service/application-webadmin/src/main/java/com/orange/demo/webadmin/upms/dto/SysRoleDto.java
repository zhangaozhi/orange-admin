package com.orange.demo.webadmin.upms.dto;

import com.orange.demo.common.core.validator.UpdateGroup;
import lombok.Data;

import javax.validation.constraints.*;

/**
 * 角色Dto。
 *
 * @author Jerry
 * @date 2020-09-24
 */
@Data
public class SysRoleDto {

    /**
     * 角色Id。
     */
    @NotNull(message = "角色Id不能为空！", groups = {UpdateGroup.class})
    private Long roleId;

    /**
     * 角色名称。
     */
    @NotBlank(message = "角色名称不能为空！")
    private String roleName;
}
