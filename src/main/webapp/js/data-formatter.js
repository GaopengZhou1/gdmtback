function dateFormatter(value, row, index) {
	if (value != 0) {
		var time = new Date(value);
		var y = time.getFullYear();
		var m = time.getMonth() + 1;
		var d = time.getDate();
		var h = time.getHours();
		var mm = time.getMinutes();
		var s = time.getSeconds();
		var a = y + '-' + (m < 10 ? '0' + m : m) + '-' + (d < 10 ? '0' + d : d)
				+ ' ' + (h < 10 ? '0' + h : h) + ':'
				+ (mm < 10 ? '0' + mm : mm) + ':' + (s < 10 ? '0' + s : s);
		return a;
	} else {
		return "";
	}
}

// 0否1是
function ifFormatter(value, row, index) {
	if (value == null)
		return '暂无角色信息';
	return value == 0 ? '否' : '是';
}


function setBodyHeight(){
	var o = document.getElementById("abc");
	window.parent.set_iFrame(o.clientHeight || o.offsetHeight);
}