package com.pirate.model.entity.user;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.pirate.model.map.UserSecret;

@Entity(name="username")
@Table(name="users")
public class Username extends UserSecret {

}
