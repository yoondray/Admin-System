/**
 * 
 */

function btn_click(str) {
	
	if(str=="update") {
	alert("Move on membership Modify Page.")
		frm2.action="/member/update";
		frm2.method="get";

			
	}else {
		var msg=confirm("Would you like delete it?");
		
		if(msg) {
			frm2.action="/member/delete";
			frm2.method="post";
			
		}else {
			frm2.action="/member/tables"
		}
	}

	
}