(ns foo.core)

(deftype Foo [i])
(defn read-Foo [i] (->Foo i))

(let [foo #cljs/tag 1]
  (assert (= foo 1)))

(let [foo #foo/Foo 1]
  (assert (= (.-i foo) 1)))
