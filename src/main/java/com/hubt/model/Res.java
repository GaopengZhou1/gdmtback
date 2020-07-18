package com.hubt.model;

public class Res {

	@Override
	public String toString() {
		return "Res [menu_id=" + menu_id + ", dir_code=" + dir_code + ", dir_name=" + dir_name + ", dir_level_number="
				+ dir_level_number + ", parent_id=" + parent_id + ", parent_dir_name=" + parent_dir_name + ", isitem="
				+ isitem + ", dir_order=" + dir_order + ", status=" + status + ", flag=" + flag + ", locale=" + locale
				+ ", res_uuid=" + res_uuid + ", res_url=" + res_url + "]";
	}

	// 菜单目录id（树型结构层级编码）
	private String menu_id;
	
	// 菜单目录编号
	private String dir_code;
	
	// 菜单目录名称
	private String dir_name;
	
	// 菜单目录级数
	private int dir_level_number;

	// 父目录id
	private String parent_id;
	
	//父目录名称
	private String parent_dir_name;
	
	// 明细否：0 非明细；1 明细（默认）
	private char isitem;
	
	// 菜单目录顺序号
	private int dir_order;
	
	// 是否删除：0 是；1 否
	private char status;
	
	// 启/停状态：0 停用；1 启用
	private char flag;
	
	
	// 当前国际化标志（默认zh_CN)
	private String locale;
	
	// 资源路径id
	private String res_uuid;

	private String res_url;

	public Res() {
		super();
	}

	
	public String getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}

	public String getDir_code() {
		return dir_code;
	}

	public void setDir_code(String dir_code) {
		this.dir_code = dir_code;
	}

	public String getDir_name() {
		return dir_name;
	}

	public void setDir_name(String dir_name) {
		this.dir_name = dir_name;
	}

	public int getDir_level_number() {
		return dir_level_number;
	}

	public void setDir_level_number(int dir_level_number) {
		this.dir_level_number = dir_level_number;
	}

	public String getParent_id() {
		return parent_id;
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	public String getParent_dir_name() {
		return parent_dir_name;
	}


	public void setParent_dir_name(String parent_dir_name) {
		this.parent_dir_name = parent_dir_name;
	}
	
	public char getIsitem() {
		return isitem;
	}

	public void setIsitem(char isitem) {
		this.isitem = isitem;
	}

	public int getDir_order() {
		return dir_order;
	}

	public void setDir_order(int dir_order) {
		this.dir_order = dir_order;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public char getFlag() {
		return flag;
	}

	public void setFlag(char flag) {
		this.flag = flag;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getRes_uuid() {
		return res_uuid;
	}

	public void setRes_uuid(String res_uuid) {
		this.res_uuid = res_uuid;
	}

	public String getRes_url() {
		return res_url;
	}

	public void setRes_url(String res_url) {
		this.res_url = res_url;
	}
	
}
