angular.module("app").controller("cinemaController", cinemaController);

cinemaController.$inject = ["cinemaService","LxNotificationService"];

// libreria->  LxNotificationService


function cinemaController(cinemaService,LxNotificationService) {

	var vm = this;
	
	vm.movies = [];
	vm.newMovie = {};
	vm.cinemas = [];
	/*vm.nuevo = function(name){
		vm.name = name;
	}*/	
	
	vm.movies = cinemaService.getMovies();
	vm.cinemas = cinemaService.getCinemas();
	
	vm.addPost = function(){		
		blogService.newPost(vm.newPost);
		vm.newPost = {};
	};	
	
	vm.meterpeli = function(){
		vm.newMovie.title = "Comillas";
		cinemaService.newMovie(vm.newMovie);
	};

	
	vm.borrar = function(post){		
		blogService.deletePost(post);		
	};
	
	vm.notify = function(type)
	{
		
	    if (type === 'simple')
	    {
	        LxNotificationService.notify('Lorem Ipsum');
	    }
	    else if (type === 'sticky')
	    {
	        LxNotificationService.notify('Lorem Ipsum', undefined, true);
	    }	   
	};
	
};
