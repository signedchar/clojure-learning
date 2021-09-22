(ns even-fibonnaci.core-test
  (:require [clojure.test :refer :all]
            [even-fibonnaci.core :refer :all]))

(deftest a-test
  (testing "Sum even numbers of fibonacci."
    (is (= 44 (fib-even 10)))))
