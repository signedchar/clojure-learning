(ns mult-3-5.core-test
  (:require [clojure.test :refer :all]
            [mult-3-5.core :refer :all]))

(deftest a-test
  (testing "Summatory divisible numbers by 3 or 5 from 0 to 9."
    (is (= 23 (mult-3-5 10)))))
