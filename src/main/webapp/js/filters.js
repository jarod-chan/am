'use strict';

/* Filters */

angular.module('fygam.filters', [])
  .filter('interpolate', ['version', function(version) {
    return function(text) {
      return String(text).replace(/\%VERSION\%/mg, version);
    }
  }])
  .filter('enabled',function(){
	  return function(input){
		  return input=='y'?'启用':'停用';
	  }
  });
