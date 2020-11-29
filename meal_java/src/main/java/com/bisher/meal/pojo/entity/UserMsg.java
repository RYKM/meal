package com.bisher.meal.pojo.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * user_msg
 * @author 
 */
@Data
public class UserMsg implements Serializable {
    private Integer id;

    private Integer userAccount;

    private Integer userPassword;

    private static final long serialVersionUID = 1L;
}