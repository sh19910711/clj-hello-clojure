(ns hello-clojure.core-test
  (:require [clojure.test :refer :all]
            [hello-clojure.core :refer :all]))

(deftest a-test
  (testing "I don't fail."
    (is (= 1 1))))
