(ns problem5)

(def test-cases
  '[(= __ (conj '(2 3 4) 1))
    (= __ (conj '(3 4) 2 1))])

(def __
  (list 1 2 3 4)
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
