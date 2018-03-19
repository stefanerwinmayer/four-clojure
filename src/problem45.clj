(ns problem45)

(def test-cases
  '[(= __ (take 5 (iterate #(+ 3 %) 1)))])

(def __
  '(1 4 7 10 13)
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
