(ns hello-world.readers
  ;; Include the following even though there are no proper macros in this namespace.
  ;; Without this compilation works with the plain ClojureScript compiler but fails
  ;; with shadow-cljs: Attempting to call unbound fn: #'hello-world.readers/read-it
  #?(:cljs (:require-macros [hello-world.readers])))

(defn read-it [form] 500)
