(ns problem12)

(def test-cases
  '[(= __ (first '(3 2 1)))
    (= __ (second [2 3 4]))
    (= __ (last (list 1 2 3)))])

(def __
  3
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
