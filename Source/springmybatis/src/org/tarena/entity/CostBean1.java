package org.tarena.entity;

import java.io.Serializable;
import java.util.Date;

public class CostBean1 implements Serializable {
	private Integer id;
	private String name;
	private String status;
	private Date cerateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCerateTime() {
		return cerateTime;
	}

	public void setCerateTime(Date cerateTime) {
		this.cerateTime = cerateTime;
	}

}
