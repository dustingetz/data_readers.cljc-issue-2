(ns foo.core)

(defn user-identity [i] i)
(assert (= 1 #a/UserIdentity 1))
