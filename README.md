This repo attempts to setup a simple data reader for use in ClojureScript, following the instructions here: 

https://clojure.org/reference/reader#tagged_literals

The goal is to have the tagged literal `#my-data/item "hello"`
be read by the reader and invoke the function `hello-world.readers/read-it` which is setup to always return `500`.

# Replicate the issue with shadow-cljs 2.16.10:

```
npm i
npm run shadow
```

Compilation should fail with:

```
[:main] Compiling ...
[:main] Build failure:
------ ERROR -------------------------------------------------------------------
 File: /home/user/data-readers-bug-cljs/src/hello_world/core.cljs:5:35
--------------------------------------------------------------------------------
   2 | 
   3 | (defn read-it [form] 500)
   4 | 
   5 | (defn foo [] #my-data/item "hello")
-----------------------------------------^--------------------------------------
Attempting to call unbound fn: #'hello-world.core/read-it
```

# Works with the ClojureScript compiler 1.11.4:

``` bash
npm run clean
npm run cljs
```

Compilation will succeed.

# Works in Clojure 1.10.3

``` bash
clojure -Srepro -M -e "(require '[hello-world.main :as m]) (m/init)"
```
