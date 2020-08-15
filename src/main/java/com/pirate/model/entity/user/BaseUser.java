package com.pirate.model.entity.user;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.pirate.model.map.User;

@Entity(name="User")
@Table(name="users")
public class BaseUser extends User {

}
