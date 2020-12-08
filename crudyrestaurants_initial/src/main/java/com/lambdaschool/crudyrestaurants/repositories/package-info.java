/**
 * Contains the links between the database and the application.
 * Typically contains one class for each persistent, database, model.
 *
 * @author John Mitchell (john@lambdaschool.com) with Lambda School unless otherwise noted.
 *
 * Repository methods are purely declarative and a little magical. All we do is write the NAME of the method, and
 * Spring will implement that method for us. So there's a naming convention that will take your method and create the
 * write that method for you.
 *
 * The advantage is that if we swap out the database, Spring is going to take care of those changes for you. The
 * disadvantage is it's encapsulation on steroids. We don't really even know what's happening behind the scenes, just
 * that it works.
 *
 * Now that we don't connect our controller directly to the repository, the data is a little bit safer. Users
 * requests don't automatically change or read the data without some sort of routing that we declare in services.
 */
package com.lambdaschool.crudyrestaurants.repositories;