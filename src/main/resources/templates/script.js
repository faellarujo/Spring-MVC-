function validaUser(){
	console.log('estou aqui');
	let userPassword  = document.querySelector('#user');
	if(userPassword == ''){
		alert('mensagem de erro');	
	}	
	window.location.href = "userSave";		
}


