(ns problem17)

(def test-cases
  '[(= __ (map #(+ % 5) '(1 2 3)))])

(def __
  '(6 7 8)
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
