(ns problem71)

(def test-cases
  '[(= (__ (sort (rest (reverse [2 5 4 1 3 6]))))
       (-> [2 5 4 1 3 6]
           (reverse)
           (rest)
           (sort)
           (__))
       5)])

(def __
  (partial last)
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
