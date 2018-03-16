(ns problem72)

(def test-cases
  '[(= (__ (map inc (take 3 (drop 2 [2 5 4 1 3 6]))))
       (->> [2 5 4 1 3 6]
            (drop 2)
            (take 3)
            (map inc)
            (__))
       11)])

(def __
  (partial reduce +)
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
