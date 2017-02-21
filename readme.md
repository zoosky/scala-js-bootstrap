scala-js-bootstrap
===============

[![Build Status](https://travis-ci.org/DefinitelyScala/scala-js-bootstrap.svg?branch=master)](https://travis-ci.org/DefinitelyScala/scala-js-bootstrap)
[![Scala.js](https://www.scala-js.org/assets/badges/scalajs-0.6.13.svg)](https://www.scala-js.org/)

Scala.js facades for [Bootstrap](http://twitter.github.com/bootstrap/).

Generated from [TypeScript definitions](https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/bootstrap) based on Bootstrap 3.3.5.

Usage
-----

I'm working to get this hosted somewhere. Once I do, you'll be able to do this:

```
libraryDependencies += "DefinitelyScala" %%% "scala-js-bootstrap" % "1.0" // <-- DOESN'T WORK YET
```

Until it's hosted, you'll have to clone the git repo, then add the following to your SBT build definition:

```
  // Reference library as RootProject
  val bootstrap = RootProject(file("{path to project}"))
  // Reference the project
  (myProject).dependsOn(bootstrap)
```

If you see an error regarding a missing dependency, you're not using Coursier. 
If you don't want to switch (though you should), you may remove the plugin from `plugins.sbt`. 

Classes and traits are available in the package `org.scalajs.bootstrap`.
