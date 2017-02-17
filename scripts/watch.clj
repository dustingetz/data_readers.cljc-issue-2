(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'foo.core
   :output-to "out/foo.js"
   :output-dir "out"})
