(ns algorithms.gcd)

(defn gcd [p q]
  (if (zero? q)
    p
    (recur q (rem p q))))

(gcd 5 15)
(gcd 4000 123123)