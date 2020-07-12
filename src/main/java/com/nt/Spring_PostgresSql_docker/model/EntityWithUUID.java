package com.nt.Spring_PostgresSql_docker.model;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

import lombok.Getter;
import lombok.Setter;

//@MappedSuperclass
@Setter
@Getter
public class EntityWithUUID {

	@Id
	@Generated(value = { "" })
	private Long id;

	@Version
	private Integer version;

}
