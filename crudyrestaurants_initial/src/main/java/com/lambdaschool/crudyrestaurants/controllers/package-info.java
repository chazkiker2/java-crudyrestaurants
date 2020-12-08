/**
 * Contains the access points, end points, that can be used by clients.
 *
 * @author John Mitchell (john@lambdaschool.com) with Lambda School unless otherwise noted.
 *
 * The controller should really only declare endpoints and pass what the user asked for to the next step of what our
 * services need to do, what our repository needs to return. The controller should PURELY be a bridge
 *
 * Services, however, are going to provide a method that PROCESS THAT. They will manipulate the data, pull from
 * Repositories and return something that will be routed to the user.
 */
package com.lambdaschool.crudyrestaurants.controllers;