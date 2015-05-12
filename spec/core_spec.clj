(ns hello-clojure.core-spec
  (:require [speclj.core :refer :all]
            [hello-clojure.core :refer :all]))

(describe "hello-clojure"
  (it "1 + 1 = 2"
    (should= 2 (+ 1 1))))

(run-specs)
