package com.hubt.model;

public class Org {
    private String organ_uuid;
    private String organ_code;
    private String organ_name;
    private String organ_type;
    private String in_use;
    private String parent_uuid;
    private String status;
    private String modifierid;
    private String modtime;
    private String description;
    private String account_code;
    private String shortname;
    private Org parent;

    public Org() {super(); }

    public Org(String organ_code, String organ_name, String organ_type, String in_use, String parent_uuid, String status, String modifierid, String modtime, String description, String account_code, String shortname) {
        super();
        this.organ_code = organ_code;
        this.organ_name = organ_name;
        this.organ_type = organ_type;
        this.in_use = in_use;
        this.parent_uuid = parent_uuid;
        this.status = status;
        this.modifierid = modifierid;
        this.modtime = modtime;
        this.description = description;
        this.account_code = account_code;
        this.shortname = shortname;
    }

    public Org(String organ_uuid, String organ_code, String organ_name, String organ_type, String in_use, String parent_uuid, String status, String modifierid, String modtime, String description, String account_code, String shortname) {
        super();
        this.organ_uuid = organ_uuid;
        this.organ_code = organ_code;
        this.organ_name = organ_name;
        this.organ_type = organ_type;
        this.in_use = in_use;
        this.parent_uuid = parent_uuid;
        this.status = status;
        this.modifierid = modifierid;
        this.modtime = modtime;
        this.description = description;
        this.account_code = account_code;
        this.shortname = shortname;
    }

    public String getOrgan_uuid() {
        return organ_uuid;
    }

    public void setOrgan_uuid(String organ_uuid) {
        this.organ_uuid = organ_uuid;
    }

    public String getOrgan_code() {
        return organ_code;
    }

    public void setOrgan_code(String organ_code) {
        this.organ_code = organ_code;
    }

    public String getOrgan_name() {
        return organ_name;
    }

    public void setOrgan_name(String organ_name) {
        this.organ_name = organ_name;
    }

    public String getOrgan_type() {
        return organ_type;
    }

    public void setOrgan_type(String organ_type) {
        this.organ_type = organ_type;
    }

    public String getIn_use() {
        return in_use;
    }

    public void setIn_use(String in_use) {
        this.in_use = in_use;
    }

    public String getParent_uuid() {
        return parent_uuid;
    }

    public void setParent_uuid(String parent_uuid) {
        this.parent_uuid = parent_uuid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getModifierid() {
        return modifierid;
    }

    public void setModifierid(String modifierid) {
        this.modifierid = modifierid;
    }

    public String getModtime() {
        return modtime;
    }

    public void setModtime(String modtime) {
        this.modtime = modtime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccount_code() {
        return account_code;
    }

    public void setAccount_code(String account_code) {
        this.account_code = account_code;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public Org getParent() {
        return parent;
    }

    public void setParent(Org parent) {
        this.parent = parent;
    }
}
