(ns problem68)

(def test-cases
  '[(= __
       (loop [x 5
              result []]
         (if (> x 0)
           (recur (dec x) (conj result (+ 2 x)))
           result)))])

(def __
  [7 6 5 4 3]
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
