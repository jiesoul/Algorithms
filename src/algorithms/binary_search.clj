(ns algorithms.binary-search)

(defn rank
  [n xs]
  (let [mid (/ (dec (count xs)) 2)
        front (take mid xs)
        end (drop mid xs)
        current (first end)
        end (rest end)]
    (cond
      (nil? current) nil
      (> n current) (recur n end)
      (< n current) (recur n front)
      :else n)))

(rank 5 (range 26))
