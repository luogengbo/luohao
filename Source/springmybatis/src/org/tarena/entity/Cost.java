package org.tarena.entity;

import java.io.Serializable;
import java.util.Date;

public class Cost implements Serializable{
	private Integer cost_id;//�ʷ�ID
	private String name;//�ʷ���
	private Long base_duration;//����ʱ��
	private Double base_cost;//��������
	private Double unit_cost;//��λ����
	private String status;//״̬
	private String descr;//����
	private Date creatime;//����ʱ��
	private Date startime;//����ʱ��
	private String cost_type;//�ʷ�����
	public Integer getCost_id() {
		return cost_id;
	}
	public void setCost_id(Integer cost_id) {
		this.cost_id = cost_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getBase_duration() {
		return base_duration;
	}
	public void setBase_duration(Long base_duration) {
		this.base_duration = base_duration;
	}
	public Double getBase_cost() {
		return base_cost;
	}
	public void setBase_cost(Double base_cost) {
		this.base_cost = base_cost;
	}
	public Double getUnit_cost() {
		return unit_cost;
	}
	public void setUnit_cost(Double unit_cost) {
		this.unit_cost = unit_cost;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public Date getCreatime() {
		return creatime;
	}
	public void setCreatime(Date creatime) {
		this.creatime = creatime;
	}
	public Date getStartime() {
		return startime;
	}
	public void setStartime(Date startime) {
		this.startime = startime;
	}
	public String getCost_type() {
		return cost_type;
	}
	public void setCost_type(String cost_type) {
		this.cost_type = cost_type;
	}
	
}