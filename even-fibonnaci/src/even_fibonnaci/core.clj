(ns even-fibonnaci.core)

(defn fib [num]
  "Return the Fibonacci of a number."
  (cond
    (= num 0) 1
    (= num 1) 1
    :else (+ (fib (- num 1)) (fib (- num 2)))))

(defn even? [num]
  "If a number is even return the number else return 0."
  (if (= 0 (mod num 2))
    num
    0))

(defn fib-even [number]
  "Return the sum of the even numbers of the Fibonacci list."
  (reduce + (map even? (map fib (range number)))))
