angular.module("app").controller("adminController", adminController);

adminController.$inject = ["cinemaService","LxNotificationService"];

// libreria->  LxNotificationService


function adminController(cinemaService,LxNotificationService) {

	var vm = this;
	
	vm.nombreUsuario="";
	vm.contrasena="";
	
	
	
	
	
};
