[data_readers.cljc](https://github.com/dustingetz/data_readers.cljc-issue-2/blob/master/src/data_readers.cljc)


    dustin@mbp foo (master *#)$ ./scripts/build
    java.lang.ClassCastException: clojure.lang.Cons cannot be cast to clojure.lang.Named
      at clojure.core$namespace.invokeStatic(core.clj:1594)
      at clojure.core$data_reader_var.invokeStatic(core.clj:7673)
      at clojure.core$load_data_reader_file$fn__9721.invoke(core.clj:7691)
      at clojure.core.protocols$iter_reduce.invokeStatic(protocols.clj:49)
      at clojure.core.protocols$fn__9130.invokeStatic(protocols.clj:75)
      at clojure.core.protocols$fn__9130.invoke(protocols.clj:75)
      at clojure.core.protocols$fn__9072$G__9067__9085.invoke(protocols.clj:13)
      at clojure.core$reduce.invokeStatic(core.clj:6704)
      at clojure.core$load_data_reader_file.invokeStatic(core.clj:7686)
      at clojure.core$load_data_reader_file.invoke(core.clj:7677)
      at clojure.core.protocols$fn__9143.invokeStatic(protocols.clj:167)
      at clojure.core.protocols$fn__9143.invoke(protocols.clj:124)
      at clojure.core.protocols$fn__9098$G__9093__9107.invoke(protocols.clj:19)
      at clojure.core.protocols$seq_reduce.invokeStatic(protocols.clj:31)
      at clojure.core.protocols$fn__9126.invokeStatic(protocols.clj:75)
      at clojure.core.protocols$fn__9126.invoke(protocols.clj:75)
      at clojure.core.protocols$fn__9072$G__9067__9085.invoke(protocols.clj:13)
      at clojure.core$reduce.invokeStatic(core.clj:6704)
      at clojure.core$load_data_readers$fn__9728.invoke(core.clj:7708)
      at clojure.lang.AFn.applyToHelper(AFn.java:154)
      at clojure.lang.AFn.applyTo(AFn.java:144)
      at clojure.lang.Var.alterRoot(Var.java:303)
      at clojure.core$alter_var_root.invokeStatic(core.clj:5414)
      at clojure.core$alter_var_root.doInvoke(core.clj:5409)
      at clojure.lang.RestFn.invoke(RestFn.java:425)
      at clojure.core$load_data_readers.invokeStatic(core.clj:7707)
      at clojure.core$fn__9731.invokeStatic(core.clj:7712)
      at clojure.core$fn__9731.invoke(core.clj:7712)
      at clojure.core__init.load(Unknown Source)
      at clojure.core__init.<clinit>(Unknown Source)
      at java.lang.Class.forName0(Native Method)
      at java.lang.Class.forName(Class.java:348)
      at clojure.lang.RT.classForName(RT.java:2183)
      at clojure.lang.RT.classForName(RT.java:2192)
      at clojure.lang.RT.loadClassForName(RT.java:2211)
      at clojure.lang.RT.load(RT.java:445)
      at clojure.lang.RT.load(RT.java:421)
      at clojure.lang.RT.doInit(RT.java:463)
      at clojure.lang.RT.<clinit>(RT.java:333)
      at clojure.main.<clinit>(main.java:20)
    Exception in thread "main" java.lang.ExceptionInInitializerError
      at java.lang.Class.forName0(Native Method)
      at java.lang.Class.forName(Class.java:348)
      at clojure.lang.RT.classForName(RT.java:2183)
      at clojure.lang.RT.classForName(RT.java:2192)
      at clojure.lang.RT.loadClassForName(RT.java:2211)
      at clojure.lang.RT.load(RT.java:445)
      at clojure.lang.RT.load(RT.java:421)
      at clojure.lang.RT.doInit(RT.java:463)
      at clojure.lang.RT.<clinit>(RT.java:333)
      at clojure.main.<clinit>(main.java:20)
    Caused by: java.lang.ClassCastException: clojure.lang.Cons cannot be cast to clojure.lang.Named
      at clojure.core$namespace.invokeStatic(core.clj:1594)
      at clojure.core$data_reader_var.invokeStatic(core.clj:7673)
      at clojure.core$load_data_reader_file$fn__9721.invoke(core.clj:7691)
      at clojure.core.protocols$iter_reduce.invokeStatic(protocols.clj:49)
      at clojure.core.protocols$fn__9130.invokeStatic(protocols.clj:75)
      at clojure.core.protocols$fn__9130.invoke(protocols.clj:75)
      at clojure.core.protocols$fn__9072$G__9067__9085.invoke(protocols.clj:13)
      at clojure.core$reduce.invokeStatic(core.clj:6704)
      at clojure.core$load_data_reader_file.invokeStatic(core.clj:7686)
      at clojure.core$load_data_reader_file.invoke(core.clj:7677)
      at clojure.core.protocols$fn__9143.invokeStatic(protocols.clj:167)
      at clojure.core.protocols$fn__9143.invoke(protocols.clj:124)
      at clojure.core.protocols$fn__9098$G__9093__9107.invoke(protocols.clj:19)
      at clojure.core.protocols$seq_reduce.invokeStatic(protocols.clj:31)
      at clojure.core.protocols$fn__9126.invokeStatic(protocols.clj:75)
      at clojure.core.protocols$fn__9126.invoke(protocols.clj:75)
      at clojure.core.protocols$fn__9072$G__9067__9085.invoke(protocols.clj:13)
      at clojure.core$reduce.invokeStatic(core.clj:6704)
      at clojure.core$load_data_readers$fn__9728.invoke(core.clj:7708)
      at clojure.lang.AFn.applyToHelper(AFn.java:154)
      at clojure.lang.AFn.applyTo(AFn.java:144)
      at clojure.lang.Var.alterRoot(Var.java:303)
      at clojure.core$alter_var_root.invokeStatic(core.clj:5414)
      at clojure.core$alter_var_root.doInvoke(core.clj:5409)
      at clojure.lang.RestFn.invoke(RestFn.java:425)
      at clojure.core$load_data_readers.invokeStatic(core.clj:7707)
      at clojure.core$fn__9731.invokeStatic(core.clj:7712)
      at clojure.core$fn__9731.invoke(core.clj:7712)
      at clojure.core__init.load(Unknown Source)
      at clojure.core__init.<clinit>(Unknown Source)
      ... 10 more
    dustin@mbp foo (master *#)$