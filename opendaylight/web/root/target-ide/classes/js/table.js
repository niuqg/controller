var getTable = function(arrTh, arrTr,name){
        var s = '<table class="tbData" name='+name+'>';
        s += '<tr>';
        for(var i=0; i<arrTh.length; i++) {
            s += '<th>' + arrTh[i] + '</th>';
        }
        s += '</tr>';
        for(var i=0; i<arrTr.length; i++) {
            s += '<tr>';
            for(var j=0; j<arrTr[i].length; j++) {
                s += '<td>' + arrTr[i][j] + '</td>';
            }
            s += '</tr>';
        }
        s += '</table>';
        return s;
    }
    
    //js分页
    //el:分页容器 count:总记录数 pageStep:每页显示多少个 pageNum:第几页 fnGo:分页跳转函数
    var jsPage = function(el, count, pageStep, pageNum, fnGo) {
        this.getLink = function(fnGo, index, pageNum, text) {
            var s = '<a href="#p' + index + '" onclick="' + fnGo + '(' + index + ');" ';
            if(index == pageNum) {
                s += 'class="aCur" ';
            }
            text = text || index;
            s += '>' + text + '</a> ';          
            return s;
        }
        
        //总页数
        var pageNumAll = Math.ceil(count / pageStep);
        if (pageNumAll == 1) {
         //  divPage.innerHTML = '';
            return;
        }
        var itemNum = 5; //当前页左右两边显示个数
        pageNum = Math.max(pageNum, 1);
        pageNum = Math.min(pageNum, pageNumAll);
        var s = '';
        if (pageNum > 1) {
            s += this.getLink(fnGo, pageNum-1, pageNum, '上一页');
        } else {
            s += '<span>上一页</span> ';
        }
        var begin = 1;
        if (pageNum - itemNum > 1) {
            s += this.getLink(fnGo, 1, pageNum) + '... ';
            begin = pageNum - itemNum;
        }
        var end = Math.min(pageNumAll, begin + itemNum*2);
        if(end == pageNumAll - 1){
            end = pageNumAll;
        }
        for (var i = begin; i <= end; i++) {
            s += this.getLink(fnGo, i, pageNum);
        }
        if (end < pageNumAll) {
            s += '... ' + this.getLink(fnGo, pageNumAll, pageNum);
        }
        if (pageNum < pageNumAll) {
            s += this.getLink(fnGo, pageNum+1, pageNum, '下一页');
        } else {
            s += '<span>下一页</span> ';
        }
        var divPage = document.getElementById(el);
        divPage.innerHTML = s;
    }
    
    
    
function deletelogger(){
	var checkinfo=document.getElementsByName("deletelog");
	var b="yes";
	for(i=0;i<checkinfo.length;i++){
		if(checkinfo[i].checked){
			b="no";
			if(confirm("确认操作?")){
				loglist.action="deletelog";
				loglist.submit();
			}
		}
	}
	if(b=="yes"){
		alert("请选择要删除的日志");
	}
}




























