var net=new Object();		//定义一个全局变量net
net.AjaxRequest=function(url,onload,onerror,method,params){//创建一个构造函数
  this.req=null;
  this.onload=onload;
  this.onerror=(onerror) ? onerror : this.defaultError;
  this.loadDate(url,method,params);
}

net.AjaxRequest.prototype.loadDate=function(url,method,params){
  if (!method){
    method="GET";
  }
  if (window.XMLHttpRequest){
    this.req=new XMLHttpRequest();
  } else if (window.ActiveXObject){
    this.req=new ActiveXObject("Microsoft.XMLHTTP");
  }
  if (this.req){
    try{
      var loader=this;
      this.req.onreadystatechange=function(){
        net.AjaxRequest.onReadyState.call(loader);
      }
      this.req.open(method,url,true);
      //this.req.send(params);
	  this.req.send(null);
    }catch (err){
      this.onerror.call(this);
    }
  }
}


net.AjaxRequest.onReadyState=function(){	//重构onReadyState函数
  var req=this.req;
  var ready=req.readyState;
  if (ready==4){
    if (req.status==200 ){
      this.onload.call(this);
    }else{
      this.onerror.call(this);
    }
  }
}

net.AjaxRequest.prototype.defaultError=function(){	//默认的错误处理函数
  alert("error fetching data!"
    +"\n\nreadyState:"+this.req.readyState
    +"\nstatus: "+this.req.status
    +"\nheaders: "+this.req.getAllResponseHeaders());
}