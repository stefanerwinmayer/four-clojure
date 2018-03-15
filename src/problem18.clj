(ns problem18)

(def test-cases
  '[(= __ (filter #(> % 5) '(3 4 5 6 7)))])

(def __
  '(6 7)
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
