'use strict';

/* Services */

/*
 http://docs.angularjs.org/api/ngResource.$resource

 Default ngResources are defined as

 'get':    {method:'GET'},
 'save':   {method:'POST'},
 'query':  {method:'GET', isArray:true},
 'remove': {method:'DELETE'},
 'delete': {method:'DELETE'}

 */

var services = angular.module('fygam.services', ['ngResource']);

services.factory('UsersFactory', function ($resource) {
    return $resource('/am/rest/users', {}, {
        query: { method: 'GET', isArray: true },
        save: { method: 'POST' }
    })
});

services.factory('UserFactory', function ($resource) {
    return $resource('/am/rest/users/:key', {}, {
        show: { method: 'GET' },
        update: { method: 'PUT', params: {key: '@key'} },
        delete: { method: 'DELETE', params: {key: '@key'} }
    })
});
