(ns mult-3-5.core)

(defn nw-divisible [number]
  "If a number is divisible by 3 or 5 return the number, else return zero."
  (if (or (= 0 (mod number 3)) (= 0 (mod number 5)))
    number
    0))

(defn mult-3-5 [limit-number]
  "Return the sum of all elements from zero to `limit-number' divisible by 3 or 5."
  (reduce + (map nw-divisible (range limit-number))))
