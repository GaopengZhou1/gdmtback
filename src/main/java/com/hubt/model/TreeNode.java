package com.hubt.model;

import java.util.List;

public class TreeNode {
    private String id;
    private String pid;
    private String name;
    private boolean hasChildren;
    private List<TreeNode> children;

    public TreeNode(String id, String pid, String name, boolean hasChildren, List<TreeNode> children) {
        this.id = id;
        this.pid = pid;
        this.name = name;
        this.hasChildren = hasChildren;
        this.children = children;
    }

    public TreeNode() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }
}
