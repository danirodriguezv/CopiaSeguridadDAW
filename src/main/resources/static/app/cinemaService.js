angular.module("app").service("cinemaService", cinemaService);

cinemaService.$inject = [ "$resource" ];

function cinemaService($resource) {
	
	var that = this;
	
	this.movies = [];
	this.cinemas = [];
	
	var MoviesResource = $resource('/movies');
	var MoviesResource2 = $resource('/movies/:id',{
		id : '@id'},{update : {method:'PUT'}}
	);
	var CinemaResource = $resource("/cinemas");
	
	this.getMovies = function() {
		movies = MoviesResource.query(); 
		return movies; 
	}
	
	this.getCinemas = function() {
		cinemas = CinemaResource.query(); 
		return cinemas; 
	}
	
	this.newMovie = function(peli) {
		new MoviesResource2(peli).$save(function(absurda) { 
			movies.push(absurda);
		});
	}
	
	/*function newMovie(newMovie){
		new MovieResource2(newMovie).$save(function(absurda) { 
			movies.push(absurda);
		});
	}*/

	
	
	
	/*this.updateItem = function(updatedItem) {
		updatedItem.$update();
	}*/
	
	this.deletePost = function(post) {
		post.$remove(function() {
			posts.splice(posts.indexOf(post), 1);
		});
	}
}