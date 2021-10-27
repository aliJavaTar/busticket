package com.maktab.busticket.entity;

import com.maktab.busticket.entity.base.BaseUser;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@NotBlank
@AllArgsConstructor
@NotNull
@Table(name = Admin.TABLE_NAME)
public class Admin extends BaseUser {
    protected static final String TABLE_NAME = "admins";

}
