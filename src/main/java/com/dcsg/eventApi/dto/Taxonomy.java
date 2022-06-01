package com.dcsg.eventApi.dto;

import java.io.Serializable;

public class Taxonomy implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5272100508929680568L;
	public int id;
	public String name;
	public int parent_id;
	public DocumentSource document_source;
	public int rank;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}
	public DocumentSource getDocument_source() {
		return document_source;
	}
	public void setDocument_source(DocumentSource document_source) {
		this.document_source = document_source;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Taxonomy [id=" + id + ", name=" + name + ", parent_id=" + parent_id + ", document_source="
				+ document_source + ", rank=" + rank + "]";
	}
	
	
}
