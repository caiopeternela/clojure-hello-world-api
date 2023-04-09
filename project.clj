(defproject hello-world-api "0.1.0-SNAPSHOT"
  :description "Clojure Hello World API"
  :url "https://github.com/caiopeternela/clojure-hello-world-api"
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [ring/ring-core "1.10.0"]
                 [ring/ring-jetty-adapter "1.10.0"]]
  :main ^:skip-aot hello-world-api.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :uberjar-name "hello-world-api.jar")