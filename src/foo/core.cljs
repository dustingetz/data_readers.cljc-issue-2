(ns foo.core
  (:require [clojure.browser.repl :as repl]))

;; (defonce conn
;;   (repl/connect "http://localhost:9000/repl"))

(enable-console-print!)

(println "Hello world!")

(let [foo #cljs/tag 1]
  (assert (= foo 1)))

(let [foo #app/Foo 1]
  (assert (= (.-i foo) 1)))
