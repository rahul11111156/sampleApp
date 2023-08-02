package com.example.Sample.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Milestones")
public class Milestone {
	
	@Id
	private String application;
	private String subapplication;
	private String releasename;
	private String releasedate;
	private String releasedesc;
	private String createby;
	private String createdate;
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public String getSubapplication() {
		return subapplication;
	}
	public void setSubapplication(String subapplication) {
		this.subapplication = subapplication;
	}
	public String getReleasename() {
		return releasename;
	}
	public void setReleasename(String releasename) {
		this.releasename = releasename;
	}
	public String getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}
	public String getReleasedesc() {
		return releasedesc;
	}
	public void setReleasedesc(String releasedesc) {
		this.releasedesc = releasedesc;
	}
	public String getCreateby() {
		return createby;
	}
	public void setCreateby(String createby) {
		this.createby = createby;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	@Override
	public String toString() {
		return "Milestone [application=" + application + ", subapplication=" + subapplication + ", releasename="
				+ releasename + ", releasedate=" + releasedate + ", releasedesc=" + releasedesc + ", createby="
				+ createby + ", createdate=" + createdate + "]";
	}
	public Milestone(String application, String subapplication, String releasename, String releasedate,
			String releasedesc, String createby, String createdate) {
		super();
		this.application = application;
		this.subapplication = subapplication;
		this.releasename = releasename;
		this.releasedate = releasedate;
		this.releasedesc = releasedesc;
		this.createby = createby;
		this.createdate = createdate;
	}
	public Milestone() {
		super();
	}
	
	
	
	
	

}
