package com.hubt.model;

import java.util.List;

public class Node {

	private String id;

	private String name;

	List<Node> children = null;
	
	private Boolean hasChildren = false;

	public Node() {
		super();
	}

	public Node(String id, String name, List<Node> children) {
		super();
		this.id = id;
		this.name = name;
		this.children = children;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Node> getChildren() {
		return children;
	}

	public void setChildren(List<Node> children) {
		this.children = children;
	}

	public Boolean getHasChildren() {
		return hasChildren;
	}

	public void setHasChildren(Boolean hasChildren) {
		this.hasChildren = hasChildren;
	}

}
