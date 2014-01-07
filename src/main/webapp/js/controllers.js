'use strict';

/* Controllers */

var app = angular.module('fygam.controllers', []);


// Clear browser cache (in development mode)
// http://stackoverflow.com/questions/14718826/angularjs-disable-partial-caching-on-dev-machine
app.run(function ($rootScope, $templateCache) {
    $rootScope.$on('$viewContentLoaded', function () {
        $templateCache.removeAll();
    });
});


app.controller('HomeCtrl', ['$scope','$location',function ($scope, $location) {
	
	
	
}]);

app.controller('UserListCtrl', ['$scope', 'UsersFactory', 'UserFactory', '$location',
    function ($scope, UsersFactory, UserFactory, $location) {

        // callback for ng-click 'editUser':
        $scope.editUser = function (userKey) {
            $location.path('/user-detail/' + userKey);
        };

        // callback for ng-click 'deleteUser':
        $scope.deleteUser = function (userKey) {
            UserFactory.delete({ key: userKey });
            $scope.users = UsersFactory.query();
        };

        // callback for ng-click 'createUser':
        $scope.createNewUser = function () {
            $location.path('/user-creation');
        };

        $scope.users = UsersFactory.query();
    }]);

app.controller('UserDetailCtrl', ['$scope', '$routeParams', 'UserFactory', '$location',
    function ($scope, $routeParams, UserFactory, $location) {
		$scope.sel_enabled=[
	       {name: '启用',value: 'y'}, 
	       {name: '禁用',value: 'n'}
	    ];
	
        // callback for ng-click 'updateUser':
        $scope.updateUser = function () {
        	if($scope.form.$invalid) return;
            UserFactory.update($scope.user);
            $location.path('/user-list');
        };

        // callback for ng-click 'cancel':
        $scope.cancel = function () {
            $location.path('/user-list');
        };

        $scope.user = UserFactory.show({key: $routeParams.key});
    }]);

app.controller('UserCreationCtrl', ['$scope', 'UsersFactory', '$location',
    function ($scope, UsersFactory, $location) {
		$scope.sel_enabled=[
	       {name: '启用',value: 'y'}, 
	       {name: '停用',value: 'n'}
	    ];
		
		 $scope.user ={
			enabled:'y'	 
		 };

        // callback for ng-click 'createNewUser':
        $scope.saveUser = function () {
        	if($scope.form.$invalid) return;
        	var encryptPassword=hex_sha1(hex_sha1($scope.page.password));
        	$scope.user.password=encryptPassword;
        	UsersFactory.save($scope.user);
            $location.path('/user-list');
        }
        
      //callback for ng-click 'cancel':
        $scope.cancel = function () {
            $location.path('/user-list');     
        };
    }]);
