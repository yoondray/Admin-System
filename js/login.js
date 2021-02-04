/**
 * 
 */

function btn_click(str) {
	//alert(str)
	if(str=="login") {	// 로그인 버튼이면,
		
		//alert("Successfully LOGIN.")
		frm1.action="/home/loginPost"	// tb1_admin를 select하는 controller
		frm1.method="post"
		
	}else if(str=="join") {
		frm1.action="/home/join"
		frm1.method="get"
	}
}





