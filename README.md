# project-cljs

This is a clojurescript web application template to practice the following:
  * Rum with devcards
  * making sure rlwrap works
  * CSS Transition Groups
  * Loaders (Probably using SVG / CSS Animations)
  * Practice looking into state on REPL
  * Using Clojurescript Debugger

## Overview

Just a template that has all the basic setup to have quick ClojureScript web application running

## Setup

To get an interactive development environment run:

    lein figwheel

and open your browser at [localhost:3449](http://localhost:3449/).

To clean all compiled files:

    lein clean

To create a production build run:

    lein do clean, cljsbuild once min

And open your browser in `resources/public/index.html`. You will not
get live reloading, nor a REPL.

## Acknowledgement

https://github.com/bhauman/figwheel-template
