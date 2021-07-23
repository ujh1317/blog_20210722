let index = {
	init: function(){
		$("#btn-save").on("click", ()=>{
			this.save();
		});
	},
	
	save: function(){
		//alert('user의 save함수 호출됨');
		let data = {
			userName: $("#userName").val(),
			password: $("#password").val(),
			email: $("#email").val()
		};
		//console.log(data);
		$.ajax({
			type: "POST",
			url: "/blog_003/api/user",
			data: JSON.stringify(data), //http body데이터
			contentType: "application/json; charset=utf-8", //body데이터타입(MIME)
			dataType: "json"
		}).done(function(resp){
			alert("회원가입이 완료되었습니다.");
			//console.log(resp);
			location.href = "/blog_003";
		}).fail(function(error){
			alert(JSON.stringify(error));
		});
	}
}
index.init();