angular.module("app").config(RouteConfig);

RouteConfig.$inject = ['$routeProvider'];

function RouteConfig($routeProvider){
	$routeProvider.when('/',{ templateUrl : "templates/welcome.html"});
}