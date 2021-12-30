(ns hello-world.core)

(defn read-it [form] 500)

(defn foo [] #my-data/item "hello")

(defn init []
  (.log js/console "INIT : " (foo)))
