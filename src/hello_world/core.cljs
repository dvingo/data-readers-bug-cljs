(ns hello-world.core
  ;; either explicitly require them or add to shadow-cljs devtools->preloads
  (:require [hello-world.readers]))

(defn read-it [form] 500)

(defn foo [] #my-data/item "hello")

(defn init [] (.log js/console "INIT: " (foo)))
