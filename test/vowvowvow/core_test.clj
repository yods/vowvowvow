(ns vowvowvow.core-test
  (:require [clojure.test :refer :all]
            [vowvowvow.core :refer :all]))

(deftest features-test
  (testing "give it a map and should return a the correct string"
    (is (= (features {:a 1 :b 2 :c 3}) ":a:1 b:2 c:3"))))
