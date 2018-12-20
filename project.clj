(defproject reaper "0.1.1-SNAPSHOT"
  :description "A project implementing automated summarization
                as a submodular maximization problem."
  :url "https://github.com/codyrioux/reaper"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/core.async "0.4.490"]
                 [org.clojure/core.memoize "0.7.1"]
                 [org.clojure/math.combinatorics "0.1.4"]                 
                 [cc.mallet/mallet "2.0.8"]
                 [clj-wordnet "0.1.0"]
                 [clojure-opennlp "0.5.0"]                 
                 [com.taoensso/timbre "4.10.0"]                 
                 [criterium "0.4.4"]
                 [hiccup "1.0.5"]
                 [incanter/incanter-core "1.9.3"]                               
                 [kmeans-clj "0.1.0-SNAPSHOT"]                                 
                 [prismatic/plumbing "0.5.5"]]
  :main reaper.experiments.sample 
  :jvm-opts ["-Xmx2g" "-Xms2g" "-server"])
